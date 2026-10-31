package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class tmk0 extends a8d1 implements vu30 {
    public final /* synthetic */ frr0 X;
    public final /* synthetic */ frr0 Y;
    public zck0 a;
    public l811 b;
    public long c;
    public long d;
    public long e;
    public byte f;
    public final /* synthetic */ res g;
    public final /* synthetic */ sen0 h;
    public final /* synthetic */ ven0 i;
    public final /* synthetic */ drr0 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tmk0(res resVar, sen0 sen0Var, ven0 ven0Var, drr0 drr0Var, frr0 frr0Var, frr0 frr0Var2, lnm lnmVar) {
        super(2, lnmVar);
        this.g = resVar;
        this.h = sen0Var;
        this.i = ven0Var;
        this.t = drr0Var;
        this.X = frr0Var;
        this.Y = frr0Var2;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        return new tmk0(this.g, this.h, this.i, this.t, this.X, this.Y, lnmVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00d3 -> B:27:0x00d6). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instruction units count: 289
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.tmk0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
