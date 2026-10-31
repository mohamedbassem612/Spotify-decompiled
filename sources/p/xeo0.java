package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class xeo0 extends z031 implements vu30 {
    public final /* synthetic */ byte b = 0;
    public boolean c;
    public Object d;
    public /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xeo0(sfg1 sfg1Var, c9n c9nVar, lnm lnmVar) {
        super(2, lnmVar);
        this.e = sfg1Var;
        this.f = c9nVar;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.b;
        Object obj2 = this.f;
        switch (b) {
            case 0:
                xeo0 xeo0Var = new xeo0((Function0) obj2, lnmVar);
                xeo0Var.e = obj;
                return xeo0Var;
            default:
                xeo0 xeo0Var2 = new xeo0((sfg1) this.e, (c9n) obj2, lnmVar);
                xeo0Var2.d = obj;
                return xeo0Var2;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.b;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                return create((r561) obj, (lnm) obj2).invokeSuspend(rih1Var);
            default:
                return create((i8d1) obj, (lnm) obj2).invokeSuspend(rih1Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0076  */
    /* JADX WARN: Code duplicated, block: B:35:0x0081  */
    /* JADX WARN: Code duplicated, block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x0081 -> B:36:0x0082). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            byte r0 = r10.b
            p.rih1 r1 = p.rih1.a
            java.lang.Object r2 = r10.f
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            p.d9n r4 = p.d9n.a
            r5 = 1
            r6 = 0
            switch(r0) {
                case 0: goto L50;
                default: goto Lf;
            }
        Lf:
            java.lang.Object r0 = r10.e
            p.sfg1 r0 = (p.sfg1) r0
            p.bbc r7 = r0.U0
            boolean r8 = r10.c
            p.lfg1 r9 = p.lfg1.c
            if (r8 == 0) goto L2a
            if (r8 != r5) goto L25
            p.hm5.M(r11)     // Catch: java.lang.Throwable -> L21 java.util.concurrent.CancellationException -> L23
            goto L3d
        L21:
            r10 = move-exception
            goto L4c
        L23:
            r10 = move-exception
            goto L41
        L25:
            p.eg.m(r3)
            r1 = r6
            goto L4a
        L2a:
            p.hm5.M(r11)
            java.lang.Object r11 = r10.d
            p.i8d1 r11 = (p.i8d1) r11
            p.w7d1 r0 = r0.T0     // Catch: java.lang.Throwable -> L21 java.util.concurrent.CancellationException -> L23
            r10.c = r5     // Catch: java.lang.Throwable -> L21 java.util.concurrent.CancellationException -> L23
            java.lang.Object r10 = p.zmo1.r(r11, r7, r0, r10)     // Catch: java.lang.Throwable -> L21 java.util.concurrent.CancellationException -> L23
            if (r10 != r4) goto L3d
            r1 = r4
            goto L4a
        L3d:
            r7.l(r9)
            goto L4a
        L41:
            p.c9n r2 = (p.c9n) r2     // Catch: java.lang.Throwable -> L21
            boolean r11 = p.smo1.u(r2)     // Catch: java.lang.Throwable -> L21
            if (r11 == 0) goto L4b
            goto L3d
        L4a:
            return r1
        L4b:
            throw r10     // Catch: java.lang.Throwable -> L21
        L4c:
            r7.l(r9)
            throw r10
        L50:
            boolean r0 = r10.c
            if (r0 == 0) goto L65
            if (r0 != r5) goto L60
            java.lang.Object r0 = r10.d
            java.lang.Object r3 = r10.e
            p.r561 r3 = (p.r561) r3
            p.hm5.M(r11)
            goto L82
        L60:
            p.eg.m(r3)
            r1 = r6
            goto L84
        L65:
            p.hm5.M(r11)
            java.lang.Object r11 = r10.e
            p.r561 r11 = (p.r561) r11
            r3 = r11
        L6d:
            r11 = r2
            kotlin.jvm.functions.Function0 r11 = (kotlin.jvm.functions.Function0) r11
            java.lang.Object r11 = r11.invoke()
            if (r11 == 0) goto L81
            r10.e = r3
            r10.d = r11
            r10.c = r5
            r3.b(r11, r10)
            r1 = r4
            goto L84
        L81:
            r0 = r6
        L82:
            if (r0 != 0) goto L6d
        L84:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p.xeo0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xeo0(Function0 function0, lnm lnmVar) {
        super(2, lnmVar);
        this.f = function0;
    }
}
