package p;

import com.spotify.wrapped.v1.proto.Bespoke2026Content;
import java.lang.annotation.Annotation;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class wam1 extends hab0 implements Function0 {
    public static final wam1 N0;
    public static final wam1 O0;
    public static final wam1 P0;
    public static final wam1 Q0;
    public static final wam1 R0;
    public static final wam1 S0;
    public static final wam1 T0;
    public static final wam1 U0;
    public static final wam1 V0;
    public static final wam1 W0;
    public static final wam1 X;
    public static final wam1 X0;
    public static final wam1 Y;
    public static final wam1 Z;
    public static final wam1 b;
    public static final wam1 c;
    public static final wam1 d;
    public static final wam1 e;
    public static final wam1 f;
    public static final wam1 g;
    public static final wam1 h;
    public static final wam1 i;
    public static final wam1 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 0;
        b = new wam1(i2, (byte) 0);
        c = new wam1(i2, (byte) 1);
        d = new wam1(i2, (byte) 2);
        e = new wam1(i2, (byte) 3);
        f = new wam1(i2, (byte) 4);
        g = new wam1(i2, (byte) 5);
        h = new wam1(i2, (byte) 6);
        i = new wam1(i2, (byte) 7);
        t = new wam1(i2, (byte) 8);
        X = new wam1(i2, (byte) 9);
        Y = new wam1(i2, (byte) 10);
        Z = new wam1(i2, (byte) 11);
        N0 = new wam1(i2, (byte) 12);
        O0 = new wam1(i2, (byte) 13);
        P0 = new wam1(i2, (byte) 14);
        Q0 = new wam1(i2, (byte) 15);
        R0 = new wam1(i2, (byte) 16);
        S0 = new wam1(i2, (byte) 17);
        T0 = new wam1(i2, (byte) 18);
        U0 = new wam1(i2, (byte) 19);
        V0 = new wam1(i2, (byte) 20);
        W0 = new wam1(i2, (byte) 21);
        X0 = new wam1(i2, (byte) 22);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wam1(hwx0 hwx0Var, iu30 iu30Var, ven0 ven0Var) {
        super(0);
        this.a = (byte) 27;
    }

    public final Object invoke() {
        String str;
        String str2;
        String str3;
        byte b2 = this.a;
        rih1 rih1Var = rih1.a;
        int i2 = 0;
        switch (b2) {
            case 0:
            case 1:
            case 2:
                return rih1Var;
            case 3:
                return null;
            case 4:
                jd11 jd11Var = rc11.a;
                return new fv41("com.spotify.xrprojected.ui.navigation.XrDestination", jd11Var.b(lkm1.class), new tka0[]{jd11Var.b(jkm1.class), jd11Var.b(kkm1.class)}, new nma0[]{new pfp0("LYRICS", jkm1.INSTANCE, new Annotation[0]), new pfp0("NPV", kkm1.INSTANCE, new Annotation[0])}, new Annotation[0]);
            case 5:
                return new pfp0("LYRICS", jkm1.INSTANCE, new Annotation[0]);
            case 6:
                return new pfp0("NPV", kkm1.INSTANCE, new Annotation[0]);
            case 7:
                return new SimpleDateFormat("yyyy", Locale.getDefault());
            case 8:
                w6b1 w6b1VarA = f7b1.a(blc0.F4);
                return (w6b1VarA == null || (str = (String) w6b1VarA.c.get(0)) == null) ? "" : str;
            case 9:
                w6b1 w6b1VarA2 = f7b1.a(blc0.H4);
                return (w6b1VarA2 == null || (str2 = (String) w6b1VarA2.c.get(0)) == null) ? "" : str2;
            case 10:
                w6b1 w6b1VarA3 = f7b1.a(blc0.I4);
                return (w6b1VarA3 == null || (str3 = (String) w6b1VarA3.c.get(0)) == null) ? "" : str3;
            case 11:
                List list = (List) prm1.d.getValue();
                ArrayList arrayList = new ArrayList(q7h.U(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((prm1) it.next()).c);
                }
                return o7h.l1(arrayList);
            case 12:
                prm1[] prm1VarArrValues = prm1.values();
                ArrayList arrayList2 = new ArrayList(prm1VarArrValues.length);
                int length = prm1VarArrValues.length;
                while (i2 < length) {
                    prm1 prm1Var = prm1VarArrValues[i2];
                    arrayList2.add(new mmr0(prm1Var.b, prm1Var));
                    i2++;
                }
                return sqg0.T(arrayList2);
            case 13:
                prm1[] prm1VarArrValues2 = prm1.values();
                ArrayList arrayList3 = new ArrayList(prm1VarArrValues2.length);
                int length2 = prm1VarArrValues2.length;
                while (i2 < length2) {
                    prm1 prm1Var2 = prm1VarArrValues2[i2];
                    arrayList3.add(new mmr0(prm1Var2.c, prm1Var2));
                    i2++;
                }
                return sqg0.T(arrayList3);
            case 14:
                prm1[] prm1VarArrValues3 = prm1.values();
                ArrayList arrayList4 = new ArrayList(prm1VarArrValues3.length);
                int length3 = prm1VarArrValues3.length;
                while (i2 < length3) {
                    prm1 prm1Var3 = prm1VarArrValues3[i2];
                    arrayList4.add(new mmr0(prm1Var3.c.c, prm1Var3));
                    i2++;
                }
                return sqg0.T(arrayList4);
            case 15:
                return o7h.l1(f46.H0(qrm1.values(), new epj1((byte) 8)));
            case 16:
                List list2 = (List) qrm1.d.getValue();
                ArrayList arrayList5 = new ArrayList(q7h.U(list2, 10));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList5.add(((qrm1) it2.next()).c);
                }
                return o7h.l1(arrayList5);
            case 17:
                qrm1[] qrm1VarArrValues = qrm1.values();
                ArrayList arrayList6 = new ArrayList(qrm1VarArrValues.length);
                int length4 = qrm1VarArrValues.length;
                while (i2 < length4) {
                    qrm1 qrm1Var = qrm1VarArrValues[i2];
                    arrayList6.add(new mmr0(qrm1Var.b, qrm1Var));
                    i2++;
                }
                return sqg0.T(arrayList6);
            case 18:
                qrm1[] qrm1VarArrValues2 = qrm1.values();
                ArrayList arrayList7 = new ArrayList(qrm1VarArrValues2.length);
                int length5 = qrm1VarArrValues2.length;
                while (i2 < length5) {
                    qrm1 qrm1Var2 = qrm1VarArrValues2[i2];
                    arrayList7.add(new mmr0(qrm1Var2.c, qrm1Var2));
                    i2++;
                }
                return sqg0.T(arrayList7);
            case 19:
                qrm1[] qrm1VarArrValues3 = qrm1.values();
                ArrayList arrayList8 = new ArrayList(qrm1VarArrValues3.length);
                int length6 = qrm1VarArrValues3.length;
                while (i2 < length6) {
                    qrm1 qrm1Var3 = qrm1VarArrValues3[i2];
                    arrayList8.add(new mmr0(qrm1Var3.c.c, qrm1Var3));
                    i2++;
                }
                return sqg0.T(arrayList8);
            case 20:
                return Boolean.FALSE;
            case 21:
                return new lik1("spotify:internal:your-library:messaging");
            case 22:
                return rih1Var;
            case 23:
                return new frr0(0L);
            case 24:
                return new zq00("chat", (String) null);
            case 25:
                return new ek3();
            case 26:
                return null;
            case 27:
                return rih1Var;
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                return new tgm((String) null, false, false, true, false, false, false, (yh10) null, false, false, 0, false, false, false, false, false, (iu30) null, false, false, (g371) null, (c821) null, false, (String) null, (iu30) null, (p860) null, (mgo0) null, false, false, -11, 1);
            default:
                int i3 = tcg.a;
                return new k3x();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wam1(Object obj, byte b2) {
        super(0);
        this.a = b2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wam1(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }
}
