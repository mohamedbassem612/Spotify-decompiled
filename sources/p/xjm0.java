package p;

import android.os.Bundle;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class xjm0 extends hab0 implements iu30 {
    public static final xjm0 N0;
    public static final xjm0 O0;
    public static final xjm0 P0;
    public static final xjm0 Q0;
    public static final xjm0 R0;
    public static final xjm0 S0;
    public static final xjm0 T0;
    public static final xjm0 U0;
    public static final xjm0 V0;
    public static final xjm0 W0;
    public static final xjm0 X;
    public static final xjm0 X0;
    public static final xjm0 Y;
    public static final xjm0 Y0;
    public static final xjm0 Z;
    public static final xjm0 Z0;
    public static final xjm0 a1;
    public static final xjm0 b;
    public static final xjm0 b1;
    public static final xjm0 c;
    public static final xjm0 c1;
    public static final xjm0 d;
    public static final xjm0 d1;
    public static final xjm0 e;
    public static final xjm0 e1;
    public static final xjm0 f;
    public static final xjm0 g;
    public static final xjm0 h;
    public static final xjm0 i;
    public static final xjm0 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new xjm0(i2, (byte) 0);
        c = new xjm0(i2, (byte) 1);
        d = new xjm0(i2, (byte) 2);
        e = new xjm0(i2, (byte) 3);
        f = new xjm0(i2, (byte) 4);
        g = new xjm0(i2, (byte) 5);
        h = new xjm0(i2, (byte) 6);
        i = new xjm0(i2, (byte) 7);
        t = new xjm0(i2, (byte) 8);
        X = new xjm0(i2, (byte) 9);
        Y = new xjm0(i2, (byte) 10);
        Z = new xjm0(i2, (byte) 11);
        N0 = new xjm0(i2, (byte) 12);
        O0 = new xjm0(i2, (byte) 13);
        P0 = new xjm0(i2, (byte) 14);
        Q0 = new xjm0(i2, (byte) 15);
        R0 = new xjm0(i2, (byte) 16);
        S0 = new xjm0(i2, (byte) 17);
        T0 = new xjm0(i2, (byte) 18);
        U0 = new xjm0(i2, (byte) 19);
        V0 = new xjm0(i2, (byte) 20);
        W0 = new xjm0(i2, (byte) 21);
        X0 = new xjm0(i2, (byte) 22);
        Y0 = new xjm0(i2, (byte) 23);
        Z0 = new xjm0(i2, (byte) 24);
        a1 = new xjm0(i2, (byte) 25);
        b1 = new xjm0(i2, (byte) 26);
        c1 = new xjm0(i2, (byte) 27);
        d1 = new xjm0(i2, (byte) 28);
        e1 = new xjm0(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xjm0(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        byte b2 = this.a;
        t2b t2bVar = lgo1.b;
        boolean z = true;
        rih1 rih1Var = rih1.a;
        int i2 = 0;
        switch (b2) {
            case 0:
                if (!(obj instanceof a7q0) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 1:
                if (obj instanceof rih1) {
                    return null;
                }
                return (a7q0) obj;
            case 2:
                return new qkm0(ert0.a, (pkm0) obj);
            case 3:
                Bundle bundle = new Bundle();
                bundle.putParcelable("more-like-this-element", (ehm0) obj);
                return bundle;
            case 4:
                ehm0 ehm0Var = (ehm0) ((Bundle) obj).getParcelable("more-like-this-element");
                return ehm0Var == null ? new ehm0() : ehm0Var;
            case 5:
                String strH0 = ihc1.H0((String) obj, "spotify:show:");
                Set set = s4b1.f;
                String strZ = uic.v("more-like-this", "show:".concat(strH0)).z();
                strZ.getClass();
                return new qvc0(strZ, (c3d0) null, (Set) null, (mqz0) null, 14);
            case 6:
                i1r i1rVar = (k1r) obj;
                if (i1rVar instanceof h1r) {
                    return dlm0.a;
                }
                if (!(i1rVar instanceof i1r)) {
                    if (i1rVar.equals(j1r.a)) {
                        return flm0.a;
                    }
                    eg.o();
                    return null;
                }
                Iterable iterable = (Iterable) i1rVar.a;
                ArrayList arrayList = new ArrayList(q7h.U(iterable, 10));
                for (Object obj2 : iterable) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        p7h.T();
                        throw null;
                    }
                    arrayList.add(new zkm0(((pvc0) obj2).c, i2));
                    i2 = i3;
                }
                return new elm0(arrayList);
            case 7:
                return Boolean.valueOf(obj instanceof List);
            case 8:
                return (k1r) obj;
            case 9:
                return rih1Var;
            case 10:
                return "spotify:internal:your-library:messaging";
            case 11:
                return new b1l0((i3l0) obj);
            case 12:
                b7x b7xVar = b7x.a;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), ((b1l0) obj).a, r6h1.c, System.currentTimeMillis());
            case 13:
                return Boolean.valueOf(obj instanceof jo70);
            case 14:
                return Boolean.valueOf(obj instanceof xkk1);
            case 15:
                return Boolean.valueOf(obj instanceof j6k);
            case 16:
                return Boolean.valueOf(obj instanceof lhe0);
            case 17:
                return Boolean.valueOf(obj instanceof jfk);
            case 18:
                return Boolean.valueOf(obj instanceof fqk);
            case 19:
                b261.x((e261) obj, 0);
                return rih1Var;
            case 20:
                b261.x((e261) obj, 0);
                return rih1Var;
            case 21:
                ((n161) obj).b(t2bVar, "TEST_TAG_RELOAD_TITLE");
                return rih1Var;
            case 22:
                ((n161) obj).b(t2bVar, "TEST_TAG_RELOAD_BODY");
                return rih1Var;
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                return rih1Var;
            case 24:
                List<qxm0> list = ((xxm0) obj).a;
                ArrayList arrayList2 = new ArrayList(q7h.U(list, 10));
                for (qxm0 qxm0Var : list) {
                    arrayList2.add(new sii0(qxm0Var.f, qxm0Var, (byte) 6));
                }
                return new wa3((mr20[]) o7h.l1(arrayList2).toArray(new mr20[0]), (byte) 27);
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                return new rym0(false, new fvf1(0L, 0L));
            case 26:
                return (String) obj;
            case 27:
                t8p0 t8p0Var = (t8p0) obj;
                return Boolean.valueOf(t8p0Var != null ? t8p0Var.b.contains(s8p0.c) : false);
            case 28:
                if (!(obj instanceof t8p0) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            default:
                if (obj instanceof rih1) {
                    return null;
                }
                return (t8p0) obj;
        }
    }
}
