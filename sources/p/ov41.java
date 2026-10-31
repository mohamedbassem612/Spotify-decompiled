package p;

import com.spotify.mobius.Effects;
import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ov41 implements Init {
    public final di4 a;

    public ov41(di4 di4Var, ejb ejbVar) {
        this.a = di4Var;
    }

    public smc0 a(x851 x851Var, d8r0 d8r0Var, int i, String str, String str2) {
        l39 l39Var;
        l39 u3zVar;
        int i2;
        o5a o5aVar;
        smc0 smc0VarN = k4p1.n();
        j39 j39Var = x851Var.a.b;
        List list = j39Var.a;
        if (i != 2 && (o5aVar = j39Var.b) != null) {
            smc0VarN.add(new iwi0(o5aVar.a, o5aVar.b, o5aVar.c, o5aVar.d, o5aVar.e, str, d8r0Var, !list.isEmpty()));
        }
        int i3 = 0;
        for (Object obj : list) {
            int i4 = i3 + 1;
            l39 l39Var2 = null;
            if (i3 < 0) {
                p7h.T();
                throw null;
            }
            ma51 ma51Var = (ma51) obj;
            fpy fpyVar = ma51Var.a;
            String str3 = fpyVar.a;
            List list2 = fpyVar.b.a;
            if (nhc1.Y(str3, "spotify:search:", false)) {
                String strC = f4i1.c(i3, "autocomplete-row-");
                List<jp51> list3 = list2;
                String strY0 = o7h.y0(list3, "", (String) null, (String) null, ej41.Z, 30);
                ArrayList arrayList = new ArrayList(q7h.U(list3, 10));
                for (jp51 jp51Var : list3) {
                    arrayList.add(new gp51(jp51Var.a, jp51Var.b));
                }
                epy epyVar = ma51Var.a.c;
                if (u890.j(epyVar, epy.a)) {
                    i2 = 2;
                } else {
                    if (epyVar != null) {
                        eg.o();
                        return null;
                    }
                    i2 = 1;
                }
                l39Var = new l39(strC, d8r0Var, str, str3, strY0, arrayList, i2, this.a.s() && i4 < list.size() && !nhc1.Y(((ma51) list.get(i4)).a.a, "spotify:search:", false));
            } else {
                switch (mqo1.q(str3).ordinal()) {
                    case 0:
                        u3zVar = new u3z("recent-row-".concat(str3), d8r0Var, str, str3, str3, i3, str2);
                        l39Var2 = u3zVar;
                        l39Var = l39Var2;
                        break;
                    case 1:
                        u3zVar = new enf1("recent-row-".concat(str3), d8r0Var, str, str3, str3, i3, str2);
                        l39Var2 = u3zVar;
                        l39Var = l39Var2;
                        break;
                    case 2:
                        u3zVar = new to6("recent-row-".concat(str3), d8r0Var, str, str3, str3, i3, str2);
                        l39Var2 = u3zVar;
                        l39Var = l39Var2;
                        break;
                    case 3:
                        u3zVar = new f7x0("recent-row-".concat(str3), d8r0Var, str, str3, str3, i3, str2);
                        l39Var2 = u3zVar;
                        l39Var = l39Var2;
                        break;
                    case 4:
                        u3zVar = new eo8("recent-row-".concat(str3), d8r0Var, str, str3, str3, i3, str2);
                        l39Var2 = u3zVar;
                        l39Var = l39Var2;
                        break;
                    case 5:
                        u3zVar = new zlu0("recent-row-".concat(str3), d8r0Var, str, str3, str3, i3, str2);
                        l39Var2 = u3zVar;
                        l39Var = l39Var2;
                        break;
                    case 6:
                        u3zVar = new v5v0("recent-row-".concat(str3), d8r0Var, str, str3, str3, i3, str2);
                        l39Var2 = u3zVar;
                        l39Var = l39Var2;
                        break;
                    case 7:
                    case 8:
                        u3zVar = new k93("recent-row-".concat(str3), d8r0Var, str, str3, str3, i3, str2);
                        l39Var2 = u3zVar;
                        l39Var = l39Var2;
                        break;
                    case 9:
                        u3zVar = new vi40("recent-row-".concat(str3), d8r0Var, str, str3, ihc1.h0(str3, ":genre:", false) ? nhc1.W(str3, ":genre:", ":page:") : str3, i3, str2);
                        l39Var2 = u3zVar;
                        l39Var = l39Var2;
                        break;
                    case 10:
                        u3zVar = new mxi1("recent-row-".concat(str3), d8r0Var, str, str3, str3, i3, str2);
                        l39Var2 = u3zVar;
                        l39Var = l39Var2;
                        break;
                    case 11:
                    case 14:
                        l39Var = l39Var2;
                        break;
                    case 12:
                        u3zVar = new enf1("recent-row-".concat(str3), d8r0Var, str, str3, str3, i3, str2);
                        l39Var2 = u3zVar;
                        l39Var = l39Var2;
                        break;
                    case 13:
                        u3zVar = new p2v0("recent-row-".concat(str3), d8r0Var, str, str3, str3, i3, str2);
                        l39Var2 = u3zVar;
                        l39Var = l39Var2;
                        break;
                    default:
                        eg.o();
                        return null;
                }
            }
            if (l39Var != null) {
                smc0VarN.add(l39Var);
            }
            i3 = i4;
        }
        return k4p1.k(smc0VarN);
    }

    public First e0(Object obj) {
        xyn1 qx41Var;
        xyn1 nx41Var;
        z551 z551VarA = (z551) obj;
        fw41 fw41Var = z551VarA.f;
        String str = z551VarA.a;
        String strF = ejb.f();
        val valVar = z551VarA.e;
        HashSet hashSetA = Effects.a(new xyn1[]{new hx41(strF, true, valVar)});
        f951 f951Var = z551VarA.d;
        if (f951Var instanceof y851) {
            if (str.length() == 0) {
                return First.c(z551VarA, hashSetA);
            }
            if (valVar instanceof ral) {
                return First.c(z551VarA, Effects.a(new xyn1[0]));
            }
            if (valVar instanceof pal) {
                return First.c(z551VarA, Effects.a(new xyn1[]{new px41(str, strF, fw41Var.e)}));
            }
            eg.o();
            return null;
        }
        if (!(f951Var instanceof u851)) {
            return First.b(z551VarA);
        }
        boolean z = fw41Var.c;
        gyh gyhVar = z551VarA.N0.a;
        ue20 ue20Var = z551VarA.h;
        te20 te20Var = ue20Var instanceof te20 ? (te20) ue20Var : null;
        re20 re20Var = ue20Var instanceof re20 ? (re20) ue20Var : null;
        xo20 xo20Var = re20Var != null ? re20Var.a : null;
        ArrayList arrayListB = te20Var != null ? te20Var.b() : null;
        if (arrayListB == null) {
            arrayListB = z6x.a;
        }
        if (str.length() == 0) {
            nx41Var = new hx41(strF, false, valVar);
        } else {
            if (valVar instanceof pal) {
                qx41Var = new px41(str, strF, fw41Var.e);
            } else if (gyhVar == null && this.a.B()) {
                nx41Var = new mx41(str, strF, (tv80) null, z);
            } else if (gyhVar == null) {
                nx41Var = new nx41(str, strF, null, z);
            } else if (xo20Var == null && arrayListB.isEmpty()) {
                qx41Var = new rx41(z551VarA.a, strF, uap1.g(z551VarA), fw41Var.d, gyhVar, (tv80) null, z, 32);
            } else {
                String str2 = z551VarA.a;
                String strG = uap1.g(z551VarA);
                int i = fw41Var.d;
                ArrayList arrayList = arrayListB;
                if (arrayList.isEmpty()) {
                    arrayList = null;
                }
                qx41Var = new qx41(str2, strF, xo20Var, strG, i, null, gyhVar, z, (List) arrayList);
            }
            nx41Var = qx41Var;
        }
        if ((te20Var != null ? te20Var.b : null) != null) {
            z551VarA = z551.a(z551VarA, null, null, 0, null, null, null, null, te20.a(te20Var, null, strF, 1), null, 0, null, null, false, null, false, 32639);
        }
        return First.c(z551VarA, Effects.a(new xyn1[]{nx41Var}));
    }

    public ov41(di4 di4Var) {
        this.a = di4Var;
    }
}
