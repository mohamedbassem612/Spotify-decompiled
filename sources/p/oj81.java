package p;

import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class oj81 extends pj81 {
    public final GoogleSignInAccount a;

    public oj81(GoogleSignInAccount googleSignInAccount) {
        this.a = googleSignInAccount;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oj81) && this.a.equals(((oj81) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
