package p;

import android.os.Parcelable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class wo31 implements ah51 {
    public final z0t a;
    public final gqb0 b;

    public wo31(z0t z0tVar, gqb0 gqb0Var) {
        this.a = z0tVar;
        this.b = gqb0Var;
    }

    @Override // p.ah51
    public final List a(tr3 tr3Var) {
        sxc0 sxc0Var;
        hhy hhyVar;
        lhy lhyVar;
        List list;
        w7x w7xVar;
        List list2;
        fvm1 fvm1Var = this.a.a;
        boolean z = tr3Var.d;
        w7c0 w7c0Var = tr3Var.c;
        sxc0 sxc0Var2 = tr3Var.b;
        Parcelable parcelable = sxc0Var2.c;
        bqq0 bqq0Var = sxc0Var2.a;
        boolean z2 = parcelable instanceof on90;
        qzi0 qzi0Var = qzi0.a;
        vg60 vg60Var = vg60.a;
        List list3 = z6x.a;
        if (z2) {
            ArrayList arrayList = new ArrayList();
            List list4 = (List) w7c0Var.a(vg60Var);
            arrayList.addAll(list4 != null ? list4 : list3);
            Object objA = w7c0Var.a(qzi0Var);
            rzi0 rzi0Var = objA instanceof rzi0 ? (rzi0) objA : null;
            if (rzi0Var != null && (list2 = rzi0Var.a) != null) {
                list3 = list2;
            }
            arrayList.addAll(list3);
            return arrayList;
        }
        if (!(parcelable instanceof b8e0)) {
            return list3;
        }
        ArrayList arrayList2 = new ArrayList();
        if (((Boolean) w7c0Var.a(pvo.a)).booleanValue() && (tr3Var.a() instanceof jml)) {
            arrayList2.add(ahy.a);
        }
        boolean zH = fvm1Var.h();
        boolean zM = fvm1Var.m();
        boolean z3 = bqq0Var.h && !((b8e0) parcelable).g().isEmpty();
        if (z3) {
            b8e0 b8e0Var = (b8e0) parcelable;
            List listG = b8e0Var.g();
            a3t0 a3t0Var = z ? a3t0.a : bqq0Var.g;
            Set set = (Set) w7c0Var.a(h0v0.a);
            if (set.isEmpty()) {
                w7xVar = w7x.a;
            } else {
                List listG2 = b8e0Var.g();
                w7x hashSet = new HashSet();
                Iterator it = listG2.iterator();
                while (it.hasNext()) {
                    sxc0 sxc0Var3 = sxc0Var2;
                    String str = ((ttm1) it.next()).a;
                    if (!set.contains(str)) {
                        str = null;
                    }
                    if (str != null) {
                        hashSet.add(str);
                    }
                    sxc0Var2 = sxc0Var3;
                }
                w7xVar = hashSet;
            }
            sxc0Var = sxc0Var2;
            hhyVar = new hhy(listG, a3t0Var, w7xVar, z);
        } else {
            zM = zM;
            sxc0Var = sxc0Var2;
            hhyVar = null;
        }
        if (((Boolean) this.b.invoke(tr3Var)).booleanValue()) {
            lhyVar = new lhy(bqq0Var.c, bqq0Var.b.a(), (!zM || z3 || z) ? false : true, zH, z || (zH && z3));
        } else {
            lhyVar = null;
        }
        if (z) {
            if (lhyVar != null) {
                arrayList2.add(lhyVar);
            }
            if (hhyVar != null) {
                arrayList2.add(hhyVar);
            }
        } else {
            if (hhyVar != null) {
                arrayList2.add(hhyVar);
            }
            if (lhyVar != null) {
                arrayList2.add(lhyVar);
            }
        }
        if (!sxc0Var.b()) {
            List list5 = (List) w7c0Var.a(vg60Var);
            if (list5 != null) {
                arrayList2.addAll(list5);
            }
            Object objA2 = w7c0Var.a(qzi0Var);
            rzi0 rzi0Var2 = objA2 instanceof rzi0 ? (rzi0) objA2 : null;
            if (rzi0Var2 != null && (list = rzi0Var2.a) != null) {
                arrayList2.addAll(list);
            }
        }
        return arrayList2;
    }
}
