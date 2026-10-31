package p;

import android.os.Bundle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class fw5 implements c7r0 {
    public final mw5 a;
    public boolean b;
    public boolean c;

    public fw5(mw5 mw5Var) {
        this.a = mw5Var;
    }

    public final void a(upn1 upn1Var) {
        if (this.c) {
            return;
        }
        if (upn1Var instanceof i7r0) {
            this.b = false;
            return;
        }
        boolean z = upn1Var instanceof h7r0;
        mw5 mw5Var = this.a;
        if (z) {
            if (((h7r0) upn1Var).c) {
                this.b = true;
                return;
            } else {
                mw5Var.a();
                this.c = true;
                return;
            }
        }
        if (!(upn1Var instanceof j7r0)) {
            if (upn1Var instanceof n7r0) {
                this.b = false;
                this.c = true;
                return;
            }
            return;
        }
        if (this.b) {
            mw5Var.a();
            this.b = false;
            this.c = true;
        }
    }

    public final void b(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        this.b = bundle.getBoolean("waitingForSuccessfulFrame");
        this.c = bundle.getBoolean("finished");
    }

    public final Bundle d() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("waitingForSuccessfulFrame", this.b);
        bundle.putBoolean("finished", this.c);
        return bundle;
    }
}
