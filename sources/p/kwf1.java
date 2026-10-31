package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class kwf1 implements yt11 {
    public static final o3r g;
    public final yt11 a;
    public final d0r b;
    public final s24 c;
    public final vb2 d;
    public final opv0 e;
    public final t740 f;

    static {
        l4r l4rVar = new l4r(pwc0.r, 3, xvf1.c1, new j4r(xvf1.Q0), xvf1.d1);
        hvm hvmVar = hvm.d;
        l4r l4rVar2 = new l4r(hvmVar, 3, xvf1.e1, new j4r(xvf1.R0), iwf1.b);
        l4r l4rVar3 = new l4r(hvmVar, 3, iwf1.c, new j4r(xvf1.S0), iwf1.d);
        hvm hvmVar2 = hvm.b;
        l4r l4rVar4 = new l4r(hvmVar2, 3, iwf1.e, new j4r(xvf1.T0), iwf1.f);
        ppa0 ppa0Var = lo70.c;
        l4r l4rVar5 = new l4r(hvmVar2, 3, iwf1.g, new k4r(xvf1.U0, ppa0Var), xvf1.X0);
        xvf1 xvf1Var = xvf1.V0;
        g = w3p1.i(l4rVar, l4rVar2, l4rVar3, l4rVar4, l4rVar5, new l4r(b2v.a, 3, xvf1.Y0, new j4r(xvf1Var), xvf1.Z0), new l4r(jd0.z, 3, xvf1.a1, new j4r(xvf1.W0), xvf1.b1), a4r.f);
    }

    public kwf1(yt11 yt11Var, d0r d0rVar, s24 s24Var, vb2 vb2Var, opv0 opv0Var, t740 t740Var) {
        this.a = yt11Var;
        this.b = d0rVar;
        this.c = s24Var;
        this.d = vb2Var;
        this.e = opv0Var;
        this.f = t740Var;
    }

    /* JADX WARN: Code duplicated, block: B:59:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:62:0x0100  */
    /* JADX WARN: Code duplicated, block: B:64:0x0107  */
    /* JADX WARN: Code duplicated, block: B:67:0x0110  */
    /* JADX WARN: Code duplicated, block: B:70:0x0121 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a3, code lost:
    
        if (r5 == r12) goto L69;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(p.unb1 r21, p.tv80 r22, p.onm r23) {
        /*
            Method dump skipped, instruction units count: 290
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.kwf1.a(p.unb1, p.tv80, p.onm):java.lang.Object");
    }

    public final s9d1 b() {
        return this.a.b();
    }

    public final Object c(unb1 unb1Var, tv80 tv80Var, onm onmVar) {
        return this.a.c(unb1Var, tv80Var, onmVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Enum d(String str, onm onmVar) {
        hwf1 hwf1Var;
        if (onmVar instanceof hwf1) {
            hwf1Var = (hwf1) onmVar;
            int i = hwf1Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                hwf1Var.d = i - Integer.MIN_VALUE;
            } else {
                hwf1Var = new hwf1(this, onmVar);
            }
        } else {
            hwf1Var = new hwf1(this, onmVar);
        }
        Object objJ = hwf1Var.b;
        int i2 = hwf1Var.d;
        try {
            if (i2 == 0) {
                hm5.M(objJ);
                this = x2p1.f(this.b, g, str);
                bpb1 bpb1Var = this.a().a;
                q1c1 q1c1Var = new q1c1(2, (lnm) null, (byte) 13);
                hwf1Var.a = this;
                hwf1Var.d = 1;
                objJ = b5p1.j(bpb1Var, q1c1Var, hwf1Var);
                d9n d9nVar = d9n.a;
                if (objJ == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                this = hwf1Var.a;
                hm5.M(objJ);
            }
            i1r i1rVar = (k1r) objJ;
            i1r i1rVar2 = i1rVar instanceof i1r ? i1rVar : null;
            k131 k131Var = i1rVar2 != null ? (k131) i1rVar2.a : null;
            j131 j131Var = k131Var instanceof j131 ? (j131) k131Var : null;
            ewt0 ewt0Var = j131Var != null ? j131Var.a : null;
            this.dispose();
            return ewt0Var;
        } catch (Throwable th) {
            this.dispose();
            throw th;
        }
    }
}
