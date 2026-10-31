package p;

import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class tw70 {
    public static final qim0 a;
    public static final qim0 b;
    public static final qim0 c;
    public static final qim0 d;

    static {
        nim0 nim0Var = nim0.a;
        qim0 qim0VarI = u291.i(nim0Var, 80.0f, 160.0f);
        cbx.a.getClass();
        a = i1p1.q(hno1.f(qim0VarI, uwr.c()), er31.b(8.0f));
        b = i1p1.q(hno1.f(u291.i(nim0Var, 72.0f, 90.0f), uwr.d()), er31.b(8.0f));
        c = i1p1.q(hno1.f(u291.i(u291.w(nim0Var, 80.0f, 160.0f), 80.0f, 160.0f), uwr.a()), er31.b(8.0f));
        d = i1p1.q(hno1.f(u291.i(u291.w(nim0Var, 80.0f, 160.0f), 80.0f, 160.0f), uwr.a()), er31.a);
    }

    public static final void a(dq70 dq70Var, int i, qim0 qim0Var, b0k b0kVar, int i2) {
        qim0 qim0Var2;
        ecx ecxVarA;
        qim0 qim0Var3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1984749967);
        int i3 = i2 | (x340Var.g(dq70Var) ? 4 : 2) | (x340Var.e(l1d.C(i)) ? 32 : 16) | 384;
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            Uri uri = Uri.parse(dq70Var.a);
            int iC = l1d.C(i);
            if (iC == 0 || iC == 1) {
                cbx.a.getClass();
                ecxVarA = uwr.a();
            } else if (iC == 2) {
                cbx.a.getClass();
                ecxVarA = uwr.c();
            } else if (iC != 3) {
                eg.o();
                return;
            } else {
                cbx.a.getClass();
                ecxVarA = uwr.d();
            }
            ecx ecxVar = ecxVarA;
            int iC2 = l1d.C(i);
            if (iC2 == 0) {
                qim0Var3 = d;
            } else if (iC2 == 1) {
                qim0Var3 = c;
            } else if (iC2 == 2) {
                qim0Var3 = a;
            } else {
                if (iC2 != 3) {
                    eg.o();
                    return;
                }
                qim0Var3 = b;
            }
            qim0 qim0Var4 = nim0.a;
            eso1.e(uri, isl.a, qim0Var3.then(qim0Var4), null, null, ecxVar, null, null, null, null, false, false, x340Var, 48, 0, 4056);
            qim0Var2 = qim0Var4;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new lg60(dq70Var, i, qim0Var2, i2, (byte) 3);
        }
    }
}
