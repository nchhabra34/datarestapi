package test;

import java.util.List;

public class SaveData {

	
	

		private String JobName;
		String CronTime;
		String builton;
		String timestamp;
		String duration;
		String estimatedDuration;
		String result;
		String Url;
		int lastbuildNumber;
		String name;
		String buildable;
		String healthreport;
		String  TimeDescription;
		String Server;
		String JobStatus;
		List<String> getCrondescription;
		public String getJobStatus() {
			return JobStatus;
		}
		public void setJobStatus(String jobStatus) {
			JobStatus = jobStatus;
		}
		public String getTimeDescription() {
			return TimeDescription;
		}
		public void setTimeDescription(String timeDescription) {
			TimeDescription = timeDescription;
		}
		
		public List<String> getGetCrondescription() {
			return getCrondescription;
		}
		public void setGetCrondescription(List<String> getCrondescription) {
			this.getCrondescription = getCrondescription;
		}
		public String getServer() {
			return Server;
		}
		public void setServer(String server) {
			Server = server;
		}
		public String getJobName() {
			return JobName;
		}
		public void setJobName(String jobName) {
			JobName = jobName;
		}
		public String getCronTime() {
			return CronTime;
		}
		public void setCronTime(String cronTime) {
			CronTime = cronTime;
		}
		public String getBuilton() {
			return builton;
		}
		public void setBuilton(String builton) {
			this.builton = builton;
		}
		public String getTimestamp() {
			return timestamp;
		}
		public void setTimestamp(String timestamp) {
			this.timestamp = timestamp;
		}
		public String getDuration() {
			return duration;
		}
		public void setDuration(String duration) {
			this.duration = duration;
		}
		public String getEstimatedDuration() {
			return estimatedDuration;
		}
		public void setEstimatedDuration(String estimatedDuration) {
			this.estimatedDuration = estimatedDuration;
		}
		public String getResult() {
			return result;
		}
		public void setResult(String result) {
			this.result = result;
		}
		public String getUrl() {
			return Url;
		}
		public void setUrl(String url) {
			Url = url;
		}
		public int getLastbuildNumber() {
			return lastbuildNumber;
		}
		public void setLastbuildNumber(int lastbuildNumber) {
			this.lastbuildNumber = lastbuildNumber;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getBuildable() {
			return buildable;
		}
		public void setBuildable(String buildable) {
			this.buildable = buildable;
		}
		public String getHealthreport() {
			return healthreport;
		}
		public void setHealthreport(String healthreport) {
			this.healthreport = healthreport;
		}
		
		
		
	}


