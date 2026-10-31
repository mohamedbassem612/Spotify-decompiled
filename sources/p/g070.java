package p;

import android.os.Bundle;
import android.os.Parcelable;
import com.spotify.mobius.First;
import com.spotify.mobius.Next;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class g070 extends hab0 implements vu30 {
    public static final g070 N0;
    public static final g070 O0;
    public static final g070 P0;
    public static final g070 Q0;
    public static final g070 R0;
    public static final g070 S0;
    public static final g070 T0;
    public static final g070 U0;
    public static final g070 V0;
    public static final g070 W0;
    public static final g070 X;
    public static final g070 X0;
    public static final g070 Y;
    public static final g070 Y0;
    public static final g070 Z;
    public static final g070 Z0;
    public static final g070 a1;
    public static final g070 b;
    public static final g070 b1;
    public static final g070 c;
    public static final g070 c1;
    public static final g070 d;
    public static final g070 d1;
    public static final g070 e;
    public static final g070 e1;
    public static final g070 f;
    public static final g070 g;
    public static final g070 h;
    public static final g070 i;
    public static final g070 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 2;
        b = new g070(i2, (byte) 0);
        c = new g070(i2, (byte) 1);
        d = new g070(i2, (byte) 2);
        e = new g070(i2, (byte) 3);
        f = new g070(i2, (byte) 4);
        g = new g070(i2, (byte) 5);
        h = new g070(i2, (byte) 6);
        i = new g070(i2, (byte) 7);
        t = new g070(i2, (byte) 8);
        X = new g070(i2, (byte) 9);
        Y = new g070(i2, (byte) 10);
        Z = new g070(i2, (byte) 11);
        N0 = new g070(i2, (byte) 12);
        O0 = new g070(i2, (byte) 13);
        P0 = new g070(i2, (byte) 14);
        Q0 = new g070(i2, (byte) 15);
        R0 = new g070(i2, (byte) 16);
        S0 = new g070(i2, (byte) 17);
        T0 = new g070(i2, (byte) 18);
        U0 = new g070(i2, (byte) 19);
        V0 = new g070(i2, (byte) 20);
        W0 = new g070(i2, (byte) 21);
        X0 = new g070(i2, (byte) 22);
        Y0 = new g070(i2, (byte) 23);
        Z0 = new g070(i2, (byte) 24);
        a1 = new g070(i2, (byte) 25);
        b1 = new g070(i2, (byte) 26);
        c1 = new g070(i2, (byte) 27);
        d1 = new g070(i2, (byte) 28);
        e1 = new g070(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g070(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    /* JADX WARN: Code duplicated, block: B:84:0x015a  */
    public final Object invoke(Object obj, Object obj2) {
        mq70 mq70Var;
        pp70 pp70Var;
        String entityUri;
        List list;
        ho70 ho70Var;
        mq70 mq70Var2;
        up70 up70VarA;
        pp70 pp70Var2;
        byte b2 = this.a;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                f070 f070Var = (f070) obj;
                return Next.i(new r070(f070Var), Collections.singleton(new dz60(f070Var.a.a)));
            case 1:
                return First.c((r070) obj2, f46.S0(new oz60[]{iz60.a, new dz60(((f070) obj).a.a)}));
            case 2:
                return rih1Var;
            case 3:
                Object objT = jhc1.t((Bundle) obj, "parcelable", yr70.class);
                objT.getClass();
                return (Parcelable) objT;
            case 4:
                ((n3x) obj).b = (yx70) obj2;
                return rih1Var;
            case 5:
                ((n3x) obj).a = (gt40) obj2;
                return rih1Var;
            case 6:
                ((n3x) obj).d = ((i6m) obj2).a;
                return rih1Var;
            case 7:
                u8h u8hVar = (u8h) obj2;
                ((n3x) obj).c = u8hVar != null ? u8hVar.a : null;
                return rih1Var;
            case 8:
                ft40 ft40Var = (ft40) obj2;
                return ft40Var instanceof q161 ? ft40Var : obj;
            case 9:
                return null;
            case 10:
                return null;
            case 11:
                return null;
            case 12:
                return null;
            case 13:
                sv70 sv70Var = (sv70) obj;
                rv70 rv70Var = (rv70) obj2;
                String str = sv70Var.a;
                String str2 = sv70Var.b;
                ArrayList arrayList = rv70Var.b;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : arrayList) {
                    if (rv70Var.c.contains(((tlt) obj3).a)) {
                        arrayList2.add(obj3);
                    }
                }
                String str3 = sv70Var.d;
                pv70 pv70Var = rv70Var.a;
                return new tv70(str, str2, arrayList2, str3, pv70Var.c, pv70Var.d);
            case 14:
                ky70 ky70Var = (ky70) obj;
                fy70 fy70Var = (fy70) obj2;
                t3z0 t3z0Var = ky70Var.a;
                int iHashCode = t3z0Var.a.hashCode();
                List listR = p7h.R(yoi1.Q(0, 36), new hkm1(iHashCode, iHashCode >> 31));
                Long l = ky70Var.b;
                return new ly70(t3z0Var, ky70Var.e, fy70Var.a, mqo1.C(o7h.p1(o7h.d1(listR, yoi1.p(l == null ? 0 : (ky70Var.c != null || ky70Var.d) ? ((ArrayList) listR).size() : (int) ((fy70Var.b - l.longValue()) / 1000), 0, 36)))));
            case 15:
                ft40 ft40Var2 = (ft40) obj2;
                return ft40Var2 instanceof iql1 ? ft40Var2 : obj;
            case 16:
                ft40 ft40Var3 = (ft40) obj2;
                return ft40Var3 instanceof f660 ? ft40Var3 : obj;
            case 17:
                return (a980) obj;
            case 18:
                return new u7h(((afx) obj).b.a);
            case 19:
                return new u7h(((afx) obj).a.b.c());
            case 20:
                gl80 gl80Var = (gl80) obj2;
                xk80 xk80Var = ((hl80) obj).a;
                jo70 jo70Var = gl80Var.a;
                xkk1 xkk1Var = gl80Var.b;
                afx afxVar = (xkk1Var == null || (pp70Var2 = xkk1Var.d) == null) ? (xkk1Var == null || (mq70Var = xkk1Var.a) == null || (pp70Var = mq70Var.b) == null) ? null : pp70Var.a : pp70Var2.a;
                String str4 = (xkk1Var == null || (mq70Var2 = xkk1Var.a) == null || (up70VarA = mq70Var2.a(vp70.c)) == null) ? null : up70VarA.a.a;
                if (jo70Var == null || (entityUri = jo70Var.a) == null) {
                    entityUri = xk80Var.getEntityUri();
                } else {
                    if (entityUri.length() <= 0) {
                        entityUri = null;
                    }
                    if (entityUri == null) {
                        entityUri = xk80Var.getEntityUri();
                    }
                }
                return new il80(xk80Var, str4, entityUri, (jo70Var == null || (list = jo70Var.d) == null || (ho70Var = (ho70) o7h.s0(list)) == null) ? null : ho70Var.a, afxVar != null ? new u7h(afxVar.a.c) : null, afxVar != null ? new u7h(afxVar.b.a) : null);
            case 21:
                qm80 qm80Var = (qm80) obj;
                bn80 bn80Var = (bn80) obj2;
                String str5 = qm80Var.a;
                ArrayList arrayList3 = qm80Var.b;
                String str6 = qm80Var.c;
                bn80 bn80VarA = bn80.a(bn80Var, str5, arrayList3, str6, (List) null, false, false, (LinkedHashSet) null, n8p1.t(str6, bn80Var.d, arrayList3), 120);
                return First.c(bn80VarA, Collections.singleton(new jm80(bn80VarA.a)));
            case 22:
                pnb1 pnb1Var = (pnb1) obj;
                Bundle bundle = (Bundle) obj2;
                pnb1 pnb1Var2 = bundle != null ? (pnb1) jhc1.t(bundle, "campfire_interceptor_model", pnb1.class) : null;
                return ((pnb1Var2 instanceof dnb1) || (pnb1Var2 instanceof umb1) || pnb1Var2 == null) ? pnb1Var : pnb1Var2;
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                j990 j990Var = (j990) obj;
                i990 i990Var = (i990) obj2;
                vzq0 vzq0Var = j990Var.a;
                String str7 = j990Var.b;
                String str8 = j990Var.c;
                return new o990(vzq0Var, str7, str8 != null ? new l990(str8, i990Var.a, i990Var.b) : m990.a, mqo1.A(j990Var.d), j990Var.e);
            case 24:
                return ((z8l0) obj).a((String) obj2);
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                return ((z8l0) obj).a((String) obj2);
            case 26:
                qla1 qla1Var = (rla1) obj2;
                if (qla1Var instanceof qla1) {
                    return new j3r(qla1Var.a);
                }
                if (qla1Var instanceof pla1) {
                    return new j3r(Boolean.FALSE);
                }
                eg.o();
                return null;
            case 27:
                qla1 qla1Var2 = (rla1) obj2;
                if (qla1Var2 instanceof qla1) {
                    return new j3r(qla1Var2.a);
                }
                if (qla1Var2 instanceof pla1) {
                    return new j3r(Boolean.FALSE);
                }
                eg.o();
                return null;
            case 28:
                pla1 pla1Var = (rla1) obj2;
                if (pla1Var instanceof pla1) {
                    return new h3r(new d3r(pla1Var.a.toString()));
                }
                if (pla1Var instanceof qla1) {
                    return new j3r(((qla1) pla1Var).a);
                }
                eg.o();
                return null;
            default:
                ((Number) obj2).intValue();
                x340 x340Var = (b0k) obj;
                x340Var.i0(481298176);
                x340Var.r(false);
                return null;
        }
    }
}
