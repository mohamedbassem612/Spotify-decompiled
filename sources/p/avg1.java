package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class avg1 extends a8d1 implements vu30 {
    public ojp0[] a;
    public bvg1 b;
    public v7g1 c;
    public int d;
    public int e;
    public int f;
    public byte g;
    public final /* synthetic */ ojp0[] h;
    public final /* synthetic */ bvg1 i;
    public final /* synthetic */ v7g1 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public avg1(ojp0[] ojp0VarArr, bvg1 bvg1Var, v7g1 v7g1Var, lnm lnmVar) {
        super(2, lnmVar);
        this.h = ojp0VarArr;
        this.i = bvg1Var;
        this.t = v7g1Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        return new avg1(this.h, this.i, this.t, lnmVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((t7g1) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0031  */
    /* JADX WARN: Code duplicated, block: B:13:0x003b  */
    /* JADX WARN: Code duplicated, block: B:15:0x003f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x0041  */
    /* JADX WARN: Code duplicated, block: B:19:0x0056  */
    /* JADX WARN: Code duplicated, block: B:21:0x0059  */
    /* JADX WARN: Code duplicated, block: B:23:0x005d  */
    /* JADX WARN: Code duplicated, block: B:26:0x0072  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0072 -> B:27:0x0073). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            byte r0 = r11.g
            r1 = 0
            r2 = 2
            r3 = 1
            if (r0 == 0) goto L21
            if (r0 == r3) goto Lb
            if (r0 != r2) goto L1b
        Lb:
            int r0 = r11.f
            int r4 = r11.e
            int r5 = r11.d
            p.v7g1 r6 = r11.c
            p.bvg1 r7 = r11.b
            p.ojp0[] r8 = r11.a
            p.hm5.M(r12)
            goto L57
        L1b:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r11)
            return r1
        L21:
            p.hm5.M(r12)
            p.ojp0[] r12 = r11.h
            int r0 = r12.length
            r4 = 0
            p.bvg1 r5 = r11.i
            p.v7g1 r6 = r11.t
            r8 = r12
            r12 = r4
            r7 = r5
        L2f:
            if (r4 >= r0) goto L75
            r5 = r8[r4]
            int r9 = r12 + 1
            int r5 = r5.ordinal()
            if (r5 == 0) goto L72
            p.d9n r10 = p.d9n.a
            if (r5 == r3) goto L5d
            if (r5 != r2) goto L59
            r11.a = r8
            r11.b = r7
            r11.c = r6
            r11.d = r9
            r11.e = r4
            r11.f = r0
            r11.g = r2
            java.lang.Object r12 = r7.e(r6, r12, r11)
            if (r12 != r10) goto L56
            goto L71
        L56:
            r5 = r9
        L57:
            r12 = r5
            goto L73
        L59:
            p.eg.o()
            return r1
        L5d:
            r11.a = r8
            r11.b = r7
            r11.c = r6
            r11.d = r9
            r11.e = r4
            r11.f = r0
            r11.g = r3
            java.lang.Object r12 = r7.d(r6, r12, r11)
            if (r12 != r10) goto L56
        L71:
            return r10
        L72:
            r12 = r9
        L73:
            int r4 = r4 + r3
            goto L2f
        L75:
            p.rih1 r11 = p.rih1.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p.avg1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
