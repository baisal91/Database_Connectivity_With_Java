package com.example.bussiness.data;

import java.util.ArrayList;
import java.util.Collection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.mongodb.ErrorCategory;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.MongoWriteException;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import org.bson.Document;

public class StudentDaoMongoDB {
	public static final String uname = "admin";
	public static final String password = "admin";

	private MongoClient mongo;
	private MongoDatabase data;
	private MongoCollection coll;

	public static final String driver = "mongodb://";
	public static final String dburl = "@testcluster-shard-00-00-fghyg.mongodb.net:27017,testcluster-shard-00-01-fghyg.mongodb.net:27017,testcluster-shard-00-02-fghyg.mongodb.net:27017/test?ssl=true&replicaSet=TestCluster-shard-0&authSource=admin&retryWrites=true&w=majority";
	public static final String dbname = "Students";

	public StudentDaoMongoDB() {

		try {
			MongoClient mongo = new MongoClient(new MongoClientURI(driver + uname + ":" + password + dburl));
			data = mongo.getDatabase("school");
			coll = data.getCollection("students");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}

	public ArrayList<Student> fetchStudentData() {
	
		ArrayList<Student> list = new ArrayList<Student>();
		MongoCursor<Document> cursor = coll.find().iterator();
		Document doc;
    
		try {
			while (cursor.hasNext()) {
				doc = cursor.next();
				list.add(new Student(doc.getInteger("rollno"),	//rollNo
								doc.getString("name"),		//name
								doc.getString("gender"),	//gender
								doc.getInteger("math"),		//math
								doc.getInteger("physics"),	//physics
								doc.getInteger("english"))); //english
			}
			
			} finally {
				cursor.close();
			}
    
			return list;
		}
}