package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ly1 implements xpw {
    public final aas a;
    public final k8d1 b;
    public final ia00 c = n3o1.q(this).a(mm1.N0, mm1.O0);
    public final psw d;

    public ly1(aas aasVar, o8n o8nVar) {
        this.a = aasVar;
        this.b = new k8d1(o8nVar, new r20((Object) this, (lnm) null, (byte) 5));
        j2i j2iVar = new j2i(-902460139, new r1(this, (byte) 23), true);
        ien0 ien0Var = qsw.a;
        this.d = new psw(j2iVar, (byte) 0);
    }

    public final rqw a() {
        return this.c;
    }

    public final jsw c() {
        return this.d;
    }

    public final void e(iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-639466745);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(iu30Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            boolean z = (i2 & 14) == 4;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new cr0(iu30Var, (byte) 27);
                x340Var.s0(objT);
            }
            wro1.h(new gbx(z50.c, (Function0) objT), ldx.c, anm1.N("add_to_queue_action_element_button", nim0.a), (max) null, yla.s(x340Var), (vzq0) null, false, (idn0) null, (ga80) null, u4i.a, x340Var, 0, 6, 984);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new g90(this, iu30Var, i, (byte) 7);
        }
    }

    public final mqw getBehavior() {
        return this.b;
    }
}
