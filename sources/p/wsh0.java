package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class wsh0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ xsh0 a;

    public wsh0(xsh0 xsh0Var) {
        this.a = xsh0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005a, code lost:
    
        if (r9.b(r10, r0) == r5) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.Object r8, p.r261 r9, p.onm r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof p.vsh0
            if (r0 == 0) goto L13
            r0 = r10
            p.vsh0 r0 = (p.vsh0) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            p.vsh0 r0 = new p.vsh0
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.a
            int r1 = r0.b
            r2 = 2
            r3 = 1
            r4 = 0
            p.d9n r5 = p.d9n.a
            if (r1 == 0) goto L37
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2b
            p.hm5.M(r10)
            goto L5d
        L2b:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r7)
            return r4
        L31:
            p.r261 r9 = r0.d
            p.hm5.M(r10)
            goto L52
        L37:
            p.hm5.M(r10)
            p.jrh0 r8 = (p.jrh0) r8
            p.xsh0 r7 = r7.a
            p.q8n r10 = r7.b
            p.tfe0 r1 = new p.tfe0
            r6 = 23
            r1.<init>(r7, r8, r4, r6)
            r0.d = r9
            r0.b = r3
            java.lang.Object r10 = p.fn31.Y(r10, r1, r0)
            if (r10 != r5) goto L52
            goto L5c
        L52:
            r0.d = r4
            r0.b = r2
            java.lang.Object r7 = r9.b(r10, r0)
            if (r7 != r5) goto L5d
        L5c:
            return r5
        L5d:
            p.rih1 r7 = p.rih1.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p.wsh0.a(java.lang.Object, p.r261, p.onm):java.lang.Object");
    }
}
