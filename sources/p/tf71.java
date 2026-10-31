package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class tf71 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ j2e0 a;

    public tf71(j2e0 j2e0Var) {
        this.a = j2e0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x009d, code lost:
    
        if (r8.b(r9, r0) == r5) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.Object r7, p.r261 r8, p.onm r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof p.sf71
            if (r0 == 0) goto L13
            r0 = r9
            p.sf71 r0 = (p.sf71) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            p.sf71 r0 = new p.sf71
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.a
            int r1 = r0.b
            r2 = 1
            r3 = 2
            r4 = 0
            p.d9n r5 = p.d9n.a
            if (r1 == 0) goto L38
            if (r1 == r2) goto L32
            if (r1 != r3) goto L2c
            p.hm5.M(r9)
            goto La0
        L2c:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r6)
            return r4
        L32:
            p.r261 r8 = r0.d
            p.hm5.M(r9)
            goto L95
        L38:
            p.hm5.M(r9)
            p.eh71 r7 = (p.eh71) r7
            r0.d = r8
            r0.b = r2
            p.zg71 r9 = r7.c
            p.hl71 r9 = r9.a
            boolean r1 = r9 instanceof p.el71
            if (r1 == 0) goto L5c
            p.ng71 r6 = new p.ng71
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r9 = "Share sheet already in an error state. Cannot load from that."
            r7.<init>(r9)
            p.m231 r9 = new p.m231
            r9.<init>(r7)
            r6.<init>(r9, r4)
        L5a:
            r9 = r6
            goto L92
        L5c:
            boolean r1 = r9 instanceof p.fl71
            if (r1 == 0) goto L72
            p.ng71 r6 = new p.ng71
            p.c380 r9 = r9.a()
            p.c9 r9 = p.mqo1.F(r9)
            p.zg71 r7 = r7.c
            p.z771 r7 = r7.h
            r6.<init>(r9, r7)
            goto L5a
        L72:
            p.gl71 r1 = p.gl71.a
            boolean r9 = p.u890.j(r9, r1)
            if (r9 == 0) goto La3
            p.j2e0 r6 = r6.a
            java.lang.Object r9 = r6.c
            p.ol71 r9 = (p.ol71) r9
            p.v4e0 r1 = new p.v4e0
            r2 = 0
            r1.<init>(r6, r7, r4, r2)
            java.lang.String r6 = "sharing.share_formats_loading"
            java.lang.Object r6 = r9.a(r6, r4, r1, r0)
            if (r6 != r5) goto L8f
            goto L5a
        L8f:
            p.tg71 r6 = (p.tg71) r6
            goto L5a
        L92:
            if (r9 != r5) goto L95
            goto L9f
        L95:
            r0.d = r4
            r0.b = r3
            java.lang.Object r6 = r8.b(r9, r0)
            if (r6 != r5) goto La0
        L9f:
            return r5
        La0:
            p.rih1 r6 = p.rih1.a
            return r6
        La3:
            p.eg.o()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p.tf71.a(java.lang.Object, p.r261, p.onm):java.lang.Object");
    }
}
