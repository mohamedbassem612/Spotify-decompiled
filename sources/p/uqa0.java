package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class uqa0 extends z031 implements vu30 {
    public final /* synthetic */ c9n N0;
    public final /* synthetic */ ven0 O0;
    public final /* synthetic */ float P0;
    public final /* synthetic */ float Q0;
    public final /* synthetic */ pxg1 R0;
    public final /* synthetic */ n8b1 S0;
    public final /* synthetic */ ven0 T0;
    public final /* synthetic */ ven0 X;
    public final /* synthetic */ mqa0 Y;
    public final /* synthetic */ float Z;
    public tui1 b;
    public long c;
    public long d;
    public int e;
    public int f;
    public float g;
    public float h;
    public byte i;
    public /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uqa0(ven0 ven0Var, mqa0 mqa0Var, float f, c9n c9nVar, ven0 ven0Var2, float f2, float f3, pxg1 pxg1Var, n8b1 n8b1Var, ven0 ven0Var3, lnm lnmVar) {
        super(2, lnmVar);
        this.X = ven0Var;
        this.Y = mqa0Var;
        this.Z = f;
        this.N0 = c9nVar;
        this.O0 = ven0Var2;
        this.P0 = f2;
        this.Q0 = f3;
        this.R0 = pxg1Var;
        this.S0 = n8b1Var;
        this.T0 = ven0Var3;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        uqa0 uqa0Var = new uqa0(this.X, this.Y, this.Z, this.N0, this.O0, this.P0, this.Q0, this.R0, this.S0, this.T0, lnmVar);
        uqa0Var.t = obj;
        return uqa0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((i8d1) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ed A[LOOP:0: B:30:0x00d2->B:35:0x00ed, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:78:0x00f8 A[EDGE_INSN: B:78:0x00f8->B:37:0x00f8 BREAK  A[LOOP:0: B:30:0x00d2->B:35:0x00ed], SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00c5 -> B:29:0x00c8). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            Method dump skipped, instruction units count: 480
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.uqa0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
