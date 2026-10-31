package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class rim0 {
    public final ha4 a;
    public wdn0 b;
    public wdn0 c;
    public wdn0 d;
    public wdn0 e;
    public boolean f;

    public rim0(ha4 ha4Var) {
        this.a = ha4Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [p.pim0] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [p.pim0] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [p.bfn0] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [p.bfn0] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v4 */
    public static void b(pim0 pim0Var, yky0 yky0Var) {
        if (!pim0Var.a.N0) {
            qf80.c("visitSubtreeIf called on an unattached node");
        }
        bfn0 bfn0Var = new bfn0(0, new pim0[16]);
        pim0 pim0Var2 = pim0Var.a;
        pim0 pim0Var3 = pim0Var2.f;
        if (pim0Var3 == null) {
            oap1.d(bfn0Var, pim0Var2);
        } else {
            bfn0Var.b(pim0Var3);
        }
        while (true) {
            int i = bfn0Var.c;
            if (i == 0) {
                return;
            }
            pim0 pim0Var4 = (pim0) bfn0Var.l(i - 1);
            if ((pim0Var4.d & 32) != 0) {
                pim0 pim0Var5 = pim0Var4;
                while (true) {
                    if (pim0Var5 != null && pim0Var5.N0) {
                        if ((pim0Var5.c & 32) != 0) {
                            ?? E = pim0Var5;
                            ?? bfn0Var2 = 0;
                            while (E != 0) {
                                if (E instanceof sim0) {
                                    if (((sim0) E).U().m(yky0Var)) {
                                        break;
                                    }
                                } else if ((E.c & 32) != 0 && (E instanceof l5t)) {
                                    pim0 pim0Var6 = ((l5t) E).P0;
                                    int i2 = 0;
                                    E = E;
                                    bfn0Var2 = bfn0Var2;
                                    while (pim0Var6 != null) {
                                        if ((pim0Var6.c & 32) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                bfn0Var2 = bfn0Var2;
                                                E = pim0Var6;
                                            } else {
                                                if (bfn0Var2 == 0) {
                                                    bfn0Var2 = new bfn0(0, new pim0[16]);
                                                }
                                                if (E != 0) {
                                                    bfn0Var2.b(E);
                                                    E = 0;
                                                }
                                                bfn0Var2.b(pim0Var6);
                                            }
                                        }
                                        pim0Var6 = pim0Var6.f;
                                        E = E;
                                        bfn0Var2 = bfn0Var2;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                E = oap1.e((bfn0) bfn0Var2);
                            }
                        }
                        pim0Var5 = pim0Var5.f;
                    }
                }
            }
            oap1.d(bfn0Var, pim0Var4);
        }
    }

    public final void a() {
        if (this.f) {
            return;
        }
        this.f = true;
        g030 g030Var = new g030(this, (byte) 19);
        wdn0 wdn0Var = this.a.Q1;
        if (wdn0Var.h(g030Var) >= 0) {
            return;
        }
        wdn0Var.b(g030Var);
    }
}
