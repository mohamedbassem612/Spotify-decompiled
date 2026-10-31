package p;

import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class zdh0 extends hab0 implements iu30 {
    public static final zdh0 N0;
    public static final zdh0 O0;
    public static final zdh0 P0;
    public static final zdh0 Q0;
    public static final zdh0 R0;
    public static final zdh0 S0;
    public static final zdh0 T0;
    public static final zdh0 U0;
    public static final zdh0 V0;
    public static final zdh0 W0;
    public static final zdh0 X;
    public static final zdh0 X0;
    public static final zdh0 Y;
    public static final zdh0 Y0;
    public static final zdh0 Z;
    public static final zdh0 Z0;
    public static final zdh0 a1;
    public static final zdh0 b;
    public static final zdh0 b1;
    public static final zdh0 c;
    public static final zdh0 c1;
    public static final zdh0 d;
    public static final zdh0 d1;
    public static final zdh0 e;
    public static final zdh0 e1;
    public static final zdh0 f;
    public static final zdh0 g;
    public static final zdh0 h;
    public static final zdh0 i;
    public static final zdh0 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new zdh0(i2, (byte) 0);
        c = new zdh0(i2, (byte) 1);
        d = new zdh0(i2, (byte) 2);
        e = new zdh0(i2, (byte) 3);
        f = new zdh0(i2, (byte) 4);
        g = new zdh0(i2, (byte) 5);
        h = new zdh0(i2, (byte) 6);
        i = new zdh0(i2, (byte) 7);
        t = new zdh0(i2, (byte) 8);
        X = new zdh0(i2, (byte) 9);
        Y = new zdh0(i2, (byte) 10);
        Z = new zdh0(i2, (byte) 11);
        N0 = new zdh0(i2, (byte) 12);
        O0 = new zdh0(i2, (byte) 13);
        P0 = new zdh0(i2, (byte) 14);
        Q0 = new zdh0(i2, (byte) 15);
        R0 = new zdh0(i2, (byte) 16);
        S0 = new zdh0(i2, (byte) 17);
        T0 = new zdh0(i2, (byte) 18);
        U0 = new zdh0(i2, (byte) 19);
        V0 = new zdh0(i2, (byte) 20);
        W0 = new zdh0(i2, (byte) 21);
        X0 = new zdh0(i2, (byte) 22);
        Y0 = new zdh0(i2, (byte) 23);
        Z0 = new zdh0(i2, (byte) 24);
        a1 = new zdh0(i2, (byte) 25);
        b1 = new zdh0(i2, (byte) 26);
        c1 = new zdh0(i2, (byte) 27);
        d1 = new zdh0(i2, (byte) 28);
        e1 = new zdh0(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zdh0(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        byte b2 = this.a;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                return new wdh0((pfj1) obj);
            case 1:
                List list = ((pfj1) obj).c.b;
                ArrayList arrayList = new ArrayList(q7h.U(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((ltj1) it.next()).e);
                }
                return arrayList;
            case 2:
                return Boolean.valueOf(obj instanceof nbw0);
            case 3:
                return (k1r) obj;
            case 4:
                return Boolean.valueOf(obj instanceof yo60);
            case 5:
                return (k1r) obj;
            case 6:
                return Boolean.valueOf(obj instanceof jo70);
            case 7:
                return (k1r) obj;
            case 8:
                return (String) obj;
            case 9:
                return (String) obj;
            case 10:
                return (String) obj;
            case 11:
                pfj1 pfj1Var = (pfj1) obj;
                List listB = u1p1.B(pfj1Var);
                String str = pfj1Var.a;
                hvl1 hvl1Var = new hvl1(pfj1Var.b, 254, (String) null, (String) null, false, (String) null);
                List list2 = pfj1Var.c.b;
                ArrayList arrayList2 = new ArrayList(q7h.U(list2, 10));
                int i2 = 0;
                for (Object obj2 : list2) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        p7h.T();
                        throw null;
                    }
                    ltj1 ltj1Var = (ltj1) obj2;
                    int iIntValue = ((Number) listB.get(i2)).intValue();
                    String str2 = ltj1Var.e + "-" + iIntValue;
                    String str3 = ltj1Var.e;
                    arrayList2.add(new ggi0(str2, "video-preview-carousel-search", str3, str3));
                    i2 = i3;
                }
                return new hgi0(str, "video-preview-carousel-search", hvl1Var, arrayList2, true, (String) null, 96);
            case 12:
                return rih1Var;
            case 13:
                return Boolean.valueOf(!((Set) obj).isEmpty());
            case 14:
                b261.F((e261) obj, true);
                return rih1Var;
            case 15:
                return ((ie30) obj).t;
            case 16:
                return f46.L0((byte[]) obj);
            case 17:
                return mno1.h(new mmr0[]{new mmr0("parcelable", (Parcelable) obj)});
            case 18:
                return (Parcelable) jhc1.t((Bundle) obj, "parcelable", gsh0.class);
            case 19:
                return rih1Var;
            case 20:
                return rih1Var;
            case 21:
                return rih1Var;
            case 22:
                return rih1Var;
            case 23:
                return nik1.g3.a;
            case 24:
                return new x0l0((i3l0) obj);
            case 25:
                x0l0 x0l0Var = (x0l0) obj;
                String str4 = nuh0.b;
                z7h1 z7h1Var = new z7h1("hit", 1, b7x.a);
                if (str4 == null) {
                    str4 = "";
                }
                return new w7h1("", "", z7h1Var, new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str4)), x0l0Var.a, r6h1.c, System.currentTimeMillis());
            case 26:
                return rih1Var;
            case 27:
                return rih1Var;
            case 28:
                return new huz(((kb61) obj).D().a, (byte) 10);
            default:
                return ((ho70) obj).a;
        }
    }
}
