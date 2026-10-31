package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class m4o implements tyq {
    public final psw O0;
    public final dkm Y;
    public final ndq a;
    public final odq b;
    public final bfd c;
    public final mr20 d;
    public final kbd e;
    public final sks0 f;
    public final ahu0 g;
    public final iyc0 h;
    public final it8 i;
    public final d0r t;
    public final o3r X = w3p1.o(new l4r(pwc0.a, 2, h4o.e, new j4r(h4o.c), h4o.f), h4o.d);
    public final js20 Z = x3p1.n(new fnn(this, (byte) 8), h4o.b, new i4o(this, (byte) 0), (o8n) null, (iu30) null, 24);
    public final eih1 N0 = new eih1();

    public m4o(ndq ndqVar, odq odqVar, bfd bfdVar, mr20 mr20Var, kbd kbdVar, sks0 sks0Var, ahu0 ahu0Var, iyc0 iyc0Var, it8 it8Var, d0r d0rVar) {
        this.a = ndqVar;
        this.b = odqVar;
        this.c = bfdVar;
        this.d = mr20Var;
        this.e = kbdVar;
        this.f = sks0Var;
        this.g = ahu0Var;
        this.h = iyc0Var;
        this.i = it8Var;
        this.t = d0rVar;
        this.Y = new dkm(bfdVar.A(), (byte) 8);
        j2i j2iVar = new j2i(1052928084, new bfm(this, (byte) 18), true);
        ien0 ien0Var = qsw.a;
        this.O0 = new psw(j2iVar, (byte) 0);
    }

    public final rqw a() {
        return this.N0;
    }

    public final jsw c() {
        return this.O0;
    }

    public final d0r e() {
        return this.t;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(String str, List list, onm onmVar) {
        j4o j4oVar;
        List list2;
        List list3;
        Set setP1;
        if (onmVar instanceof j4o) {
            j4oVar = (j4o) onmVar;
            int i = j4oVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                j4oVar.e = i - Integer.MIN_VALUE;
            } else {
                j4oVar = new j4o(this, onmVar);
            }
        } else {
            j4oVar = new j4o(this, onmVar);
        }
        Object objG = j4oVar.c;
        int i2 = j4oVar.e;
        try {
            if (i2 == 0) {
                hm5.M(objG);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : list) {
                    if (u890.j(((x4i1) obj).b, str)) {
                        arrayList.add(obj);
                    } else {
                        arrayList2.add(obj);
                    }
                }
                if (arrayList2.isEmpty()) {
                    return list;
                }
                try {
                    bfd bfdVar = this.c;
                    ArrayList arrayList3 = new ArrayList(q7h.U(arrayList2, 10));
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        arrayList3.add(((x4i1) it.next()).b);
                    }
                    j4oVar.a = arrayList;
                    j4oVar.b = arrayList2;
                    j4oVar.e = 1;
                    objG = bfdVar.b.g(arrayList3, j4oVar);
                    Object obj2 = d9n.a;
                    if (objG == obj2) {
                        return obj2;
                    }
                    list2 = arrayList;
                    list3 = arrayList2;
                } catch (Throwable unused) {
                    list2 = arrayList;
                    list3 = arrayList2;
                    setP1 = w7x.a;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                list3 = j4oVar.b;
                list2 = j4oVar.a;
                try {
                    hm5.M(objG);
                } catch (Throwable unused2) {
                    setP1 = w7x.a;
                }
            }
            ArrayList arrayList4 = new ArrayList();
            for (Object obj3 : (Iterable) objG) {
                if (((mfd) obj3).b) {
                    arrayList4.add(obj3);
                }
            }
            ArrayList arrayList5 = new ArrayList(q7h.U(arrayList4, 10));
            Iterator it2 = arrayList4.iterator();
            while (it2.hasNext()) {
                arrayList5.add(((mfd) it2.next()).a);
            }
            setP1 = o7h.p1(arrayList5);
            List list4 = list2;
            ArrayList arrayList6 = new ArrayList();
            for (Object obj4 : list3) {
                if (setP1.contains(((x4i1) obj4).b)) {
                    arrayList6.add(obj4);
                }
            }
            return o7h.N0(arrayList6, list4);
        } catch (CancellationException e) {
            throw e;
        }
    }

    public final mqw getBehavior() {
        return this.Z;
    }

    public final f4r getData() {
        return this.X;
    }
}
