package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class gcc0 extends a8d1 implements vu30 {
    public byte a;
    public final /* synthetic */ icc0 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gcc0(icc0 icc0Var, int i, int i2, lnm lnmVar) {
        super(2, lnmVar);
        this.b = icc0Var;
        this.c = i;
        this.d = i2;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        return new gcc0(this.b, this.c, this.d, lnmVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00a1, code lost:
    
        if (r0 == r5) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            byte r1 = r0.a
            p.icc0 r2 = r0.b
            r3 = 2
            r4 = 1
            p.d9n r5 = p.d9n.a
            if (r1 == 0) goto L24
            if (r1 == r4) goto L1e
            if (r1 != r3) goto L17
            p.hm5.M(r18)
            r0 = r18
            goto La4
        L17:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r0)
            r0 = 0
            return r0
        L1e:
            p.hm5.M(r18)
            r1 = r18
            goto L38
        L24:
            p.hm5.M(r18)
            p.b7n r1 = r2.c
            p.s6n r6 = p.s6n.a
            p.mr20 r1 = r1.a(r6)
            r0.a = r4
            java.lang.Object r1 = p.b5p1.i(r1, r0)
            if (r1 != r5) goto L38
            goto La3
        L38:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            p.xrc0 r2 = r2.d
            p.iqz0 r12 = new p.iqz0
            int r6 = r0.c
            int r7 = r0.d
            r12.<init>(r6, r7)
            p.xj61 r6 = new p.xj61
            r6.<init>()
            p.sqc0 r7 = p.sqc0.a
            r6.add(r7)
            p.xqc0 r7 = p.xqc0.a
            r6.add(r7)
            if (r1 != 0) goto L5f
            p.yqc0 r1 = p.yqc0.a
            r6.add(r1)
        L5f:
            p.xj61 r9 = p.cwl1.j(r6)
            p.hru0 r1 = com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy.s()
            p.iou0 r6 = com.spotify.playlist.policy.proto.PlaylistItemDecorationPolicy.v()
            r6.D(r4)
            r1.v(r6)
            p.vwu0 r6 = com.spotify.playlist.policy.proto.PlaylistTrackDecorationPolicy.r()
            com.spotify.cosmos.util.policy.proto.TrackDecorationPolicy$Builder r7 = com.spotify.cosmos.util.policy.proto.TrackDecorationPolicy.newBuilder()
            com.spotify.cosmos.util.policy.proto.TrackDecorationPolicy$Builder r4 = r7.setPlayable(r4)
            r6.C(r4)
            r1.z(r6)
            com.google.protobuf.h r1 = r1.build()
            r7 = r1
            com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy r7 = (com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy) r7
            p.trc0 r6 = new p.trc0
            r15 = 0
            r16 = 474(0x1da, float:6.64E-43)
            r8 = 0
            r10 = 0
            r11 = 0
            r13 = 0
            r14 = 0
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r0.a = r3
            p.rsc0 r2 = (p.rsc0) r2
            java.lang.String r1 = "spotify:playlist:37i9dQZF1F5p3rmiWPIYgZ"
            java.lang.Object r0 = r2.f(r1, r6, r0)
            if (r0 != r5) goto La4
        La3:
            return r5
        La4:
            p.py21 r0 = (p.py21) r0
            java.lang.Object r0 = r0.d()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p.gcc0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
