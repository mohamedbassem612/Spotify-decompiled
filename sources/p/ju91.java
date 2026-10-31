package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ju91 extends a8d1 implements vu30 {
    public final /* synthetic */ ven0 X;
    public long a;
    public boolean b;
    public /* synthetic */ Object c;
    public final /* synthetic */ float d;
    public final /* synthetic */ iu30 e;
    public final /* synthetic */ ven0 f;
    public final /* synthetic */ ven0 g;
    public final /* synthetic */ ven0 h;
    public final /* synthetic */ drr0 i;
    public final /* synthetic */ drr0 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ju91(float f, iu30 iu30Var, ven0 ven0Var, ven0 ven0Var2, ven0 ven0Var3, drr0 drr0Var, drr0 drr0Var2, ven0 ven0Var4, lnm lnmVar) {
        super(2, lnmVar);
        this.d = f;
        this.e = iu30Var;
        this.f = ven0Var;
        this.g = ven0Var2;
        this.h = ven0Var3;
        this.i = drr0Var;
        this.t = drr0Var2;
        this.X = ven0Var4;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        ju91 ju91Var = new ju91(this.d, this.e, this.f, this.g, this.h, this.i, this.t, this.X, lnmVar);
        ju91Var.c = obj;
        return ju91Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0039  */
    /* JADX WARN: Code duplicated, block: B:18:0x0055 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:21:0x0076  */
    /* JADX WARN: Code duplicated, block: B:42:0x013c  */
    /* JADX WARN: Code duplicated, block: B:45:0x014e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0053 -> B:19:0x0056). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object invokeSuspend(java.lang.Object r32) {
        /*
            Method dump skipped, instruction units count: 360
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.ju91.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
