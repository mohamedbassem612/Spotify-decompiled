package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class w66 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ y66 a;

    public w66(y66 y66Var) {
        this.a = y66Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0066, code lost:
    
        if (r11 == r6) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0089, code lost:
    
        if (r10.b(r2, r0) == r6) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.Object r9, p.r261 r10, p.onm r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof p.v66
            if (r0 == 0) goto L13
            r0 = r11
            p.v66 r0 = (p.v66) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            p.v66 r0 = new p.v66
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.a
            int r1 = r0.b
            p.r76 r2 = p.r76.a
            r3 = 2
            r4 = 1
            r5 = 0
            p.d9n r6 = p.d9n.a
            if (r1 == 0) goto L39
            if (r1 == r4) goto L33
            if (r1 != r3) goto L2d
            p.hm5.M(r11)
            goto L8c
        L2d:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r8)
            return r5
        L33:
            p.r261 r10 = r0.d
            p.hm5.M(r11)
            goto L69
        L39:
            p.hm5.M(r11)
            p.v56 r9 = (p.v56) r9
            p.y66 r8 = r8.a
            p.a56 r8 = r8.l
            p.o46 r8 = r8.c()
            boolean r11 = r8 instanceof p.mmu0
            if (r11 == 0) goto L4d
            p.mmu0 r8 = (p.mmu0) r8
            goto L4e
        L4d:
            r8 = r5
        L4e:
            if (r8 != 0) goto L51
            goto L81
        L51:
            p.tg40 r11 = new p.tg40
            java.lang.String r1 = r9.a
            java.util.List r7 = r9.c
            p.nmu0 r9 = r9.b
            r11.<init>(r1, r7, r9)
            r0.d = r10
            r0.b = r4
            p.yeu0 r8 = r8.d
            java.lang.Object r11 = r8.m(r11, r0)
            if (r11 != r6) goto L69
            goto L8b
        L69:
            p.zg40 r11 = (p.zg40) r11
            boolean r8 = r11 instanceof p.yg40
            if (r8 == 0) goto L79
            p.s76 r2 = new p.s76
            p.yg40 r11 = (p.yg40) r11
            p.nmu0 r8 = r11.a
            r2.<init>(r8)
            goto L81
        L79:
            p.xg40 r8 = p.xg40.a
            boolean r8 = p.u890.j(r11, r8)
            if (r8 == 0) goto L8f
        L81:
            r0.d = r5
            r0.b = r3
            java.lang.Object r8 = r10.b(r2, r0)
            if (r8 != r6) goto L8c
        L8b:
            return r6
        L8c:
            p.rih1 r8 = p.rih1.a
            return r8
        L8f:
            p.eg.o()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p.w66.a(java.lang.Object, p.r261, p.onm):java.lang.Object");
    }
}
