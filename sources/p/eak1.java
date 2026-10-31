package p;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import java.lang.ref.WeakReference;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class eak1 extends hab0 implements iu30 {
    public static final eak1 N0;
    public static final eak1 O0;
    public static final eak1 P0;
    public static final eak1 Q0;
    public static final eak1 R0;
    public static final eak1 S0;
    public static final eak1 T0;
    public static final eak1 U0;
    public static final eak1 V0;
    public static final eak1 W0;
    public static final eak1 X;
    public static final eak1 X0;
    public static final eak1 Y;
    public static final eak1 Y0;
    public static final eak1 Z;
    public static final eak1 Z0;
    public static final eak1 a1;
    public static final eak1 b;
    public static final eak1 b1;
    public static final eak1 c;
    public static final eak1 c1;
    public static final eak1 d;
    public static final eak1 d1;
    public static final eak1 e;
    public static final eak1 e1;
    public static final eak1 f;
    public static final eak1 g;
    public static final eak1 h;
    public static final eak1 i;
    public static final eak1 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new eak1(i2, (byte) 0);
        c = new eak1(i2, (byte) 1);
        d = new eak1(i2, (byte) 2);
        e = new eak1(i2, (byte) 3);
        f = new eak1(i2, (byte) 4);
        g = new eak1(i2, (byte) 5);
        h = new eak1(i2, (byte) 6);
        i = new eak1(i2, (byte) 7);
        t = new eak1(i2, (byte) 8);
        X = new eak1(i2, (byte) 9);
        Y = new eak1(i2, (byte) 10);
        Z = new eak1(i2, (byte) 11);
        N0 = new eak1(i2, (byte) 12);
        O0 = new eak1(i2, (byte) 13);
        P0 = new eak1(i2, (byte) 14);
        Q0 = new eak1(i2, (byte) 15);
        R0 = new eak1(i2, (byte) 16);
        S0 = new eak1(i2, (byte) 17);
        T0 = new eak1(i2, (byte) 18);
        U0 = new eak1(i2, (byte) 19);
        V0 = new eak1(i2, (byte) 20);
        W0 = new eak1(i2, (byte) 21);
        X0 = new eak1(i2, (byte) 22);
        Y0 = new eak1(i2, (byte) 23);
        Z0 = new eak1(i2, (byte) 24);
        a1 = new eak1(i2, (byte) 25);
        b1 = new eak1(i2, (byte) 26);
        c1 = new eak1(i2, (byte) 27);
        d1 = new eak1(i2, (byte) 28);
        e1 = new eak1(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ eak1(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        byte b2 = this.a;
        int i2 = 5;
        rih1 rih1Var = rih1.a;
        lnm lnmVar = null;
        switch (b2) {
            case 0:
                return new dak1(((cak1) obj).a);
            case 1:
                ((qtr) obj).b(new eri0(i2, lnmVar, (byte) 24));
                return rih1Var;
            case 2:
                return new kak1(((jak1) obj).a);
            case 3:
                ((qtr) obj).b(new eri0(i2, lnmVar, (byte) 25));
                return rih1Var;
            case 4:
                Object parent = ((View) obj).getParent();
                if (parent instanceof View) {
                    return (View) parent;
                }
                return null;
            case 5:
                Object tag = ((View) obj).getTag(2131431623);
                if (tag instanceof tl7) {
                    return (tl7) tag;
                }
                return null;
            case 6:
                kqb1 kqb1Var = (kqb1) obj;
                return l1d.n(o7h.y0(kqb1Var.c, ",", (String) null, (String) null, (iu30) null, 62), "]", gvg.n("0x", Integer.toHexString(kqb1Var.a), "@", kqb1Var.b, "["));
            case 7:
                ViewParent parent2 = ((ViewGroup) obj).getParent();
                if (parent2 instanceof ViewGroup) {
                    return (ViewGroup) parent2;
                }
                return null;
            case 8:
                return "view-listening-activity";
            case 9:
                return ((nwl0) obj).e();
            case 10:
                gek1 gek1Var = (gek1) obj;
                return new hek1(gek1Var.a, gek1Var.b, gek1Var.c, gek1Var.d, gek1Var.e, gek1Var.f, gek1Var.g, gek1Var.h);
            case 11:
                Object parent3 = ((View) obj).getParent();
                if (parent3 instanceof View) {
                    return (View) parent3;
                }
                return null;
            case 12:
                Object tag2 = ((View) obj).getTag(2131431633);
                if (tag2 instanceof WeakReference) {
                    return (WeakReference) tag2;
                }
                return null;
            case 13:
                Context context = (Context) obj;
                ContextWrapper contextWrapper = context instanceof ContextWrapper ? (ContextWrapper) context : null;
                if (contextWrapper != null) {
                    return contextWrapper.getBaseContext();
                }
                return null;
            case 14:
                ((Boolean) obj).getClass();
                return rih1Var;
            case 15:
                return "spotify:internal:bluejay:update-voice";
            case 16:
                return new ypk1(((xpk1) obj).a);
            case 17:
                ((qtr) obj).b(new eri0(i2, lnmVar, (byte) 26));
                return rih1Var;
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                b261.d((e261) obj);
                return rih1Var;
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                return rih1Var;
            case 20:
                return ryk1.a;
            case 21:
                return mno1.h(new mmr0[]{new mmr0("voting-model-v2-key", (fwk1) obj)});
            case 22:
                return rih1Var;
            case 23:
                return rih1Var;
            case 24:
                return ((pvc0) o7h.q0((List) obj)).f;
            case 25:
                return Boolean.valueOf(obj instanceof List);
            case 26:
                if (obj != null) {
                    return (List) obj;
                }
                bhn0.i("null cannot be cast to non-null type kotlin.collections.List<com.spotify.listplatform.endpoints.kodiak.ListItemsTable.Item>");
                return null;
            case 27:
                return p5l1.a;
            case 28:
                return ((o5l1) obj).a;
            default:
                return ((o5l1) obj).a;
        }
    }
}
