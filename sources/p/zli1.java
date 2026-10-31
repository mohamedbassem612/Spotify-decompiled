package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class zli1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ cmi1 a;

    public zli1(cmi1 cmi1Var) {
        this.a = cmi1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0051, code lost:
    
        if (r7.b(r8, r6) == r4) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.Object r6, p.r261 r7, p.onm r8) {
        /*
            r5 = this;
            boolean r6 = r8 instanceof p.yli1
            if (r6 == 0) goto L13
            r6 = r8
            p.yli1 r6 = (p.yli1) r6
            int r0 = r6.c
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r6.c = r0
            goto L18
        L13:
            p.yli1 r6 = new p.yli1
            r6.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r6.b
            int r0 = r6.c
            r1 = 2
            r2 = 1
            r3 = 0
            p.d9n r4 = p.d9n.a
            if (r0 == 0) goto L37
            if (r0 == r2) goto L31
            if (r0 != r1) goto L2b
            p.hm5.M(r8)
            goto L54
        L2b:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r5)
            return r3
        L31:
            p.r261 r7 = r6.a
            p.hm5.M(r8)
            goto L49
        L37:
            p.hm5.M(r8)
            p.cmi1 r5 = r5.a
            p.v1k r5 = r5.a
            r6.a = r7
            r6.c = r2
            java.lang.Object r8 = r5.s(r6)
            if (r8 != r4) goto L49
            goto L53
        L49:
            r6.a = r3
            r6.c = r1
            java.lang.Object r5 = r7.b(r8, r6)
            if (r5 != r4) goto L54
        L53:
            return r4
        L54:
            p.rih1 r5 = p.rih1.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p.zli1.a(java.lang.Object, p.r261, p.onm):java.lang.Object");
    }
}
