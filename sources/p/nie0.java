package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class nie0 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public bpb1 b;
    public oie0 c;
    public aoe0 d;
    public Object e;
    public sie0 f;
    public int g;
    public boolean h;
    public final /* synthetic */ oie0 i;
    public final /* synthetic */ aoe0 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nie0(oie0 oie0Var, aoe0 aoe0Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.i = oie0Var;
        this.t = aoe0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        aoe0 aoe0Var = this.t;
        oie0 oie0Var = this.i;
        switch (b) {
            case 0:
                return new nie0(oie0Var, aoe0Var, lnmVar, (byte) 0);
            default:
                return new nie0(oie0Var, aoe0Var, lnmVar, (byte) 1);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        c9n c9nVar = (c9n) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                break;
        }
        return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:27:0x00be  */
    /* JADX WARN: Code duplicated, block: B:31:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x005c -> B:14:0x005f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00be -> B:28:0x00c1). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.nie0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
