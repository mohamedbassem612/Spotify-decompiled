package p;

import android.util.Base64;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class b8c0 {
    public final byte[] a;

    public b8c0(byte[] bArr) {
        this.a = (byte[]) bArr.clone();
    }

    public final String a() {
        return Base64.encodeToString(this.a, 0);
    }

    public final byte[] b() {
        return (byte[]) this.a.clone();
    }

    public b8c0(String str) {
        this(Base64.decode(str, 0));
    }
}
