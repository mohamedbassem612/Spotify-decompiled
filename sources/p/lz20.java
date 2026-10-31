package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class lz20 {
    public static final lz20 b = new lz20();
    public static final lz20 c = new lz20();
    public static final lz20 d = new lz20();
    public final bfn0 a = new bfn0(0, new nz20[16]);

    public static boolean b(lz20 lz20Var) {
        lz20Var.getClass();
        if (lz20Var == b) {
            eg.m("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
            return false;
        }
        if (lz20Var == c) {
            eg.m("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
            return false;
        }
        bfn0 bfn0Var = lz20Var.a;
        int i = bfn0Var.c;
        if (i == 0) {
            System.out.println((Object) "FocusRelatedWarning: \n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
            return false;
        }
        Object[] objArr = bfn0Var.a;
        boolean z = false;
        for (int i2 = 0; i2 < i; i2++) {
            pim0 pim0Var = (nz20) objArr[i2];
            if (!pim0Var.a.N0) {
                qf80.c("visitChildren called on an unattached node");
            }
            bfn0 bfn0Var2 = new bfn0(0, new pim0[16]);
            pim0 pim0Var2 = pim0Var.a;
            pim0 pim0Var3 = pim0Var2.f;
            if (pim0Var3 == null) {
                oap1.g(bfn0Var2, pim0Var2);
            } else {
                bfn0Var2.b(pim0Var3);
            }
            while (true) {
                int i3 = bfn0Var2.c;
                if (i3 == 0) {
                    break;
                }
                pim0 pim0VarS = (pim0) bfn0Var2.l(i3 - 1);
                if ((pim0VarS.d & 1024) == 0) {
                    oap1.g(bfn0Var2, pim0VarS);
                } else {
                    while (pim0VarS != null) {
                        if ((pim0VarS.c & 1024) != 0) {
                            bfn0 bfn0Var3 = null;
                            while (pim0VarS != null) {
                                if (pim0VarS instanceof d030) {
                                    if (((d030) pim0VarS).N1(7)) {
                                        z = true;
                                        break;
                                    }
                                } else if ((pim0VarS.c & 1024) != 0 && (pim0VarS instanceof l5t)) {
                                    int i4 = 0;
                                    for (pim0 pim0Var4 = ((l5t) pim0VarS).P0; pim0Var4 != null; pim0Var4 = pim0Var4.f) {
                                        if ((pim0Var4.c & 1024) != 0) {
                                            i4++;
                                            if (i4 == 1) {
                                                pim0VarS = pim0Var4;
                                            } else {
                                                if (bfn0Var3 == null) {
                                                    bfn0Var3 = new bfn0(0, new pim0[16]);
                                                }
                                                if (pim0VarS != null) {
                                                    bfn0Var3.b(pim0VarS);
                                                    pim0VarS = null;
                                                }
                                                bfn0Var3.b(pim0Var4);
                                            }
                                        }
                                    }
                                    if (i4 == 1) {
                                    }
                                }
                                pim0VarS = oap1.s(bfn0Var3);
                            }
                            break;
                        }
                        pim0VarS = pim0VarS.f;
                    }
                }
            }
        }
        return z;
    }

    public final bfn0 a() {
        return this.a;
    }
}
