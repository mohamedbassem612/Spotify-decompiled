package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class efm implements syq {
    public final /* synthetic */ byte a;
    public final d0r b;
    public final js20 c;
    public final Object d;
    public final Object e;
    public final f4r f;
    public final rqw g;
    public final rsw h;

    public efm(d0r d0rVar, Integer num, kl1 kl1Var, q8n q8nVar) {
        this.a = (byte) 0;
        this.b = d0rVar;
        this.d = num;
        this.e = kl1Var;
        this.f = w3p1.n(new l4r(new wlu(rc11.a.b(jo70.class)), 2, afm.b, new j4r(rbm.d1), afm.c), new l4r(jd0.z, 2, afm.d, new j4r(rbm.e1), afm.e), u2m.h);
        this.c = d1o1.o(new xem(this, (byte) 0), new h1m(this, (byte) 5), q8nVar, new xem(this, (byte) 1));
        this.g = new eih1();
        this.h = jch0.j(fdm.g);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0021 A[PHI: r6
      0x0021: PHI (r6v9 java.lang.String) = (r6v2 java.lang.String), (r6v4 java.lang.String) binds: [B:14:0x001f, B:19:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:35:0x005c  */
    public static cno f(cno cnoVar, kcz0 kcz0Var) {
        String str;
        boolean z;
        String str2;
        boolean z2 = cnoVar.d;
        boolean z3 = cnoVar.c;
        if (z2) {
            return cnoVar;
        }
        ano anoVar = cnoVar.b;
        o3r o3rVar = mcz0.a;
        String str3 = null;
        String str4 = kcz0Var != null ? kcz0Var.a : null;
        String str5 = str4 == null ? "" : str4;
        String str6 = anoVar.d;
        if (z3) {
            str = str6;
        } else {
            str6 = kcz0Var != null ? kcz0Var.b : null;
            if (str6 == null) {
                str = "";
            } else {
                str = str6;
            }
        }
        s27 s27Var = anoVar.e;
        boolean z4 = anoVar.i;
        if (kcz0Var != null) {
            str3 = kcz0Var.c;
            if (z4 && (str2 = kcz0Var.d) != null) {
                str3 = str2;
            }
        }
        s27 s27Var2 = new s27(new g07(str3, s27Var.a.b), s27Var.b, s27Var.c);
        if (anoVar.j && kcz0Var != null) {
            z = kcz0Var.e;
        }
        return new cno(cnoVar.a, new ano(anoVar.a, anoVar.b, str5, str, s27Var2, anoVar.f, anoVar.g, anoVar.h, z4, z, anoVar.k, anoVar.l, anoVar.m), z3, z2);
    }

    public final rqw a() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.g;
    }

    public final rsw c() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.h;
    }

    public final d0r e() {
        byte b = this.a;
        return this.b;
    }

    public final mqw getBehavior() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.c;
    }

    public final f4r getData() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.f;
    }

    public efm(d0r d0rVar, xfx xfxVar, m980 m980Var, q8n q8nVar) {
        this.a = (byte) 1;
        this.b = d0rVar;
        this.d = xfxVar;
        this.e = m980Var;
        this.f = new i4r(eno.b, mcz0.a);
        this.c = w3p1.q(new dno(this, (byte) 0), new qrk(this, (byte) 8), new sqk(this, (byte) 17), q8nVar, (iu30) null, 16);
        this.g = eth.a0((vu30) null, (xu30) null, 3);
        this.h = lnn1.g(eno.c, eno.d, new dno(this, (byte) 1));
    }
}
