package p;

import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public interface nxa {
    default n8d0 i(tqh0 tqh0Var) {
        byte[] bArr = tqh0Var.k;
        if (bArr != null) {
            return q(bArr);
        }
        Uri uri = tqh0Var.n;
        if (uri != null) {
            return m(uri);
        }
        return null;
    }

    n8d0 m(Uri uri);

    n8d0 q(byte[] bArr);
}
