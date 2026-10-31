package p;

import com.spotify.home.evopage.mobius.e;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class fk00 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ e a;

    public fk00(e eVar) {
        this.a = eVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x008b, code lost:
    
        if (r0.b(r1, r2) == r7) goto L22;
     */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.Object r22, p.r261 r23, p.onm r24) {
        /*
            r21 = this;
            r0 = r21
            r1 = r24
            boolean r2 = r1 instanceof p.ek00
            if (r2 == 0) goto L17
            r2 = r1
            p.ek00 r2 = (p.ek00) r2
            int r3 = r2.b
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.b = r3
            goto L1c
        L17:
            p.ek00 r2 = new p.ek00
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.a
            int r3 = r2.b
            r4 = 2
            r5 = 1
            r6 = 0
            p.d9n r7 = p.d9n.a
            if (r3 == 0) goto L3b
            if (r3 == r5) goto L35
            if (r3 != r4) goto L2f
            p.hm5.M(r1)
            goto L8e
        L2f:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r0)
            return r6
        L35:
            p.r261 r0 = r2.d
            p.hm5.M(r1)
            goto L83
        L3b:
            p.hm5.M(r1)
            r1 = r22
            com.spotify.home.evopage.mobius.Effect$OfflineFallbackResponse r1 = (com.spotify.home.evopage.mobius.Effect.OfflineFallbackResponse) r1
            com.spotify.home.evopage.mobius.e r0 = r0.a
            p.ynb0 r0 = r0.i
            java.lang.Object r0 = r0.get()
            p.fsp0 r0 = (p.fsp0) r0
            r3 = r23
            r2.d = r3
            r2.b = r5
            p.gsp0 r0 = (p.gsp0) r0
            r0.getClass()
            com.spotify.casita.v1.resolved.ResolvedHome r0 = com.spotify.casita.v1.resolved.ResolvedHome.o()
            com.spotify.casita.v1.resolved.ResponseInfo r0 = r0.r()
            r5 = 0
            p.yz21 r13 = p.qro1.v(r0, r5)
            java.lang.String r16 = r1.getFilterValue()
            p.dzz r8 = new p.dzz
            java.lang.String r19 = ""
            java.lang.String r20 = ""
            p.z6x r9 = p.z6x.a
            p.w7x r10 = p.w7x.a
            r12 = 0
            r14 = 0
            p.x4e0 r15 = p.x4e0.c
            p.ice0 r18 = p.ice0.e
            r11 = r10
            r17 = r10
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            if (r8 != r7) goto L81
            goto L8d
        L81:
            r0 = r3
            r1 = r8
        L83:
            r2.d = r6
            r2.b = r4
            java.lang.Object r0 = r0.b(r1, r2)
            if (r0 != r7) goto L8e
        L8d:
            return r7
        L8e:
            p.rih1 r0 = p.rih1.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p.fk00.a(java.lang.Object, p.r261, p.onm):java.lang.Object");
    }
}
