package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class t7f1 implements a3k {
    public final /* synthetic */ byte a;
    public final gw70 b;
    public final pe c;
    public final tjs0 d;
    public final ti31 e;
    public final kj31 f;
    public final cxc g;

    public /* synthetic */ t7f1(gw70 gw70Var, pe peVar, tjs0 tjs0Var, ti31 ti31Var, kj31 kj31Var, cxc cxcVar, byte b) {
        this.a = b;
        this.b = gw70Var;
        this.c = peVar;
        this.d = tjs0Var;
        this.e = ti31Var;
        this.f = kj31Var;
        this.g = cxcVar;
    }

    public final Object a(Object obj, onm onmVar) {
        switch (this.a) {
            case 0:
                return b((g7m1) obj, onmVar);
            default:
                return smo1.s(new bfb1((g7m1) obj, this, (lnm) null, (byte) 17), onmVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00bc, code lost:
    
        if (r15 == r12) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object b(p.g7m1 r14, p.lnm r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof p.r7f1
            if (r0 == 0) goto L14
            r0 = r15
            p.r7f1 r0 = (p.r7f1) r0
            int r1 = r0.g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.g = r1
        L12:
            r8 = r0
            goto L1c
        L14:
            p.r7f1 r0 = new p.r7f1
            p.onm r15 = (p.onm) r15
            r0.<init>(r13, r15)
            goto L12
        L1c:
            java.lang.Object r15 = r8.e
            int r0 = r8.g
            r10 = 3
            r1 = 2
            r2 = 1
            r11 = 0
            p.d9n r12 = p.d9n.a
            if (r0 == 0) goto L4f
            if (r0 == r2) goto L45
            if (r0 == r1) goto L39
            if (r0 != r10) goto L33
            p.hm5.M(r15)
            goto Lbf
        L33:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r13)
            return r11
        L39:
            int r14 = r8.d
            p.yj41 r0 = r8.c
            com.spotify.wrapped.v1.proto.SceneTemplate$TopAlbumsContent$Single r1 = r8.b
            p.hm5.M(r15)
            r2 = r0
            r4 = r1
            goto La1
        L45:
            int r14 = r8.d
            com.spotify.wrapped.v1.proto.SceneTemplate$TopAlbumsContent$Single r0 = r8.b
            p.g7m1 r2 = r8.a
            p.hm5.M(r15)
            goto L7c
        L4f:
            p.hm5.M(r15)
            com.spotify.wrapped.v1.proto.StoryCard r15 = r14.a
            com.spotify.wrapped.v1.proto.Bespoke2026Content r15 = r15.q()
            com.spotify.wrapped.v1.proto.SceneTemplate$TopAlbumsContent$Single r15 = r15.E()
            p.bju r0 = r14.b
            p.ob01 r3 = new p.ob01
            r4 = 19
            r3.<init>(r15, r13, r11, r4)
            r8.a = r14
            r8.b = r15
            r4 = 0
            r8.d = r4
            r8.g = r2
            java.lang.String r2 = "single_album"
            java.lang.Object r0 = r0.e(r2, r3, r8)
            if (r0 != r12) goto L77
            goto Lbe
        L77:
            r2 = r0
            r0 = r15
            r15 = r2
            r2 = r14
            r14 = r4
        L7c:
            p.yj41 r15 = (p.yj41) r15
            r3 = r1
            com.spotify.wrapped.v1.proto.RiveAnimation r1 = r0.q()
            r8.a = r11
            r8.b = r0
            r8.c = r15
            r8.d = r14
            r8.g = r3
            p.ti31 r3 = r13.e
            p.kj31 r4 = r13.f
            p.cxc r5 = r13.g
            r6 = 0
            r7 = 0
            r9 = 224(0xe0, float:3.14E-43)
            java.lang.Object r1 = p.u3k.d(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            if (r1 != r12) goto L9e
            goto Lbe
        L9e:
            r2 = r15
            r4 = r0
            r15 = r1
        La1:
            r1 = r15
            p.qj41 r1 = (p.qj41) r1
            p.ke6 r0 = new p.ke6
            r5 = 0
            r6 = 3
            r3 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r8.a = r11
            r8.b = r11
            r8.c = r11
            r8.d = r14
            r8.g = r10
            p.u3k r13 = p.u3k.a
            java.lang.Object r15 = r13.a(r0, r8)
            if (r15 != r12) goto Lbf
        Lbe:
            return r12
        Lbf:
            p.wj41 r15 = (p.wj41) r15
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: p.t7f1.b(p.g7m1, p.lnm):java.lang.Object");
    }
}
