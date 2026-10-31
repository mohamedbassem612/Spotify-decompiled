package p;

import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class fla0 extends sgl {
    public fla0(jeg jegVar) {
        super(new dla0(jegVar));
    }

    @Override // p.sgl
    public final a8b0 a(zim0 zim0Var) {
        a8b0 a8b0VarB;
        e0h1.b.getClass();
        e0h1 e0h1Var = e0h1.c;
        g6b0 g6b0VarE = zim0Var.e();
        g6b0VarE.getClass();
        beg begVarK = g6b0VarE.k(rfb1.Q.i());
        Object obj = this.a;
        ela0 ela0Var = (ela0) obj;
        if (ela0Var instanceof cla0) {
            a8b0VarB = ((cla0) obj).a;
        } else {
            if (!(ela0Var instanceof dla0)) {
                eg.o();
                return null;
            }
            jeg jegVar = ((dla0) obj).a;
            heg hegVar = jegVar.a;
            int i = jegVar.b;
            beg begVarH = x1p1.h(zim0Var, hegVar);
            if (begVarH == null) {
                a8b0VarB = bkz.b(zjz.d, hegVar.toString(), String.valueOf(i));
            } else {
                a8b0 a8b0VarA = rzn1.A(begVarH.m());
                for (int i2 = 0; i2 < i; i2++) {
                    a8b0VarA = zim0Var.e().j(a8b0VarA);
                }
                a8b0VarB = a8b0VarA;
            }
        }
        return y3o1.h0(e0h1Var, begVarK, Collections.singletonList(new f1h1(a8b0VarB)));
    }

    public fla0(heg hegVar, int i) {
        this(new jeg(hegVar, i));
    }
}
