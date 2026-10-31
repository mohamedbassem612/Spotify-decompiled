package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class uyk implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ yyk a;

    public uyk(yyk yykVar) {
        this.a = yykVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0064, code lost:
    
        if (r8.b(r7, r0) == r5) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.Object r7, p.r261 r8, p.onm r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof p.tyk
            if (r0 == 0) goto L13
            r0 = r9
            p.tyk r0 = (p.tyk) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            p.tyk r0 = new p.tyk
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.a
            int r1 = r0.b
            r2 = 2
            r3 = 1
            r4 = 0
            p.d9n r5 = p.d9n.a
            if (r1 == 0) goto L37
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2b
            p.hm5.M(r9)
            goto L67
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r6)
            return r4
        L31:
            p.r261 r8 = r0.d
            p.hm5.M(r9)
            goto L51
        L37:
            p.hm5.M(r9)
            p.dvk r7 = (p.dvk) r7
            r0.d = r8
            r0.b = r3
            p.yyk r6 = r6.a
            p.q8n r7 = r6.f
            p.byk r9 = new p.byk
            r1 = 0
            r9.<init>(r6, r4, r1)
            java.lang.Object r9 = p.fn31.Y(r7, r9, r0)
            if (r9 != r5) goto L51
            goto L66
        L51:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r6 = r9.booleanValue()
            p.swk r7 = new p.swk
            r7.<init>(r6)
            r0.d = r4
            r0.b = r2
            java.lang.Object r6 = r8.b(r7, r0)
            if (r6 != r5) goto L67
        L66:
            return r5
        L67:
            p.rih1 r6 = p.rih1.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p.uyk.a(java.lang.Object, p.r261, p.onm):java.lang.Object");
    }
}
