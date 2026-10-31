package p;

import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class vu70 extends hab0 implements iu30 {
    public static final vu70 N0;
    public static final vu70 O0;
    public static final vu70 P0;
    public static final vu70 Q0;
    public static final vu70 R0;
    public static final vu70 S0;
    public static final vu70 T0;
    public static final vu70 U0;
    public static final vu70 V0;
    public static final vu70 W0;
    public static final vu70 X;
    public static final vu70 X0;
    public static final vu70 Y;
    public static final vu70 Y0;
    public static final vu70 Z;
    public static final vu70 Z0;
    public static final vu70 a1;
    public static final vu70 b;
    public static final vu70 b1;
    public static final vu70 c;
    public static final vu70 c1;
    public static final vu70 d;
    public static final vu70 d1;
    public static final vu70 e;
    public static final vu70 e1;
    public static final vu70 f;
    public static final vu70 g;
    public static final vu70 h;
    public static final vu70 i;
    public static final vu70 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new vu70(i2, (byte) 0);
        c = new vu70(i2, (byte) 1);
        d = new vu70(i2, (byte) 2);
        e = new vu70(i2, (byte) 3);
        f = new vu70(i2, (byte) 4);
        g = new vu70(i2, (byte) 5);
        h = new vu70(i2, (byte) 6);
        i = new vu70(i2, (byte) 7);
        t = new vu70(i2, (byte) 8);
        X = new vu70(i2, (byte) 9);
        Y = new vu70(i2, (byte) 10);
        Z = new vu70(i2, (byte) 11);
        N0 = new vu70(i2, (byte) 12);
        O0 = new vu70(i2, (byte) 13);
        P0 = new vu70(i2, (byte) 14);
        Q0 = new vu70(i2, (byte) 15);
        R0 = new vu70(i2, (byte) 16);
        S0 = new vu70(i2, (byte) 17);
        T0 = new vu70(i2, (byte) 18);
        U0 = new vu70(i2, (byte) 19);
        V0 = new vu70(i2, (byte) 20);
        W0 = new vu70(i2, (byte) 21);
        X0 = new vu70(i2, (byte) 22);
        Y0 = new vu70(i2, (byte) 23);
        Z0 = new vu70(i2, (byte) 24);
        a1 = new vu70(i2, (byte) 25);
        b1 = new vu70(i2, (byte) 26);
        c1 = new vu70(i2, (byte) 27);
        d1 = new vu70(i2, (byte) 28);
        e1 = new vu70(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vu70(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        byte b2 = this.a;
        boolean z = true;
        t2b t2bVar = lgo1.b;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                ((Number) obj).intValue();
                return null;
            case 1:
                ((Number) obj).intValue();
                return null;
            case 2:
                return new kyd(((Boolean) obj).booleanValue());
            case 3:
                return ((jv70) obj).a;
            case 4:
                jv70 jv70Var = (jv70) obj;
                return xcg1.i(jv70Var.b, "-", jv70Var.a.b);
            case 5:
                return new b491(i491.c);
            case 6:
                return ((lv70) obj).a;
            case 7:
                ((Number) obj).intValue();
                return null;
            case 8:
                ((Number) obj).intValue();
                return null;
            case 9:
                return new kyd(((Boolean) obj).booleanValue());
            case 10:
                return ((qu70) obj).a;
            case 11:
                int iOrdinal = ((zt70) obj).ordinal();
                if (iOrdinal == 0) {
                    return wzz.a;
                }
                if (iOrdinal == 1) {
                    return yzz.a;
                }
                eg.o();
                return null;
            case 12:
                sv70 sv70Var = (sv70) obj;
                return new tv70(sv70Var.a, sv70Var.b, sv70Var.c, sv70Var.d, (String) null, (byte[]) null);
            case 13:
                return "spotify:image-picker";
            case 14:
                lsl lslVar = (lsl) obj;
                lslVar.s1();
                mmr0 mmr0Var = new mmr0(Float.valueOf(0.0f), new u7h(u7h.j));
                Float fValueOf = Float.valueOf(0.4f);
                uwr uwrVar = cbx.a;
                DrawScope.c0(lslVar, v9c.t(new mmr0[]{mmr0Var, new mmr0(fValueOf, new u7h(((vex) zex.a.e).a)), new mmr0(Float.valueOf(1.0f), new u7h(u7h.b(u7h.b, 0.4f, 0.0f, 0.0f, 0.0f, 14)))}, 0.0f, 0.0f, 14), 0L, 0L, (((long) Float.floatToRawIntBits(lslVar.X0(8.0f))) << 32) | (((long) Float.floatToRawIntBits(lslVar.X0(8.0f))) & 4294967295L), 0.0f, (DrawStyle) null, 246);
                return rih1Var;
            case 15:
                ky70 ky70Var = (ky70) obj;
                return new ly70(ky70Var.a, ky70Var.e, hy70.a, lqs0.d);
            case 16:
                ((qtr) obj).b(new kr(5, (lnm) null, (byte) 19));
                return rih1Var;
            case 17:
                return ((sod1) obj).a;
            case 18:
                return (o180) obj;
            case 19:
                Set set = (Set) obj;
                int iS = zno1.s(q7h.U(set, 10));
                if (iS < 16) {
                    iS = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
                for (Object obj2 : set) {
                    linkedHashMap.put(obj2, new h3r(c3r.a));
                }
                return new huz(linkedHashMap, (byte) 10);
            case 20:
                b7x b7xVar = b7x.a;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("quick_scroll", 1, b7xVar), ((o3m0) obj).a, r6h1.c, System.currentTimeMillis());
            case 21:
                ((n161) obj).b(t2bVar, "TEST_TAG_COMPACT_INACTIVE_SESSION");
                return rih1Var;
            case 22:
                ((n161) obj).b(t2bVar, "TEST_TAG_COMPACT_INACTIVE_SESSION");
                return rih1Var;
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                ((n161) obj).b(t2bVar, "TEST_TAG_SMALL_INACTIVE_SESSION");
                return rih1Var;
            case 24:
                ((n161) obj).b(t2bVar, "TEST_TAG_SMALL_INACTIVE_SESSION");
                return rih1Var;
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                return (String) obj;
            case 26:
                ArrayList arrayList = ((dd8) obj).a;
                if (arrayList.isEmpty()) {
                    z = false;
                } else {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (!((tob) it.next()).a.a.isEmpty()) {
                        }
                    }
                    z = false;
                }
                return Boolean.valueOf(z);
            case 27:
                return l880.a;
            case 28:
                return Boolean.valueOf(obj instanceof dd8);
            default:
                if (obj != null) {
                    return (dd8) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.audiobooktophysicalbookmapping.AudiobookToPhysicalBookMapping");
                return null;
        }
    }
}
