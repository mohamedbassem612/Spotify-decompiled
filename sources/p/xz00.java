package p;

import com.google.protobuf.GeneratedMessageLite$ExtendableMessage;
import com.google.protobuf.h;
import com.google.protobuf.l;
import com.google.protobuf.m;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class xz00 {
    public int a(Map.Entry entry) {
        return ((gf40) entry.getKey()).b;
    }

    public Object b(uz00 uz00Var, s2j0 s2j0Var, int i) {
        return (if40) uz00Var.a.get(new rz00(i, s2j0Var));
    }

    public l220 c(Object obj) {
        return (l220) dlh1.j(yz00.a, obj);
    }

    public abstract l220 d(Object obj);

    public boolean e(s2j0 s2j0Var) {
        return s2j0Var instanceof GeneratedMessageLite$ExtendableMessage;
    }

    public abstract void f(Object obj);

    public Object g(Object obj, zb01 zb01Var, Object obj2, uz00 uz00Var, l220 l220Var, Object obj3, m mVar) {
        Object obj4;
        Object objJ;
        List arrayList;
        if40 if40Var = (if40) obj2;
        gf40 gf40Var = if40Var.c;
        kul1 kul1Var = gf40Var.c;
        s2j0 s2j0Var = if40Var.b;
        kul1 kul1Var2 = gf40Var.c;
        boolean z = gf40Var.d;
        int i = gf40Var.b;
        Object objValueOf = null;
        if (gf40Var.d && gf40Var.e) {
            switch (kul1Var.ordinal()) {
                case 0:
                    objJ = obj3;
                    arrayList = new ArrayList();
                    zb01Var.E(arrayList);
                    l220Var.l(gf40Var, arrayList);
                    return objJ;
                case 1:
                    objJ = obj3;
                    arrayList = new ArrayList();
                    zb01Var.B(arrayList);
                    l220Var.l(gf40Var, arrayList);
                    return objJ;
                case 2:
                    objJ = obj3;
                    arrayList = new ArrayList();
                    zb01Var.h(arrayList);
                    l220Var.l(gf40Var, arrayList);
                    return objJ;
                case 3:
                    objJ = obj3;
                    arrayList = new ArrayList();
                    zb01Var.f(arrayList);
                    l220Var.l(gf40Var, arrayList);
                    return objJ;
                case 4:
                    objJ = obj3;
                    arrayList = new ArrayList();
                    zb01Var.v(arrayList);
                    l220Var.l(gf40Var, arrayList);
                    return objJ;
                case 5:
                    objJ = obj3;
                    arrayList = new ArrayList();
                    zb01Var.p(arrayList);
                    l220Var.l(gf40Var, arrayList);
                    return objJ;
                case 6:
                    objJ = obj3;
                    arrayList = new ArrayList();
                    zb01Var.w(arrayList);
                    l220Var.l(gf40Var, arrayList);
                    return objJ;
                case 7:
                    objJ = obj3;
                    arrayList = new ArrayList();
                    zb01Var.l(arrayList);
                    l220Var.l(gf40Var, arrayList);
                    return objJ;
                case 8:
                case 9:
                case 10:
                case 11:
                default:
                    eg.m("Type cannot be packed: ".concat(String.valueOf(kul1Var2)));
                    return null;
                case 12:
                    objJ = obj3;
                    arrayList = new ArrayList();
                    zb01Var.s(arrayList);
                    l220Var.l(gf40Var, arrayList);
                    return objJ;
                case 13:
                    ArrayList arrayList2 = new ArrayList();
                    zb01Var.i(arrayList2);
                    objJ = l.j(obj, i, arrayList2, gf40Var.a, obj3, mVar);
                    arrayList = arrayList2;
                    l220Var.l(gf40Var, arrayList);
                    return objJ;
                case 14:
                    arrayList = new ArrayList();
                    zb01Var.b(arrayList);
                    objJ = obj3;
                    l220Var.l(gf40Var, arrayList);
                    return objJ;
                case 15:
                    arrayList = new ArrayList();
                    zb01Var.u(arrayList);
                    objJ = obj3;
                    l220Var.l(gf40Var, arrayList);
                    return objJ;
                case 16:
                    arrayList = new ArrayList();
                    zb01Var.q(arrayList);
                    objJ = obj3;
                    l220Var.l(gf40Var, arrayList);
                    return objJ;
                case 17:
                    arrayList = new ArrayList();
                    zb01Var.c(arrayList);
                    objJ = obj3;
                    l220Var.l(gf40Var, arrayList);
                    return objJ;
            }
        }
        if (kul1Var != kul1.Y) {
            switch (kul1Var.ordinal()) {
                case 0:
                    objValueOf = Double.valueOf(zb01Var.readDouble());
                    break;
                case 1:
                    objValueOf = Float.valueOf(zb01Var.readFloat());
                    break;
                case 2:
                    objValueOf = Long.valueOf(zb01Var.F());
                    break;
                case 3:
                    objValueOf = Long.valueOf(zb01Var.r());
                    break;
                case 4:
                    objValueOf = Integer.valueOf(zb01Var.o());
                    break;
                case 5:
                    objValueOf = Long.valueOf(zb01Var.a());
                    break;
                case 6:
                    objValueOf = Integer.valueOf(zb01Var.t());
                    break;
                case 7:
                    objValueOf = Boolean.valueOf(zb01Var.d());
                    break;
                case 8:
                    objValueOf = zb01Var.y();
                    break;
                case 9:
                    if (!z) {
                        Object obj5 = l220Var.a.get(gf40Var);
                        if (obj5 instanceof h) {
                            oiy0 oiy0Var = oiy0.c;
                            oiy0Var.getClass();
                            sm41 sm41VarA = oiy0Var.a(obj5.getClass());
                            if (!((h) obj5).isMutable()) {
                                Object objC = sm41VarA.c();
                                sm41VarA.d(objC, obj5);
                                l220Var.l(gf40Var, objC);
                                obj5 = objC;
                            }
                            zb01Var.J(obj5, sm41VarA, uz00Var);
                            return obj3;
                        }
                    }
                    objValueOf = zb01Var.N(s2j0Var.getClass(), uz00Var);
                    break;
                case 10:
                    if (!z) {
                        Object obj6 = l220Var.a.get(gf40Var);
                        if (obj6 instanceof h) {
                            oiy0 oiy0Var2 = oiy0.c;
                            oiy0Var2.getClass();
                            sm41 sm41VarA2 = oiy0Var2.a(obj6.getClass());
                            if (!((h) obj6).isMutable()) {
                                Object objC2 = sm41VarA2.c();
                                sm41VarA2.d(objC2, obj6);
                                l220Var.l(gf40Var, objC2);
                                obj6 = objC2;
                            }
                            zb01Var.I(obj6, sm41VarA2, uz00Var);
                            return obj3;
                        }
                    }
                    objValueOf = zb01Var.M(s2j0Var.getClass(), uz00Var);
                    break;
                case 11:
                    objValueOf = zb01Var.n();
                    break;
                case 12:
                    objValueOf = Integer.valueOf(zb01Var.g());
                    break;
                case 13:
                    eg.m("Shouldn't reach here.");
                    return null;
                case 14:
                    objValueOf = Integer.valueOf(zb01Var.C());
                    break;
                case 15:
                    objValueOf = Long.valueOf(zb01Var.e());
                    break;
                case 16:
                    objValueOf = Integer.valueOf(zb01Var.k());
                    break;
                case 17:
                    objValueOf = Long.valueOf(zb01Var.x());
                    break;
            }
        } else {
            int iO = zb01Var.o();
            if (gf40Var.a.findValueByNumber(iO) == null) {
                return l.o(obj, i, iO, obj3, mVar);
            }
            objValueOf = Integer.valueOf(iO);
        }
        if (z) {
            l220Var.a(gf40Var, objValueOf);
            return obj3;
        }
        int iOrdinal = kul1Var2.ordinal();
        if ((iOrdinal == 9 || iOrdinal == 10) && (obj4 = l220Var.a.get(gf40Var)) != null) {
            objValueOf = ((s2j0) obj4).toBuilder().mergeFrom((s2j0) objValueOf).buildPartial();
        }
        l220Var.l(gf40Var, objValueOf);
        return obj3;
    }

    public void h(zb01 zb01Var, Object obj, uz00 uz00Var, l220 l220Var) {
        if40 if40Var = (if40) obj;
        l220Var.l(if40Var.c, zb01Var.M(if40Var.b.getClass(), uz00Var));
    }

    public void i(phc phcVar, Object obj, uz00 uz00Var, l220 l220Var) {
        if40 if40Var = (if40) obj;
        r2j0 r2j0VarNewBuilderForType = if40Var.b.newBuilderForType();
        lwg lwgVarP = phcVar.p();
        r2j0VarNewBuilderForType.mergeFrom(lwgVarP, uz00Var);
        l220Var.l(if40Var.c, r2j0VarNewBuilderForType.buildPartial());
        lwgVarP.a(0);
    }

    public void j(i6b i6bVar, Map.Entry entry) {
        gf40 gf40Var = (gf40) entry.getKey();
        boolean z = gf40Var.d;
        boolean z2 = gf40Var.e;
        int i = gf40Var.b;
        kul1 kul1Var = gf40Var.c;
        if (!z) {
            switch (kul1Var.ordinal()) {
                case 0:
                    i6bVar.y(((Double) entry.getValue()).doubleValue(), i);
                    break;
                case 1:
                    i6bVar.H(((Float) entry.getValue()).floatValue(), i);
                    break;
                case 2:
                    i6bVar.N(i, ((Long) entry.getValue()).longValue());
                    break;
                case 3:
                    i6bVar.g0(i, ((Long) entry.getValue()).longValue());
                    break;
                case 4:
                    i6bVar.L(i, ((Integer) entry.getValue()).intValue());
                    break;
                case 5:
                    i6bVar.F(i, ((Long) entry.getValue()).longValue());
                    break;
                case 6:
                    i6bVar.D(i, ((Integer) entry.getValue()).intValue());
                    break;
                case 7:
                    i6bVar.r(i, ((Boolean) entry.getValue()).booleanValue());
                    break;
                case 8:
                    i6bVar.c0(i, (String) entry.getValue());
                    break;
                case 9:
                    i6bVar.J(i, entry.getValue(), oiy0.c.a(entry.getValue().getClass()));
                    break;
                case 10:
                    i6bVar.Q(i, entry.getValue(), oiy0.c.a(entry.getValue().getClass()));
                    break;
                case 11:
                    i6bVar.t(i, (phc) entry.getValue());
                    break;
                case 12:
                    i6bVar.e0(i, ((Integer) entry.getValue()).intValue());
                    break;
                case 13:
                    i6bVar.L(i, ((Integer) entry.getValue()).intValue());
                    break;
                case 14:
                    i6bVar.T(i, ((Integer) entry.getValue()).intValue());
                    break;
                case 15:
                    i6bVar.V(i, ((Long) entry.getValue()).longValue());
                    break;
                case 16:
                    i6bVar.X(i, ((Integer) entry.getValue()).intValue());
                    break;
                case 17:
                    i6bVar.Z(i, ((Long) entry.getValue()).longValue());
                    break;
            }
        }
        switch (kul1Var.ordinal()) {
            case 0:
                List list = (List) entry.getValue();
                Class cls = l.a;
                if (list != null && !list.isEmpty()) {
                    i6bVar.z(i, list, z2);
                    break;
                }
                break;
            case 1:
                List list2 = (List) entry.getValue();
                Class cls2 = l.a;
                if (list2 != null && !list2.isEmpty()) {
                    i6bVar.I(i, list2, z2);
                    break;
                }
                break;
            case 2:
                List list3 = (List) entry.getValue();
                Class cls3 = l.a;
                if (list3 != null && !list3.isEmpty()) {
                    i6bVar.O(i, list3, z2);
                    break;
                }
                break;
            case 3:
                List list4 = (List) entry.getValue();
                Class cls4 = l.a;
                if (list4 != null && !list4.isEmpty()) {
                    i6bVar.h0(i, list4, z2);
                    break;
                }
                break;
            case 4:
                List list5 = (List) entry.getValue();
                Class cls5 = l.a;
                if (list5 != null && !list5.isEmpty()) {
                    i6bVar.M(i, list5, z2);
                    break;
                }
                break;
            case 5:
                List list6 = (List) entry.getValue();
                Class cls6 = l.a;
                if (list6 != null && !list6.isEmpty()) {
                    i6bVar.G(i, list6, z2);
                    break;
                }
                break;
            case 6:
                List list7 = (List) entry.getValue();
                Class cls7 = l.a;
                if (list7 != null && !list7.isEmpty()) {
                    i6bVar.E(i, list7, z2);
                    break;
                }
                break;
            case 7:
                List list8 = (List) entry.getValue();
                Class cls8 = l.a;
                if (list8 != null && !list8.isEmpty()) {
                    i6bVar.s(i, list8, z2);
                    break;
                }
                break;
            case 8:
                List list9 = (List) entry.getValue();
                Class cls9 = l.a;
                if (list9 != null && !list9.isEmpty()) {
                    i6bVar.d0(i, list9);
                    break;
                }
                break;
            case 9:
                List list10 = (List) entry.getValue();
                if (list10 != null && !list10.isEmpty()) {
                    List list11 = (List) entry.getValue();
                    sm41 sm41VarA = oiy0.c.a(list10.get(0).getClass());
                    Class cls10 = l.a;
                    if (list11 != null && !list11.isEmpty()) {
                        i6bVar.K(i, list11, sm41VarA);
                        break;
                    }
                }
                break;
            case 10:
                List list12 = (List) entry.getValue();
                if (list12 != null && !list12.isEmpty()) {
                    List list13 = (List) entry.getValue();
                    sm41 sm41VarA2 = oiy0.c.a(list12.get(0).getClass());
                    Class cls11 = l.a;
                    if (list13 != null && !list13.isEmpty()) {
                        i6bVar.R(i, list13, sm41VarA2);
                        break;
                    }
                }
                break;
            case 11:
                List list14 = (List) entry.getValue();
                Class cls12 = l.a;
                if (list14 != null && !list14.isEmpty()) {
                    i6bVar.u(i, list14);
                    break;
                }
                break;
            case 12:
                List list15 = (List) entry.getValue();
                Class cls13 = l.a;
                if (list15 != null && !list15.isEmpty()) {
                    i6bVar.f0(i, list15, z2);
                    break;
                }
                break;
            case 13:
                List list16 = (List) entry.getValue();
                Class cls14 = l.a;
                if (list16 != null && !list16.isEmpty()) {
                    i6bVar.M(i, list16, z2);
                    break;
                }
                break;
            case 14:
                List list17 = (List) entry.getValue();
                Class cls15 = l.a;
                if (list17 != null && !list17.isEmpty()) {
                    i6bVar.U(i, list17, z2);
                    break;
                }
                break;
            case 15:
                List list18 = (List) entry.getValue();
                Class cls16 = l.a;
                if (list18 != null && !list18.isEmpty()) {
                    i6bVar.W(i, list18, z2);
                    break;
                }
                break;
            case 16:
                List list19 = (List) entry.getValue();
                Class cls17 = l.a;
                if (list19 != null && !list19.isEmpty()) {
                    i6bVar.Y(i, list19, z2);
                    break;
                }
                break;
            case 17:
                List list20 = (List) entry.getValue();
                Class cls18 = l.a;
                if (list20 != null && !list20.isEmpty()) {
                    i6bVar.a0(i, list20, z2);
                    break;
                }
                break;
        }
    }
}
