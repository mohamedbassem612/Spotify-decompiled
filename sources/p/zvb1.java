package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class zvb1 extends z031 implements vu30 {
    public final /* synthetic */ svb1 N0;
    public final /* synthetic */ tvb1 O0;
    public /* synthetic */ Object X;
    public final /* synthetic */ yf6 Y;
    public final /* synthetic */ pt61 Z;
    public hav0 b;
    public float c;
    public float d;
    public long e;
    public int f;
    public int g;
    public int h;
    public int i;
    public byte t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zvb1(yf6 yf6Var, pt61 pt61Var, svb1 svb1Var, tvb1 tvb1Var, lnm lnmVar) {
        super(2, lnmVar);
        this.Y = yf6Var;
        this.Z = pt61Var;
        this.N0 = svb1Var;
        this.O0 = tvb1Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        zvb1 zvb1Var = new zvb1(this.Y, this.Z, this.N0, this.O0, lnmVar);
        zvb1Var.X = obj;
        return zvb1Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((i8d1) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    /* JADX WARN: Code duplicated, block: B:108:0x012a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:109:0x0142 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:110:? A[LOOP:2: B:59:0x0130->B:110:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x0136  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00de -> B:36:0x00e1). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            Method dump skipped, instruction units count: 524
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.zvb1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
