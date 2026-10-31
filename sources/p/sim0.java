package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public interface sim0 extends x4t {
    default j2h1 U() {
        return c7x.d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12, types: [p.pim0] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15, types: [p.pim0] */
    /* JADX WARN: Type inference failed for: r1v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [p.bfn0] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [p.bfn0] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r9v0, types: [p.sim0, p.x4t] */
    default Object n1(yky0 yky0Var) {
        jdo0 jdo0Var;
        pim0 pim0Var = (pim0) this;
        if (!pim0Var.a.N0) {
            qf80.a("ModifierLocal accessed from an unattached node");
        }
        if (!pim0Var.a.N0) {
            qf80.c("visitAncestors called on an unattached node");
        }
        pim0 pim0Var2 = pim0Var.a.e;
        hmb0 hmb0VarB = oap1.B((x4t) this);
        while (hmb0VarB != null) {
            if ((((pim0) hmb0VarB.e1.g).d & 32) != 0) {
                while (pim0Var2 != null) {
                    if ((pim0Var2.c & 32) != 0) {
                        ?? E = pim0Var2;
                        ?? bfn0Var = 0;
                        while (E != 0) {
                            if (E instanceof sim0) {
                                sim0 sim0Var = (sim0) E;
                                if (sim0Var.U().m(yky0Var)) {
                                    return sim0Var.U().r(yky0Var);
                                }
                            } else if ((E.c & 32) != 0 && (E instanceof l5t)) {
                                pim0 pim0Var3 = ((l5t) E).P0;
                                int i = 0;
                                E = E;
                                bfn0Var = bfn0Var;
                                while (pim0Var3 != null) {
                                    if ((pim0Var3.c & 32) != 0) {
                                        i++;
                                        if (i == 1) {
                                            bfn0Var = bfn0Var;
                                            E = pim0Var3;
                                        } else {
                                            if (bfn0Var == 0) {
                                                bfn0Var = new bfn0(0, new pim0[16]);
                                            }
                                            if (E != 0) {
                                                bfn0Var.b(E);
                                                E = 0;
                                            }
                                            bfn0Var.b(pim0Var3);
                                        }
                                    }
                                    pim0Var3 = pim0Var3.f;
                                    E = E;
                                    bfn0Var = bfn0Var;
                                }
                                if (i == 1) {
                                }
                            }
                            E = oap1.e((bfn0) bfn0Var);
                        }
                    }
                    pim0Var2 = pim0Var2.e;
                }
            }
            hmb0VarB = hmb0VarB.v();
            pim0Var2 = (hmb0VarB == null || (jdo0Var = hmb0VarB.e1) == null) ? null : (gpd1) jdo0Var.f;
        }
        return yky0Var.a().invoke();
    }
}
