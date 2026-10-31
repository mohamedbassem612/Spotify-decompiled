package p;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class fj3 extends j660 {
    public final /* synthetic */ byte n0;
    public float o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fj3(ynb1 ynb1Var, int i, byte b) {
        super(ynb1Var, i);
        this.n0 = b;
    }

    @Override // p.j660, p.dil, p.u811, p.od10
    public final void apply() {
        byte b = this.n0;
        ynb1 ynb1Var = this.k0;
        ArrayList arrayList = this.m0;
        switch (b) {
            case 0:
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    dil dilVarB = ynb1Var.b(it.next());
                    dilVarB.p();
                    Object obj = this.N;
                    if (obj != null) {
                        dilVarB.O(obj);
                    } else {
                        Object obj2 = this.O;
                        if (obj2 != null) {
                            dilVarB.j0 = 6;
                            dilVarB.O = obj2;
                        } else {
                            dilVarB.O(0);
                        }
                    }
                    Object obj3 = this.P;
                    if (obj3 != null) {
                        dilVarB.j0 = 7;
                        dilVarB.P = obj3;
                    } else {
                        Object obj4 = this.Q;
                        if (obj4 != null) {
                            dilVarB.r(obj4);
                        } else {
                            dilVarB.r(0);
                        }
                    }
                    float f = this.o0;
                    if (f != 0.5f) {
                        dilVarB.h = f;
                    }
                }
                break;
            default:
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    dil dilVarB2 = ynb1Var.b(it2.next());
                    dilVarB2.q();
                    Object obj5 = this.R;
                    if (obj5 != null) {
                        dilVarB2.R(obj5);
                    } else {
                        Object obj6 = this.S;
                        if (obj6 != null) {
                            dilVarB2.Q(obj6);
                        } else {
                            dilVarB2.R(0);
                        }
                    }
                    Object obj7 = this.U;
                    if (obj7 != null) {
                        dilVarB2.m(obj7);
                    } else {
                        Object obj8 = this.V;
                        if (obj8 != null) {
                            dilVarB2.l(obj8);
                        } else {
                            dilVarB2.l(0);
                        }
                    }
                    float f2 = this.o0;
                    if (f2 != 0.5f) {
                        dilVarB2.i = f2;
                    }
                }
                break;
        }
    }
}
