package p;

import com.spotify.base.java.logging.Logger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class c1d0 {
    public final dg30 a;
    public final tc31 b;
    public final iyc0 c;
    public final eea0 d;
    public final kt91 e;
    public final op31 f;
    public final nw40 g;

    public c1d0(dg30 dg30Var, tc31 tc31Var, iyc0 iyc0Var, eea0 eea0Var, kt91 kt91Var, op31 op31Var, nw40 nw40Var) {
        this.a = dg30Var;
        this.b = tc31Var;
        this.c = iyc0Var;
        this.d = eea0Var;
        this.e = kt91Var;
        this.f = op31Var;
        this.g = nw40Var;
    }

    public final jhm a(String str, wls0 wls0Var) {
        return new jhm("list_toggle_private", (hux) (wls0Var.a() ? orx.c : pox.c), (fhm) null, Integer.valueOf(wls0Var.a() ? 2131960084 : 2131960083), (String) null, false, (tm81) null, new ihm(new ygm(2), new ghm(puc0.b1, new vq80(wls0Var, str, (byte) 28)), new lb50(this, wls0Var, str, (byte) 16)), 244);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0068  */
    /* JADX WARN: Code duplicated, block: B:33:0x006b  */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object b(int i, String str, d1d0 d1d0Var, onm onmVar) {
        z0d0 z0d0Var;
        d1d0 d1d0Var2;
        d1d0 d1d0Var3;
        String str2;
        if (onmVar instanceof z0d0) {
            z0d0Var = (z0d0) onmVar;
            int i2 = z0d0Var.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                z0d0Var.d = i2 - Integer.MIN_VALUE;
            } else {
                z0d0Var = new z0d0(this, onmVar);
            }
        } else {
            z0d0Var = new z0d0(this, onmVar);
        }
        z0d0 z0d0Var2 = z0d0Var;
        Object objB = z0d0Var2.b;
        int i3 = z0d0Var2.d;
        if (i3 == 0) {
            hm5.M(objB);
            l24 l24Var = new l24((Object) this, (Object) str, (Object) d1d0Var, (lnm) null, (byte) 11);
            try {
                tc31 tc31Var = this.b;
                lb50 lb50Var = new lb50(this, d1d0Var, str, (byte) 17);
                z0d0Var2.a = d1d0Var;
                z0d0Var2.d = 1;
                objB = tc31Var.b(i, l24Var, lb50Var, n521.R0, z0d0Var2);
                d9n d9nVar = d9n.a;
                if (objB == d9nVar) {
                    return d9nVar;
                }
                d1d0Var3 = d1d0Var;
            } catch (IllegalStateException e) {
                e = e;
                d1d0Var2 = d1d0Var;
                if (d1d0Var2 == d1d0.a) {
                    str2 = "public";
                } else {
                    str2 = "private";
                }
                Logger.e(e, "MakePrivateItem: Failed to set list to ".concat(str2), new Object[0]);
            }
        } else {
            if (i3 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            d1d0Var3 = z0d0Var2.a;
            try {
                hm5.M(objB);
            } catch (IllegalStateException e2) {
                e = e2;
                d1d0Var2 = d1d0Var3;
                if (d1d0Var2 == d1d0.a) {
                    str2 = "public";
                } else {
                    str2 = "private";
                }
                Logger.e(e, "MakePrivateItem: Failed to set list to ".concat(str2), new Object[0]);
            }
        }
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0079, code lost:
    
        if (r10 == r5) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(java.lang.String r9, p.onm r10, boolean r11) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof p.b1d0
            if (r0 == 0) goto L13
            r0 = r10
            p.b1d0 r0 = (p.b1d0) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            p.b1d0 r0 = new p.b1d0
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.c
            int r1 = r0.e
            r2 = 0
            r3 = 2
            r4 = 1
            p.d9n r5 = p.d9n.a
            if (r1 == 0) goto L39
            if (r1 == r4) goto L31
            if (r1 != r3) goto L2b
            p.hm5.M(r10)
            goto L7c
        L2b:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r8)
            return r2
        L31:
            boolean r11 = r0.b
            java.lang.String r9 = r0.a
            p.hm5.M(r10)
            goto L5f
        L39:
            p.hm5.M(r10)
            java.util.List r10 = java.util.Collections.singletonList(r9)
            if (r11 == 0) goto L45
            p.wls0 r1 = p.wls0.c
            goto L47
        L45:
            p.wls0 r1 = p.wls0.d
        L47:
            java.lang.Integer r6 = new java.lang.Integer
            r7 = 3500(0xdac, float:4.905E-42)
            r6.<init>(r7)
            r0.a = r9
            r0.b = r11
            r0.e = r4
            p.iyc0 r4 = r8.c
            p.xyc0 r4 = (p.xyc0) r4
            java.lang.Object r10 = r4.o(r10, r1, r6, r0)
            if (r10 != r5) goto L5f
            goto L7b
        L5f:
            p.py21 r10 = (p.py21) r10
            r10.d()
            if (r11 == 0) goto L81
            java.util.List r9 = java.util.Collections.singletonList(r9)
            r0.a = r2
            r0.b = r11
            r0.e = r3
            p.op31 r8 = r8.f
            p.pp31 r8 = (p.pp31) r8
            r10 = 0
            java.lang.Object r10 = r8.d(r9, r10, r0)
            if (r10 != r5) goto L7c
        L7b:
            return r5
        L7c:
            p.py21 r10 = (p.py21) r10
            r10.d()
        L81:
            p.rih1 r8 = p.rih1.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p.c1d0.c(java.lang.String, p.onm, boolean):java.lang.Object");
    }
}
