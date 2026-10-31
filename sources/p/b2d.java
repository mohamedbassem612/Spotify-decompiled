package p;

import android.content.Context;
import android.util.ArrayMap;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class b2d implements l4i1 {
    public final oju b;

    public b2d(Context context) {
        this.b = oju.b(context);
    }

    /* JADX WARN: Code duplicated, block: B:5:0x003a  */
    @Override // p.l4i1
    public final qsk a(k4i1 k4i1Var, int i) {
        int i2;
        xdn0 xdn0VarD = xdn0.d();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        HashSet hashSet = new HashSet();
        xdn0 xdn0VarD2 = xdn0.d();
        ArrayList arrayList = new ArrayList();
        ArrayMap arrayMap = yen0.a().a;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        int iOrdinal = k4i1Var.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 3) {
                i2 = 1;
            } else {
                i2 = 3;
            }
        } else if (i == 2) {
            i2 = 5;
        } else {
            i2 = 1;
        }
        sy8 sy8Var = i4i1.A0;
        ArrayList arrayList5 = new ArrayList(linkedHashSet);
        ArrayList arrayList6 = new ArrayList(arrayList2);
        ArrayList arrayList7 = new ArrayList(arrayList3);
        ArrayList arrayList8 = new ArrayList(arrayList4);
        ArrayList arrayList9 = new ArrayList(hashSet);
        eqq0 eqq0VarB = eqq0.b(xdn0VarD2);
        ArrayList arrayList10 = new ArrayList(arrayList);
        tod1 tod1Var = tod1.b;
        ArrayMap arrayMap2 = new ArrayMap();
        for (String str : arrayMap.keySet()) {
            arrayMap2.put(str, arrayMap.get(str));
        }
        xdn0VarD.r(sy8Var, new bb61(arrayList5, arrayList6, arrayList7, arrayList8, new wnd(arrayList9, eqq0VarB, i2, arrayList10, false, new tod1(arrayMap2), null), null, null, null));
        xdn0VarD.r(i4i1.C0, a2d.a);
        HashSet hashSet2 = new HashSet();
        xdn0 xdn0VarD3 = xdn0.d();
        ArrayList arrayList11 = new ArrayList();
        ArrayMap arrayMap3 = yen0.a().a;
        int iOrdinal2 = k4i1Var.ordinal();
        int i3 = iOrdinal2 != 0 ? iOrdinal2 != 3 ? 1 : 3 : i == 2 ? 5 : 2;
        sy8 sy8Var2 = i4i1.B0;
        ArrayList arrayList12 = new ArrayList(hashSet2);
        eqq0 eqq0VarB2 = eqq0.b(xdn0VarD3);
        ArrayList arrayList13 = new ArrayList(arrayList11);
        tod1 tod1Var2 = tod1.b;
        ArrayMap arrayMap4 = new ArrayMap();
        for (String str2 : arrayMap3.keySet()) {
            arrayMap4.put(str2, arrayMap3.get(str2));
        }
        xdn0VarD.r(sy8Var2, new wnd(arrayList12, eqq0VarB2, i3, arrayList13, false, new tod1(arrayMap4), null));
        xdn0VarD.r(i4i1.D0, k4i1Var == k4i1.a ? rr70.b : v1d.a);
        k4i1 k4i1Var2 = k4i1.b;
        oju ojuVar = this.b;
        if (k4i1Var == k4i1Var2) {
            xdn0VarD.r(cx70.S, ojuVar.e());
        }
        xdn0VarD.r(cx70.N, Integer.valueOf(ojuVar.c(true).getRotation()));
        if (k4i1Var == k4i1.d || k4i1Var == k4i1.e) {
            xdn0VarD.r(i4i1.G0, Boolean.TRUE);
        }
        return eqq0.b(xdn0VarD);
    }
}
