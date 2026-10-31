package p;

import android.view.View;
import com.spotify.scrollsita.v1.Section;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class xi81 extends hab0 implements xu30 {
    public static final xi81 N0;
    public static final xi81 O0;
    public static final xi81 P0;
    public static final xi81 Q0;
    public static final xi81 R0;
    public static final xi81 S0;
    public static final xi81 T0;
    public static final xi81 U0;
    public static final xi81 V0;
    public static final xi81 W0;
    public static final xi81 X;
    public static final xi81 X0;
    public static final xi81 Y;
    public static final xi81 Y0;
    public static final xi81 Z;
    public static final xi81 Z0;
    public static final xi81 a1;
    public static final xi81 b;
    public static final xi81 b1;
    public static final xi81 c;
    public static final xi81 c1;
    public static final xi81 d;
    public static final xi81 d1;
    public static final xi81 e;
    public static final xi81 e1;
    public static final xi81 f;
    public static final xi81 g;
    public static final xi81 h;
    public static final xi81 i;
    public static final xi81 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 3;
        b = new xi81(i2, (byte) 0);
        c = new xi81(i2, (byte) 1);
        d = new xi81(i2, (byte) 2);
        e = new xi81(i2, (byte) 3);
        f = new xi81(i2, (byte) 4);
        g = new xi81(i2, (byte) 5);
        h = new xi81(i2, (byte) 6);
        i = new xi81(i2, (byte) 7);
        t = new xi81(i2, (byte) 8);
        X = new xi81(i2, (byte) 9);
        Y = new xi81(i2, (byte) 10);
        Z = new xi81(i2, (byte) 11);
        N0 = new xi81(i2, (byte) 12);
        O0 = new xi81(i2, (byte) 13);
        P0 = new xi81(i2, (byte) 14);
        Q0 = new xi81(i2, (byte) 15);
        R0 = new xi81(i2, (byte) 16);
        S0 = new xi81(i2, (byte) 17);
        T0 = new xi81(i2, (byte) 18);
        U0 = new xi81(i2, (byte) 19);
        V0 = new xi81(i2, (byte) 20);
        W0 = new xi81(i2, (byte) 21);
        X0 = new xi81(i2, (byte) 22);
        Y0 = new xi81(i2, (byte) 23);
        Z0 = new xi81(i2, (byte) 24);
        a1 = new xi81(i2, (byte) 25);
        b1 = new xi81(i2, (byte) 26);
        c1 = new xi81(i2, (byte) 27);
        d1 = new xi81(i2, (byte) 28);
        e1 = new xi81(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xi81(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        mq70 mq70Var;
        up70 up70VarA;
        tv80 tv80Var;
        List list;
        List list2;
        byte b2 = this.a;
        rih1 rih1Var = rih1.a;
        tv80 tv80Var2 = null;
        switch (b2) {
            case 0:
                ((Number) obj3).intValue();
                x340 x340Var = (b0k) obj2;
                x340Var.i0(776143756);
                uvx uvxVarB = uvx.b((uvx) obj, 5, (tvx) null, (p3v) null, 27);
                x340Var.r(false);
                return uvxVarB;
            case 1:
                uvx uvxVar = (uvx) obj;
                ((Number) obj3).intValue();
                x340 x340Var2 = (b0k) obj2;
                x340Var2.i0(-752650058);
                zzq0 zzq0VarP = gto1.p(uvxVar.a, x340Var2, uvxVar.c);
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var2).b;
                uvx uvxVarA = uvx.a(uvxVar, (pgx) null, 0, nmn1.m(zzq0VarP, (p3v) null, (p3v) null, new p3v(4.0f), (p3v) null, 11), nmn1.m(uvxVar.e, (p3v) null, (p3v) null, new p3v(0.0f), (p3v) null, 11), (tvx) null, (p3v) null, 487);
                x340Var2.r(false);
                return uvxVarA;
            case 2:
                return rih1Var;
            case 3:
                hsl1 hsl1Var = (hsl1) obj2;
                uc80 uc80Var = (uc80) obj3;
                ((View) obj).setPadding(uc80Var.a, uc80Var.b, uc80Var.c, uc80Var.d + hsl1Var.a.i(519).d);
                return hsl1Var;
            case 4:
                return new p7a1((jo70) obj, (xkk1) obj2, (f7a1) obj3);
            case 5:
                jo70 jo70Var = (jo70) obj;
                hll hllVar = (hll) obj2;
                xkk1 xkk1Var = (xkk1) obj3;
                String str = jo70Var.a;
                List list3 = jo70Var.d;
                ArrayList arrayList = new ArrayList(q7h.U(list3, 10));
                Iterator it = list3.iterator();
                while (it.hasNext()) {
                    arrayList.add(((ho70) it.next()).a);
                }
                c380 c380VarA = mqo1.A(arrayList);
                int iP = (hllVar == null || (list = hllVar.b) == null) ? 0 : qxd0.P(list);
                if (xkk1Var != null && (mq70Var = xkk1Var.a) != null && (up70VarA = mq70Var.a(vp70.c)) != null && (tv80Var = up70VarA.a.a) != null && !ihc1.y0(tv80Var)) {
                    tv80Var2 = tv80Var;
                }
                return new cea1(iP, str, tv80Var2, c380VarA);
            case 6:
                hsl1 hsl1Var2 = (hsl1) obj2;
                uc80 uc80Var2 = (uc80) obj3;
                ((View) obj).setPadding(uc80Var2.a, uc80Var2.b, uc80Var2.c, uc80Var2.d + hsl1Var2.a.i(519).d);
                return hsl1Var2;
            case 7:
                jo70 jo70Var2 = (jo70) obj;
                mtl mtlVar = (mtl) obj2;
                Boolean bool = (Boolean) obj3;
                List<ho70> list4 = jo70Var2.d;
                ArrayList arrayList2 = new ArrayList();
                for (ho70 ho70Var : list4) {
                    String str2 = ho70Var.a;
                    if (ihc1.y0(str2)) {
                        str2 = null;
                    }
                    qpc1 qpc1Var = str2 != null ? new qpc1(str2, ho70Var.b, (d13) null) : null;
                    if (qpc1Var != null) {
                        arrayList2.add(qpc1Var);
                    }
                }
                return new yeb1(arrayList2, rqt0.C(mtlVar, bool) ? rqt0.H(jo70Var2) : "");
            case 8:
                return new zfb1((Boolean) obj2, (qfd) obj, (uw9) obj3);
            case 9:
                List list5 = (List) obj;
                lv4 lv4Var = (lv4) obj2;
                String str3 = (String) obj3;
                jd11 jd11Var = rc11.a;
                return sqg0.J(new mmr0[]{new mmr0(if51.a, new yhc1(jd11Var.b(qwo0.class), new nec0(list5, (byte) 28))), new mmr0(if51.X0, new xhc1(jd11Var.b(two0.class), aic1.Z)), new mmr0(if51.b, new xhc1(jd11Var.b(uwo0.class), aic1.T0)), new mmr0(if51.c, new yhc1(jd11Var.b(dyo0.class), new bic1(list5, (byte) 4))), new mmr0(if51.d, new xhc1(jd11Var.b(vwo0.class), aic1.U0)), new mmr0(if51.e, new yhc1(jd11Var.b(mxo0.class), new bic1(list5, (byte) 5))), new mmr0(if51.e1, new xhc1(jd11Var.b(nxo0.class), aic1.V0)), new mmr0(if51.f, new xhc1(jd11Var.b(oxo0.class), aic1.W0)), new mmr0(if51.g, new yhc1(jd11Var.b(zxo0.class), new bic1(list5, (byte) 6))), new mmr0(if51.h, new xhc1(jd11Var.b(wwo0.class), axb1.d1)), new mmr0(if51.i, new xhc1(jd11Var.b(yxo0.class), axb1.e1)), new mmr0(if51.t, new xhc1(jd11Var.b(bxo0.class), aic1.b)), new mmr0(if51.X, lv4Var.e() ? new xhc1(jd11Var.b(rxo0.class), aic1.c) : new yhc1(jd11Var.b(qxo0.class), new nec0(list5, (byte) 26))), new mmr0(if51.Y, new xhc1(jd11Var.b(txo0.class), aic1.d)), new mmr0(if51.N0, lv4Var.j() ? new xhc1(jd11Var.b(cyo0.class), aic1.e) : new yhc1(jd11Var.b(cyo0.class), new nec0(list5, (byte) 27))), new mmr0(if51.O0, new xhc1(jd11Var.b(kxo0.class), aic1.f)), new mmr0(if51.P0, new xhc1(jd11Var.b(axo0.class), aic1.g)), new mmr0(if51.S0, new yhc1(jd11Var.b(rwo0.class), new nec0(list5, (byte) 29))), new mmr0(if51.T0, lv4Var.g() ? new xhc1(jd11Var.b(vxo0.class), aic1.h) : new yhc1(jd11Var.b(uxo0.class), new bic1(list5, (byte) 0))), new mmr0(if51.U0, new yhc1(jd11Var.b(sxo0.class), new bic1(list5, (byte) 1))), new mmr0(if51.V0, lv4Var.f() ? new yhc1(jd11Var.b(gxo0.class), new bic1(list5, (byte) 2)) : new yhc1(jd11Var.b(dxo0.class), new bic1(list5, (byte) 3))), new mmr0(if51.W0, new xhc1(jd11Var.b(xxo0.class), aic1.i)), new mmr0(if51.Y0, new xhc1(jd11Var.b(wxo0.class), aic1.t)), new mmr0(if51.Z0, new xhc1(jd11Var.b(ayo0.class), aic1.X)), new mmr0(if51.a1, new xhc1(jd11Var.b(pxo0.class), aic1.Y)), new mmr0(if51.c1, new xhc1(jd11Var.b(xwo0.class), aic1.N0)), new mmr0(if51.d1, new xhc1(jd11Var.b(swo0.class), new hqa1(str3, (byte) 6))), new mmr0(if51.f1, new xhc1(jd11Var.b(zwo0.class), aic1.O0)), new mmr0(if51.g1, new xhc1(jd11Var.b(byo0.class), aic1.P0)), new mmr0(if51.i1, new xhc1(jd11Var.b(jxo0.class), new ccb1((Object) lv4Var, (Object) str3, (byte) 15))), new mmr0(if51.h1, new xhc1(jd11Var.b(ywo0.class), new l5b1(lv4Var, (byte) 23))), new mmr0(if51.k1, new xhc1(jd11Var.b(lxo0.class), aic1.Q0)), new mmr0(if51.l1, new xhc1(jd11Var.b(pwo0.class), aic1.R0)), new mmr0(if51.m1, new xhc1(jd11Var.b(cxo0.class), aic1.S0))});
            case 10:
                ((htc1) obj).h.invoke(((ftc1) obj2).a, (tqw) obj3);
                return rih1Var;
            case 11:
                ((mtc1) obj).c.invoke(((ltc1) obj2).a);
                return rih1Var;
            case 12:
                iuc1 iuc1Var = (iuc1) obj;
                if (((huc1) obj2).equals(huc1.a)) {
                    iuc1Var.d.invoke(iuc1Var.a);
                    return rih1Var;
                }
                eg.o();
                return null;
            case 13:
                tuc1 tuc1Var = (tuc1) obj;
                suc1 suc1Var = (suc1) obj2;
                if (suc1Var.equals(quc1.a)) {
                    tuc1Var.c.invoke();
                    return rih1Var;
                }
                if (suc1Var.equals(ruc1.a)) {
                    tuc1Var.d.invoke();
                    return rih1Var;
                }
                eg.o();
                return null;
            case 14:
                View view = (View) obj;
                hsl1 hsl1Var3 = (hsl1) obj2;
                view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), ((uc80) obj3).d + hsl1Var3.a.i(519).d);
                return hsl1Var3;
            case 15:
                hvc1 hvc1Var = (hvc1) obj;
                if (((gvc1) obj2).equals(gvc1.a)) {
                    hvc1Var.c.invoke();
                    return rih1Var;
                }
                eg.o();
                return null;
            case 16:
                ((ywc1) obj).c.invoke(((xwc1) obj2).c);
                return rih1Var;
            case 17:
                ((Boolean) obj2).getClass();
                return Boolean.TRUE;
            case 18:
                ((Boolean) obj2).getClass();
                return Boolean.TRUE;
            case 19:
                ((Boolean) obj2).getClass();
                return Boolean.TRUE;
            case 20:
                ((Boolean) obj2).getClass();
                return Boolean.TRUE;
            case 21:
                ((Boolean) obj2).getClass();
                return Boolean.TRUE;
            case 22:
                ((Number) obj3).intValue();
                return new ltl0((mtl0) obj);
            case 23:
                jo70 jo70Var3 = (jo70) obj;
                xkk1 xkk1Var2 = (xkk1) obj2;
                ro7 ro7Var = (ro7) obj3;
                if (ro7Var != null) {
                    float f2 = (float) ro7Var.a;
                    tv80 tv80VarValueOf = Float.valueOf(f2);
                    if (f2 > 0.0f) {
                        tv80Var2 = tv80VarValueOf;
                    }
                }
                return new zcd1(jo70Var3, xkk1Var2, tv80Var2);
            case 24:
                View view2 = (View) obj;
                hsl1 hsl1Var4 = (hsl1) obj2;
                view2.setPadding(view2.getPaddingLeft(), view2.getPaddingTop(), view2.getPaddingRight(), ((uc80) obj3).d + hsl1Var4.a.i(519).d);
                return hsl1Var4;
            case 25:
                jo70 jo70Var4 = (jo70) obj;
                xkk1 xkk1Var3 = (xkk1) obj2;
                hll hllVar2 = (hll) obj3;
                if (xkk1Var3 == null) {
                    xkk1Var3 = new xkk1((mq70) null, (mq70) null, (mq70) null, 63);
                }
                return new t1e1(jo70Var4, xkk1Var3, (hllVar2 == null || (list2 = hllVar2.d) == null || !list2.contains(fll.c)) ? false : true);
            case 26:
                mtl0 mtl0Var = (mtl0) obj;
                ((Number) obj3).intValue();
                return mtl0Var;
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                mtl0 mtl0Var2 = (mtl0) obj;
                ((Number) obj3).intValue();
                return mtl0Var2;
            case 28:
                ((qie1) obj).g.invoke();
                return rih1Var;
            default:
                zie1 zie1Var = (zie1) obj;
                tqw tqwVar = (tqw) obj3;
                if (((yie1) obj2) == yie1.d) {
                    zie1Var.e.invoke(zie1Var.b, tqwVar != null ? n3o1.y(tqwVar) : null);
                } else {
                    zie1Var.d.invoke();
                }
                return rih1Var;
        }
    }
}
