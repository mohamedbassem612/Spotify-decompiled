package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class hl1 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public byte b;
    public boolean c;
    public /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public hl1(l041 l041Var, ArrayList arrayList, int i, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 11;
        this.d = l041Var;
        this.e = arrayList;
        this.b = i;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.e;
        switch (b) {
            case 0:
                return new hl1(this.c, this.d, obj2, lnmVar, (byte) 0);
            case 1:
                return new hl1(this.d, this.c, obj2, lnmVar, (byte) 1);
            case 2:
                return new hl1(this.d, this.c, obj2, lnmVar, (byte) 2);
            case 3:
                return new hl1(this.d, obj2, this.c, lnmVar, (byte) 3);
            case 4:
                return new hl1(this.d, obj2, this.c, lnmVar, (byte) 4);
            case 5:
                return new hl1((p2o0) this.d, this.b, (String) obj2, lnmVar);
            case 6:
                return new hl1(this.c, this.d, obj2, lnmVar, (byte) 6);
            case 7:
                return new hl1(this.c, this.d, obj2, lnmVar, (byte) 7);
            case 8:
                return new hl1(this.c, this.d, obj2, lnmVar, (byte) 8);
            case 9:
                return new hl1(this.c, this.d, obj2, lnmVar, (byte) 9);
            case 10:
                return new hl1(this.c, this.d, obj2, lnmVar, (byte) 10);
            case 11:
                return new hl1((l041) this.d, (ArrayList) obj2, this.b, lnmVar);
            case 12:
                hl1 hl1Var = new hl1((w9f0) obj2, lnmVar);
                hl1Var.d = obj;
                return hl1Var;
            default:
                return new hl1(this.d, obj2, this.c, lnmVar, (byte) 13);
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
            case 3:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 4:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 5:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 6:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 7:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 8:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 9:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 10:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 11:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 12:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            default:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:294:0x05c9  */
    /* JADX WARN: Code duplicated, block: B:400:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:401:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x0407, code lost:
    
        if (r2 == r11) goto L220;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x045d, code lost:
    
        if (r2 == r11) goto L220;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x0522, code lost:
    
        if (r0 == r11) goto L252;
     */
    /* JADX WARN: Code restructure failed: missing block: B:325:0x0678, code lost:
    
        if (p.fc11.i(r0, r27) == r11) goto L330;
     */
    /* JADX WARN: Code restructure failed: missing block: B:329:0x06c0, code lost:
    
        if (p.fc11.i(r0, r27) == r11) goto L330;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v44, types: [byte] */
    /* JADX WARN: Type inference failed for: r1v45 */
    /* JADX WARN: Type inference failed for: r1v46, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v50 */
    /* JADX WARN: Type inference failed for: r1v53 */
    /* JADX WARN: Type inference failed for: r1v54 */
    /* JADX WARN: Type inference failed for: r1v55 */
    /* JADX WARN: Type inference failed for: r1v56 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r28) {
        /*
            Method dump skipped, instruction units count: 1810
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.hl1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hl1(Object obj, boolean z, Object obj2, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = obj;
        this.c = z;
        this.e = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hl1(w9f0 w9f0Var, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 12;
        this.e = w9f0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public hl1(p2o0 p2o0Var, int i, String str, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 5;
        this.d = p2o0Var;
        this.b = i;
        this.e = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hl1(Object obj, Object obj2, boolean z, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = obj;
        this.e = obj2;
        this.c = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hl1(boolean z, Object obj, Object obj2, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = z;
        this.d = obj;
        this.e = obj2;
    }
}
