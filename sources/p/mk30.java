package p;

import android.os.Build;
import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class mk30 implements nco {
    public static final boolean c;
    public final UUID a;
    public final byte[] b;

    /* JADX WARN: Code duplicated, block: B:9:0x001e  */
    static {
        boolean z;
        if ("Amazon".equals(Build.MANUFACTURER)) {
            String str = Build.MODEL;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        c = z;
    }

    public mk30(UUID uuid, byte[] bArr) {
        this.a = uuid;
        this.b = bArr;
    }
}
