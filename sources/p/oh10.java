package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class oh10 implements kvc0 {
    public final kvc0 a;
    public final zhq0 b = new zhq0((byte) 14);

    public oh10(kvc0 kvc0Var) {
        this.a = kvc0Var;
    }

    public final void b(ses0 ses0Var) {
        kvc0 kvc0Var = this.a;
        int i = ses0Var.a;
        zhq0 zhq0Var = this.b;
        ses0 ses0VarA = zhq0Var.a(i);
        try {
            int i2 = ses0Var.a;
            for (int i3 = 0; i3 < i2; i3++) {
                if (ses0Var.g(i3)) {
                    jh5 jh5VarH = ses0Var.h(i3);
                    jh5VarH.getClass();
                    ses0VarA.p(i3, jh5VarH);
                }
            }
            kvc0Var.b(ses0VarA);
            int i4 = ses0Var.a;
            for (int i5 = 0; i5 < i4; i5++) {
                jh5 jh5VarH2 = ses0VarA.h(i5);
                j3r j3rVarO = ses0VarA.o(i5);
                if (jh5VarH2 != null && j3rVarO != null && ses0Var.g(i5)) {
                    if (u890.j(jh5VarH2.a, kvc0Var.d()) && (j3rVarO instanceof h3r) && ph10.a(((qvc0) jh5VarH2.b).a)) {
                        j3rVarO = new j3r(z6x.a);
                    }
                    ses0Var.n(i5, j3rVarO);
                }
            }
        } finally {
            zhq0Var.q(ses0VarA);
        }
    }

    public final pua0 c(iu30 iu30Var) {
        return new nh10(this.a.c(new v2y(iu30Var, (byte) 21)));
    }

    public final zjd1 d() {
        return this.a.d();
    }
}
