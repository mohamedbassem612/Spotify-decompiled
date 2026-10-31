package p;

import java.io.Serializable;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class p230 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a = 1;
    public boolean b;
    public boolean c;
    public byte d;
    public final /* synthetic */ Serializable e;
    public Object f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public p230(mr20 mr20Var, float[] fArr, int i, boolean z, ven0 ven0Var, lnm lnmVar) {
        super(2, lnmVar);
        this.f = mr20Var;
        this.e = fArr;
        this.d = i;
        this.c = z;
        this.g = ven0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.g;
        Object obj3 = this.e;
        switch (b) {
            case 0:
                return new p230(this.b, (wp20) this.f, (String) obj3, this.c, (ubc0) obj2, lnmVar);
            case 1:
                return new p230((Function0) this.f, (byp) obj2, (String) obj3, lnmVar);
            case 2:
                return new p230((kjg1) obj2, (String) obj3, this.c, lnmVar);
            default:
                return new p230((mr20) this.f, (float[]) obj3, this.d, this.c, (ven0) obj2, lnmVar);
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
            case 2:
                break;
        }
        return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:133:0x02e3 A[Catch: all -> 0x0232, TryCatch #1 {all -> 0x0232, blocks: (B:104:0x022d, B:136:0x0309, B:140:0x0332, B:144:0x0347, B:143:0x0339, B:110:0x0240, B:131:0x02db, B:133:0x02e3, B:128:0x02a1), top: B:173:0x0223 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00e0 A[Catch: Exception -> 0x012a, CancellationException -> 0x021c, TryCatch #4 {CancellationException -> 0x021c, blocks: (B:18:0x0068, B:24:0x007c, B:68:0x0149, B:27:0x0085, B:56:0x0107, B:28:0x008c, B:45:0x00da, B:47:0x00e0, B:49:0x00ed, B:61:0x012d, B:71:0x0165, B:73:0x0169, B:76:0x0196, B:78:0x019a, B:80:0x01b0, B:85:0x01d3, B:86:0x01db, B:31:0x0097, B:33:0x009d, B:35:0x00a1, B:38:0x00af, B:40:0x00b9, B:42:0x00d2, B:89:0x01e2, B:90:0x01ee), top: B:175:0x005a }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00ed A[Catch: Exception -> 0x012a, CancellationException -> 0x021c, TryCatch #4 {CancellationException -> 0x021c, blocks: (B:18:0x0068, B:24:0x007c, B:68:0x0149, B:27:0x0085, B:56:0x0107, B:28:0x008c, B:45:0x00da, B:47:0x00e0, B:49:0x00ed, B:61:0x012d, B:71:0x0165, B:73:0x0169, B:76:0x0196, B:78:0x019a, B:80:0x01b0, B:85:0x01d3, B:86:0x01db, B:31:0x0097, B:33:0x009d, B:35:0x00a1, B:38:0x00af, B:40:0x00b9, B:42:0x00d2, B:89:0x01e2, B:90:0x01ee), top: B:175:0x005a }] */
    /* JADX WARN: Code duplicated, block: B:51:0x0100  */
    /* JADX WARN: Code duplicated, block: B:52:0x0101  */
    /* JADX WARN: Code duplicated, block: B:54:0x0104  */
    /* JADX WARN: Code duplicated, block: B:55:0x0106  */
    /* JADX WARN: Code duplicated, block: B:58:0x0128  */
    /* JADX WARN: Code duplicated, block: B:61:0x012d A[Catch: Exception -> 0x012a, CancellationException -> 0x021c, TryCatch #4 {CancellationException -> 0x021c, blocks: (B:18:0x0068, B:24:0x007c, B:68:0x0149, B:27:0x0085, B:56:0x0107, B:28:0x008c, B:45:0x00da, B:47:0x00e0, B:49:0x00ed, B:61:0x012d, B:71:0x0165, B:73:0x0169, B:76:0x0196, B:78:0x019a, B:80:0x01b0, B:85:0x01d3, B:86:0x01db, B:31:0x0097, B:33:0x009d, B:35:0x00a1, B:38:0x00af, B:40:0x00b9, B:42:0x00d2, B:89:0x01e2, B:90:0x01ee), top: B:175:0x005a }] */
    /* JADX WARN: Code duplicated, block: B:63:0x0142  */
    /* JADX WARN: Code duplicated, block: B:64:0x0143  */
    /* JADX WARN: Code duplicated, block: B:66:0x0146  */
    /* JADX WARN: Code duplicated, block: B:67:0x0148  */
    /* JADX WARN: Code duplicated, block: B:70:0x0163  */
    /* JADX WARN: Code duplicated, block: B:71:0x0165 A[Catch: Exception -> 0x012a, CancellationException -> 0x021c, TryCatch #4 {CancellationException -> 0x021c, blocks: (B:18:0x0068, B:24:0x007c, B:68:0x0149, B:27:0x0085, B:56:0x0107, B:28:0x008c, B:45:0x00da, B:47:0x00e0, B:49:0x00ed, B:61:0x012d, B:71:0x0165, B:73:0x0169, B:76:0x0196, B:78:0x019a, B:80:0x01b0, B:85:0x01d3, B:86:0x01db, B:31:0x0097, B:33:0x009d, B:35:0x00a1, B:38:0x00af, B:40:0x00b9, B:42:0x00d2, B:89:0x01e2, B:90:0x01ee), top: B:175:0x005a }] */
    /* JADX WARN: Code duplicated, block: B:73:0x0169 A[Catch: Exception -> 0x012a, CancellationException -> 0x021c, TryCatch #4 {CancellationException -> 0x021c, blocks: (B:18:0x0068, B:24:0x007c, B:68:0x0149, B:27:0x0085, B:56:0x0107, B:28:0x008c, B:45:0x00da, B:47:0x00e0, B:49:0x00ed, B:61:0x012d, B:71:0x0165, B:73:0x0169, B:76:0x0196, B:78:0x019a, B:80:0x01b0, B:85:0x01d3, B:86:0x01db, B:31:0x0097, B:33:0x009d, B:35:0x00a1, B:38:0x00af, B:40:0x00b9, B:42:0x00d2, B:89:0x01e2, B:90:0x01ee), top: B:175:0x005a }] */
    /* JADX WARN: Code duplicated, block: B:75:0x0194  */
    /* JADX WARN: Code duplicated, block: B:76:0x0196 A[Catch: Exception -> 0x012a, CancellationException -> 0x021c, TryCatch #4 {CancellationException -> 0x021c, blocks: (B:18:0x0068, B:24:0x007c, B:68:0x0149, B:27:0x0085, B:56:0x0107, B:28:0x008c, B:45:0x00da, B:47:0x00e0, B:49:0x00ed, B:61:0x012d, B:71:0x0165, B:73:0x0169, B:76:0x0196, B:78:0x019a, B:80:0x01b0, B:85:0x01d3, B:86:0x01db, B:31:0x0097, B:33:0x009d, B:35:0x00a1, B:38:0x00af, B:40:0x00b9, B:42:0x00d2, B:89:0x01e2, B:90:0x01ee), top: B:175:0x005a }] */
    /* JADX WARN: Code duplicated, block: B:78:0x019a A[Catch: Exception -> 0x012a, CancellationException -> 0x021c, TRY_LEAVE, TryCatch #4 {CancellationException -> 0x021c, blocks: (B:18:0x0068, B:24:0x007c, B:68:0x0149, B:27:0x0085, B:56:0x0107, B:28:0x008c, B:45:0x00da, B:47:0x00e0, B:49:0x00ed, B:61:0x012d, B:71:0x0165, B:73:0x0169, B:76:0x0196, B:78:0x019a, B:80:0x01b0, B:85:0x01d3, B:86:0x01db, B:31:0x0097, B:33:0x009d, B:35:0x00a1, B:38:0x00af, B:40:0x00b9, B:42:0x00d2, B:89:0x01e2, B:90:0x01ee), top: B:175:0x005a }] */
    /* JADX WARN: Code duplicated, block: B:82:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:85:0x01d3 A[Catch: Exception -> 0x01d1, CancellationException -> 0x021c, TryCatch #4 {CancellationException -> 0x021c, blocks: (B:18:0x0068, B:24:0x007c, B:68:0x0149, B:27:0x0085, B:56:0x0107, B:28:0x008c, B:45:0x00da, B:47:0x00e0, B:49:0x00ed, B:61:0x012d, B:71:0x0165, B:73:0x0169, B:76:0x0196, B:78:0x019a, B:80:0x01b0, B:85:0x01d3, B:86:0x01db, B:31:0x0097, B:33:0x009d, B:35:0x00a1, B:38:0x00af, B:40:0x00b9, B:42:0x00d2, B:89:0x01e2, B:90:0x01ee), top: B:175:0x005a }] */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0304, code lost:
    
        if (p.b5p1.j(r4, r5, r18) == r0) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x03ae, code lost:
    
        if (r5.w(r2, r4, r0, r18) == r3) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x03b8, code lost:
    
        if (r5.X(r2, r0, r18) == r3) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:?, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0218, code lost:
    
        if (r14.b(r13, r1, r18) == r9) goto L93;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v27, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r2v13, types: [int] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v32 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) throws kotlin.NoWhenBranchMatchedException {
        /*
            Method dump skipped, instruction units count: 992
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.p230.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p230(Function0 function0, byp bypVar, String str, lnm lnmVar) {
        super(2, lnmVar);
        this.f = function0;
        this.g = bypVar;
        this.e = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p230(kjg1 kjg1Var, String str, boolean z, lnm lnmVar) {
        super(2, lnmVar);
        this.g = kjg1Var;
        this.e = str;
        this.c = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p230(boolean z, wp20 wp20Var, String str, boolean z2, ubc0 ubc0Var, lnm lnmVar) {
        super(2, lnmVar);
        this.b = z;
        this.f = wp20Var;
        this.e = str;
        this.c = z2;
        this.g = ubc0Var;
    }
}
