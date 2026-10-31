package p;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class gx2 {
    public final jr2 a;
    public final a2n b;
    public final qt2 c;
    public final e1y d;
    public final q8n e;

    public gx2(jr2 jr2Var, a2n a2nVar, qt2 qt2Var, e1y e1yVar, q8n q8nVar) {
        this.a = jr2Var;
        this.b = a2nVar;
        this.c = qt2Var;
        this.d = e1yVar;
        this.e = q8nVar;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x006a A[PHI: r5 r7
      0x006a: PHI (r5v3 p.rq2) = (r5v0 p.rq2), (r5v4 p.rq2) binds: [B:15:0x0033, B:20:0x0067] A[DONT_GENERATE, DONT_INLINE]
      0x006a: PHI (r7v2 java.lang.String) = (r7v0 java.lang.String), (r7v3 java.lang.String) binds: [B:15:0x0033, B:20:0x0067] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:25:0x0075  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(rq2 rq2Var, boolean z, String str, onm onmVar) {
        bx2 bx2Var;
        String strA;
        if (onmVar instanceof bx2) {
            bx2Var = (bx2) onmVar;
            int i = bx2Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                bx2Var.e = i - Integer.MIN_VALUE;
            } else {
                bx2Var = new bx2(this, onmVar);
            }
        } else {
            bx2Var = new bx2(this, onmVar);
        }
        Object objI = bx2Var.c;
        int i2 = bx2Var.e;
        if (i2 == 0) {
            hm5.M(objI);
            if (z) {
                e1y e1yVar = this.d;
                pzs pzsVar = new pzs(rqt0.u(((bw20) e1yVar.a).c("dj-language", "")), e1yVar, (byte) 20);
                bx2Var.a = rq2Var;
                bx2Var.b = str;
                bx2Var.e = 1;
                objI = b5p1.i(pzsVar, bx2Var);
                d9n d9nVar = d9n.a;
                if (objI == d9nVar) {
                    return d9nVar;
                }
            } else {
                strA = null;
            }
            return new dt2(rq2Var.b(), ihc1.y0(str) ? null : str, strA);
        }
        if (i2 != 1) {
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        str = bx2Var.b;
        rq2Var = bx2Var.a;
        hm5.M(objI);
        strA = ((xnu) objI).a();
        if (ihc1.y0(strA)) {
            strA = null;
        }
        return new dt2(rq2Var.b(), ihc1.y0(str) ? null : str, strA);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(onm onmVar) {
        cx2 cx2Var;
        if (onmVar instanceof cx2) {
            cx2Var = (cx2) onmVar;
            int i = cx2Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                cx2Var.c = i - Integer.MIN_VALUE;
            } else {
                cx2Var = new cx2(this, onmVar);
            }
        } else {
            cx2Var = new cx2(this, onmVar);
        }
        Object objA = cx2Var.a;
        int i2 = cx2Var.c;
        try {
            if (i2 == 0) {
                hm5.M(objA);
                qt2 qt2Var = this.c;
                cx2Var.c = 1;
                objA = qt2Var.a(cx2Var);
                d9n d9nVar = d9n.a;
                if (objA == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objA);
            }
            return (ot2) objA;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0108  */
    /* JADX WARN: Code duplicated, block: B:30:0x0111  */
    /* JADX WARN: Code duplicated, block: B:31:0x011a  */
    /* JADX WARN: Code duplicated, block: B:34:0x013e  */
    /* JADX WARN: Code duplicated, block: B:42:0x019a  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0164, code lost:
    
        if (r10.L(r0, r9) == r13) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01ba, code lost:
    
        if (r10.R(r3, r9) == r13) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(java.util.List r17, java.lang.String r18, p.rq2 r19, java.lang.String r20, java.lang.String r21, p.onm r22) {
        /*
            Method dump skipped, instruction units count: 478
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.gx2.c(java.util.List, java.lang.String, p.rq2, java.lang.String, java.lang.String, p.onm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:14:0x004f A[PHI: r0 r3 r5 r7 r8 r9
      0x004f: PHI (r0v19 boolean) = (r0v17 boolean), (r0v21 boolean) binds: [B:55:0x02cb, B:13:0x003b] A[DONT_GENERATE, DONT_INLINE]
      0x004f: PHI (r3v22 boolean) = (r3v20 boolean), (r3v23 boolean) binds: [B:55:0x02cb, B:13:0x003b] A[DONT_GENERATE, DONT_INLINE]
      0x004f: PHI (r5v15 p.a2n) = (r5v13 p.a2n), (r5v16 p.a2n) binds: [B:55:0x02cb, B:13:0x003b] A[DONT_GENERATE, DONT_INLINE]
      0x004f: PHI (r7v24 p.ls2) = (r7v21 p.ls2), (r7v26 p.ls2) binds: [B:55:0x02cb, B:13:0x003b] A[DONT_GENERATE, DONT_INLINE]
      0x004f: PHI (r8v24 java.lang.String) = (r8v20 java.lang.String), (r8v29 java.lang.String) binds: [B:55:0x02cb, B:13:0x003b] A[DONT_GENERATE, DONT_INLINE]
      0x004f: PHI (r9v14 java.lang.String) = (r9v12 java.lang.String), (r9v15 java.lang.String) binds: [B:55:0x02cb, B:13:0x003b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:29:0x017e  */
    /* JADX WARN: Code duplicated, block: B:32:0x018c  */
    /* JADX WARN: Code duplicated, block: B:35:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:39:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:43:0x0222  */
    /* JADX WARN: Code duplicated, block: B:46:0x0231  */
    /* JADX WARN: Code duplicated, block: B:49:0x0275  */
    /* JADX WARN: Code duplicated, block: B:53:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:59:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x02f8, code lost:
    
        if (r5.t(r4, r8, r2) == r6) goto L62;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(java.lang.String r19, p.rq2 r20, java.lang.String r21, boolean r22, boolean r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, p.us2 r28, java.lang.String r29, p.onm r30) {
        /*
            Method dump skipped, instruction units count: 810
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.gx2.d(java.lang.String, p.rq2, java.lang.String, boolean, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, p.us2, java.lang.String, p.onm):java.lang.Object");
    }
}
