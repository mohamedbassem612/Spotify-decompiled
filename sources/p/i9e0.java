package p;

import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class i9e0 implements rjp0 {
    public final f2g1 a;
    public boolean b = false;

    public i9e0(dan1 dan1Var, f2g1 f2g1Var) {
        this.a = f2g1Var;
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [android.app.Activity, com.google.android.gms.auth.api.signin.internal.SignInHubActivity] */
    public final void b(Object obj) {
        ?? r3 = (SignInHubActivity) this.a.b;
        r3.setResult(r3.c1, r3.d1);
        r3.finish();
        this.b = true;
    }

    public final String toString() {
        return this.a.toString();
    }
}
