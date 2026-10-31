package p;

import com.spotify.mobius.First;
import com.spotify.mobius.Next;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class vbv0 extends hab0 implements vu30 {
    public static final vbv0 N0;
    public static final vbv0 O0;
    public static final vbv0 P0;
    public static final vbv0 Q0;
    public static final vbv0 R0;
    public static final vbv0 S0;
    public static final vbv0 T0;
    public static final vbv0 U0;
    public static final vbv0 V0;
    public static final vbv0 W0;
    public static final vbv0 X;
    public static final vbv0 X0;
    public static final vbv0 Y;
    public static final vbv0 Y0;
    public static final vbv0 Z;
    public static final vbv0 Z0;
    public static final vbv0 a1;
    public static final vbv0 b;
    public static final vbv0 b1;
    public static final vbv0 c;
    public static final vbv0 c1;
    public static final vbv0 d;
    public static final vbv0 d1;
    public static final vbv0 e;
    public static final vbv0 e1;
    public static final vbv0 f;
    public static final vbv0 g;
    public static final vbv0 h;
    public static final vbv0 i;
    public static final vbv0 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 2;
        b = new vbv0(i2, (byte) 0);
        c = new vbv0(i2, (byte) 1);
        d = new vbv0(i2, (byte) 2);
        e = new vbv0(i2, (byte) 3);
        f = new vbv0(i2, (byte) 4);
        g = new vbv0(i2, (byte) 5);
        h = new vbv0(i2, (byte) 6);
        i = new vbv0(i2, (byte) 7);
        t = new vbv0(i2, (byte) 8);
        X = new vbv0(i2, (byte) 9);
        Y = new vbv0(i2, (byte) 10);
        Z = new vbv0(i2, (byte) 11);
        N0 = new vbv0(i2, (byte) 12);
        O0 = new vbv0(i2, (byte) 13);
        P0 = new vbv0(i2, (byte) 14);
        Q0 = new vbv0(i2, (byte) 15);
        R0 = new vbv0(i2, (byte) 16);
        S0 = new vbv0(i2, (byte) 17);
        T0 = new vbv0(i2, (byte) 18);
        U0 = new vbv0(i2, (byte) 19);
        V0 = new vbv0(i2, (byte) 20);
        W0 = new vbv0(i2, (byte) 21);
        X0 = new vbv0(i2, (byte) 22);
        Y0 = new vbv0(i2, (byte) 23);
        Z0 = new vbv0(i2, (byte) 24);
        a1 = new vbv0(i2, (byte) 25);
        b1 = new vbv0(i2, (byte) 26);
        c1 = new vbv0(i2, (byte) 27);
        d1 = new vbv0(i2, (byte) 28);
        e1 = new vbv0(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vbv0(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj, Object obj2) {
        boolean z = false;
        switch (this.a) {
            case 0:
                tbv0 tbv0Var = (tbv0) obj2;
                tbv0Var.getClass();
                return Next.h(tbv0.a(tbv0Var, null, (String) obj, 1));
            case 1:
                tbv0 tbv0Var2 = (tbv0) obj2;
                tbv0Var2.getClass();
                return First.b(tbv0.a(tbv0Var2, null, (String) obj, 1));
            case 2:
                return null;
            case 3:
                return zso1.c0(((efr0) obj).b, (op80) obj2);
            case 4:
                siv0 siv0Var = (siv0) obj2;
                return new ajv0(((viv0) obj).a, siv0Var.a, siv0Var.b);
            case 5:
                mmr0 mmr0Var = (mmr0) obj2;
                Boolean bool = (Boolean) mmr0Var.a;
                Boolean bool2 = (Boolean) mmr0Var.b;
                if (bool.booleanValue()) {
                    return xiv0.b;
                }
                return bool2.booleanValue() ? xiv0.c : xiv0.a;
            case 6:
                return null;
            case 7:
                return new wuv0((List) obj2);
            case 8:
                return null;
            case 9:
                return null;
            case 10:
                return null;
            case 11:
                return null;
            case 12:
                return null;
            case 13:
                return null;
            case 14:
                return null;
            case 15:
                return null;
            case 16:
                return null;
            case 17:
                return null;
            case 18:
                return Boolean.valueOf(((o4n) obj).a.equals(((o4n) obj2).a));
            case 19:
                return Boolean.valueOf(u890.j(((kh51) obj).a, ((kh51) obj2).a));
            case 20:
                ljd0 ljd0Var = (ljd0) obj;
                ljd0 ljd0Var2 = (ljd0) obj2;
                if (u890.j(ljd0Var.a, ljd0Var2.a) && ljd0Var.b == ljd0Var2.b && u890.j(ljd0Var.c, ljd0Var2.c) && u890.j(ljd0Var.d, ljd0Var2.d) && u890.j(ljd0Var.e, ljd0Var2.e) && ljd0Var.f == ljd0Var2.f) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 21:
                List list = ((mui0) obj).a;
                int size = list.size();
                List list2 = ((mui0) obj2).a;
                if (size == list2.size()) {
                    ArrayList<mmr0> arrayListV1 = o7h.v1(list, list2);
                    if (arrayListV1.isEmpty()) {
                        z = true;
                    } else {
                        for (mmr0 mmr0Var2 : arrayListV1) {
                            gui0 gui0Var = (gui0) mmr0Var2.a;
                            gui0 gui0Var2 = (gui0) mmr0Var2.b;
                            if (!gui0Var.a.equals(gui0Var2.a) || !gui0Var.b.equals(gui0Var2.b) || !gui0Var.c.equals(gui0Var2.c) || !u890.j(gui0Var.d, gui0Var2.d) || !u890.j(gui0Var.e, gui0Var2.e)) {
                            }
                        }
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            case 22:
                ArrayList arrayList = ((szu0) obj).a;
                int size2 = arrayList.size();
                ArrayList arrayList2 = ((szu0) obj2).a;
                if (size2 == arrayList2.size()) {
                    ArrayList<mmr0> arrayListV2 = o7h.v1(arrayList, arrayList2);
                    if (arrayListV2.isEmpty()) {
                        z = true;
                    } else {
                        for (mmr0 mmr0Var3 : arrayListV2) {
                            vgu0 vgu0Var = (vgu0) mmr0Var3.a;
                            vgu0 vgu0Var2 = (vgu0) mmr0Var3.b;
                            if (!u890.j(vgu0Var.b, vgu0Var2.b) || !u890.j(vgu0Var.a, vgu0Var2.a)) {
                            }
                        }
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            case 23:
                return Boolean.valueOf(u890.j(((izf1) obj).b, ((izf1) obj2).b));
            case 24:
                List list3 = ((r3w0) obj).a;
                int size3 = list3.size();
                List list4 = ((r3w0) obj2).a;
                if (size3 == list4.size()) {
                    ArrayList<mmr0> arrayListV3 = o7h.v1(list3, list4);
                    if (arrayListV3.isEmpty()) {
                        z = true;
                    } else {
                        for (mmr0 mmr0Var4 : arrayListV3) {
                            s3w0 s3w0Var = (s3w0) mmr0Var4.a;
                            s3w0 s3w0Var2 = (s3w0) mmr0Var4.b;
                            if (!u890.j(s3w0Var.a, s3w0Var2.a) || !u890.j(s3w0Var.c, s3w0Var2.c) || !s3w0Var.d.equals(s3w0Var2.d) || s3w0Var.e != s3w0Var2.e || s3w0Var.f != s3w0Var2.f) {
                            }
                        }
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            case 25:
                return ((oei0) obj).c;
            case 26:
                return ((pei0) obj).c;
            case 27:
                v6w0 v6w0Var = (v6w0) obj;
                l5h1 l5h1Var = (m5h1) obj2;
                if ((l5h1Var instanceof l5h1) && u890.j(l5h1Var.a, v6w0Var.a.a)) {
                    z = true;
                }
                return new w6w0(v6w0Var, z);
            case 28:
                return new u7h(((afx) obj).a.b.a());
            default:
                yaw0 yaw0Var = (yaw0) obj;
                xaw0 xaw0Var = (xaw0) obj2;
                String str = yaw0Var.a;
                String str2 = yaw0Var.b;
                String str3 = yaw0Var.c;
                String str4 = yaw0Var.d;
                String str5 = yaw0Var.e;
                boolean z2 = yaw0Var.f;
                boolean z3 = yaw0Var.g;
                boolean z4 = yaw0Var.l;
                boolean z5 = yaw0Var.h;
                k4m k4mVar = yaw0Var.i;
                boolean z6 = yaw0Var.k;
                hwt hwtVar = xaw0Var.b;
                return new zaw0(x760.A(str, str2, str3, str4, str5, z2, z3, z5, k4mVar, z6, hwtVar != null ? hwtVar.d : true, xaw0Var.a, xaw0Var.c, xaw0Var.d, z4));
        }
    }
}
