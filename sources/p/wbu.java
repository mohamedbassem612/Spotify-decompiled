package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class wbu implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ xbu a;

    public wbu(xbu xbuVar) {
        this.a = xbuVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005e, code lost:
    
        if (r10.b(r9, r0) == r5) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.Object r9, p.r261 r10, p.onm r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof p.vbu
            if (r0 == 0) goto L13
            r0 = r11
            p.vbu r0 = (p.vbu) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            p.vbu r0 = new p.vbu
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.a
            int r1 = r0.b
            r2 = 2
            r3 = 1
            r4 = 0
            p.d9n r5 = p.d9n.a
            if (r1 == 0) goto L37
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2b
            p.hm5.M(r11)
            goto L61
        L2b:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r8)
            return r4
        L31:
            p.r261 r10 = r0.d
            p.hm5.M(r11)
            goto L49
        L37:
            p.hm5.M(r11)
            p.pbu r9 = (p.pbu) r9
            long r6 = r9.a
            r0.d = r10
            r0.b = r3
            java.lang.Object r9 = p.hap1.i(r6, r0)
            if (r9 != r5) goto L49
            goto L60
        L49:
            p.zbu r9 = new p.zbu
            p.xbu r8 = r8.a
            p.yqg r8 = r8.c
            long r6 = r8.e()
            r9.<init>(r6)
            r0.d = r4
            r0.b = r2
            java.lang.Object r8 = r10.b(r9, r0)
            if (r8 != r5) goto L61
        L60:
            return r5
        L61:
            p.rih1 r8 = p.rih1.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p.wbu.a(java.lang.Object, p.r261, p.onm):java.lang.Object");
    }
}
