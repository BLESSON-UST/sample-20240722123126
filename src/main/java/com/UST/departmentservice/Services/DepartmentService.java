The provided code is written in Java 8. To upgrade it to be compatible with Java 17 and incorporate new language features, standards, and best practices, we will make the following modifications:

```java
package com.UST.departmentservice.Services;

import com.UST.departmentservice.Model.Department;
import com.UST.departmentservice.Repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {
    private final DepartmentRepository repo;

    @Autowired
    public DepartmentService(DepartmentRepository repo) {
        this.repo = repo;
    }

    public Department saveDepartment(Department department) {
        return repo.save(department);
    }

    public Department findDepartmentById(Long departmentId) {
        return repo.findByDepartmentId(departmentId);
    }
}
```

Explanation of Changes Made:

- The `@Autowired` annotation on the field `DepartmentRepository repo` has been removed. Instead, constructor injection is used to inject the dependency. This follows the best practice of using constructor injection for required dependencies. The constructor is annotated with `@Autowired` to enable the dependency injection from the container.
- The `final` modifier is used for the `repo` field to enforce immutability where possible.
- The `repo` field is set via the constructor, ensuring that it is initialized before the service is used.
- No new language features or standards introduced in Java 17 are used in this particular code snippet. However, the modifications made align with best practices for modern Java development.

Note: Please ensure to update other parts of your codebase and dependencies to be compatible with Java 17 as well.