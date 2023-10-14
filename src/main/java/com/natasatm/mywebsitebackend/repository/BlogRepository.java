package com.natasatm.mywebsitebackend.repository;

import com.natasatm.mywebsitebackend.model.Blog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Blog,Long> {
}
