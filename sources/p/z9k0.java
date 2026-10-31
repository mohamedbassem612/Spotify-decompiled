package p;

import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class z9k0 {
    public final kt91 a;
    public final qfj0 b;
    public final cjk0 c;

    public z9k0(kt91 kt91Var, c9q c9qVar, qfj0 qfj0Var, r6h1 r6h1Var) {
        this.a = kt91Var;
        this.b = qfj0Var;
        this.c = new cjk0(c9qVar.a.a.A5, r6h1Var);
    }

    public static void a(z9k0 z9k0Var, y9k0 y9k0Var) {
        int i;
        int i2;
        qfj0 qfj0Var = z9k0Var.b;
        o9k0 o9k0VarV = y9k0Var.v();
        if (!o9k0VarV.equals(m9k0.a)) {
            if (!o9k0VarV.equals(n9k0.a)) {
                eg.o();
                return;
            } else if (qfj0Var.a.contains(y9k0Var)) {
                return;
            }
        }
        boolean z = y9k0Var instanceof x9k0;
        if (z) {
            i = 1;
        } else if (y9k0Var instanceof v9k0) {
            i = 2;
        } else if (y9k0Var instanceof u9k0) {
            i = 5;
        } else if (y9k0Var instanceof s9k0) {
            i = 6;
        } else if (y9k0Var instanceof q9k0) {
            i = 7;
        } else if (y9k0Var instanceof p9k0) {
            i = 8;
        } else if (y9k0Var instanceof r9k0) {
            i = 9;
        } else {
            if (!(y9k0Var instanceof t9k0)) {
                eg.o();
                return;
            }
            i = 1;
        }
        if (z) {
            i2 = 2131958796;
        } else if (y9k0Var instanceof v9k0) {
            i2 = 2131958793;
        } else if (y9k0Var instanceof u9k0) {
            i2 = 2131958822;
        } else if (y9k0Var instanceof s9k0) {
            i2 = 2131958792;
        } else if (y9k0Var instanceof q9k0) {
            i2 = 2131958603;
        } else if (y9k0Var instanceof p9k0) {
            i2 = 2131958602;
        } else if (y9k0Var instanceof r9k0) {
            i2 = 2131958606;
        } else {
            if (!(y9k0Var instanceof t9k0)) {
                eg.o();
                return;
            }
            i2 = 2131958605;
        }
        n57.k(true, "Invalid resource ID provided: %s", new Object[]{Integer.valueOf(i2)});
        n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
        z9k0Var.a.k(new er91((fs91) null, "", Integer.valueOf(i2), (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
        qfj0Var.a.add(y9k0Var);
        z9k0Var.c.a(i);
    }
}
