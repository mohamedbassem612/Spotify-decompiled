package p;

import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class tpg extends hab0 implements iu30 {
    public static final tpg N0;
    public static final tpg O0;
    public static final tpg P0;
    public static final tpg Q0;
    public static final tpg R0;
    public static final tpg S0;
    public static final tpg T0;
    public static final tpg U0;
    public static final tpg V0;
    public static final tpg W0;
    public static final tpg X;
    public static final tpg X0;
    public static final tpg Y;
    public static final tpg Y0;
    public static final tpg Z;
    public static final tpg Z0;
    public static final tpg a1;
    public static final tpg b;
    public static final tpg b1;
    public static final tpg c;
    public static final tpg c1;
    public static final tpg d;
    public static final tpg d1;
    public static final tpg e;
    public static final tpg e1;
    public static final tpg f;
    public static final tpg g;
    public static final tpg h;
    public static final tpg i;
    public static final tpg t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new tpg(i2, (byte) 0);
        c = new tpg(i2, (byte) 1);
        d = new tpg(i2, (byte) 2);
        e = new tpg(i2, (byte) 3);
        f = new tpg(i2, (byte) 4);
        g = new tpg(i2, (byte) 5);
        h = new tpg(i2, (byte) 6);
        i = new tpg(i2, (byte) 7);
        t = new tpg(i2, (byte) 8);
        X = new tpg(i2, (byte) 9);
        Y = new tpg(i2, (byte) 10);
        Z = new tpg(i2, (byte) 11);
        N0 = new tpg(i2, (byte) 12);
        O0 = new tpg(i2, (byte) 13);
        P0 = new tpg(i2, (byte) 14);
        Q0 = new tpg(i2, (byte) 15);
        R0 = new tpg(i2, (byte) 16);
        S0 = new tpg(i2, (byte) 17);
        T0 = new tpg(i2, (byte) 18);
        U0 = new tpg(i2, (byte) 19);
        V0 = new tpg(i2, (byte) 20);
        W0 = new tpg(i2, (byte) 21);
        X0 = new tpg(i2, (byte) 22);
        Y0 = new tpg(i2, (byte) 23);
        Z0 = new tpg(i2, (byte) 24);
        a1 = new tpg(i2, (byte) 25);
        b1 = new tpg(i2, (byte) 26);
        c1 = new tpg(i2, (byte) 27);
        d1 = new tpg(i2, (byte) 28);
        e1 = new tpg(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tpg(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        String str;
        zuc0 zuc0Var;
        r1f1 q1f1Var;
        byte b2 = this.a;
        w7x w7xVar = w7x.a;
        boolean z = false;
        rih1 rih1Var = rih1.a;
        x4i1 x4i1Var = null;
        switch (b2) {
            case 0:
                return (g3d0) obj;
            case 1:
                return Boolean.valueOf(obj instanceof g3d0);
            case 2:
                if (obj != null) {
                    return (g3d0) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.listplatform.endpoints.ListSortOrder");
                return null;
            case 3:
                return new aqg(z6x.a, w7xVar);
            case 4:
                return zpg.a;
            case 5:
                b261.c((e261) obj);
                return rih1Var;
            case 6:
                return rih1Var;
            case 7:
                return w7xVar;
            case 8:
                qqg qqgVar = (qqg) obj;
                return new o4o(qqgVar.a, qqgVar.c, qqgVar.b, true);
            case 9:
                return Collections.singleton(((qqg) obj).a);
            case 10:
                AtomicReferenceArray atomicReferenceArray = p6r0.e;
                return new u2m0(new ksk0(yon1.X4().a, nik1.g1.a, (byte) 22));
            case 11:
                qxc0 qxc0Var = (qxc0) obj;
                if (qxc0Var != null && qxc0Var.W0 > 1 && ((str = qxc0Var.e) == null || str.length() == 0)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 12:
                return Boolean.valueOf((obj instanceof qxc0) || (obj instanceof rih1));
            case 13:
                if (obj instanceof rih1) {
                    return null;
                }
                return (qxc0) obj;
            case 14:
                j7e0 j7e0Var = ((hwq) obj).g;
                j7e0 j7e0Var2 = j7e0Var instanceof j7e0 ? j7e0Var : null;
                if (j7e0Var2 != null && (zuc0Var = j7e0Var2.a) != null) {
                    x4i1Var = zuc0Var.d;
                }
                return new qxg(x4i1Var);
            case 15:
                return new y2l0((i3l0) obj);
            case 16:
                return ((n3l0) obj).a("spotify:new:playlist");
            case 17:
                return ((eyg) obj).a;
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                return ((eyg) obj).a;
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                return Boolean.valueOf((obj instanceof jo70) || (obj instanceof rih1));
            case 20:
                if (obj instanceof rih1) {
                    return null;
                }
                return (jo70) obj;
            case 21:
                return Boolean.valueOf(obj instanceof xkk1);
            case 22:
                return (k1r) obj;
            case 23:
                n271 n271Var = (n271) obj;
                int i2 = n271Var.b;
                String strA = n271Var.a.a();
                q1f1 q1f1Var2 = n271Var.c;
                q1f1Var2.getClass();
                if (q1f1Var2 instanceof r1f1) {
                    q1f1Var = r1f1.a;
                } else if (q1f1Var2 instanceof p1f1) {
                    q1f1Var = p1f1.a;
                } else {
                    if (!(q1f1Var2 instanceof q1f1)) {
                        eg.o();
                        return null;
                    }
                    q1f1Var = new q1f1(q1f1Var2.a);
                }
                return new xyg(strA, i2, q1f1Var);
            case 24:
                return (xyg) obj;
            case 25:
                return ezg.a;
            case 26:
                ((qtr) obj).b(new gp9(5, (lnm) x4i1Var, (byte) 4));
                return rih1Var;
            case 27:
                float fFloatValue = ((Number) obj).floatValue();
                ozg ozgVar = new ozg();
                ozgVar.b.t(fFloatValue);
                return ozgVar;
            case 28:
                s6h s6hVar = (s6h) obj;
                return new o6h(s6hVar.h(), s6hVar.g(), s6hVar.b(), s6hVar.a(), s6hVar.j());
            default:
                return h6h.a;
        }
    }
}
