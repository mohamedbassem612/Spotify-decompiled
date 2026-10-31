package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class zpc implements dmh1 {
    public final w1k a;
    public final z1c b;

    public zpc(w1k w1kVar, z1c z1cVar) {
        this.a = w1kVar;
        this.b = z1cVar;
    }

    public final void b(ses0 ses0Var) {
        w1k w1kVar = this.a;
        vla1 vla1Var = w1kVar.d;
        int i = ses0Var.a;
        for (int i2 = 0; i2 < i; i2++) {
            if (ses0Var.g(i2)) {
                jh5 jh5VarH = ses0Var.h(i2);
                jh5VarH.getClass();
                zjd1 zjd1Var = jh5VarH.a;
                if (vla1Var == null) {
                    eg.o();
                    return;
                } else if (((Boolean) vla1Var.a.invoke(jh5VarH)).booleanValue()) {
                    Object objB = this.b.b(jh5VarH);
                    j3r j3rVar = objB != null ? new j3r(objB) : null;
                    if (j3rVar != null) {
                        ses0Var.n(i2, j3rVar);
                    }
                }
            }
        }
        w1kVar.b(ses0Var);
        int i3 = ses0Var.a;
        for (int i4 = 0; i4 < i3; i4++) {
            if (ses0Var.g(i4)) {
                jh5 jh5VarH2 = ses0Var.h(i4);
                jh5VarH2.getClass();
                zjd1 zjd1Var2 = jh5VarH2.a;
                if (vla1Var == null) {
                    eg.o();
                    return;
                } else if (((Boolean) vla1Var.a.invoke(jh5VarH2)).booleanValue()) {
                    ses0Var.n(i4, i3r.a);
                }
            }
        }
    }

    public final cmh1 c(iu30 iu30Var) {
        return new ypc(this.a.c(new ztb(iu30Var, this, (byte) 7)), this);
    }

    public final yla1 e() {
        return this.a.d;
    }

    public final k3r f(jh5 jh5Var, k3r k3rVar) {
        boolean z = k3rVar instanceof h3r;
        z1c z1cVar = this.b;
        if (z) {
            z1cVar.a(jh5Var, (Object) null);
        } else if (k3rVar instanceof j3r) {
            z1cVar.a(jh5Var, ((j3r) k3rVar).a);
        }
        Object objB = z1cVar.b(jh5Var);
        return objB != null ? new j3r(objB) : k3rVar;
    }
}
