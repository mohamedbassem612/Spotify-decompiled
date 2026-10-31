package p;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import androidx.compose.ui.geometry.Offset;
import com.spotify.player.model.PlayOrigin;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class vd6 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vd6(o811 o811Var, wq50 wq50Var, n811 n811Var, m811 m811Var, m811 m811Var2, m811 m811Var3, m811 m811Var4, xd6 xd6Var, m811 m811Var5) {
        super(1);
        this.a = (byte) 0;
        this.b = o811Var;
        this.c = wq50Var;
        this.d = n811Var;
        this.e = m811Var;
        this.f = m811Var2;
        this.g = m811Var3;
        this.h = m811Var4;
        this.t = xd6Var;
        this.i = m811Var5;
    }

    public final Object invoke(Object obj) {
        io70 io70Var;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.t;
        Object obj3 = this.i;
        Object obj4 = this.h;
        Object obj5 = this.g;
        Object obj6 = this.f;
        Object obj7 = this.e;
        Object obj8 = this.d;
        Object obj9 = this.c;
        Object obj10 = this.b;
        switch (b) {
            case 0:
                long jLongValue = ((Number) obj).longValue();
                m811 m811Var = (m811) obj4;
                m811 m811Var2 = (m811) obj5;
                m811 m811Var3 = (m811) obj6;
                m811 m811Var4 = (m811) obj7;
                m811 m811Var5 = (m811) obj3;
                wq50 wq50Var = (wq50) obj9;
                xd6 xd6Var = (xd6) obj2;
                o811 o811Var = (o811) obj10;
                long j = o811Var.a;
                float f = j == 0 ? 0.016666668f : (jLongValue - j) / 1.0E9f;
                o811Var.a = jLongValue;
                if (wq50Var.c && Math.abs(wq50Var.a) <= Float.MAX_VALUE && Math.abs(wq50Var.b) <= Float.MAX_VALUE) {
                    n811 n811Var = (n811) obj8;
                    int i = n811Var.a;
                    if (i < 3) {
                        int i2 = i + 1;
                        n811Var.a = i2;
                        if (i2 == 3) {
                            m811Var4.a = wq50Var.a;
                            m811Var3.a = wq50Var.b;
                        }
                    } else {
                        float f2 = -f;
                        float fExp = 1.0f - ((float) Math.exp(f2 / 1.5f));
                        float fM = mgo1.m(wq50Var.a, m811Var4.a, fExp);
                        m811Var4.a = wq50Var.a - fM;
                        float fM2 = mgo1.m(wq50Var.b, m811Var3.a, fExp);
                        m811Var3.a = wq50Var.b - fM2;
                        float fExp2 = 1.0f - ((float) Math.exp(f2 / 0.14f));
                        float f3 = m811Var2.a;
                        m811Var2.a = l1d.e(fM / 0.35f, f3, fExp2, f3);
                        float f4 = m811Var.a;
                        m811Var.a = l1d.e(fM2 / 0.35f, f4, fExp2, f4);
                        boolean z = xd6Var.f;
                        drr0 drr0Var = xd6Var.d;
                        drr0 drr0Var2 = xd6Var.c;
                        drr0 drr0Var3 = xd6Var.b;
                        drr0 drr0Var4 = xd6Var.a;
                        if (z) {
                            m811Var5.a = 0.0f;
                            drr0Var4.t(0.0f);
                            drr0Var3.t(0.0f);
                            drr0Var2.t(0.0f);
                            drr0Var.t(0.0f);
                        } else {
                            float fExp3 = 1.0f - ((float) Math.exp(f2 / 0.18f));
                            boolean z2 = xd6Var.e;
                            float f5 = z2 ? 0.0f : 1.0f;
                            float f6 = m811Var5.a;
                            float fE = l1d.e(f5, f6, fExp3, f6);
                            m811Var5.a = fE;
                            if (!z2 || fE >= 0.001f) {
                                drr0Var2.t(m811Var2.a * fE);
                                drr0Var.t(m811Var.a * m811Var5.a);
                                drr0Var4.t((-m811Var.a) * 7.0f * m811Var5.a);
                                drr0Var3.t((-m811Var2.a) * 7.0f * m811Var5.a);
                            } else {
                                m811Var5.a = 0.0f;
                                drr0Var4.t(0.0f);
                                drr0Var3.t(0.0f);
                                drr0Var2.t(0.0f);
                                drr0Var.t(0.0f);
                            }
                        }
                    }
                }
                return rih1Var;
            case 1:
                rtb0 rtb0Var = (rtb0) obj;
                q7r0 q7r0Var = (q7r0) obj9;
                vn6 vn6Var = (vn6) obj10;
                rtb0.c(rtb0Var, (Object) null, new j2i(-1101362784, new k8(q7r0Var, vn6Var, (qfl1) obj8, (ggr) obj7, (byte) 10), true), 3);
                List list = vn6Var.c;
                rtb0Var.e(list.size(), (iu30) null, new qf1(list, (byte) 13), new j2i(2039820996, new pi1(list, (iu30) obj6, (em3) obj5, (gw70) obj4, q7r0Var, (bnr) obj3, (xfx) obj2), true));
                rtb0.c(rtb0Var, (Object) null, w6i.c, 3);
                return rih1Var;
            case 2:
                xpi0 xpi0Var = (xpi0) obj6;
                jwm jwmVar = (jwm) obj5;
                rtb0 rtb0Var2 = (rtb0) obj;
                ven0 ven0Var = (ven0) obj3;
                ven0 ven0Var2 = (ven0) obj4;
                abf abfVar = (abf) obj7;
                zks0 zks0Var = (zks0) obj10;
                ven0 ven0Var3 = (ven0) obj9;
                c380 c380Var = (c380) ven0Var3.getValue();
                ArrayList arrayList = new ArrayList();
                for (Object obj11 : c380Var) {
                    if (!u890.j(((jwm) obj11).c, dwm.a)) {
                        arrayList.add(obj11);
                    }
                }
                if (!zks0Var.g() && !zks0Var.b()) {
                    rtb0.c(rtb0Var2, (Object) null, new j2i(-683833119, new nzd((wm1) obj8, abfVar, arrayList, (byte) 2), true), 3);
                }
                rtb0Var2.e(arrayList.size(), new ry4(arrayList, (byte) 4), new ry4(arrayList, (byte) 5), new j2i(2039820996, new a87(arrayList, xpi0Var, abfVar, jwmVar, ven0Var3, (byte) 1), true));
                if (!((c380) ven0Var2.getValue()).isEmpty() || !((c380) ven0Var.getValue()).isEmpty()) {
                    rtb0.c(rtb0Var2, (Object) null, xbi.c, 3);
                }
                c380 c380Var2 = (c380) ven0Var.getValue();
                rtb0Var2.e(c380Var2.size(), new nt(c380Var2, (byte) 2), new nt(c380Var2, (byte) 3), new j2i(2039820996, new cbf(c380Var2, xpi0Var, abfVar, jwmVar, ven0Var, ven0Var3, (byte) 0), true));
                c380 c380Var3 = (c380) ven0Var2.getValue();
                rtb0Var2.e(c380Var3.size(), new nt(c380Var3, (byte) 4), new nt(c380Var3, (byte) 5), new j2i(2039820996, new oi1(c380Var3, (b921) obj2, abfVar, jwmVar, (byte) 3), true));
                return rih1Var;
            case 3:
                List list2 = (List) obj;
                return ((fv30) obj10).K(((l4r) obj9).e.invoke(list2.get(0)), ((l4r) obj8).e.invoke(list2.get(1)), ((l4r) obj7).e.invoke(list2.get(2)), ((l4r) obj6).e.invoke(list2.get(3)), ((l4r) obj5).e.invoke(list2.get(4)), ((l4r) obj4).e.invoke(list2.get(5)), ((l4r) obj3).e.invoke(list2.get(6)), ((l4r) obj2).e.invoke(list2.get(7)));
            case 4:
                jo70 jo70Var = (jo70) obj9;
                return ((dto) obj).a((zf30) obj10, ((zf30) obj10).o(), (String) obj8, (p6r0) obj7, (lik1) obj6, (String) obj5, (PlayOrigin) obj4, (d0r) obj3, (jo70Var == null || (io70Var = jo70Var.e) == null) ? null : io70Var.b, (ozc0) obj2);
            case 5:
                oud oudVar = (oud) obj;
                d0r d0rVarA = szq.a();
                it30 it30Var = new it30((lb) obj10);
                wh71 wh71Var = (wh71) obj8;
                q8n q8nVar = (q8n) obj5;
                return new bu30(new f70((byte) 8), new uq7(oudVar, wh71Var, q8nVar, new l0r(d0rVarA, new ft30(1, it30Var, it30.class, "create", "create(Lcom/spotify/share/formats/funcollectible/impl/FunCollectibleShareCardElement$Props;)Lcom/spotify/kodiak/dataloader/statement/DataStatement;", 0, (byte) 0), gq30.Q0, q8nVar, new gt30(new bn3((Context) obj4), new ConcurrentHashMap(), new kba(new z2h((xrc0) obj3, (uu00) obj2), (byte) 19), (lnm) null), gq30.R0, gq30.S0), new lt30(new vxv0((bhf) obj9, wh71Var, (gqg) obj7, (aru0) obj6), new h3x(oudVar), q8nVar)), it30Var);
            case 6:
                sx70 sx70Var = (sx70) obj;
                ven0 ven0Var4 = (ven0) obj5;
                gx70 gx70Var = (gx70) obj10;
                boolean zEquals = sx70Var.equals(mx70.a);
                b7x b7xVar = b7x.a;
                if (zEquals) {
                    i8h1 i8h1Var = gx70Var.a;
                    ksk0 ksk0Var = gx70Var.b;
                    ksk0Var.getClass();
                    x6h1 x6h1VarC = ksk0Var.c.c();
                    x6h1VarC.i.add(new a7h1("close_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC.j = false;
                    i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC.a(), ksk0Var.b, System.currentTimeMillis()), (xj61) null);
                    ppo1.q((cir0) obj9);
                    return rih1Var;
                }
                if (sx70Var.equals(qx70.a)) {
                    i8h1 i8h1Var2 = gx70Var.a;
                    ksk0 ksk0Var2 = gx70Var.b;
                    ksk0Var2.getClass();
                    x6h1 x6h1VarC2 = ksk0Var2.c.c();
                    x6h1VarC2.i.add(new a7h1("retake_photo_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC2.j = false;
                    i8h1Var2.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC2.a(), ksk0Var2.b, System.currentTimeMillis()), (xj61) null);
                    ((ven0) obj7).setValue((Object) null);
                    Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
                    intent.putExtra("output", (Uri) ((ven0) obj6).getValue());
                    ((ihg0) obj8).a(intent);
                    return rih1Var;
                }
                if (!(sx70Var instanceof rx70)) {
                    if (sx70Var.equals(nx70.a)) {
                        return rih1Var;
                    }
                    if (sx70Var.equals(ox70.a)) {
                        return rih1Var;
                    }
                    if (sx70Var.equals(px70.a)) {
                        return rih1Var;
                    }
                    eg.o();
                    return null;
                }
                if (((Boolean) ven0Var4.getValue()).booleanValue()) {
                    return rih1Var;
                }
                ven0Var4.setValue(Boolean.TRUE);
                i8h1 i8h1Var3 = gx70Var.a;
                ksk0 ksk0Var3 = gx70Var.b;
                ksk0Var3.getClass();
                x6h1 x6h1VarC3 = ksk0Var3.c.c();
                x6h1VarC3.i.add(new a7h1("use_photo_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC3.j = false;
                i8h1Var3.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC3.a(), ksk0Var3.b, System.currentTimeMillis()), (xj61) null);
                Uri uri = (Uri) ((ven0) obj4).getValue();
                if (uri == null) {
                    return rih1Var;
                }
                fn31.T((c9n) obj3, (o8n) null, 0, new rzu((wmy) obj2, uri, sx70Var, (cir0) obj9, (lnm) null, (byte) 21), 3);
                return rih1Var;
            case 7:
                rtb0 rtb0Var3 = (rtb0) obj;
                uvx uvxVar = (uvx) obj9;
                rtb0.c(rtb0Var3, (Object) null, new j2i(9637188, new k2d0(uvxVar, (byte) 2), true), 3);
                List list3 = (List) obj10;
                rtb0Var3.e(list3.size(), (iu30) null, new xg50(list3, (byte) 20), new j2i(802480018, new j3d0(list3, (qxc0) obj8, (c9n) obj7, (String) obj6, (Function0) obj5, (zsu0) obj4, (r3d0) obj3, (tob1) obj2, uvxVar), true));
                return rih1Var;
            case 8:
                mey0 mey0Var = (mey0) obj;
                Object objE = ((ymd0) obj10).e();
                objE.getClass();
                uei0 uei0Var = (uei0) obj9;
                t810 t810Var = new t810((ioj0) objE, (zkm) null, (hwt) null, (ijo) null, uei0Var.a, ((yy4) obj8).g(), uei0Var.c, uei0Var.d, false, uei0Var.e, uei0Var.g, uei0Var.h, (y2u0) null, (sq51) null, uei0Var.k, uei0Var.l, uei0Var.m, 84750);
                yxb0 yxb0Var = (yxb0) obj7;
                vu30 vu30Var = (vu30) yxb0Var.e;
                return iqo1.v(mey0Var, t810Var, (fza) obj6, (hvp0) obj5, (yqg) obj4, (ytp0) obj3, (fiv0) obj2, new yei0(yxb0Var, mey0Var, (byte) 0), vu30Var != null ? new eei0(vu30Var, mey0Var, (byte) 4) : null, false, (iix0) null, (Resources) null, 1792);
            case 9:
                long j2 = ((Offset) obj).a;
                ((ven0) obj7).setValue(Boolean.TRUE);
                ((ven0) obj6).setValue(Long.valueOf(((kzt) obj10).a.b()));
                tob1 tob1Var = (tob1) obj4;
                int iIntValue = (int) (((Number) tob1Var.getValue()).intValue() * (Float.intBitsToFloat((int) (((hav0) o7h.q0(((i8d1) obj9).e.T0.a)).c & 4294967295L)) / ((Number) ((tob1) obj5).getValue()).intValue()));
                ((ven0) obj3).setValue(Float.valueOf(0.0f));
                fn31.T((c9n) obj8, (o8n) null, 0, new ct40((xtb0) obj2, iIntValue, tob1Var, (lnm) null), 3);
                return rih1Var;
            default:
                oud oudVar2 = (oud) obj;
                wh71 wh71Var2 = (wh71) obj10;
                q8n q8nVar2 = (q8n) obj2;
                return new e27(new f70((byte) 18), new t9y0(oudVar2, q8nVar2, new ygj1(new yeu0(wh71Var2, (gqg) obj9, (byte) 15), new laz(wh71Var2, (byte) 8), new wmy((wh41) obj8, (ptf1) obj7, (vr51) obj6, (u271) obj5, (Context) obj4, (ol71) obj3), new zb91(oudVar2, (byte) 23), q8nVar2)), (byte) 0);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vd6(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, byte b) {
        super(1);
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
        this.g = obj6;
        this.h = obj7;
        this.i = obj8;
        this.t = obj9;
    }
}
