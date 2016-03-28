/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */

#import <Foundation/Foundation.h>

#import "TProtocol.h"
#import "TApplicationException.h"
#import "TProtocolException.h"
#import "TProtocolUtil.h"
#import "TProcessor.h"
#import "TObjective-C.h"
#import "TBase.h"
#import "TAsyncTransport.h"
#import "TProtocolFactory.h"
#import "TBaseClient.h"


typedef NSString * Text;

typedef NSData * Bytes;

typedef NSString * Date;

typedef int64_t Timestamp;

@interface TGeoLocation : NSObject <TBase, NSCoding> {
  double __latitude;
  double __longitude;
  Timestamp __updateTime;

  BOOL __latitude_isset;
  BOOL __longitude_isset;
  BOOL __updateTime_isset;
}

#if TARGET_OS_IPHONE || (MAC_OS_X_VERSION_MAX_ALLOWED >= MAC_OS_X_VERSION_10_5)
@property (nonatomic, getter=latitude, setter=setLatitude:) double latitude;
@property (nonatomic, getter=longitude, setter=setLongitude:) double longitude;
@property (nonatomic, getter=updateTime, setter=setUpdateTime:) Timestamp updateTime;
#endif

- (id) init;
- (id) initWithLatitude: (double) latitude longitude: (double) longitude updateTime: (Timestamp) updateTime;

- (void) read: (id <TProtocol>) inProtocol;
- (void) write: (id <TProtocol>) outProtocol;

- (void) validate;

#if !__has_feature(objc_arc)
- (double) latitude;
- (void) setLatitude: (double) latitude;
#endif
- (BOOL) latitudeIsSet;

#if !__has_feature(objc_arc)
- (double) longitude;
- (void) setLongitude: (double) longitude;
#endif
- (BOOL) longitudeIsSet;

#if !__has_feature(objc_arc)
- (Timestamp) updateTime;
- (void) setUpdateTime: (Timestamp) updateTime;
#endif
- (BOOL) updateTimeIsSet;

@end

@interface TUser : NSObject <TBase, NSCoding> {
  Text __sessionKey;
  Text __organizationName;
  Text __email;
  Text __fName;
  Text __lName;
  Text __sex;
  Text __InboxFolder;
  Text __userId;
  int32_t __groupId;
  int32_t __tzOffset;
  int32_t __maxUsersPerShare;
  int64_t __maxFileSize;
  TGeoLocation * __location;
  int32_t __error;

  BOOL __sessionKey_isset;
  BOOL __organizationName_isset;
  BOOL __email_isset;
  BOOL __fName_isset;
  BOOL __lName_isset;
  BOOL __sex_isset;
  BOOL __InboxFolder_isset;
  BOOL __userId_isset;
  BOOL __groupId_isset;
  BOOL __tzOffset_isset;
  BOOL __maxUsersPerShare_isset;
  BOOL __maxFileSize_isset;
  BOOL __location_isset;
  BOOL __error_isset;
}

#if TARGET_OS_IPHONE || (MAC_OS_X_VERSION_MAX_ALLOWED >= MAC_OS_X_VERSION_10_5)
@property (nonatomic, retain, getter=sessionKey, setter=setSessionKey:) Text sessionKey;
@property (nonatomic, retain, getter=organizationName, setter=setOrganizationName:) Text organizationName;
@property (nonatomic, retain, getter=email, setter=setEmail:) Text email;
@property (nonatomic, retain, getter=fName, setter=setFName:) Text fName;
@property (nonatomic, retain, getter=lName, setter=setLName:) Text lName;
@property (nonatomic, retain, getter=sex, setter=setSex:) Text sex;
@property (nonatomic, retain, getter=inboxFolder, setter=setInboxFolder:) Text InboxFolder;
@property (nonatomic, retain, getter=userId, setter=setUserId:) Text userId;
@property (nonatomic, getter=groupId, setter=setGroupId:) int32_t groupId;
@property (nonatomic, getter=tzOffset, setter=setTzOffset:) int32_t tzOffset;
@property (nonatomic, getter=maxUsersPerShare, setter=setMaxUsersPerShare:) int32_t maxUsersPerShare;
@property (nonatomic, getter=maxFileSize, setter=setMaxFileSize:) int64_t maxFileSize;
@property (nonatomic, retain, getter=location, setter=setLocation:) TGeoLocation * location;
@property (nonatomic, getter=error, setter=setError:) int32_t error;
#endif

- (id) init;
- (id) initWithSessionKey: (Text) sessionKey organizationName: (Text) organizationName email: (Text) email fName: (Text) fName lName: (Text) lName sex: (Text) sex InboxFolder: (Text) InboxFolder userId: (Text) userId groupId: (int32_t) groupId tzOffset: (int32_t) tzOffset maxUsersPerShare: (int32_t) maxUsersPerShare maxFileSize: (int64_t) maxFileSize location: (TGeoLocation *) location error: (int32_t) error;

- (void) read: (id <TProtocol>) inProtocol;
- (void) write: (id <TProtocol>) outProtocol;

- (void) validate;

#if !__has_feature(objc_arc)
- (Text) sessionKey;
- (void) setSessionKey: (Text) sessionKey;
#endif
- (BOOL) sessionKeyIsSet;

#if !__has_feature(objc_arc)
- (Text) organizationName;
- (void) setOrganizationName: (Text) organizationName;
#endif
- (BOOL) organizationNameIsSet;

#if !__has_feature(objc_arc)
- (Text) email;
- (void) setEmail: (Text) email;
#endif
- (BOOL) emailIsSet;

#if !__has_feature(objc_arc)
- (Text) fName;
- (void) setFName: (Text) fName;
#endif
- (BOOL) fNameIsSet;

#if !__has_feature(objc_arc)
- (Text) lName;
- (void) setLName: (Text) lName;
#endif
- (BOOL) lNameIsSet;

#if !__has_feature(objc_arc)
- (Text) sex;
- (void) setSex: (Text) sex;
#endif
- (BOOL) sexIsSet;

#if !__has_feature(objc_arc)
- (Text) inboxFolder;
- (void) setInboxFolder: (Text) InboxFolder;
#endif
- (BOOL) InboxFolderIsSet;

#if !__has_feature(objc_arc)
- (Text) userId;
- (void) setUserId: (Text) userId;
#endif
- (BOOL) userIdIsSet;

#if !__has_feature(objc_arc)
- (int32_t) groupId;
- (void) setGroupId: (int32_t) groupId;
#endif
- (BOOL) groupIdIsSet;

#if !__has_feature(objc_arc)
- (int32_t) tzOffset;
- (void) setTzOffset: (int32_t) tzOffset;
#endif
- (BOOL) tzOffsetIsSet;

#if !__has_feature(objc_arc)
- (int32_t) maxUsersPerShare;
- (void) setMaxUsersPerShare: (int32_t) maxUsersPerShare;
#endif
- (BOOL) maxUsersPerShareIsSet;

#if !__has_feature(objc_arc)
- (int64_t) maxFileSize;
- (void) setMaxFileSize: (int64_t) maxFileSize;
#endif
- (BOOL) maxFileSizeIsSet;

#if !__has_feature(objc_arc)
- (TGeoLocation *) location;
- (void) setLocation: (TGeoLocation *) location;
#endif
- (BOOL) locationIsSet;

#if !__has_feature(objc_arc)
- (int32_t) error;
- (void) setError: (int32_t) error;
#endif
- (BOOL) errorIsSet;

@end

@interface TTask : NSObject <TBase, NSCoding> {
  Text __id;
  Text __name;
  Text __desc;
  int32_t __priority;
  Text __owner;
  Text __assignee;
  Text __processDefinitionId;
  Text __processInstanceId;
  Text __executionId;
  Date __createTime;
  Date __dueDate;
  Text __taskDefinitionKey;
  BOOL __isSuspended;

  BOOL __id_isset;
  BOOL __name_isset;
  BOOL __desc_isset;
  BOOL __priority_isset;
  BOOL __owner_isset;
  BOOL __assignee_isset;
  BOOL __processDefinitionId_isset;
  BOOL __processInstanceId_isset;
  BOOL __executionId_isset;
  BOOL __createTime_isset;
  BOOL __dueDate_isset;
  BOOL __taskDefinitionKey_isset;
  BOOL __isSuspended_isset;
}

#if TARGET_OS_IPHONE || (MAC_OS_X_VERSION_MAX_ALLOWED >= MAC_OS_X_VERSION_10_5)
@property (nonatomic, retain, getter=id, setter=setId:) Text id;
@property (nonatomic, retain, getter=name, setter=setName:) Text name;
@property (nonatomic, retain, getter=desc, setter=setDesc:) Text desc;
@property (nonatomic, getter=priority, setter=setPriority:) int32_t priority;
@property (nonatomic, retain, getter=owner, setter=setOwner:) Text owner;
@property (nonatomic, retain, getter=assignee, setter=setAssignee:) Text assignee;
@property (nonatomic, retain, getter=processDefinitionId, setter=setProcessDefinitionId:) Text processDefinitionId;
@property (nonatomic, retain, getter=processInstanceId, setter=setProcessInstanceId:) Text processInstanceId;
@property (nonatomic, retain, getter=executionId, setter=setExecutionId:) Text executionId;
@property (nonatomic, retain, getter=createTime, setter=setCreateTime:) Date createTime;
@property (nonatomic, retain, getter=dueDate, setter=setDueDate:) Date dueDate;
@property (nonatomic, retain, getter=taskDefinitionKey, setter=setTaskDefinitionKey:) Text taskDefinitionKey;
@property (nonatomic, getter=isSuspended, setter=setIsSuspended:) BOOL isSuspended;
#endif

- (id) init;
- (id) initWithId: (Text) id name: (Text) name desc: (Text) desc priority: (int32_t) priority owner: (Text) owner assignee: (Text) assignee processDefinitionId: (Text) processDefinitionId processInstanceId: (Text) processInstanceId executionId: (Text) executionId createTime: (Date) createTime dueDate: (Date) dueDate taskDefinitionKey: (Text) taskDefinitionKey isSuspended: (BOOL) isSuspended;

- (void) read: (id <TProtocol>) inProtocol;
- (void) write: (id <TProtocol>) outProtocol;

- (void) validate;

#if !__has_feature(objc_arc)
- (Text) id;
- (void) setId: (Text) id;
#endif
- (BOOL) idIsSet;

#if !__has_feature(objc_arc)
- (Text) name;
- (void) setName: (Text) name;
#endif
- (BOOL) nameIsSet;

#if !__has_feature(objc_arc)
- (Text) desc;
- (void) setDesc: (Text) desc;
#endif
- (BOOL) descIsSet;

#if !__has_feature(objc_arc)
- (int32_t) priority;
- (void) setPriority: (int32_t) priority;
#endif
- (BOOL) priorityIsSet;

#if !__has_feature(objc_arc)
- (Text) owner;
- (void) setOwner: (Text) owner;
#endif
- (BOOL) ownerIsSet;

#if !__has_feature(objc_arc)
- (Text) assignee;
- (void) setAssignee: (Text) assignee;
#endif
- (BOOL) assigneeIsSet;

#if !__has_feature(objc_arc)
- (Text) processDefinitionId;
- (void) setProcessDefinitionId: (Text) processDefinitionId;
#endif
- (BOOL) processDefinitionIdIsSet;

#if !__has_feature(objc_arc)
- (Text) processInstanceId;
- (void) setProcessInstanceId: (Text) processInstanceId;
#endif
- (BOOL) processInstanceIdIsSet;

#if !__has_feature(objc_arc)
- (Text) executionId;
- (void) setExecutionId: (Text) executionId;
#endif
- (BOOL) executionIdIsSet;

#if !__has_feature(objc_arc)
- (Date) createTime;
- (void) setCreateTime: (Date) createTime;
#endif
- (BOOL) createTimeIsSet;

#if !__has_feature(objc_arc)
- (Date) dueDate;
- (void) setDueDate: (Date) dueDate;
#endif
- (BOOL) dueDateIsSet;

#if !__has_feature(objc_arc)
- (Text) taskDefinitionKey;
- (void) setTaskDefinitionKey: (Text) taskDefinitionKey;
#endif
- (BOOL) taskDefinitionKeyIsSet;

#if !__has_feature(objc_arc)
- (BOOL) isSuspended;
- (void) setIsSuspended: (BOOL) isSuspended;
#endif
- (BOOL) isSuspendedIsSet;

@end

@interface TAssignee : NSObject <TBase, NSCoding> {
  Text __id;
  Text __name;
  Text __email;
  Text __apiKey;

  BOOL __id_isset;
  BOOL __name_isset;
  BOOL __email_isset;
  BOOL __apiKey_isset;
}

#if TARGET_OS_IPHONE || (MAC_OS_X_VERSION_MAX_ALLOWED >= MAC_OS_X_VERSION_10_5)
@property (nonatomic, retain, getter=id, setter=setId:) Text id;
@property (nonatomic, retain, getter=name, setter=setName:) Text name;
@property (nonatomic, retain, getter=email, setter=setEmail:) Text email;
@property (nonatomic, retain, getter=apiKey, setter=setApiKey:) Text apiKey;
#endif

- (id) init;
- (id) initWithId: (Text) id name: (Text) name email: (Text) email apiKey: (Text) apiKey;

- (void) read: (id <TProtocol>) inProtocol;
- (void) write: (id <TProtocol>) outProtocol;

- (void) validate;

#if !__has_feature(objc_arc)
- (Text) id;
- (void) setId: (Text) id;
#endif
- (BOOL) idIsSet;

#if !__has_feature(objc_arc)
- (Text) name;
- (void) setName: (Text) name;
#endif
- (BOOL) nameIsSet;

#if !__has_feature(objc_arc)
- (Text) email;
- (void) setEmail: (Text) email;
#endif
- (BOOL) emailIsSet;

#if !__has_feature(objc_arc)
- (Text) apiKey;
- (void) setApiKey: (Text) apiKey;
#endif
- (BOOL) apiKeyIsSet;

@end

@interface TProcess : NSObject <TBase, NSCoding> {
  Text __id;
  Text __label;
  Text __desc;
  Text __status;

  BOOL __id_isset;
  BOOL __label_isset;
  BOOL __desc_isset;
  BOOL __status_isset;
}

#if TARGET_OS_IPHONE || (MAC_OS_X_VERSION_MAX_ALLOWED >= MAC_OS_X_VERSION_10_5)
@property (nonatomic, retain, getter=id, setter=setId:) Text id;
@property (nonatomic, retain, getter=label, setter=setLabel:) Text label;
@property (nonatomic, retain, getter=desc, setter=setDesc:) Text desc;
@property (nonatomic, retain, getter=status, setter=setStatus:) Text status;
#endif

- (id) init;
- (id) initWithId: (Text) id label: (Text) label desc: (Text) desc status: (Text) status;

- (void) read: (id <TProtocol>) inProtocol;
- (void) write: (id <TProtocol>) outProtocol;

- (void) validate;

#if !__has_feature(objc_arc)
- (Text) id;
- (void) setId: (Text) id;
#endif
- (BOOL) idIsSet;

#if !__has_feature(objc_arc)
- (Text) label;
- (void) setLabel: (Text) label;
#endif
- (BOOL) labelIsSet;

#if !__has_feature(objc_arc)
- (Text) desc;
- (void) setDesc: (Text) desc;
#endif
- (BOOL) descIsSet;

#if !__has_feature(objc_arc)
- (Text) status;
- (void) setStatus: (Text) status;
#endif
- (BOOL) statusIsSet;

@end

@interface TTaskInput : NSObject <TBase, NSCoding> {
  NSMutableArray * __relateds;
  NSMutableArray * __options;
  NSMutableArray * __fields;
  NSMutableDictionary * __facts;
  Text __form;

  BOOL __relateds_isset;
  BOOL __options_isset;
  BOOL __fields_isset;
  BOOL __facts_isset;
  BOOL __form_isset;
}

#if TARGET_OS_IPHONE || (MAC_OS_X_VERSION_MAX_ALLOWED >= MAC_OS_X_VERSION_10_5)
@property (nonatomic, retain, getter=relateds, setter=setRelateds:) NSMutableArray * relateds;
@property (nonatomic, retain, getter=options, setter=setOptions:) NSMutableArray * options;
@property (nonatomic, retain, getter=fields, setter=setFields:) NSMutableArray * fields;
@property (nonatomic, retain, getter=facts, setter=setFacts:) NSMutableDictionary * facts;
@property (nonatomic, retain, getter=form, setter=setForm:) Text form;
#endif

- (id) init;
- (id) initWithRelateds: (NSMutableArray *) relateds options: (NSMutableArray *) options fields: (NSMutableArray *) fields facts: (NSMutableDictionary *) facts form: (Text) form;

- (void) read: (id <TProtocol>) inProtocol;
- (void) write: (id <TProtocol>) outProtocol;

- (void) validate;

#if !__has_feature(objc_arc)
- (NSMutableArray *) relateds;
- (void) setRelateds: (NSMutableArray *) relateds;
#endif
- (BOOL) relatedsIsSet;

#if !__has_feature(objc_arc)
- (NSMutableArray *) options;
- (void) setOptions: (NSMutableArray *) options;
#endif
- (BOOL) optionsIsSet;

#if !__has_feature(objc_arc)
- (NSMutableArray *) fields;
- (void) setFields: (NSMutableArray *) fields;
#endif
- (BOOL) fieldsIsSet;

#if !__has_feature(objc_arc)
- (NSMutableDictionary *) facts;
- (void) setFacts: (NSMutableDictionary *) facts;
#endif
- (BOOL) factsIsSet;

#if !__has_feature(objc_arc)
- (Text) form;
- (void) setForm: (Text) form;
#endif
- (BOOL) formIsSet;

@end

@interface TTaskHistory : NSObject <TBase, NSCoding> {
  NSMutableArray * __entries;

  BOOL __entries_isset;
}

#if TARGET_OS_IPHONE || (MAC_OS_X_VERSION_MAX_ALLOWED >= MAC_OS_X_VERSION_10_5)
@property (nonatomic, retain, getter=entries, setter=setEntries:) NSMutableArray * entries;
#endif

- (id) init;
- (id) initWithEntries: (NSMutableArray *) entries;

- (void) read: (id <TProtocol>) inProtocol;
- (void) write: (id <TProtocol>) outProtocol;

- (void) validate;

#if !__has_feature(objc_arc)
- (NSMutableArray *) entries;
- (void) setEntries: (NSMutableArray *) entries;
#endif
- (BOOL) entriesIsSet;

@end

@interface TTaskDetail : NSObject <TBase, NSCoding> {
  TTask * __task;
  TAssignee * __assignee;
  TProcess * __process;
  TTaskInput * __input;
  TTaskHistory * __history;

  BOOL __task_isset;
  BOOL __assignee_isset;
  BOOL __process_isset;
  BOOL __input_isset;
  BOOL __history_isset;
}

#if TARGET_OS_IPHONE || (MAC_OS_X_VERSION_MAX_ALLOWED >= MAC_OS_X_VERSION_10_5)
@property (nonatomic, retain, getter=task, setter=setTask:) TTask * task;
@property (nonatomic, retain, getter=assignee, setter=setAssignee:) TAssignee * assignee;
@property (nonatomic, retain, getter=process, setter=setProcess:) TProcess * process;
@property (nonatomic, retain, getter=input, setter=setInput:) TTaskInput * input;
@property (nonatomic, retain, getter=history, setter=setHistory:) TTaskHistory * history;
#endif

- (id) init;
- (id) initWithTask: (TTask *) task assignee: (TAssignee *) assignee process: (TProcess *) process input: (TTaskInput *) input history: (TTaskHistory *) history;

- (void) read: (id <TProtocol>) inProtocol;
- (void) write: (id <TProtocol>) outProtocol;

- (void) validate;

#if !__has_feature(objc_arc)
- (TTask *) task;
- (void) setTask: (TTask *) task;
#endif
- (BOOL) taskIsSet;

#if !__has_feature(objc_arc)
- (TAssignee *) assignee;
- (void) setAssignee: (TAssignee *) assignee;
#endif
- (BOOL) assigneeIsSet;

#if !__has_feature(objc_arc)
- (TProcess *) process;
- (void) setProcess: (TProcess *) process;
#endif
- (BOOL) processIsSet;

#if !__has_feature(objc_arc)
- (TTaskInput *) input;
- (void) setInput: (TTaskInput *) input;
#endif
- (BOOL) inputIsSet;

#if !__has_feature(objc_arc)
- (TTaskHistory *) history;
- (void) setHistory: (TTaskHistory *) history;
#endif
- (BOOL) historyIsSet;

@end

@interface TProcessType : NSObject <TBase, NSCoding> {
  Text __id;
  Text __key;
  Text __name;
  Text __category;
  Text __desc;
  Text __resourceName;
  Text __deploymentId;
  int32_t __version;
  BOOL __hasStartForm;
  BOOL __isSuspended;
  Text __tenantId;
  Text __bpmnXML;

  BOOL __id_isset;
  BOOL __key_isset;
  BOOL __name_isset;
  BOOL __category_isset;
  BOOL __desc_isset;
  BOOL __resourceName_isset;
  BOOL __deploymentId_isset;
  BOOL __version_isset;
  BOOL __hasStartForm_isset;
  BOOL __isSuspended_isset;
  BOOL __tenantId_isset;
  BOOL __bpmnXML_isset;
}

#if TARGET_OS_IPHONE || (MAC_OS_X_VERSION_MAX_ALLOWED >= MAC_OS_X_VERSION_10_5)
@property (nonatomic, retain, getter=id, setter=setId:) Text id;
@property (nonatomic, retain, getter=key, setter=setKey:) Text key;
@property (nonatomic, retain, getter=name, setter=setName:) Text name;
@property (nonatomic, retain, getter=category, setter=setCategory:) Text category;
@property (nonatomic, retain, getter=desc, setter=setDesc:) Text desc;
@property (nonatomic, retain, getter=resourceName, setter=setResourceName:) Text resourceName;
@property (nonatomic, retain, getter=deploymentId, setter=setDeploymentId:) Text deploymentId;
@property (nonatomic, getter=version, setter=setVersion:) int32_t version;
@property (nonatomic, getter=hasStartForm, setter=setHasStartForm:) BOOL hasStartForm;
@property (nonatomic, getter=isSuspended, setter=setIsSuspended:) BOOL isSuspended;
@property (nonatomic, retain, getter=tenantId, setter=setTenantId:) Text tenantId;
@property (nonatomic, retain, getter=bpmnXML, setter=setBpmnXML:) Text bpmnXML;
#endif

- (id) init;
- (id) initWithId: (Text) id key: (Text) key name: (Text) name category: (Text) category desc: (Text) desc resourceName: (Text) resourceName deploymentId: (Text) deploymentId version: (int32_t) version hasStartForm: (BOOL) hasStartForm isSuspended: (BOOL) isSuspended tenantId: (Text) tenantId bpmnXML: (Text) bpmnXML;

- (void) read: (id <TProtocol>) inProtocol;
- (void) write: (id <TProtocol>) outProtocol;

- (void) validate;

#if !__has_feature(objc_arc)
- (Text) id;
- (void) setId: (Text) id;
#endif
- (BOOL) idIsSet;

#if !__has_feature(objc_arc)
- (Text) key;
- (void) setKey: (Text) key;
#endif
- (BOOL) keyIsSet;

#if !__has_feature(objc_arc)
- (Text) name;
- (void) setName: (Text) name;
#endif
- (BOOL) nameIsSet;

#if !__has_feature(objc_arc)
- (Text) category;
- (void) setCategory: (Text) category;
#endif
- (BOOL) categoryIsSet;

#if !__has_feature(objc_arc)
- (Text) desc;
- (void) setDesc: (Text) desc;
#endif
- (BOOL) descIsSet;

#if !__has_feature(objc_arc)
- (Text) resourceName;
- (void) setResourceName: (Text) resourceName;
#endif
- (BOOL) resourceNameIsSet;

#if !__has_feature(objc_arc)
- (Text) deploymentId;
- (void) setDeploymentId: (Text) deploymentId;
#endif
- (BOOL) deploymentIdIsSet;

#if !__has_feature(objc_arc)
- (int32_t) version;
- (void) setVersion: (int32_t) version;
#endif
- (BOOL) versionIsSet;

#if !__has_feature(objc_arc)
- (BOOL) hasStartForm;
- (void) setHasStartForm: (BOOL) hasStartForm;
#endif
- (BOOL) hasStartFormIsSet;

#if !__has_feature(objc_arc)
- (BOOL) isSuspended;
- (void) setIsSuspended: (BOOL) isSuspended;
#endif
- (BOOL) isSuspendedIsSet;

#if !__has_feature(objc_arc)
- (Text) tenantId;
- (void) setTenantId: (Text) tenantId;
#endif
- (BOOL) tenantIdIsSet;

#if !__has_feature(objc_arc)
- (Text) bpmnXML;
- (void) setBpmnXML: (Text) bpmnXML;
#endif
- (BOOL) bpmnXMLIsSet;

@end

@interface TTProcessType : NSObject <TBase, NSCoding> {
  Text __id;
  Text __name;

  BOOL __id_isset;
  BOOL __name_isset;
}

#if TARGET_OS_IPHONE || (MAC_OS_X_VERSION_MAX_ALLOWED >= MAC_OS_X_VERSION_10_5)
@property (nonatomic, retain, getter=id, setter=setId:) Text id;
@property (nonatomic, retain, getter=name, setter=setName:) Text name;
#endif

- (id) init;
- (id) initWithId: (Text) id name: (Text) name;

- (void) read: (id <TProtocol>) inProtocol;
- (void) write: (id <TProtocol>) outProtocol;

- (void) validate;

#if !__has_feature(objc_arc)
- (Text) id;
- (void) setId: (Text) id;
#endif
- (BOOL) idIsSet;

#if !__has_feature(objc_arc)
- (Text) name;
- (void) setName: (Text) name;
#endif
- (BOOL) nameIsSet;

@end

@interface TApplication : NSObject <TBase, NSCoding> {
  Text __id;
  Text __key;
  Text __name;
  Text __icon;

  BOOL __id_isset;
  BOOL __key_isset;
  BOOL __name_isset;
  BOOL __icon_isset;
}

#if TARGET_OS_IPHONE || (MAC_OS_X_VERSION_MAX_ALLOWED >= MAC_OS_X_VERSION_10_5)
@property (nonatomic, retain, getter=id, setter=setId:) Text id;
@property (nonatomic, retain, getter=key, setter=setKey:) Text key;
@property (nonatomic, retain, getter=name, setter=setName:) Text name;
@property (nonatomic, retain, getter=icon, setter=setIcon:) Text icon;
#endif

- (id) init;
- (id) initWithId: (Text) id key: (Text) key name: (Text) name icon: (Text) icon;

- (void) read: (id <TProtocol>) inProtocol;
- (void) write: (id <TProtocol>) outProtocol;

- (void) validate;

#if !__has_feature(objc_arc)
- (Text) id;
- (void) setId: (Text) id;
#endif
- (BOOL) idIsSet;

#if !__has_feature(objc_arc)
- (Text) key;
- (void) setKey: (Text) key;
#endif
- (BOOL) keyIsSet;

#if !__has_feature(objc_arc)
- (Text) name;
- (void) setName: (Text) name;
#endif
- (BOOL) nameIsSet;

#if !__has_feature(objc_arc)
- (Text) icon;
- (void) setIcon: (Text) icon;
#endif
- (BOOL) iconIsSet;

@end

@interface TProvider : NSObject <TBase, NSCoding> {
  Text __taskname;
  Text __taskkey;
  Text __providerid;

  BOOL __taskname_isset;
  BOOL __taskkey_isset;
  BOOL __providerid_isset;
}

#if TARGET_OS_IPHONE || (MAC_OS_X_VERSION_MAX_ALLOWED >= MAC_OS_X_VERSION_10_5)
@property (nonatomic, retain, getter=taskname, setter=setTaskname:) Text taskname;
@property (nonatomic, retain, getter=taskkey, setter=setTaskkey:) Text taskkey;
@property (nonatomic, retain, getter=providerid, setter=setProviderid:) Text providerid;
#endif

- (id) init;
- (id) initWithTaskname: (Text) taskname taskkey: (Text) taskkey providerid: (Text) providerid;

- (void) read: (id <TProtocol>) inProtocol;
- (void) write: (id <TProtocol>) outProtocol;

- (void) validate;

#if !__has_feature(objc_arc)
- (Text) taskname;
- (void) setTaskname: (Text) taskname;
#endif
- (BOOL) tasknameIsSet;

#if !__has_feature(objc_arc)
- (Text) taskkey;
- (void) setTaskkey: (Text) taskkey;
#endif
- (BOOL) taskkeyIsSet;

#if !__has_feature(objc_arc)
- (Text) providerid;
- (void) setProviderid: (Text) providerid;
#endif
- (BOOL) provideridIsSet;

@end

@interface TForm : NSObject <TBase, NSCoding> {
  Text __taskname;
  Text __taskkey;
  Text __formid;
  Text __formname;

  BOOL __taskname_isset;
  BOOL __taskkey_isset;
  BOOL __formid_isset;
  BOOL __formname_isset;
}

#if TARGET_OS_IPHONE || (MAC_OS_X_VERSION_MAX_ALLOWED >= MAC_OS_X_VERSION_10_5)
@property (nonatomic, retain, getter=taskname, setter=setTaskname:) Text taskname;
@property (nonatomic, retain, getter=taskkey, setter=setTaskkey:) Text taskkey;
@property (nonatomic, retain, getter=formid, setter=setFormid:) Text formid;
@property (nonatomic, retain, getter=formname, setter=setFormname:) Text formname;
#endif

- (id) init;
- (id) initWithTaskname: (Text) taskname taskkey: (Text) taskkey formid: (Text) formid formname: (Text) formname;

- (void) read: (id <TProtocol>) inProtocol;
- (void) write: (id <TProtocol>) outProtocol;

- (void) validate;

#if !__has_feature(objc_arc)
- (Text) taskname;
- (void) setTaskname: (Text) taskname;
#endif
- (BOOL) tasknameIsSet;

#if !__has_feature(objc_arc)
- (Text) taskkey;
- (void) setTaskkey: (Text) taskkey;
#endif
- (BOOL) taskkeyIsSet;

#if !__has_feature(objc_arc)
- (Text) formid;
- (void) setFormid: (Text) formid;
#endif
- (BOOL) formidIsSet;

#if !__has_feature(objc_arc)
- (Text) formname;
- (void) setFormname: (Text) formname;
#endif
- (BOOL) formnameIsSet;

@end

@interface TOrigin : NSObject <TBase, NSCoding> {
  Text __id;
  Text __name;
  Text __desc;
  Text __creatorId;
  Timestamp __createDate;
  int64_t __checksum;

  BOOL __id_isset;
  BOOL __name_isset;
  BOOL __desc_isset;
  BOOL __creatorId_isset;
  BOOL __createDate_isset;
  BOOL __checksum_isset;
}

#if TARGET_OS_IPHONE || (MAC_OS_X_VERSION_MAX_ALLOWED >= MAC_OS_X_VERSION_10_5)
@property (nonatomic, retain, getter=id, setter=setId:) Text id;
@property (nonatomic, retain, getter=name, setter=setName:) Text name;
@property (nonatomic, retain, getter=desc, setter=setDesc:) Text desc;
@property (nonatomic, retain, getter=creatorId, setter=setCreatorId:) Text creatorId;
@property (nonatomic, getter=createDate, setter=setCreateDate:) Timestamp createDate;
@property (nonatomic, getter=checksum, setter=setChecksum:) int64_t checksum;
#endif

- (id) init;
- (id) initWithId: (Text) id name: (Text) name desc: (Text) desc creatorId: (Text) creatorId createDate: (Timestamp) createDate checksum: (int64_t) checksum;

- (void) read: (id <TProtocol>) inProtocol;
- (void) write: (id <TProtocol>) outProtocol;

- (void) validate;

#if !__has_feature(objc_arc)
- (Text) id;
- (void) setId: (Text) id;
#endif
- (BOOL) idIsSet;

#if !__has_feature(objc_arc)
- (Text) name;
- (void) setName: (Text) name;
#endif
- (BOOL) nameIsSet;

#if !__has_feature(objc_arc)
- (Text) desc;
- (void) setDesc: (Text) desc;
#endif
- (BOOL) descIsSet;

#if !__has_feature(objc_arc)
- (Text) creatorId;
- (void) setCreatorId: (Text) creatorId;
#endif
- (BOOL) creatorIdIsSet;

#if !__has_feature(objc_arc)
- (Timestamp) createDate;
- (void) setCreateDate: (Timestamp) createDate;
#endif
- (BOOL) createDateIsSet;

#if !__has_feature(objc_arc)
- (int64_t) checksum;
- (void) setChecksum: (int64_t) checksum;
#endif
- (BOOL) checksumIsSet;

@end

@interface TData : NSObject <TBase, NSCoding> {
  Text __style;
  NSMutableArray * __forms;
  TTProcessType * __processtype;
  Text __icon;
  Text __diagram_xml;
  TProvider * __providers;
  Text __facts;

  BOOL __style_isset;
  BOOL __forms_isset;
  BOOL __processtype_isset;
  BOOL __icon_isset;
  BOOL __diagram_xml_isset;
  BOOL __providers_isset;
  BOOL __facts_isset;
}

#if TARGET_OS_IPHONE || (MAC_OS_X_VERSION_MAX_ALLOWED >= MAC_OS_X_VERSION_10_5)
@property (nonatomic, retain, getter=style, setter=setStyle:) Text style;
@property (nonatomic, retain, getter=forms, setter=setForms:) NSMutableArray * forms;
@property (nonatomic, retain, getter=processtype, setter=setProcesstype:) TTProcessType * processtype;
@property (nonatomic, retain, getter=icon, setter=setIcon:) Text icon;
@property (nonatomic, retain, getter=diagram_xml, setter=setDiagram_xml:) Text diagram_xml;
@property (nonatomic, retain, getter=providers, setter=setProviders:) TProvider * providers;
@property (nonatomic, retain, getter=facts, setter=setFacts:) Text facts;
#endif

- (id) init;
- (id) initWithStyle: (Text) style forms: (NSMutableArray *) forms processtype: (TTProcessType *) processtype icon: (Text) icon diagram_xml: (Text) diagram_xml providers: (TProvider *) providers facts: (Text) facts;

- (void) read: (id <TProtocol>) inProtocol;
- (void) write: (id <TProtocol>) outProtocol;

- (void) validate;

#if !__has_feature(objc_arc)
- (Text) style;
- (void) setStyle: (Text) style;
#endif
- (BOOL) styleIsSet;

#if !__has_feature(objc_arc)
- (NSMutableArray *) forms;
- (void) setForms: (NSMutableArray *) forms;
#endif
- (BOOL) formsIsSet;

#if !__has_feature(objc_arc)
- (TTProcessType *) processtype;
- (void) setProcesstype: (TTProcessType *) processtype;
#endif
- (BOOL) processtypeIsSet;

#if !__has_feature(objc_arc)
- (Text) icon;
- (void) setIcon: (Text) icon;
#endif
- (BOOL) iconIsSet;

#if !__has_feature(objc_arc)
- (Text) diagram_xml;
- (void) setDiagram_xml: (Text) diagram_xml;
#endif
- (BOOL) diagram_xmlIsSet;

#if !__has_feature(objc_arc)
- (TProvider *) providers;
- (void) setProviders: (TProvider *) providers;
#endif
- (BOOL) providersIsSet;

#if !__has_feature(objc_arc)
- (Text) facts;
- (void) setFacts: (Text) facts;
#endif
- (BOOL) factsIsSet;

@end

@interface TTemplate : NSObject <TBase, NSCoding> {
  Text __id;
  Text __recType;
  Text __name;
  Text __checksum;
  Text __desc;
  Text __icon;
  BOOL __fav;

  BOOL __id_isset;
  BOOL __recType_isset;
  BOOL __name_isset;
  BOOL __checksum_isset;
  BOOL __desc_isset;
  BOOL __icon_isset;
  BOOL __fav_isset;
}

#if TARGET_OS_IPHONE || (MAC_OS_X_VERSION_MAX_ALLOWED >= MAC_OS_X_VERSION_10_5)
@property (nonatomic, retain, getter=id, setter=setId:) Text id;
@property (nonatomic, retain, getter=recType, setter=setRecType:) Text recType;
@property (nonatomic, retain, getter=name, setter=setName:) Text name;
@property (nonatomic, retain, getter=checksum, setter=setChecksum:) Text checksum;
@property (nonatomic, retain, getter=desc, setter=setDesc:) Text desc;
@property (nonatomic, retain, getter=icon, setter=setIcon:) Text icon;
@property (nonatomic, getter=fav, setter=setFav:) BOOL fav;
#endif

- (id) init;
- (id) initWithId: (Text) id recType: (Text) recType name: (Text) name checksum: (Text) checksum desc: (Text) desc icon: (Text) icon fav: (BOOL) fav;

- (void) read: (id <TProtocol>) inProtocol;
- (void) write: (id <TProtocol>) outProtocol;

- (void) validate;

#if !__has_feature(objc_arc)
- (Text) id;
- (void) setId: (Text) id;
#endif
- (BOOL) idIsSet;

#if !__has_feature(objc_arc)
- (Text) recType;
- (void) setRecType: (Text) recType;
#endif
- (BOOL) recTypeIsSet;

#if !__has_feature(objc_arc)
- (Text) name;
- (void) setName: (Text) name;
#endif
- (BOOL) nameIsSet;

#if !__has_feature(objc_arc)
- (Text) checksum;
- (void) setChecksum: (Text) checksum;
#endif
- (BOOL) checksumIsSet;

#if !__has_feature(objc_arc)
- (Text) desc;
- (void) setDesc: (Text) desc;
#endif
- (BOOL) descIsSet;

#if !__has_feature(objc_arc)
- (Text) icon;
- (void) setIcon: (Text) icon;
#endif
- (BOOL) iconIsSet;

#if !__has_feature(objc_arc)
- (BOOL) fav;
- (void) setFav: (BOOL) fav;
#endif
- (BOOL) favIsSet;

@end

@interface ServiceError : NSException <TBase, NSCoding> {
  NSString * __message;

  BOOL __message_isset;
}

#if TARGET_OS_IPHONE || (MAC_OS_X_VERSION_MAX_ALLOWED >= MAC_OS_X_VERSION_10_5)
@property (nonatomic, retain, getter=message, setter=setMessage:) NSString * message;
#endif

- (id) init;
- (id) initWithMessage: (NSString *) message;

- (void) read: (id <TProtocol>) inProtocol;
- (void) write: (id <TProtocol>) outProtocol;

- (void) validate;

#if !__has_feature(objc_arc)
- (NSString *) message;
- (void) setMessage: (NSString *) message;
#endif
- (BOOL) messageIsSet;

@end

@interface IllegalArgument : NSException <TBase, NSCoding> {
  NSString * __message;

  BOOL __message_isset;
}

#if TARGET_OS_IPHONE || (MAC_OS_X_VERSION_MAX_ALLOWED >= MAC_OS_X_VERSION_10_5)
@property (nonatomic, retain, getter=message, setter=setMessage:) NSString * message;
#endif

- (id) init;
- (id) initWithMessage: (NSString *) message;

- (void) read: (id <TProtocol>) inProtocol;
- (void) write: (id <TProtocol>) outProtocol;

- (void) validate;

#if !__has_feature(objc_arc)
- (NSString *) message;
- (void) setMessage: (NSString *) message;
#endif
- (BOOL) messageIsSet;

@end

@interface AlreadyExists : NSException <TBase, NSCoding> {
  NSString * __message;

  BOOL __message_isset;
}

#if TARGET_OS_IPHONE || (MAC_OS_X_VERSION_MAX_ALLOWED >= MAC_OS_X_VERSION_10_5)
@property (nonatomic, retain, getter=message, setter=setMessage:) NSString * message;
#endif

- (id) init;
- (id) initWithMessage: (NSString *) message;

- (void) read: (id <TProtocol>) inProtocol;
- (void) write: (id <TProtocol>) outProtocol;

- (void) validate;

#if !__has_feature(objc_arc)
- (NSString *) message;
- (void) setMessage: (NSString *) message;
#endif
- (BOOL) messageIsSet;

@end

@protocol PointFlow <NSObject>
- (TUser *) authenticate: (Text) email password: (Text) password apikey: (Text) apikey location: (TGeoLocation *) location;  // throws ServiceError *, TException
- (Text) exchangeSession: (Text) brokerToken;  // throws ServiceError *, TException
- (Text) getUserEmail: (Text) sessionKey;  // throws ServiceError *, TException
- (Text) sendGCMToken: (Text) userid devicetoken: (Text) devicetoken deviceGuid: (Text) deviceGuid;  // throws ServiceError *, TException
- (NSMutableArray *) getActiveTasks: (Text) sessionKey;  // throws ServiceError *, TException
- (TTaskDetail *) getTaskDetails: (Text) taskId sessionKey: (Text) sessionKey;  // throws ServiceError *, TException
- (NSMutableArray *) getProcessTypes: (Text) sessionKey;  // throws ServiceError *, TException
- (Text) deleteProcess: (Text) processId;  // throws ServiceError *, TException
- (NSMutableArray *) getApplications: (Text) sessionKey page: (int32_t) page perPage: (int32_t) perPage;  // throws ServiceError *, TException
- (TProcessType *) startApplication: (Text) id sessionKey: (Text) sessionKey;  // throws ServiceError *, TException
- (NSMutableArray *) getTemplates: (int32_t) page perPage: (int32_t) perPage;  // throws ServiceError *, TException
- (TTemplate *) getTemplateById: (Text) id sessionKey: (Text) sessionKey;  // throws ServiceError *, TException
- (TTemplate *) createTemplate: (Text) body sessionKey: (Text) sessionKey;  // throws ServiceError *, TException
- (Text) updateTemplate: (Text) id sessionKey: (Text) sessionKey;  // throws ServiceError *, TException
- (Text) deleteTemplate: (Text) id sessionKey: (Text) sessionKey;  // throws ServiceError *, TException
- (NSMutableArray *) getObjectsFromStore: (Text) sessionKey;  // throws ServiceError *, TException
- (NSMutableArray *) getObjectsFromStoreByAgg: (Text) sessionKey;  // throws ServiceError *, TException
- (Text) getObjectFromStoreById: (Text) sessionKey;  // throws ServiceError *, TException
- (Text) addObjectInStore: (Text) body sessionKey: (Text) sessionKey;  // throws ServiceError *, TException
- (Text) updateObjectInStore: (Text) id body: (Text) body sessionKey: (Text) sessionKey;  // throws ServiceError *, TException
- (int32_t) deleteObjectFromStore: (Text) id sessionKey: (Text) sessionKey;  // throws ServiceError *, TException
@end

@interface PointFlowClient : TBaseClient <PointFlow> - (id) initWithProtocol: (id <TProtocol>) protocol;
- (id) initWithInProtocol: (id <TProtocol>) inProtocol outProtocol: (id <TProtocol>) outProtocol;
@end

@interface PointFlowProcessor : NSObject <TProcessor> {
  id <PointFlow> mService;
  NSDictionary * mMethodMap;
}
- (id) initWithPointFlow: (id <PointFlow>) service;
- (id<PointFlow>) service;
@end

@interface PointFlowConstants : NSObject {
}
@end