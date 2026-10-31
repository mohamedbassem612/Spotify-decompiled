package p;

import android.os.Bundle;
import android.os.Parcelable;
import com.spotify.mobius.First;
import com.spotify.mobius.Next;
import com.spotify.player.model.Context$Metadata;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ujf0 extends hab0 implements vu30 {
    public static final ujf0 N0;
    public static final ujf0 O0;
    public static final ujf0 P0;
    public static final ujf0 Q0;
    public static final ujf0 R0;
    public static final ujf0 S0;
    public static final ujf0 T0;
    public static final ujf0 U0;
    public static final ujf0 V0;
    public static final ujf0 W0;
    public static final ujf0 X;
    public static final ujf0 X0;
    public static final ujf0 Y;
    public static final ujf0 Y0;
    public static final ujf0 Z;
    public static final ujf0 Z0;
    public static final ujf0 a1;
    public static final ujf0 b;
    public static final ujf0 b1;
    public static final ujf0 c;
    public static final ujf0 c1;
    public static final ujf0 d;
    public static final ujf0 d1;
    public static final ujf0 e;
    public static final ujf0 e1;
    public static final ujf0 f;
    public static final ujf0 g;
    public static final ujf0 h;
    public static final ujf0 i;
    public static final ujf0 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 2;
        b = new ujf0(i2, (byte) 0);
        c = new ujf0(i2, (byte) 1);
        d = new ujf0(i2, (byte) 2);
        e = new ujf0(i2, (byte) 3);
        f = new ujf0(i2, (byte) 4);
        g = new ujf0(i2, (byte) 5);
        h = new ujf0(i2, (byte) 6);
        i = new ujf0(i2, (byte) 7);
        t = new ujf0(i2, (byte) 8);
        X = new ujf0(i2, (byte) 9);
        Y = new ujf0(i2, (byte) 10);
        Z = new ujf0(i2, (byte) 11);
        N0 = new ujf0(i2, (byte) 12);
        O0 = new ujf0(i2, (byte) 13);
        P0 = new ujf0(i2, (byte) 14);
        Q0 = new ujf0(i2, (byte) 15);
        R0 = new ujf0(i2, (byte) 16);
        S0 = new ujf0(i2, (byte) 17);
        T0 = new ujf0(i2, (byte) 18);
        U0 = new ujf0(i2, (byte) 19);
        V0 = new ujf0(i2, (byte) 20);
        W0 = new ujf0(i2, (byte) 21);
        X0 = new ujf0(i2, (byte) 22);
        Y0 = new ujf0(i2, (byte) 23);
        Z0 = new ujf0(i2, (byte) 24);
        a1 = new ujf0(i2, (byte) 25);
        b1 = new ujf0(i2, (byte) 26);
        c1 = new ujf0(i2, (byte) 27);
        d1 = new ujf0(i2, (byte) 28);
        e1 = new ujf0(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ujf0(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    /* JADX WARN: Code duplicated, block: B:108:0x0255  */
    /* JADX WARN: Code duplicated, block: B:111:0x025b  */
    /* JADX WARN: Code duplicated, block: B:113:0x0263  */
    /* JADX WARN: Code duplicated, block: B:116:0x0276  */
    /* JADX WARN: Code duplicated, block: B:117:0x027a  */
    /* JADX WARN: Code duplicated, block: B:119:0x027d  */
    /* JADX WARN: Code duplicated, block: B:121:0x0282  */
    /* JADX WARN: Code duplicated, block: B:124:0x028c  */
    /* JADX WARN: Code duplicated, block: B:125:0x028f  */
    /* JADX WARN: Code duplicated, block: B:127:0x0292  */
    /* JADX WARN: Code duplicated, block: B:128:0x0295  */
    /* JADX WARN: Code duplicated, block: B:131:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:133:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:139:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:141:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:145:0x030f  */
    public final Object invoke(Object obj, Object obj2) {
        fsf0 fsf0Var;
        boolean z;
        boolean z2;
        vrf0 urf0Var;
        boolean z3;
        fsf0 fsf0Var2;
        dsf0 dsf0Var;
        List list;
        fsf0 fsf0Var3;
        dsf0 dsf0Var2;
        List list2;
        csf0 csf0Var;
        xj61 xj61Var;
        int iC;
        byte b2 = this.a;
        t0g0 t0g0Var = t0g0.b;
        s0g0 s0g0Var = s0g0.b;
        b7x b7xVar = b7x.a;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                return Next.j();
            case 1:
                return First.b((qtf0) obj2);
            case 2:
                return Next.j();
            case 3:
                return null;
            case 4:
                qnf0 qnf0Var = (qnf0) obj;
                return Next.i(rnf0.a((rnf0) obj2, (kw9) null, (vef0) null, qnf0Var.b, qnf0Var.d, (String) null, (ArrayList) null, (String) null, (wkt) null, 975), vby0.x(qnf0Var));
            case 5:
                return Next.h((mpf0) obj2);
            case 6:
                fpf0 fpf0Var = (fpf0) obj;
                mpf0 mpf0Var = (mpf0) obj2;
                mpf0Var.getClass();
                return First.c(new mpf0(mpf0Var.a, new kpf0(fpf0Var.c)), Collections.singleton(new gof0(fpf0Var.a, fpf0Var.b)));
            case 7:
                iqf0 iqf0Var = (iqf0) jhc1.t((Bundle) obj, "stickers-picker-element-state-key", iqf0.class);
                return iqf0Var == null ? new iqf0() : iqf0Var;
            case 8:
                nyb1 nyb1Var = (nyb1) obj;
                List list3 = nyb1Var.a;
                ArrayList arrayList = new ArrayList();
                Iterator it = list3.iterator();
                while (it.hasNext()) {
                    List list4 = ((mwb1) it.next()).c;
                    ArrayList arrayList2 = new ArrayList(q7h.U(list4, 10));
                    Iterator it2 = list4.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(((rvb1) it2.next()).a);
                    }
                    r7h.W(arrayList2, arrayList);
                }
                List listJ0 = o7h.j0(arrayList);
                List<k820> list5 = nyb1Var.b;
                ArrayList arrayList3 = new ArrayList(q7h.U(list5, 10));
                for (k820 k820Var : list5) {
                    arrayList3.add(new zpf0(k820Var.a, k820Var.b, k820Var.c));
                }
                return new hqf0(arrayList3, listJ0, nyb1Var.c != null);
            case 9:
                frf0 frf0Var = (frf0) obj;
                gsf0 gsf0Var = (gsf0) obj2;
                int i2 = gsf0Var.f;
                Object obj3 = gsf0Var.g;
                String str = gsf0Var.b;
                yqf0 yqf0Var = frf0Var.a;
                String str2 = yqf0Var.a;
                String str3 = yqf0Var.b;
                dhf0 dhf0Var = yqf0Var.d;
                ArrayList arrayListH = jo31.h(frf0Var);
                fsf0 fsf0VarK = jo31.k(frf0Var);
                fef0 fef0Var = yqf0Var.c;
                bef0 bef0Var = fef0Var.f;
                int i3 = fef0Var.b;
                boolean z4 = yqf0Var.e || fef0Var.h == 3;
                String str4 = gsf0Var.a;
                if (u890.j(str2, str4) && u890.j(str3, str)) {
                    fsf0Var = fsf0VarK;
                    if (dhf0Var == gsf0Var.c && arrayListH.equals(obj3) && u890.j(bef0Var, gsf0Var.d) && i3 == i2 && z4 == gsf0Var.e) {
                        z = false;
                    }
                    if (!u890.j(str2, str4) && u890.j(str3, str) && arrayListH.equals(obj3) && i3 == i2) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    boolean z5 = fef0Var.e;
                    if (z) {
                        urf0Var = new urf0(b7xVar);
                    } else {
                        urf0Var = gsf0Var.t;
                    }
                    vrf0 vrf0Var = urf0Var;
                    erf0 erf0Var = frf0Var.b;
                    nrf0 nrf0Var = gsf0Var.Y.a;
                    z3 = z2;
                    fsf0Var2 = fsf0Var;
                    if (fsf0Var2 instanceof dsf0) {
                        dsf0Var = (dsf0) fsf0Var2;
                    } else {
                        dsf0Var = null;
                    }
                    if (dsf0Var != null) {
                        list = dsf0Var.a;
                    } else {
                        list = null;
                    }
                    fsf0Var3 = gsf0Var.h;
                    boolean z6 = z4;
                    if (fsf0Var3 instanceof dsf0) {
                        dsf0Var2 = (dsf0) fsf0Var3;
                    } else {
                        dsf0Var2 = null;
                    }
                    if (dsf0Var2 != null) {
                        list2 = dsf0Var2.a;
                    } else {
                        list2 = null;
                    }
                    srf0 srf0VarG = jo31.g(erf0Var, nrf0Var, (ArrayList) null, !u890.j(list, list2), 2);
                    if (z3) {
                        iC = l1d.C(fef0Var.b);
                        if (iC == 0) {
                            csf0Var = asf0.a;
                        } else {
                            if (iC == 1 && iC != 2) {
                                eg.o();
                                return null;
                            }
                            csf0Var = bsf0.a;
                        }
                    } else {
                        csf0Var = gsf0Var.X;
                    }
                    gsf0 gsf0Var2 = new gsf0(str2, str3, dhf0Var, bef0Var, z6, i3, arrayListH, fsf0Var2, z5, vrf0Var, csf0Var, srf0VarG, gsf0Var.Z, gsf0Var.N0, gsf0Var.O0, gsf0Var.P0, gsf0Var.Q0, gsf0Var.R0, gsf0Var.S0, gsf0Var.T0, gsf0Var.U0, frf0Var.c, frf0Var.d);
                    xj61Var = new xj61();
                    if (obj3.equals(arrayListH) || i2 != i3) {
                        xj61Var.add(new pqf0(arrayListH, i3));
                    }
                    return Next.i(gsf0Var2, cwl1.j(xj61Var));
                }
                fsf0Var = fsf0VarK;
                z = true;
                if (!u890.j(str2, str4)) {
                    z2 = true;
                } else {
                    z2 = true;
                }
                boolean z7 = fef0Var.e;
                if (z) {
                    urf0Var = new urf0(b7xVar);
                } else {
                    urf0Var = gsf0Var.t;
                }
                vrf0 vrf0Var2 = urf0Var;
                erf0 erf0Var2 = frf0Var.b;
                nrf0 nrf0Var2 = gsf0Var.Y.a;
                z3 = z2;
                fsf0Var2 = fsf0Var;
                if (fsf0Var2 instanceof dsf0) {
                    dsf0Var = (dsf0) fsf0Var2;
                } else {
                    dsf0Var = null;
                }
                if (dsf0Var != null) {
                    list = dsf0Var.a;
                } else {
                    list = null;
                }
                fsf0Var3 = gsf0Var.h;
                boolean z8 = z4;
                if (fsf0Var3 instanceof dsf0) {
                    dsf0Var2 = (dsf0) fsf0Var3;
                } else {
                    dsf0Var2 = null;
                }
                if (dsf0Var2 != null) {
                    list2 = dsf0Var2.a;
                } else {
                    list2 = null;
                }
                srf0 srf0VarG2 = jo31.g(erf0Var2, nrf0Var2, (ArrayList) null, !u890.j(list, list2), 2);
                if (z3) {
                    iC = l1d.C(fef0Var.b);
                    if (iC == 0) {
                        if (iC == 1) {
                        }
                        csf0Var = bsf0.a;
                    } else {
                        csf0Var = asf0.a;
                    }
                } else {
                    csf0Var = gsf0Var.X;
                }
                gsf0 gsf0Var3 = new gsf0(str2, str3, dhf0Var, bef0Var, z8, i3, arrayListH, fsf0Var2, z7, vrf0Var2, csf0Var, srf0VarG2, gsf0Var.Z, gsf0Var.N0, gsf0Var.O0, gsf0Var.P0, gsf0Var.Q0, gsf0Var.R0, gsf0Var.S0, gsf0Var.T0, gsf0Var.U0, frf0Var.c, frf0Var.d);
                xj61Var = new xj61();
                if (obj3.equals(arrayListH)) {
                    xj61Var.add(new pqf0(arrayListH, i3));
                } else {
                    xj61Var.add(new pqf0(arrayListH, i3));
                }
                return Next.i(gsf0Var3, cwl1.j(xj61Var));
            case 10:
                pla1 pla1Var = (rla1) obj2;
                if (pla1Var instanceof pla1) {
                    return new h3r(new d3r(pla1Var.a.toString()));
                }
                if (pla1Var instanceof qla1) {
                    return new j3r(((qla1) pla1Var).a);
                }
                eg.o();
                return null;
            case 11:
                Object value = ((p0g0) obj2).c.a.getValue();
                v0g0.a.getClass();
                r0g0 r0g0Var = r0g0.a;
                if (value == null) {
                    return Boolean.FALSE;
                }
                v0g0 v0g0Var = (v0g0) value;
                if (v0g0Var.equals(s0g0Var)) {
                    return "default";
                }
                return v0g0Var.equals(t0g0Var) ? "empty" : Context$Metadata.SHUFFLE_ALGORITHM_NONE;
            case 12:
                v0g0 v0g0Var2 = (v0g0) obj2;
                if (v0g0Var2.equals(s0g0Var)) {
                    return "default";
                }
                return v0g0Var2.equals(t0g0Var) ? "empty" : Context$Metadata.SHUFFLE_ALGORITHM_NONE;
            case 13:
                n2g0 n2g0Var = (n2g0) obj;
                return new o2g0(n2g0Var.e, (String) obj2, n2g0Var.d);
            case 14:
                Object objT = jhc1.t((Bundle) obj, "parcelable", o2g0.class);
                objT.getClass();
                return (Parcelable) objT;
            case 15:
                s3g0 s3g0Var = (s3g0) obj;
                y3g0 y3g0Var = (y3g0) obj2;
                int i4 = s3g0Var.b;
                int i5 = y3g0Var.b;
                Set set = s3g0Var.a;
                if (i4 != i5) {
                    return Next.h(new y3g0(i4, set));
                }
                return !u890.j(set, y3g0Var.a) ? Next.h(y3g0.a(y3g0Var, set, null, 6)) : Next.j();
            case 16:
                ((Number) obj2).intValue();
                x340 x340Var = (b0k) obj;
                return x0d.k(x340Var, -200693788, 2131958064, x340Var, false);
            case 17:
                ((Number) obj2).intValue();
                x340 x340Var2 = (b0k) obj;
                return x0d.k(x340Var2, -1437710292, 2131958081, x340Var2, false);
            case 18:
                return Next.h(qon1.C(((dbg0) obj).a));
            case 19:
                idg0 idg0Var = (idg0) obj;
                return Next.h(upn1.B(idg0Var.a, idg0Var.b));
            case 20:
                return (ceg0) obj;
            case 21:
                fzr0 fzr0Var = (gzr0) obj2;
                if (fzr0Var instanceof fzr0) {
                    return new agg0(fzr0Var.a);
                }
                if (fzr0Var instanceof ezr0) {
                    return zfg0.a;
                }
                eg.o();
                return null;
            case 22:
                return new ygg0((List) obj, b7xVar);
            case 23:
                return new u7h(u7h.j);
            case 24:
                return new u7h(u7h.j);
            case 25:
                return new u7h(u7h.j);
            case 26:
                return new u7h(u7h.j);
            case 27:
                return new u7h(u7h.j);
            case 28:
                zg90.a((ye5) obj, (String) obj2);
                return rih1Var;
            default:
                ((ye5) obj).g((String) obj2);
                return rih1Var;
        }
    }
}
