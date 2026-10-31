package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class oa11 implements tyq {
    public final psw Y;
    public final d0r a;
    public final pe b;
    public final joe c;
    public final tra0 d;
    public final a1r0 e;
    public final yo2 f;
    public final w9u0 g;
    public final bpb1 h = gio1.b(new i6w0(null, 7));
    public final o3r i = ja11.a;
    public final js20 t = x3p1.n(new ma11(this, (byte) 0), a411.b1, h211.g, (o8n) null, new ma11(this, (byte) 1), 8);
    public final ia00 X = n3o1.q(this).a(rw01.N0, rw01.O0);

    public oa11(d0r d0rVar, pe peVar, joe joeVar, tra0 tra0Var, tau0 tau0Var, a1r0 a1r0Var, yo2 yo2Var) {
        this.a = d0rVar;
        this.b = peVar;
        this.c = joeVar;
        this.d = tra0Var;
        this.e = a1r0Var;
        this.f = yo2Var;
        this.g = tau0Var.a();
        j2i j2iVar = new j2i(427324051, new dr01(this, (byte) 13), true);
        ien0 ien0Var = qsw.a;
        this.Y = new psw(j2iVar, (byte) 0);
    }

    public final rqw a() {
        return this.X;
    }

    public final jsw c() {
        return this.Y;
    }

    public final d0r e() {
        return this.a;
    }

    public final void f() {
        bpb1 bpb1Var;
        Object value;
        do {
            bpb1Var = this.h;
            value = bpb1Var.getValue();
        } while (!bpb1Var.k(value, i6w0.a((i6w0) value, false, false, 1)));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(String str, onm onmVar) {
        na11 na11Var;
        Object value;
        i6w0 i6w0VarA;
        Object value2;
        i6w0 i6w0VarA2;
        if (onmVar instanceof na11) {
            na11Var = (na11) onmVar;
            int i = na11Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                na11Var.d = i - Integer.MIN_VALUE;
            } else {
                na11Var = new na11(this, onmVar);
            }
        } else {
            na11Var = new na11(this, onmVar);
        }
        Object objA = na11Var.b;
        int i2 = na11Var.d;
        bpb1 bpb1Var = this.h;
        rih1 rih1Var = rih1.a;
        if (i2 == 0) {
            hm5.M(objA);
            if (u890.j(((i6w0) bpb1Var.getValue()).a, str)) {
                if (this.b.e()) {
                    f();
                    a1r0.j(this.e, nik1.w6.a, (String) null, pzm.g("martini-open-with-keyboard", true), false, 10);
                    return rih1Var;
                }
                do {
                    value = bpb1Var.getValue();
                    i6w0VarA = (i6w0) value;
                    if (u890.j(i6w0VarA.a, str)) {
                        i6w0VarA = i6w0.a(i6w0VarA, false, true, 3);
                    }
                } while (!bpb1Var.k(value, i6w0VarA));
                if (u890.j(i6w0VarA.a, str) && i6w0VarA.c) {
                    na11Var.a = str;
                    na11Var.d = 1;
                    objA = this.c.a((String) null, na11Var);
                    d9n d9nVar = d9n.a;
                    if (objA == d9nVar) {
                        return d9nVar;
                    }
                }
            }
            return rih1Var;
        }
        if (i2 != 1) {
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        str = na11Var.a;
        hm5.M(objA);
        boolean z = objA instanceof loe;
        if (!z) {
            fq2 fq2Var = this.f;
            if (fq2Var.s.a.getValue() instanceof hre) {
                fq2Var.i();
            }
        }
        do {
            value2 = bpb1Var.getValue();
            i6w0VarA2 = (i6w0) value2;
            if (u890.j(i6w0VarA2.a, str) && i6w0VarA2.c) {
                i6w0VarA2 = i6w0.a(i6w0VarA2, i6w0VarA2.b || !z, false, 1);
            }
        } while (!bpb1Var.k(value2, i6w0VarA2));
        return rih1Var;
    }

    public final mqw getBehavior() {
        return this.t;
    }

    public final f4r getData() {
        return this.i;
    }

    public final void h(String str, boolean z) {
        bpb1 bpb1Var;
        Object value;
        i6w0 i6w0Var;
        do {
            bpb1Var = this.h;
            value = bpb1Var.getValue();
            i6w0Var = (i6w0) value;
            if (z || !u890.j(i6w0Var.a, str)) {
                i6w0Var = new i6w0(str, 6);
            }
        } while (!bpb1Var.k(value, i6w0Var));
    }
}
