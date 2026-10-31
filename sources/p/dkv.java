package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class dkv extends hab0 implements iu30 {
    public static final dkv N0;
    public static final dkv O0;
    public static final dkv P0;
    public static final dkv Q0;
    public static final dkv R0;
    public static final dkv S0;
    public static final dkv T0;
    public static final dkv U0;
    public static final dkv V0;
    public static final dkv W0;
    public static final dkv X;
    public static final dkv X0;
    public static final dkv Y;
    public static final dkv Y0;
    public static final dkv Z;
    public static final dkv Z0;
    public static final dkv a1;
    public static final dkv b;
    public static final dkv b1;
    public static final dkv c;
    public static final dkv c1;
    public static final dkv d;
    public static final dkv d1;
    public static final dkv e;
    public static final dkv e1;
    public static final dkv f;
    public static final dkv g;
    public static final dkv h;
    public static final dkv i;
    public static final dkv t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new dkv(i2, (byte) 0);
        c = new dkv(i2, (byte) 1);
        d = new dkv(i2, (byte) 2);
        e = new dkv(i2, (byte) 3);
        f = new dkv(i2, (byte) 4);
        g = new dkv(i2, (byte) 5);
        h = new dkv(i2, (byte) 6);
        i = new dkv(i2, (byte) 7);
        t = new dkv(i2, (byte) 8);
        X = new dkv(i2, (byte) 9);
        Y = new dkv(i2, (byte) 10);
        Z = new dkv(i2, (byte) 11);
        N0 = new dkv(i2, (byte) 12);
        O0 = new dkv(i2, (byte) 13);
        P0 = new dkv(i2, (byte) 14);
        Q0 = new dkv(i2, (byte) 15);
        R0 = new dkv(i2, (byte) 16);
        S0 = new dkv(i2, (byte) 17);
        T0 = new dkv(i2, (byte) 18);
        U0 = new dkv(i2, (byte) 19);
        V0 = new dkv(i2, (byte) 20);
        W0 = new dkv(i2, (byte) 21);
        X0 = new dkv(i2, (byte) 22);
        Y0 = new dkv(i2, (byte) 23);
        Z0 = new dkv(i2, (byte) 24);
        a1 = new dkv(i2, (byte) 25);
        b1 = new dkv(i2, (byte) 26);
        c1 = new dkv(i2, (byte) 27);
        d1 = new dkv(i2, (byte) 28);
        e1 = new dkv(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dkv(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        boolean z = true;
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return (Map) obj;
            case 1:
                ArrayList arrayList = new ArrayList();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    iey0 iey0Var = (iey0) entry.getKey();
                    String str = ((wnb1) entry.getValue()).a.b;
                    if (str.length() <= 0) {
                        str = null;
                    }
                    mmr0 mmr0Var = str != null ? new mmr0(iey0Var.a, str) : null;
                    if (mmr0Var != null) {
                        arrayList.add(mmr0Var);
                    }
                }
                return sqg0.T(arrayList);
            case 2:
                if (obj instanceof rih1) {
                    return null;
                }
                return (hzy) obj;
            case 3:
                if (!(obj instanceof iix0) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 4:
                if (obj instanceof rih1) {
                    return null;
                }
                return (iix0) obj;
            case 5:
                if (!(obj instanceof h2v) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 6:
                if (obj instanceof rih1) {
                    return null;
                }
                return (h2v) obj;
            case 7:
                if (!(obj instanceof zoy0) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 8:
                if (obj instanceof rih1) {
                    return null;
                }
                return (zoy0) obj;
            case 9:
                if (!(obj instanceof w281) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 10:
                if (obj instanceof rih1) {
                    return null;
                }
                return (w281) obj;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                if (!(obj instanceof mdz) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case grn1.d /* 12 */:
                if (!(obj instanceof hll) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 13:
                if (obj instanceof rih1) {
                    return null;
                }
                return (mdz) obj;
            case 14:
                if (!(obj instanceof hll) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 15:
                if (obj instanceof rih1) {
                    return null;
                }
                return (hll) obj;
            case 16:
                if (!(obj instanceof iix0) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 17:
                if (obj instanceof rih1) {
                    return null;
                }
                return (iix0) obj;
            case 18:
                if (!(obj instanceof h2v) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 19:
                if (obj instanceof rih1) {
                    return null;
                }
                return (h2v) obj;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                if (obj instanceof rih1) {
                    return null;
                }
                return (hll) obj;
            case 21:
                if (!(obj instanceof hzy) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 22:
                if (obj instanceof rih1) {
                    return null;
                }
                return (hzy) obj;
            case 23:
                if (!(obj instanceof w281) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 24:
                if (obj instanceof rih1) {
                    return null;
                }
                return (w281) obj;
            case 25:
                if (!(obj instanceof hll) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 26:
                if (obj instanceof rih1) {
                    return null;
                }
                return (hll) obj;
            case 27:
                if (!(obj instanceof hzy) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 28:
                if (obj != null) {
                    return (xkk1) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.visualidentitytrait.VisualIdentityTrait");
                return null;
            default:
                return Boolean.valueOf(obj instanceof hzy);
        }
    }
}
