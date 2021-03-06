/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.management.appservice.ProxyOnlyResource;

/**
 * Process Module Information.
 */
@JsonFlatten
public class ProcessModuleInfoInner extends ProxyOnlyResource {
    /**
     * Base address. Used as module identifier in ARM resource URI.
     */
    @JsonProperty(value = "properties.baseAddress")
    private String baseAddress;

    /**
     * File name.
     */
    @JsonProperty(value = "properties.fileName")
    private String fileName;

    /**
     * HRef URI.
     */
    @JsonProperty(value = "properties.href")
    private String href;

    /**
     * File path.
     */
    @JsonProperty(value = "properties.filePath")
    private String filePath;

    /**
     * Module memory size.
     */
    @JsonProperty(value = "properties.moduleMemorySize")
    private Integer moduleMemorySize;

    /**
     * File version.
     */
    @JsonProperty(value = "properties.fileVersion")
    private String fileVersion;

    /**
     * File description.
     */
    @JsonProperty(value = "properties.fileDescription")
    private String fileDescription;

    /**
     * Product name.
     */
    @JsonProperty(value = "properties.product")
    private String product;

    /**
     * Product version.
     */
    @JsonProperty(value = "properties.productVersion")
    private String productVersion;

    /**
     * Is debug?.
     */
    @JsonProperty(value = "properties.isDebug")
    private Boolean isDebug;

    /**
     * Module language (locale).
     */
    @JsonProperty(value = "properties.language")
    private String language;

    /**
     * Get the baseAddress value.
     *
     * @return the baseAddress value
     */
    public String baseAddress() {
        return this.baseAddress;
    }

    /**
     * Set the baseAddress value.
     *
     * @param baseAddress the baseAddress value to set
     * @return the ProcessModuleInfoInner object itself.
     */
    public ProcessModuleInfoInner withBaseAddress(String baseAddress) {
        this.baseAddress = baseAddress;
        return this;
    }

    /**
     * Get the fileName value.
     *
     * @return the fileName value
     */
    public String fileName() {
        return this.fileName;
    }

    /**
     * Set the fileName value.
     *
     * @param fileName the fileName value to set
     * @return the ProcessModuleInfoInner object itself.
     */
    public ProcessModuleInfoInner withFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }

    /**
     * Get the href value.
     *
     * @return the href value
     */
    public String href() {
        return this.href;
    }

    /**
     * Set the href value.
     *
     * @param href the href value to set
     * @return the ProcessModuleInfoInner object itself.
     */
    public ProcessModuleInfoInner withHref(String href) {
        this.href = href;
        return this;
    }

    /**
     * Get the filePath value.
     *
     * @return the filePath value
     */
    public String filePath() {
        return this.filePath;
    }

    /**
     * Set the filePath value.
     *
     * @param filePath the filePath value to set
     * @return the ProcessModuleInfoInner object itself.
     */
    public ProcessModuleInfoInner withFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }

    /**
     * Get the moduleMemorySize value.
     *
     * @return the moduleMemorySize value
     */
    public Integer moduleMemorySize() {
        return this.moduleMemorySize;
    }

    /**
     * Set the moduleMemorySize value.
     *
     * @param moduleMemorySize the moduleMemorySize value to set
     * @return the ProcessModuleInfoInner object itself.
     */
    public ProcessModuleInfoInner withModuleMemorySize(Integer moduleMemorySize) {
        this.moduleMemorySize = moduleMemorySize;
        return this;
    }

    /**
     * Get the fileVersion value.
     *
     * @return the fileVersion value
     */
    public String fileVersion() {
        return this.fileVersion;
    }

    /**
     * Set the fileVersion value.
     *
     * @param fileVersion the fileVersion value to set
     * @return the ProcessModuleInfoInner object itself.
     */
    public ProcessModuleInfoInner withFileVersion(String fileVersion) {
        this.fileVersion = fileVersion;
        return this;
    }

    /**
     * Get the fileDescription value.
     *
     * @return the fileDescription value
     */
    public String fileDescription() {
        return this.fileDescription;
    }

    /**
     * Set the fileDescription value.
     *
     * @param fileDescription the fileDescription value to set
     * @return the ProcessModuleInfoInner object itself.
     */
    public ProcessModuleInfoInner withFileDescription(String fileDescription) {
        this.fileDescription = fileDescription;
        return this;
    }

    /**
     * Get the product value.
     *
     * @return the product value
     */
    public String product() {
        return this.product;
    }

    /**
     * Set the product value.
     *
     * @param product the product value to set
     * @return the ProcessModuleInfoInner object itself.
     */
    public ProcessModuleInfoInner withProduct(String product) {
        this.product = product;
        return this;
    }

    /**
     * Get the productVersion value.
     *
     * @return the productVersion value
     */
    public String productVersion() {
        return this.productVersion;
    }

    /**
     * Set the productVersion value.
     *
     * @param productVersion the productVersion value to set
     * @return the ProcessModuleInfoInner object itself.
     */
    public ProcessModuleInfoInner withProductVersion(String productVersion) {
        this.productVersion = productVersion;
        return this;
    }

    /**
     * Get the isDebug value.
     *
     * @return the isDebug value
     */
    public Boolean isDebug() {
        return this.isDebug;
    }

    /**
     * Set the isDebug value.
     *
     * @param isDebug the isDebug value to set
     * @return the ProcessModuleInfoInner object itself.
     */
    public ProcessModuleInfoInner withIsDebug(Boolean isDebug) {
        this.isDebug = isDebug;
        return this;
    }

    /**
     * Get the language value.
     *
     * @return the language value
     */
    public String language() {
        return this.language;
    }

    /**
     * Set the language value.
     *
     * @param language the language value to set
     * @return the ProcessModuleInfoInner object itself.
     */
    public ProcessModuleInfoInner withLanguage(String language) {
        this.language = language;
        return this;
    }

}
