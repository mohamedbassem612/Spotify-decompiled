package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ov50 implements kc91 {
    public final mr20 X;
    public final bpb1 Y = gio1.b(Boolean.FALSE);
    public final wmy a;
    public final mr20 b;
    public final r6h1 c;
    public final int d;
    public final any e;
    public final Map f;
    public final ArrayList g;
    public final ArrayList h;
    public final ArrayList i;
    public final ArrayList t;

    public ov50(koc0 koc0Var, List list, wmy wmyVar, mr20 mr20Var, r6h1 r6h1Var, int i) {
        this.a = wmyVar;
        this.b = mr20Var;
        this.c = r6h1Var;
        this.d = i;
        this.e = ((roc0) koc0Var).d();
        this.f = ujo1.w(list);
        this.g = f(1, list);
        this.h = f(2, list);
        this.i = f(3, list);
        this.t = f(4, list);
        this.X = ujo1.v(list);
    }

    public static ArrayList f(int i, List list) {
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        for (Object obj : list) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                p7h.T();
                throw null;
            }
            Integer numValueOf = ((fv50) obj).w() == i ? Integer.valueOf(i2) : null;
            if (numValueOf != null) {
                arrayList.add(numValueOf);
            }
            i2 = i3;
        }
        return arrayList;
    }

    public final zob1 a() {
        return this.Y;
    }

    public final void b(int i, cxc0 cxc0Var, b0k b0kVar, int i2) {
        int i3;
        h311 h311VarV;
        kv50 kv50Var;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-611875904);
        if ((i2 & 6) == 0) {
            i3 = (x340Var.e(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= x340Var.i(cxc0Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= x340Var.i(this) ? 256 : 128;
        }
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            ne91 ne91Var = (ne91) this.f.get(Integer.valueOf(i));
            if (ne91Var == null) {
                h311VarV = x340Var.v();
                if (h311VarV == null) {
                    return;
                } else {
                    kv50Var = new kv50(this, i, cxc0Var, i2, (byte) 1);
                }
            } else {
                gfh0 gfh0VarC = t1c.c(een.d, false);
                int iHashCode = Long.hashCode(x340Var.T);
                xos0 xos0VarM = x340Var.m();
                qim0 qim0VarE = zr7.E(x340Var, nim0.a);
                hzj.A.getClass();
                if (x340Var.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(hmb0.t1);
                } else {
                    x340Var.v0();
                }
                nko1.H(gfh0VarC, x340Var, y580.O0);
                nko1.H(xos0VarM, x340Var, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                nko1.F(x340Var);
                nko1.H(qim0VarE, x340Var, y580.Y);
                i1o1.d(ne91Var.a, cxc0Var, (rzq) this.a.d, goa0.a, (qim0) null, apo.r(-353368093, new iv50(ne91Var, (byte) 0), x340Var), apo.r(-1535428196, new jv50(ne91Var, (byte) 0), x340Var), 0, (xu30) null, x340Var, (i3 & 112) | 1769472, 200);
                x340Var.r(true);
            }
            h311VarV.d = kv50Var;
        }
        x340Var.b0();
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            kv50Var = new kv50(this, i, cxc0Var, i2, (byte) 0);
            h311VarV.d = kv50Var;
        }
    }

    public final void c(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-680797241);
        int i2 = (x340Var.i(this) ? 4 : 2) | i;
        if (!x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            x340Var.b0();
        } else if (((Boolean) rwq.h(this.Y, x340Var, 0).getValue()).booleanValue()) {
            x340Var.i0(-794770053);
            x340Var.r(false);
        } else {
            x340Var.i0(-794970902);
            boolean zI = x340Var.i(this);
            Object objT = x340Var.T();
            if (zI || objT == fkj0.X) {
                objT = new nv50(this, (byte) 1);
                x340Var.s0(objT);
            }
            dgo1.c("element_header_actions", (iu30) objT, apo.r(231896016, new lv50(this), x340Var), x340Var, 390);
            x340Var.r(false);
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new lv50(this, i, (byte) 2);
        }
    }

    public final void d(b0k b0kVar, int i) {
        Object next;
        Object obj;
        Object next2;
        Object obj2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1196097159);
        int i2 = i | (x340Var.i(this) ? 4 : 2);
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            qim0 qim0VarD = u291.d(nim0.a, 1.0f);
            jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarD);
            hzj.A.getClass();
            if (x340Var.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(hmb0.t1);
            } else {
                x340Var.v0();
            }
            nko1.H(jw31VarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            ven0 ven0VarG = rwq.g(this.e, new cxc0(), (o8n) null, x340Var, 0, 2);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            ven0 ven0VarG2 = rwq.g(this.X, z6x.a, (o8n) null, x340Var, 48, 2);
            ven0 ven0VarG3 = rwq.g(new any(this.b, (byte) 29), Boolean.TRUE, (o8n) null, x340Var, 48, 2);
            Iterator it = ((List) ven0VarG2.getValue()).iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!this.t.contains(Integer.valueOf(((Number) next).intValue())));
            Integer num = (Integer) next;
            if (((Boolean) ven0VarG3.getValue()).booleanValue()) {
                x340Var.i0(-1919591993);
                int i3 = this.d - (num != null ? 1 : 0);
                x340Var.i0(1462110303);
                List list = (List) ven0VarG2.getValue();
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : list) {
                    if (this.g.contains(Integer.valueOf(((Number) obj3).intValue()))) {
                        arrayList.add(obj3);
                    }
                }
                obj = null;
                Iterator it2 = o7h.d1(arrayList, i3).iterator();
                while (it2.hasNext()) {
                    int iIntValue = ((Number) it2.next()).intValue();
                    x340Var.f0(1437855428, Integer.valueOf(iIntValue));
                    e(linkedHashSet, iIntValue);
                    b(iIntValue, (cxc0) ven0VarG.getValue(), x340Var, (i2 << 6) & 896);
                    x340Var.r(false);
                }
                x340Var.r(false);
                if (num == null) {
                    x340Var.i0(-1918913776);
                    x340Var.r(false);
                } else {
                    x340Var.i0(-1918913775);
                    int iIntValue2 = num.intValue();
                    x340Var.f0(-1805638864, Integer.valueOf(iIntValue2));
                    e(linkedHashSet, iIntValue2);
                    b(iIntValue2, (cxc0) ven0VarG.getValue(), x340Var, (i2 << 6) & 896);
                    x340Var.r(false);
                    x340Var.r(false);
                }
                x340Var.r(false);
            } else {
                obj = null;
                x340Var.i0(-1918715561);
                x340Var.r(false);
            }
            Iterator it3 = ((List) ven0VarG2.getValue()).iterator();
            do {
                if (!it3.hasNext()) {
                    next2 = obj;
                    break;
                }
                next2 = it3.next();
            } while (!this.h.contains(Integer.valueOf(((Number) next2).intValue())));
            Integer num2 = (Integer) next2;
            Iterator it4 = ((List) ven0VarG2.getValue()).iterator();
            while (true) {
                if (!it4.hasNext()) {
                    obj2 = obj;
                    break;
                }
                Object next3 = it4.next();
                if (this.i.contains(Integer.valueOf(((Number) next3).intValue()))) {
                    obj2 = next3;
                    break;
                }
            }
            Integer num3 = (Integer) obj2;
            if (num2 == null && num3 == null) {
                x340Var.i0(-1918421929);
                x340Var.r(false);
            } else {
                x340Var.i0(-1918475745);
                op71.g(x340Var, new wnb0(1.0f, true));
                x340Var.r(false);
            }
            if (num2 == null) {
                x340Var.i0(-1918332774);
                x340Var.r(false);
            } else {
                x340Var.i0(-1918332773);
                int iIntValue3 = num2.intValue();
                x340Var.f0(488995023, Integer.valueOf(iIntValue3));
                e(linkedHashSet, iIntValue3);
                b(iIntValue3, (cxc0) ven0VarG.getValue(), x340Var, (i2 << 6) & 896);
                x340Var.r(false);
                x340Var.r(false);
            }
            if (num3 == null) {
                x340Var.i0(-1918067910);
                x340Var.r(false);
            } else {
                x340Var.i0(-1918067909);
                int iIntValue4 = num3.intValue();
                x340Var.f0(214188486, Integer.valueOf(iIntValue4));
                e(linkedHashSet, iIntValue4);
                b(iIntValue4, (cxc0) ven0VarG.getValue(), x340Var, (i2 << 6) & 896);
                x340Var.r(false);
                x340Var.r(false);
            }
            this.a.t(o5b0.c, linkedHashSet);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new lv50(this, i, (byte) 0);
        }
    }

    public final void e(LinkedHashSet linkedHashSet, int i) {
        ne91 ne91Var = (ne91) this.f.get(Integer.valueOf(i));
        if (ne91Var != null) {
            linkedHashSet.add(ne91Var.a);
        }
    }
}
