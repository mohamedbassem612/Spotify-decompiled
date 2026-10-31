package p;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class m5j1 extends wbe {
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
                ynb1Var.b(it.next()).q();
            }
        }
        dil dilVar = null;
        dil dilVar2 = null;
        for (Object obj : arrayList) {
            dil dilVarB = ynb1Var.b(obj);
            if (dilVar2 == null) {
                Object obj2 = this.R;
                if (obj2 != null) {
                    dilVarB.R(obj2);
                    dilVarB.x(this.n).z(this.t);
                } else {
                    Object obj3 = this.S;
                    if (obj3 != null) {
                        dilVarB.Q(obj3);
                        dilVarB.x(this.n).z(this.t);
                    } else {
                        String string = dilVarB.a.toString();
                        dilVarB.R(0);
                        dilVarB.y(Float.valueOf(e0(string))).A(Float.valueOf(d0(string)));
                    }
                }
                dilVar2 = dilVarB;
            }
            if (dilVar != null) {
                String string2 = dilVar.a.toString();
                String string3 = dilVarB.a.toString();
                dilVar.m(dilVarB.a);
                dilVar.y(Float.valueOf(c0(string2))).A(Float.valueOf(b0(string2)));
                dilVarB.Q(dilVar.a);
                dilVarB.y(Float.valueOf(e0(string3))).A(Float.valueOf(d0(string3)));
            }
            String string4 = obj.toString();
            HashMap map = this.o0;
            float fFloatValue = map.containsKey(string4) ? ((Float) map.get(string4)).floatValue() : -1.0f;
            if (fFloatValue != -1.0f) {
                dilVarB.g = fFloatValue;
            }
            dilVar = dilVarB;
        }
        if (dilVar != null) {
            Object obj4 = this.U;
            if (obj4 != null) {
                dilVar.m(obj4);
                dilVar.x(this.o).z(this.u);
            } else {
                Object obj5 = this.V;
                if (obj5 != null) {
                    dilVar.l(obj5);
                    dilVar.x(this.o).z(this.u);
                } else {
                    String string5 = dilVar.a.toString();
                    dilVar.l(0);
                    dilVar.y(Float.valueOf(c0(string5))).A(Float.valueOf(b0(string5)));
                }
            }
        }
        if (dilVar2 == null) {
            return;
        }
        float f = this.n0;
        if (f != 0.5f) {
            dilVar2.i = f;
        }
        int iOrdinal = this.t0.ordinal();
        if (iOrdinal == 0) {
            dilVar2.e = (byte) 0;
        } else if (iOrdinal == 1) {
            dilVar2.e = (byte) 1;
        } else {
            if (iOrdinal != 2) {
                return;
            }
            dilVar2.e = (byte) 2;
        }
    }
}
