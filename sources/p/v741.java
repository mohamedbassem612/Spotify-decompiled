package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class v741 implements x310 {
    public final uw0 a;
    public final kly0 b;

    public v741(uw0 uw0Var, chp chpVar) {
        this.a = uw0Var;
        this.b = chpVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0052, code lost:
    
        if ("com.sec.android.app.launcher".equals(r3 != null ? r3.k : null) != false) goto L28;
     */
    @Override // p.x310
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(p.r9c r4) {
        /*
            r3 = this;
            p.m210 r3 = r4.b()
            r0 = 0
            if (r3 == 0) goto La
            java.lang.String r3 = r3.k
            goto Lb
        La:
            r3 = r0
        Lb:
            java.lang.String r1 = "com.samsung.android.honeyboard"
            boolean r1 = r1.equals(r3)
            r2 = 0
            if (r1 != 0) goto L59
            java.lang.String r1 = "com.samsung.android.icecone"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L1d
            goto L59
        L1d:
            boolean r3 = r4.l()
            if (r3 == 0) goto L30
            java.lang.String r3 = r4.e()
            java.lang.String r1 = "spotify_media_browser_root_samsung"
            boolean r3 = p.nhc1.Y(r3, r1, r2)
            if (r3 == 0) goto L30
            r2 = 1
        L30:
            if (r2 == 0) goto L59
            p.m210 r3 = r4.b()
            if (r3 == 0) goto L3b
            java.lang.String r3 = r3.k
            goto L3c
        L3b:
            r3 = r0
        L3c:
            java.lang.String r1 = "com.samsung.android.app.galaxyfinder"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L54
            p.m210 r3 = r4.b()
            if (r3 == 0) goto L4c
            java.lang.String r0 = r3.k
        L4c:
            java.lang.String r3 = "com.sec.android.app.launcher"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L59
        L54:
            boolean r3 = r4.j()
            return r3
        L59:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p.v741.a(p.r9c):boolean");
    }

    @Override // p.x310
    public final w310 b(r9c r9cVar) {
        boolean zK = r9cVar.k();
        uw0 uw0Var = this.a;
        if (!zK) {
            return uw0Var.n(1);
        }
        m210 m210VarB = r9cVar.b();
        if (!"com.sec.android.app.clockpackage".equals(m210VarB != null ? m210VarB.k : null)) {
            return uw0Var.n(2);
        }
        Object obj = this.b.get();
        obj.getClass();
        return (w310) obj;
    }
}
