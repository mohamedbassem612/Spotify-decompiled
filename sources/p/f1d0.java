package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class f1d0 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a = 2;
    public int b;
    public boolean c;
    public final /* synthetic */ boolean d;
    public Object e;
    public final /* synthetic */ Object f;
    public /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1d0(c380 c380Var, boolean z, int i, ven0 ven0Var, ven0 ven0Var2, lnm lnmVar) {
        super(2, lnmVar);
        this.f = c380Var;
        this.d = z;
        this.b = i;
        this.g = ven0Var;
        this.h = ven0Var2;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.h;
        Object obj3 = this.f;
        switch (b) {
            case 0:
                f1d0 f1d0Var = new f1d0(this.d, (haa0) obj3, (String) obj2, lnmVar);
                f1d0Var.g = obj;
                return f1d0Var;
            case 1:
                return new f1d0((fcf0) obj3, this.d, (kbf0) this.g, (iu30) obj2, lnmVar);
            default:
                return new f1d0((c380) obj3, this.d, this.b, (ven0) this.g, (ven0) obj2, lnmVar);
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
            case 1:
                break;
        }
        return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x009c  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:41:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:42:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:80:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [int] */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r1v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v6, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x00b8 -> B:40:0x00b9). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) {
        /*
            Method dump skipped, instruction units count: 320
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.f1d0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1d0(fcf0 fcf0Var, boolean z, kbf0 kbf0Var, iu30 iu30Var, lnm lnmVar) {
        super(2, lnmVar);
        this.f = fcf0Var;
        this.d = z;
        this.g = kbf0Var;
        this.h = iu30Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1d0(boolean z, haa0 haa0Var, String str, lnm lnmVar) {
        super(2, lnmVar);
        this.d = z;
        this.f = haa0Var;
        this.h = str;
    }
}
