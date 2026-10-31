package p;

import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class yco1 implements p331 {
    public final fco1 a;

    public yco1(fco1 fco1Var) {
        this.a = fco1Var;
    }

    public final Status getStatus() {
        return Status.e;
    }

    public final String toString() {
        fco1 fco1Var = this.a;
        zod.s(fco1Var);
        return "OptInOptionsResultImpl[" + (fco1Var.a == 1) + "]";
    }
}
