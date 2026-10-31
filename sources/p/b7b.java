package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class b7b {
    public final a7b a;

    public b7b(a7b a7bVar) {
        this.a = a7bVar;
    }

    public final void a(String str, Function0 function0, Function0 function1, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1823939737);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(this) ? 2048 : 1024;
        }
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            String strO0 = cwl1.o0(x340Var, 2131952758);
            String strO1 = cwl1.o0(x340Var, 2131961134);
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = v8r.q(Boolean.TRUE);
                x340Var.s0(objT);
            }
            ven0 ven0Var = (ven0) objT;
            boolean zI = x340Var.i(ven0Var) | ((i2 & 896) == 256);
            Object objT2 = x340Var.T();
            if (zI || objT2 == m4cVar) {
                objT2 = new cb(function1, ven0Var, (byte) 4);
                x340Var.s0(objT2);
            }
            Function0 function2 = (Function0) objT2;
            if (((Boolean) ven0Var.getValue()).booleanValue()) {
                x340Var.i0(-1356985647);
                String strN0 = cwl1.n0(2131952762, new Object[]{str}, x340Var);
                String strA = this.a.a(str);
                if (ihc1.y0(strO0)) {
                    hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                    return;
                }
                zgx zgxVar = new zgx(strO0, new gbx(new y50(strO0), function0));
                if (ihc1.y0(strO1)) {
                    hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                    return;
                } else {
                    mqo1.d(function2, (i3u) null, (hux) null, strN0, strA, zgxVar, new zgx(strO1, new gbx(new y50(strO1), function2)), x340Var, 2359296, 6);
                    x340Var.r(false);
                }
            } else {
                x340Var.i0(-1356422501);
                x340Var.r(false);
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vqa(i, this, str, function0, function1, (byte) 4);
        }
    }
}
