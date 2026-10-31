package p;

import io.reactivex.rxjava3.functions.Action;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class o68 implements Action {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public o68(p68 p68Var, String str, int i, tv80 tv80Var) {
        this.d = p68Var;
        this.c = str;
        this.b = i;
        this.e = tv80Var;
    }

    public final void run() {
        byte b = this.a;
        String str = this.c;
        int i = this.b;
        Object obj = this.e;
        Object obj2 = this.d;
        switch (b) {
            case 0:
                u961 u961Var = (u961) ((p68) obj2).c;
                ((vhs0) u961Var.d).a = str;
                vb2.b((vb2) ((ynb0) u961Var.b).get(), new db2(i), true, (tv80) obj);
                break;
            default:
                aas aasVar = (aas) obj2;
                zy1 zy1Var = (bz1) obj;
                if (!(zy1Var instanceof az1)) {
                    if (!(zy1Var instanceof zy1)) {
                        eg.o();
                    } else {
                        fcz0 fcz0Var = aasVar.c;
                        int iOrdinal = zy1Var.ordinal();
                        if (iOrdinal != 0) {
                            if (iOrdinal == 1) {
                                fcz0Var.a(2131962627);
                            } else if (iOrdinal != 2) {
                                if (iOrdinal != 3) {
                                    if (iOrdinal == 4) {
                                        fcz0Var.a(2131962628);
                                    } else if (iOrdinal != 5) {
                                        eg.o();
                                    } else {
                                        fcz0Var.a(2131962626);
                                    }
                                }
                            }
                        }
                        er91 er91Var = fcz0Var.e;
                        kt91 kt91Var = fcz0Var.a;
                        if (!kt91Var.g()) {
                            kt91Var.o(er91Var);
                        } else {
                            kt91Var.k(er91Var);
                        }
                    }
                    break;
                } else {
                    int i2 = z9s.a[l1d.C(i)];
                    s4z0 s4z0Var = aasVar.b;
                    ou80 ou80Var = null;
                    if (i2 != 1) {
                        if (ihc1.y0(str)) {
                            str = null;
                        }
                        if (str != null) {
                            ou80.Companion.getClass();
                            ou80Var = new ou80(str);
                        }
                        s4z0Var.a(ou80Var, false);
                    } else {
                        if (ihc1.y0(str)) {
                            str = null;
                        }
                        if (str != null) {
                            ou80.Companion.getClass();
                            ou80Var = new ou80(str);
                        }
                        s4z0Var.a(ou80Var, true);
                    }
                }
                break;
        }
    }

    public o68(aas aasVar, bz1 bz1Var, int i, String str) {
        this.d = aasVar;
        this.e = bz1Var;
        this.b = i;
        this.c = str;
    }
}
