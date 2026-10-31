package p;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.viewpager2.widget.ViewPager2;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class zjr implements rjp0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public zjr(p1d0 p1d0Var, l811 l811Var, kyo0 kyo0Var, zq41 zq41Var) {
        this.a = (byte) 2;
        this.b = p1d0Var;
        this.c = l811Var;
        this.d = zq41Var;
    }

    public final void b(Object obj) {
        byte b = this.a;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (b) {
            case 0:
                hcr0 hcr0Var = (hcr0) obj4;
                iac0 iac0Var = (iac0) obj;
                if (iac0Var == null) {
                    return;
                }
                air0 air0Var = hcr0Var.P1;
                nhr0 nhr0Var = air0Var != null ? air0Var.t.Y : null;
                if (nhr0Var == null) {
                    return;
                }
                fn31.T(cto1.q(iac0Var), (o8n) null, 0, new swn(hcr0Var, (ujr) obj3, nhr0Var, (akr) obj2, (lnm) null, (byte) 6), 3);
                return;
            case 1:
                lvc1 lvc1Var = (lvc1) obj3;
                List list = (List) obj;
                teb tebVar = (teb) obj4;
                if (tebVar.g() != null) {
                    list.getClass();
                    List list2 = list;
                    if ((list2 instanceof Collection) && list2.isEmpty()) {
                        return;
                    }
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        if (u890.j(((ito) it.next()).b, tebVar.g())) {
                            Iterator it2 = list.iterator();
                            int i = 0;
                            while (true) {
                                if (!it2.hasNext()) {
                                    i = -1;
                                } else if (!u890.j(((ito) it2.next()).b, tebVar.g())) {
                                    i++;
                                }
                            }
                            int i2 = i;
                            ito itoVar = (ito) list.get(i2);
                            z511 adapter = ((ViewPager2) lvc1Var.d).getAdapter();
                            if (adapter != null) {
                                hyo1.p(new lzm(tebVar, itoVar, lvc1Var, i2, (String) obj2), new uiv(list, (byte) 0), adapter);
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
                return;
            case 2:
                rnc0 rnc0Var = (rnc0) obj;
                l811 l811Var = (l811) obj3;
                p1d0 p1d0Var = (p1d0) obj4;
                if (rnc0Var.b.isEmpty()) {
                    return;
                }
                p1d0Var.b(rnc0Var);
                if (l811Var.a) {
                    return;
                }
                zq41 zq41Var = (zq41) obj2;
                zq41Var.getContext();
                p1d0Var.a(zq41Var, zq41Var, new LinearLayoutManager(1), false);
                l811Var.a = true;
                return;
            default:
                ((iu30) obj4).invoke(obj);
                kdn0 kdn0Var = (kdn0) obj3;
                Object obj5 = ((p811) obj2).a;
                if (obj5 != null) {
                    kdn0Var.k((rjp0) obj5);
                    return;
                } else {
                    u890.C("observer");
                    throw null;
                }
        }
    }

    public /* synthetic */ zjr(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
