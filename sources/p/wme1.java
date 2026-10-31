package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class wme1 extends a8d1 implements vu30 {
    public byte a;
    public final /* synthetic */ ane1 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ xtb0 d;
    public final /* synthetic */ hdn0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wme1(ane1 ane1Var, boolean z, xtb0 xtb0Var, hdn0 hdn0Var, lnm lnmVar) {
        super(2, lnmVar);
        this.b = ane1Var;
        this.c = z;
        this.d = xtb0Var;
        this.e = hdn0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        return new wme1(this.b, this.c, this.d, this.e, lnmVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0085, code lost:
    
        if (r1.f(r10, 0, r9) == r7) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0096, code lost:
    
        if (r1.k(r10, 0, r9) == r7) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            p.ane1 r0 = r9.b
            p.h290 r1 = r0.a
            byte r2 = r9.a
            r3 = 3
            r4 = 2
            r5 = 1
            p.hdn0 r6 = r9.e
            p.d9n r7 = p.d9n.a
            if (r2 == 0) goto L26
            if (r2 == r5) goto L22
            if (r2 == r4) goto L1d
            if (r2 != r3) goto L16
            goto L1d
        L16:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r9)
            r9 = 0
            return r9
        L1d:
            p.hm5.M(r10)
            goto L99
        L22:
            p.hm5.M(r10)
            goto L5a
        L26:
            p.hm5.M(r10)
            r10 = r6
            p.err0 r10 = (p.err0) r10
            int r2 = r10.s()
            r0.f0p = r2
            p.ry71 r2 = r0.n
            int r8 = r10.s()
            java.lang.Object r8 = r1.get(r8)
            com.spotify.wrapped.v1.proto.SceneTemplate$TimeMachineContent$Card2$YearEntry r8 = (com.spotify.wrapped.v1.proto.SceneTemplate.TimeMachineContent.Card2.YearEntry) r8
            java.lang.String r8 = r8.u()
            r2.invoke(r8)
            p.ohm1 r2 = r0.f
            int r10 = r10.s()
            java.lang.String r10 = java.lang.String.valueOf(r10)
            r9.a = r5
            java.lang.String r5 = "time_machine_last_viewed_year_index"
            java.lang.Object r10 = r2.d(r5, r10, r9)
            if (r10 != r7) goto L5a
            goto L98
        L5a:
            boolean r10 = r9.c
            if (r10 == 0) goto L70
            r10 = r6
            p.err0 r10 = (p.err0) r10
            int r10 = r10.s()
            java.lang.Object r10 = r1.get(r10)
            com.spotify.wrapped.v1.proto.SceneTemplate$TimeMachineContent$Card2$YearEntry r10 = (com.spotify.wrapped.v1.proto.SceneTemplate.TimeMachineContent.Card2.YearEntry) r10
            p.xgm1 r1 = r0.e
            p.ine1.e(r10, r1)
        L70:
            boolean r10 = r0.g
            r0 = 0
            p.xtb0 r1 = r9.d
            if (r10 == 0) goto L88
            p.err0 r6 = (p.err0) r6
            int r10 = r6.s()
            r9.a = r4
            p.df41 r2 = p.xtb0.y
            java.lang.Object r9 = r1.f(r10, r0, r9)
            if (r9 != r7) goto L99
            goto L98
        L88:
            p.err0 r6 = (p.err0) r6
            int r10 = r6.s()
            r9.a = r3
            p.df41 r2 = p.xtb0.y
            java.lang.Object r9 = r1.k(r10, r0, r9)
            if (r9 != r7) goto L99
        L98:
            return r7
        L99:
            p.rih1 r9 = p.rih1.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p.wme1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
