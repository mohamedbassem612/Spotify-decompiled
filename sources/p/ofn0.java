package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ofn0 extends a8d1 implements vu30 {
    public vgn0 a;
    public Object b;
    public Object c;
    public pfn0 d;
    public byte e;
    public /* synthetic */ Object f;
    public final /* synthetic */ hfn0 g;
    public final /* synthetic */ pfn0 h;
    public final /* synthetic */ vu30 i;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ofn0(hfn0 hfn0Var, pfn0 pfn0Var, vu30 vu30Var, Object obj, lnm lnmVar) {
        super(2, lnmVar);
        this.g = hfn0Var;
        this.h = pfn0Var;
        this.i = vu30Var;
        this.t = obj;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        ofn0 ofn0Var = new ofn0(this.g, this.h, this.i, this.t, lnmVar);
        ofn0Var.f = obj;
        return ofn0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstInlineVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected instance arg in invoke
        	at jadx.core.dex.visitors.ConstInlineVisitor.addExplicitCast(ConstInlineVisitor.java:285)
        	at jadx.core.dex.visitors.ConstInlineVisitor.replaceArg(ConstInlineVisitor.java:267)
        	at jadx.core.dex.visitors.ConstInlineVisitor.replaceConst(ConstInlineVisitor.java:177)
        	at jadx.core.dex.visitors.ConstInlineVisitor.checkInsn(ConstInlineVisitor.java:110)
        	at jadx.core.dex.visitors.ConstInlineVisitor.process(ConstInlineVisitor.java:55)
        	at jadx.core.dex.visitors.ConstInlineVisitor.visit(ConstInlineVisitor.java:47)
        */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            byte r0 = r8.e
            r1 = 2
            r2 = 1
            r3 = 0
            p.d9n r4 = p.d9n.a
            if (r0 == 0) goto L3c
            if (r0 == r2) goto L25
            if (r0 != r1) goto L1f
            java.lang.Object r0 = r8.b
            p.pfn0 r0 = (p.pfn0) r0
            p.vgn0 r1 = r8.a
            java.lang.Object r8 = r8.f
            p.mfn0 r8 = (p.mfn0) r8
            p.hm5.M(r9)     // Catch: java.lang.Throwable -> L1c
            goto L90
        L1c:
            r9 = move-exception
            goto La1
        L1f:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r8)
            return r3
        L25:
            p.pfn0 r0 = r8.d
            java.lang.Object r2 = r8.c
            java.lang.Object r5 = r8.b
            p.vu30 r5 = (p.vu30) r5
            p.vgn0 r6 = r8.a
            java.lang.Object r7 = r8.f
            p.mfn0 r7 = (p.mfn0) r7
            p.hm5.M(r9)
            r9 = r6
            r6 = r5
            r5 = r9
            r9 = r0
            r0 = r7
            goto L78
        L3c:
            p.hm5.M(r9)
            java.lang.Object r9 = r8.f
            p.c9n r9 = (p.c9n) r9
            p.mfn0 r0 = new p.mfn0
            p.o8n r9 = r9.J()
            p.fkj0 r5 = p.fkj0.W0
            p.m8n r9 = r9.A(r5)
            r9.getClass()
            p.faa0 r9 = (p.faa0) r9
            p.hfn0 r5 = r8.g
            r0.<init>(r5, r9)
            p.pfn0 r9 = r8.h
            r9.b(r0)
            p.xgn0 r5 = r9.b
            r8.f = r0
            r8.a = r5
            p.vu30 r6 = r8.i
            r8.b = r6
            java.lang.Object r7 = r8.t
            r8.c = r7
            r8.d = r9
            r8.e = r2
            java.lang.Object r2 = r5.a(r8)
            if (r2 != r4) goto L77
            goto L8a
        L77:
            r2 = r7
        L78:
            r8.f = r0     // Catch: java.lang.Throwable -> L9b
            r8.a = r5     // Catch: java.lang.Throwable -> L9b
            r8.b = r9     // Catch: java.lang.Throwable -> L9b
            r8.c = r3     // Catch: java.lang.Throwable -> L9b
            r8.d = r3     // Catch: java.lang.Throwable -> L9b
            r8.e = r1     // Catch: java.lang.Throwable -> L9b
            java.lang.Object r8 = r6.invoke(r2, r8)     // Catch: java.lang.Throwable -> L9b
            if (r8 != r4) goto L8b
        L8a:
            return r4
        L8b:
            r1 = r9
            r9 = r8
            r8 = r0
            r0 = r1
            r1 = r5
        L90:
            java.util.concurrent.atomic.AtomicReference r0 = r0.a     // Catch: java.lang.Throwable -> L99
            p.cfm0.l(r0, r8)     // Catch: java.lang.Throwable -> L99
            r1.c(r3)
            return r9
        L99:
            r8 = move-exception
            goto La7
        L9b:
            r8 = move-exception
            r1 = r9
            r9 = r8
            r8 = r0
            r0 = r1
            r1 = r5
        La1:
            java.util.concurrent.atomic.AtomicReference r0 = r0.a     // Catch: java.lang.Throwable -> L99
            p.cfm0.l(r0, r8)     // Catch: java.lang.Throwable -> L99
            throw r9     // Catch: java.lang.Throwable -> L99
        La7:
            r1.c(r3)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p.ofn0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
