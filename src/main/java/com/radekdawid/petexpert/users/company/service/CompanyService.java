package com.radekdawid.petexpert.users.company.service;


import com.radekdawid.petexpert.users.company.repository.CompanyRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CompanyService {
    private final CompanyRepository companyRepository;


}