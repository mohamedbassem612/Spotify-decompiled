package p;

import io.reactivex.rxjava3.disposables.Disposable;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class bjk0 {
    public final tp91 a;
    public final zeu0 b;
    public final ov20 c;
    public final suz e;
    public final idd1 d = new idd1(new z8i0(this, (byte) 26));
    public final LinkedHashMap f = new LinkedHashMap();
    public final LinkedHashMap g = new LinkedHashMap();

    public bjk0(tp91 tp91Var, zeu0 zeu0Var, ov20 ov20Var, t8u0 t8u0Var, dg30 dg30Var) {
        this.a = tp91Var;
        this.b = zeu0Var;
        this.c = ov20Var;
        this.e = t8u0Var.a(((f0i) dg30Var).a).c();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0088, code lost:
    
        if (r10 == r6) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.String r9, p.onm r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof p.xik0
            if (r0 == 0) goto L13
            r0 = r10
            p.xik0 r0 = (p.xik0) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            p.xik0 r0 = new p.xik0
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.b
            int r1 = r0.d
            r2 = 0
            p.rih1 r3 = p.rih1.a
            r4 = 2
            r5 = 1
            p.d9n r6 = p.d9n.a
            if (r1 == 0) goto L3b
            if (r1 == r5) goto L35
            if (r1 != r4) goto L2f
            java.lang.String r9 = r0.a
            p.hm5.M(r10)
            goto L8b
        L2f:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r8)
            return r2
        L35:
            java.lang.String r9 = r0.a
            p.hm5.M(r10)
            goto L49
        L3b:
            p.hm5.M(r10)
            r0.a = r9
            r0.d = r5
            java.lang.Object r10 = r8.c(r0)
            if (r10 != r6) goto L49
            goto L8a
        L49:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 != 0) goto L52
            return r3
        L52:
            java.util.LinkedHashMap r10 = r8.g
            java.lang.Object r1 = r10.get(r9)
            io.reactivex.rxjava3.disposables.Disposable r1 = (io.reactivex.rxjava3.disposables.Disposable) r1
            if (r1 == 0) goto L5f
            r1.dispose()
        L5f:
            p.idd1 r1 = r8.d
            java.lang.Object r7 = r1.getValue()
            p.ki91 r7 = (p.ki91) r7
            p.hj91 r7 = (p.hj91) r7
            io.reactivex.rxjava3.core.Observable r7 = r7.d(r9)
            io.reactivex.rxjava3.disposables.Disposable r7 = r7.subscribe()
            r10.put(r9, r7)
            java.lang.Object r10 = r1.getValue()
            p.ki91 r10 = (p.ki91) r10
            p.hj91 r10 = (p.hj91) r10
            io.reactivex.rxjava3.core.Observable r10 = r10.d(r9)
            r0.a = r9
            r0.d = r4
            java.lang.Object r10 = p.fc11.l(r10, r5, r2, r0)
            if (r10 != r6) goto L8b
        L8a:
            return r6
        L8b:
            p.sp91 r10 = (p.sp91) r10
            p.rp91 r10 = r10.a
            java.util.LinkedHashMap r8 = r8.f
            r8.put(r9, r10)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p.bjk0.a(java.lang.String, p.onm):java.lang.Object");
    }

    public final void b(String str) {
        Disposable disposable = (Disposable) this.g.remove(str);
        if (disposable != null) {
            disposable.dispose();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(onm onmVar) {
        yik0 yik0Var;
        boolean zG;
        if (onmVar instanceof yik0) {
            yik0Var = (yik0) onmVar;
            int i = yik0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                yik0Var.c = i - Integer.MIN_VALUE;
            } else {
                yik0Var = new yik0(this, onmVar);
            }
        } else {
            yik0Var = new yik0(this, onmVar);
        }
        Object objI = yik0Var.a;
        int i2 = yik0Var.c;
        try {
            if (i2 == 0) {
                hm5.M(objI);
                ezc ezcVar = this.c.a;
                yik0Var.c = 1;
                objI = b5p1.i(ezcVar, yik0Var);
                d9n d9nVar = d9n.a;
                if (objI == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objI);
            }
            zG = y7y0.G((Map) objI);
        } catch (Throwable unused) {
            zG = false;
        }
        return Boolean.valueOf(zG);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x009e  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a2 A[Catch: all -> 0x00b9, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x00b9, blocks: (B:14:0x0030, B:38:0x00a2), top: B:45:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b6, code lost:
    
        if (p.fc11.i(r12, r0) == r8) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(java.lang.String r11, p.onm r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof p.zik0
            if (r0 == 0) goto L13
            r0 = r12
            p.zik0 r0 = (p.zik0) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            p.zik0 r0 = new p.zik0
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.c
            int r1 = r0.e
            p.idd1 r2 = r10.d
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            p.rih1 r7 = p.rih1.a
            p.d9n r8 = p.d9n.a
            if (r1 == 0) goto L53
            if (r1 == r5) goto L47
            if (r1 == r4) goto L3b
            if (r1 != r3) goto L35
            java.lang.String r11 = r0.a
            p.hm5.M(r12)     // Catch: java.lang.Throwable -> Lb9
            goto Lb9
        L35:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r10)
            return r6
        L3b:
            p.rp91 r11 = r0.b
            java.lang.String r1 = r0.a
            p.hm5.M(r12)
            r9 = r12
            r12 = r11
            r11 = r1
            r1 = r9
            goto L96
        L47:
            p.rp91 r11 = r0.b
            java.lang.String r1 = r0.a
            p.hm5.M(r12)
            r9 = r12
            r12 = r11
            r11 = r1
            r1 = r9
            goto L71
        L53:
            p.hm5.M(r12)
            java.util.LinkedHashMap r12 = r10.f
            java.lang.Object r12 = r12.remove(r11)
            p.rp91 r12 = (p.rp91) r12
            if (r12 != 0) goto L64
            r10.b(r11)
            return r7
        L64:
            r0.a = r11
            r0.b = r12
            r0.e = r5
            java.lang.Object r1 = r10.c(r0)
            if (r1 != r8) goto L71
            goto Lb8
        L71:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L7d
            r10.b(r11)
            return r7
        L7d:
            java.lang.Object r1 = r2.getValue()
            p.ki91 r1 = (p.ki91) r1
            p.hj91 r1 = (p.hj91) r1
            io.reactivex.rxjava3.core.Observable r1 = r1.d(r11)
            r0.a = r11
            r0.b = r12
            r0.e = r4
            java.lang.Object r1 = p.fc11.l(r1, r5, r6, r0)
            if (r1 != r8) goto L96
            goto Lb8
        L96:
            p.sp91 r1 = (p.sp91) r1
            p.rp91 r1 = r1.a
            p.rp91 r4 = p.rp91.a
            if (r1 == r4) goto La2
            r10.b(r11)
            return r7
        La2:
            java.lang.Object r1 = r2.getValue()     // Catch: java.lang.Throwable -> Lb9
            p.ki91 r1 = (p.ki91) r1     // Catch: java.lang.Throwable -> Lb9
            io.reactivex.rxjava3.core.Completable r12 = p.ki91.a(r1, r11, r12)     // Catch: java.lang.Throwable -> Lb9
            r0.a = r11     // Catch: java.lang.Throwable -> Lb9
            r0.b = r6     // Catch: java.lang.Throwable -> Lb9
            r0.e = r3     // Catch: java.lang.Throwable -> Lb9
            java.lang.Object r12 = p.fc11.i(r12, r0)     // Catch: java.lang.Throwable -> Lb9
            if (r12 != r8) goto Lb9
        Lb8:
            return r8
        Lb9:
            r10.b(r11)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p.bjk0.d(java.lang.String, p.onm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:49:0x00be A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:56:0x00a3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0083, code lost:
    
        if (p.fc11.i(r11, r0) == r8) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(java.lang.String r10, p.onm r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof p.ajk0
            if (r0 == 0) goto L13
            r0 = r11
            p.ajk0 r0 = (p.ajk0) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            p.ajk0 r0 = new p.ajk0
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.c
            int r1 = r0.e
            p.rih1 r2 = p.rih1.a
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            p.d9n r8 = p.d9n.a
            if (r1 == 0) goto L54
            if (r1 == r6) goto L4e
            if (r1 == r5) goto L42
            if (r1 == r4) goto L3c
            if (r1 != r3) goto L36
            java.lang.Object r9 = r0.b
            p.hm5.M(r11)     // Catch: java.lang.Throwable -> Lba
            goto Lb8
        L36:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r9)
            return r7
        L3c:
            java.lang.Object r10 = r0.b
            p.hm5.M(r11)
            goto L9b
        L42:
            java.lang.Object r10 = r0.b
            p.bjk0 r10 = (p.bjk0) r10
            java.lang.String r10 = r0.a
            p.hm5.M(r11)     // Catch: java.lang.Throwable -> L4c
            goto L8b
        L4c:
            r11 = move-exception
            goto L86
        L4e:
            java.lang.String r10 = r0.a
            p.hm5.M(r11)
            goto L62
        L54:
            p.hm5.M(r11)
            r0.a = r10
            r0.e = r6
            java.lang.Object r11 = r9.c(r0)
            if (r11 != r8) goto L62
            goto Lb6
        L62:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 != 0) goto L6b
            return r2
        L6b:
            p.idd1 r11 = r9.d     // Catch: java.lang.Throwable -> L4c
            java.lang.Object r11 = r11.getValue()     // Catch: java.lang.Throwable -> L4c
            p.ki91 r11 = (p.ki91) r11     // Catch: java.lang.Throwable -> L4c
            p.rp91 r1 = p.rp91.a     // Catch: java.lang.Throwable -> L4c
            io.reactivex.rxjava3.core.Completable r11 = p.ki91.a(r11, r10, r1)     // Catch: java.lang.Throwable -> L4c
            r0.a = r10     // Catch: java.lang.Throwable -> L4c
            r0.b = r7     // Catch: java.lang.Throwable -> L4c
            r0.e = r5     // Catch: java.lang.Throwable -> L4c
            java.lang.Object r11 = p.fc11.i(r11, r0)     // Catch: java.lang.Throwable -> L4c
            if (r11 != r8) goto L8b
            goto Lb6
        L86:
            p.m231 r2 = new p.m231
            r2.<init>(r11)
        L8b:
            r0.a = r7
            r0.b = r2
            r0.e = r4
            p.zeu0 r11 = r9.b
            java.lang.Object r11 = p.r4p1.r(r11, r10, r0)
            if (r11 != r8) goto L9a
            goto Lb6
        L9a:
            r10 = r2
        L9b:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto Lbe
            p.suz r9 = r9.e     // Catch: java.lang.Throwable -> Lbc
            r11 = 0
            io.reactivex.rxjava3.core.Single r9 = r9.a(r11)     // Catch: java.lang.Throwable -> Lbc
            r0.a = r7     // Catch: java.lang.Throwable -> Lbc
            r0.b = r10     // Catch: java.lang.Throwable -> Lbc
            r0.e = r3     // Catch: java.lang.Throwable -> Lbc
            java.lang.Object r11 = p.fc11.j(r9, r0)     // Catch: java.lang.Throwable -> Lbc
            if (r11 != r8) goto Lb7
        Lb6:
            return r8
        Lb7:
            r9 = r10
        Lb8:
            p.feh r11 = (p.feh) r11     // Catch: java.lang.Throwable -> Lba
        Lba:
            r10 = r9
            goto Lbe
        Lbc:
            r9 = r10
            goto Lba
        Lbe:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p.bjk0.e(java.lang.String, p.onm):java.lang.Object");
    }
}
