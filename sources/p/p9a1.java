package p;

import com.spotify.scrollsita.v1.Section;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class p9a1 extends hab0 implements iu30 {
    public static final p9a1 N0;
    public static final p9a1 O0;
    public static final p9a1 P0;
    public static final p9a1 Q0;
    public static final p9a1 R0;
    public static final p9a1 S0;
    public static final p9a1 T0;
    public static final p9a1 U0;
    public static final p9a1 V0;
    public static final p9a1 W0;
    public static final p9a1 X;
    public static final p9a1 X0;
    public static final p9a1 Y;
    public static final p9a1 Y0;
    public static final p9a1 Z;
    public static final p9a1 Z0;
    public static final p9a1 a1;
    public static final p9a1 b;
    public static final p9a1 b1;
    public static final p9a1 c;
    public static final p9a1 c1;
    public static final p9a1 d;
    public static final p9a1 d1;
    public static final p9a1 e;
    public static final p9a1 e1;
    public static final p9a1 f;
    public static final p9a1 g;
    public static final p9a1 h;
    public static final p9a1 i;
    public static final p9a1 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new p9a1(i2, (byte) 0);
        c = new p9a1(i2, (byte) 1);
        d = new p9a1(i2, (byte) 2);
        e = new p9a1(i2, (byte) 3);
        f = new p9a1(i2, (byte) 4);
        g = new p9a1(i2, (byte) 5);
        h = new p9a1(i2, (byte) 6);
        i = new p9a1(i2, (byte) 7);
        t = new p9a1(i2, (byte) 8);
        X = new p9a1(i2, (byte) 9);
        Y = new p9a1(i2, (byte) 10);
        Z = new p9a1(i2, (byte) 11);
        N0 = new p9a1(i2, (byte) 12);
        O0 = new p9a1(i2, (byte) 13);
        P0 = new p9a1(i2, (byte) 14);
        Q0 = new p9a1(i2, (byte) 15);
        R0 = new p9a1(i2, (byte) 16);
        S0 = new p9a1(i2, (byte) 17);
        T0 = new p9a1(i2, (byte) 18);
        U0 = new p9a1(i2, (byte) 19);
        V0 = new p9a1(i2, (byte) 20);
        W0 = new p9a1(i2, (byte) 21);
        X0 = new p9a1(i2, (byte) 22);
        Y0 = new p9a1(i2, (byte) 23);
        Z0 = new p9a1(i2, (byte) 24);
        a1 = new p9a1(i2, (byte) 25);
        b1 = new p9a1(i2, (byte) 26);
        c1 = new p9a1(i2, (byte) 27);
        d1 = new p9a1(i2, (byte) 28);
        e1 = new p9a1(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p9a1(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        Map map;
        byte b2 = this.a;
        rih1 rih1Var = rih1.a;
        boolean z = false;
        fjf1 fjf1Var = null;
        switch (b2) {
            case 0:
                b261.c((e261) obj);
                return rih1Var;
            case 1:
                return new d2l0((i3l0) obj);
            case 2:
                return ((d2l0) obj).e();
            case 3:
                return ((r9a1) obj).a;
            case 4:
                return ((r9a1) obj).a;
            case 5:
                return ((r9a1) obj).a;
            case 6:
                return ((r9a1) obj).a;
            case 7:
                return ((r9a1) obj).a;
            case 8:
                return Boolean.valueOf((obj instanceof xkk1) || (obj instanceof rih1));
            case 9:
                if (obj instanceof rih1) {
                    return null;
                }
                return (xkk1) obj;
            case 10:
                return Boolean.valueOf((obj instanceof hll) || (obj instanceof rih1));
            case 11:
                if (obj instanceof rih1) {
                    return null;
                }
                return (hll) obj;
            case 12:
                return Boolean.valueOf((obj instanceof qtt0) || (obj instanceof rih1));
            case 13:
                if (obj instanceof rih1) {
                    return null;
                }
                return (qtt0) obj;
            case 14:
                return Boolean.valueOf((obj instanceof zoy0) || (obj instanceof rih1));
            case 15:
                if (obj instanceof rih1) {
                    return null;
                }
                return (zoy0) obj;
            case 16:
                return Boolean.valueOf(obj instanceof jo70);
            case 17:
                if (obj != null) {
                    return (jo70) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.identitytrait.IdentityTrait");
                return null;
            case 18:
                b261.F((e261) obj, true);
                return rih1Var;
            case 19:
                b261.F((e261) obj, true);
                return rih1Var;
            case 20:
                return rih1Var;
            case 21:
                fjf1 fjf1Var2 = (vhc1) obj;
                fjf1Var = fjf1Var2 instanceof thc1 ? (thc1) fjf1Var2 : null;
                if (fjf1Var != null && (map = ((thc1) fjf1Var).j) != null && !map.containsKey("current_pos")) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 22:
                String str = ((oaa1) obj).a;
                if (str.length() > 0) {
                    return str;
                }
                return null;
            case 23:
                a7q0 a7q0Var = (a7q0) obj;
                if (a7q0Var != null) {
                    long j = a7q0Var.c;
                    fjf1 fjf1VarValueOf = Long.valueOf(j);
                    if (j > 0) {
                        fjf1Var = fjf1VarValueOf;
                    }
                }
                return new naa1(fjf1Var);
            case 24:
                return Boolean.valueOf((obj instanceof a7q0) || (obj instanceof rih1));
            case 25:
                if (obj instanceof rih1) {
                    return null;
                }
                return (a7q0) obj;
            case 26:
                j7e0 j7e0Var = ((hwq) obj).g;
                boolean z2 = j7e0Var instanceof j7e0;
                ArrayList arrayList = z6x.a;
                if (!z2) {
                    return new oaa1(j7e0Var.getUri(), arrayList);
                }
                j7e0 j7e0Var2 = j7e0Var;
                fjf1 fjf1Var3 = j7e0Var2.a.p;
                fjf1Var = fjf1Var3 instanceof fjf1 ? fjf1Var3 : null;
                String str2 = j7e0Var2.b;
                if (fjf1Var != null) {
                    List list = fjf1Var.b;
                    ArrayList arrayList2 = new ArrayList(q7h.U(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(((yif1) it.next()).a);
                    }
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj2 : arrayList2) {
                        if (((String) obj2).length() > 0) {
                            arrayList3.add(obj2);
                        }
                    }
                    arrayList = arrayList3;
                }
                return new oaa1(str2, arrayList);
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                return ((xaa1) obj).a;
            case 28:
                return (qaa1) obj;
            default:
                return ((xaa1) obj).a;
        }
    }
}
