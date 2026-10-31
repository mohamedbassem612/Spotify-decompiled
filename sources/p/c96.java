package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class c96 implements vr20 {
    public final /* synthetic */ hwx0 a;
    public final /* synthetic */ l96 b;
    public final /* synthetic */ ven0 c;
    public final /* synthetic */ ven0 d;
    public final /* synthetic */ ven0 e;
    public final /* synthetic */ ven0 f;
    public final /* synthetic */ ven0 g;
    public final /* synthetic */ hdn0 h;
    public final /* synthetic */ ven0 i;
    public final /* synthetic */ ven0 t;

    public c96(hwx0 hwx0Var, l96 l96Var, ven0 ven0Var, ven0 ven0Var2, ven0 ven0Var3, ven0 ven0Var4, ven0 ven0Var5, hdn0 hdn0Var, ven0 ven0Var6, ven0 ven0Var7) {
        this.a = hwx0Var;
        this.b = l96Var;
        this.c = ven0Var;
        this.d = ven0Var2;
        this.e = ven0Var3;
        this.f = ven0Var4;
        this.g = ven0Var5;
        this.h = hdn0Var;
        this.i = ven0Var6;
        this.t = ven0Var7;
    }

    public final Object emit(Object obj, lnm lnmVar) {
        String strX;
        Object next;
        String strY0;
        Object next2;
        d220 d220Var = (d220) obj;
        boolean z = d220Var.c;
        hl51 hl51Var = d220Var.d;
        String str = d220Var.a;
        if (z) {
            this.c.setValue((Object) null);
            this.a.getClass();
        } else {
            ven0 ven0Var = this.d;
            l96 l96Var = this.b;
            if (hl51Var == null) {
                mlw0 mlw0Var = l96Var.h;
                strX = (String) ven0Var.getValue();
                String str2 = d220Var.b;
                ArrayList arrayListE = mlw0.e(axx0.a((axx0) mlw0Var.b, strX));
                Iterator it = arrayListE.iterator();
                do {
                    if (!it.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it.next();
                } while (!((xwx0) next2).a.equals(str));
                xwx0 xwx0Var = (xwx0) next2;
                if (xwx0Var != null) {
                    strX = nhc1.X(strX, xwx0Var.s, mlw0Var.j(xwx0Var, str2, arrayListE));
                }
            } else {
                mlw0 mlw0Var2 = l96Var.h;
                strX = (String) ven0Var.getValue();
                ArrayList<kl51> arrayList = hl51Var.a;
                ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
                for (kl51 kl51Var : arrayList) {
                    arrayList2.add(new mmr0(kl51Var.a, kl51Var.b));
                }
                axx0 axx0Var = (axx0) mlw0Var2.b;
                Iterator it2 = mlw0.e(axx0.a(axx0Var, strX)).iterator();
                do {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                } while (!((xwx0) next).a.equals(str));
                xwx0 xwx0Var2 = (xwx0) next;
                if (xwx0Var2 != null && !arrayList2.isEmpty()) {
                    Map mapP = sqg0.P(sqg0.K("item-id", xwx0Var2.t), new mmr0("value", o7h.y0(arrayList2, ",", (String) null, (String) null, xox0.P0, 30)));
                    if (arrayList2.isEmpty()) {
                        strY0 = o7h.y0(arrayList2, ", ", (String) null, (String) null, xox0.Q0, 30);
                        break;
                    }
                    Iterator it3 = arrayList2.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            strY0 = o7h.y0(arrayList2, ", ", (String) null, (String) null, xox0.Q0, 30);
                            break;
                        }
                        if (ihc1.y0((String) ((mmr0) it3.next()).b)) {
                            strY0 = xwx0Var2.r;
                            break;
                        }
                    }
                    strX = nhc1.X(strX, xwx0Var2.s, cy30.p("<b ", o7h.y0(mapP.entrySet(), " ", (String) null, (String) null, xox0.O0, 30), ">", lrn1.s(strY0), "</b>"));
                    ArrayList arrayListE2 = mlw0.e(axx0.a(axx0Var, strX));
                    ArrayList<xwx0> arrayList3 = new ArrayList();
                    for (Object obj2 : arrayListE2) {
                        if (u890.j(((xwx0) obj2).p, str)) {
                            arrayList3.add(obj2);
                        }
                    }
                    for (xwx0 xwx0Var3 : arrayList3) {
                        strX = nhc1.X(strX, xwx0Var3.s, mlw0Var2.j(xwx0Var3, xwx0Var3.c, arrayListE2));
                    }
                }
            }
            this.e.setValue((String) ven0Var.getValue());
            this.g.setValue(strX.equals((String) this.f.getValue()) ? null : strX);
            ydh.m(this.h, 1);
            this.i.setValue(strX);
            ((iu30) this.t.getValue()).invoke(new x76(strX));
        }
        return rih1.a;
    }
}
