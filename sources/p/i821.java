package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class i821 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ pte a;

    public i821(pte pteVar) {
        this.a = pteVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006c, code lost:
    
        if (r8.b(r6, r0) == r5) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.Object r7, p.r261 r8, p.onm r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof p.h821
            if (r0 == 0) goto L13
            r0 = r9
            p.h821 r0 = (p.h821) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            p.h821 r0 = new p.h821
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
            goto L6f
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r6)
            return r4
        L31:
            p.r261 r8 = r0.d
            p.hm5.M(r9)
            goto L4d
        L37:
            p.hm5.M(r9)
            p.n821 r7 = (p.n821) r7
            java.lang.String r9 = r7.a
            java.lang.String r7 = r7.b
            r0.d = r8
            r0.b = r3
            p.pte r6 = r6.a
            java.lang.Object r9 = r6.a(r9, r7, r0)
            if (r9 != r5) goto L4d
            goto L6e
        L4d:
            p.l821 r9 = (p.l821) r9
            p.k821 r6 = p.k821.a
            boolean r6 = p.u890.j(r9, r6)
            if (r6 == 0) goto L5a
            p.t821 r6 = p.t821.a
            goto L64
        L5a:
            p.j821 r6 = p.j821.a
            boolean r6 = p.u890.j(r9, r6)
            if (r6 == 0) goto L72
            p.s821 r6 = p.s821.a
        L64:
            r0.d = r4
            r0.b = r2
            java.lang.Object r6 = r8.b(r6, r0)
            if (r6 != r5) goto L6f
        L6e:
            return r5
        L6f:
            p.rih1 r6 = p.rih1.a
            return r6
        L72:
            p.eg.o()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p.i821.a(java.lang.Object, p.r261, p.onm):java.lang.Object");
    }
}
