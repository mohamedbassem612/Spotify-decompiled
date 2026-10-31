package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ht41 implements joj1 {
    public final coj1 a;
    public final Function0 b;
    public final Function0 c;
    public final Function0 d;
    public final iu30 e;
    public final bpb1 f;
    public boolean g;
    public final xe01 h;

    public ht41(coj1 coj1Var, Function0 function0, Function0 function1, Function0 function2, iu30 iu30Var) {
        this.a = coj1Var;
        this.b = function0;
        this.c = function1;
        this.d = function2;
        this.e = iu30Var;
        bpb1 bpb1VarB = gio1.b(coj1Var);
        this.f = bpb1VarB;
        this.h = d5p1.h(bpb1VarB);
    }

    public final void a(d3p1 d3p1Var) {
        boolean z = d3p1Var instanceof tnj1;
        aoj1 aoj1Var = aoj1.a;
        int i = 3;
        bpb1 bpb1Var = this.f;
        if (!z) {
            if (d3p1Var instanceof unj1) {
                if (u890.j(b(), aoj1Var)) {
                    bpb1Var.m((Object) null, new boj1(3, true, false));
                    return;
                }
                return;
            }
            if (d3p1Var instanceof qnj1) {
                c();
                return;
            }
            if (d3p1Var instanceof vnj1) {
                c();
                return;
            }
            if (d3p1Var instanceof rnj1) {
                coj1 coj1VarB = b();
                boj1 boj1Var = coj1VarB instanceof boj1 ? (boj1) coj1VarB : null;
                if (boj1Var == null) {
                    return;
                }
                bpb1Var.m((Object) null, new boj1(boj1Var.b, boj1Var.a, true));
                return;
            }
            if (!(d3p1Var instanceof snj1)) {
                eg.o();
                return;
            }
            coj1 coj1VarB2 = b();
            boj1 boj1Var2 = coj1VarB2 instanceof boj1 ? (boj1) coj1VarB2 : null;
            if (boj1Var2 == null) {
                return;
            }
            bpb1Var.m((Object) null, new boj1(boj1Var2.b, boj1Var2.a, false));
            return;
        }
        int i2 = ((tnj1) d3p1Var).c;
        coj1 coj1VarB3 = b();
        if (coj1VarB3 instanceof boj1) {
            boolean z2 = ((Number) this.c.invoke()).intValue() - i2 < ((Number) this.d.invoke()).intValue();
            if (!z2) {
                i = 2;
            } else if (!this.g) {
                i = 1;
            }
            if (i == 1) {
                this.g = true;
            }
            coj1 coj1VarB4 = b();
            boj1 boj1Var3 = coj1VarB4 instanceof boj1 ? (boj1) coj1VarB4 : null;
            bpb1Var.m((Object) null, new boj1(i, z2, boj1Var3 != null ? boj1Var3.c : false));
            return;
        }
        boolean zJ = u890.j(coj1VarB3, aoj1Var);
        znj1 znj1Var = znj1.a;
        Function0 function0 = this.b;
        if (zJ) {
            if (((Number) function0.invoke()).intValue() - i2 > 0) {
                bpb1Var.m((Object) null, znj1Var);
            }
        } else if (!u890.j(coj1VarB3, znj1Var)) {
            eg.o();
        } else if (((Number) function0.invoke()).intValue() - i2 < 0) {
            bpb1Var.m((Object) null, aoj1Var);
        }
    }

    public final coj1 b() {
        return (coj1) this.f.getValue();
    }

    public final void c() {
        if (b() instanceof boj1) {
            this.f.m((Object) null, aoj1.a);
            this.e.invoke(wnj1.a);
        }
    }

    public final xe01 getState() {
        return this.h;
    }

    public final void reset() {
        this.f.m((Object) null, this.a);
        this.g = false;
    }
}
