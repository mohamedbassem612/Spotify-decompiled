package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final /* synthetic */ class d9n0 extends tv30 implements iu30 {
    public static final d9n0 a = new d9n0(1, u7n0.class, "mapDataToProps", "mapDataToProps(Lcom/spotify/listuxplatform/itemlistrow/Data;)Lcom/spotify/listuxplatformconsumers/musicvideos/artists/rows/video/MusicVideoItemListRowElement$Props;", 1);

    /* JADX WARN: Code duplicated, block: B:63:0x00c1 A[LOOP:0: B:61:0x00bb->B:63:0x00c1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:67:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:72:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:74:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:76:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:77:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:88:0x00e9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x00d6 A[SYNTHETIC] */
    public final Object invoke(Object obj) {
        o1v o1vVar;
        o1v o1vVar2;
        ArrayList arrayList;
        Iterator it;
        ArrayList arrayList2;
        k4m k4mVar;
        hwq hwqVar = (hwq) obj;
        sl10 sl10Var = sl10.S0;
        if (hwqVar == null) {
            return new a9n0(sl10Var);
        }
        l7e0 l7e0Var = hwqVar.g;
        if (!(l7e0Var instanceof j7e0)) {
            return new a9n0(sl10Var);
        }
        j7e0 j7e0Var = (j7e0) l7e0Var;
        zuc0 zuc0Var = j7e0Var.a;
        fjf1 fjf1Var = zuc0Var.p;
        fjf1 fjf1Var2 = fjf1Var instanceof fjf1 ? fjf1Var : null;
        if (fjf1Var2 == null) {
            eg.m("data should always be a non-null track");
            return null;
        }
        String str = zuc0Var.c;
        String str2 = zuc0Var.i;
        int i = hwqVar.a;
        g07 g07Var = new g07(fjf1Var2.a.a().a(1));
        fjf1 fjf1Var3 = zuc0Var.p;
        boolean z = false;
        boolean z2 = !zuc0Var.f() && (fjf1Var3 instanceof fjf1) && fjf1Var3.h;
        if (zuc0Var.f() && !zuc0Var.e() && zuc0Var.d()) {
            z = true;
        }
        int i2 = hwqVar.c ? 1 : hwqVar.b ? 2 : 3;
        fbp1 fbp1Var = zuc0Var.n;
        if (!(fbp1Var instanceof mwp0)) {
            boolean z3 = fbp1Var instanceof uwp0;
            o1v o1vVar3 = o1v.a;
            if (!z3 && !(fbp1Var instanceof qwp0) && !(fbp1Var instanceof owp0)) {
                if (fbp1Var instanceof wwp0) {
                    o1vVar = o1v.b;
                } else {
                    if (!(fbp1Var instanceof kwp0)) {
                        if (!(fbp1Var instanceof swp0)) {
                            if (!(fbp1Var instanceof iwp0)) {
                                eg.o();
                                return null;
                            }
                            o1vVar = o1v.d;
                        }
                        List list = fjf1Var2.b;
                        arrayList = new ArrayList(q7h.U(list, 10));
                        it = list.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((yif1) it.next()).a);
                        }
                        arrayList2 = new ArrayList();
                        for (Object obj2 : arrayList) {
                            if (((String) obj2).length() > 0) {
                                arrayList2.add(obj2);
                            }
                        }
                        if (zuc0Var.c()) {
                            k4mVar = k4m.a;
                        } else if (zuc0Var.k) {
                            k4mVar = k4m.b;
                        } else {
                            k4mVar = k4m.d;
                        }
                        return new a9n0(new y8n0(str2, str, g07Var, z2, z, arrayList2, i2, o1vVar2, k4mVar, i, j7e0Var.a, Boolean.parseBoolean((String) hwqVar.f.c.get("is_video_first"))));
                    }
                    o1vVar = o1v.c;
                }
            }
            o1vVar2 = o1vVar3;
            List list2 = fjf1Var2.b;
            arrayList = new ArrayList(q7h.U(list2, 10));
            it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((yif1) it.next()).a);
            }
            arrayList2 = new ArrayList();
            while (r3.hasNext()) {
                if (((String) obj2).length() > 0) {
                    arrayList2.add(obj2);
                }
            }
            if (zuc0Var.c()) {
                k4mVar = k4m.a;
            } else if (zuc0Var.k) {
                k4mVar = k4m.b;
            } else {
                k4mVar = k4m.d;
            }
            return new a9n0(new y8n0(str2, str, g07Var, z2, z, arrayList2, i2, o1vVar2, k4mVar, i, j7e0Var.a, Boolean.parseBoolean((String) hwqVar.f.c.get("is_video_first"))));
        }
        o1vVar = o1v.e;
        o1vVar2 = o1vVar;
        List list3 = fjf1Var2.b;
        arrayList = new ArrayList(q7h.U(list3, 10));
        it = list3.iterator();
        while (it.hasNext()) {
            arrayList.add(((yif1) it.next()).a);
        }
        arrayList2 = new ArrayList();
        while (r3.hasNext()) {
            if (((String) obj2).length() > 0) {
                arrayList2.add(obj2);
            }
        }
        if (zuc0Var.c()) {
            k4mVar = k4m.a;
        } else if (zuc0Var.k) {
            k4mVar = k4m.b;
        } else {
            k4mVar = k4m.d;
        }
        return new a9n0(new y8n0(str2, str, g07Var, z2, z, arrayList2, i2, o1vVar2, k4mVar, i, j7e0Var.a, Boolean.parseBoolean((String) hwqVar.f.c.get("is_video_first"))));
    }
}
