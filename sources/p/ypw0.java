package p;

import android.content.res.Resources;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ypw0 implements ypx0 {
    public final /* synthetic */ byte a = 1;
    public final q8n b;
    public final q8n c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;

    public ypw0(dl7 dl7Var, poj0 poj0Var, ulc ulcVar, u9b u9bVar, q8n q8nVar, q8n q8nVar2, q8n q8nVar3) {
        this.d = dl7Var;
        this.e = poj0Var;
        this.f = ulcVar;
        this.g = u9bVar;
        this.b = q8nVar;
        this.c = q8nVar2;
        this.h = q8nVar3;
    }

    @Override // p.ypx0
    public final vpx0 a(c9n c9nVar, da6 da6Var, iu30 iu30Var) {
        switch (this.a) {
            case 0:
                return new wpw0(da6Var, new xpw0(iu30Var, this, (byte) 0));
            default:
                cf01 cf01Var = new cf01(((dl7) this.d).a, c9nVar);
                bpb1 bpb1VarB = gio1.b(b4g.a);
                poj0 poj0Var = (poj0) this.e;
                q8n q8nVar = (q8n) this.h;
                q8n q8nVar2 = this.b;
                gwh1 gwh1Var = new gwh1(iu30Var, cf01Var, poj0Var, bpb1VarB, q8nVar, q8nVar2);
                q8n q8nVar3 = this.c;
                return new oxh1(da6Var, new yxb0(gwh1Var, new zwh1(cf01Var, q8nVar3), (ulc) this.f, q8nVar2, q8nVar3, q8nVar), (u9b) this.g, d5p1.h(bpb1VarB));
        }
    }

    public ypw0(zpw0 zpw0Var, ov20 ov20Var, a1r0 a1r0Var, iyc0 iyc0Var, Resources resources, q8n q8nVar, q8n q8nVar2) {
        this.d = zpw0Var;
        this.e = ov20Var;
        this.f = a1r0Var;
        this.g = iyc0Var;
        this.h = resources;
        this.b = q8nVar;
        this.c = q8nVar2;
    }
}
