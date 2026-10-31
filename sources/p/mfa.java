package p;

import androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class mfa extends z031 implements vu30 {
    public wen0 b;
    public cav0 c;
    public long d;
    public byte e;
    public /* synthetic */ Object f;
    public final /* synthetic */ c9n g;
    public final /* synthetic */ w5f1 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mfa(c9n c9nVar, w5f1 w5f1Var, lnm lnmVar) {
        super(2, lnmVar);
        this.g = c9nVar;
        this.h = w5f1Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        mfa mfaVar = new mfa(this.g, this.h, lnmVar);
        mfaVar.f = obj;
        return mfaVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((i8d1) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c7 A[Catch: all -> 0x0019, TRY_LEAVE, TryCatch #3 {all -> 0x0019, blocks: (B:8:0x0014, B:41:0x00c3, B:43:0x00c7), top: B:55:0x0014 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [byte] */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v16, types: [p.wen0] */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v9 */
    public final Object invokeSuspend(Object obj) throws Throwable {
        ?? r13;
        long j;
        i8d1 i8d1Var;
        cav0 cav0Var;
        cav0 cav0Var2;
        cav0 cav0Var3;
        cav0 cav0Var4;
        ?? r0;
        hav0 hav0Var;
        ?? r1 = this.e;
        lnm lnmVar = null;
        d9n d9nVar = d9n.a;
        try {
            if (r1 == 0) {
                hm5.M(obj);
                i8d1 i8d1Var2 = (i8d1) this.f;
                cav0 cav0VarB = gio1.b(Boolean.FALSE);
                long jB = i8d1Var2.c().b();
                this.f = i8d1Var2;
                this.b = cav0VarB;
                cav0 cav0Var5 = cav0.a;
                this.c = cav0Var5;
                this.d = jB;
                this.e = (byte) 1;
                Object objB = rqd1.b(i8d1Var2, this, 1);
                if (objB != d9nVar) {
                    j = jB;
                    i8d1Var = i8d1Var2;
                    obj = objB;
                    cav0Var2 = cav0VarB;
                    cav0Var = cav0Var5;
                }
                return d9nVar;
            }
            if (r1 != 1) {
                if (r1 != 2) {
                    if (r1 != 3) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r13 = (wen0) this.f;
                    try {
                        hm5.M(obj);
                        r0 = r1;
                        r13 = r13;
                        hav0Var = (hav0) obj;
                        if (hav0Var != null) {
                            hav0Var.a();
                        }
                        Boolean bool = Boolean.FALSE;
                        bpb1 bpb1Var = (bpb1) r13;
                        bpb1Var.getClass();
                        bpb1Var.m((Object) null, bool);
                        r1 = r0;
                        return rih1.a;
                    } catch (Throwable th) {
                        th = th;
                        Boolean bool2 = Boolean.FALSE;
                        bpb1 bpb1Var2 = (bpb1) r13;
                        bpb1Var2.getClass();
                        bpb1Var2.m((Object) null, bool2);
                        throw th;
                    }
                }
                cav0 cav0Var6 = this.c;
                cav0 cav0Var7 = this.b;
                i8d1Var = (i8d1) this.f;
                try {
                    hm5.M(obj);
                    cav0Var4 = cav0Var6;
                    cav0Var3 = cav0Var7;
                    Boolean bool3 = Boolean.FALSE;
                    bpb1 bpb1Var3 = (bpb1) cav0Var3;
                    bpb1Var3.getClass();
                    bpb1Var3.m((Object) null, bool3);
                    r1 = cav0Var4;
                } catch (PointerEventTimeoutCancellationException unused) {
                    cav0Var = cav0Var6;
                    cav0Var2 = cav0Var7;
                    fn31.T(this.g, null, 4, new vs0(cav0Var2, this.h, (lnm) null, (byte) 11), 1);
                    this.f = cav0Var2;
                    this.b = null;
                    this.c = null;
                    this.e = (byte) 3;
                    obj = rqd1.i(i8d1Var, cav0Var, this);
                    if (obj != d9nVar) {
                        r13 = cav0Var2;
                        r0 = cav0Var2;
                        hav0Var = (hav0) obj;
                        if (hav0Var != null) {
                            hav0Var.a();
                        }
                        Boolean bool4 = Boolean.FALSE;
                        bpb1 bpb1Var4 = (bpb1) r13;
                        bpb1Var4.getClass();
                        bpb1Var4.m((Object) null, bool4);
                        r1 = r0;
                    }
                    return d9nVar;
                } catch (Throwable th2) {
                    th = th2;
                    r13 = cav0Var7;
                    Boolean bool5 = Boolean.FALSE;
                    bpb1 bpb1Var5 = (bpb1) r13;
                    bpb1Var5.getClass();
                    bpb1Var5.m((Object) null, bool5);
                    throw th;
                }
                return rih1.a;
            }
            long j2 = this.d;
            cav0 cav0Var8 = this.c;
            cav0 cav0Var9 = this.b;
            i8d1 i8d1Var3 = (i8d1) this.f;
            hm5.M(obj);
            cav0Var = cav0Var8;
            cav0Var2 = cav0Var9;
            j = j2;
            i8d1Var = i8d1Var3;
            long j3 = j;
            int i = ((hav0) obj).i;
            if (i == 1 || i == 3) {
                try {
                    lfa lfaVar = new lfa(cav0Var, lnmVar, (byte) 0);
                    this.f = i8d1Var;
                    this.b = cav0Var2;
                    this.c = cav0Var;
                    this.e = (byte) 2;
                    if (i8d1Var.d(j3, lfaVar, this) != d9nVar) {
                        cav0Var3 = cav0Var2;
                        cav0Var4 = cav0Var2;
                        Boolean bool6 = Boolean.FALSE;
                        bpb1 bpb1Var6 = (bpb1) cav0Var3;
                        bpb1Var6.getClass();
                        bpb1Var6.m((Object) null, bool6);
                        r1 = cav0Var4;
                    }
                } catch (PointerEventTimeoutCancellationException unused2) {
                    fn31.T(this.g, null, 4, new vs0(cav0Var2, this.h, (lnm) null, (byte) 11), 1);
                    this.f = cav0Var2;
                    this.b = null;
                    this.c = null;
                    this.e = (byte) 3;
                    obj = rqd1.i(i8d1Var, cav0Var, this);
                    if (obj != d9nVar) {
                        r13 = cav0Var2;
                        r0 = cav0Var2;
                        hav0Var = (hav0) obj;
                        if (hav0Var != null) {
                            hav0Var.a();
                        }
                        Boolean bool7 = Boolean.FALSE;
                        bpb1 bpb1Var7 = (bpb1) r13;
                        bpb1Var7.getClass();
                        bpb1Var7.m((Object) null, bool7);
                        r1 = r0;
                        return rih1.a;
                    }
                }
                return d9nVar;
            }
            return rih1.a;
        } catch (Throwable th3) {
            th = th3;
            r13 = r1;
        }
    }
}
