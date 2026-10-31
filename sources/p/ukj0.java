package p;

import com.spotify.home.evopage.events.proto.HomeMetadataLoadingErrorEvent;
import com.spotify.home.evopage.events.proto.a;
import com.spotify.home.evopage.events.proto.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ukj0 implements q0r {
    public final String a;
    public final tkj0 b;
    public rzq c;
    public final LinkedHashSet d = new LinkedHashSet();
    public final LinkedHashMap e = new LinkedHashMap();

    public ukj0(String str, tkj0 tkj0Var) {
        this.a = str;
        this.b = tkj0Var;
    }

    @Override // p.q0r
    public final void a(Set set) {
        rzq rzqVar;
        String str;
        LinkedHashMap linkedHashMap = this.e;
        boolean zIsEmpty = linkedHashMap.isEmpty();
        LinkedHashSet linkedHashSet = this.d;
        if ((zIsEmpty && linkedHashSet.isEmpty()) || (rzqVar = this.c) == null) {
            return;
        }
        xkg0 xkg0VarJ = rzqVar.j();
        if (linkedHashMap.isEmpty() && linkedHashSet.isEmpty()) {
            return;
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : xkg0VarJ.entrySet()) {
            jh5 jh5Var = (jh5) entry.getKey();
            Object value = entry.getValue();
            if ((jh5Var.a instanceof xv00) && (value instanceof k3r)) {
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
            jh5 jh5Var2 = (jh5) entry2.getKey();
            Object value2 = entry2.getValue();
            zjd1 zjd1Var = jh5Var2.a;
            Object obj = jh5Var2.b;
            String str2 = zjd1Var + ":" + obj;
            h3r h3rVar = (k3r) value2;
            boolean z = h3rVar instanceof j3r;
            if (z) {
                linkedHashSet2.add(str2);
            }
            if (linkedHashMap.containsKey(str2)) {
                if (z) {
                    i++;
                } else if (h3rVar instanceof h3r) {
                    i2++;
                    if (linkedHashSet.contains(str2)) {
                        continue;
                    } else {
                        h3r h3rVar2 = h3rVar;
                        xv00 xv00Var = jh5Var2.a;
                        String string = obj.toString();
                        tka0 tka0Var = xv00Var.a;
                        String strR = tka0Var.r();
                        if (strR == null) {
                            strR = tka0Var.toString();
                        }
                        e3r e3rVar = h3rVar2.a;
                        if (e3rVar instanceof c3r) {
                            str = "notAvailable";
                        } else if (e3rVar instanceof b3r) {
                            str = "missingValue";
                        } else {
                            if (!(e3rVar instanceof d3r)) {
                                eg.o();
                                return;
                            }
                            str = ((d3r) e3rVar).a;
                        }
                        arrayList.add(new mmr0(str2, new skj0(string, strR, str)));
                    }
                } else if (h3rVar instanceof i3r) {
                    i3++;
                }
            }
        }
        linkedHashSet.removeAll(linkedHashSet2);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            linkedHashSet.add((String) ((mmr0) it.next()).a);
        }
        if (arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add((skj0) ((mmr0) it2.next()).b);
        }
        List listD1 = o7h.d1(o7h.a1(arrayList2, pap1.s(new iu30[]{ojj0.g, ojj0.h})), 25);
        int size = arrayList.size();
        a aVarO = HomeMetadataLoadingErrorEvent.o();
        aVarO.r(this.a);
        tkj0 tkj0Var = this.b;
        aVarO.s(tkj0Var.b.f());
        aVarO.v(size);
        aVarO.t(i);
        aVarO.q(i2);
        aVarO.u(i3);
        List<skj0> list = listD1;
        ArrayList arrayList3 = new ArrayList(q7h.U(list, 10));
        for (skj0 skj0Var : list) {
            b bVarN = HomeMetadataLoadingErrorEvent.Failures.n();
            bVarN.n(skj0Var.a);
            bVarN.r(skj0Var.b);
            bVarN.q(skj0Var.c);
            arrayList3.add((HomeMetadataLoadingErrorEvent.Failures) bVarN.build());
        }
        aVarO.n(arrayList3);
        HomeMetadataLoadingErrorEvent homeMetadataLoadingErrorEvent = (HomeMetadataLoadingErrorEvent) aVarO.build();
        t2j0 t2j0Var = tkj0Var.a;
        homeMetadataLoadingErrorEvent.getClass();
        t2j0Var.a(homeMetadataLoadingErrorEvent);
    }

    public final void j(hp21 hp21Var) {
        for (ip21 ip21Var : hp21Var.a) {
            if (nhc1.Y(ip21Var.a, "ExtendedMetadataTable", false) && u890.j(ip21Var.c, "Required")) {
                String strI = xcg1.i(ip21Var.a, ":", ip21Var.b);
                LinkedHashMap linkedHashMap = this.e;
                Integer num = (Integer) linkedHashMap.get(strI);
                linkedHashMap.put(strI, Integer.valueOf((num != null ? num.intValue() : 0) + 1));
            }
        }
    }

    public final void k(z7r z7rVar) {
        for (ip21 ip21Var : z7rVar.a) {
            if (nhc1.Y(ip21Var.a, "ExtendedMetadataTable", false) && u890.j(ip21Var.c, "Required")) {
                String strI = xcg1.i(ip21Var.a, ":", ip21Var.b);
                LinkedHashMap linkedHashMap = this.e;
                Integer num = (Integer) linkedHashMap.get(strI);
                if (num != null) {
                    int iIntValue = num.intValue();
                    if (iIntValue > 1) {
                        linkedHashMap.put(strI, Integer.valueOf(iIntValue - 1));
                    } else {
                        linkedHashMap.remove(strI);
                    }
                }
            }
        }
    }

    public final void r(rzq rzqVar) {
        this.c = rzqVar;
    }

    @Override // p.q0r
    public final void b() {
    }

    public final void d() {
    }

    public final void g() {
    }

    public final void m() {
    }

    public final void p() {
    }

    public final void c(Object obj) {
    }

    public final void e(int i) {
    }

    public final void f(Set set) {
    }

    public final void h(Object obj) {
    }

    public final void i(rvh1 rvh1Var) {
    }

    public final void l(f1r f1rVar) {
    }

    public final void n(String str) {
    }

    public final void o(String str) {
    }

    public final void q(int i) {
    }
}
