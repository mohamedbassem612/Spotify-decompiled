package p;

import android.os.Bundle;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class uak0 extends hab0 implements iu30 {
    public static final uak0 N0;
    public static final uak0 O0;
    public static final uak0 P0;
    public static final uak0 Q0;
    public static final uak0 R0;
    public static final uak0 S0;
    public static final uak0 T0;
    public static final uak0 U0;
    public static final uak0 V0;
    public static final uak0 W0;
    public static final uak0 X;
    public static final uak0 X0;
    public static final uak0 Y;
    public static final uak0 Y0;
    public static final uak0 Z;
    public static final uak0 Z0;
    public static final uak0 a1;
    public static final uak0 b;
    public static final uak0 b1;
    public static final uak0 c;
    public static final uak0 c1;
    public static final uak0 d;
    public static final uak0 d1;
    public static final uak0 e;
    public static final uak0 e1;
    public static final uak0 f;
    public static final uak0 g;
    public static final uak0 h;
    public static final uak0 i;
    public static final uak0 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new uak0(i2, (byte) 0);
        c = new uak0(i2, (byte) 1);
        d = new uak0(i2, (byte) 2);
        e = new uak0(i2, (byte) 3);
        f = new uak0(i2, (byte) 4);
        g = new uak0(i2, (byte) 5);
        h = new uak0(i2, (byte) 6);
        i = new uak0(i2, (byte) 7);
        t = new uak0(i2, (byte) 8);
        X = new uak0(i2, (byte) 9);
        Y = new uak0(i2, (byte) 10);
        Z = new uak0(i2, (byte) 11);
        N0 = new uak0(i2, (byte) 12);
        O0 = new uak0(i2, (byte) 13);
        P0 = new uak0(i2, (byte) 14);
        Q0 = new uak0(i2, (byte) 15);
        R0 = new uak0(i2, (byte) 16);
        S0 = new uak0(i2, (byte) 17);
        T0 = new uak0(i2, (byte) 18);
        U0 = new uak0(i2, (byte) 19);
        V0 = new uak0(i2, (byte) 20);
        W0 = new uak0(i2, (byte) 21);
        X0 = new uak0(i2, (byte) 22);
        Y0 = new uak0(i2, (byte) 23);
        Z0 = new uak0(i2, (byte) 24);
        a1 = new uak0(i2, (byte) 25);
        b1 = new uak0(i2, (byte) 26);
        c1 = new uak0(i2, (byte) 27);
        d1 = new uak0(i2, (byte) 28);
        e1 = new uak0(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uak0(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        byte b2 = this.a;
        uao0 uao0Var = uao0.b;
        Map map = b7x.a;
        rih1 rih1Var = rih1.a;
        b8w0 b8w0Var = b8w0.Unknown;
        t0z t0zVar = b8w0.N0;
        boolean z = true;
        switch (b2) {
            case 0:
                return rih1Var;
            case 1:
                return new pbk0((nbk0) obj, false, false, false, false);
            case 2:
                DrawScope drawScope = (DrawScope) obj;
                float fX0 = drawScope.X0(4.0f);
                n7v.a(drawScope, (drawScope.X0(g3p1.o(drawScope, 54.0f, 72.0f)) / 2.0f) - (fX0 / 2.0f), drawScope.g1(), drawScope.X0(3.0f), u7h.b(z4p1.g(4280211239L), 0.3f, 0.0f, 0.0f, 0.0f, 14), fX0);
                float fX1 = drawScope.X0(3.0f);
                n7v.a(drawScope, (fX1 / 2.0f) + (drawScope.X0(g3p1.o(drawScope, 56.0f, 72.0f)) / 2.0f), drawScope.g1(), drawScope.X0(4.0f), u7h.b(z4p1.g(4280211296L), 0.3f, 0.0f, 0.0f, 0.0f, 14), fX1);
                return rih1Var;
            case 3:
                return new sck0((rck0) obj, (Map) null, uao0Var);
            case 4:
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : t0zVar) {
                    b8w0 b8w0Var2 = (b8w0) obj2;
                    if (b8w0Var2 != b8w0Var && b8w0Var2 != b8w0.None) {
                        arrayList.add(obj2);
                    }
                }
                return arrayList;
            case 5:
                Map map2 = (Map) obj;
                if (map2 != null) {
                    map = map2;
                }
                return new uck0(map);
            case 6:
                if (!(obj instanceof Map) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 7:
                if (obj instanceof rih1) {
                    return null;
                }
                return (Map) obj;
            case 8:
                return rih1Var;
            case 9:
                Bundle bundle = new Bundle();
                bundle.putParcelable("mobius_model_key", (zgk0) obj);
                return bundle;
            case 10:
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : t0zVar) {
                    if (((b8w0) obj3) != b8w0Var) {
                        arrayList2.add(obj3);
                    }
                }
                return arrayList2;
            case 11:
                dik0 dik0Var = (dik0) obj;
                ArrayList arrayList3 = new ArrayList();
                for (Object obj4 : vaa0.Y) {
                    vaa0 vaa0Var = (vaa0) obj4;
                    if (vaa0Var != vaa0.None && vaa0Var != vaa0.Unknown) {
                        arrayList3.add(obj4);
                    }
                }
                ArrayList arrayList4 = new ArrayList();
                for (Object obj5 : m7f0.X) {
                    m7f0 m7f0Var = (m7f0) obj5;
                    if (m7f0Var != m7f0.None && m7f0Var != m7f0.Unknown) {
                        arrayList4.add(obj5);
                    }
                }
                return new ujk0(arrayList3, arrayList4, dik0Var.a.b.N0);
            case 12:
                ArrayList arrayList5 = new ArrayList();
                for (Object obj6 : t0zVar) {
                    if (((b8w0) obj6) != b8w0Var) {
                        arrayList5.add(obj6);
                    }
                }
                return arrayList5;
            case 13:
                return (Map) obj;
            case 14:
                if (!(obj instanceof Map) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 15:
                if (obj instanceof rih1) {
                    return null;
                }
                return (Map) obj;
            case 16:
                if (!(obj instanceof Map) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 17:
                if (obj instanceof rih1) {
                    return null;
                }
                return (Map) obj;
            case 18:
                if (!(obj instanceof cw21) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 19:
                if (obj instanceof rih1) {
                    return null;
                }
                return (cw21) obj;
            case 20:
                return new g4d0((String) obj);
            case 21:
                return (g3d0) obj;
            case 22:
                return Boolean.valueOf(obj instanceof g3d0);
            case 23:
                if (obj != null) {
                    return (g3d0) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.listplatform.endpoints.ListSortOrder");
                return null;
            case 24:
                return new kkk0((jkk0) obj, null, uao0Var);
            case 25:
                ArrayList arrayList6 = new ArrayList();
                for (Object obj7 : t0zVar) {
                    if (((b8w0) obj7) != b8w0Var) {
                        arrayList6.add(obj7);
                    }
                }
                return arrayList6;
            case 26:
                Map map3 = (Map) obj;
                if (map3 != null) {
                    map = map3;
                }
                return new mkk0(map);
            case 27:
                if (!(obj instanceof Map) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 28:
                if (obj instanceof rih1) {
                    return null;
                }
                return (Map) obj;
            default:
                return l1d.m("mixing_style_picker_eq_", ((jez) obj).name());
        }
    }
}
