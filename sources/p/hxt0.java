package p;

import com.spotify.scrollsita.v1.Section;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class hxt0 extends hab0 implements iu30 {
    public static final hxt0 N0;
    public static final hxt0 O0;
    public static final hxt0 P0;
    public static final hxt0 Q0;
    public static final hxt0 R0;
    public static final hxt0 S0;
    public static final hxt0 T0;
    public static final hxt0 U0;
    public static final hxt0 V0;
    public static final hxt0 W0;
    public static final hxt0 X;
    public static final hxt0 X0;
    public static final hxt0 Y;
    public static final hxt0 Y0;
    public static final hxt0 Z;
    public static final hxt0 Z0;
    public static final hxt0 a1;
    public static final hxt0 b;
    public static final hxt0 b1;
    public static final hxt0 c;
    public static final hxt0 c1;
    public static final hxt0 d;
    public static final hxt0 d1;
    public static final hxt0 e;
    public static final hxt0 e1;
    public static final hxt0 f;
    public static final hxt0 g;
    public static final hxt0 h;
    public static final hxt0 i;
    public static final hxt0 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new hxt0(i2, (byte) 0);
        c = new hxt0(i2, (byte) 1);
        d = new hxt0(i2, (byte) 2);
        e = new hxt0(i2, (byte) 3);
        f = new hxt0(i2, (byte) 4);
        g = new hxt0(i2, (byte) 5);
        h = new hxt0(i2, (byte) 6);
        i = new hxt0(i2, (byte) 7);
        t = new hxt0(i2, (byte) 8);
        X = new hxt0(i2, (byte) 9);
        Y = new hxt0(i2, (byte) 10);
        Z = new hxt0(i2, (byte) 11);
        N0 = new hxt0(i2, (byte) 12);
        O0 = new hxt0(i2, (byte) 13);
        P0 = new hxt0(i2, (byte) 14);
        Q0 = new hxt0(i2, (byte) 15);
        R0 = new hxt0(i2, (byte) 16);
        S0 = new hxt0(i2, (byte) 17);
        T0 = new hxt0(i2, (byte) 18);
        U0 = new hxt0(i2, (byte) 19);
        V0 = new hxt0(i2, (byte) 20);
        W0 = new hxt0(i2, (byte) 21);
        X0 = new hxt0(i2, (byte) 22);
        Y0 = new hxt0(i2, (byte) 23);
        Z0 = new hxt0(i2, (byte) 24);
        a1 = new hxt0(i2, (byte) 25);
        b1 = new hxt0(i2, (byte) 26);
        c1 = new hxt0(i2, (byte) 27);
        d1 = new hxt0(i2, (byte) 28);
        e1 = new hxt0(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hxt0(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        byte b2 = this.a;
        b7x b7xVar = b7x.a;
        t2b t2bVar = lgo1.b;
        boolean z = false;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                return Boolean.valueOf((obj instanceof Boolean) || (obj instanceof rih1));
            case 1:
                if (obj instanceof rih1) {
                    return null;
                }
                return (Boolean) obj;
            case 2:
                return Boolean.valueOf((obj instanceof mtl) || (obj instanceof rih1));
            case 3:
                if (obj instanceof rih1) {
                    return null;
                }
                return (mtl) obj;
            case 4:
                return new k1l0((i3l0) obj);
            case 5:
                k1l0 k1l0Var = (k1l0) obj;
                String str = nik1.u6.a;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str != null ? str : "")), k1l0Var.a, r6h1.c, System.currentTimeMillis());
            case 6:
                return ((a7h1) obj).a;
            case 7:
                return ((Throwable) obj).getCause();
            case 8:
                return new l1l0((i3l0) obj);
            case 9:
                l1l0 l1l0Var = (l1l0) obj;
                String str2 = nik1.t1.a;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str2 != null ? str2 : "")), l1l0Var.a, r6h1.c, System.currentTimeMillis());
            case 10:
                return new q6u0("", "", fg91.b);
            case 11:
                return rih1Var;
            case 12:
                return ((r2t) obj).l().c;
            case 13:
                return ((nwl0) obj).e();
            case 14:
                ((n161) obj).b(t2bVar, "TEST_TAG_LEFT_BUTTON");
                return rih1Var;
            case 15:
                ((n161) obj).b(t2bVar, "TEST_TAG_LEFT_BUTTON");
                return rih1Var;
            case 16:
                ((n161) obj).b(t2bVar, "TEST_TAG_RIGHT_BUTTON");
                return rih1Var;
            case 17:
                ((n161) obj).b(t2bVar, "TEST_TAG_RIGHT_BUTTON");
                return rih1Var;
            case 18:
                ((n161) obj).b(t2bVar, "TEST_TAG_SAVE_ACTION_BUTTON");
                return rih1Var;
            case 19:
                return new ecu0((uqo) obj, (String) null);
            case 20:
                return ((jgu0) obj).a;
            case 21:
                return (xkk1) obj;
            case 22:
                return Boolean.valueOf((obj instanceof xkk1) || (obj instanceof rih1));
            case 23:
                if (obj instanceof rih1) {
                    return null;
                }
                return (xkk1) obj;
            case 24:
                fhu0 fhu0Var = (fhu0) obj;
                String str3 = fhu0Var.a;
                String str4 = fhu0Var.b;
                CharSequence charSequence = fhu0Var.c;
                String str5 = fhu0Var.d;
                String str6 = fhu0Var.e;
                d8r0 d8r0Var = fhu0Var.f;
                List list = fhu0Var.h;
                o940 o940Var = fhu0Var.l;
                return new ghu0(str3, str4, charSequence, str5, str6, d8r0Var, false, false, 3, list, (o940Var != null ? o940Var.b : null) == k940.b, !z4p1.z(fhu0Var));
            case 25:
                ghu0 ghu0Var = (ghu0) obj;
                return new khu0(ghu0Var.b, ghu0Var.c, ghu0Var.d, ghu0Var.g, ghu0Var.h, ghu0Var.l, ghu0Var.i, ghu0Var.j, ghu0Var.k);
            case 26:
                return ((pvc0) obj).c;
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                String str7 = (String) obj;
                if (!ihc1.y0(str7)) {
                    Set set = s4b1.f;
                    if (!uic.x(str7).u()) {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            case 28:
                return rih1Var;
            default:
                xua0 xua0Var = (xua0) obj;
                xua0Var.a = (short) 800;
                xua0Var.b = (short) 2000;
                Float fValueOf = Float.valueOf(0.0f);
                wua0 wua0VarA = xua0Var.a(fValueOf, 0);
                ilv.a.getClass();
                ceo ceoVar = flv.c;
                wua0VarA.b = ceoVar;
                Float fValueOf2 = Float.valueOf(5.0f);
                xua0Var.a(fValueOf2, 100).b = ceoVar;
                Float fValueOf3 = Float.valueOf(-5.0f);
                xua0Var.a(fValueOf3, 200).b = ceoVar;
                xua0Var.a(fValueOf2, 300).b = ceoVar;
                xua0Var.a(fValueOf3, 400).b = ceoVar;
                xua0Var.a(fValueOf2, 500).b = ceoVar;
                xua0Var.a(fValueOf, 800);
                return rih1Var;
        }
    }
}
