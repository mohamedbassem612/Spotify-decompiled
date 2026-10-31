package p;

import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class jha implements dmh1 {
    public final zsc a;
    public final zfa b;
    public final o8n c;
    public final si90 d;
    public final CopyOnWriteArrayList e;

    public jha(zsc zscVar, zfa zfaVar, o8n o8nVar) {
        m4e0 m4e0Var = new m4e0((byte) 5);
        this.a = zscVar;
        this.b = zfaVar;
        this.c = o8nVar;
        this.d = m4e0Var;
        this.e = new CopyOnWriteArrayList();
    }

    @Override // p.dmh1
    public final void b(ses0 ses0Var) {
        k3r k3rVar;
        zsc zscVar = this.a;
        vla1 vla1Var = (vla1) zscVar.b;
        int iC = ses0Var.c();
        for (int i = 0; i < iC; i++) {
            if (ses0Var.g(i)) {
                jh5 jh5VarH = ses0Var.h(i);
                jh5VarH.getClass();
                zjd1 zjd1Var = jh5VarH.a;
                if (((Boolean) vla1Var.a().invoke(jh5VarH)).booleanValue()) {
                    Object objB = this.d.b(jh5VarH);
                    j3r j3rVar = objB != null ? new j3r(objB) : null;
                    if (j3rVar != null) {
                        ses0Var.n(i, j3rVar);
                    }
                }
            }
        }
        iu30 iu30Var = (iu30) zscVar.e;
        int iC2 = ses0Var.c();
        for (int i2 = 0; i2 < iC2; i2++) {
            if (ses0Var.g(i2)) {
                jh5 jh5VarH2 = ses0Var.h(i2);
                jh5VarH2.getClass();
                zjd1 zjd1Var2 = jh5VarH2.a;
                if (((Boolean) vla1Var.a().invoke(jh5VarH2)).booleanValue() && (k3rVar = (k3r) iu30Var.invoke(jh5VarH2)) != null) {
                    ses0Var.n(i2, k3rVar);
                }
            }
        }
        int iC3 = ses0Var.c();
        for (int i3 = 0; i3 < iC3; i3++) {
            if (ses0Var.g(i3)) {
                jh5 jh5VarH3 = ses0Var.h(i3);
                jh5VarH3.getClass();
                zjd1 zjd1Var3 = jh5VarH3.a;
                if (((Boolean) vla1Var.a().invoke(jh5VarH3)).booleanValue()) {
                    ses0Var.n(i3, i3r.a);
                }
            }
        }
    }

    @Override // p.dmh1
    public final cmh1 c(iu30 iu30Var) {
        iha ihaVar = new iha(this, iu30Var);
        this.e.add(ihaVar);
        return ihaVar;
    }

    @Override // p.dmh1
    public final yla1 e() {
        return (vla1) this.a.b;
    }
}
