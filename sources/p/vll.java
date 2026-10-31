package p;

import android.os.Bundle;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class vll extends hab0 implements iu30 {
    public static final vll N0;
    public static final vll O0;
    public static final vll P0;
    public static final vll Q0;
    public static final vll R0;
    public static final vll S0;
    public static final vll T0;
    public static final vll U0;
    public static final vll V0;
    public static final vll W0;
    public static final vll X;
    public static final vll X0;
    public static final vll Y;
    public static final vll Y0;
    public static final vll Z;
    public static final vll Z0;
    public static final vll a1;
    public static final vll b;
    public static final vll b1;
    public static final vll c;
    public static final vll c1;
    public static final vll d;
    public static final vll d1;
    public static final vll e;
    public static final vll e1;
    public static final vll f;
    public static final vll g;
    public static final vll h;
    public static final vll i;
    public static final vll t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new vll(i2, (byte) 0);
        c = new vll(i2, (byte) 1);
        d = new vll(i2, (byte) 2);
        e = new vll(i2, (byte) 3);
        f = new vll(i2, (byte) 4);
        g = new vll(i2, (byte) 5);
        h = new vll(i2, (byte) 6);
        i = new vll(i2, (byte) 7);
        t = new vll(i2, (byte) 8);
        X = new vll(i2, (byte) 9);
        Y = new vll(i2, (byte) 10);
        Z = new vll(i2, (byte) 11);
        N0 = new vll(i2, (byte) 12);
        O0 = new vll(i2, (byte) 13);
        P0 = new vll(i2, (byte) 14);
        Q0 = new vll(i2, (byte) 15);
        R0 = new vll(i2, (byte) 16);
        S0 = new vll(i2, (byte) 17);
        T0 = new vll(i2, (byte) 18);
        U0 = new vll(i2, (byte) 19);
        V0 = new vll(i2, (byte) 20);
        W0 = new vll(i2, (byte) 21);
        X0 = new vll(i2, (byte) 22);
        Y0 = new vll(i2, (byte) 23);
        Z0 = new vll(i2, (byte) 24);
        a1 = new vll(i2, (byte) 25);
        b1 = new vll(i2, (byte) 26);
        c1 = new vll(i2, (byte) 27);
        d1 = new vll(i2, (byte) 28);
        e1 = new vll(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vll(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        orl orlVar;
        boolean z = true;
        switch (this.a) {
            case 0:
                return (String) obj;
            case 1:
                return (iix0) obj;
            case 2:
                return Boolean.valueOf(obj instanceof iix0);
            case 3:
                if (obj != null) {
                    return (iix0) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.progressstate.state.ProgressState");
                return null;
            case 4:
                ux50 ux50Var = (ux50) obj;
                if (!(ux50Var instanceof rx50) && !(ux50Var instanceof sx50)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 5:
                return (String) obj;
            case 6:
                return (String) obj;
            case 7:
                if (!(obj instanceof jo70) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 8:
                if (obj instanceof rih1) {
                    return null;
                }
                return (jo70) obj;
            case 9:
                return Boolean.valueOf(obj instanceof hzy);
            case 10:
                if (obj != null) {
                    return (hzy) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.entitytypetrait.EntityTypeTrait");
                return null;
            case 11:
                return ((Boolean) obj).booleanValue() ? weu.c : weu.a;
            case 12:
                return ((Boolean) obj).booleanValue() ? weu.c : weu.a;
            case 13:
                return ((Boolean) obj).booleanValue() ? bq00.b : bq00.c;
            case 14:
                return ((Boolean) obj).booleanValue() ? bq00.b : bq00.c;
            case 15:
                return ((ho70) obj).a;
            case 16:
                lrl lrlVar = ((prl) obj).b;
                lrl lrlVar2 = lrlVar instanceof lrl ? lrlVar : null;
                if (lrlVar2 == null || (orlVar = lrlVar2.a) == null) {
                    return null;
                }
                return orlVar.a;
            case 17:
                synchronized (pv91.c) {
                    oen0 oen0Var = ((ten0) pv91.j).h;
                    z = oen0Var != null && oen0Var.h();
                }
                if (z) {
                    pv91.c();
                }
                return rih1.a;
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                return new psl(((cxc0) obj).f.w.b);
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                return ((usl) obj).b();
            case 20:
                return swl.a;
            case 21:
                return new ga01(10, ((owl) obj).a, (String) null, false);
            case 22:
                return (k8g1) obj;
            case 23:
                return Boolean.valueOf(obj instanceof k8g1);
            case 24:
                if (obj != null) {
                    return (k8g1) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.transcript.model.Transcript");
                return null;
            case 25:
                return swl.a;
            case 26:
                cas casVar = (a7m0) obj;
                casVar.a = yzj.d1;
                casVar.d = aok.U0;
                casVar.e = aok.V0;
                return rih1.a;
            case 27:
                ((Boolean) obj).getClass();
                return rih1.a;
            case 28:
                s2m s2mVar = (s2m) obj;
                Bundle bundle = new Bundle();
                bundle.putString("query", s2mVar.b);
                bundle.putParcelableArrayList("results", new ArrayList<>((Collection) s2mVar.c));
                bundle.putParcelableArrayList("recommendations", new ArrayList<>((Collection) s2mVar.d));
                bundle.putParcelableArrayList("recent_searches", new ArrayList<>((Collection) s2mVar.e));
                c380 c380Var = s2mVar.f;
                ArrayList arrayList = new ArrayList(q7h.U(c380Var, 10));
                Iterator it = c380Var.iterator();
                while (it.hasNext()) {
                    arrayList.add(((k620) it.next()).name());
                }
                bundle.putStringArrayList("available_filters", new ArrayList<>(arrayList));
                bundle.putString("selected_filter", s2mVar.g.name());
                bundle.putBoolean("is_searching", s2mVar.h);
                bundle.putBoolean("is_loading_recommendations", s2mVar.i);
                f2m f2mVar = s2mVar.j;
                if (f2mVar != null) {
                    bundle.putParcelable("error", f2mVar);
                }
                return bundle;
            default:
                return ((j1q0) obj).c();
        }
    }
}
