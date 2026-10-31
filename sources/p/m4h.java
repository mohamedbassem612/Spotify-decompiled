package p;

import android.content.Intent;
import com.spotify.scrollsita.v1.Section;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class m4h extends hab0 implements iu30 {
    public static final m4h N0;
    public static final m4h O0;
    public static final m4h P0;
    public static final m4h Q0;
    public static final m4h R0;
    public static final m4h S0;
    public static final m4h T0;
    public static final m4h U0;
    public static final m4h V0;
    public static final m4h W0;
    public static final m4h X;
    public static final m4h X0;
    public static final m4h Y;
    public static final m4h Y0;
    public static final m4h Z;
    public static final m4h Z0;
    public static final m4h a1;
    public static final m4h b;
    public static final m4h b1;
    public static final m4h c;
    public static final m4h c1;
    public static final m4h d;
    public static final m4h d1;
    public static final m4h e;
    public static final m4h e1;
    public static final m4h f;
    public static final m4h g;
    public static final m4h h;
    public static final m4h i;
    public static final m4h t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new m4h(i2, (byte) 0);
        c = new m4h(i2, (byte) 1);
        d = new m4h(i2, (byte) 2);
        e = new m4h(i2, (byte) 3);
        f = new m4h(i2, (byte) 4);
        g = new m4h(i2, (byte) 5);
        h = new m4h(i2, (byte) 6);
        i = new m4h(i2, (byte) 7);
        t = new m4h(i2, (byte) 8);
        X = new m4h(i2, (byte) 9);
        Y = new m4h(i2, (byte) 10);
        Z = new m4h(i2, (byte) 11);
        N0 = new m4h(i2, (byte) 12);
        O0 = new m4h(i2, (byte) 13);
        P0 = new m4h(i2, (byte) 14);
        Q0 = new m4h(i2, (byte) 15);
        R0 = new m4h(i2, (byte) 16);
        S0 = new m4h(i2, (byte) 17);
        T0 = new m4h(i2, (byte) 18);
        U0 = new m4h(i2, (byte) 19);
        V0 = new m4h(i2, (byte) 20);
        W0 = new m4h(i2, (byte) 21);
        X0 = new m4h(i2, (byte) 22);
        Y0 = new m4h(i2, (byte) 23);
        Z0 = new m4h(i2, (byte) 24);
        a1 = new m4h(i2, (byte) 25);
        b1 = new m4h(i2, (byte) 26);
        c1 = new m4h(i2, (byte) 27);
        d1 = new m4h(i2, (byte) 28);
        e1 = new m4h(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m4h(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                return Boolean.valueOf(!(((s6h) obj) instanceof p6h));
            case 1:
                return new tj4((byte) 8);
            case 2:
                return (String) obj;
            case 3:
                return (String) obj;
            case 4:
                return (String) obj;
            case 5:
                return xsf.a((String) obj);
            case 6:
                return ihc1.Z0((String) obj, "?");
            case 7:
                return Boolean.valueOf((obj instanceof xkk1) || (obj instanceof rih1));
            case 8:
                if (obj instanceof rih1) {
                    return null;
                }
                return (xkk1) obj;
            case 9:
                return Boolean.valueOf((obj instanceof dxc0) || (obj instanceof rih1));
            case 10:
                if (obj instanceof rih1) {
                    return null;
                }
                return (dxc0) obj;
            case 11:
                return Boolean.valueOf((obj instanceof qxc0) || (obj instanceof rih1));
            case 12:
                if (obj instanceof rih1) {
                    return null;
                }
                return (qxc0) obj;
            case 13:
                return Boolean.valueOf((obj instanceof vnb1) || (obj instanceof rih1));
            case 14:
                if (obj instanceof rih1) {
                    return null;
                }
                return (vnb1) obj;
            case 15:
                return Boolean.valueOf(obj instanceof jo70);
            case 16:
                if (obj != null) {
                    return (jo70) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.identitytrait.IdentityTrait");
                return null;
            case 17:
                o6h o6hVar = (o6h) obj;
                t6h.f.getClass();
                return new r6h(o6hVar.a, o6hVar.b, o6hVar.c, o6hVar.d, o6hVar.e, null);
            case 18:
                return new l6h((wkt) obj);
            case 19:
                return new g6h(((Boolean) obj).booleanValue());
            case 20:
                g271 g271Var = (g271) obj;
                int i2 = g271Var.c;
                u771 u771Var = g271Var.a;
                t771 t771Var = u771Var.a;
                z771 z771Var = t771Var.b;
                pz61 pz61Var = u771Var.b;
                return new o6h(i2, z771Var, pz61Var.c, ((w6h) pz61Var.b).a, t771Var.a);
            case 21:
                return (z7h) obj;
            case 22:
                long jA = u7h.a(((u7h) obj).a, kah.x);
                return new ne5(u7h.c(jA), u7h.g(jA), u7h.f(jA), u7h.d(jA));
            case 23:
                return new tzg1(X0, new syf((hah) obj, (byte) 20));
            case 24:
                return new p3v(((vzq0) obj).a());
            case 25:
                return l1d.m("Triggered by intent with action ", ((Intent) obj).getAction());
            case 26:
                Set set = s4b1.f;
                return f4i1.f("Triggered by a ", zjy.k((Intent) obj), " intent");
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                Set set2 = s4b1.f;
                return f4i1.f("Triggered by a ", zjy.k((Intent) obj), " intent");
            case 28:
                return "triggered by intent " + ((Intent) obj);
            default:
                return new mld(((yfh) obj).a.a);
        }
    }
}
