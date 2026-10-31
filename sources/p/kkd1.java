package p;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class kkd1 implements qua0 {
    public final zjd1 a;
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final /* synthetic */ q8n c;
    public final /* synthetic */ iu30 d;
    public final /* synthetic */ vu30 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ vu30 g;

    public kkd1(zjd1 zjd1Var, q8n q8nVar, iu30 iu30Var, vu30 vu30Var, boolean z, vu30 vu30Var2) {
        this.c = q8nVar;
        this.d = iu30Var;
        this.e = vu30Var;
        this.f = z;
        this.g = vu30Var2;
        this.a = zjd1Var;
    }

    @Override // p.qua0
    public final void b(ses0 ses0Var) {
        int iC = ses0Var.c();
        for (int i = 0; i < iC; i++) {
            if (ses0Var.g(i)) {
                jh5 jh5VarH = ses0Var.h(i);
                jh5VarH.getClass();
                if (u890.j(jh5VarH.a, this.a)) {
                    Object obj = this.b.get(jh5VarH.b);
                    ses0Var.n(i, obj != null ? new j3r(obj) : i3r.a);
                }
            }
        }
    }

    @Override // p.qua0
    public final pua0 c(iu30 iu30Var) {
        return new jkd1(this.c, this.d, this.e, this.f, this, iu30Var, this.g);
    }

    @Override // p.qua0
    public final zjd1 d() {
        return this.a;
    }
}
