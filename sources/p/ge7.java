package p;

import android.net.Uri;
import com.google.protobuf.Any;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.watchfeed.component.item.v1.AssociatedFeedsOnboardingComponent;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ge7 extends hab0 implements iu30 {
    public static final ge7 N0;
    public static final ge7 O0;
    public static final ge7 P0;
    public static final ge7 Q0;
    public static final ge7 R0;
    public static final ge7 S0;
    public static final ge7 T0;
    public static final ge7 U0;
    public static final ge7 V0;
    public static final ge7 W0;
    public static final ge7 X;
    public static final ge7 X0;
    public static final ge7 Y;
    public static final ge7 Y0;
    public static final ge7 Z;
    public static final ge7 Z0;
    public static final ge7 a1;
    public static final ge7 b;
    public static final ge7 b1;
    public static final ge7 c;
    public static final ge7 c1;
    public static final ge7 d;
    public static final ge7 d1;
    public static final ge7 e;
    public static final ge7 e1;
    public static final ge7 f;
    public static final ge7 g;
    public static final ge7 h;
    public static final ge7 i;
    public static final ge7 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new ge7(i2, (byte) 0);
        c = new ge7(i2, (byte) 1);
        d = new ge7(i2, (byte) 2);
        e = new ge7(i2, (byte) 3);
        f = new ge7(i2, (byte) 4);
        g = new ge7(i2, (byte) 5);
        h = new ge7(i2, (byte) 6);
        i = new ge7(i2, (byte) 7);
        t = new ge7(i2, (byte) 8);
        X = new ge7(i2, (byte) 9);
        Y = new ge7(i2, (byte) 10);
        Z = new ge7(i2, (byte) 11);
        N0 = new ge7(i2, (byte) 12);
        O0 = new ge7(i2, (byte) 13);
        P0 = new ge7(i2, (byte) 14);
        Q0 = new ge7(i2, (byte) 15);
        R0 = new ge7(i2, (byte) 16);
        S0 = new ge7(i2, (byte) 17);
        T0 = new ge7(i2, (byte) 18);
        U0 = new ge7(i2, (byte) 19);
        V0 = new ge7(i2, (byte) 20);
        W0 = new ge7(i2, (byte) 21);
        X0 = new ge7(i2, (byte) 22);
        Y0 = new ge7(i2, (byte) 23);
        Z0 = new ge7(i2, (byte) 24);
        a1 = new ge7(i2, (byte) 25);
        b1 = new ge7(i2, (byte) 26);
        c1 = new ge7(i2, (byte) 27);
        d1 = new ge7(i2, (byte) 28);
        e1 = new ge7(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ge7(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        byte b2 = this.a;
        b7x b7xVar = b7x.a;
        boolean z = true;
        switch (b2) {
            case 0:
                return Boolean.valueOf(((bw31) obj) instanceof wv31);
            case 1:
                bw31 bw31Var = (bw31) obj;
                return Boolean.valueOf((bw31Var instanceof wu31) && ((wu31) bw31Var).a.g == 2);
            case 2:
                bw31 bw31Var2 = (bw31) obj;
                return Boolean.valueOf((bw31Var2 instanceof wu31) && ((wu31) bw31Var2).a.g == 3);
            case 3:
                bw31 bw31Var3 = (bw31) obj;
                return Boolean.valueOf((bw31Var3 instanceof wu31) && ((wu31) bw31Var3).a.g == 4);
            case 4:
                return l1d.m("spotify:assisted-curation:search?context=", ((re7) obj).a);
            case 5:
                return f4i1.f("spotify:assisted-curation?context=", Uri.encode(((ng7) obj).a), "&mode=selection");
            case 6:
                AssociatedFeedsOnboardingComponent associatedFeedsOnboardingComponentS = AssociatedFeedsOnboardingComponent.s(((Any) obj).q());
                return new ug7((int) associatedFeedsOnboardingComponentS.q(), associatedFeedsOnboardingComponentS.o(), associatedFeedsOnboardingComponentS.r(), associatedFeedsOnboardingComponentS.getTitle(), associatedFeedsOnboardingComponentS.n(), associatedFeedsOnboardingComponentS.p());
            case 7:
                return ((o3m0) obj).k(0, "", 0);
            case 8:
                o3m0 o3m0Var = (o3m0) obj;
                z7h1 z7h1Var = new z7h1("swipe", 1, b7xVar);
                mmr0 mmr0Var = new mmr0("item_to_be_skipped", "");
                String strValueOf = String.valueOf(0);
                if (strValueOf == null) {
                    strValueOf = "";
                }
                mmr0 mmr0Var2 = new mmr0("position_ms", strValueOf);
                String strValueOf2 = String.valueOf(0);
                return new w7h1("", "", z7h1Var, new x7h1("skip_to_previous", 2, sqg0.J(new mmr0[]{mmr0Var, mmr0Var2, new mmr0("total_content_ms", strValueOf2 != null ? strValueOf2 : "")})), o3m0Var.a, r6h1.c, System.currentTimeMillis());
            case 9:
                o3m0 o3m0Var2 = (o3m0) obj;
                z7h1 z7h1Var2 = new z7h1("swipe", 1, b7xVar);
                mmr0 mmr0Var3 = new mmr0("item_to_be_skipped", "");
                String strValueOf3 = String.valueOf(0);
                if (strValueOf3 == null) {
                    strValueOf3 = "";
                }
                mmr0 mmr0Var4 = new mmr0("position_ms", strValueOf3);
                String strValueOf4 = String.valueOf(0);
                return new w7h1("", "", z7h1Var2, new x7h1("skip_to_next", 2, sqg0.J(new mmr0[]{mmr0Var3, mmr0Var4, new mmr0("total_content_ms", strValueOf4 != null ? strValueOf4 : "")})), o3m0Var2.a, r6h1.c, System.currentTimeMillis());
            case 10:
                xua0 xua0Var = (xua0) obj;
                xua0Var.a = (short) 600;
                wua0 wua0VarA = xua0Var.a(Float.valueOf(-16.0f), 72);
                llv llvVar = mlv.d;
                wua0VarA.b = llvVar;
                xua0Var.a(Float.valueOf(16.0f), 156).b = llvVar;
                xua0Var.a(Float.valueOf(-10.24f), 240).b = llvVar;
                xua0Var.a(Float.valueOf(10.24f), 324).b = llvVar;
                xua0Var.a(Float.valueOf(-4.64f), 408).b = llvVar;
                xua0Var.a(Float.valueOf(4.64f), 492).b = llvVar;
                xua0Var.a(Float.valueOf(0.0f), 600).b = llvVar;
                return rih1.a;
            case 11:
                Set set = s4b1.f;
                return Boolean.valueOf(uic.x(((vhc1) obj).getUri()).c == blc0.fh);
            case 12:
                uv11 uv11Var = (uv11) obj;
                tv11 tv11Var = uv11Var.f;
                String str = uv11Var.a;
                String str2 = tv11Var != null ? tv11Var.a : null;
                String str3 = str2 == null ? "" : str2;
                String str4 = tv11Var != null ? tv11Var.b : null;
                return new c1x0(str, new x4i1(40, tv11Var != null ? tv11Var.e : null, str3, str4 == null ? "" : str4, tv11Var != null ? tv11Var.d : null, tv11Var != null ? tv11Var.c : null), 2);
            case 13:
                return new rxc0((String) obj);
            case 14:
                return (qxc0) obj;
            case 15:
                if (!(obj instanceof qxc0) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 16:
                if (obj instanceof rih1) {
                    return null;
                }
                return (qxc0) obj;
            case 17:
                return new dob1(((jey0) obj).a);
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                k8e0 k8e0Var = ((dob1) obj).a;
                if (k8e0Var instanceof k8e0) {
                    k8e0 k8e0Var2 = k8e0Var;
                    String strD = tro1.D(k8e0Var2);
                    String str5 = k8e0Var2.c;
                    return new q671(str5 != null ? str5 : "", strD, k8e0Var2.f);
                }
                if (k8e0Var instanceof jae0) {
                    return null;
                }
                eg.o();
                return null;
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                return tro1.y(((dob1) obj).a);
            case 20:
                k8e0 k8e0Var3 = ((dob1) obj).a;
                if (!(k8e0Var3 instanceof k8e0)) {
                    if (k8e0Var3 instanceof jae0) {
                        return null;
                    }
                    eg.o();
                    return null;
                }
                k8e0 k8e0Var4 = k8e0Var3;
                String str6 = k8e0Var4.c;
                String str7 = str6 != null ? str6 : "";
                zc8 zc8VarA = k8e0Var4.l.a(zc8.class);
                return new sqt0(zc8VarA != null ? Long.valueOf(zc8VarA.e / 1000) : null, str7);
            case 21:
                return ((vp7) obj).a;
            case 22:
                return (jo70) obj;
            case 23:
                return ((vp7) obj).a;
            case 24:
                return ((vp7) obj).a;
            case 25:
                if (!(obj instanceof xkk1) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 26:
                if (obj instanceof rih1) {
                    return null;
                }
                return (xkk1) obj;
            case 27:
                return Boolean.valueOf(obj instanceof jo70);
            case 28:
                if (obj != null) {
                    return (jo70) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.identitytrait.IdentityTrait");
                return null;
            default:
                return Boolean.valueOf(obj instanceof jo70);
        }
    }
}
