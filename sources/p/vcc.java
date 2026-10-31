package p;

import android.os.Bundle;
import android.os.SharedMemory;
import android.system.OsConstants;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class vcc {
    public final SharedMemory a;

    public vcc(SharedMemory sharedMemory) {
        this.a = sharedMemory;
    }

    public static vcc a(byte[] bArr) {
        SharedMemory sharedMemoryCreate;
        try {
            sharedMemoryCreate = SharedMemory.create("BundleableByteArray", bArr.length);
            try {
                ByteBuffer byteBufferMapReadWrite = sharedMemoryCreate.mapReadWrite();
                byteBufferMapReadWrite.put(bArr);
                SharedMemory.unmap(byteBufferMapReadWrite);
                sharedMemoryCreate.setProtect(OsConstants.PROT_READ);
                return new vcc(sharedMemoryCreate);
            } catch (Exception e) {
                e = e;
                oon1.I("Failed to allocate shared memory for byte array, size=" + bArr.length, e);
                if (sharedMemoryCreate != null) {
                    sharedMemoryCreate.close();
                }
                return null;
            }
        } catch (Exception e2) {
            e = e2;
            sharedMemoryCreate = null;
        }
    }

    public static byte[] b(Bundle bundle) throws Throwable {
        ByteBuffer byteBufferMapReadOnly;
        SharedMemory sharedMemory = (SharedMemory) bundle.getParcelable(xcc.f);
        try {
            if (sharedMemory == null) {
                return null;
            }
            try {
                byteBufferMapReadOnly = sharedMemory.mapReadOnly();
                try {
                    byte[] bArr = new byte[sharedMemory.getSize()];
                    byteBufferMapReadOnly.get(bArr);
                    SharedMemory.unmap(byteBufferMapReadOnly);
                    sharedMemory.close();
                    return bArr;
                } catch (Exception e) {
                    e = e;
                    oon1.I("Failed to read byte array from shared memory", e);
                    if (byteBufferMapReadOnly != null) {
                        SharedMemory.unmap(byteBufferMapReadOnly);
                    }
                    sharedMemory.close();
                    return null;
                }
            } catch (Exception e2) {
                e = e2;
                byteBufferMapReadOnly = null;
            } catch (Throwable th) {
                th = th;
                if (0 != 0) {
                    SharedMemory.unmap(null);
                }
                sharedMemory.close();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
