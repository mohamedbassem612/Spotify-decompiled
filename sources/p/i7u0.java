package p;

import androidx.lifecycle.LifecycleDestroyedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class i7u0 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public byte b;
    public Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i7u0(Object obj, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = obj;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = 2;
        switch (this.a) {
            case 0:
                return new i7u0((k7u0) this.c, lnmVar, (byte) 0);
            case 1:
                return new i7u0(b, lnmVar);
            case 2:
                return new i7u0((ibz0) this.c, lnmVar, b);
            case 3:
                return new i7u0((a1o0) this.c, lnmVar, (byte) 3);
            case 4:
                return new i7u0((oj70) this.c, lnmVar, (byte) 4);
            case 5:
                return new i7u0((mzr0) this.c, lnmVar, (byte) 5);
            case 6:
                return new i7u0((bp41) this.c, lnmVar, (byte) 6);
            case 7:
                return new i7u0((ez71) this.c, lnmVar, (byte) 7);
            case 8:
                return new i7u0((fza1) this.c, lnmVar, (byte) 8);
            case 9:
                return new i7u0((j8d1) this.c, lnmVar, (byte) 9);
            case 10:
                return new i7u0((x6e1) this.c, lnmVar, (byte) 10);
            case 11:
                return new i7u0((iu30) this.c, lnmVar, (byte) 11);
            case 12:
                return new i7u0((jtf1) this.c, lnmVar, (byte) 12);
            case 13:
                return new i7u0((npg1) this.c, lnmVar, (byte) 13);
            case 14:
                return new i7u0((l9i1) this.c, lnmVar, (byte) 14);
            case 15:
                return new i7u0((iqk1) this.c, lnmVar, (byte) 15);
            case 16:
                return new i7u0((ppl1) this.c, lnmVar, (byte) 16);
            case 17:
                return new i7u0((spl1) this.c, lnmVar, (byte) 17);
            default:
                return new i7u0((fjk0) this.c, lnmVar, (byte) 18);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.lifecycle.LifecycleDestroyedException */
    public final Object invoke(Object obj, Object obj2) throws LifecycleDestroyedException {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        c9n c9nVar = (c9n) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            case 1:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            case 2:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            case 3:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            case 4:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            case 5:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            case 6:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            case 7:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            case 8:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                return d9n.a;
            case 9:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            case 10:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            case 11:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            case 12:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            case 13:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            case 14:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            case 15:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            case 16:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            case 17:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            default:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.lifecycle.LifecycleDestroyedException */
    /* JADX WARN: Code duplicated, block: B:579:0x0b78 A[PHI: r1 r2
      0x0b78: PHI (r1v3 java.lang.Object) = (r1v12 java.lang.Object), (r1v15 java.lang.Object) binds: [B:577:0x0b75, B:574:0x0b54] A[DONT_GENERATE, DONT_INLINE]
      0x0b78: PHI (r2v8 p.uac) = (r2v9 p.uac), (r2v10 p.uac) binds: [B:577:0x0b75, B:574:0x0b54] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:581:0x0b80  */
    /* JADX WARN: Code duplicated, block: B:583:0x0b93  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:419:0x08a1 -> B:415:0x087e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:582:0x0b91 -> B:576:0x0b6c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:584:0x0b97 -> B:576:0x0b6c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:586:0x0ba7 -> B:576:0x0b6c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object invokeSuspend(java.lang.Object r59) throws androidx.lifecycle.LifecycleDestroyedException {
        /*
            Method dump skipped, instruction units count: 3104
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.i7u0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i7u0(int i, lnm lnmVar) {
        super(i, lnmVar);
        this.a = (byte) 1;
    }
}
