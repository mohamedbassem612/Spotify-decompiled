package p;

import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class kge extends age {
    public final /* synthetic */ byte d;
    public final Object e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kge(moy0 moy0Var) {
        this(moy0Var, o6x.a, -2, 1, (byte) 1);
        this.d = (byte) 1;
    }

    public Object collect(vr20 vr20Var, lnm lnmVar) {
        switch (this.d) {
            case 1:
                o8n context = lnmVar.getContext();
                boolean zJ = u890.j(ulo1.n(context, ((age) this).a), context);
                d9n d9nVar = d9n.a;
                if (zJ) {
                    Object objL = l(vr20Var, lnmVar);
                    if (objL == d9nVar) {
                        return objL;
                    }
                } else {
                    Object objCollect = super.collect(vr20Var, lnmVar);
                    if (objCollect == d9nVar) {
                        return objCollect;
                    }
                }
                return rih1.a;
            default:
                return super.collect(vr20Var, lnmVar);
        }
    }

    public final Object g(ssw0 ssw0Var, lnm lnmVar) {
        byte b = this.d;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                d561 d561Var = new d561(ssw0Var);
                Iterator it = ((Iterable) this.e).iterator();
                while (it.hasNext()) {
                    fn31.T(ssw0Var, null, 0, new hsc((mr20) it.next(), d561Var, (lnm) null, (byte) 9), 3);
                }
                return rih1Var;
            default:
                o8n o8nVar = ((q6) ssw0Var).d;
                Object objL = l(new d561(ssw0Var.c()), lnmVar);
                return objL == d9n.a ? objL : rih1Var;
        }
    }

    public final age h(o8n o8nVar, int i, int i2) {
        switch (this.d) {
            case 0:
                return new kge((Iterable) this.e, o8nVar, i, i2, (byte) 0);
            default:
                return new kge((moy0) this.e, o8nVar, i, i2, (byte) 1);
        }
    }

    public jfe j(c9n c9nVar) {
        switch (this.d) {
            case 0:
                hsc hscVar = new hsc(this, (lnm) null, (byte) 7);
                rsw0 rsw0Var = new rsw0(ulo1.o(c9nVar, ((age) this).a), mno1.a(((age) this).b, 1, 4));
                rsw0Var.A0(1, rsw0Var, hscVar);
                return rsw0Var;
            default:
                return super.j(c9nVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x007d  */
    /* JADX WARN: Code duplicated, block: B:30:0x0082  */
    /* JADX WARN: Code duplicated, block: B:32:0x0086  */
    /* JADX WARN: Code duplicated, block: B:34:0x008c  */
    /* JADX WARN: Code duplicated, block: B:36:0x0090 A[Catch: all -> 0x003b, TRY_ENTER, TryCatch #0 {all -> 0x003b, blocks: (B:13:0x0035, B:39:0x00a6, B:25:0x006e, B:36:0x0090, B:41:0x00b1, B:43:0x00b5, B:44:0x00bc, B:45:0x00bf, B:20:0x004a), top: B:54:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a3, code lost:
    
        if (r13.emit(r1, r2) == r10) goto L38;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v8, types: [p.t601] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00a3 -> B:14:0x0038). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object l(p.vr20 r17, p.lnm r18) {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.kge.l(p.vr20, p.lnm):java.lang.Object");
    }

    public long m() {
        if (((age) this).c == 1) {
            int i = ((age) this).b;
            if (i == -2) {
                jfe.w.getClass();
                return ffe.b;
            }
            if (i == 0) {
                return 1L;
            }
            if (i != Integer.MAX_VALUE) {
                long j = i;
                if (j >= 1) {
                    return j;
                }
                eg.m("Check failed.");
                return 0L;
            }
        }
        return Long.MAX_VALUE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kge(Object obj, o8n o8nVar, int i, int i2, byte b) {
        super(o8nVar, i, i2);
        this.d = b;
        this.e = obj;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kge(Iterable iterable) {
        this(iterable, o6x.a, -2, 1, (byte) 0);
        this.d = (byte) 0;
    }
}
