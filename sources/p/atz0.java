package p;

import android.os.Bundle;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.mobius.First;
import com.spotify.mobius.Next;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class atz0 extends hab0 implements vu30 {
    public static final atz0 N0;
    public static final atz0 O0;
    public static final atz0 P0;
    public static final atz0 Q0;
    public static final atz0 R0;
    public static final atz0 S0;
    public static final atz0 T0;
    public static final atz0 U0;
    public static final atz0 V0;
    public static final atz0 W0;
    public static final atz0 X;
    public static final atz0 X0;
    public static final atz0 Y;
    public static final atz0 Y0;
    public static final atz0 Z;
    public static final atz0 Z0;
    public static final atz0 a1;
    public static final atz0 b;
    public static final atz0 b1;
    public static final atz0 c;
    public static final atz0 c1;
    public static final atz0 d;
    public static final atz0 d1;
    public static final atz0 e;
    public static final atz0 e1;
    public static final atz0 f;
    public static final atz0 g;
    public static final atz0 h;
    public static final atz0 i;
    public static final atz0 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 2;
        b = new atz0(i2, (byte) 0);
        c = new atz0(i2, (byte) 1);
        d = new atz0(i2, (byte) 2);
        e = new atz0(i2, (byte) 3);
        f = new atz0(i2, (byte) 4);
        g = new atz0(i2, (byte) 5);
        h = new atz0(i2, (byte) 6);
        i = new atz0(i2, (byte) 7);
        t = new atz0(i2, (byte) 8);
        X = new atz0(i2, (byte) 9);
        Y = new atz0(i2, (byte) 10);
        Z = new atz0(i2, (byte) 11);
        N0 = new atz0(i2, (byte) 12);
        O0 = new atz0(i2, (byte) 13);
        P0 = new atz0(i2, (byte) 14);
        Q0 = new atz0(i2, (byte) 15);
        R0 = new atz0(i2, (byte) 16);
        S0 = new atz0(i2, (byte) 17);
        T0 = new atz0(i2, (byte) 18);
        U0 = new atz0(i2, (byte) 19);
        V0 = new atz0(i2, (byte) 20);
        W0 = new atz0(i2, (byte) 21);
        X0 = new atz0(i2, (byte) 22);
        Y0 = new atz0(i2, (byte) 23);
        Z0 = new atz0(i2, (byte) 24);
        a1 = new atz0(i2, (byte) 25);
        b1 = new atz0(i2, (byte) 26);
        c1 = new atz0(i2, (byte) 27);
        d1 = new atz0(i2, (byte) 28);
        e1 = new atz0(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ atz0(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj, Object obj2) {
        hl01 hl01Var;
        int i2;
        switch (this.a) {
            case 0:
                return new ysz0((hy50) obj2, ((wsz0) obj).b);
            case 1:
                return new xxz0((String) obj, u890.j((Boolean) obj2, Boolean.TRUE));
            case 2:
                return (j001) obj2;
            case 3:
                a401 a401Var = (a401) obj2;
                a401Var.getClass();
                return Next.h(a401.a(a401Var, (z301) obj, false, false, 4));
            case 4:
                a401 a401Var2 = (a401) obj2;
                a401Var2.getClass();
                return First.b(a401.a(a401Var2, (z301) obj, false, false, 4));
            case 5:
                return Next.j();
            case 6:
                o501 o501Var = (o501) obj2;
                o501Var.getClass();
                return o501Var.c instanceof gbe0 ? First.b(o501Var) : First.c(o501Var, Collections.singleton(i401.a));
            case 7:
                return null;
            case 8:
                ga01 ga01Var = (ga01) obj;
                rla1 rla1Var = (rla1) obj2;
                if (rla1Var instanceof qla1) {
                    return new j3r(((qla1) rla1Var).a);
                }
                if (rla1Var instanceof pla1) {
                    return new h3r(new b3r(ga01Var));
                }
                eg.o();
                return null;
            case 9:
                return null;
            case 10:
                return null;
            case 11:
                k1r k1rVar = (k1r) obj2;
                if (!(k1rVar instanceof i1r)) {
                    return new ma01();
                }
                k8g1 k8g1Var = (k8g1) u890.k(k1rVar, (d0r) null, (n4r) null);
                return new ma01(k8g1Var.a, k8g1Var.h, k8g1Var.d, k8g1Var.e, k8g1Var.i, k8g1Var.f, k8g1Var.g, k8g1Var.t, k8g1Var.X, true);
            case 12:
                mmr0 mmr0Var = (mmr0) obj2;
                return new ta01(((ra01) obj).a, ((Boolean) mmr0Var.a).booleanValue(), ((Boolean) mmr0Var.b).booleanValue());
            case 13:
                i1r i1rVar = (k1r) obj2;
                i1r i1rVar2 = i1rVar instanceof i1r ? i1rVar : null;
                return new ld01(i1rVar2 != null ? (String) i1rVar2.a : null);
            case 14:
                uwr uwrVar = cbx.a;
                return new u7h(((vex) zex.a.e).j);
            case 15:
                uwr uwrVar2 = cbx.a;
                return new u7h(((vex) zex.a.e).i);
            case 16:
                return new eh01((iix0) obj, (zg01) obj2);
            case 17:
                ((Number) obj2).intValue();
                x340 x340Var = (b0k) obj;
                x340Var.i0(-1637636881);
                mn20 mn20Var = new mn20(0, 0, 0, 0);
                x340Var.r(false);
                return mn20Var;
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                gl01 gl01Var = (gl01) obj;
                Bundle bundle = (Bundle) obj2;
                return (bundle == null || (hl01Var = (hl01) jhc1.t(bundle, "receipt_model", hl01.class)) == null) ? gl01Var : hl01Var;
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                return new aqk((j6k) obj, (lhe0) obj2);
            case 20:
                mv70 mv70Var = (ov70) obj2;
                return mv70Var instanceof mv70 ? mv70Var.a.b : f4i1.c(((Number) obj).intValue(), "skeleton_");
            case 21:
                return new lu01((List) obj, (qxc0) obj2);
            case 22:
                return new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", (String) obj2)), ((qzl0) obj).a, r6h1.c, System.currentTimeMillis());
            case 23:
                return null;
            case 24:
                String str = (String) obj;
                vx01 vx01Var = (vx01) obj2;
                int i3 = vx01Var.d;
                if (i3 != 1) {
                    i2 = i3;
                } else {
                    Set set = s4b1.f;
                    i2 = uic.g(str, blc0.u1) ? 2 : 1;
                }
                return new xx01(i2, str, vx01Var.a, vx01Var.b, vx01Var.c);
            case 25:
                fy01 fy01Var = (fy01) obj;
                hy01 hy01Var = (hy01) obj2;
                String str2 = hy01Var.a;
                String str3 = hy01Var.b;
                boolean z = hy01Var.c;
                int i4 = fy01Var.a;
                boolean z2 = hy01Var.d;
                boolean z3 = hy01Var.e;
                boolean z4 = fy01Var.b;
                List list = hy01Var.h;
                boolean z5 = hy01Var.f;
                boolean z6 = hy01Var.g;
                p111 p111Var = fy01Var.d;
                return new gy01(i4, str2, z4, p111Var.b, p111Var.c, str3, z, p111Var.g, z2, z3, p111Var.t, z5, z6, list);
            case 26:
                return null;
            case 27:
                return null;
            case 28:
                uxd uxdVar = (uxd) obj;
                List list2 = ((r111) obj2).a;
                if (list2.isEmpty()) {
                    return wxd.a;
                }
                List<etd> list3 = list2;
                ArrayList arrayList = new ArrayList(q7h.U(list3, 10));
                for (etd etdVar : list3) {
                    arrayList.add(new etd(etdVar.a, etdVar.b, etdVar.c, etdVar.d, etdVar.e, etdVar.f, (String) null, 384));
                }
                return new xxd(uxdVar.a, arrayList, (txd) null);
            default:
                f211 f211Var = (f211) obj;
                return Next.i(g211.a((g211) obj2, f211Var, 0, 0, 6), Collections.singleton(new u111(f211Var.e)));
        }
    }
}
