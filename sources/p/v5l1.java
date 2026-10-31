package p;

import com.spotify.wrapped.v1.proto.Bespoke2026Content;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class v5l1 extends hab0 implements iu30 {
    public static final v5l1 N0;
    public static final v5l1 O0;
    public static final v5l1 P0;
    public static final v5l1 Q0;
    public static final v5l1 R0;
    public static final v5l1 S0;
    public static final v5l1 T0;
    public static final v5l1 U0;
    public static final v5l1 V0;
    public static final v5l1 W0;
    public static final v5l1 X;
    public static final v5l1 X0;
    public static final v5l1 Y;
    public static final v5l1 Y0;
    public static final v5l1 Z;
    public static final v5l1 Z0;
    public static final v5l1 a1;
    public static final v5l1 b;
    public static final v5l1 b1;
    public static final v5l1 c;
    public static final v5l1 c1;
    public static final v5l1 d;
    public static final v5l1 d1;
    public static final v5l1 e;
    public static final v5l1 e1;
    public static final v5l1 f;
    public static final v5l1 g;
    public static final v5l1 h;
    public static final v5l1 i;
    public static final v5l1 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new v5l1(i2, (byte) 0);
        c = new v5l1(i2, (byte) 1);
        d = new v5l1(i2, (byte) 2);
        e = new v5l1(i2, (byte) 3);
        f = new v5l1(i2, (byte) 4);
        g = new v5l1(i2, (byte) 5);
        h = new v5l1(i2, (byte) 6);
        i = new v5l1(i2, (byte) 7);
        t = new v5l1(i2, (byte) 8);
        X = new v5l1(i2, (byte) 9);
        Y = new v5l1(i2, (byte) 10);
        Z = new v5l1(i2, (byte) 11);
        N0 = new v5l1(i2, (byte) 12);
        O0 = new v5l1(i2, (byte) 13);
        P0 = new v5l1(i2, (byte) 14);
        Q0 = new v5l1(i2, (byte) 15);
        R0 = new v5l1(i2, (byte) 16);
        S0 = new v5l1(i2, (byte) 17);
        T0 = new v5l1(i2, (byte) 18);
        U0 = new v5l1(i2, (byte) 19);
        V0 = new v5l1(i2, (byte) 20);
        W0 = new v5l1(i2, (byte) 21);
        X0 = new v5l1(i2, (byte) 22);
        Y0 = new v5l1(i2, (byte) 23);
        Z0 = new v5l1(i2, (byte) 24);
        a1 = new v5l1(i2, (byte) 25);
        b1 = new v5l1(i2, (byte) 26);
        c1 = new v5l1(i2, (byte) 27);
        d1 = new v5l1(i2, (byte) 28);
        e1 = new v5l1(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v5l1(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        byte b2 = this.a;
        b7x b7xVar = b7x.a;
        boolean z = true;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                if (!(obj instanceof f7l1) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 1:
                if (obj instanceof rih1) {
                    return null;
                }
                return (f7l1) obj;
            case 2:
                if (!(obj instanceof xkk1) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 3:
                if (obj instanceof rih1) {
                    return null;
                }
                return (xkk1) obj;
            case 4:
                kd31 kd31Var = (kd31) obj;
                kd31Var.u(kd31Var.T0.h() * 24.0f);
                kd31Var.w(er31.a);
                kd31Var.f(true);
                return rih1Var;
            case 5:
                b261.x((e261) obj, 0);
                return rih1Var;
            case 6:
                return Boolean.valueOf(obj instanceof bbl1);
            case 7:
                return Boolean.valueOf(obj instanceof bbl1);
            case 8:
                return Boolean.valueOf(obj instanceof bbl1);
            case 9:
                if (!(obj instanceof bbl1) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 10:
                if (obj instanceof rih1) {
                    return null;
                }
                return (bbl1) obj;
            case 11:
                return new p7l1((f7l1) obj);
            case 12:
                kby kbyVar = ((cxc0) obj).f;
                f7l1 f7l1VarA = kbyVar.x.a(f7l1.class);
                sqe sqeVar = f7l1VarA != null ? f7l1VarA.a : null;
                z6l1 z6l1Var = sqeVar instanceof z6l1 ? (z6l1) sqeVar : null;
                String str = kbyVar.b;
                String str2 = kbyVar.c;
                if (str2 == null) {
                    str2 = "";
                }
                String str3 = z6l1Var != null ? z6l1Var.d : null;
                return new j7l1(str, str2, str3 != null ? str3 : "");
            case 13:
                if (!(obj instanceof f7l1) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 14:
                if (obj instanceof rih1) {
                    return null;
                }
                return (f7l1) obj;
            case 15:
                return b7xVar;
            case 16:
                t6l1 t6l1Var = ((q6l1) obj).c;
                return new o9c(t6l1Var.a, t6l1Var.c, t6l1Var.b);
            case 17:
                acl1 acl1Var = ((dyo0) obj).a.a;
                String str4 = acl1Var.a;
                ArrayList arrayList = acl1Var.b;
                ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
                for (Iterator it = arrayList.iterator(); it.hasNext(); it = it) {
                    zbl1 zbl1Var = (zbl1) it.next();
                    arrayList2.add(new y5l1(zbl1Var.a, zbl1Var.b, zbl1Var.c, zbl1Var.d, zbl1Var.e, zbl1Var.f, zbl1Var.g, zbl1Var.h, zbl1Var.i, zbl1Var.j, zbl1Var.k, zbl1Var.l, zbl1Var.m));
                }
                return new z5l1(str4, arrayList2);
            case 18:
                xcl1 xcl1Var = ((l5l1) obj).c;
                String str5 = xcl1Var.a;
                ArrayList<vcl1> arrayList3 = xcl1Var.c;
                ArrayList arrayList4 = new ArrayList(q7h.U(arrayList3, 10));
                for (vcl1 vcl1Var : arrayList3) {
                    arrayList4.add(new e6l1(vcl1Var.a, vcl1Var.b, vcl1Var.c, vcl1Var.d, vcl1Var.e));
                }
                return new f6l1(str5, arrayList4, xcl1Var.b, true, "watch-feed-entrypoint-card-browse-client-native", str5, 0, 128);
            case 19:
                return b7xVar;
            case 20:
                return w7x.a;
            case 21:
                return Boolean.valueOf(((z0i) obj) instanceof kfx0);
            case 22:
                return Boolean.valueOf(((z0i) obj) instanceof kfx0);
            case 23:
                ((Boolean) obj).getClass();
                return rih1Var;
            case 24:
                ((Boolean) obj).getClass();
                return rih1Var;
            case 25:
                return Integer.valueOf(((Number) obj).intValue());
            case 26:
                return Integer.valueOf(((Number) obj).intValue());
            case 27:
                return Integer.valueOf(((Number) obj).intValue() / 2);
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                return Integer.valueOf((-((Number) obj).intValue()) / 2);
            default:
                dhl dhlVar = (dhl) obj;
                yf.p(dhlVar.g, dhlVar.c.g, 0.0f, 6);
                dhlVar.f(new e5u((p3v) null, "wrap"));
                dhlVar.g(new e5u((p3v) null, "parent"));
                return rih1Var;
        }
    }
}
