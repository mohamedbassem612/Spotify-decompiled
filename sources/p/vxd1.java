package p;

import android.net.Uri;
import android.os.Parcelable;
import com.spotify.scrollsita.v1.Section;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class vxd1 extends hab0 implements iu30 {
    public static final vxd1 N0;
    public static final vxd1 O0;
    public static final vxd1 P0;
    public static final vxd1 Q0;
    public static final vxd1 R0;
    public static final vxd1 S0;
    public static final vxd1 T0;
    public static final vxd1 U0;
    public static final vxd1 V0;
    public static final vxd1 W0;
    public static final vxd1 X;
    public static final vxd1 X0;
    public static final vxd1 Y;
    public static final vxd1 Y0;
    public static final vxd1 Z;
    public static final vxd1 Z0;
    public static final vxd1 a1;
    public static final vxd1 b;
    public static final vxd1 b1;
    public static final vxd1 c;
    public static final vxd1 c1;
    public static final vxd1 d;
    public static final vxd1 d1;
    public static final vxd1 e;
    public static final vxd1 e1;
    public static final vxd1 f;
    public static final vxd1 g;
    public static final vxd1 h;
    public static final vxd1 i;
    public static final vxd1 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new vxd1(i2, (byte) 0);
        c = new vxd1(i2, (byte) 1);
        d = new vxd1(i2, (byte) 2);
        e = new vxd1(i2, (byte) 3);
        f = new vxd1(i2, (byte) 4);
        g = new vxd1(i2, (byte) 5);
        h = new vxd1(i2, (byte) 6);
        i = new vxd1(i2, (byte) 7);
        t = new vxd1(i2, (byte) 8);
        X = new vxd1(i2, (byte) 9);
        Y = new vxd1(i2, (byte) 10);
        Z = new vxd1(i2, (byte) 11);
        N0 = new vxd1(i2, (byte) 12);
        O0 = new vxd1(i2, (byte) 13);
        P0 = new vxd1(i2, (byte) 14);
        Q0 = new vxd1(i2, (byte) 15);
        R0 = new vxd1(i2, (byte) 16);
        S0 = new vxd1(i2, (byte) 17);
        T0 = new vxd1(i2, (byte) 18);
        U0 = new vxd1(i2, (byte) 19);
        V0 = new vxd1(i2, (byte) 20);
        W0 = new vxd1(i2, (byte) 21);
        X0 = new vxd1(i2, (byte) 22);
        Y0 = new vxd1(i2, (byte) 23);
        Z0 = new vxd1(i2, (byte) 24);
        a1 = new vxd1(i2, (byte) 25);
        b1 = new vxd1(i2, (byte) 26);
        c1 = new vxd1(i2, (byte) 27);
        d1 = new vxd1(i2, (byte) 28);
        e1 = new vxd1(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vxd1(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        y2e1 w2e1Var;
        byte b2 = this.a;
        boolean z = true;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                dhl dhlVar = (dhl) obj;
                ube ubeVar = dhlVar.e;
                ihl ihlVar = dhlVar.c;
                yf.p(ubeVar, ihlVar.e, 0.0f, 6);
                xid.r(dhlVar.d, ihlVar.d, 0.0f, 6);
                return rih1Var;
            case 1:
                dhl dhlVar2 = (dhl) obj;
                ube ubeVar2 = dhlVar2.e;
                ihl ihlVar2 = dhlVar2.c;
                yf.p(ubeVar2, ihlVar2.e, 0.0f, 6);
                xid.r(dhlVar2.f, ihlVar2.f, 0.0f, 6);
                return rih1Var;
            case 2:
                dhl dhlVar3 = (dhl) obj;
                ube ubeVar3 = dhlVar3.e;
                ihl ihlVar3 = dhlVar3.c;
                yf.p(ubeVar3, ihlVar3.e, 0.0f, 6);
                xid.r(dhlVar3.f, ihlVar3.f, 0.0f, 6);
                return rih1Var;
            case 3:
                dhl dhlVar4 = (dhl) obj;
                ube ubeVar4 = dhlVar4.e;
                ihl ihlVar4 = dhlVar4.c;
                yf.p(ubeVar4, ihlVar4.e, 0.0f, 6);
                xid.r(dhlVar4.d, ihlVar4.d, 0.0f, 6);
                return rih1Var;
            case 4:
                dhl dhlVar5 = (dhl) obj;
                ube ubeVar5 = dhlVar5.e;
                ihl ihlVar5 = dhlVar5.c;
                yf.p(ubeVar5, ihlVar5.e, 0.0f, 6);
                xid.r(dhlVar5.f, ihlVar5.f, 0.0f, 6);
                return rih1Var;
            case 5:
                return (u0e1) obj;
            case 6:
                return f4i1.c(((Number) obj).intValue(), "section_");
            case 7:
                return ((khc0) obj).a;
            case 8:
                return ((a1e1) obj).a;
            case 9:
                return ((a1e1) obj).a;
            case 10:
                return ((a1e1) obj).a;
            case 11:
                if (!(obj instanceof xkk1) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 12:
                if (obj instanceof rih1) {
                    return null;
                }
                return (xkk1) obj;
            case 13:
                if (!(obj instanceof hll) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 14:
                if (obj instanceof rih1) {
                    return null;
                }
                return (hll) obj;
            case 15:
                return Boolean.valueOf(obj instanceof jo70);
            case 16:
                if (obj != null) {
                    return (jo70) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.identitytrait.IdentityTrait");
                return null;
            case 17:
                z2e1 z2e1Var = (z2e1) obj;
                c3e1 c3e1Var = z2e1Var.c;
                dee1 dee1Var = c3e1Var.b;
                jlw0 jlw0Var = c3e1Var.f;
                u771 u771Var = z2e1Var.a;
                int i2 = z2e1Var.b;
                if (dee1Var instanceof dee1) {
                    w2e1Var = new w2e1(dee1Var.a);
                } else {
                    if (!(dee1Var instanceof eee1)) {
                        eg.o();
                        return null;
                    }
                    w2e1Var = x2e1.a;
                }
                return new a3e1(u771Var, i2, w2e1Var, c3e1Var.c, c3e1Var.a, dee1Var, c3e1Var.d, c3e1Var.e, Uri.parse(jlw0Var.a), jlw0Var.b, c3e1Var.g, c3e1Var.h, c3e1Var.i, null, c3e1Var.t);
            case 18:
                g271 g271Var = (g271) obj;
                u771 u771Var2 = g271Var.a;
                c871 c871Var = u771Var2.b.b;
                if (c871Var instanceof c3e1) {
                    return new z2e1(u771Var2, g271Var.c, (c3e1) c871Var);
                }
                eg.m("Check failed.");
                return null;
            case 19:
                return ((l561) obj).a;
            case 20:
                Set set = (Set) obj;
                return set == null ? w7x.a : set;
            case 21:
                if (!(obj instanceof Set) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 22:
                if (obj instanceof rih1) {
                    return null;
                }
                return (Set) obj;
            case 23:
                return rih1Var;
            case 24:
                return rih1Var;
            case 25:
                return new vce1((uce1) obj, q061.c);
            case 26:
                sde1 sde1Var = (sde1) obj;
                String str = sde1Var.b;
                String str2 = sde1Var.e;
                boolean z2 = sde1Var.h;
                int i3 = sde1Var.i;
                z0e1 z0e1Var = sde1Var.f;
                return new tde1(str, str2, 0, z2, i3, z0e1Var.a, z0e1Var.b, sde1Var.g, sde1Var.c);
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                return mno1.h(new mmr0[]{new mmr0("parcelable", (Parcelable) obj)});
            case 28:
                ((xas) obj).a(c1, ppd1.Q0);
                return rih1Var;
            default:
                return new xde1(0, new wde1("", 0, 0, "", new z0e1(0, -1), false, false, 1));
        }
    }
}
