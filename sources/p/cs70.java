package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class cs70 extends z031 implements vu30 {
    public final /* synthetic */ hab0 X;
    public final /* synthetic */ byte b;
    public float c;
    public float d;
    public long e;
    public int f;
    public int g;
    public byte h;
    public /* synthetic */ Object i;
    public final /* synthetic */ hab0 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cs70(hab0 hab0Var, hab0 hab0Var2, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.b = b;
        this.t = hab0Var;
        this.X = hab0Var2;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.b;
        s8s s8sVar = this.X;
        bp50 bp50Var = this.t;
        switch (b) {
            case 0:
                cs70 cs70Var = new cs70((jj50) bp50Var, (as70) s8sVar, lnmVar, (byte) 0);
                cs70Var.i = obj;
                return cs70Var;
            case 1:
                cs70 cs70Var2 = new cs70(bp50Var, (xvy) s8sVar, lnmVar, (byte) 1);
                cs70Var2.i = obj;
                return cs70Var2;
            default:
                cs70 cs70Var3 = new cs70((rl6) bp50Var, s8sVar, lnmVar, (byte) 2);
                cs70Var3.i = obj;
                return cs70Var3;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.b;
        rih1 rih1Var = rih1.a;
        i8d1 i8d1Var = (i8d1) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                break;
            case 1:
                break;
        }
        return create(i8d1Var, lnmVar).invokeSuspend(rih1Var);
    }

    /* JADX WARN: Code duplicated, block: B:191:0x0430  */
    /* JADX WARN: Code duplicated, block: B:272:0x043c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:273:0x0424 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:274:? A[LOOP:11: B:189:0x042a->B:274:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8, types: [int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:169:0x03db -> B:170:0x03e0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x009f -> B:19:0x00a4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:94:0x0252 -> B:96:0x0257). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object invokeSuspend(java.lang.Object r28) {
        /*
            Method dump skipped, instruction units count: 1250
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.cs70.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
