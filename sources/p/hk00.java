package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class hk00 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ ptf a;

    public hk00(ptf ptfVar) {
        this.a = ptfVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0063, code lost:
    
        if (r8.b(r9, r0) == r5) goto L21;
     */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.Object r7, p.r261 r8, p.onm r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof p.gk00
            if (r0 == 0) goto L13
            r0 = r9
            p.gk00 r0 = (p.gk00) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            p.gk00 r0 = new p.gk00
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
            goto L66
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r6)
            return r4
        L31:
            p.r261 r8 = r0.d
            p.hm5.M(r9)
            goto L5b
        L37:
            p.hm5.M(r9)
            com.spotify.home.evopage.mobius.Effect$CheckForceReload r7 = (com.spotify.home.evopage.mobius.Effect.CheckForceReload) r7
            r0.d = r8
            r0.b = r3
            com.spotify.home.evopage.mobius.Event$ForceReloadChecked r9 = new com.spotify.home.evopage.mobius.Event$ForceReloadChecked
            p.ptf r6 = r6.a
            p.dp60 r7 = r6.a
            p.dma1 r7 = r7.a
            p.bma1 r1 = p.dp60.b
            r3 = 0
            boolean r7 = r7.h(r1, r3)
            p.v6a0 r6 = r6.b
            p.ice0 r6 = r6.v(r3)
            r9.<init>(r7, r6)
            if (r9 != r5) goto L5b
            goto L65
        L5b:
            r0.d = r4
            r0.b = r2
            java.lang.Object r6 = r8.b(r9, r0)
            if (r6 != r5) goto L66
        L65:
            return r5
        L66:
            p.rih1 r6 = p.rih1.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p.hk00.a(java.lang.Object, p.r261, p.onm):java.lang.Object");
    }
}
