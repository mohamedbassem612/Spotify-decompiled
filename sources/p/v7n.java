package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class v7n implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ w7n b;

    public /* synthetic */ v7n(w7n w7nVar, e261 e261Var) {
        this.a = (byte) 3;
        this.b = w7nVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        boolean z = false;
        w7n w7nVar = this.b;
        switch (b) {
            case 0:
                hrr0 hrr0Var = w7nVar.S0.t;
                Boolean bool = Boolean.TRUE;
                hrr0Var.setValue(bool);
                w7nVar.S0.s.setValue(bool);
                w7n.K1(w7nVar.S0, (String) ((f620) obj).b(), w7nVar.T0, w7nVar.U0);
                return bool;
            case 1:
                List list = (List) obj;
                if (w7nVar.S0.d() != null) {
                    z9e1 z9e1VarD = w7nVar.S0.d();
                    z9e1VarD.getClass();
                    list.add(z9e1VarD.a);
                    z = true;
                }
                return Boolean.valueOf(z);
            case 2:
                w7n.K1(w7nVar.S0, ((af5) obj).b, w7nVar.T0, w7nVar.U0);
                return Boolean.TRUE;
            default:
                af5 af5Var = (af5) obj;
                if (!w7nVar.T0 && w7nVar.U0) {
                    c9e1 c9e1Var = w7nVar.S0.e;
                    if (c9e1Var != null) {
                        List listM = p7h.M(new lov[]{new ii20(), new qqh(af5Var, 1)});
                        r1c0 r1c0Var = w7nVar.S0;
                        jut jutVar = r1c0Var.d;
                        l7n l7nVar = r1c0Var.v;
                        c8e1 c8e1VarD = jutVar.d(listM);
                        c9e1Var.a(null, c8e1VarD);
                        l7nVar.invoke(c8e1VarD);
                    } else {
                        c8e1 c8e1Var = w7nVar.R0;
                        String str = c8e1Var.a.b;
                        long j = c8e1Var.b;
                        int i = nbe1.c;
                        String string = ihc1.M0(str, (int) (j >> 32), (int) (j & 4294967295L), af5Var).toString();
                        int length = af5Var.b.length() + ((int) (w7nVar.R0.b >> 32));
                        w7nVar.S0.v.invoke(new c8e1(e6p1.e(length, length), 4, string));
                    }
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }

    public /* synthetic */ v7n(w7n w7nVar, byte b) {
        this.a = b;
        this.b = w7nVar;
    }
}
