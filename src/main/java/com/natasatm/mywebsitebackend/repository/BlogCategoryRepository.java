package com.natasatm.mywebsitebackend.repository;

import com.natasatm.mywebsitebackend.model.BlogCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogCategoryRepository extends JpaRepository<BlogCategory,Long> {
}
