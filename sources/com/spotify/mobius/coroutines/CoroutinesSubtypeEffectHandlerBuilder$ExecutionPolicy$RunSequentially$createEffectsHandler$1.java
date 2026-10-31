package com.spotify.mobius.coroutines;

import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u000b\u001a\u00020\b\"\b\b\u0000\u0010\u0000*\u00028\u0006\"\b\b\u0001\u0010\u0002*\u00020\u0001\"\b\b\u0002\u0010\u0003*\u00020\u0001\"\b\b\u0003\u0010\u0000*\u00028\u0006\"\u0004\b\u0004\u0010\u0002\"\u0004\b\u0005\u0010\u0003\"\b\b\u0006\u0010\u0002*\u00020\u0001\"\b\b\u0007\u0010\u0003*\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00060\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00070\u0006H\u008a@¢\u0006\u0004\b\t\u0010\n"}, d2 = {"G", "", "F", "E", "Lp/jfe;", "effectChannel", "Lp/r261;", "eventsChannel", "Lp/rih1;", "handleEffects", "(Lp/jfe;Lp/r261;Lp/lnm;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
final class CoroutinesSubtypeEffectHandlerBuilder$ExecutionPolicy$RunSequentially$createEffectsHandler$1<F, E> implements CoroutinesSubtypeEffectHandlerBuilder.EffectsHandler {
    public final /* synthetic */ CoroutinesSubtypeEffectHandlerBuilder.EffectHandler a;

    public CoroutinesSubtypeEffectHandlerBuilder$ExecutionPolicy$RunSequentially$createEffectsHandler$1(CoroutinesSubtypeEffectHandlerBuilder.EffectHandler effectHandler) {
        this.a = effectHandler;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0064  */
    /* JADX WARN: Code duplicated, block: B:24:0x0071  */
    /* JADX WARN: Code duplicated, block: B:27:0x0086  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0083, code lost:
    
        if (r1.a(r9, r7, r0) == r4) goto L26;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0083 -> B:13:0x0033). Please report as a decompilation issue!!! */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectsHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(p.bbc r7, p.r261 r8, p.lnm r9) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder$ExecutionPolicy$RunSequentially$createEffectsHandler$1$handleEffects$1
            if (r0 == 0) goto L13
            r0 = r9
            com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder$ExecutionPolicy$RunSequentially$createEffectsHandler$1$handleEffects$1 r0 = (com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder$ExecutionPolicy$RunSequentially$createEffectsHandler$1$handleEffects$1) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L1a
        L13:
            com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder$ExecutionPolicy$RunSequentially$createEffectsHandler$1$handleEffects$1 r0 = new com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder$ExecutionPolicy$RunSequentially$createEffectsHandler$1$handleEffects$1
            p.onm r9 = (p.onm) r9
            r0.<init>(r6, r9)
        L1a:
            java.lang.Object r9 = r0.d
            int r1 = r0.f
            r2 = 2
            r3 = 1
            p.d9n r4 = p.d9n.a
            if (r1 == 0) goto L4a
            if (r1 == r3) goto L3e
            if (r1 != r2) goto L37
            p.uac r6 = r0.c
            p.r261 r7 = r0.b
            java.lang.Object r8 = r0.a
            com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder$ExecutionPolicy$RunSequentially$createEffectsHandler$1 r8 = (com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder$ExecutionPolicy$RunSequentially$createEffectsHandler$1) r8
            p.hm5.M(r9)
        L33:
            r9 = r6
            r6 = r8
            r8 = r7
            goto L55
        L37:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r6)
            r6 = 0
            return r6
        L3e:
            p.uac r6 = r0.c
            p.r261 r7 = r0.b
            java.lang.Object r8 = r0.a
            com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder$ExecutionPolicy$RunSequentially$createEffectsHandler$1 r8 = (com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder$ExecutionPolicy$RunSequentially$createEffectsHandler$1) r8
            p.hm5.M(r9)
            goto L69
        L4a:
            p.hm5.M(r9)
            r7.getClass()
            p.uac r9 = new p.uac
            r9.<init>(r7)
        L55:
            r0.a = r6
            r0.b = r8
            r0.c = r9
            r0.f = r3
            java.lang.Object r7 = r9.a(r0)
            if (r7 != r4) goto L64
            goto L85
        L64:
            r5 = r8
            r8 = r6
            r6 = r9
            r9 = r7
            r7 = r5
        L69:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L86
            java.lang.Object r9 = r6.c()
            com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder$EffectHandler r1 = r8.a
            r0.a = r8
            r0.b = r7
            r0.c = r6
            r0.f = r2
            java.lang.Object r9 = r1.a(r9, r7, r0)
            if (r9 != r4) goto L33
        L85:
            return r4
        L86:
            p.rih1 r6 = p.rih1.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder$ExecutionPolicy$RunSequentially$createEffectsHandler$1.a(p.bbc, p.r261, p.lnm):java.lang.Object");
    }
}
