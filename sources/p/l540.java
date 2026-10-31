package p;

import com.spotify.automix.proto.TransitionOuterClass$Overlap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class l540 extends hab0 implements iu30 {
    public static final l540 N0;
    public static final l540 O0;
    public static final l540 P0;
    public static final l540 Q0;
    public static final l540 R0;
    public static final l540 S0;
    public static final l540 T0;
    public static final l540 U0;
    public static final l540 V0;
    public static final l540 W0;
    public static final l540 X;
    public static final l540 X0;
    public static final l540 Y;
    public static final l540 Y0;
    public static final l540 Z;
    public static final l540 Z0;
    public static final l540 a1;
    public static final l540 b;
    public static final l540 b1;
    public static final l540 c;
    public static final l540 c1;
    public static final l540 d;
    public static final l540 d1;
    public static final l540 e;
    public static final l540 e1;
    public static final l540 f;
    public static final l540 g;
    public static final l540 h;
    public static final l540 i;
    public static final l540 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new l540(i2, (byte) 0);
        c = new l540(i2, (byte) 1);
        d = new l540(i2, (byte) 2);
        e = new l540(i2, (byte) 3);
        f = new l540(i2, (byte) 4);
        g = new l540(i2, (byte) 5);
        h = new l540(i2, (byte) 6);
        i = new l540(i2, (byte) 7);
        t = new l540(i2, (byte) 8);
        X = new l540(i2, (byte) 9);
        Y = new l540(i2, (byte) 10);
        Z = new l540(i2, (byte) 11);
        N0 = new l540(i2, (byte) 12);
        O0 = new l540(i2, (byte) 13);
        P0 = new l540(i2, (byte) 14);
        Q0 = new l540(i2, (byte) 15);
        R0 = new l540(i2, (byte) 16);
        S0 = new l540(i2, (byte) 17);
        T0 = new l540(i2, (byte) 18);
        U0 = new l540(i2, (byte) 19);
        V0 = new l540(i2, (byte) 20);
        W0 = new l540(i2, (byte) 21);
        X0 = new l540(i2, (byte) 22);
        Y0 = new l540(i2, (byte) 23);
        Z0 = new l540(i2, (byte) 24);
        a1 = new l540(i2, (byte) 25);
        b1 = new l540(i2, (byte) 26);
        c1 = new l540(i2, (byte) 27);
        d1 = new l540(i2, (byte) 28);
        e1 = new l540(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l540(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        goj0 goj0VarA;
        v740 v740Var;
        boolean z = false;
        switch (this.a) {
            case 0:
                return Boolean.valueOf(obj instanceof c98);
            case 1:
                if (obj != null) {
                    return (c98) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.audiobookdirectsales.AudiobookDirectSales");
                return null;
            case 2:
                return (String) obj;
            case 3:
                return (String) obj;
            case 4:
                return Boolean.valueOf((obj instanceof xkk1) || (obj instanceof rih1));
            case 5:
                if (obj instanceof rih1) {
                    return null;
                }
                return (xkk1) obj;
            case 6:
                return Boolean.valueOf(obj instanceof w281);
            case 7:
                if (obj != null) {
                    return (w281) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.showaccess.ShowAccessInfo");
                return null;
            case 8:
                return (String) obj;
            case 9:
                return (String) obj;
            case 10:
                return new p540((s540) null);
            case 11:
                int iOrdinal = ((vco) obj).ordinal();
                if (iOrdinal == 0 || iOrdinal == 1) {
                    return a640.a;
                }
                eg.o();
                return null;
            case 12:
                return new tnb1();
            case 13:
                return (String) obj;
            case 14:
                return (v740) obj;
            case 15:
                return (String) obj;
            case 16:
                l1z l1zVar = (l1z) obj;
                if (l1zVar != null && !l1zVar.b) {
                    z = true;
                }
                return new g640(z, (String) null);
            case 17:
                return (String) obj;
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                return (String) obj;
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                return Boolean.valueOf((obj instanceof w281) || (obj instanceof rih1));
            case 20:
                if (obj instanceof rih1) {
                    return null;
                }
                return (w281) obj;
            case 21:
                return Boolean.valueOf((obj instanceof xkk1) || (obj instanceof rih1));
            case 22:
                if (obj instanceof rih1) {
                    return null;
                }
                return (xkk1) obj;
            case 23:
                return Boolean.valueOf((obj instanceof l1z) || (obj instanceof rih1));
            case 24:
                if (obj instanceof rih1) {
                    return null;
                }
                return (l1z) obj;
            case 25:
                return Boolean.valueOf(obj instanceof v740);
            case 26:
                if (obj != null) {
                    return (v740) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.gatedentityrelations.GatedEntityRelations");
                return null;
            case 27:
                return new tnb1();
            case 28:
                ioj0 ioj0Var = (ioj0) obj;
                String str = (String) o7h.r0(ioj0Var.a.b());
                if (str == null) {
                    str = "";
                }
                hoj0 hoj0VarC = ioj0Var.c(v740.class, str);
                return (hoj0VarC == null || (goj0VarA = hoj0VarC.a()) == null || (v740Var = (v740) goj0VarA.a) == null) ? new v740(z6x.a) : v740Var;
            default:
                dxo0 dxo0Var = (dxo0) obj;
                return new y540(dxo0Var.a, dxo0Var.b);
        }
    }
}
