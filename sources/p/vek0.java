package p;

import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class vek0 {
    public final ynb0 a;
    public final kkg1 b;
    public final idd1 c = new idd1(uek0.a);

    public vek0(ynb0 ynb0Var, kkg1 kkg1Var) {
        this.a = ynb0Var;
        this.b = kkg1Var;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:47:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:76:0x00fd A[SYNTHETIC] */
    public final wd21 a(List list) {
        z6x z6xVar;
        List list2 = list;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list2) {
            zuc0 zuc0Var = (zuc0) obj;
            Set set = s4b1.f;
            if (uic.x(zuc0Var.c).c != blc0.ti || zuc0Var.e() || (!zuc0Var.f() && zuc0Var.b() != ltt0.f)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((zuc0) it.next()).a);
        }
        Set setP1 = o7h.p1(arrayList2);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : list2) {
            if (!setP1.contains(((zuc0) obj2).a)) {
                arrayList3.add(obj2);
            }
        }
        if (arrayList3.size() < 2) {
            z6xVar = z6x.a;
        } else {
            z6x arrayList4 = new ArrayList();
            ArrayList arrayList5 = new ArrayList();
            int i = 0;
            for (Object obj3 : arrayList3) {
                int i2 = i + 1;
                if (i < 0) {
                    p7h.T();
                    throw null;
                }
                zuc0 zuc0Var2 = (zuc0) obj3;
                zuc0 zuc0Var3 = (zuc0) o7h.t0(i2, arrayList3);
                if (zuc0Var3 != null) {
                    Map map = zuc0Var2.g;
                    this.b.getClass();
                    lhg1 lhg1VarB = kkg1.b(map);
                    if (lhg1VarB != null) {
                        boolean zJ = u890.j(lhg1VarB.b.b, zuc0Var3.c);
                        if (men1.x(lhg1VarB) && zJ) {
                            if (arrayList5.isEmpty()) {
                                arrayList5.add(zuc0Var2.a);
                            }
                            arrayList5.add(zuc0Var3.a);
                        } else if (!arrayList5.isEmpty()) {
                            arrayList4.add(o7h.l1(arrayList5));
                            arrayList5 = new ArrayList();
                        }
                    } else if (!arrayList5.isEmpty()) {
                        arrayList4.add(o7h.l1(arrayList5));
                        arrayList5 = new ArrayList();
                    }
                } else if (!arrayList5.isEmpty()) {
                    arrayList4.add(o7h.l1(arrayList5));
                    arrayList5 = new ArrayList();
                }
                i = i2;
            }
            if (!arrayList5.isEmpty()) {
                arrayList4.add(o7h.l1(arrayList5));
            }
            z6xVar = arrayList4;
        }
        return new wd21(arrayList2, z6xVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object b(String str, List list, onm onmVar) {
        tek0 tek0Var;
        List list2;
        if (onmVar instanceof tek0) {
            tek0Var = (tek0) onmVar;
            int i = tek0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                tek0Var.d = i - Integer.MIN_VALUE;
            } else {
                tek0Var = new tek0(this, onmVar);
            }
        } else {
            tek0Var = new tek0(this, onmVar);
        }
        Object objF = tek0Var.b;
        int i2 = tek0Var.d;
        if (i2 == 0) {
            hm5.M(objF);
            rsc0 rsc0Var = (xrc0) this.a.get();
            trc0 trc0Var = new trc0((PlaylistRequestDecorationPolicy) this.c.getValue(), (g3d0) null, (Set) null, false, (src0) null, hqz0.a, (prc0) null, 0, (List) null, 478);
            tek0Var.a = list;
            tek0Var.d = 1;
            objF = rsc0Var.f(str, trc0Var, tek0Var);
            d9n d9nVar = d9n.a;
            if (objF == d9nVar) {
                return d9nVar;
            }
            list2 = list;
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            list2 = tek0Var.a;
            hm5.M(objF);
        }
        ly21 ly21Var = (py21) objF;
        if (ly21Var instanceof ly21) {
            return new m231(new Exception(ly21Var.a.b()));
        }
        if (!(ly21Var instanceof oy21)) {
            eg.o();
            return null;
        }
        Set setP1 = o7h.p1(list2);
        List list3 = ((wsc0) ((oy21) ly21Var).a).e;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list3) {
            if (!setP1.contains(((zuc0) obj).a)) {
                arrayList.add(obj);
            }
        }
        return a(arrayList);
    }
}
