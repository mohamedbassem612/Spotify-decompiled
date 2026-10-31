package p;

import android.content.Context;
import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class gkb0 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public byte b;
    public Object c;
    public /* synthetic */ Object d;
    public final /* synthetic */ long e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gkb0(Context context, Object obj, q8n q8nVar, long j, ven0 ven0Var, pbr0 pbr0Var, yqg yqgVar, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = context;
        this.i = obj;
        this.d = q8nVar;
        this.e = j;
        this.f = ven0Var;
        this.g = pbr0Var;
        this.h = yqgVar;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.h;
        Object obj3 = this.g;
        Object obj4 = this.f;
        switch (b) {
            case 0:
                return new gkb0((Context) this.c, (fod) this.i, (q8n) this.d, this.e, (ven0) obj4, (pbr0) obj3, (yqg) obj2, lnmVar, (byte) 0);
            case 1:
                return new gkb0((Context) this.c, (Uri) this.i, (q8n) this.d, this.e, (ven0) obj4, (pbr0) obj3, (yqg) obj2, lnmVar, (byte) 1);
            case 2:
                gkb0 gkb0Var = new gkb0((y5i0) obj4, (n6i0) obj3, this.e, (String) obj2, lnmVar);
                gkb0Var.d = obj;
                return gkb0Var;
            default:
                gkb0 gkb0Var2 = new gkb0((lqo1) this.i, (zwo1) this.d, (String) obj4, this.e, (i2x0) obj3, (swo1) obj2, lnmVar);
                gkb0Var2.c = obj;
                return gkb0Var2;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 1:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 2:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            default:
                return create((rvo1) obj, (lnm) obj2).invokeSuspend(rih1Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:131:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:134:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x0132  */
    /* JADX WARN: Code duplicated, block: B:70:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:72:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:73:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:75:0x01be  */
    /* JADX WARN: Code duplicated, block: B:77:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:80:0x01d0  */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x02db, code lost:
    
        if (r0 == r10) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x023f, code lost:
    
        if (r0 == r10) goto L98;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r26) {
        /*
            Method dump skipped, instruction units count: 806
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.gkb0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gkb0(y5i0 y5i0Var, n6i0 n6i0Var, long j, String str, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 2;
        this.f = y5i0Var;
        this.g = n6i0Var;
        this.e = j;
        this.h = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gkb0(lqo1 lqo1Var, zwo1 zwo1Var, String str, long j, i2x0 i2x0Var, swo1 swo1Var, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 3;
        this.i = lqo1Var;
        this.d = zwo1Var;
        this.f = str;
        this.e = j;
        this.g = i2x0Var;
        this.h = swo1Var;
    }
}
