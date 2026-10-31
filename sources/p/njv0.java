package p;

import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class njv0 implements cvl1, xpw {
    public final Context a;
    public final drj0 b;
    public final hyy0 c;
    public final ynb0 d;
    public final ynb0 e;
    public final q8n f;
    public final js20 g = x3p1.n(new mjv0(this, (byte) 0), new mjv0(this, (byte) 1), new t1t0(this, (byte) 25), (o8n) null, new mjv0(this, (byte) 2), 8);

    public njv0(Context context, drj0 drj0Var, hyy0 hyy0Var, ynb0 ynb0Var, ynb0 ynb0Var2, q8n q8nVar) {
        this.a = context;
        this.b = drj0Var;
        this.c = hyy0Var;
        this.d = ynb0Var;
        this.e = ynb0Var2;
        this.f = q8nVar;
    }

    public final rqw a() {
        return n3o1.r(this).c(gou0.Y0, gou0.Z0);
    }

    public final jsw c() {
        j2i j2iVar = d9j.a;
        ien0 ien0Var = qsw.a;
        return new psw(j2iVar, (byte) 0);
    }

    public final ziv0 e(ljv0 ljv0Var, uiv0 uiv0Var) {
        int i;
        String string;
        if (ljv0Var.b) {
            i = 3;
        } else {
            i = ljv0Var.a ? 2 : 1;
        }
        int iC = l1d.C(i);
        String string2 = null;
        Context context = this.a;
        if (iC == 0 || iC == 1) {
            string = context.getString(2131959059);
        } else {
            if (iC != 2) {
                eg.o();
                return null;
            }
            string = context.getString(2131959063);
        }
        String str = string;
        int iC2 = l1d.C(i);
        if (iC2 == 0) {
            string2 = context.getString(2131959060);
        } else if (iC2 == 1) {
            string2 = context.getString(2131959061);
        } else if (iC2 != 2) {
            eg.o();
            return null;
        }
        return new ziv0(str, i, uiv0Var.c, uiv0Var.d, string2);
    }

    public final mqw getBehavior() {
        return this.g;
    }
}
