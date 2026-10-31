package p;

import android.content.Context;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.spotify.wrapped.v1.proto.Bespoke2026Content;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class lcl1 extends hab0 implements iu30 {
    public static final lcl1 N0;
    public static final lcl1 O0;
    public static final lcl1 P0;
    public static final lcl1 Q0;
    public static final lcl1 R0;
    public static final lcl1 S0;
    public static final lcl1 T0;
    public static final lcl1 U0;
    public static final lcl1 V0;
    public static final lcl1 W0;
    public static final lcl1 X;
    public static final lcl1 X0;
    public static final lcl1 Y;
    public static final lcl1 Y0;
    public static final lcl1 Z;
    public static final lcl1 Z0;
    public static final lcl1 a1;
    public static final lcl1 b;
    public static final lcl1 b1;
    public static final lcl1 c;
    public static final lcl1 c1;
    public static final lcl1 d;
    public static final lcl1 d1;
    public static final lcl1 e;
    public static final lcl1 e1;
    public static final lcl1 f;
    public static final lcl1 g;
    public static final lcl1 h;
    public static final lcl1 i;
    public static final lcl1 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new lcl1(i2, (byte) 0);
        c = new lcl1(i2, (byte) 1);
        d = new lcl1(i2, (byte) 2);
        e = new lcl1(i2, (byte) 3);
        f = new lcl1(i2, (byte) 4);
        g = new lcl1(i2, (byte) 5);
        h = new lcl1(i2, (byte) 6);
        i = new lcl1(i2, (byte) 7);
        t = new lcl1(i2, (byte) 8);
        X = new lcl1(i2, (byte) 9);
        Y = new lcl1(i2, (byte) 10);
        Z = new lcl1(i2, (byte) 11);
        N0 = new lcl1(i2, (byte) 12);
        O0 = new lcl1(i2, (byte) 13);
        P0 = new lcl1(i2, (byte) 14);
        Q0 = new lcl1(i2, (byte) 15);
        R0 = new lcl1(i2, (byte) 16);
        S0 = new lcl1(i2, (byte) 17);
        T0 = new lcl1(i2, (byte) 18);
        U0 = new lcl1(i2, (byte) 19);
        V0 = new lcl1(i2, (byte) 20);
        W0 = new lcl1(i2, (byte) 21);
        X0 = new lcl1(i2, (byte) 22);
        Y0 = new lcl1(i2, (byte) 23);
        Z0 = new lcl1(i2, (byte) 24);
        a1 = new lcl1(i2, (byte) 25);
        b1 = new lcl1(i2, (byte) 26);
        c1 = new lcl1(i2, (byte) 27);
        d1 = new lcl1(i2, (byte) 28);
        e1 = new lcl1(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lcl1(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        boolean z;
        boolean z2;
        byte b2 = this.a;
        boolean z3 = true;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                e261 e261Var = (e261) obj;
                u5l1 u5l1Var = u5l1.X;
                mma0[] mma0VarArr = b261.a;
                e261Var.b(m161.d, new we((String) null, u5l1Var));
                e261Var.b(m161.e, new whk1(2, null, (byte) 5));
                return rih1Var;
            case 1:
                return Integer.valueOf(((Number) obj).intValue());
            case 2:
                dr60 dr60Var = new dr60((Context) obj);
                dr60Var.setScaleType(b3k1.c);
                dr60Var.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                return dr60Var;
            case 3:
                Float fE0 = o7h.E0((List) obj);
                return Float.valueOf(fE0 != null ? fE0.floatValue() : 0.0f);
            case 4:
                Float fE1 = o7h.E0((List) obj);
                return Float.valueOf(fE1 != null ? fE1.floatValue() : 0.0f);
            case 5:
                List list = (List) obj;
                List list2 = list;
                ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(Float.valueOf(((wge1) it.next()).a));
                }
                float fG0 = (float) o7h.g0(arrayList);
                ArrayList arrayList2 = new ArrayList(q7h.U(list2, 10));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(Float.valueOf(((wge1) it2.next()).b));
                }
                float fG1 = (float) o7h.g0(arrayList2);
                ArrayList arrayList3 = new ArrayList(q7h.U(list2, 10));
                Iterator it3 = list2.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(Float.valueOf(((wge1) it3.next()).c));
                }
                float fG2 = (float) o7h.g0(arrayList3);
                int i2 = ((wge1) o7h.q0(list)).f;
                boolean z4 = list2 instanceof Collection;
                if (z4 && list2.isEmpty()) {
                    z = false;
                } else {
                    Iterator it4 = list2.iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            z = false;
                        } else if (((wge1) it4.next()).d) {
                            z = true;
                        }
                    }
                }
                if (z4 && list2.isEmpty()) {
                    z2 = false;
                } else {
                    Iterator it5 = list2.iterator();
                    while (it5.hasNext()) {
                        if (((wge1) it5.next()).e) {
                            z2 = true;
                        }
                    }
                    z2 = false;
                }
                return new wge1(fG0, fG1, fG2, z, z2, i2);
            case 6:
                return rih1Var;
            case 7:
                ((WebView) obj).destroy();
                return rih1Var;
            case 8:
                return Boolean.valueOf(new File(f4i1.c(((Number) obj).intValue(), "/proc/")).exists());
            case 9:
                return String.valueOf(((Number) obj).intValue());
            case 10:
                return String.valueOf(((Number) obj).intValue());
            case 11:
                b261.x((e261) obj, 0);
                return rih1Var;
            case 12:
                return (btl1) obj;
            case 13:
                return new otl1();
            case 14:
                return new otl1();
            case 15:
                return new otl1();
            case 16:
                return new otl1();
            case 17:
                wsc0 wsc0Var = (wsc0) obj;
                List list3 = wsc0Var.e;
                ArrayList arrayList4 = new ArrayList(q7h.U(list3, 10));
                Iterator it6 = list3.iterator();
                while (it6.hasNext()) {
                    arrayList4.add(new j7e0((zuc0) it6.next()));
                }
                return new otl1(wsc0Var.n, arrayList4);
            case 18:
                return rih1Var;
            case 19:
                return new uho((String) obj, (String) null, (tho) null, (nho) null, (String) null, (Function0) null, 254);
            case 20:
                return new s371((String) obj, (String) null, 10, "WorkPageHeader");
            case 21:
                return Boolean.valueOf(obj instanceof List);
            case 22:
                if (obj != null) {
                    return (List) obj;
                }
                bhn0.i("null cannot be cast to non-null type kotlin.collections.List<com.spotify.listplatform.endpoints.kodiak.ListItemsTable.Item>");
                return null;
            case 23:
                String str = (String) obj;
                String strH0 = ihc1.H0(str, "spotify:container:");
                if (strH0.length() <= 0 || strH0.equals(str) || ihc1.i0(strH0, ':')) {
                    hhg1.n("Expected a spotify:container:<id> work URI");
                    return null;
                }
                Set set = s4b1.f;
                String strZ = uic.v("classical-recordings", "container_".concat(strH0)).z();
                if (strZ != null) {
                    return new qvc0(strZ, (c3d0) null, (Set) null, (mqz0) null, 14);
                }
                eg.m("Required value was null.");
                return null;
            case 24:
                return new rvl1((List) obj);
            case 25:
                if (!(obj instanceof jo70) && !(obj instanceof rih1)) {
                    z3 = false;
                }
                return Boolean.valueOf(z3);
            case 26:
                if (obj instanceof rih1) {
                    return null;
                }
                return (jo70) obj;
            case 27:
                if (!(obj instanceof xkk1) && !(obj instanceof rih1)) {
                    z3 = false;
                }
                return Boolean.valueOf(z3);
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                if (obj instanceof rih1) {
                    return null;
                }
                return (xkk1) obj;
            default:
                if (!(obj instanceof xkk1) && !(obj instanceof rih1)) {
                    z3 = false;
                }
                return Boolean.valueOf(z3);
        }
    }
}
