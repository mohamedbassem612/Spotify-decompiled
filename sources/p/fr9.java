package p;

import android.view.ViewGroup;
import android.view.ViewParent;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import spotify.restrictions.permissions.permissions_proto.PermissionsEsperanto;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class fr9 extends hab0 implements iu30 {
    public static final fr9 N0;
    public static final fr9 O0;
    public static final fr9 P0;
    public static final fr9 Q0;
    public static final fr9 R0;
    public static final fr9 S0;
    public static final fr9 T0;
    public static final fr9 U0;
    public static final fr9 V0;
    public static final fr9 W0;
    public static final fr9 X;
    public static final fr9 X0;
    public static final fr9 Y;
    public static final fr9 Y0;
    public static final fr9 Z;
    public static final fr9 Z0;
    public static final fr9 a1;
    public static final fr9 b;
    public static final fr9 b1;
    public static final fr9 c;
    public static final fr9 c1;
    public static final fr9 d;
    public static final fr9 d1;
    public static final fr9 e;
    public static final fr9 e1;
    public static final fr9 f;
    public static final fr9 g;
    public static final fr9 h;
    public static final fr9 i;
    public static final fr9 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new fr9(i2, (byte) 0);
        c = new fr9(i2, (byte) 1);
        d = new fr9(i2, (byte) 2);
        e = new fr9(i2, (byte) 3);
        f = new fr9(i2, (byte) 4);
        g = new fr9(i2, (byte) 5);
        h = new fr9(i2, (byte) 6);
        i = new fr9(i2, (byte) 7);
        t = new fr9(i2, (byte) 8);
        X = new fr9(i2, (byte) 9);
        Y = new fr9(i2, (byte) 10);
        Z = new fr9(i2, (byte) 11);
        N0 = new fr9(i2, (byte) 12);
        O0 = new fr9(i2, (byte) 13);
        P0 = new fr9(i2, (byte) 14);
        Q0 = new fr9(i2, (byte) 15);
        R0 = new fr9(i2, (byte) 16);
        S0 = new fr9(i2, (byte) 17);
        T0 = new fr9(i2, (byte) 18);
        U0 = new fr9(i2, (byte) 19);
        V0 = new fr9(i2, (byte) 20);
        W0 = new fr9(i2, (byte) 21);
        X0 = new fr9(i2, (byte) 22);
        Y0 = new fr9(i2, (byte) 23);
        Z0 = new fr9(i2, (byte) 24);
        a1 = new fr9(i2, (byte) 25);
        b1 = new fr9(i2, (byte) 26);
        c1 = new fr9(i2, (byte) 27);
        d1 = new fr9(i2, (byte) 28);
        e1 = new fr9(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fr9(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        byte b2 = this.a;
        rih1 rih1Var = rih1.a;
        boolean z = true;
        switch (b2) {
            case 0:
                return Boolean.valueOf(((PermissionsEsperanto.BYOMRestrictionState) obj).n());
            case 1:
                return ((rs9) obj).a;
            case 2:
                return ((rs9) obj).a;
            case 3:
                if (!(obj instanceof xkk1) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 4:
                if (obj instanceof rih1) {
                    return null;
                }
                return (xkk1) obj;
            case 5:
                return Boolean.valueOf(obj instanceof jo70);
            case 6:
                if (obj != null) {
                    return (jo70) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.identitytrait.IdentityTrait");
                return null;
            case 7:
                return rih1Var;
            case 8:
                ((Number) obj).floatValue();
                return rih1Var;
            case 9:
                ((Number) obj).floatValue();
                return rih1Var;
            case 10:
                return ((nx9) obj).l();
            case 11:
                return ((nx9) obj).j();
            case 12:
                return new ix9(true, fx9.a, ((hx9) obj).b);
            case 13:
                return x4p1.j((a0a) obj, 0, (wkt) null);
            case 14:
                g271 g271Var = (g271) obj;
                u771 u771Var = g271Var.a;
                g0a g0aVar = (g0a) u771Var.b();
                t771 t771Var = u771Var.a;
                return new a0a(t771Var.a.a, g0aVar.a, g0aVar.b, g271Var.c, g271Var.d, g0aVar.c, g0aVar.d, g0aVar.e, g0aVar.f, mqo1.G(g0aVar.g), g0aVar.h, g0aVar.i, g0aVar.t, g0aVar.X, t771Var.b, u771Var.b.c, g0aVar.Y);
            case 15:
                b3a b3aVar = (b3a) obj;
                return new c3a(b3aVar.a, b3aVar.b, mji0.a);
            case 16:
                return new s2l0((i3l0) obj);
            case 17:
                return new t3a(48, "", "", (String) null, true, false);
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                u3a u3aVar = (u3a) obj;
                return new v3a(u3aVar.c, u3aVar.a, false, null);
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                return ((u3a) obj).a;
            case 20:
                return ((u3a) obj).a;
            case 21:
                if (!(obj instanceof vnb1) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 22:
                if (obj instanceof rih1) {
                    return null;
                }
                return (vnb1) obj;
            case 23:
                if (!(obj instanceof jo70) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 24:
                if (obj instanceof rih1) {
                    return null;
                }
                return (jo70) obj;
            case 25:
                return new t2l0((i3l0) obj);
            case 26:
                ((h8a) obj).a.a();
                return rih1Var;
            case 27:
                return Boolean.valueOf(((z7a) obj) != null);
            case 28:
                return ((e6a) obj).a;
            default:
                ViewParent parent = ((ViewGroup) obj).getParent();
                if (parent instanceof ViewGroup) {
                    return (ViewGroup) parent;
                }
                return null;
        }
    }
}
