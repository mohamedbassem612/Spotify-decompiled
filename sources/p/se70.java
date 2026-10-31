package p;

import java.util.ArrayList;
import java.util.List;
import kotlinx.serialization.SerializationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class se70 implements nma0 {
    public static final se70 a = new se70();
    public static final h661 b = u6k1.Companion.serializer().getDescriptor();

    public final Object deserialize(dar darVar) {
        ArrayList arrayList;
        ArrayList arrayList2;
        if ((darVar instanceof bga0 ? (bga0) darVar : null) == null) {
            uh61.j("Hubs requires JSON");
            return null;
        }
        u6k1 u6k1Var = (u6k1) u6k1.Companion.serializer().deserialize(darVar);
        u6k1Var.getClass();
        rd70 rd70Var = rd70.c;
        String str = u6k1Var.a;
        String str2 = u6k1Var.b;
        szh szhVar = u6k1Var.c;
        gd70 gd70VarA = szhVar != null ? szhVar.a() : null;
        List<szh> list = u6k1Var.d;
        if (list != null) {
            arrayList = new ArrayList();
            for (szh szhVar2 : list) {
                gd70 gd70VarA2 = szhVar2 != null ? szhVar2.a() : null;
                if (gd70VarA2 != null) {
                    arrayList.add(gd70VarA2);
                }
            }
        } else {
            arrayList = null;
        }
        List<szh> list2 = u6k1Var.e;
        if (list2 != null) {
            arrayList2 = new ArrayList();
            for (szh szhVar3 : list2) {
                gd70 gd70VarA3 = szhVar3 != null ? szhVar3.a() : null;
                if (gd70VarA3 != null) {
                    arrayList2.add(gd70VarA3);
                }
            }
        } else {
            arrayList2 = null;
        }
        return pvc.b(str, str2, gd70VarA, arrayList, arrayList2, u6k1Var.f, kyo1.v(u6k1Var.g, true));
    }

    public final h661 getDescriptor() {
        return b;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.SerializationException */
    public final void serialize(uax uaxVar, Object obj) throws SerializationException {
        throw new SerializationException("Hubs model classes do not currently support serialization to JSON");
    }
}
