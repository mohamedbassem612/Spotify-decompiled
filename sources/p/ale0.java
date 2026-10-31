package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ale0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ im01 a;

    public ale0(im01 im01Var) {
        this.a = im01Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x008c, code lost:
    
        if (r8.b(r7, r0) == r5) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.Object r7, p.r261 r8, p.onm r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof p.zke0
            if (r0 == 0) goto L13
            r0 = r9
            p.zke0 r0 = (p.zke0) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            p.zke0 r0 = new p.zke0
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
            goto L8f
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r6)
            return r4
        L31:
            p.r261 r8 = r0.d
            p.hm5.M(r9)     // Catch: java.lang.Exception -> L7d
            goto L4b
        L37:
            p.hm5.M(r9)
            p.sje0 r7 = (p.sje0) r7
            p.im01 r6 = r6.a     // Catch: java.lang.Exception -> L7d
            r0.d = r8     // Catch: java.lang.Exception -> L7d
            r0.b = r3     // Catch: java.lang.Exception -> L7d
            p.l0x0 r6 = r6.a     // Catch: java.lang.Exception -> L7d
            java.io.Serializable r9 = r6.m(r0)     // Catch: java.lang.Exception -> L7d
            if (r9 != r5) goto L4b
            goto L8e
        L4b:
            java.util.List r9 = (java.util.List) r9     // Catch: java.lang.Exception -> L7d
            java.lang.Iterable r9 = (java.lang.Iterable) r9     // Catch: java.lang.Exception -> L7d
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch: java.lang.Exception -> L7d
            r7 = 10
            int r7 = p.q7h.U(r9, r7)     // Catch: java.lang.Exception -> L7d
            r6.<init>(r7)     // Catch: java.lang.Exception -> L7d
            java.util.Iterator r7 = r9.iterator()     // Catch: java.lang.Exception -> L7d
        L5e:
            boolean r9 = r7.hasNext()     // Catch: java.lang.Exception -> L7d
            if (r9 == 0) goto L77
            java.lang.Object r9 = r7.next()     // Catch: java.lang.Exception -> L7d
            p.fm01 r9 = (p.fm01) r9     // Catch: java.lang.Exception -> L7d
            p.jj40 r1 = new p.jj40     // Catch: java.lang.Exception -> L7d
            java.lang.String r3 = r9.b     // Catch: java.lang.Exception -> L7d
            int r9 = r9.a     // Catch: java.lang.Exception -> L7d
            r1.<init>(r3, r9)     // Catch: java.lang.Exception -> L7d
            r6.add(r1)     // Catch: java.lang.Exception -> L7d
            goto L5e
        L77:
            p.zle0 r7 = new p.zle0     // Catch: java.lang.Exception -> L7d
            r7.<init>(r6)     // Catch: java.lang.Exception -> L7d
            goto L84
        L7d:
            p.zle0 r7 = new p.zle0
            p.z6x r6 = p.z6x.a
            r7.<init>(r6)
        L84:
            r0.d = r4
            r0.b = r2
            java.lang.Object r6 = r8.b(r7, r0)
            if (r6 != r5) goto L8f
        L8e:
            return r5
        L8f:
            p.rih1 r6 = p.rih1.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p.ale0.a(java.lang.Object, p.r261, p.onm):java.lang.Object");
    }
}
