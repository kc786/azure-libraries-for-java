/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network;

import java.util.List;
import com.microsoft.azure.management.network.implementation.VpnClientRootCertificateInner;
import com.microsoft.azure.management.network.implementation.VpnClientRevokedCertificateInner;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * VpnClientConfiguration for P2S client.
 */
public class VpnClientConfiguration {
    /**
     * The reference of the address space resource which represents Address
     * space for P2S VpnClient.
     */
    @JsonProperty(value = "vpnClientAddressPool")
    private AddressSpace vpnClientAddressPool;

    /**
     * VpnClientRootCertificate for virtual network gateway.
     */
    @JsonProperty(value = "vpnClientRootCertificates")
    private List<VpnClientRootCertificateInner> vpnClientRootCertificates;

    /**
     * VpnClientRevokedCertificate for Virtual network gateway.
     */
    @JsonProperty(value = "vpnClientRevokedCertificates")
    private List<VpnClientRevokedCertificateInner> vpnClientRevokedCertificates;

    /**
     * Get the vpnClientAddressPool value.
     *
     * @return the vpnClientAddressPool value
     */
    public AddressSpace vpnClientAddressPool() {
        return this.vpnClientAddressPool;
    }

    /**
     * Set the vpnClientAddressPool value.
     *
     * @param vpnClientAddressPool the vpnClientAddressPool value to set
     * @return the VpnClientConfiguration object itself.
     */
    public VpnClientConfiguration withVpnClientAddressPool(AddressSpace vpnClientAddressPool) {
        this.vpnClientAddressPool = vpnClientAddressPool;
        return this;
    }

    /**
     * Get the vpnClientRootCertificates value.
     *
     * @return the vpnClientRootCertificates value
     */
    public List<VpnClientRootCertificateInner> vpnClientRootCertificates() {
        return this.vpnClientRootCertificates;
    }

    /**
     * Set the vpnClientRootCertificates value.
     *
     * @param vpnClientRootCertificates the vpnClientRootCertificates value to set
     * @return the VpnClientConfiguration object itself.
     */
    public VpnClientConfiguration withVpnClientRootCertificates(List<VpnClientRootCertificateInner> vpnClientRootCertificates) {
        this.vpnClientRootCertificates = vpnClientRootCertificates;
        return this;
    }

    /**
     * Get the vpnClientRevokedCertificates value.
     *
     * @return the vpnClientRevokedCertificates value
     */
    public List<VpnClientRevokedCertificateInner> vpnClientRevokedCertificates() {
        return this.vpnClientRevokedCertificates;
    }

    /**
     * Set the vpnClientRevokedCertificates value.
     *
     * @param vpnClientRevokedCertificates the vpnClientRevokedCertificates value to set
     * @return the VpnClientConfiguration object itself.
     */
    public VpnClientConfiguration withVpnClientRevokedCertificates(List<VpnClientRevokedCertificateInner> vpnClientRevokedCertificates) {
        this.vpnClientRevokedCertificates = vpnClientRevokedCertificates;
        return this;
    }

}