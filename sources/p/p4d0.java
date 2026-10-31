package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class p4d0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ iyc0 a;

    public p4d0(iyc0 iyc0Var) {
        this.a = iyc0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0070, code lost:
    
        if (r10.b(r9, r0) == r5) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.Object r9, p.r261 r10, p.onm r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof p.o4d0
            if (r0 == 0) goto L13
            r0 = r11
            p.o4d0 r0 = (p.o4d0) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            p.o4d0 r0 = new p.o4d0
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.a
            int r1 = r0.b
            r2 = 2
            r3 = 1
            r4 = 0
            p.d9n r5 = p.d9n.a
            if (r1 == 0) goto L39
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2b
            p.hm5.M(r11)
            goto L73
        L2b:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r8)
            return r4
        L31:
            p.k4d0 r8 = r0.e
            p.r261 r10 = r0.d
            p.hm5.M(r11)
            goto L56
        L39:
            p.hm5.M(r11)
            p.k4d0 r9 = (p.k4d0) r9
            p.q4d0 r11 = new p.q4d0
            p.iyc0 r8 = r8.a
            r1 = 0
            r11.<init>(r8, r9, r4, r1)
            r0.d = r10
            r0.e = r9
            r0.b = r3
            r6 = 500(0x1f4, double:2.47E-321)
            java.lang.Object r11 = p.rc2.O(r6, r11, r0)
            if (r11 != r5) goto L55
            goto L72
        L55:
            r8 = r9
        L56:
            p.py21 r11 = (p.py21) r11
            boolean r9 = r11 instanceof p.oy21
            if (r9 == 0) goto L64
            p.u4d0 r9 = new p.u4d0
            java.util.Set r8 = r8.b
            r9.<init>(r8)
            goto L66
        L64:
            p.v4d0 r9 = p.v4d0.a
        L66:
            r0.d = r4
            r0.e = r4
            r0.b = r2
            java.lang.Object r8 = r10.b(r9, r0)
            if (r8 != r5) goto L73
        L72:
            return r5
        L73:
            p.rih1 r8 = p.rih1.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p.p4d0.a(java.lang.Object, p.r261, p.onm):java.lang.Object");
    }
}
