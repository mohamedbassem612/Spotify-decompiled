package p;

import android.os.Parcelable;
import com.spotify.mobius.Effects;
import com.spotify.mobius.First;
import com.spotify.mobius.Update;
import com.spotify.mobius.extras.patterns.InnerEffectHandlers;
import com.spotify.mobius.extras.patterns.InnerUpdate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class lwc0 {
    public static final First a(sxc0 sxc0Var) {
        tr80 tr80VarC;
        int i = sxc0Var.d;
        oqz0 oqz0Var = sxc0Var.b;
        if (oqz0Var.a.isEmpty()) {
            tr80VarC = yoi1.Q(0, i);
        } else {
            Parcelable parcelable = sxc0Var.c;
            tr80VarC = c(i, parcelable instanceof b8e0 ? ((b8e0) parcelable).h() : 0, oqz0Var.a);
        }
        sxc0 sxc0VarA = sxc0.a(sxc0Var, null, oqz0.a(oqz0Var, null, tr80VarC, 0, 5), null, null, null, null, 253);
        return First.c(sxc0VarA, Effects.a(new voc0[]{ryo1.v(sxc0VarA, (List) null)}));
    }

    public static Update b() {
        iwc0 iwc0Var = iwc0.a;
        InnerUpdate.Builder builderB = InnerUpdate.b();
        builderB.b(new hyr(jwc0.b, (byte) 3));
        builderB.e(new hyr(kwc0.b, (byte) 3));
        builderB.f(kc20.t);
        builderB.d(new dq7(iwc0Var, (byte) 16));
        builderB.c(InnerEffectHandlers.a(ud20.t));
        return builderB.a();
    }

    public static final tr80 c(int i, int i2, tr80 tr80Var) {
        int i3 = ((rr80) tr80Var).b;
        int i4 = ((rr80) tr80Var).a;
        int i5 = i - ((i3 - i4) + 1);
        if (i5 <= 0) {
            return tr80Var;
        }
        int iMax = Math.max(0, i4 - (i5 / 2));
        int i6 = iMax > i2 ? iMax : 0;
        return yoi1.Q(i6, i3 + (i5 - (i4 - i6)) + 1);
    }

    public static final xoc0 d(sxc0 sxc0Var) {
        xlu0 xlu0Var;
        tr80 tr80Var = sxc0Var.b.a;
        un90 un90Var = sxc0Var.c;
        if (!(un90Var instanceof b8e0)) {
            un90Var = null;
        }
        boolean zIsEmpty = tr80Var.isEmpty();
        int i = ((rr80) tr80Var).a;
        int i2 = ((rr80) tr80Var).b;
        if (!zIsEmpty && un90Var != null) {
            b8e0 b8e0Var = (b8e0) un90Var;
            if (!b8e0Var.a().isEmpty() && b8e0Var.a().c(i) && b8e0Var.a().c(i2)) {
                int i3 = i2 + 1;
                if (b8e0Var.a().c(i3)) {
                    tr80Var = new tr80(i, i3, 1);
                }
                nf20 nf20VarT = z561.T(puc0.t, z561.T(puc0.i, new sgg1(new pdb0(un90Var, (byte) 24), new i46(tr80Var, (byte) 1))));
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Iterator it = nf20VarT.iterator();
                while (it.hasNext()) {
                    linkedHashSet.add(((ttm1) it.next()).a);
                }
                List listG = b8e0Var.g();
                ArrayList arrayList = new ArrayList();
                for (Object obj : listG) {
                    if (((ttm1) obj).e == aey.t) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : arrayList) {
                    ttm1 ttm1Var = (ttm1) obj2;
                    if (u890.j(ttm1.i.get(ttm1Var.e), xlu0.class)) {
                        nb10 nb10Var = ttm1Var.g;
                        if (nb10Var == null) {
                            bhn0.i("null cannot be cast to non-null type com.spotify.yourlibrary.yourlibraryx.shared.domain.PlaylistExtraInfo");
                            return null;
                        }
                        xlu0Var = (xlu0) nb10Var;
                    } else {
                        xlu0Var = null;
                    }
                    if (xlu0Var != null && xlu0Var.d && xlu0Var.c) {
                        arrayList2.add(obj2);
                    }
                }
                ArrayList arrayList3 = new ArrayList(q7h.U(arrayList2, 10));
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(((ttm1) it2.next()).a);
                }
                linkedHashSet.addAll(arrayList3);
                return new xoc0(linkedHashSet);
            }
        }
        return new xoc0(w7x.a);
    }

    public static final List e(List list, List list2) {
        Object next;
        if (list.isEmpty() || list2.isEmpty()) {
            return z6x.a;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            d6c0 d6c0Var = (d6c0) it.next();
            Iterator it2 = list2.iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
            } while (((d6c0) next).getClass() != d6c0Var.getClass());
            d6c0 d6c0Var2 = (d6c0) next;
            if (d6c0Var2 == null) {
                break;
            }
            arrayList.add(d6c0Var);
            list2 = d6c0Var2.a();
        }
        return o7h.l1(arrayList);
    }
}
