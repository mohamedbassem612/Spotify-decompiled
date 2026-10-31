package p;

import com.spotify.casita.v1.resolved.ResolvedHome;
import com.spotify.extendedmetadata.proto.BatchedExtensionResponse;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class mp60 implements np60 {
    public final w62 a;
    public final yjq b;
    public final pv00 c;
    public final dp60 d;
    public final tp60 e;
    public final yqg f;
    public final lxg g;
    public final w62 h;
    public final kp00 i;
    public final w25 j;

    public mp60(w62 w62Var, w62 w62Var2, w25 w25Var, yqg yqgVar, lxg lxgVar, yjq yjqVar, kp00 kp00Var, pv00 pv00Var, dp60 dp60Var, tp60 tp60Var) {
        this.a = w62Var;
        this.b = yjqVar;
        this.c = pv00Var;
        this.d = dp60Var;
        this.e = tp60Var;
        this.f = yqgVar;
        this.g = lxgVar;
        this.h = w62Var2;
        this.i = kp00Var;
        this.j = w25Var;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0058, code lost:
    
        if (r0 == r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0076, code lost:
    
        if (r0 == r1) goto L26;
     */
    @Override // p.np60
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.String r14, boolean r15, java.lang.String r16, p.ice0 r17, p.onm r18) {
        /*
            r13 = this;
            r0 = r18
            boolean r1 = r0 instanceof p.jp60
            if (r1 == 0) goto L16
            r1 = r0
            p.jp60 r1 = (p.jp60) r1
            int r2 = r1.e
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L16
            int r2 = r2 - r3
            r1.e = r2
        L14:
            r10 = r1
            goto L1c
        L16:
            p.jp60 r1 = new p.jp60
            r1.<init>(r13, r0)
            goto L14
        L1c:
            java.lang.Object r0 = r10.c
            int r1 = r10.e
            r12 = 0
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L3f
            if (r1 == r3) goto L37
            if (r1 != r2) goto L31
            boolean r15 = r10.b
            java.lang.String r14 = r10.a
            p.hm5.M(r0)
            goto L79
        L31:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r13)
            return r12
        L37:
            boolean r15 = r10.b
            java.lang.String r14 = r10.a
            p.hm5.M(r0)
            goto L5b
        L3f:
            p.hm5.M(r0)
            p.ice0 r0 = p.ice0.a
            p.d9n r1 = p.d9n.a
            r4 = r17
            if (r4 != r0) goto L61
            r10.a = r14
            r10.b = r15
            r10.e = r3
            p.w62 r0 = r13.h
            r7 = r16
            java.lang.Object r0 = p.w62.f(r0, r14, r15, r7, r10)
            if (r0 != r1) goto L5b
            goto L78
        L5b:
            p.sy21 r0 = (p.sy21) r0
        L5d:
            r3 = r14
            r7 = r15
            r6 = r0
            goto L7c
        L61:
            r7 = r16
            r10.a = r14
            r10.b = r15
            r10.e = r2
            p.w62 r2 = r13.a
            r5 = 0
            r8 = 0
            r9 = 0
            r11 = 224(0xe0, float:3.14E-43)
            r3 = r14
            r6 = r15
            java.lang.Object r0 = p.c2e.a(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            if (r0 != r1) goto L79
        L78:
            return r1
        L79:
            p.sy21 r0 = (p.sy21) r0
            goto L5d
        L7c:
            java.lang.Object r14 = r6.b
            if (r14 == 0) goto L95
            r2 = r14
            com.spotify.casita.v1.resolved.ResolvedHome r2 = (com.spotify.casita.v1.resolved.ResolvedHome) r2
            com.spotify.casita.v1.resolved.ResponseInfo r14 = r2.r()
            p.yz21 r5 = p.qro1.v(r14, r7)
            p.pv00 r4 = r13.c
            p.kp00 r8 = r13.i
            r1 = r13
            p.l2e r13 = r1.f(r2, r3, r4, r5, r6, r7, r8)
            return r13
        L95:
            java.lang.String r13 = "ResolvedHome is null"
            p.hhg1.n(r13)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p.mp60.a(java.lang.String, boolean, java.lang.String, p.ice0, p.onm):java.lang.Object");
    }

    @Override // p.np60
    public final Object b(String str, boolean z, ice0 ice0Var, boolean z2, boolean z3, String str2, onm onmVar) {
        return tro1.w(this.e, kq60.X, new fp60(this, str, z, ice0Var, z2, z3, str2, null), onmVar);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    public final Object d(String str, boolean z, ice0 ice0Var, boolean z2, boolean z3, String str2, onm onmVar) {
        gp60 gp60Var;
        String str3;
        boolean z4;
        if (onmVar instanceof gp60) {
            gp60Var = (gp60) onmVar;
            int i = gp60Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                gp60Var.e = i - Integer.MIN_VALUE;
            } else {
                gp60Var = new gp60(this, onmVar);
            }
        } else {
            gp60Var = new gp60(this, onmVar);
        }
        gp60 gp60Var2 = gp60Var;
        Object objE = gp60Var2.c;
        int i2 = gp60Var2.e;
        if (i2 == 0) {
            hm5.M(objE);
            this.e.l(new lq60(!z));
            ip60 ip60Var = new ip60(this, str, ice0Var, z2, z, str2, null);
            gp60Var2.a = str;
            gp60Var2.b = z;
            gp60Var2.e = 1;
            objE = e(z3, ip60Var, gp60Var2);
            Object obj = d9n.a;
            if (objE == obj) {
                return obj;
            }
            str3 = str;
            z4 = z;
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            boolean z5 = gp60Var2.b;
            String str4 = gp60Var2.a;
            hm5.M(objE);
            z4 = z5;
            str3 = str4;
        }
        sy21 sy21Var = (sy21) objE;
        Object obj2 = sy21Var.b;
        if (obj2 == null) {
            hhg1.n("ResolvedHome is null");
            return null;
        }
        ResolvedHome resolvedHome = (ResolvedHome) obj2;
        BatchedExtensionResponse batchedExtensionResponseP = resolvedHome.p().p();
        if (batchedExtensionResponseP.p() > 0) {
            this.b.h(batchedExtensionResponseP);
        }
        return f(resolvedHome, str3, this.c, qro1.v(resolvedHome.r(), z4), sy21Var, z4, this.i);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(boolean z, ip60 ip60Var, onm onmVar) {
        kp60 kp60Var;
        if (onmVar instanceof kp60) {
            kp60Var = (kp60) onmVar;
            int i = kp60Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                kp60Var.d = i - Integer.MIN_VALUE;
            } else {
                kp60Var = new kp60(this, onmVar);
            }
        } else {
            kp60Var = new kp60(this, onmVar);
        }
        Object objInvoke = kp60Var.b;
        int i2 = kp60Var.d;
        lxg lxgVar = this.g;
        try {
            if (i2 == 0) {
                hm5.M(objInvoke);
                if (z) {
                    ((i94) lxgVar).e("preload");
                }
                kp60Var.a = z;
                kp60Var.d = 1;
                objInvoke = ip60Var.invoke(kp60Var);
                Object obj = d9n.a;
                if (objInvoke == obj) {
                    return obj;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z = kp60Var.a;
                hm5.M(objInvoke);
            }
            if (z) {
                ((i94) lxgVar).a("preload");
            }
            return objInvoke;
        } catch (Throwable th) {
            if (z) {
                ((i94) lxgVar).a("preload");
            }
            throw th;
        }
    }

    public final l2e f(ResolvedHome resolvedHome, String str, pv00 pv00Var, yz21 yz21Var, sy21 sy21Var, boolean z, kp00 kp00Var) {
        return (l2e) tro1.u(this.e, kq60.Y, new aq60(o0c.D(sy21Var, this.f) ? 1 : 2), new lp60(this, resolvedHome, str, pv00Var, yz21Var, sy21Var, z, kp00Var));
    }
}
