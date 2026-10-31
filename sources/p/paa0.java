package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class paa0 extends z031 implements vu30 {
    public pdo0 b;
    public n0g c;
    public int d;
    public int e;
    public byte f;
    public /* synthetic */ Object g;
    public final /* synthetic */ saa0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public paa0(lnm lnmVar, saa0 saa0Var) {
        super(2, lnmVar);
        this.h = saa0Var;
    }

    @Override // p.faa
    public final lnm create(Object obj, lnm lnmVar) {
        paa0 paa0Var = new paa0(lnmVar, this.h);
        paa0Var.g = obj;
        return paa0Var;
    }

    @Override // p.vu30
    public final Object invoke(Object obj, Object obj2) {
        return ((paa0) create((r561) obj, (lnm) obj2)).invokeSuspend(rih1.a);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005c  */
    /* JADX WARN: Code duplicated, block: B:23:0x0060  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x005e -> B:25:0x0074). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // p.faa
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.g
            p.r561 r0 = (p.r561) r0
            byte r1 = r7.f
            r2 = 2
            r3 = 1
            r4 = 0
            p.d9n r5 = p.d9n.a
            if (r1 == 0) goto L27
            if (r1 == r3) goto L23
            if (r1 != r2) goto L1d
            int r1 = r7.e
            int r3 = r7.d
            p.n0g r4 = r7.c
            p.pdo0 r6 = r7.b
            p.hm5.M(r8)
            goto L74
        L1d:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r7)
            return r4
        L23:
            p.hm5.M(r8)
            goto L79
        L27:
            p.hm5.M(r8)
            p.saa0 r8 = r7.h
            java.lang.Object r8 = r8.g0()
            boolean r1 = r8 instanceof p.n0g
            if (r1 == 0) goto L40
            p.n0g r8 = (p.n0g) r8
            p.saa0 r8 = r8.g
            r7.g = r4
            r7.f = r3
            r0.b(r8, r7)
            return r5
        L40:
            boolean r1 = r8 instanceof p.i980
            if (r1 == 0) goto L79
            p.i980 r8 = (p.i980) r8
            p.pdo0 r8 = r8.b()
            if (r8 == 0) goto L79
            java.lang.Object r1 = r8.f()
            p.yoe0 r1 = (p.yoe0) r1
            r3 = 0
            r6 = r8
            r4 = r1
            r1 = r3
        L56:
            boolean r8 = r4.equals(r6)
            if (r8 != 0) goto L79
            boolean r8 = r4 instanceof p.n0g
            if (r8 == 0) goto L74
            p.n0g r4 = (p.n0g) r4
            p.saa0 r8 = r4.g
            r7.g = r0
            r7.b = r6
            r7.c = r4
            r7.d = r3
            r7.e = r1
            r7.f = r2
            r0.b(r8, r7)
            return r5
        L74:
            p.yoe0 r4 = r4.g()
            goto L56
        L79:
            p.rih1 r7 = p.rih1.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p.paa0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
