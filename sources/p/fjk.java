package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class fjk extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public byte b;
    public boolean c;
    public Object d;
    public Object e;
    public /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fjk(tob1 tob1Var, vy71 vy71Var, Function0 function0, boolean z, ven0 ven0Var, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 2;
        this.d = tob1Var;
        this.e = vy71Var;
        this.f = function0;
        this.c = z;
        this.g = ven0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.g;
        switch (b) {
            case 0:
                fjk fjkVar = new fjk((hjk) obj2, lnmVar);
                fjkVar.f = obj;
                return fjkVar;
            case 1:
                fjk fjkVar2 = new fjk(this.d, this.e, this.f, obj2, lnmVar, (byte) 1);
                fjkVar2.c = ((Boolean) obj).booleanValue();
                return fjkVar2;
            case 2:
                return new fjk((tob1) this.d, (vy71) this.e, (Function0) this.f, this.c, (ven0) obj2, lnmVar);
            case 3:
                fjk fjkVar3 = new fjk(this.c, this.d, this.e, obj2, lnmVar, (byte) 3);
                fjkVar3.f = obj;
                return fjkVar3;
            case 4:
                return new fjk(this.d, this.e, this.f, obj2, lnmVar, (byte) 4);
            case 5:
                fjk fjkVar4 = new fjk(this.c, this.d, this.e, obj2, lnmVar, (byte) 5);
                fjkVar4.f = obj;
                return fjkVar4;
            default:
                fjk fjkVar5 = new fjk(this.c, this.d, this.e, obj2, lnmVar, (byte) 6);
                fjkVar5.f = obj;
                return fjkVar5;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                return ((fjk) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((fjk) create(bool, (lnm) obj2)).invokeSuspend(rih1Var);
            case 2:
                return ((fjk) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 3:
                return ((fjk) create((vr20) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 4:
                return ((fjk) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 5:
                return ((fjk) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            default:
                return ((fjk) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: retrofit2.HttpException */
    /* JADX WARN: Code duplicated, block: B:101:0x020c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:102:0x020e  */
    /* JADX WARN: Code duplicated, block: B:104:0x0217  */
    /* JADX WARN: Code duplicated, block: B:22:0x005b A[Catch: all -> 0x0071, TRY_ENTER, TryCatch #0 {all -> 0x0071, blocks: (B:8:0x0024, B:25:0x006c, B:22:0x005b), top: B:207:0x001e }] */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0222, code lost:
    
        if (r10.emit(r8, r20) == r11) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x02f5, code lost:
    
        if (r7.b(r3, r20) == r9) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x030e, code lost:
    
        if (p.l4p1.q(r2, r3, r20) == r9) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0311, code lost:
    
        return r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0068, code lost:
    
        if (r0 == r9) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b3, code lost:
    
        if (r0 == r9) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d2, code lost:
    
        if (r3.collect(r4, r20) == r9) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00d5, code lost:
    
        return r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0120, code lost:
    
        if (r3.k(r6, 0, r20) == r0) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0123, code lost:
    
        r0 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x012f, code lost:
    
        if (r3.k(0, 0, r20) == r0) goto L65;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) throws retrofit2.HttpException {
        /*
            Method dump skipped, instruction units count: 1016
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.fjk.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fjk(hjk hjkVar, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 0;
        this.g = hjkVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fjk(Object obj, Object obj2, Object obj3, Object obj4, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
        this.g = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fjk(boolean z, Object obj, Object obj2, Object obj3, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = z;
        this.d = obj;
        this.e = obj2;
        this.g = obj3;
    }
}
