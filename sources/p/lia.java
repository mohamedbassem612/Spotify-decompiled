package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class lia extends z031 implements vu30 {
    public final /* synthetic */ byte b;
    public boolean c;
    public /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lia(int i, lnm lnmVar, byte b) {
        super(i, lnmVar);
        this.b = b;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.b) {
            case 0:
                lia liaVar = new lia(2, lnmVar, (byte) 0);
                liaVar.d = obj;
                return liaVar;
            case 1:
                lia liaVar2 = new lia(2, lnmVar, (byte) 1);
                liaVar2.d = obj;
                return liaVar2;
            case 2:
                lia liaVar3 = new lia(2, lnmVar, (byte) 2);
                liaVar3.d = obj;
                return liaVar3;
            case 3:
                lia liaVar4 = new lia(2, lnmVar, (byte) 3);
                liaVar4.d = obj;
                return liaVar4;
            case 4:
                lia liaVar5 = new lia(2, lnmVar, (byte) 4);
                liaVar5.d = obj;
                return liaVar5;
            case 5:
                lia liaVar6 = new lia(2, lnmVar, (byte) 5);
                liaVar6.d = obj;
                return liaVar6;
            case 6:
                lia liaVar7 = new lia(2, lnmVar, (byte) 6);
                liaVar7.d = obj;
                return liaVar7;
            case 7:
                lia liaVar8 = new lia(2, lnmVar, (byte) 7);
                liaVar8.d = obj;
                return liaVar8;
            case 8:
                lia liaVar9 = new lia(2, lnmVar, (byte) 8);
                liaVar9.d = obj;
                return liaVar9;
            case 9:
                lia liaVar10 = new lia(2, lnmVar, (byte) 9);
                liaVar10.d = obj;
                return liaVar10;
            case 10:
                lia liaVar11 = new lia(2, lnmVar, (byte) 10);
                liaVar11.d = obj;
                return liaVar11;
            case 11:
                lia liaVar12 = new lia(2, lnmVar, (byte) 11);
                liaVar12.d = obj;
                return liaVar12;
            default:
                lia liaVar13 = new lia(2, lnmVar, (byte) 12);
                liaVar13.d = obj;
                return liaVar13;
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
                return d9nVar;
            case 1:
                create(i8d1Var, lnmVar).invokeSuspend(rih1Var);
                return d9nVar;
            case 2:
                create(i8d1Var, lnmVar).invokeSuspend(rih1Var);
                return d9nVar;
            case 3:
                create(i8d1Var, lnmVar).invokeSuspend(rih1Var);
                return d9nVar;
            case 4:
                return create(i8d1Var, lnmVar).invokeSuspend(rih1Var);
            case 5:
                create(i8d1Var, lnmVar).invokeSuspend(rih1Var);
                return d9nVar;
            case 6:
                create(i8d1Var, lnmVar).invokeSuspend(rih1Var);
                return d9nVar;
            case 7:
                create(i8d1Var, lnmVar).invokeSuspend(rih1Var);
                return d9nVar;
            case 8:
                return create(i8d1Var, lnmVar).invokeSuspend(rih1Var);
            case 9:
                return create(i8d1Var, lnmVar).invokeSuspend(rih1Var);
            case 10:
                create(i8d1Var, lnmVar).invokeSuspend(rih1Var);
                return d9nVar;
            case 11:
                return create(i8d1Var, lnmVar).invokeSuspend(rih1Var);
            default:
                return create(i8d1Var, lnmVar).invokeSuspend(rih1Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:154:0x0295 A[LOOP:8: B:152:0x028f->B:154:0x0295, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:184:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:123:0x020c -> B:125:0x020f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:136:0x0247 -> B:138:0x024a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:149:0x0282 -> B:151:0x0285). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x007a -> B:32:0x007d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:65:0x0114 -> B:67:0x0117). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:78:0x014f -> B:80:0x0152). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:91:0x018a -> B:93:0x018d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:142:0x0264
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 700
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.lia.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
