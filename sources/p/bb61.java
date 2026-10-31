package p;

import android.hardware.camera2.params.InputConfiguration;
import android.util.ArrayMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class bb61 {
    public static final List i = Arrays.asList(1, 5, 3);
    public final ArrayList a;
    public final b29 b;
    public final List c;
    public final List d;
    public final List e;
    public final ya61 f;
    public final wnd g;
    public final InputConfiguration h;

    public bb61(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, wnd wndVar, ya61 ya61Var, InputConfiguration inputConfiguration, b29 b29Var) {
        this.a = arrayList;
        this.c = Collections.unmodifiableList(arrayList2);
        this.d = Collections.unmodifiableList(arrayList3);
        this.e = Collections.unmodifiableList(arrayList4);
        this.f = ya61Var;
        this.g = wndVar;
        this.h = inputConfiguration;
        this.b = b29Var;
    }

    public static bb61 a() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(0);
        ArrayList arrayList3 = new ArrayList(0);
        ArrayList arrayList4 = new ArrayList(0);
        HashSet hashSet = new HashSet();
        xdn0 xdn0VarD = xdn0.d();
        ArrayList arrayList5 = new ArrayList();
        yen0 yen0VarA = yen0.a();
        ArrayList arrayList6 = new ArrayList(hashSet);
        eqq0 eqq0VarB = eqq0.b(xdn0VarD);
        ArrayList arrayList7 = new ArrayList(arrayList5);
        tod1 tod1Var = tod1.b;
        ArrayMap arrayMap = new ArrayMap();
        ArrayMap arrayMap2 = yen0VarA.a;
        for (String str : arrayMap2.keySet()) {
            arrayMap.put(str, arrayMap2.get(str));
        }
        return new bb61(arrayList, arrayList2, arrayList3, arrayList4, new wnd(arrayList6, eqq0VarB, -1, arrayList7, false, new tod1(arrayMap), null), null, null, null);
    }

    public final List b() {
        ArrayList arrayList = new ArrayList();
        for (b29 b29Var : this.a) {
            arrayList.add(b29Var.a);
            Iterator it = b29Var.b.iterator();
            while (it.hasNext()) {
                arrayList.add((j2t) it.next());
            }
        }
        return Collections.unmodifiableList(arrayList);
    }
}
