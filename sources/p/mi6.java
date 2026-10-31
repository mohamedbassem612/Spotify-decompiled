package p;

import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class mi6 extends z031 implements vu30 {
    public final /* synthetic */ byte b;
    public byte c;
    public /* synthetic */ Object d;
    public Object e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mi6(Object obj, Object obj2, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.b = b;
        this.e = obj;
        this.f = obj2;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.b;
        Object obj2 = this.f;
        switch (b) {
            case 0:
                mi6 mi6Var = new mi6((iu30) obj2, lnmVar, (byte) 0);
                mi6Var.d = obj;
                return mi6Var;
            case 1:
                mi6 mi6Var2 = new mi6((o8n) this.e, (vu30) obj2, lnmVar, (byte) 1);
                mi6Var2.d = obj;
                return mi6Var2;
            case 2:
                mi6 mi6Var3 = new mi6((b4e1) obj2, lnmVar, (byte) 2);
                mi6Var3.d = obj;
                return mi6Var3;
            case 3:
                mi6 mi6Var4 = new mi6((es41) this.e, (View) obj2, lnmVar, (byte) 3);
                mi6Var4.d = obj;
                return mi6Var4;
            case 4:
                mi6 mi6Var5 = new mi6((cav0) this.e, (p811) obj2, lnmVar, (byte) 4);
                mi6Var5.d = obj;
                return mi6Var5;
            case 5:
                mi6 mi6Var6 = new mi6((yqd1) obj2, lnmVar, (byte) 5);
                mi6Var6.d = obj;
                return mi6Var6;
            default:
                mi6 mi6Var7 = new mi6((idn0) obj2, lnmVar, (byte) 6);
                mi6Var7.d = obj;
                return mi6Var7;
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
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
        }
        return create(i8d1Var, lnmVar).invokeSuspend(rih1Var);
    }

    /* JADX WARN: Code duplicated, block: B:169:0x031f A[PHI: r5
      0x031f: PHI (r5v5 p.i8d1) = (r5v5 p.i8d1), (r5v4 p.i8d1), (r5v6 p.i8d1), (r5v10 p.i8d1) binds: [B:180:0x034c, B:175:0x033b, B:168:0x031e, B:160:0x0308] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:171:0x0325 A[Catch: CancellationException -> 0x030c, TRY_ENTER, TryCatch #0 {CancellationException -> 0x030c, blocks: (B:171:0x0325, B:174:0x0333, B:160:0x0308, B:165:0x0313), top: B:218:0x02ee }] */
    /* JADX WARN: Code duplicated, block: B:173:0x0332  */
    /* JADX WARN: Code duplicated, block: B:174:0x0333 A[Catch: CancellationException -> 0x030c, PHI: r5
      0x0333: PHI (r5v4 p.i8d1) = (r5v5 p.i8d1), (r5v8 p.i8d1) binds: [B:172:0x0330, B:165:0x0313] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #0 {CancellationException -> 0x030c, blocks: (B:171:0x0325, B:174:0x0333, B:160:0x0308, B:165:0x0313), top: B:218:0x02ee }] */
    /* JADX WARN: Code duplicated, block: B:203:0x03b9  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:110:0x022a -> B:112:0x022e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:140:0x02b5 -> B:142:0x02b9). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x005f -> B:18:0x0063). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:175:0x033b -> B:169:0x031f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:180:0x034c -> B:169:0x031f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:81:0x019b -> B:83:0x019f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 1056
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.mi6.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mi6(Object obj, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.b = b;
        this.f = obj;
    }
}
