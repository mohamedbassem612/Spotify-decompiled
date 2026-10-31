package p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final /* synthetic */ class ctu implements Update {
    public static final ctu a = new ctu();

    public final Next a(Object obj, Object obj2) {
        etu etuVar = (etu) obj;
        btu btuVar = (btu) obj2;
        Set set = etuVar.d;
        boolean z = btuVar instanceof wsu;
        k0v k0vVar = k0v.a;
        if (!z) {
            if (btuVar instanceof usu) {
                return Next.a(Collections.singleton(new bsu(((usu) btuVar).a.b)));
            }
            if (btuVar instanceof qsu) {
                p0v p0vVar = ((qsu) btuVar).a;
                o0v o0vVar = p0vVar.e;
                if (o0vVar.equals(n0v.a) || (o0vVar instanceof l0v) || o0vVar.equals(k0vVar)) {
                    return Next.h(etu.a(etuVar, null, false, null, p0vVar, null, 47));
                }
                if (o0vVar instanceof m0v) {
                    return Next.j();
                }
                eg.o();
                return null;
            }
            if (btuVar instanceof tsu) {
                return Next.a(Collections.singleton(new dsu(((tsu) btuVar).a.b)));
            }
            if (btuVar instanceof xsu) {
                return Next.h(etu.a(etuVar, null, false, null, null, new bbe(((xsu) btuVar).a), 31));
            }
            if (btuVar.equals(psu.a)) {
                return Next.h(etu.a(etuVar, null, false, null, null, abe.a, 31));
            }
            if (btuVar.equals(ysu.a) || btuVar.equals(zsu.a)) {
                return Next.h(etu.a(etuVar, null, false, null, null, null, 31));
            }
            if (btuVar.equals(atu.a)) {
                return Next.a(Collections.singleton(new bsu(nik1.B2.a)));
            }
            if (btuVar instanceof vsu) {
                return Next.h(etu.a(etuVar, null, false, dm61.u0(((vsu) btuVar).a, set), null, null, 55));
            }
            if (btuVar.equals(rsu.a)) {
                p0v p0vVar2 = etuVar.e;
                return p0vVar2 != null ? Next.i(etu.a(etuVar, null, false, null, null, null, 47), Collections.singleton(new csu(p0vVar2.b))) : Next.j();
            }
            if (btuVar.equals(ssu.a)) {
                return Next.h(etu.a(etuVar, null, false, null, null, null, 47));
            }
            eg.o();
            return null;
        }
        wsu wsuVar = (wsu) btuVar;
        List list = wsuVar.a;
        boolean z2 = wsuVar.b;
        List list2 = etuVar.a;
        ArrayList arrayList = new ArrayList();
        for (Object obj3 : list2) {
            if (!((p0v) obj3).e.equals(k0vVar)) {
                arrayList.add(obj3);
            }
        }
        ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((p0v) it.next()).a);
        }
        List list3 = list;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj4 : list3) {
            p0v p0vVar3 = (p0v) obj4;
            if (p0vVar3.e.equals(k0vVar) && arrayList2.contains(p0vVar3.a)) {
                arrayList3.add(obj4);
            }
        }
        ArrayList arrayList4 = new ArrayList(q7h.U(arrayList3, 10));
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            arrayList4.add(((p0v) it2.next()).a);
        }
        LinkedHashSet linkedHashSetY0 = dm61.y0(set, arrayList4);
        ArrayList arrayList5 = new ArrayList(q7h.U(list3, 10));
        Iterator it3 = list3.iterator();
        while (it3.hasNext()) {
            arrayList5.add(((p0v) it3.next()).a);
        }
        etu etuVarA = etu.a(etuVar, list, z2, o7h.v0(linkedHashSetY0, o7h.p1(arrayList5)), null, null, 48);
        ArrayList arrayList6 = new ArrayList(q7h.U(arrayList4, 10));
        Iterator it4 = arrayList4.iterator();
        while (it4.hasNext()) {
            arrayList6.add(new esu((String) it4.next()));
        }
        return Next.i(etuVarA, o7h.p1(arrayList6));
    }
}
