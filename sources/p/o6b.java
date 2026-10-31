package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class o6b extends z031 implements vu30 {
    public final /* synthetic */ byte b;
    public boolean c;
    public /* synthetic */ Object d;
    public final /* synthetic */ ven0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o6b(ven0 ven0Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.b = b;
        this.e = ven0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.b;
        ven0 ven0Var = this.e;
        switch (b) {
            case 0:
                o6b o6bVar = new o6b(ven0Var, lnmVar, (byte) 0);
                o6bVar.d = obj;
                return o6bVar;
            default:
                o6b o6bVar2 = new o6b(ven0Var, lnmVar, (byte) 1);
                o6bVar2.d = obj;
                return o6bVar2;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.b;
        d9n d9nVar = d9n.a;
        rih1 rih1Var = rih1.a;
        i8d1 i8d1Var = (i8d1) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                create(i8d1Var, lnmVar).invokeSuspend(rih1Var);
                break;
            default:
                create(i8d1Var, lnmVar).invokeSuspend(rih1Var);
                break;
        }
        return d9nVar;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0075  */
    /* JADX WARN: Code duplicated, block: B:32:0x0085  */
    /* JADX WARN: Code duplicated, block: B:35:0x0093 A[LOOP:1: B:33:0x008d->B:35:0x0093, LOOP_END] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x002c -> B:14:0x0030). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0073 -> B:30:0x0077). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:28:0x0075
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            byte r0 = r8.b
            p.ven0 r1 = r8.e
            p.cav0 r2 = p.cav0.a
            r3 = 0
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            p.d9n r5 = p.d9n.a
            r6 = 1
            switch(r0) {
                case 0: goto L56;
                default: goto Lf;
            }
        Lf:
            java.lang.Object r0 = r8.d
            p.i8d1 r0 = (p.i8d1) r0
            boolean r7 = r8.c
            if (r7 == 0) goto L21
            if (r7 != r6) goto L1d
            p.hm5.M(r9)
            goto L30
        L1d:
            p.eg.m(r4)
            goto L2f
        L21:
            p.hm5.M(r9)
        L24:
            r8.d = r0
            r8.c = r6
            java.lang.Object r9 = r0.a(r2, r8)
            if (r9 != r5) goto L30
            r3 = r5
        L2f:
            return r3
        L30:
            p.bav0 r9 = (p.bav0) r9
            java.lang.Object r3 = r1.getValue()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L24
            java.util.List r9 = r9.a
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.Iterator r9 = r9.iterator()
        L46:
            boolean r3 = r9.hasNext()
            if (r3 == 0) goto L24
            java.lang.Object r3 = r9.next()
            p.hav0 r3 = (p.hav0) r3
            r3.a()
            goto L46
        L56:
            java.lang.Object r0 = r8.d
            p.i8d1 r0 = (p.i8d1) r0
            boolean r7 = r8.c
            if (r7 == 0) goto L68
            if (r7 != r6) goto L64
            p.hm5.M(r9)
            goto L77
        L64:
            p.eg.m(r4)
            goto L76
        L68:
            p.hm5.M(r9)
        L6b:
            r8.d = r0
            r8.c = r6
            java.lang.Object r9 = r0.a(r2, r8)
            if (r9 != r5) goto L77
            r3 = r5
        L76:
            return r3
        L77:
            p.bav0 r9 = (p.bav0) r9
            java.lang.Object r3 = r1.getValue()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L6b
            java.util.List r9 = r9.a
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.Iterator r9 = r9.iterator()
        L8d:
            boolean r3 = r9.hasNext()
            if (r3 == 0) goto L6b
            java.lang.Object r3 = r9.next()
            p.hav0 r3 = (p.hav0) r3
            r3.a()
            goto L8d
        */
        throw new UnsupportedOperationException("Method not decompiled: p.o6b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
