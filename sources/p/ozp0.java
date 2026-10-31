package p;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.view.View;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.tome.pageactivity.PageActivity;
import java.net.Proxy;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ozp0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ozp0(Object obj, Object obj2, byte b) {
        super(1);
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public final Object invoke(Object obj) {
        String strValueOf;
        k370 k370Var;
        zf11 zf11Var;
        xar0 xar0Var;
        byte b = this.a;
        shq0 shq0VarB = null;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                sp21 sp21Var = (sp21) obj;
                sp21Var.g = Long.valueOf(((szp0) obj3).b.b());
                bjy0 bjy0Var = (bjy0) obj2;
                if (bjy0Var != null) {
                    sp21Var.d = bjy0Var.a;
                }
                return rih1Var;
            case 1:
                sp21 sp21Var2 = (sp21) obj;
                sp21Var2.f = Long.valueOf(((szp0) obj3).b.b());
                sp21Var2.q = ((Proxy) obj2).type() != Proxy.Type.DIRECT;
                sp21Var2.r = false;
                sp21Var2.t = 2;
                return rih1Var;
            case 2:
                mxc mxcVar = (mxc) obj;
                szp0 szp0Var = (szp0) obj3;
                if (mxcVar.i != null) {
                    mxcVar.i = null;
                    mxcVar.c = false;
                    mxcVar.f = null;
                    mxcVar.a(szp0Var.b.b(), gtv0.k(), ((jf01) obj2).b.a.i);
                }
                return rih1Var;
            case 3:
                long jLongValue = ((Number) obj).longValue();
                vzp0 vzp0Var = (vzp0) obj3;
                long jB = vzp0Var.b.b();
                v4g1 v4g1Var = vzp0Var.a;
                i4g1 i4g1Var = (i4g1) obj2;
                v4g1Var.c(i4g1Var, new ps(jB, vzp0Var, (byte) 18));
                v4g1Var.a(i4g1Var, new qna((byte) 10, jB, jLongValue));
                return rih1Var;
            case 4:
                return fae1.l((gxc) obj, (ln21) obj3, (ry21) obj2);
            case 5:
                mxc mxcVar2 = (mxc) obj;
                vzp0 vzp0Var2 = (vzp0) obj2;
                ry21 ry21Var = (ry21) obj3;
                String strC = ry21Var.f.c("Location");
                if (strC == null) {
                    strC = null;
                }
                if (strC != null) {
                    l370 l370Var = ry21Var.a.a;
                    l370Var.getClass();
                    try {
                        k370Var = new k370();
                        k370Var.f(l370Var, strC);
                    } catch (IllegalArgumentException unused) {
                        k370Var = null;
                    }
                    strValueOf = String.valueOf(k370Var != null ? k370Var.b() : null);
                    break;
                } else {
                    strValueOf = "";
                }
                mxcVar2.a(vzp0Var2.b.b(), gtv0.k(), strValueOf);
                mxcVar2.b++;
                return rih1Var;
            case 6:
                sp21 sp21Var3 = (sp21) obj;
                ry21 ry21Var2 = (ry21) obj2;
                sp21Var3.l = Long.valueOf(((wzp0) obj3).b.b());
                sp21Var3.u = gtv0.k();
                if (sp21Var3.d == null) {
                    sp21Var3.d = ry21Var2.b.a;
                }
                if (sp21Var3.e == null) {
                    sp21Var3.e = Integer.valueOf(ry21Var2.d);
                }
                return rih1Var;
            case 7:
                o8q0 o8q0Var = (p8q0) obj2;
                iu30 iu30Var = (iu30) obj3;
                if (((Boolean) obj).booleanValue()) {
                    iu30Var.invoke(new q8q0(o8q0Var.a));
                } else {
                    iu30Var.invoke(new x8q0(o8q0Var.a));
                }
                return rih1Var;
            case 8:
                xeq0 xeq0Var = (xeq0) obj3;
                List listL1 = o7h.l1(xeq0Var.c);
                ((rtb0) obj).e(listL1.size(), new iio0(listL1, (byte) 4), new iio0(listL1, (byte) 5), new j2i(2039820996, new rf1((byte) 23, (idq0) obj2, xeq0Var, listL1), true));
                return rih1Var;
            case 9:
                ((Boolean) obj).booleanValue();
                ((Function0) obj3).invoke();
                ((View) obj2).performHapticFeedback(Build.VERSION.SDK_INT < 30 ? 1 : 16);
                return rih1Var;
            case 10:
                WeakHashMap weakHashMap = shk1.a;
                shk1.a.put((View) obj3, (dxb) obj2);
                return new tj4((byte) 13);
            case 11:
                if (!u890.j((hxb) ((ven0) obj2).getValue(), fxb.a) && (zf11Var = (zf11) obj3) != null) {
                    shq0VarB = zf11Var.b();
                }
                return new xwm0(shq0VarB, (byte) 4);
            case 12:
                bbr0 bbr0Var = (bbr0) ((ven0) obj3).getValue();
                if (bbr0Var != null && (xar0Var = (xar0) obj2) != null) {
                    shq0VarB = xar0Var.a(bbr0Var);
                }
                return new kac0(shq0VarB, (byte) 2);
            case 13:
                ((p811) obj3).a = new gf6(((Number) obj).intValue(), (PageActivity) obj2, (byte) 9);
                return rih1Var;
            case 14:
                ((jeh) ((p410) obj3).d).a(new qs31((Intent) obj2, (th61) obj));
                return rih1Var;
            case 15:
                ((iu30) obj3).invoke(((o1p1) obj2).D((Intent) obj, -1));
                return rih1Var;
            case 16:
                return ((o1p1) obj3).z((Context) obj, obj2);
            case 17:
                ((ahi0) obj3).l((rtb0) obj, (g5r0) obj2);
                return rih1Var;
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                return new xwm0(((xar0) obj3).a((bbr0) obj2), (byte) 6);
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                der0 der0Var = (der0) obj3;
                der0Var.getClass();
                return new w9d0(der0Var, (air0) obj2, (byte) 6);
            case 20:
                kd31 kd31Var = (kd31) obj;
                kd31Var.b(((ceo) obj3).a(((Number) ((Function0) obj2).invoke()).floatValue()));
                kd31Var.f(kd31Var.d < 1.0f);
                return rih1Var;
            case 21:
                ghr0 ghr0Var = new ghr0((iu30) obj2);
                jc9 jc9Var = (jc9) obj3;
                ((gzj) jc9Var.b).b.add(ghr0Var);
                return new w9d0(jc9Var, ghr0Var, (byte) 7);
            case 22:
                lsl lslVar = (lsl) obj;
                jkr0 jkr0Var = (jkr0) obj3;
                lslVar.s1();
                tob1 tob1Var = (tob1) obj2;
                if (((Number) tob1Var.getValue()).floatValue() > 0.0f) {
                    xjr0 xjr0VarK = jkr0Var.k();
                    kl1 kl1Var = jkr0Var.d;
                    if (!xjr0VarK.a.isEmpty()) {
                        float fMax = Math.max(((int) (jkr0Var.k().g() & 4294967295L)) / jkr0Var.l(), lslVar.X0(5.0f));
                        float fS = ((((drr0) kl1Var.d).s() + ((err0) kl1Var.c).s()) / jkr0Var.l()) * ((int) (jkr0Var.k().g() & 4294967295L));
                        uwr uwrVar = cbx.a;
                        long j = ((yex) zex.a.d).e;
                        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits((Float.intBitsToFloat((int) (lslVar.j() >> 32)) - lslVar.X0(4.0f)) - lslVar.X0(3.0f))) << 32) | (((long) Float.floatToRawIntBits(fS)) & 4294967295L);
                        long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(lslVar.X0(4.0f))) << 32) | (((long) Float.floatToRawIntBits(fMax)) & 4294967295L);
                        float fFloatValue = ((Number) tob1Var.getValue()).floatValue();
                        float fX0 = lslVar.X0(4.0f);
                        DrawScope.g0(lslVar, j, jFloatToRawIntBits, jFloatToRawIntBits2, (((long) Float.floatToRawIntBits(fX0)) << 32) | (((long) Float.floatToRawIntBits(fX0)) & 4294967295L), (DrawStyle) null, fFloatValue, 0, 208);
                    }
                }
                return rih1Var;
            case 23:
                ((qtr) obj).b(new jaz((Optional) obj3, (lzn0) obj2, (lnm) null));
                return rih1Var;
            case 24:
                String str = (String) obj;
                str0 str0Var = (str0) obj3;
                i8h1 i8h1Var = (i8h1) str0Var.d.getValue();
                x6h1 x6h1VarC = str0Var.b.b.c();
                x6h1VarC.i.add(new a7h1("footer_support_link_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("navigate_to_webview_uri", 1, Collections.singletonMap("destination", str)), x6h1VarC.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                ((iu30) obj2).invoke(new j100(str));
                return rih1Var;
            case 25:
                ((qtr) obj).b(new lcm((vu30) obj3, (qxr0) obj2, (lnm) null, (byte) 12));
                return rih1Var;
            case 26:
                shq0 shq0Var = (shq0) obj2;
                try {
                    ((iu30) obj3).invoke(obj);
                    return rih1Var;
                } finally {
                    shq0Var.invoke();
                }
            case 27:
                qns0 qns0Var = (qns0) obj3;
                return new sr0(new ht20(qns0Var.c(), new pk50(2, (lnm) null, (byte) 16)), qns0Var, (String) obj2, (Set) obj, (byte) 17);
            case 28:
                List list = ((wvs0) obj3).a;
                ((kex) obj).b(list.size(), new j2i(1658481532, new u40(list, (iu30) obj2, (byte) 2), true), new nec0(list, (byte) 7));
                return rih1Var;
            default:
                ji50 ji50Var = (ji50) obj;
                sjq0 sjq0Var = (sjq0) obj2;
                Iterator it = ((Set) ((p1f0) obj3).c).iterator();
                while (it.hasNext()) {
                    ((d5t0) it.next()).a(ji50Var.a, ji50Var, sjq0Var);
                }
                return rih1Var;
        }
    }
}
