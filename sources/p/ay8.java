package p;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.KotlinNothingValueException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ay8 implements zob1 {
    public final /* synthetic */ bpb1 a;
    public final /* synthetic */ bpb1 b;
    public final /* synthetic */ xgn0 c;
    public final /* synthetic */ AtomicInteger d;
    public final /* synthetic */ p811 e;
    public final /* synthetic */ vu30 f;
    public final /* synthetic */ o8n g;

    public ay8(bpb1 bpb1Var, xgn0 xgn0Var, AtomicInteger atomicInteger, p811 p811Var, vu30 vu30Var, o8n o8nVar) {
        this.b = bpb1Var;
        this.c = xgn0Var;
        this.d = atomicInteger;
        this.e = p811Var;
        this.f = vu30Var;
        this.g = o8nVar;
        this.a = bpb1Var;
    }

    @Override // p.at71
    public final List c() {
        return this.a.c();
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0116 A[Catch: all -> 0x0120, TryCatch #0 {all -> 0x0120, blocks: (B:45:0x0110, B:47:0x0116, B:49:0x011c, B:52:0x0122), top: B:59:0x0110 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x011c A[Catch: all -> 0x0120, TryCatch #0 {all -> 0x0120, blocks: (B:45:0x0110, B:47:0x0116, B:49:0x011c, B:52:0x0122), top: B:59:0x0110 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3, types: [java.io.Serializable, java.lang.Object, p.bpb1, p.o8n, p.vr20] */
    /* JADX WARN: Type inference failed for: r15v5, types: [p.bpb1, p.o8n, p.vr20] */
    /* JADX WARN: Type inference failed for: r15v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Type inference failed for: r7v1, types: [p.vgn0] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2, types: [p.vgn0] */
    /* JADX WARN: Type inference failed for: r9v4 */
    @Override // p.mr20
    public final Object collect(vr20 vr20Var, lnm lnmVar) {
        yx8 yx8Var;
        vr20 vr20Var2;
        vu30 vu30Var;
        o8n o8nVar;
        bpb1 bpb1Var;
        p811 p811Var;
        AtomicInteger atomicInteger;
        ?? r9;
        Object obj;
        ?? r15;
        ?? r16;
        ?? r7;
        c9n c9nVar;
        if (lnmVar instanceof yx8) {
            yx8Var = (yx8) lnmVar;
            int i = yx8Var.t;
            if ((i & Integer.MIN_VALUE) != 0) {
                yx8Var.t = i - Integer.MIN_VALUE;
            } else {
                yx8Var = new yx8(this, lnmVar);
            }
        } else {
            yx8Var = new yx8(this, lnmVar);
        }
        Object obj2 = yx8Var.h;
        int i2 = yx8Var.t;
        bpb1 bpb1Var2 = this.b;
        p811 p811Var2 = this.e;
        AtomicInteger atomicInteger2 = this.d;
        xgn0 xgn0Var = this.c;
        d9n d9nVar = d9n.a;
        if (i2 != 0) {
            try {
                if (i2 == 1) {
                    bpb1 bpb1Var3 = yx8Var.g;
                    o8n o8nVar2 = yx8Var.f;
                    vu30Var = (vu30) yx8Var.e;
                    p811 p811Var3 = (p811) yx8Var.d;
                    AtomicInteger atomicInteger3 = (AtomicInteger) yx8Var.c;
                    vgn0 vgn0Var = (vgn0) yx8Var.b;
                    vr20 vr20Var3 = yx8Var.a;
                    hm5.M(obj2);
                    bpb1Var = bpb1Var3;
                    p811Var = p811Var3;
                    o8nVar = o8nVar2;
                    atomicInteger = atomicInteger3;
                    vr20Var2 = vr20Var3;
                    r9 = vgn0Var;
                } else {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        p811Var2 = (p811) yx8Var.e;
                        atomicInteger2 = (AtomicInteger) yx8Var.d;
                        vgn0 vgn0Var2 = (vgn0) yx8Var.c;
                        th = (Throwable) yx8Var.b;
                        hm5.M(obj2);
                        r16 = 0;
                        r7 = vgn0Var2;
                        if (atomicInteger2.decrementAndGet() == 0) {
                            c9nVar = (c9n) p811Var2.a;
                            if (c9nVar != null) {
                                smo1.q(c9nVar);
                            }
                            p811Var2.a = r16;
                        }
                        throw th;
                    }
                    try {
                        hm5.M(obj2);
                        throw new KotlinNothingValueException();
                    } catch (Throwable th) {
                        th = th;
                        d9nVar = d9nVar;
                        r15 = 0;
                    }
                }
                if (atomicInteger2.decrementAndGet() == 0) {
                    c9nVar = (c9n) p811Var2.a;
                    if (c9nVar != null) {
                        smo1.q(c9nVar);
                    }
                    p811Var2.a = r16;
                }
                throw th;
            } finally {
                r7.c(r16);
            }
            yx8Var.a = r15;
            yx8Var.b = th;
            yx8Var.c = xgn0Var;
            yx8Var.d = atomicInteger2;
            yx8Var.e = p811Var2;
            yx8Var.f = r15;
            yx8Var.g = r15;
            yx8Var.t = 3;
            Object objA = xgn0Var.a(yx8Var);
            r7 = xgn0Var;
            r16 = r15;
            if (objA == d9nVar) {
                return d9nVar;
            }
        } else {
            hm5.M(obj2);
            vr20Var2 = vr20Var;
            yx8Var.a = vr20Var2;
            yx8Var.b = xgn0Var;
            yx8Var.c = atomicInteger2;
            yx8Var.d = p811Var2;
            vu30Var = this.f;
            yx8Var.e = vu30Var;
            o8n o8nVar3 = this.g;
            yx8Var.f = o8nVar3;
            yx8Var.g = bpb1Var2;
            yx8Var.t = 1;
            if (xgn0Var.a(yx8Var) == d9nVar) {
                return d9nVar;
            }
            o8nVar = o8nVar3;
            bpb1Var = bpb1Var2;
            p811Var = p811Var2;
            atomicInteger = atomicInteger2;
            r9 = xgn0Var;
        }
        try {
            if (atomicInteger.incrementAndGet() == 1 && p811Var.a == null) {
                llm llmVarE = smo1.e(yx8Var.getContext().y(op71.f()));
                p811Var.a = llmVarE;
                obj = null;
                r15 = 0;
                try {
                    c921.y(llmVarE, (o8n) null, 0, new wc5(vu30Var, o8nVar, bpb1Var, (lnm) null, (byte) 21), 3);
                } catch (Throwable th2) {
                    th = th2;
                    r9.c(obj);
                    throw th;
                }
            } else {
                r15 = 0;
            }
            r9.c(r15);
            try {
                yx8Var.a = r15;
                yx8Var.b = r15;
                yx8Var.c = r15;
                yx8Var.d = r15;
                yx8Var.e = r15;
                yx8Var.f = r15;
                yx8Var.g = r15;
                yx8Var.t = 2;
                bpb1Var2.collect(vr20Var2, yx8Var);
                return d9nVar;
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            th = th4;
            obj = null;
        }
    }

    @Override // p.zob1
    public final Object getValue() {
        return this.a.getValue();
    }
}
