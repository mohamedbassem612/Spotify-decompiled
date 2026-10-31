package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class uht0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ vht0 a;

    public uht0(vht0 vht0Var) {
        this.a = vht0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0079, code lost:
    
        if (r8.b(r7, r0) == r5) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.Object r7, p.r261 r8, p.onm r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof p.tht0
            if (r0 == 0) goto L13
            r0 = r9
            p.tht0 r0 = (p.tht0) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            p.tht0 r0 = new p.tht0
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.a
            int r1 = r0.b
            r2 = 2
            r3 = 1
            r4 = 0
            p.d9n r5 = p.d9n.a
            if (r1 == 0) goto L3b
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2b
            p.hm5.M(r9)
            goto L7c
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r6)
            return r4
        L31:
            p.r261 r8 = r0.d
            p.hm5.M(r9)
            p.e331 r9 = (p.e331) r9
            java.lang.Object r6 = r9.a
            goto L55
        L3b:
            p.hm5.M(r9)
            p.cht0 r7 = (p.cht0) r7
            p.vht0 r6 = r6.a
            p.i6n0 r6 = r6.a
            java.lang.String r9 = r7.a
            java.lang.String r1 = r7.b
            java.util.ArrayList r7 = r7.c
            r0.d = r8
            r0.b = r3
            java.lang.Object r6 = r6.a(r9, r1, r7, r0)
            if (r6 != r5) goto L55
            goto L7b
        L55:
            java.lang.Throwable r7 = p.e331.a(r6)
            if (r7 != 0) goto L6a
            p.hhz0 r6 = (p.hhz0) r6
            p.fjt0 r7 = new p.fjt0
            p.ghz0 r9 = new p.ghz0
            java.lang.String r6 = r6.a
            r9.<init>(r6)
            r7.<init>(r9)
            goto L71
        L6a:
            p.fjt0 r7 = new p.fjt0
            p.fhz0 r6 = p.fhz0.c
            r7.<init>(r6)
        L71:
            r0.d = r4
            r0.b = r2
            java.lang.Object r6 = r8.b(r7, r0)
            if (r6 != r5) goto L7c
        L7b:
            return r5
        L7c:
            p.rih1 r6 = p.rih1.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p.uht0.a(java.lang.Object, p.r261, p.onm):java.lang.Object");
    }
}
