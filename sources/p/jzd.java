package p;

import android.os.Bundle;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class jzd extends hab0 implements iu30 {
    public static final jzd N0;
    public static final jzd O0;
    public static final jzd P0;
    public static final jzd Q0;
    public static final jzd R0;
    public static final jzd S0;
    public static final jzd T0;
    public static final jzd U0;
    public static final jzd V0;
    public static final jzd W0;
    public static final jzd X;
    public static final jzd X0;
    public static final jzd Y;
    public static final jzd Y0;
    public static final jzd Z;
    public static final jzd Z0;
    public static final jzd a1;
    public static final jzd b;
    public static final jzd b1;
    public static final jzd c;
    public static final jzd c1;
    public static final jzd d;
    public static final jzd d1;
    public static final jzd e;
    public static final jzd e1;
    public static final jzd f;
    public static final jzd g;
    public static final jzd h;
    public static final jzd i;
    public static final jzd t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new jzd(i2, (byte) 0);
        c = new jzd(i2, (byte) 1);
        d = new jzd(i2, (byte) 2);
        e = new jzd(i2, (byte) 3);
        f = new jzd(i2, (byte) 4);
        g = new jzd(i2, (byte) 5);
        h = new jzd(i2, (byte) 6);
        i = new jzd(i2, (byte) 7);
        t = new jzd(i2, (byte) 8);
        X = new jzd(i2, (byte) 9);
        Y = new jzd(i2, (byte) 10);
        Z = new jzd(i2, (byte) 11);
        N0 = new jzd(i2, (byte) 12);
        O0 = new jzd(i2, (byte) 13);
        P0 = new jzd(i2, (byte) 14);
        Q0 = new jzd(i2, (byte) 15);
        R0 = new jzd(i2, (byte) 16);
        S0 = new jzd(i2, (byte) 17);
        T0 = new jzd(i2, (byte) 18);
        U0 = new jzd(i2, (byte) 19);
        V0 = new jzd(i2, (byte) 20);
        W0 = new jzd(i2, (byte) 21);
        X0 = new jzd(i2, (byte) 22);
        Y0 = new jzd(i2, (byte) 23);
        Z0 = new jzd(i2, (byte) 24);
        a1 = new jzd(i2, (byte) 25);
        b1 = new jzd(i2, (byte) 26);
        c1 = new jzd(i2, (byte) 27);
        d1 = new jzd(i2, (byte) 28);
        e1 = new jzd(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jzd(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        rde parcelable;
        byte b2 = this.a;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                return (String) obj;
            case 1:
                return (String) obj;
            case 2:
                return (String) obj;
            case 3:
                return rih1Var;
            case 4:
                b261.F((e261) obj, true);
                return rih1Var;
            case 5:
                return o7h.p1(((ner0) obj).d);
            case 6:
                return ((i6e) obj).a.a;
            case 7:
                b261.x((e261) obj, 0);
                return rih1Var;
            case 8:
                return ((d9e) obj).a;
            case 9:
                return ((jo70) obj).a;
            case 10:
                return Boolean.valueOf(obj instanceof jo70);
            case 11:
                if (obj != null) {
                    return (jo70) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.identitytrait.IdentityTrait");
                return null;
            case 12:
                return ((n7e) obj).a;
            case 13:
                return ((n7e) obj).a;
            case 14:
                return ((h9e) obj).d;
            case 15:
                return ((i9e) obj).d;
            case 16:
                q0l0 q0l0Var = (q0l0) obj;
                String str = nik1.z0.a;
                return new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str != null ? str : "")), q0l0Var.a, r6h1.c, System.currentTimeMillis());
            case 17:
                return rih1Var;
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                b261.c((e261) obj);
                return rih1Var;
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                Bundle bundle = (Bundle) obj;
                return (bundle == null || (parcelable = bundle.getParcelable("change_pin_model")) == null) ? new rde("", xde.a) : parcelable;
            case 20:
                return mno1.h(new mmr0[]{new mmr0("change_pin_model", (rde) obj)});
            case 21:
                return bfe.X;
            case 22:
                return (yee) obj;
            case 23:
                return (vee) obj;
            case 24:
                return (noa0) obj;
            case 25:
                return (cob1) obj;
            case 26:
                return Boolean.valueOf((obj instanceof cob1) || (obj instanceof rih1));
            case 27:
                if (obj instanceof rih1) {
                    return null;
                }
                return (cob1) obj;
            case 28:
                return (String) obj;
            default:
                return new qvc0((String) obj, (c3d0) null, (Set) null, (mqz0) null, 14);
        }
    }
}
