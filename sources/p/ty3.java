package p;

import android.content.Context;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ty3 implements kg51 {
    public final Context a;
    public final upp0 b;

    public ty3(Context context, upp0 upp0Var) {
        this.a = context;
        this.b = upp0Var;
    }

    public final Object invoke(Object obj) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        d6c0 d6c0Var;
        sy3 sy3Var;
        aey aeyVar;
        tr3 tr3Var = (tr3) obj;
        sxc0 sxc0Var = tr3Var.b;
        wy3 wy3Var = (wy3) tr3Var.c.a(xy3.a);
        boolean z5 = wy3Var instanceof uy3;
        List list = z6x.a;
        if (z5) {
            ArrayList arrayList = ((uy3) wy3Var).a;
            if (!arrayList.isEmpty()) {
                Parcelable parcelable = sxc0Var.c;
                bqq0 bqq0Var = sxc0Var.a;
                b8e0 b8e0Var = parcelable instanceof b8e0 ? (b8e0) parcelable : null;
                List items = b8e0Var != null ? b8e0Var.getItems() : null;
                if (items == null) {
                    items = list;
                }
                List list2 = items;
                boolean z6 = list2 instanceof Collection;
                upp0 upp0Var = this.b;
                boolean z7 = true;
                int i = 0;
                if (!z6 || !list2.isEmpty()) {
                    Iterator it = list2.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z = false;
                            break;
                        }
                        String str = ((ttm1) it.next()).a;
                        upp0Var.getClass();
                        if (upp0.b(str)) {
                            z = true;
                            break;
                        }
                    }
                } else {
                    z = false;
                    break;
                }
                ArrayList arrayList2 = new ArrayList(q7h.U(list2, 10));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((ttm1) it2.next()).a);
                }
                Set setP1 = o7h.p1(arrayList2);
                ArrayList arrayList3 = new ArrayList();
                for (Object obj2 : arrayList) {
                    ttm1 ttm1Var = (ttm1) obj2;
                    if (z) {
                        String str2 = ttm1Var.a;
                        upp0Var.getClass();
                        if (upp0.b(str2)) {
                        }
                    }
                    if (!setP1.contains(ttm1Var.a)) {
                        arrayList3.add(obj2);
                    }
                }
                List list3 = bqq0Var.d;
                boolean z8 = list3 instanceof Collection;
                if (z8 && list3.isEmpty()) {
                    z2 = false;
                } else {
                    Iterator it3 = list3.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            d6c0 d6c0Var2 = (d6c0) it3.next();
                            if ((d6c0Var2 instanceof y5c0) || (d6c0Var2 instanceof o5c0)) {
                                z2 = true;
                            }
                        } else {
                            z2 = false;
                        }
                    }
                }
                if (z8 && list3.isEmpty()) {
                    z3 = false;
                } else {
                    Iterator it4 = list3.iterator();
                    while (true) {
                        if (it4.hasNext()) {
                            d6c0 d6c0Var3 = (d6c0) it4.next();
                            if ((d6c0Var3 instanceof y4c0) || (d6c0Var3 instanceof k5c0)) {
                                z3 = true;
                            }
                        } else {
                            z3 = false;
                        }
                    }
                }
                if (z8 && list3.isEmpty()) {
                    z4 = false;
                } else {
                    Iterator it5 = list3.iterator();
                    while (true) {
                        if (it5.hasNext()) {
                            d6c0 d6c0Var4 = (d6c0) it5.next();
                            if ((d6c0Var4 instanceof e5c0) || (d6c0Var4 instanceof l5c0)) {
                                z4 = true;
                            }
                        } else {
                            z4 = false;
                        }
                    }
                }
                if (!z8 || !list3.isEmpty()) {
                    Iterator it6 = list3.iterator();
                    do {
                        if (!it6.hasNext()) {
                            z7 = false;
                            break;
                        }
                        d6c0Var = (d6c0) it6.next();
                        if (d6c0Var instanceof z5c0) {
                            break;
                        }
                    } while (!(d6c0Var instanceof p5c0));
                } else {
                    z7 = false;
                    break;
                }
                if (z2 || z3 || z4 || z7) {
                    ArrayList arrayList4 = new ArrayList();
                    for (Object obj3 : arrayList3) {
                        ttm1 ttm1Var2 = (ttm1) obj3;
                        if (u890.j(ttm1.i.get(ttm1Var2.e), sy3.class)) {
                            nb10 nb10Var = ttm1Var2.g;
                            if (nb10Var == null) {
                                bhn0.i("null cannot be cast to non-null type com.spotify.yourlibrary.yourlibraryx.shared.domain.AlsoAvailableOfflineExtraInfo");
                                return null;
                            }
                            sy3Var = (sy3) nb10Var;
                        } else {
                            sy3Var = null;
                        }
                        if (sy3Var != null && (aeyVar = sy3Var.a) != null) {
                            if (z2) {
                                if (aeyVar == aey.t) {
                                    arrayList4.add(obj3);
                                }
                            } else if (z3) {
                                if (aeyVar == aey.c) {
                                    arrayList4.add(obj3);
                                }
                            } else if (z4 && aeyVar == aey.f) {
                                arrayList4.add(obj3);
                            }
                        }
                    }
                    arrayList3 = arrayList4;
                }
                if (!arrayList3.isEmpty()) {
                    String string = this.a.getString(2131964011);
                    as3 as3Var = bqq0Var.b;
                    smc0 smc0VarN = k4p1.n();
                    smc0VarN.add(new khy(string));
                    ArrayList arrayList5 = new ArrayList(q7h.U(arrayList3, 10));
                    for (Object obj4 : arrayList3) {
                        int i2 = i + 1;
                        if (i < 0) {
                            p7h.T();
                            throw null;
                        }
                        arrayList5.add(new bhy(i, (ttm1) obj4, as3Var, i));
                        i = i2;
                    }
                    Iterator it7 = arrayList5.iterator();
                    while (it7.hasNext()) {
                        smc0VarN.add((bhy) it7.next());
                    }
                    return k4p1.k(smc0VarN);
                }
            }
        }
        return list;
    }
}
