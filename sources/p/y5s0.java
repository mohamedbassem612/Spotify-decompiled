package p;

import android.os.Bundle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class y5s0 extends yf {
    public final String c;
    public final String d;

    public y5s0(String str, String str2, Bundle bundle) {
        super("android.credentials.TYPE_PASSWORD_CREDENTIAL", bundle);
        this.c = str;
        this.d = str2;
        if (str2.length() > 0) {
            return;
        }
        hhg1.n("password should not be empty");
        throw null;
    }

    public final String v() {
        return this.c;
    }

    public final String w() {
        return this.d;
    }
}
