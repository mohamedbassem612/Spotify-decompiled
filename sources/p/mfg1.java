package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class mfg1 extends z031 implements vu30 {
    public float b;
    public float c;
    public float d;
    public long e;
    public int f;
    public int g;
    public byte h;
    public /* synthetic */ Object i;
    public final /* synthetic */ hs70 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mfg1(hs70 hs70Var, lnm lnmVar) {
        super(2, lnmVar);
        this.t = hs70Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        mfg1 mfg1Var = new mfg1(this.t, lnmVar);
        mfg1Var.i = obj;
        return mfg1Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((i8d1) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:23:0x00b9 A[LOOP:0: B:19:0x00a9->B:23:0x00b9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:71:0x00bc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x00b7 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0097 -> B:18:0x009a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            Method dump skipped, instruction units count: 425
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.mfg1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
