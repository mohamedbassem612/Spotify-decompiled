package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class lfa extends z031 implements vu30 {
    public final /* synthetic */ byte b;
    public boolean c;
    public /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lfa(Object obj, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.b = b;
        this.e = obj;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.b;
        Object obj2 = this.e;
        switch (b) {
            case 0:
                lfa lfaVar = new lfa((cav0) obj2, lnmVar, (byte) 0);
                lfaVar.d = obj;
                return lfaVar;
            case 1:
                lfa lfaVar2 = new lfa((tj40) obj2, lnmVar, (byte) 1);
                lfaVar2.d = obj;
                return lfaVar2;
            case 2:
                lfa lfaVar3 = new lfa((l7n) obj2, lnmVar, (byte) 2);
                lfaVar3.d = obj;
                return lfaVar3;
            case 3:
                lfa lfaVar4 = new lfa((r7e1) obj2, lnmVar, (byte) 3);
                lfaVar4.d = obj;
                return lfaVar4;
            default:
                lfa lfaVar5 = new lfa((hcl1) obj2, lnmVar, (byte) 4);
                lfaVar5.d = obj;
                return lfaVar5;
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
                return create(i8d1Var, lnmVar).invokeSuspend(rih1Var);
            case 1:
                create(i8d1Var, lnmVar).invokeSuspend(rih1Var);
                return d9nVar;
            case 2:
                create(i8d1Var, lnmVar).invokeSuspend(rih1Var);
                return d9nVar;
            case 3:
                create(i8d1Var, lnmVar).invokeSuspend(rih1Var);
                return d9nVar;
            default:
                create(i8d1Var, lnmVar).invokeSuspend(rih1Var);
                return d9nVar;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:121:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x0137  */
    /* JADX WARN: Code duplicated, block: B:70:0x0143 A[LOOP:2: B:68:0x013d->B:70:0x0143, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:73:0x0153  */
    /* JADX WARN: Code duplicated, block: B:76:0x015a  */
    /* JADX WARN: Code duplicated, block: B:78:0x0169  */
    /* JADX WARN: Code duplicated, block: B:80:0x016c  */
    /* JADX WARN: Code duplicated, block: B:83:0x0179 A[LOOP:3: B:81:0x0173->B:83:0x0179, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:86:0x018f  */
    /* JADX WARN: Code duplicated, block: B:89:0x0196  */
    /* JADX WARN: Code duplicated, block: B:91:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:92:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:93:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:95:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:97:0x01c1  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0036 -> B:13:0x0039). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x00bb -> B:45:0x00be). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x00f0 -> B:55:0x00f3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:63:0x012a -> B:65:0x012d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:67:0x0137
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 510
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.lfa.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
