package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class aco extends a8d1 implements vu30 {
    public final /* synthetic */ Object X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ Object Z;
    public final /* synthetic */ byte a = 1;
    public byte b;
    public int c;
    public int d;
    public int e;
    public Object f;
    public Object g;
    public Object h;
    public final /* synthetic */ Object i;
    public /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aco(ed01 ed01Var, String str, bw91 bw91Var, yae1 yae1Var, int i, int i2, ven0 ven0Var, lee1 lee1Var, int i3, ven0 ven0Var2, ven0 ven0Var3, lnm lnmVar) {
        super(2, lnmVar);
        this.f = ed01Var;
        this.g = str;
        this.h = bw91Var;
        this.i = yae1Var;
        this.c = i;
        this.d = i2;
        this.t = ven0Var;
        this.X = lee1Var;
        this.e = i3;
        this.Y = ven0Var2;
        this.Z = ven0Var3;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.Z;
        Object obj3 = this.Y;
        Object obj4 = this.X;
        Object obj5 = this.i;
        switch (b) {
            case 0:
                aco acoVar = new aco((qtc) obj4, (cco) obj3, (kbo) obj2, (vr20) obj5, lnmVar);
                acoVar.t = obj;
                return acoVar;
            default:
                return new aco((ed01) this.f, (String) this.g, (bw91) this.h, (yae1) obj5, this.c, this.d, (ven0) this.t, (lee1) obj4, this.e, (ven0) obj3, (ven0) obj2, lnmVar);
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

    /* JADX WARN: Code duplicated, block: B:56:0x0153  */
    /* JADX WARN: Code duplicated, block: B:59:0x017b  */
    /* JADX WARN: Code duplicated, block: B:62:0x0195  */
    /* JADX WARN: Code duplicated, block: B:65:0x019b A[Catch: all -> 0x01c2, TryCatch #0 {, blocks: (B:63:0x0197, B:65:0x019b, B:71:0x01a8, B:73:0x01b2), top: B:97:0x0197 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:68:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:70:0x01a7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:71:0x01a8 A[Catch: all -> 0x01c2, TryCatch #0 {, blocks: (B:63:0x0197, B:65:0x019b, B:71:0x01a8, B:73:0x01b2), top: B:97:0x0197 }] */
    /* JADX WARN: Code duplicated, block: B:80:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:85:0x01ec  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:79:0x01c9 -> B:83:0x01e5). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:81:0x01e2 -> B:83:0x01e5). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 560
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.aco.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aco(qtc qtcVar, cco ccoVar, kbo kboVar, vr20 vr20Var, lnm lnmVar) {
        super(2, lnmVar);
        this.X = qtcVar;
        this.Y = ccoVar;
        this.Z = kboVar;
        this.i = vr20Var;
    }
}
