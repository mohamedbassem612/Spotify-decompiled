package org.chromium.net;

import android.os.ParcelFileDescriptor;
import java.io.File;
import java.nio.ByteBuffer;
import p.axh1;
import p.cxh1;
import p.h5a1;
import p.utw0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
@Deprecated
public final class UploadDataProviders {
    private UploadDataProviders() {
    }

    public static UploadDataProvider create(byte[] bArr) {
        return new axh1(ByteBuffer.wrap(bArr, 0, bArr.length).slice(), (byte) 0);
    }

    public static UploadDataProvider create(ParcelFileDescriptor parcelFileDescriptor) {
        return new cxh1(new utw0(parcelFileDescriptor));
    }

    public static UploadDataProvider create(ByteBuffer byteBuffer) {
        return new axh1(byteBuffer.slice(), (byte) 0);
    }

    public static UploadDataProvider create(byte[] bArr, int i, int i2) {
        return new axh1(ByteBuffer.wrap(bArr, i, i2).slice(), (byte) 0);
    }

    public static UploadDataProvider create(File file) {
        return new cxh1(new h5a1(file, (byte) 19));
    }
}
