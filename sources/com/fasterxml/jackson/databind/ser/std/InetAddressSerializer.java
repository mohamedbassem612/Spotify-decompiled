package com.fasterxml.jackson.databind.ser.std;

import java.net.InetAddress;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public class InetAddressSerializer extends StdScalarSerializer<InetAddress> {
    protected final boolean _asNumeric;

    public InetAddressSerializer(boolean z) {
        super(InetAddress.class);
        this._asNumeric = z;
    }

    public InetAddressSerializer() {
        this(false);
    }
}
