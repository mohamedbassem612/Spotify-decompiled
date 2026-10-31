package p;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.TreeMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class yft implements Function0 {
    public final /* synthetic */ byte a;
    public final mgt b;

    public /* synthetic */ yft(mgt mgtVar, byte b) {
        this.a = b;
        this.b = mgtVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: p.i9n */
    public final Object invoke() throws i9n {
        byte b = this.a;
        mgt mgtVar = this.b;
        switch (b) {
            case 0:
                mla0 mla0Var = mgtVar.h;
                String str = mgtVar.i;
                String str2 = mgtVar.t;
                mla0Var.getClass();
                mbh0 mbh0VarD = mla0.a.d(str2);
                if (mbh0VarD != null) {
                    String str3 = (String) ((kbh0) mbh0VarD.a()).get(1);
                    tdy0 tdy0VarE = mla0Var.E(Integer.parseInt(str3));
                    if (tdy0VarE != null) {
                        return tdy0VarE;
                    }
                    StringBuilder sbT = l1d.t("Local property #", str3, " not found in ");
                    sbT.append(mla0Var.n());
                    throw new i9n(sbT.toString());
                }
                Collection collectionH = mla0Var.H(ajn0.e(str));
                ArrayList arrayList = new ArrayList();
                for (Object obj : collectionH) {
                    if (u890.j(i141.b((tdy0) obj).n(), str2)) {
                        arrayList.add(obj);
                    }
                }
                if (arrayList.isEmpty()) {
                    StringBuilder sbN = gvg.n("Property '", str, "' (JVM signature: ", str2, ") not resolved in ");
                    sbN.append(mla0Var);
                    throw new i9n(sbN.toString());
                }
                if (arrayList.size() == 1) {
                    return (tdy0) o7h.V0(arrayList);
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj2 : arrayList) {
                    lht visibility = ((tdy0) obj2).getVisibility();
                    Object arrayList2 = linkedHashMap.get(visibility);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                        linkedHashMap.put(visibility, arrayList2);
                    }
                    ((List) arrayList2).add(obj2);
                }
                TreeMap treeMap = new TreeMap((Comparator) new cvt((byte) 20));
                treeMap.putAll(linkedHashMap);
                List list = (List) o7h.z0(treeMap.values());
                if (list.size() == 1) {
                    return (tdy0) o7h.q0(list);
                }
                String strY0 = o7h.y0(mla0Var.H(ajn0.e(str)), "\n", (String) null, (String) null, aht.U0, 30);
                StringBuilder sbN2 = gvg.n("Property '", str, "' (JVM signature: ", str2, ") not resolved in ");
                sbN2.append(mla0Var);
                sbN2.append(':');
                sbN2.append(strY0.length() == 0 ? " no members found" : "\n".concat(strY0));
                throw new i9n(sbN2.toString());
            default:
                return mgtVar.getCaller().getReturnType();
        }
    }
}
