package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class p7w0 extends hab0 implements iu30 {
    public static final p7w0 N0;
    public static final p7w0 O0;
    public static final p7w0 P0;
    public static final p7w0 Q0;
    public static final p7w0 R0;
    public static final p7w0 S0;
    public static final p7w0 T0;
    public static final p7w0 U0;
    public static final p7w0 V0;
    public static final p7w0 W0;
    public static final p7w0 X;
    public static final p7w0 X0;
    public static final p7w0 Y;
    public static final p7w0 Y0;
    public static final p7w0 Z;
    public static final p7w0 Z0;
    public static final p7w0 a1;
    public static final p7w0 b;
    public static final p7w0 b1;
    public static final p7w0 c;
    public static final p7w0 c1;
    public static final p7w0 d;
    public static final p7w0 d1;
    public static final p7w0 e;
    public static final p7w0 e1;
    public static final p7w0 f;
    public static final p7w0 g;
    public static final p7w0 h;
    public static final p7w0 i;
    public static final p7w0 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new p7w0(i2, (byte) 0);
        c = new p7w0(i2, (byte) 1);
        d = new p7w0(i2, (byte) 2);
        e = new p7w0(i2, (byte) 3);
        f = new p7w0(i2, (byte) 4);
        g = new p7w0(i2, (byte) 5);
        h = new p7w0(i2, (byte) 6);
        i = new p7w0(i2, (byte) 7);
        t = new p7w0(i2, (byte) 8);
        X = new p7w0(i2, (byte) 9);
        Y = new p7w0(i2, (byte) 10);
        Z = new p7w0(i2, (byte) 11);
        N0 = new p7w0(i2, (byte) 12);
        O0 = new p7w0(i2, (byte) 13);
        P0 = new p7w0(i2, (byte) 14);
        Q0 = new p7w0(i2, (byte) 15);
        R0 = new p7w0(i2, (byte) 16);
        S0 = new p7w0(i2, (byte) 17);
        T0 = new p7w0(i2, (byte) 18);
        U0 = new p7w0(i2, (byte) 19);
        V0 = new p7w0(i2, (byte) 20);
        W0 = new p7w0(i2, (byte) 21);
        X0 = new p7w0(i2, (byte) 22);
        Y0 = new p7w0(i2, (byte) 23);
        Z0 = new p7w0(i2, (byte) 24);
        a1 = new p7w0(i2, (byte) 25);
        b1 = new p7w0(i2, (byte) 26);
        c1 = new p7w0(i2, (byte) 27);
        d1 = new p7w0(i2, (byte) 28);
        e1 = new p7w0(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p7w0(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        byte b2 = this.a;
        boolean z = false;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                b261.c((e261) obj);
                return rih1Var;
            case 1:
                b261.c((e261) obj);
                return rih1Var;
            case 2:
                return rih1Var;
            case 3:
                yaw0 yaw0Var = (yaw0) obj;
                return new zaw0(x760.A(yaw0Var.a, yaw0Var.b, yaw0Var.c, yaw0Var.d, yaw0Var.e, yaw0Var.f, yaw0Var.g, yaw0Var.h, yaw0Var.i, yaw0Var.k, true, (zkm) null, (i091) null, false, yaw0Var.l));
            case 4:
                return Boolean.valueOf(((hwt) obj).d);
            case 5:
                return ((tei0) obj).b();
            case 6:
                tei0 tei0Var = (tei0) obj;
                return sqg0.J(new mmr0[]{new mmr0(1, Collections.singleton(tei0Var.b().d)), new mmr0(2, Collections.singleton(tei0Var.b().c))});
            case 7:
                return ((tei0) obj).b().c;
            case 8:
                return String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(((Number) obj).byteValue())}, 1));
            case 9:
                pxg1 pxg1Var = fiw0.a;
                return new p9m(xay.e(2, pxg1Var), xay.f(2, pxg1Var), 0.0f, new c391(false, gbw0.f), 4);
            case 10:
                return rc11.a.b(((oiw0) obj).getClass());
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                return rih1Var;
            case grn1.d /* 12 */:
                return new o1l0((i3l0) obj);
            case 13:
                return ((ukw0) obj).c;
            case 14:
                ArrayList arrayList = ((ukw0) obj).c.e;
                ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((nii0) it.next()).c);
                }
                mmr0 mmr0Var = new mmr0(1, o7h.p1(arrayList2));
                ArrayList arrayList3 = new ArrayList(q7h.U(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(((nii0) it2.next()).d);
                }
                return sqg0.J(new mmr0[]{mmr0Var, new mmr0(2, o7h.p1(arrayList3))});
            case 15:
                return new nlw0((wl71) obj);
            case 16:
                return rih1Var;
            case 17:
                return rih1Var;
            case 18:
                cpw0 cpw0Var = (cpw0) obj;
                return new dpw0(cpw0Var.c, cpw0Var.a, cpw0Var.b, false);
            case 19:
                return ((nwl0) obj).e();
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                return new zm61(2131962129, (Integer) null, 2131962128, new bz0(3, (lnm) null, (byte) 24), new ym61(new s6o(14, (byte) 2), new n601(U0, (byte) 29)), 669);
            case 21:
                Set set = ((qo90) obj).b;
                if ((set instanceof Collection) && set.isEmpty()) {
                    z = true;
                } else {
                    Iterator it3 = set.iterator();
                    while (it3.hasNext()) {
                        if (!mqw0.a.contains((ko90) it3.next())) {
                        }
                    }
                    z = true;
                }
                return Boolean.valueOf(!z);
            case 22:
                return ",";
            case 23:
                s0x0 s0x0Var = (s0x0) obj;
                return new ndx0(s0x0Var.b, s0x0Var.c, s0x0Var.e, s0x0Var.d, z6x.a);
            case 24:
                c1x0 c1x0Var = (c1x0) obj;
                return new d1x0((Integer) null, c1x0Var.c.a, "", "", c1x0Var.a, "", c1x0Var.b);
            case 25:
                return ((c1x0) obj).a;
            case 26:
                return ((c1x0) obj).c.a;
            case 27:
                return ((c1x0) obj).c.a;
            case 28:
                return Boolean.valueOf((obj instanceof jo70) || (obj instanceof rih1));
            default:
                if (obj instanceof rih1) {
                    return null;
                }
                return (jo70) obj;
        }
    }
}
