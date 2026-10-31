package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class kmm0 {
    public static final long c;
    public final emm0 a;
    public final zjf1 b;

    static {
        ytw0 ytw0Var = jfv.b;
        c = fdg1.k0(10, ngv.e);
    }

    public kmm0(emm0 emm0Var, zjf1 zjf1Var) {
        this.a = emm0Var;
        this.b = zjf1Var;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0089  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a6, code lost:
    
        if (r10 == r8) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(p.onm r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof p.jmm0
            if (r0 == 0) goto L13
            r0 = r10
            p.jmm0 r0 = (p.jmm0) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            p.jmm0 r0 = new p.jmm0
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.a
            int r1 = r0.c
            p.lmm0 r2 = p.lmm0.a
            long r3 = p.kmm0.c
            r5 = 2
            r6 = 1
            r7 = 0
            p.d9n r8 = p.d9n.a
            if (r1 == 0) goto L3d
            if (r1 == r6) goto L36
            if (r1 != r5) goto L30
            p.hm5.M(r10)
            goto La9
        L30:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r9)
            return r7
        L36:
            p.hm5.M(r10)     // Catch: java.lang.Exception -> L3a
            goto L50
        L3a:
            r9 = move-exception
            goto Lb7
        L3d:
            p.hm5.M(r10)
            p.uug0 r10 = new p.uug0     // Catch: java.lang.Exception -> L3a
            r1 = 14
            r10.<init>(r9, r7, r1)     // Catch: java.lang.Exception -> L3a
            r0.c = r6     // Catch: java.lang.Exception -> L3a
            java.lang.Object r10 = p.rc2.P(r3, r10, r0)     // Catch: java.lang.Exception -> L3a
            if (r10 != r8) goto L50
            goto La8
        L50:
            com.spotify.songdna.searchcontent.mostplayed.Chart r10 = (com.spotify.songdna.searchcontent.mostplayed.Chart) r10     // Catch: java.lang.Exception -> L3a
            if (r10 != 0) goto L63
            p.jfv r9 = new p.jfv
            r9.<init>(r3)
            java.lang.Object[] r9 = new java.lang.Object[]{r9}
            java.lang.String r10 = "SongDNA search: most played did not answer within %s."
            com.spotify.base.java.logging.Logger.k(r10, r9)
            return r2
        L63:
            p.h290 r10 = r10.n()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r10 = r10.iterator()
        L70:
            boolean r2 = r10.hasNext()
            if (r2 == 0) goto L9e
            java.lang.Object r2 = r10.next()
            com.spotify.songdna.searchcontent.mostplayed.ChartEntry r2 = (com.spotify.songdna.searchcontent.mostplayed.ChartEntry) r2
            r2.getClass()
            com.spotify.songdna.searchcontent.mostplayed.Decoration r3 = r2.n()
            boolean r3 = r3.o()
            if (r3 != 0) goto L8b
        L89:
            r2 = r7
            goto L98
        L8b:
            java.lang.String r2 = r2.getUri()
            r2.getClass()
            boolean r3 = p.ihc1.y0(r2)
            if (r3 != 0) goto L89
        L98:
            if (r2 == 0) goto L70
            r1.add(r2)
            goto L70
        L9e:
            r0.c = r5
            p.zjf1 r9 = r9.b
            java.lang.Object r10 = r9.a(r1, r0)
            if (r10 != r8) goto La9
        La8:
            return r8
        La9:
            java.util.List r10 = (java.util.List) r10
            p.mmm0 r9 = new p.mmm0
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.List r10 = p.o7h.j0(r10)
            r9.<init>(r10)
            return r9
        Lb7:
            p.o8n r10 = r0.getContext()
            p.op71.x(r10)
            r10 = 0
            java.lang.Object[] r10 = new java.lang.Object[r10]
            java.lang.String r0 = "SongDNA search: the most played request failed."
            com.spotify.base.java.logging.Logger.l(r9, r0, r10)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p.kmm0.a(p.onm):java.lang.Object");
    }
}
