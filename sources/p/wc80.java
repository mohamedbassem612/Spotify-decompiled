package p;

import com.google.android.recaptcha.internal.zzhm;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class wc80 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public byte b;
    public final /* synthetic */ long c;
    public Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wc80(long j, ssw0 ssw0Var, Function0 function0, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 0;
        this.c = j;
        this.d = ssw0Var;
        this.e = function0;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.e;
        switch (b) {
            case 0:
                return new wc80(this.c, (ssw0) this.d, (Function0) obj2, lnmVar);
            case 1:
                return new wc80(obj2, this.c, lnmVar, (byte) 1);
            case 2:
                return new wc80((faa0) this.d, (cgb0) obj2, this.c, lnmVar, (byte) 2);
            case 3:
                wc80 wc80Var = new wc80(this.c, (List) obj2, lnmVar);
                wc80Var.d = obj;
                return wc80Var;
            case 4:
                return new wc80((jqd0) this.d, (String) obj2, this.c, lnmVar, (byte) 4);
            default:
                wc80 wc80Var2 = new wc80(obj2, this.c, lnmVar, (byte) 5);
                wc80Var2.d = obj;
                return wc80Var2;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.recaptcha.internal.zzhm */
    public final Object invoke(Object obj, Object obj2) throws zzhm {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 1:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 2:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 3:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return d9n.a;
            case 4:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            default:
                return create((zwo1) obj, (lnm) obj2).invokeSuspend(rih1Var);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.recaptcha.internal.zzhm */
    /* JADX WARN: Code duplicated, block: B:21:0x006c  */
    /* JADX WARN: Code duplicated, block: B:25:0x007a  */
    /* JADX WARN: Code duplicated, block: B:26:0x0080 A[Catch: Exception -> 0x0029, TRY_ENTER, TryCatch #0 {Exception -> 0x0029, blocks: (B:8:0x0023, B:22:0x006d, B:26:0x0080, B:27:0x0085, B:19:0x005f), top: B:148:0x001d }] */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x024a, code lost:
    
        if (r0.d(r1, r25) == r12) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0294, code lost:
    
        if (r1.b(r2, r25) == r0) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00ec, code lost:
    
        if (r0 == r4) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00f9, code lost:
    
        if (r0 == r4) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01b4, code lost:
    
        if (p.fn31.Y(r1, r10, r25) == r0) goto L98;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r26) throws com.google.android.recaptcha.internal.zzhm {
        /*
            Method dump skipped, instruction units count: 682
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.wc80.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wc80(long j, List list, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 3;
        this.c = j;
        this.e = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wc80(Object obj, long j, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.e = obj;
        this.c = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wc80(Object obj, Object obj2, long j, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = obj;
        this.e = obj2;
        this.c = j;
    }
}
