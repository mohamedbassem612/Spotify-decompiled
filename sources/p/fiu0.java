package p;

import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class fiu0 extends hab0 implements iu30 {
    public static final fiu0 N0;
    public static final fiu0 O0;
    public static final fiu0 P0;
    public static final fiu0 Q0;
    public static final fiu0 R0;
    public static final fiu0 S0;
    public static final fiu0 T0;
    public static final fiu0 U0;
    public static final fiu0 V0;
    public static final fiu0 W0;
    public static final fiu0 X;
    public static final fiu0 X0;
    public static final fiu0 Y;
    public static final fiu0 Y0;
    public static final fiu0 Z;
    public static final fiu0 Z0;
    public static final fiu0 a1;
    public static final fiu0 b;
    public static final fiu0 b1;
    public static final fiu0 c;
    public static final fiu0 c1;
    public static final fiu0 d;
    public static final fiu0 d1;
    public static final fiu0 e;
    public static final fiu0 e1;
    public static final fiu0 f;
    public static final fiu0 g;
    public static final fiu0 h;
    public static final fiu0 i;
    public static final fiu0 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new fiu0(i2, (byte) 0);
        c = new fiu0(i2, (byte) 1);
        d = new fiu0(i2, (byte) 2);
        e = new fiu0(i2, (byte) 3);
        f = new fiu0(i2, (byte) 4);
        g = new fiu0(i2, (byte) 5);
        h = new fiu0(i2, (byte) 6);
        i = new fiu0(i2, (byte) 7);
        t = new fiu0(i2, (byte) 8);
        X = new fiu0(i2, (byte) 9);
        Y = new fiu0(i2, (byte) 10);
        Z = new fiu0(i2, (byte) 11);
        N0 = new fiu0(i2, (byte) 12);
        O0 = new fiu0(i2, (byte) 13);
        P0 = new fiu0(i2, (byte) 14);
        Q0 = new fiu0(i2, (byte) 15);
        R0 = new fiu0(i2, (byte) 16);
        S0 = new fiu0(i2, (byte) 17);
        T0 = new fiu0(i2, (byte) 18);
        U0 = new fiu0(i2, (byte) 19);
        V0 = new fiu0(i2, (byte) 20);
        W0 = new fiu0(i2, (byte) 21);
        X0 = new fiu0(i2, (byte) 22);
        Y0 = new fiu0(i2, (byte) 23);
        Z0 = new fiu0(i2, (byte) 24);
        a1 = new fiu0(i2, (byte) 25);
        b1 = new fiu0(i2, (byte) 26);
        c1 = new fiu0(i2, (byte) 27);
        d1 = new fiu0(i2, (byte) 28);
        e1 = new fiu0(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fiu0(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        boolean z = true;
        switch (this.a) {
            case 0:
                xua0 xua0Var = (xua0) obj;
                xua0Var.a = (short) 800;
                xua0Var.b = (short) 2000;
                Float fValueOf = Float.valueOf(1.0f);
                wua0 wua0VarA = xua0Var.a(fValueOf, 0);
                ilv.a.getClass();
                ceo ceoVar = flv.c;
                wua0VarA.b = ceoVar;
                xua0Var.a(Float.valueOf(1.2f), 400).b = ceoVar;
                xua0Var.a(fValueOf, 800);
                return rih1.a;
            case 1:
                t6t0 t6t0Var = (t6t0) obj;
                return new ne5(t6t0Var.a, t6t0Var.b, t6t0Var.d, t6t0Var.c);
            case 2:
                ne5 ne5Var = (ne5) obj;
                return new t6t0(ne5Var.a, ne5Var.b, ne5Var.c, jch0.U(ne5Var.d));
            case 3:
                return ((n3l0) obj).a("spotify:new:playlist");
            case 4:
                wju0 wju0Var = (wju0) obj;
                return new xju0(0, 3580, wju0Var.a, ihc1.Y0(wju0Var.b, '?'), wju0Var.c);
            case 5:
                return new qvc0(ihc1.Y0(((wju0) obj).b, '?'), (c3d0) null, (Set) null, (mqz0) null, 14);
            case 6:
                return new rxc0(ihc1.Y0(((wju0) obj).b, '?'));
            case 7:
                return Boolean.valueOf(obj instanceof List);
            case 8:
                if (obj != null) {
                    return (List) obj;
                }
                bhn0.i("null cannot be cast to non-null type kotlin.collections.List<com.spotify.listplatform.endpoints.kodiak.ListItemsTable.Item>");
                return null;
            case 9:
                return Boolean.valueOf(obj instanceof qxc0);
            case 10:
                if (obj != null) {
                    return (qxc0) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.listplatform.endpoints.kodiak.ListMetadataTable.Entity");
                return null;
            case 11:
                if (!(obj instanceof fuj0) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 12:
                if (!(obj instanceof fuj0) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 13:
                if (obj instanceof rih1) {
                    return null;
                }
                return (fuj0) obj;
            case 14:
                if (obj instanceof rih1) {
                    return null;
                }
                return (fuj0) obj;
            case 15:
                if (!(obj instanceof q37) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 16:
                if (!(obj instanceof q37) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 17:
                if (obj instanceof rih1) {
                    return null;
                }
                return (q37) obj;
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                if (obj instanceof rih1) {
                    return null;
                }
                return (q37) obj;
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                return Boolean.valueOf(obj instanceof qxc0);
            case 20:
                return Boolean.valueOf(obj instanceof xkk1);
            case 21:
                if (obj != null) {
                    return (qxc0) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.listplatform.endpoints.kodiak.ListMetadataTable.Entity");
                return null;
            case 22:
                if (obj != null) {
                    return (xkk1) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.visualidentitytrait.VisualIdentityTrait");
                return null;
            case 23:
                return Boolean.valueOf(obj instanceof jo70);
            case 24:
                if (obj != null) {
                    return (jo70) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.identitytrait.IdentityTrait");
                return null;
            case 25:
                return Boolean.valueOf(obj instanceof qxc0);
            case 26:
                if (obj != null) {
                    return (qxc0) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.listplatform.endpoints.kodiak.ListMetadataTable.Entity");
                return null;
            case 27:
                return new rxc0(((zul1) obj).getEntityUri());
            case 28:
                return ((z6h) obj).getEntityUri();
            default:
                return ((zul1) obj).getEntityUri();
        }
    }
}
