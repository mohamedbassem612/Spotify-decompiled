package p;

import android.os.Bundle;
import com.spotify.scrollsita.v1.Section;
import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class hea1 extends hab0 implements iu30 {
    public static final hea1 N0;
    public static final hea1 O0;
    public static final hea1 P0;
    public static final hea1 Q0;
    public static final hea1 R0;
    public static final hea1 S0;
    public static final hea1 T0;
    public static final hea1 U0;
    public static final hea1 V0;
    public static final hea1 W0;
    public static final hea1 X;
    public static final hea1 X0;
    public static final hea1 Y;
    public static final hea1 Y0;
    public static final hea1 Z;
    public static final hea1 Z0;
    public static final hea1 a1;
    public static final hea1 b;
    public static final hea1 b1;
    public static final hea1 c;
    public static final hea1 c1;
    public static final hea1 d;
    public static final hea1 d1;
    public static final hea1 e;
    public static final hea1 e1;
    public static final hea1 f;
    public static final hea1 g;
    public static final hea1 h;
    public static final hea1 i;
    public static final hea1 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new hea1(i2, (byte) 0);
        c = new hea1(i2, (byte) 1);
        d = new hea1(i2, (byte) 2);
        e = new hea1(i2, (byte) 3);
        f = new hea1(i2, (byte) 4);
        g = new hea1(i2, (byte) 5);
        h = new hea1(i2, (byte) 6);
        i = new hea1(i2, (byte) 7);
        t = new hea1(i2, (byte) 8);
        X = new hea1(i2, (byte) 9);
        Y = new hea1(i2, (byte) 10);
        Z = new hea1(i2, (byte) 11);
        N0 = new hea1(i2, (byte) 12);
        O0 = new hea1(i2, (byte) 13);
        P0 = new hea1(i2, (byte) 14);
        Q0 = new hea1(i2, (byte) 15);
        R0 = new hea1(i2, (byte) 16);
        S0 = new hea1(i2, (byte) 17);
        T0 = new hea1(i2, (byte) 18);
        U0 = new hea1(i2, (byte) 19);
        V0 = new hea1(i2, (byte) 20);
        W0 = new hea1(i2, (byte) 21);
        X0 = new hea1(i2, (byte) 22);
        Y0 = new hea1(i2, (byte) 23);
        Z0 = new hea1(i2, (byte) 24);
        a1 = new hea1(i2, (byte) 25);
        b1 = new hea1(i2, (byte) 26);
        c1 = new hea1(i2, (byte) 27);
        d1 = new hea1(i2, (byte) 28);
        e1 = new hea1(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hea1(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        byte b2 = this.a;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                if (obj != null) {
                    return (jo70) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.identitytrait.IdentityTrait");
                return null;
            case 1:
                return Boolean.valueOf(obj instanceof qaa1);
            case 2:
                if (obj != null) {
                    return (qaa1) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.songdnaeligibility.SongDnaEligibility");
                return null;
            case 3:
                return rih1Var;
            case 4:
                uv11 uv11Var = (uv11) obj;
                return new rjo(uv11Var.a, uv11Var.b);
            case 5:
                return new xzq(new ujo((d0r) obj, (byte) 0), f);
            case 6:
                yq11 yq11Var = (yq11) obj;
                return new uv11(yq11Var.a, yq11Var.b, (Integer) null, yq11Var.c, yq11Var.f, (tv11) null, 0, 228);
            case 7:
                return mno1.h(new mmr0[]{new mmr0("SortAndFilterElement_isDialogOpen", Boolean.valueOf(((vga1) obj).c))});
            case 8:
                return new vga1((uga1) null, (sga1) null, ((Bundle) obj).getBoolean("SortAndFilterElement_isDialogOpen"), (cga1) null, 11);
            case 9:
                return new gha1((g3d0) null);
            case 10:
                return new g4d0((String) obj);
            case 11:
                return (g3d0) obj;
            case 12:
                return Boolean.valueOf(obj instanceof g3d0);
            case 13:
                if (obj != null) {
                    return (g3d0) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.listplatform.endpoints.ListSortOrder");
                return null;
            case 14:
                return (qxc0) obj;
            case 15:
                return fha1.a;
            case 16:
                return Boolean.valueOf(obj instanceof qxc0);
            case 17:
                if (obj != null) {
                    return (qxc0) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.listplatform.endpoints.kodiak.ListMetadataTable.Entity");
                return null;
            case 18:
                return String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(((Number) obj).byteValue())}, 1));
            case 19:
                return new rxc0((String) obj);
            case 20:
                return (qxc0) obj;
            case 21:
                return Boolean.valueOf(obj instanceof qxc0);
            case 22:
                if (obj != null) {
                    return (qxc0) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.listplatform.endpoints.kodiak.ListMetadataTable.Entity");
                return null;
            case 23:
                int iC = l1d.C(((hfr0) obj).a);
                if (iC == 0) {
                    return pma1.a;
                }
                if (iC == 1) {
                    return pma1.b;
                }
                eg.o();
                return null;
            case 24:
                return w7x.a;
            case 25:
                return new dsa1();
            case 26:
                return new h1l0((i3l0) obj);
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                b7x b7xVar = b7x.a;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), ((h1l0) obj).a, r6h1.c, System.currentTimeMillis());
            case 28:
                return rih1Var;
            default:
                mva1 mva1Var = (mva1) obj;
                return new hua1(mva1Var.c, mva1Var.b, mva1Var.d, (String) null, (Float) null, (Float) null, 1.0f, false, false, ltt0.b, false, false, (qig1) null, exa1.a, (nmw0) null);
        }
    }
}
