package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class xes0 implements fka1 {
    public final gbc a;
    public final nac b;
    public ip51 c;
    public int d;
    public boolean e;
    public long f;

    public xes0(gbc gbcVar) {
        this.a = gbcVar;
        nac nacVarK = gbcVar.k();
        this.b = nacVarK;
        ip51 ip51Var = nacVarK.a;
        this.c = ip51Var;
        this.d = ip51Var != null ? ip51Var.b : -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001b, code lost:
    
        if (r3 == r5.b) goto L15;
     */
    @Override // p.fka1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long O0(p.nac r9, long r10) {
        /*
            r8 = this;
            r0 = 0
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 < 0) goto L62
            boolean r3 = r8.e
            if (r3 != 0) goto L5c
            p.ip51 r3 = r8.c
            p.nac r4 = r8.b
            if (r3 == 0) goto L24
            p.ip51 r5 = r4.a
            if (r3 != r5) goto L1e
            int r3 = r8.d
            r5.getClass()
            int r5 = r5.b
            if (r3 != r5) goto L1e
            goto L24
        L1e:
            java.lang.String r8 = "Peek source is invalid because upstream source was used"
            p.eg.m(r8)
            return r0
        L24:
            if (r2 != 0) goto L27
            return r0
        L27:
            long r0 = r8.f
            r2 = 1
            long r0 = r0 + r2
            p.gbc r2 = r8.a
            boolean r0 = r2.request(r0)
            if (r0 != 0) goto L37
            r8 = -1
            return r8
        L37:
            p.ip51 r0 = r8.c
            if (r0 != 0) goto L45
            p.ip51 r0 = r4.a
            if (r0 == 0) goto L45
            r8.c = r0
            int r0 = r0.b
            r8.d = r0
        L45:
            long r0 = r4.b
            long r2 = r8.f
            long r0 = r0 - r2
            long r6 = java.lang.Math.min(r10, r0)
            p.nac r2 = r8.b
            long r4 = r8.f
            r3 = r9
            r2.e(r3, r4, r6)
            long r9 = r8.f
            long r9 = r9 + r6
            r8.f = r9
            return r6
        L5c:
            java.lang.String r8 = "closed"
            p.eg.m(r8)
            return r0
        L62:
            java.lang.String r8 = "byteCount < 0: "
            java.lang.String r8 = p.l1d.l(r10, r8)
            p.hhg1.f(r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p.xes0.O0(p.nac, long):long");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.e = true;
    }

    @Override // p.fka1
    public final gve1 l() {
        return this.a.l();
    }
}
