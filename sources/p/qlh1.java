package p;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class qlh1 {
    public static final Set a;
    public static final HashMap b;
    public static final HashMap c;
    public static final LinkedHashSet d;

    static {
        plh1[] plh1VarArrValues = plh1.values();
        ArrayList arrayList = new ArrayList(plh1VarArrValues.length);
        for (plh1 plh1Var : plh1VarArrValues) {
            arrayList.add(plh1Var.b);
        }
        a = o7h.p1(arrayList);
        olh1[] olh1VarArrValues = olh1.values();
        ArrayList arrayList2 = new ArrayList(olh1VarArrValues.length);
        for (olh1 olh1Var : olh1VarArrValues) {
            arrayList2.add(olh1Var.a);
        }
        o7h.p1(arrayList2);
        b = new HashMap();
        c = new HashMap();
        sqg0.H(new mmr0[]{new mmr0(olh1.UBYTEARRAY, ajn0.e("ubyteArrayOf")), new mmr0(olh1.USHORTARRAY, ajn0.e("ushortArrayOf")), new mmr0(olh1.UINTARRAY, ajn0.e("uintArrayOf")), new mmr0(olh1.ULONGARRAY, ajn0.e("ulongArrayOf"))});
        plh1[] plh1VarArrValues2 = plh1.values();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (plh1 plh1Var2 : plh1VarArrValues2) {
            linkedHashSet.add(plh1Var2.c.f());
        }
        d = linkedHashSet;
        for (plh1 plh1Var3 : plh1.values()) {
            HashMap map = b;
            heg hegVar = plh1Var3.c;
            heg hegVar2 = plh1Var3.a;
            map.put(hegVar, hegVar2);
            c.put(hegVar2, plh1Var3.c);
        }
    }

    public static final boolean a(a8b0 a8b0Var) {
        jfg jfgVarS;
        if (o1h1.l(a8b0Var) || (jfgVarS = a8b0Var.t0().s()) == null) {
            return false;
        }
        n9r n9rVarK = jfgVarS.k();
        return (n9rVarK instanceof dzq0) && u890.j(((ezq0) ((dzq0) n9rVarK)).f, sfb1.l) && a.contains(jfgVarS.getName());
    }
}
