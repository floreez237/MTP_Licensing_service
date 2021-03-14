package com.thoughtmecanix.licenses.licensingservice.controllers;

import com.thoughtmecanix.licenses.licensingservice.model.License;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/organizations/{organizationId}/licenses")
public class LicenseServiceController {

    @GetMapping("/{licenseId}")
    public License getLicenseBy(@PathVariable String licenseId, @PathVariable String organizationId) {
        return License.builder().id(licenseId).organizationId(organizationId).licenseType("Temporal")
                .productName("Tolo").build();
    }
}
