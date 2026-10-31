package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class gpj1 implements ni31 {
    public final zle1 a;
    public final dk31 b;
    public final xgn0 c = ygn0.a();
    public final ArrayList d = new ArrayList();
    public String e;
    public boolean f;

    public gpj1(zle1 zle1Var, String str) {
        this.a = zle1Var;
        this.b = new dk31(zle1Var, "generate_rive_video", "video_preparation", str);
    }

    @Override // p.ni31
    public final Object a(String str, si31 si31Var, ri31 ri31Var) {
        return this.b.a(str, si31Var, ri31Var);
    }

    @Override // p.ni31
    public final Object b(String str, ob01 ob01Var, elu0 elu0Var) {
        return this.b.b(str, ob01Var, elu0Var);
    }

    @Override // p.ni31
    public final Object c(ob01 ob01Var, pi31 pi31Var) {
        return this.b.h("rive_file_loading", ob01Var, pi31Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(float f, onm onmVar) {
        bpj1 bpj1Var;
        xgn0 xgn0Var;
        if (onmVar instanceof bpj1) {
            bpj1Var = (bpj1) onmVar;
            int i = bpj1Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                bpj1Var.e = i - Integer.MIN_VALUE;
            } else {
                bpj1Var = new bpj1(this, onmVar);
            }
        } else {
            bpj1Var = new bpj1(this, onmVar);
        }
        Object obj = bpj1Var.c;
        int i2 = bpj1Var.e;
        if (i2 == 0) {
            hm5.M(obj);
            xgn0 xgn0Var2 = this.c;
            bpj1Var.b = xgn0Var2;
            bpj1Var.a = f;
            bpj1Var.e = 1;
            Object objA = xgn0Var2.a(bpj1Var);
            d9n d9nVar = d9n.a;
            if (objA == d9nVar) {
                return d9nVar;
            }
            xgn0Var = xgn0Var2;
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            f = bpj1Var.a;
            xgn0Var = bpj1Var.b;
            hm5.M(obj);
        }
        try {
            if (!this.f && this.b.e()) {
                this.e = String.valueOf(f);
            }
            return rih1.a;
        } finally {
            xgn0Var.c((Object) null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Object] */
    public final Object e(int i, wl31 wl31Var, onm onmVar) throws Throwable {
        cpj1 cpj1Var;
        long jA;
        if (onmVar instanceof cpj1) {
            cpj1Var = (cpj1) onmVar;
            int i2 = cpj1Var.f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cpj1Var.f = i2 - Integer.MIN_VALUE;
            } else {
                cpj1Var = new cpj1(this, onmVar);
            }
        } else {
            cpj1Var = new cpj1(this, onmVar);
        }
        cpj1 cpj1Var2 = cpj1Var;
        Object obj = cpj1Var2.d;
        int i3 = cpj1Var2.f;
        int i4 = 3;
        s45 s45Var = this.a;
        d9n d9nVar = d9n.a;
        try {
            if (i3 == 0) {
                hm5.M(obj);
                jA = s45Var.a.a();
                i3 = i;
                cpj1Var2.a = i3;
                cpj1Var2.c = jA;
                cpj1Var2.f = 1;
                wl31Var.invoke(cpj1Var2);
                obj = rih1.a;
                if (obj != d9nVar) {
                }
            }
            if (i3 != 1) {
                if (i3 == 2) {
                    Object obj2 = cpj1Var2.b;
                    hm5.M(obj);
                    return obj2;
                }
                if (i3 != 3) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                Throwable th = (Throwable) cpj1Var2.b;
                hm5.M(obj);
                throw th;
            }
            jA = cpj1Var2.c;
            i3 = cpj1Var2.a;
            hm5.M(obj);
            i4 = obj;
            long jA2 = s45Var.a.a() - jA;
            if (jA2 < 0) {
                jA2 = 0;
            }
            geo0 geo0Var = geo0.b;
            long j = jA;
            dpj1 dpj1Var = new dpj1(this, i3, j, jA2, null);
            cpj1Var2.b = i4;
            cpj1Var2.a = i3;
            cpj1Var2.c = j;
            cpj1Var2.f = 2;
            return fn31.Y(geo0Var, dpj1Var, cpj1Var2) == d9nVar ? d9nVar : i4;
        } catch (Throwable th2) {
            long jA3 = s45Var.a.a() - jA;
            long j2 = jA3 < 0 ? 0L : jA3;
            geo0 geo0Var2 = geo0.b;
            long j3 = jA;
            dpj1 dpj1Var2 = new dpj1(this, i3, j3, j2, null);
            cpj1Var2.b = th2;
            cpj1Var2.a = i3;
            cpj1Var2.c = j3;
            cpj1Var2.f = i4;
            if (fn31.Y(geo0Var2, dpj1Var2, cpj1Var2) != d9nVar) {
                throw th2;
            }
        }
    }

    public final ArrayList f() {
        List listA1 = o7h.a1(this.d, new epj1((byte) 1));
        if (listA1.size() > 20) {
            tr80 tr80VarQ = yoi1.Q(0, 10);
            ArrayList arrayList = new ArrayList(q7h.U(tr80VarQ, 10));
            lr80 it = tr80VarQ.iterator();
            while (((sr80) it).c) {
                arrayList.add(Integer.valueOf(((p7h.L(listA1) * it.nextInt()) + 4) / 9));
            }
            Set setP1 = o7h.p1(arrayList);
            Set set = setP1;
            ArrayList arrayList2 = new ArrayList(q7h.U(set, 10));
            Iterator it2 = set.iterator();
            while (it2.hasNext()) {
                arrayList2.add((apj1) listA1.get(((Number) it2.next()).intValue()));
            }
            ArrayList arrayList3 = new ArrayList();
            int i = 0;
            for (Object obj : listA1) {
                int i2 = i + 1;
                if (i < 0) {
                    p7h.T();
                    throw null;
                }
                if (!setP1.contains(Integer.valueOf(i))) {
                    arrayList3.add(obj);
                }
                i = i2;
            }
            listA1 = o7h.a1(o7h.N0(o7h.d1(o7h.a1(arrayList3, new fpj1(new epj1((byte) 0), (byte) 0)), 10), arrayList2), new epj1((byte) 2));
        }
        List<apj1> list = listA1;
        ArrayList arrayList4 = new ArrayList(q7h.U(list, 10));
        for (apj1 apj1Var : list) {
            arrayList4.add(new ak31(apj1Var.b, apj1Var.c, f4i1.c(apj1Var.a, "frame_rendering-")));
        }
        return arrayList4;
    }
}
