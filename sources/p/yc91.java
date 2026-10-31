package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class yc91 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ cd91 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ String e;

    public yc91(cd91 cd91Var, String str, boolean z, boolean z2, String str2) {
        this.a = cd91Var;
        this.b = str;
        this.c = z;
        this.d = z2;
        this.e = str2;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005f, code lost:
    
        if (r13.b(r14, r7) == r10) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.Object r12, p.r261 r13, p.onm r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof p.xc91
            if (r0 == 0) goto L14
            r0 = r14
            p.xc91 r0 = (p.xc91) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.b = r1
        L12:
            r7 = r0
            goto L1a
        L14:
            p.xc91 r0 = new p.xc91
            r0.<init>(r11, r14)
            goto L12
        L1a:
            java.lang.Object r14 = r7.a
            int r0 = r7.b
            r8 = 2
            r1 = 1
            r9 = 0
            p.d9n r10 = p.d9n.a
            if (r0 == 0) goto L39
            if (r0 == r1) goto L33
            if (r0 != r8) goto L2d
            p.hm5.M(r14)
            goto L62
        L2d:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r11)
            return r9
        L33:
            p.r261 r13 = r7.d
            p.hm5.M(r14)
            goto L57
        L39:
            p.hm5.M(r14)
            r2 = r12
            com.spotify.home.slotloading.SlotEffect$LoadSlotContent r2 = (com.spotify.home.slotloading.SlotEffect$LoadSlotContent) r2
            p.cd91 r12 = r11.a
            p.fad0 r12 = r12.b
            r7.d = r13
            r7.b = r1
            java.lang.String r3 = r11.b
            boolean r4 = r11.c
            boolean r5 = r11.d
            java.lang.String r6 = r11.e
            r1 = r12
            java.lang.Object r14 = r1.i(r2, r3, r4, r5, r6, r7)
            if (r14 != r10) goto L57
            goto L61
        L57:
            r7.d = r9
            r7.b = r8
            java.lang.Object r11 = r13.b(r14, r7)
            if (r11 != r10) goto L62
        L61:
            return r10
        L62:
            p.rih1 r11 = p.rih1.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p.yc91.a(java.lang.Object, p.r261, p.onm):java.lang.Object");
    }
}
