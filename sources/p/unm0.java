package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class unm0 extends a8d1 implements vu30 {
    public final /* synthetic */ float X;
    public final /* synthetic */ du41 Y;
    public l811 a;
    public l811 b;
    public int c;
    public byte d;
    public /* synthetic */ Object e;
    public final /* synthetic */ m811 f;
    public final /* synthetic */ p811 g;
    public final /* synthetic */ p811 h;
    public final /* synthetic */ float i;
    public final /* synthetic */ wnm0 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public unm0(m811 m811Var, p811 p811Var, p811 p811Var2, float f, wnm0 wnm0Var, float f2, du41 du41Var, lnm lnmVar) {
        super(2, lnmVar);
        this.f = m811Var;
        this.g = p811Var;
        this.h = p811Var2;
        this.i = f;
        this.t = wnm0Var;
        this.X = f2;
        this.Y = du41Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        unm0 unm0Var = new unm0(this.f, this.g, this.h, this.i, this.t, this.X, this.Y, lnmVar);
        unm0Var.e = obj;
        return unm0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((cu41) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x007c  */
    /* JADX WARN: Code duplicated, block: B:17:0x009c  */
    /* JADX WARN: Code duplicated, block: B:20:0x00af  */
    /* JADX WARN: Code duplicated, block: B:22:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:26:0x0162  */
    /* JADX WARN: Code duplicated, block: B:29:0x0169  */
    /* JADX WARN: Code duplicated, block: B:32:0x016e  */
    /* JADX WARN: Code duplicated, block: B:35:0x018d  */
    /* JADX WARN: Code duplicated, block: B:38:0x01a0  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x018d -> B:36:0x018e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x01a0 -> B:13:0x0076). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object invokeSuspend(java.lang.Object r26) {
        /*
            Method dump skipped, instruction units count: 473
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.unm0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
