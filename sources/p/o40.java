package p;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.geometry.Offset;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class o40 extends hab0 implements xu30 {
    public static final o40 N0;
    public static final o40 O0;
    public static final o40 P0;
    public static final o40 Q0;
    public static final o40 R0;
    public static final o40 S0;
    public static final o40 T0;
    public static final o40 U0;
    public static final o40 V0;
    public static final o40 W0;
    public static final o40 X;
    public static final o40 X0;
    public static final o40 Y;
    public static final o40 Y0;
    public static final o40 Z;
    public static final o40 Z0;
    public static final o40 a1;
    public static final o40 b;
    public static final o40 b1;
    public static final o40 c;
    public static final o40 c1;
    public static final o40 d;
    public static final o40 d1;
    public static final o40 e;
    public static final o40 e1;
    public static final o40 f;
    public static final o40 g;
    public static final o40 h;
    public static final o40 i;
    public static final o40 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 3;
        b = new o40(i2, (byte) 0);
        c = new o40(i2, (byte) 1);
        d = new o40(i2, (byte) 2);
        e = new o40(i2, (byte) 3);
        f = new o40(i2, (byte) 4);
        g = new o40(i2, (byte) 5);
        h = new o40(i2, (byte) 6);
        i = new o40(i2, (byte) 7);
        t = new o40(i2, (byte) 8);
        X = new o40(i2, (byte) 9);
        Y = new o40(i2, (byte) 10);
        Z = new o40(i2, (byte) 11);
        N0 = new o40(i2, (byte) 12);
        O0 = new o40(i2, (byte) 13);
        P0 = new o40(i2, (byte) 14);
        Q0 = new o40(i2, (byte) 15);
        R0 = new o40(i2, (byte) 16);
        S0 = new o40(i2, (byte) 17);
        T0 = new o40(i2, (byte) 18);
        U0 = new o40(i2, (byte) 19);
        V0 = new o40(i2, (byte) 20);
        W0 = new o40(i2, (byte) 21);
        X0 = new o40(i2, (byte) 22);
        Y0 = new o40(i2, (byte) 23);
        Z0 = new o40(i2, (byte) 24);
        a1 = new o40(i2, (byte) 25);
        b1 = new o40(i2, (byte) 26);
        c1 = new o40(i2, (byte) 27);
        d1 = new o40(i2, (byte) 28);
        e1 = new o40(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o40(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        pp70 pp70Var;
        mq70 mq70Var;
        byte b2 = this.a;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                tqw tqwVar = (tqw) obj3;
                ((q40) obj2).a.b().invoke(tqwVar != null ? n3o1.y(tqwVar) : null);
                return rih1Var;
            case 1:
                ab0 ab0Var = (ab0) obj;
                if (((za0) obj2).equals(za0.a)) {
                    ab0Var.e.invoke();
                    return rih1Var;
                }
                eg.o();
                return null;
            case 2:
                if (obj2 == null) {
                    return rih1Var;
                }
                bhn0.d();
                return null;
            case 3:
                ((Number) obj3).intValue();
                x340 x340Var = (b0k) obj2;
                x340Var.i0(-27901990);
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var).b;
                uvx uvxVarA = uvx.a((uvx) obj, (pgx) null, 0, (vzq0) null, uyn1.h(2, 4.0f, 0.0f), (tvx) null, (p3v) null, 495);
                x340Var.r(false);
                return uvxVarA;
            case 4:
                long j = ((Offset) obj2).a;
                long j2 = ((u7h) obj3).a;
                return rih1Var;
            case 5:
                hsl1 hsl1Var = (hsl1) obj2;
                uc80 uc80Var = (uc80) obj3;
                ((View) obj).setPadding(uc80Var.a, uc80Var.b, uc80Var.c, uc80Var.d + hsl1Var.a.i(519).d);
                return hsl1Var;
            case 6:
                vnb1 vnb1Var = (vnb1) obj3;
                return new ym1((qxc0) obj, (qp31) obj2, vnb1Var != null ? vnb1Var.a : false);
            case 7:
                hsl1 hsl1Var2 = (hsl1) obj2;
                uc80 uc80Var2 = (uc80) obj3;
                ((View) obj).setPadding(uc80Var2.a, uc80Var2.b, uc80Var2.c, uc80Var2.d + hsl1Var2.a.i(519).d);
                return hsl1Var2;
            case 8:
                return xyn1.r(7, (r6h1) obj3);
            case 9:
                int iIntValue = ((Number) obj).intValue();
                String str = (String) obj2;
                r6h1 r6h1Var = (r6h1) obj3;
                if (r6h1Var == null) {
                    r6h1Var = r6h1.c;
                }
                return new nyk0(Integer.valueOf(iIntValue), str, r6h1Var);
            case 10:
                View view = (View) obj;
                hsl1 hsl1Var3 = (hsl1) obj2;
                rzf0 rzf0VarB = szf0.b(view);
                int iD = rzf0VarB != null ? rzf0VarB.a().d(z1a1.b(view.getContext())) : hsl1Var3.a.i(519).d;
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams == null) {
                    bhn0.i("null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
                    return null;
                }
                h3n h3nVar = (h3n) layoutParams;
                ((ViewGroup.MarginLayoutParams) h3nVar).bottomMargin = iD;
                view.setLayoutParams(h3nVar);
                return hsl1Var3;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                View view2 = (View) obj;
                hsl1 hsl1Var4 = (hsl1) obj2;
                view2.setPadding(view2.getPaddingLeft(), view2.getPaddingTop(), view2.getPaddingRight(), ((uc80) obj3).d + hsl1Var4.a.i(519).d);
                return hsl1Var4;
            case grn1.d /* 12 */:
                return new fd6((jo70) obj, (jo70) obj2, (List) obj3);
            case 13:
                return new sxg((jo70) obj, (z6a1) obj2, (List) obj3);
            case 14:
                ((Number) obj2).intValue();
                return rih1Var;
            case 15:
                ((Number) obj2).intValue();
                return rih1Var;
            case 16:
                String str2 = (String) obj;
                String str3 = (String) obj2;
                boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                if (str2 == null) {
                    return null;
                }
                xkg0 xkg0Var = new xkg0();
                xkg0Var.put("type", str2);
                if (str3 != null) {
                    xkg0Var.put("streaming-rules", str3);
                }
                xkg0 xkg0VarB = xkg0Var.b();
                return new uje1(y7y0.G(xkg0VarB), y7y0.L(xkg0VarB), zBooleanValue);
            case 17:
                ((hx6) obj).g.invoke(((bx6) obj2).a, (tqw) obj3);
                return rih1Var;
            case 18:
                ((ix6) obj).f.invoke(((cx6) obj2).a, (tqw) obj3);
                return rih1Var;
            case 19:
                int iIntValue2 = ((Number) obj).intValue();
                String str4 = (String) obj2;
                r6h1 r6h1Var2 = (r6h1) obj3;
                if (r6h1Var2 == null) {
                    r6h1Var2 = r6h1.c;
                }
                return new nyk0(Integer.valueOf(iIntValue2), str4, r6h1Var2);
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                c27 c27Var = (c27) obj;
                z17 z17Var = (b27) obj2;
                if (z17Var instanceof z17) {
                    z17 z17Var2 = z17Var;
                    c27Var.d.invoke(z17Var2.a, Integer.valueOf(z17Var2.b));
                } else if (z17Var instanceof y17) {
                    c27Var.e.invoke(Integer.valueOf(((y17) z17Var).a));
                } else if (z17Var.equals(a27.a)) {
                    c27Var.f.invoke();
                } else {
                    if (!z17Var.equals(x17.a)) {
                        eg.o();
                        return null;
                    }
                    c27Var.g.invoke();
                }
                return rih1Var;
            case 21:
                qim0 qim0VarQ = (qim0) obj;
                ((Number) obj3).intValue();
                x340 x340Var2 = (b0k) obj2;
                x340Var2.i0(1717616091);
                if (upo1.z(x340Var2)) {
                    x340Var2.i0(-739363399);
                } else {
                    x340Var2.i0(-739341885);
                    uwr uwrVar2 = cbx.a;
                    cua cuaVar = cbx.b(x340Var2).f;
                    qim0VarQ = i1p1.q(qim0VarQ, er31.b(8.0f));
                }
                x340Var2.r(false);
                x340Var2.r(false);
                return qim0VarQ;
            case 22:
                hsl1 hsl1Var5 = (hsl1) obj2;
                uc80 uc80Var3 = (uc80) obj3;
                ((View) obj).setPadding(uc80Var3.a, uc80Var3.b, uc80Var3.c, uc80Var3.d + hsl1Var5.a.i(527).d);
                return hsl1Var5;
            case 23:
                jo70 jo70Var = (jo70) obj;
                xkk1 xkk1Var = (xkk1) obj2;
                hll hllVar = (hll) obj3;
                if (xkk1Var == null) {
                    xkk1Var = new xkk1((mq70) null, (mq70) null, (mq70) null, 63);
                }
                return new js7(hllVar, jo70Var, xkk1Var);
            case 24:
                int iIntValue3 = ((Number) obj).intValue();
                String str5 = (String) obj2;
                r6h1 r6h1Var3 = (r6h1) obj3;
                if (r6h1Var3 == null) {
                    r6h1Var3 = r6h1.c;
                }
                return new nyk0(Integer.valueOf(iIntValue3), str5, r6h1Var3);
            case 25:
                hsl1 hsl1Var6 = (hsl1) obj2;
                uc80 uc80Var4 = (uc80) obj3;
                ((View) obj).setPadding(uc80Var4.a, uc80Var4.b, uc80Var4.c, uc80Var4.d + hsl1Var6.a.i(519).d);
                return hsl1Var6;
            case 26:
                return new tv8((String) obj2, (String) obj3, (qxc0) obj);
            case 27:
                iw7 iw7Var = (iw7) obj;
                bo9 bo9Var = (bo9) obj2;
                xkk1 xkk1Var2 = (xkk1) obj3;
                if (xkk1Var2 == null || (pp70Var = xkk1Var2.d) == null) {
                    pp70Var = (xkk1Var2 == null || (mq70Var = xkk1Var2.a) == null) ? null : mq70Var.b;
                }
                u7h u7hVar = pp70Var != null ? new u7h(u7h.b(pp70Var.a.a.c, 0.7f, 0.0f, 0.0f, 0.0f, 14)) : null;
                String str6 = iw7Var.a;
                return new en9(ihc1.y0(str6) ? null : "spotify-video://".concat(str6), bo9Var.a, u7hVar);
            case 28:
                ((Number) obj3).intValue();
                x340 x340Var3 = (b0k) obj2;
                x340Var3.i0(1465710393);
                WeakHashMap weakHashMap = osl1.x;
                qim0 qim0VarY = too1.y((qim0) obj, new bgc0(lhc.g(x340Var3).g, 16));
                x340Var3.r(false);
                return qim0VarY;
            default:
                return new y9s0((i3i0) obj, (xcu0) obj2, (n900) obj3);
        }
    }
}
