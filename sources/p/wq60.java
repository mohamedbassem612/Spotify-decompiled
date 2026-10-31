package p;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class wq60 extends wbe {
    @Override // p.j660, p.dil, p.u811, p.od10
    public final void apply() {
        ynb1 ynb1Var;
        ArrayList arrayList = this.m0;
        Iterator it = arrayList.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            ynb1Var = this.k0;
            if (!zHasNext) {
                break;
            } else {
                ynb1Var.b(it.next()).p();
            }
        }
        dil dilVar = null;
        dil dilVar2 = null;
        for (Object obj : arrayList) {
            dil dilVarB = ynb1Var.b(obj);
            if (dilVar2 == null) {
                Object obj2 = this.N;
                if (obj2 != null) {
                    dilVarB.O(obj2);
                    dilVarB.x(this.l).z(this.r);
                } else {
                    Object obj3 = this.O;
                    if (obj3 != null) {
                        dilVarB.j0 = 6;
                        dilVarB.O = obj3;
                        dilVarB.x(this.l).z(this.r);
                    } else {
                        Object obj4 = this.J;
                        if (obj4 != null) {
                            dilVarB.O(obj4);
                            dilVarB.x(this.j).z(this.f36p);
                        } else {
                            Object obj5 = this.K;
                            if (obj5 != null) {
                                dilVarB.j0 = 6;
                                dilVarB.O = obj5;
                                dilVarB.x(this.j).z(this.f36p);
                            } else {
                                String string = dilVarB.a.toString();
                                dilVarB.O(0);
                                dilVarB.y(Float.valueOf(e0(string))).A(Float.valueOf(d0(string)));
                            }
                        }
                    }
                }
                dilVar2 = dilVarB;
            }
            if (dilVar != null) {
                String string2 = dilVar.a.toString();
                String string3 = dilVarB.a.toString();
                Object obj6 = dilVarB.a;
                dilVar.j0 = 7;
                dilVar.P = obj6;
                dilVar.y(Float.valueOf(c0(string2))).A(Float.valueOf(b0(string2)));
                Object obj7 = dilVar.a;
                dilVarB.j0 = 6;
                dilVarB.O = obj7;
                dilVarB.y(Float.valueOf(e0(string3))).A(Float.valueOf(d0(string3)));
            }
            String string4 = obj.toString();
            HashMap map = this.o0;
            float fFloatValue = map.containsKey(string4) ? ((Float) map.get(string4)).floatValue() : -1.0f;
            if (fFloatValue != -1.0f) {
                dilVarB.f = fFloatValue;
            }
            dilVar = dilVarB;
        }
        if (dilVar != null) {
            Object obj8 = this.P;
            if (obj8 != null) {
                dilVar.j0 = 7;
                dilVar.P = obj8;
                dilVar.x(this.m).z(this.s);
            } else {
                Object obj9 = this.Q;
                if (obj9 != null) {
                    dilVar.r(obj9);
                    dilVar.x(this.m).z(this.s);
                } else {
                    Object obj10 = this.L;
                    if (obj10 != null) {
                        dilVar.j0 = 7;
                        dilVar.P = obj10;
                        dilVar.x(this.k).z(this.q);
                    } else {
                        Object obj11 = this.M;
                        if (obj11 != null) {
                            dilVar.r(obj11);
                            dilVar.x(this.k).z(this.q);
                        } else {
                            String string5 = dilVar.a.toString();
                            dilVar.r(0);
                            dilVar.y(Float.valueOf(c0(string5))).A(Float.valueOf(b0(string5)));
                        }
                    }
                }
            }
        }
        if (dilVar2 == null) {
            return;
        }
        float f = this.n0;
        if (f != 0.5f) {
            dilVar2.h = f;
        }
        int iOrdinal = this.t0.ordinal();
        if (iOrdinal == 0) {
            dilVar2.d = (byte) 0;
        } else if (iOrdinal == 1) {
            dilVar2.d = (byte) 1;
        } else {
            if (iOrdinal != 2) {
                return;
            }
            dilVar2.d = (byte) 2;
        }
    }
}
