package p;

import android.os.Bundle;
import android.os.Parcelable;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class crm extends hab0 implements iu30 {
    public static final crm N0;
    public static final crm O0;
    public static final crm P0;
    public static final crm Q0;
    public static final crm R0;
    public static final crm S0;
    public static final crm T0;
    public static final crm U0;
    public static final crm V0;
    public static final crm W0;
    public static final crm X;
    public static final crm X0;
    public static final crm Y;
    public static final crm Y0;
    public static final crm Z;
    public static final crm Z0;
    public static final crm a1;
    public static final crm b;
    public static final crm b1;
    public static final crm c;
    public static final crm c1;
    public static final crm d;
    public static final crm d1;
    public static final crm e;
    public static final crm e1;
    public static final crm f;
    public static final crm g;
    public static final crm h;
    public static final crm i;
    public static final crm t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new crm(i2, (byte) 0);
        c = new crm(i2, (byte) 1);
        d = new crm(i2, (byte) 2);
        e = new crm(i2, (byte) 3);
        f = new crm(i2, (byte) 4);
        g = new crm(i2, (byte) 5);
        h = new crm(i2, (byte) 6);
        i = new crm(i2, (byte) 7);
        t = new crm(i2, (byte) 8);
        X = new crm(i2, (byte) 9);
        Y = new crm(i2, (byte) 10);
        Z = new crm(i2, (byte) 11);
        N0 = new crm(i2, (byte) 12);
        O0 = new crm(i2, (byte) 13);
        P0 = new crm(i2, (byte) 14);
        Q0 = new crm(i2, (byte) 15);
        R0 = new crm(i2, (byte) 16);
        S0 = new crm(i2, (byte) 17);
        T0 = new crm(i2, (byte) 18);
        U0 = new crm(i2, (byte) 19);
        V0 = new crm(i2, (byte) 20);
        W0 = new crm(i2, (byte) 21);
        X0 = new crm(i2, (byte) 22);
        Y0 = new crm(i2, (byte) 23);
        Z0 = new crm(i2, (byte) 24);
        a1 = new crm(i2, (byte) 25);
        b1 = new crm(i2, (byte) 26);
        c1 = new crm(i2, (byte) 27);
        d1 = new crm(i2, (byte) 28);
        e1 = new crm(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ crm(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                brm brmVar = (brm) obj;
                ArrayList arrayList = brmVar.a;
                return new boh0(arrayList, arrayList.size() == 1 ? new znh0((vy30) o7h.q0(arrayList)) : new xnh0(arrayList), brmVar.b, brmVar.c, brmVar.d, brmVar.e);
            case 1:
                return mno1.h(new mmr0[]{new mmr0("parcelable", (Parcelable) obj)});
            case 2:
                return (Parcelable) jhc1.t((Bundle) obj, "parcelable", boh0.class);
            case 3:
                aoh0 aoh0Var = (aoh0) obj;
                if (aoh0Var instanceof ynh0) {
                    return "preview";
                }
                if (aoh0Var instanceof znh0) {
                    return "single";
                }
                if (aoh0Var instanceof xnh0) {
                    return "grid";
                }
                eg.o();
                return null;
            case 4:
                return asm.a;
            case 5:
                return ((yrm) obj).a;
            case 6:
                return ((yrm) obj).a;
            case 7:
                return Boolean.valueOf(obj instanceof jo70);
            case 8:
                if (obj != null) {
                    return (jo70) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.identitytrait.IdentityTrait");
                return null;
            case 9:
                return Boolean.valueOf(obj instanceof xkk1);
            case 10:
                if (obj != null) {
                    return (xkk1) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.visualidentitytrait.VisualIdentityTrait");
                return null;
            case 11:
                return Boolean.valueOf((obj instanceof Boolean) || (obj instanceof rih1));
            case 12:
                if (obj instanceof rih1) {
                    return null;
                }
                return (Boolean) obj;
            case 13:
                return msm.a;
            case 14:
                return Boolean.valueOf((obj instanceof Boolean) || (obj instanceof rih1));
            case 15:
                if (obj instanceof rih1) {
                    return null;
                }
                return (Boolean) obj;
            case 16:
                return new nsm(true);
            case 17:
                return Boolean.valueOf(obj instanceof List);
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                if (obj != null) {
                    return (List) obj;
                }
                bhn0.i("null cannot be cast to non-null type kotlin.collections.List<com.spotify.contribution.model.Contribution>");
                return null;
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                return (List) obj;
            case 20:
                return (String) obj;
            case 21:
                return (String) obj;
            case 22:
                return Boolean.valueOf((obj instanceof jo70) || (obj instanceof rih1));
            case 23:
                if (obj instanceof rih1) {
                    return null;
                }
                return (jo70) obj;
            case 24:
                return Boolean.valueOf((obj instanceof xkk1) || (obj instanceof rih1));
            case 25:
                if (obj instanceof rih1) {
                    return null;
                }
                return (xkk1) obj;
            case 26:
                return (mld) obj;
            case 27:
                return (nqm) obj;
            case 28:
                b261.a((e261) obj);
                return rih1.a;
            default:
                return Boolean.valueOf(obj instanceof nqm);
        }
    }
}
