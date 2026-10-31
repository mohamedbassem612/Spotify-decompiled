package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class lsu implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005e, code lost:
    
        if (r9.b(r7, r0) == r4) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.Object r8, p.r261 r9, p.onm r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof p.ksu
            if (r0 == 0) goto L13
            r0 = r10
            p.ksu r0 = (p.ksu) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            p.ksu r0 = new p.ksu
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r7 = r0.a
            int r10 = r0.b
            r1 = 2
            r2 = 1
            r3 = 0
            p.d9n r4 = p.d9n.a
            if (r10 == 0) goto L39
            if (r10 == r2) goto L31
            if (r10 != r1) goto L2b
            p.hm5.M(r7)
            goto L61
        L2b:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r7)
            return r3
        L31:
            p.esu r8 = r0.e
            p.r261 r9 = r0.d
            p.hm5.M(r7)
            goto L4d
        L39:
            p.hm5.M(r7)
            p.esu r8 = (p.esu) r8
            long r5 = p.osu.a
            r0.d = r9
            r0.e = r8
            r0.b = r2
            java.lang.Object r7 = p.hap1.j(r5, r0)
            if (r7 != r4) goto L4d
            goto L60
        L4d:
            p.vsu r7 = new p.vsu
            java.lang.String r8 = r8.a
            r7.<init>(r8)
            r0.d = r3
            r0.e = r3
            r0.b = r1
            java.lang.Object r7 = r9.b(r7, r0)
            if (r7 != r4) goto L61
        L60:
            return r4
        L61:
            p.rih1 r7 = p.rih1.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p.lsu.a(java.lang.Object, p.r261, p.onm):java.lang.Object");
    }
}
