package p;

import android.content.Context;
import android.content.ContextWrapper;
import android.os.Parcelable;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ft extends hab0 implements iu30 {
    public static final ft N0;
    public static final ft O0;
    public static final ft P0;
    public static final ft Q0;
    public static final ft R0;
    public static final ft S0;
    public static final ft T0;
    public static final ft U0;
    public static final ft V0;
    public static final ft W0;
    public static final ft X;
    public static final ft X0;
    public static final ft Y;
    public static final ft Y0;
    public static final ft Z;
    public static final ft Z0;
    public static final ft a1;
    public static final ft b;
    public static final ft b1;
    public static final ft c;
    public static final ft c1;
    public static final ft d;
    public static final ft d1;
    public static final ft e;
    public static final ft e1;
    public static final ft f;
    public static final ft g;
    public static final ft h;
    public static final ft i;
    public static final ft t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new ft(i2, (byte) 0);
        c = new ft(i2, (byte) 1);
        d = new ft(i2, (byte) 2);
        e = new ft(i2, (byte) 3);
        f = new ft(i2, (byte) 4);
        g = new ft(i2, (byte) 5);
        h = new ft(i2, (byte) 6);
        i = new ft(i2, (byte) 7);
        t = new ft(i2, (byte) 8);
        X = new ft(i2, (byte) 9);
        Y = new ft(i2, (byte) 10);
        Z = new ft(i2, (byte) 11);
        N0 = new ft(i2, (byte) 12);
        O0 = new ft(i2, (byte) 13);
        P0 = new ft(i2, (byte) 14);
        Q0 = new ft(i2, (byte) 15);
        R0 = new ft(i2, (byte) 16);
        S0 = new ft(i2, (byte) 17);
        T0 = new ft(i2, (byte) 18);
        U0 = new ft(i2, (byte) 19);
        V0 = new ft(i2, (byte) 20);
        W0 = new ft(i2, (byte) 21);
        X0 = new ft(i2, (byte) 22);
        Y0 = new ft(i2, (byte) 23);
        Z0 = new ft(i2, (byte) 24);
        a1 = new ft(i2, (byte) 25);
        b1 = new ft(i2, (byte) 26);
        c1 = new ft(i2, (byte) 27);
        d1 = new ft(i2, (byte) 28);
        e1 = new ft(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ft(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        byte b2 = this.a;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return mno1.h(new mmr0[]{new mmr0("parcelable", (Parcelable) obj)});
            case 1:
                ((qtr) obj).d(b, e3.t);
                return rih1Var;
            case 2:
                return Integer.valueOf(((Number) obj).intValue());
            case 3:
                return Float.valueOf(((Number) obj).floatValue() / 1.0f);
            case 4:
                dhl dhlVar = (dhl) obj;
                ube ubeVar = dhlVar.e;
                ihl ihlVar = dhlVar.c;
                yf.p(ubeVar, ihlVar.e, 0.0f, 6);
                dhl.a(dhlVar, ihlVar);
                return rih1Var;
            case 5:
                return ((g30) obj).c;
            case 6:
                kex kexVar = (kex) obj;
                kexVar.a("filter", b3i.a);
                kexVar.a("sort", b3i.b);
                return rih1Var;
            case 7:
                return rih1Var;
            case 8:
                return new huz((Object) null, (byte) 10);
            case 9:
                return new y70((wl71) obj);
            case 10:
                mmr0 mmr0Var = (mmr0) obj;
                c380 c380Var = (c380) mmr0Var.a;
                l90 l90Var = (l90) mmr0Var.b;
                ArrayList arrayList = new ArrayList(q7h.U(c380Var, 10));
                Iterator it = c380Var.iterator();
                while (it.hasNext()) {
                    arrayList.add(((c90) it.next()).getKey());
                }
                return new mmr0(o7h.p1(arrayList), l90Var);
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                return Integer.valueOf(((Number) obj).intValue());
            case grn1.d /* 12 */:
                return Integer.valueOf(-((Number) obj).intValue());
            case 13:
                return Integer.valueOf(((Number) obj).intValue() / 3);
            case 14:
                return Integer.valueOf((-((Number) obj).intValue()) / 3);
            case 15:
                return new mem(((cp11) obj).a);
            case 16:
                return c7e0.a;
            case 17:
                return new k430(((cp11) obj).a, true, true);
            case 18:
                return new wji0(((cp11) obj).a);
            case 19:
                return new wlo0(((cp11) obj).a);
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                return new t671(54, ((cp11) obj).a, (String) null, (String) null, "ShowPageHeader", (List) null, false);
            case 21:
                return ((l0l) obj).d();
            case 22:
                zc0 zc0Var = (zc0) obj;
                return new ad0(zc0Var.a, z6x.a, zc0Var);
            case 23:
                ((n161) obj).b(lgo1.b, "TEST_TAG_NORMAL_ACTIVE_SESSION_WITHOUT_GRID");
                return rih1Var;
            case 24:
                return kf0.a;
            case 25:
                Context context = (Context) obj;
                if (context instanceof ContextWrapper) {
                    return ((ContextWrapper) context).getBaseContext();
                }
                return null;
            case 26:
                return new uv11(((sa8) obj).a, "", (Integer) null, (String) null, (cqs0) null, (tv11) null, 0, 252);
            case 27:
                uv11 uv11Var = (uv11) obj;
                return new uho(uv11Var.a, uv11Var.b, (tho) null, (nho) null, (String) null, (Function0) null, 252);
            case 28:
                uv11 uv11Var2 = (uv11) obj;
                return new gvu(12, uv11Var2.a, uv11Var2.b, false, (String) null);
            default:
                return new t671(54, ((uv11) obj).a, (String) null, (String) null, "author-page-audiobook-row", (List) null, false);
        }
    }
}
