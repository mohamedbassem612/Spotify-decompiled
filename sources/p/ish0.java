package p;

import com.spotify.mobius.First;
import com.spotify.mobius.Next;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ish0 extends hab0 implements vu30 {
    public static final ish0 N0;
    public static final ish0 O0;
    public static final ish0 P0;
    public static final ish0 Q0;
    public static final ish0 R0;
    public static final ish0 S0;
    public static final ish0 T0;
    public static final ish0 U0;
    public static final ish0 V0;
    public static final ish0 W0;
    public static final ish0 X;
    public static final ish0 X0;
    public static final ish0 Y;
    public static final ish0 Y0;
    public static final ish0 Z;
    public static final ish0 Z0;
    public static final ish0 a1;
    public static final ish0 b;
    public static final ish0 b1;
    public static final ish0 c;
    public static final ish0 c1;
    public static final ish0 d;
    public static final ish0 d1;
    public static final ish0 e;
    public static final ish0 e1;
    public static final ish0 f;
    public static final ish0 g;
    public static final ish0 h;
    public static final ish0 i;
    public static final ish0 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 2;
        b = new ish0(i2, (byte) 0);
        c = new ish0(i2, (byte) 1);
        d = new ish0(i2, (byte) 2);
        e = new ish0(i2, (byte) 3);
        f = new ish0(i2, (byte) 4);
        g = new ish0(i2, (byte) 5);
        h = new ish0(i2, (byte) 6);
        i = new ish0(i2, (byte) 7);
        t = new ish0(i2, (byte) 8);
        X = new ish0(i2, (byte) 9);
        Y = new ish0(i2, (byte) 10);
        Z = new ish0(i2, (byte) 11);
        N0 = new ish0(i2, (byte) 12);
        O0 = new ish0(i2, (byte) 13);
        P0 = new ish0(i2, (byte) 14);
        Q0 = new ish0(i2, (byte) 15);
        R0 = new ish0(i2, (byte) 16);
        S0 = new ish0(i2, (byte) 17);
        T0 = new ish0(i2, (byte) 18);
        U0 = new ish0(i2, (byte) 19);
        V0 = new ish0(i2, (byte) 20);
        W0 = new ish0(i2, (byte) 21);
        X0 = new ish0(i2, (byte) 22);
        Y0 = new ish0(i2, (byte) 23);
        Z0 = new ish0(i2, (byte) 24);
        a1 = new ish0(i2, (byte) 25);
        b1 = new ish0(i2, (byte) 26);
        c1 = new ish0(i2, (byte) 27);
        d1 = new ish0(i2, (byte) 28);
        e1 = new ish0(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ish0(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj, Object obj2) {
        goj0 goj0VarA;
        goj0 goj0VarA2;
        tlr0 tlr0Var;
        goj0 goj0VarA3;
        byte b2 = this.a;
        iri0 iri0Var = iri0.a;
        w281 w281Var = null;
        switch (b2) {
            case 0:
                gsh0 gsh0Var = (gsh0) obj2;
                int i2 = gsh0Var.a;
                boolean z = i2 == 1 || i2 == 2;
                if (z && gsh0Var.b.isEmpty()) {
                    return First.c(gsh0.a(gsh0Var, 0, null, true, true, null, false, false, null, 2035), Collections.singleton(new jrh0(gsh0Var.X, 0)));
                }
                if (z) {
                    return First.b(gsh0Var);
                }
                return First.c(gsh0Var, Collections.singleton(new erh0(gsh0Var.g > 0)));
            case 1:
                n5i0 n5i0Var = (n5i0) obj;
                u5i0 u5i0Var = (u5i0) obj2;
                u5i0 u5i0VarQ = zmo1.q(n5i0Var, n5i0Var.a);
                if (u890.j(n5i0Var.b, u5i0Var.d)) {
                    u5i0VarQ = u5i0.a(u5i0VarQ, null, null, null, false, 0, false, null, false, u5i0Var.T0, 524287);
                }
                return Next.h(u5i0VarQ);
            case 2:
                n5i0 n5i0Var2 = (n5i0) obj;
                u5i0 u5i0Var2 = (u5i0) obj2;
                v5i0 v5i0Var = n5i0Var2.a;
                return First.b((u890.j(u5i0Var2, new u5i0(new v5i0(0L, 80), z6x.a, p5i0.a, "", new o5i0(new uvg1(0L, 0L)), 2, 2, false, false, true, false, false, null, 0L, 0L, null, 1044480)) || !u890.j(u5i0Var2.d, n5i0Var2.b)) ? zmo1.q(n5i0Var2, v5i0Var) : u5i0.a(u5i0Var2, v5i0Var, null, null, false, 0, false, null, false, null, 1048574));
            case 3:
                return Next.h((w7i0) obj);
            case 4:
                hoj0 hoj0VarC = ((ioj0) obj2).c(yo60.class, ((iai0) obj).b().d);
                if (hoj0VarC == null) {
                    return null;
                }
                goj0 goj0VarA4 = hoj0VarC.a();
                yo60 yo60Var = goj0VarA4 != null ? (yo60) goj0VarA4.a : null;
                if (yo60Var == null) {
                    return null;
                }
                String str = yo60Var.a;
                if (ihc1.y0(str)) {
                    return null;
                }
                return new yrw(Collections.singletonList(new zrw(str)));
            case 5:
                return ((gai0) obj).c;
            case 6:
                return ((hai0) obj).c;
            case 7:
                return ((gai0) obj).c;
            case 8:
                return ((hai0) obj).c;
            case 9:
                ioj0 ioj0Var = (ioj0) obj2;
                String str2 = ((cbi0) obj).c.h;
                if (str2 == null) {
                    return null;
                }
                hoj0 hoj0VarC2 = ioj0Var.c(pjw0.class, str2);
                pjw0 pjw0Var = (pjw0) ((hoj0VarC2 == null || (goj0VarA = hoj0VarC2.a()) == null) ? null : (ez00) goj0VarA.a);
                if (pjw0Var == null) {
                    return null;
                }
                ljw0 ljw0Var = pjw0Var.b;
                ljw0 ljw0Var2 = ljw0Var instanceof ljw0 ? ljw0Var : null;
                if (ljw0Var2 == null) {
                    return null;
                }
                String str3 = ljw0Var2.a.a.a.a;
                if (str3.length() == 0) {
                    return null;
                }
                return new yrw(Collections.singletonList(new zrw(str3)));
            case 10:
                return ((dbi0) obj).b;
            case 11:
                return new k3h1(((ihi0) obj).d);
            case 12:
                return ((yfi0) obj).b;
            case 13:
                return ((zfi0) obj).b;
            case 14:
                return ((khi0) obj).c;
            case 15:
                return ((lhi0) obj).c;
            case 16:
                return ((khi0) obj).c;
            case 17:
                return ((lhi0) obj).c;
            case 18:
                return (xji0) obj2;
            case 19:
                hki0 hki0Var = (hki0) obj;
                hki0Var.getClass();
                return eso1.N(hki0Var);
            case 20:
                return new joi0((ioi0) obj, ((Boolean) obj2).booleanValue());
            case 21:
                return (fpi0) obj;
            case 22:
                tpi0 tpi0Var = (tpi0) obj;
                return new upi0(((i430) obj2).c, tpi0Var.d, tpi0Var.e);
            case 23:
                mmr0 mmr0Var = (mmr0) obj2;
                tlr0 tlr0Var2 = (tlr0) mmr0Var.a;
                i1r i1rVar = (k1r) mmr0Var.b;
                if (i1rVar instanceof j1r) {
                    return new cri0(iri0Var);
                }
                i1r i1rVar2 = i1rVar instanceof i1r ? i1rVar : null;
                return new cri0(yto1.u(tlr0Var2, i1rVar2 != null ? (w281) i1rVar2.a : null));
            case 24:
                return new mmr0((tlr0) obj, (k1r) obj2);
            case 25:
                String str4 = (String) obj;
                ioj0 ioj0Var2 = (ioj0) obj2;
                hoj0 hoj0VarC3 = ioj0Var2.c(tlr0.class, str4);
                if (hoj0VarC3 == null || (goj0VarA2 = hoj0VarC3.a()) == null || (tlr0Var = (tlr0) goj0VarA2.a) == null) {
                    return iri0Var;
                }
                hoj0 hoj0VarC4 = ioj0Var2.c(w281.class, str4);
                if (hoj0VarC4 != null && (goj0VarA3 = hoj0VarC4.a()) != null) {
                    w281Var = (w281) goj0VarA3.a;
                }
                return yto1.u(tlr0Var, w281Var);
            case 26:
                return null;
            case 27:
                return null;
            case 28:
                return zso1.c0(((bfr0) obj).b, (op80) obj2);
            default:
                avi0 avi0Var = (avi0) obj2;
                ArrayList<ivi0> arrayList = avi0Var.a;
                ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
                for (ivi0 ivi0Var : arrayList) {
                    arrayList2.add(new evi0(ivi0Var.a, ivi0Var.b, ivi0Var.c, ivi0Var.d, ivi0Var.e));
                }
                return new fvi0(avi0Var.c, avi0Var.d, arrayList2, avi0Var.b);
        }
    }
}
