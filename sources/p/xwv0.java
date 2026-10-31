package p;

import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class xwv0 implements slq0 {
    public final drp0 a;
    public final rlq0 b;
    public final rlq0 c;
    public final bpb1 d;
    public final xe01 e;

    public xwv0(drp0 drp0Var, String str, iac0 iac0Var) {
        this.a = drp0Var;
        rlq0 rlq0Var = new rlq0(Collections.singletonMap(str, new nlq0(Collections.singleton(mlq0.a))));
        this.b = rlq0Var;
        rlq0 rlq0Var2 = new rlq0(Collections.singletonMap(str, olq0.a));
        this.c = rlq0Var2;
        rlq0Var = drp0Var.a() ? rlq0Var : rlq0Var2;
        bpb1 bpb1VarB = gio1.b(rlq0Var);
        this.d = bpb1VarB;
        this.e = d5p1.t(bpb1VarB, cto1.q(iac0Var), ey71.a, rlq0Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    @Override // p.slq0
    public final Object a(String str, mlq0 mlq0Var, r6h1 r6h1Var, lnm lnmVar) {
        boolean z;
        mlq0 mlq0Var2 = mlq0.a;
        bpb1 bpb1Var = this.d;
        if (mlq0Var == mlq0Var2) {
            drp0 drp0Var = this.a;
            if (drp0Var.a()) {
                drp0Var.g(5, str);
                bpb1Var.m((Object) null, this.b);
                z = false;
            } else {
                bpb1Var.m((Object) null, this.c);
                z = true;
            }
        } else {
            bpb1Var.m((Object) null, this.c);
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // p.slq0
    public final zob1 getStatus() {
        return this.e;
    }
}
