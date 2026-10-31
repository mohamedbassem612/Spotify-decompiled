package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class j0u0 implements i0u0, a4l {
    public final dfs a;

    public j0u0(dfs dfsVar) {
        this.a = dfsVar;
    }

    @Override // p.a4l
    public final void a() {
        this.a.b.remove(this);
    }

    @Override // p.a4l
    public final void b() {
        this.a.b.add(this);
    }

    @Override // p.i0u0
    public final String c() {
        return "PlaybackGrabbingExceptionDefault";
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004e, code lost:
    
        if (r6 == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x009b, code lost:
    
        if (r1 != false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x009f, code lost:
    
        return p.l650.a;
     */
    @Override // p.i0u0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p.l650 d(p.k650 r6) throws kotlin.NoWhenBranchMatchedException {
        /*
            r5 = this;
            boolean r5 = r6 instanceof p.xi5
            p.f0u[] r0 = p.w0o1.a
            r1 = 1
            r2 = 0
            if (r5 == 0) goto L51
            p.xi5 r6 = (p.xi5) r6
            p.l0l r5 = r6.c()
            boolean r5 = r5.l()
            p.l0l r3 = r6.c()
            p.f0u r4 = r3.getType()
            boolean r0 = p.f46.M(r0, r4)
            if (r0 != 0) goto L29
            boolean r0 = r3.z()
            if (r0 == 0) goto L27
            goto L29
        L27:
            r0 = r2
            goto L2a
        L29:
            r0 = r1
        L2a:
            boolean r3 = r6.d()
            if (r3 != 0) goto L44
            p.kx7 r3 = r6.b()
            if (r3 == 0) goto L43
            p.kx7 r3 = r6.b()
            if (r3 == 0) goto L43
            boolean r3 = r3.b()
            if (r3 != 0) goto L43
            goto L44
        L43:
            r1 = r2
        L44:
            boolean r6 = r6.e()
            if (r5 != 0) goto La0
            if (r0 == 0) goto La0
            if (r1 == 0) goto La0
            if (r6 != 0) goto La0
            goto L9d
        L51:
            boolean r5 = r6 instanceof p.sa0
            if (r5 == 0) goto La3
            p.sa0 r6 = (p.sa0) r6
            p.l0l r5 = r6.c()
            boolean r5 = r5.l()
            p.l0l r3 = r6.c()
            p.f0u r4 = r3.getType()
            boolean r0 = p.f46.M(r0, r4)
            if (r0 != 0) goto L76
            boolean r0 = r3.z()
            if (r0 == 0) goto L74
            goto L76
        L74:
            r0 = r2
            goto L77
        L76:
            r0 = r1
        L77:
            boolean r3 = r6.d()
            if (r3 != 0) goto L91
            p.kx7 r3 = r6.b()
            if (r3 == 0) goto L90
            p.kx7 r3 = r6.b()
            if (r3 == 0) goto L90
            boolean r3 = r3.b()
            if (r3 != 0) goto L90
            goto L91
        L90:
            r1 = r2
        L91:
            if (r5 != 0) goto La0
            boolean r5 = r6.e()
            if (r5 == 0) goto La0
            if (r0 == 0) goto La0
            if (r1 == 0) goto La0
        L9d:
            p.l650 r5 = p.l650.a
            return r5
        La0:
            p.l650 r5 = p.l650.c
            return r5
        La3:
            p.eg.o()
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p.j0u0.d(p.k650):p.l650");
    }
}
