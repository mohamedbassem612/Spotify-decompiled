package p;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class r850 extends hab0 implements iu30 {
    public static final r850 N0;
    public static final r850 O0;
    public static final r850 P0;
    public static final r850 Q0;
    public static final r850 R0;
    public static final r850 S0;
    public static final r850 T0;
    public static final r850 U0;
    public static final r850 V0;
    public static final r850 W0;
    public static final r850 X;
    public static final r850 X0;
    public static final r850 Y;
    public static final r850 Y0;
    public static final r850 Z;
    public static final r850 Z0;
    public static final r850 a1;
    public static final r850 b;
    public static final r850 b1;
    public static final r850 c;
    public static final r850 c1;
    public static final r850 d;
    public static final r850 d1;
    public static final r850 e;
    public static final r850 e1;
    public static final r850 f;
    public static final r850 g;
    public static final r850 h;
    public static final r850 i;
    public static final r850 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new r850(i2, (byte) 0);
        c = new r850(i2, (byte) 1);
        d = new r850(i2, (byte) 2);
        e = new r850(i2, (byte) 3);
        f = new r850(i2, (byte) 4);
        g = new r850(i2, (byte) 5);
        h = new r850(i2, (byte) 6);
        i = new r850(i2, (byte) 7);
        t = new r850(i2, (byte) 8);
        X = new r850(i2, (byte) 9);
        Y = new r850(i2, (byte) 10);
        Z = new r850(i2, (byte) 11);
        N0 = new r850(i2, (byte) 12);
        O0 = new r850(i2, (byte) 13);
        P0 = new r850(i2, (byte) 14);
        Q0 = new r850(i2, (byte) 15);
        R0 = new r850(i2, (byte) 16);
        S0 = new r850(i2, (byte) 17);
        T0 = new r850(i2, (byte) 18);
        U0 = new r850(i2, (byte) 19);
        V0 = new r850(i2, (byte) 20);
        W0 = new r850(i2, (byte) 21);
        X0 = new r850(i2, (byte) 22);
        Y0 = new r850(i2, (byte) 23);
        Z0 = new r850(i2, (byte) 24);
        a1 = new r850(i2, (byte) 25);
        b1 = new r850(i2, (byte) 26);
        c1 = new r850(i2, (byte) 27);
        d1 = new r850(i2, (byte) 28);
        e1 = new r850(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r850(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        byte b2 = this.a;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                return mno1.h(new mmr0[]{new mmr0("graduation_education_model", (p850) obj)});
            case 1:
                return new c950(3);
            case 2:
                b261.c((e261) obj);
                return rih1Var;
            case 3:
                return mno1.h(new mmr0[]{new mmr0("graduation_rejected_model", (s950) obj)});
            case 4:
                b261.c((e261) obj);
                return rih1Var;
            case 5:
                return rih1Var;
            case 6:
                Bundle bundle = (Bundle) obj;
                if (bundle == null) {
                    return new eb50();
                }
                Parcelable parcelable = bundle.getParcelable("graduation_supervision_model");
                if (parcelable != null) {
                    return (eb50) parcelable;
                }
                hhg1.n("Required value was null.");
                return null;
            case 7:
                return mno1.h(new mmr0[]{new mmr0("graduation_supervision_model", (eb50) obj)});
            case 8:
                return mno1.h(new mmr0[]{new mmr0("graduation_terms_model", (qb50) obj)});
            case 9:
                return mno1.h(new mmr0[]{new mmr0("graduation_view_request_model", (jc50) obj)});
            case 10:
                return cfm0.i("spotify:graduation:view-request:", ((gc50) obj).a, nik1.j4).a;
            case 11:
                return zc50.a;
            case 12:
                ((qtr) obj).b(new gp9(5, (lnm) null, (byte) 5));
                return rih1Var;
            case 13:
                ((Number) obj).longValue();
                return rih1Var;
            case 14:
                DrawScope.d0((DrawScope) obj, u7h.j, 0L, 0L, 0.0f, (phc1) null, (ColorFilter) null, 126);
                return rih1Var;
            case 15:
                return new shl0((thl0) obj, (byte) 2);
            case 16:
                return (thl0) obj;
            case 17:
                return new shl0((thl0) obj, (byte) 3);
            case 18:
                return new shl0((thl0) obj, (byte) 1);
            case 19:
                return new shl0((thl0) obj, (byte) 0);
            case 20:
                return rih1Var;
            case 21:
                b261.c((e261) obj);
                return rih1Var;
            case 22:
                return zj50.a;
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                ((qtr) obj).b(new kr(5, (lnm) null, (byte) 17));
                return rih1Var;
            case 24:
                ArrayList arrayList = ((wj50) obj).a;
                ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(z6b1.a(((vj50) it.next()).a));
                }
                return arrayList2;
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                return mno1.h(new mmr0[]{new mmr0("parcelable", (Parcelable) obj)});
            case 26:
                return (Parcelable) jhc1.t((Bundle) obj, "parcelable", nl50.class);
            case 27:
                ArrayList arrayList3 = ((il50) obj).c;
                ArrayList arrayList4 = new ArrayList(q7h.U(arrayList3, 10));
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    arrayList4.add(((el50) it2.next()).a);
                }
                return arrayList4;
            case 28:
                return Integer.valueOf(((q5t0) obj).X());
            default:
                return ((jl50) obj).b;
        }
    }
}
