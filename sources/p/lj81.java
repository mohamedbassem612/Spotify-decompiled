package p;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class lj81 extends px40 {
    public final boolean B;
    public final d520 C;
    public final Bundle D;
    public final Integer E;

    public lj81(Context context, Looper looper, d520 d520Var, Bundle bundle, nz40 nz40Var, oz40 oz40Var) {
        super(context, looper, 44, d520Var, nz40Var, oz40Var);
        this.B = true;
        this.C = d520Var;
        this.D = bundle;
        this.E = (Integer) d520Var.h;
    }

    public final boolean B() {
        return this.B;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Bundle j() {
        d520 d520Var = this.C;
        boolean zEquals = this.c.getPackageName().equals((String) d520Var.b);
        Bundle bundle = this.D;
        if (!zEquals) {
            bundle.putString("com.google.android.gms.signin.internal.realClientPackageName", (String) d520Var.b);
        }
        return bundle;
    }
}
