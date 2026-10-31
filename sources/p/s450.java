package p;

import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class s450 implements p331 {
    public final Status a;
    public final GoogleSignInAccount b;

    public s450(GoogleSignInAccount googleSignInAccount, Status status) {
        this.b = googleSignInAccount;
        this.a = status;
    }

    public final Status getStatus() {
        return this.a;
    }
}
