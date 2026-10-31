package p;

import android.os.Bundle;
import com.spotify.mobius.First;
import com.spotify.mobius.Next;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class b5n0 extends hab0 implements vu30 {
    public static final b5n0 N0;
    public static final b5n0 O0;
    public static final b5n0 P0;
    public static final b5n0 Q0;
    public static final b5n0 R0;
    public static final b5n0 S0;
    public static final b5n0 T0;
    public static final b5n0 U0;
    public static final b5n0 V0;
    public static final b5n0 W0;
    public static final b5n0 X;
    public static final b5n0 X0;
    public static final b5n0 Y;
    public static final b5n0 Y0;
    public static final b5n0 Z;
    public static final b5n0 Z0;
    public static final b5n0 a1;
    public static final b5n0 b;
    public static final b5n0 b1;
    public static final b5n0 c;
    public static final b5n0 c1;
    public static final b5n0 d;
    public static final b5n0 d1;
    public static final b5n0 e;
    public static final b5n0 e1;
    public static final b5n0 f;
    public static final b5n0 g;
    public static final b5n0 h;
    public static final b5n0 i;
    public static final b5n0 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 2;
        b = new b5n0(i2, (byte) 0);
        c = new b5n0(i2, (byte) 1);
        d = new b5n0(i2, (byte) 2);
        e = new b5n0(i2, (byte) 3);
        f = new b5n0(i2, (byte) 4);
        g = new b5n0(i2, (byte) 5);
        h = new b5n0(i2, (byte) 6);
        i = new b5n0(i2, (byte) 7);
        t = new b5n0(i2, (byte) 8);
        X = new b5n0(i2, (byte) 9);
        Y = new b5n0(i2, (byte) 10);
        Z = new b5n0(i2, (byte) 11);
        N0 = new b5n0(i2, (byte) 12);
        O0 = new b5n0(i2, (byte) 13);
        P0 = new b5n0(i2, (byte) 14);
        Q0 = new b5n0(i2, (byte) 15);
        R0 = new b5n0(i2, (byte) 16);
        S0 = new b5n0(i2, (byte) 17);
        T0 = new b5n0(i2, (byte) 18);
        U0 = new b5n0(i2, (byte) 19);
        V0 = new b5n0(i2, (byte) 20);
        W0 = new b5n0(i2, (byte) 21);
        X0 = new b5n0(i2, (byte) 22);
        Y0 = new b5n0(i2, (byte) 23);
        Z0 = new b5n0(i2, (byte) 24);
        a1 = new b5n0(i2, (byte) 25);
        b1 = new b5n0(i2, (byte) 26);
        c1 = new b5n0(i2, (byte) 27);
        d1 = new b5n0(i2, (byte) 28);
        e1 = new b5n0(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b5n0(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    /* JADX WARN: Code duplicated, block: B:112:0x022f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:113:0x0231  */
    /* JADX WARN: Code duplicated, block: B:119:0x0245  */
    /* JADX WARN: Code duplicated, block: B:121:0x0248  */
    /* JADX WARN: Code duplicated, block: B:123:0x024b  */
    /* JADX WARN: Code duplicated, block: B:191:0x01f7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:192:0x01f9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:193:? A[LOOP:1: B:94:0x01e7->B:193:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:96:0x01ed  */
    public final Object invoke(Object obj, Object obj2) {
        f7n0 f7n0VarJ;
        f7n0 f7n0VarJ2;
        int i2;
        String str;
        up70 up70VarA;
        String str2;
        String str3;
        m4m m4mVar;
        Iterator it;
        bin0 bin0Var;
        byte b2 = this.a;
        Set setSingleton = w7x.a;
        switch (b2) {
            case 0:
                return ((bei0) obj).c;
            case 1:
                return ((cei0) obj).c;
            case 2:
                return ((bei0) obj).c;
            case 3:
                return ((cei0) obj).c;
            case 4:
                return null;
            case 5:
                d7n0 d7n0Var = (d7n0) obj;
                f7n0 f7n0Var = (h7n0) obj2;
                if (f7n0Var instanceof f7n0) {
                    f7n0VarJ = f7n0.j(f7n0Var, d7n0Var.c, (wkt) null, 61);
                } else if (f7n0Var instanceof e7n0) {
                    f7n0VarJ = e7n0.j((e7n0) f7n0Var, d7n0Var.a, d7n0Var.b, d7n0Var.c, null, 56);
                } else {
                    if (!(f7n0Var instanceof g7n0)) {
                        eg.o();
                        return null;
                    }
                    f7n0VarJ = g7n0.j((g7n0) f7n0Var, d7n0Var.a, d7n0Var.b, d7n0Var.c, (wkt) null, 8);
                }
                return Next.h(f7n0VarJ);
            case 6:
                d7n0 d7n0Var2 = (d7n0) obj;
                f7n0 f7n0Var2 = (h7n0) obj2;
                int i3 = d7n0Var2.c;
                boolean z = f7n0Var2 instanceof f7n0;
                if (z) {
                    f7n0VarJ2 = f7n0.j(f7n0Var2, i3, (wkt) null, 61);
                } else {
                    boolean z2 = f7n0Var2 instanceof g7n0;
                    u771 u771Var = d7n0Var2.b;
                    int i4 = d7n0Var2.c;
                    ela1 ela1Var = d7n0Var2.a;
                    f7n0VarJ2 = z2 ? g7n0.j((g7n0) f7n0Var2, ela1Var, u771Var, i4, (wkt) null, 8) : new g7n0(ela1Var, u771Var, i4, (wkt) null);
                }
                if (!z) {
                    setSingleton = Collections.singleton(new p6n0(d7n0Var2.a, d7n0Var2.b, i3, false));
                }
                return First.c(f7n0VarJ2, setSingleton);
            case 7:
                return new b9n0(((a9n0) obj).a, ((x8n0) obj2).a);
            case 8:
                Boolean bool = (Boolean) obj2;
                return new k9n0((qxc0) obj, bool != null ? bool.booleanValue() : false);
            case 9:
                return null;
            case 10:
                return null;
            case 11:
                return null;
            case 12:
                return rih1.a;
            case 13:
                qan0 qan0Var = (qan0) obj2;
                hll hllVar = qan0Var.c;
                List list = hllVar.b;
                boolean z3 = list instanceof Collection;
                if (!z3 || !list.isEmpty()) {
                    Iterator it2 = list.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (((ell) it2.next()) == ell.d) {
                                i2 = 3;
                            }
                        } else if (z3 || !list.isEmpty()) {
                            it = list.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    i2 = 1;
                                } else if (((ell) it.next()) == ell.b) {
                                    i2 = 2;
                                }
                            }
                        } else {
                            i2 = 1;
                        }
                    }
                } else if (z3) {
                    it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            i2 = 1;
                        } else if (((ell) it.next()) == ell.b) {
                            i2 = 2;
                        }
                    }
                } else {
                    it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            i2 = 1;
                        } else if (((ell) it.next()) == ell.b) {
                            i2 = 2;
                        }
                    }
                }
                jo70 jo70Var = qan0Var.a;
                String str4 = jo70Var.a;
                String strY0 = o7h.y0(jo70Var.d, ", ", (String) null, (String) null, l9n0.X0, 30);
                mq70 mq70Var = qan0Var.b.b;
                if (mq70Var == null) {
                    if (mq70Var != null) {
                        up70VarA = mq70Var.a(vp70.d);
                        if (up70VarA != null || (str2 = up70VarA.a.a) == null || ihc1.y0(str2)) {
                            str2 = null;
                        }
                        str = str2;
                    } else {
                        str = null;
                    }
                    if (str == null) {
                        str = "";
                    }
                } else {
                    up70 up70VarA2 = mq70Var.a(vp70.c);
                    if (up70VarA2 == null || (str = up70VarA2.a.a) == null || ihc1.y0(str)) {
                        str = null;
                    }
                    if (str == null) {
                        if (mq70Var != null) {
                            up70VarA = mq70Var.a(vp70.d);
                            if (up70VarA != null) {
                                str2 = null;
                            } else {
                                str2 = null;
                            }
                            str = str2;
                        } else {
                            str = null;
                        }
                        if (str == null) {
                            str = "";
                        }
                    }
                }
                String str5 = str;
                long j = hllVar.a;
                jfv jfvVar = new jfv(j);
                if (jfv.f(j, 0L)) {
                    jfvVar = null;
                }
                if (jfvVar != null) {
                    long jU = jfv.u(jfvVar.a, ngv.e);
                    str3 = (jU / 60) + ":" + ihc1.F0(2, String.valueOf(jU % 60));
                } else {
                    str3 = null;
                }
                y2u0 y2u0Var = qan0Var.d;
                int iC = l1d.C(i2);
                if (iC == 0) {
                    m4mVar = m4m.c;
                } else if (iC == 1) {
                    m4mVar = m4m.b;
                } else {
                    if (iC != 2) {
                        eg.o();
                        return null;
                    }
                    m4mVar = m4m.a;
                }
                return new lob1(i2, str4, strY0, str5, str3, true, y2u0Var.a(m4mVar));
            case 14:
                bbn0 bbn0Var = (bbn0) obj;
                rbn0 rbn0Var = (rbn0) obj2;
                boolean z4 = bbn0Var.b;
                String str6 = bbn0Var.a;
                if (u890.j(str6, rbn0Var.a)) {
                    return z4 != rbn0Var.b ? Next.h(rbn0.a(rbn0Var, z4, null, 5)) : Next.j();
                }
                return Next.i(new rbn0(str6, z4), Collections.singleton(new hbn0(bbn0Var)));
            case 15:
                return First.c((rbn0) obj2, Collections.singleton(new hbn0((bbn0) obj)));
            case 16:
                wfn0 wfn0Var = (wfn0) obj2;
                return new yfn0(wfn0Var.a, wfn0Var.b, wfn0Var.c);
            case 17:
                hin0 hin0Var = (hin0) obj;
                Bundle bundle = (Bundle) obj2;
                return (bundle == null || (bin0Var = (bin0) jhc1.t(bundle, "MyAllowlistingRequestsModel", bin0.class)) == null) ? new bin0(hin0Var.a, hin0Var.b, setSingleton, (shn0) null) : bin0Var;
            case 18:
                return ((gon0) obj2).A();
            case 19:
                wsn0 wsn0Var = (wsn0) obj2;
                ArrayList<ctn0> arrayListU = jhc1.u((Bundle) obj, "state-items", ctn0.class);
                arrayListU.getClass();
                ArrayList arrayList = new ArrayList(q7h.U(arrayListU, 10));
                for (ctn0 ctn0Var : arrayListU) {
                    arrayList.add(new btn0(ctn0Var.a, ctn0Var.b, ctn0Var.c, (mtn0) null, ctn0Var.d, ctn0Var.e ? ysn0.a : zsn0.a));
                }
                return new dtn0(wsn0Var.a, wsn0Var.b, mqo1.F(arrayList));
            case 20:
                return new f1o0(((Boolean) obj2).booleanValue());
            case 21:
                return (l3o0) obj;
            case 22:
                return (v3o0) obj;
            case 23:
                return (q5o0) obj2;
            case 24:
                mmr0 mmr0Var = (mmr0) obj;
                ft40 ft40Var = (ft40) obj2;
                return ft40Var instanceof q60 ? new mmr0(ft40Var, mmr0Var.b) : new mmr0(mmr0Var.a, ((gt40) mmr0Var.b).c(ft40Var));
            case 25:
                bc10 bc10Var = (bc10) obj;
                ft40 ft40Var2 = (ft40) obj2;
                return ((ft40Var2 instanceof iql1) || (ft40Var2 instanceof f660) || (ft40Var2 instanceof i8n)) ? new bc10(bc10Var.a.c(ft40Var2), bc10Var.b) : new bc10(bc10Var.a, bc10Var.b.c(ft40Var2));
            case 26:
                ft40 ft40Var3 = (ft40) obj2;
                return ft40Var3 instanceof f660 ? ft40Var3 : obj;
            case 27:
                ft40 ft40Var4 = (ft40) obj2;
                return ft40Var4 instanceof iql1 ? ft40Var4 : obj;
            case 28:
                ft40 ft40Var5 = (ft40) obj2;
                return ft40Var5 instanceof f660 ? ft40Var5 : obj;
            default:
                ft40 ft40Var6 = (ft40) obj2;
                return ft40Var6 instanceof iql1 ? ft40Var6 : obj;
        }
    }
}
