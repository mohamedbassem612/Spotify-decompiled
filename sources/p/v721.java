package p;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.mobius.MobiusLoop;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class v721 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v721(Object obj, Object obj2, Object obj3, byte b) {
        super(1);
        this.a = b;
        this.d = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public final Object invoke(Object obj) {
        Bundle bundleG;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        Object obj4 = this.d;
        switch (b) {
            case 0:
                vi11 vi11Var = (vi11) obj4;
                fn31.T(cto1.q((dg30) vi11Var.b), (o8n) null, 0, new m311(vi11Var, (String) obj3, (String) obj2, (lnm) null, (byte) 5), 3);
                return rih1Var;
            case 1:
                kl1 kl1Var = (kl1) obj4;
                fn31.T((u9c0) kl1Var.f, (o8n) null, 0, new m311(kl1Var, (String) obj3, (String) obj2, (lnm) null, (byte) 7), 3);
                return rih1Var;
            case 2:
                k811 k811Var = (k811) obj4;
                fn31.T(cto1.q((dg30) k811Var.b), (o8n) null, 0, new sew0(k811Var, (String) obj3, (lik1) obj2, (tv80) obj, (lnm) null, (byte) 11), 3);
                return rih1Var;
            case 3:
                pn1 pn1Var = (pn1) obj4;
                fn31.T(cto1.q(pn1Var.a), (o8n) null, 0, new sew0(pn1Var, (String) obj3, (lik1) obj2, (tv80) obj, (lnm) null, (byte) 13), 3);
                return rih1Var;
            case 4:
                xa21 xa21Var = (xa21) obj4;
                fn31.T(cto1.q(xa21Var.a), (o8n) null, 0, new elu0(xa21Var, (String) obj3, (String) obj2, (lnm) null, (byte) 19), 3);
                return rih1Var;
            case 5:
                ((bbc) ((lc20) ((bb01) obj4).b).b).l(new mwc1(new fbh0((String) obj3, (String) obj2, "", "")));
                return rih1Var;
            case 6:
                return new dol0(new qgl0(new qgl0(Integer.valueOf(((vpu0) obj2).a), (String) obj3, ((gc21) obj4).g), (short) 0));
            case 7:
                xmu0 xmu0Var = ((gc21) obj4).e;
                int iOrdinal = ((pc31) obj).ordinal();
                if (iOrdinal == 0) {
                    xmu0Var.f(2, (String) obj3, ((x4i1) obj2).a);
                } else {
                    if (iOrdinal != 1) {
                        eg.o();
                        return null;
                    }
                    xmu0Var.e();
                }
                return rih1Var;
            case 8:
                lsl lslVar = (lsl) obj;
                ((ven0) obj4).setValue(new Size(lslVar.j()));
                tkb tkbVar = (tkb) ((ven0) obj3).getValue();
                Bitmap bitmap = tkbVar != null ? tkbVar.a : null;
                if (bitmap != null && !bitmap.isRecycled() && bitmap.getWidth() > 0 && bitmap.getHeight() > 0) {
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (tkbVar.b >> 32));
                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (4294967295L & tkbVar.b));
                    ColorFilter colorFilter = (ColorFilter) obj2;
                    ((dg8) lslVar.a1().b).z(fIntBitsToFloat, fIntBitsToFloat2);
                    try {
                        float f = 1.0f / tkbVar.c;
                        cab cabVarA1 = lslVar.a1();
                        long jU = cabVarA1.u();
                        cabVarA1.p().q();
                        try {
                            ((dg8) cabVarA1.b).t(f, f, 0L);
                            DrawScope.m(lslVar, new yk4(bitmap), 0L, 0.0f, colorFilter, 0, 46);
                            cabVarA1.p().i();
                            cabVarA1.D(jU);
                            ((dg8) lslVar.a1().b).z(-fIntBitsToFloat, -fIntBitsToFloat2);
                        } catch (Throwable th) {
                            cabVarA1.p().i();
                            cabVarA1.D(jU);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        ((dg8) lslVar.a1().b).z(-fIntBitsToFloat, -fIntBitsToFloat2);
                        throw th2;
                    }
                }
                return rih1Var;
            case 9:
                oe21 oe21Var = (oe21) obj;
                long jA = oe21Var.a();
                pe21 pe21Var = (pe21) obj4;
                return Boolean.valueOf(((Boolean) pe21Var.k.invoke((n511) obj3, anm1.g((4294967295L & ((long) Float.floatToRawIntBits((float) ((int) (jA & 4294967295L))))) | (((long) Float.floatToRawIntBits((float) ((int) (jA >> 32)))) << 32), o0c.R(oe21Var.b())))).booleanValue() && pe21Var.t.contains(oe21Var.a.l) && ((Boolean) ((iu30) obj2).invoke(oe21Var)).booleanValue());
            case 10:
                qc40 qc40Var = (qc40) obj;
                jl21 jl21Var = (jl21) obj4;
                if (qc40Var.equals(pc40.a)) {
                    fn31.T(cto1.q(jl21Var.b), (o8n) null, 0, new m311(jl21Var, (String) obj3, (Map) obj2, (lnm) null, (byte) 15), 3);
                } else if (!qc40Var.equals(oc40.a)) {
                    eg.o();
                    return null;
                }
                return rih1Var;
            case 11:
                return new uc5((uac0) obj, fn31.T((c9n) obj4, (o8n) null, 0, new d821((wzv0) obj3, (iu30) obj2, (lnm) null, (byte) 12), 3), (byte) 1);
            case 12:
                return (g4h1) ((xu30) obj4).invoke((q7r0) obj3, (cir0) obj, ((f931) ((uxy0) ((g931) obj2).b).b).b);
            case 13:
                dnc0 dnc0Var = (dnc0) obj;
                yd60 yd60Var = new yd60((String) obj3);
                h8k1 h8k1Var = new h8k1(yd60Var, yd60Var);
                wrw wrwVar = (wrw) obj4;
                if (wrwVar == null) {
                    h8k1Var = null;
                }
                two1.v(dnc0Var, new huz(f46.i0(new h8k1[]{null, h8k1Var}), (byte) 10), false, new nt01(wrwVar, (hpc) obj2, (byte) 29));
                return rih1Var;
            case 14:
                u501 u501Var = (u501) obj;
                if (!(u501Var instanceof u501)) {
                    eg.o();
                    return null;
                }
                if (u501Var.c) {
                    ((zw11) obj4).invoke(u501Var.b);
                } else {
                    pcf.a(((ig31) obj3).a, pcf.j(u501Var.a), (tv80) obj2, (Bundle) null);
                }
                return rih1Var;
            case 15:
                tf31 tf31Var = (tf31) obj;
                String str = ((o1j0) obj3).b;
                iu30 iu30Var = (iu30) obj4;
                if (tf31Var.equals(mf31.a)) {
                    iu30Var.invoke(new o0j0(str));
                } else if (tf31Var.equals(of31.a)) {
                    ((Function0) obj2).invoke();
                } else if (tf31Var.equals(rf31.a)) {
                    iu30Var.invoke(new s0j0(str));
                } else if (tf31Var instanceof pf31) {
                    iu30Var.invoke(new p0j0(str, ((pf31) tf31Var).a));
                } else if (tf31Var instanceof sf31) {
                    iu30Var.invoke(new t0j0(str, ((sf31) tf31Var).a));
                } else if (tf31Var instanceof lf31) {
                    iu30Var.invoke(new m0j0(str, ((lf31) tf31Var).a));
                } else if (tf31Var instanceof qf31) {
                    iu30Var.invoke(new q0j0(str, ((qf31) tf31Var).a));
                } else if (!(tf31Var instanceof nf31)) {
                    eg.o();
                    return null;
                }
                return rih1Var;
            case 16:
                MobiusLoop mobiusLoop = (MobiusLoop) obj4;
                return new sg(mobiusLoop.b(new xq6((ven0) obj3, (byte) 1)), mobiusLoop, (fjw0) obj2, (byte) 17);
            case 17:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                long jB = ((yqg) obj4).b();
                sq31 sq31Var = (sq31) obj3;
                Long l = sq31Var.b;
                k1z0 k1z0Var = sq31Var.a;
                Long lValueOf = l != null ? Long.valueOf(jB - l.longValue()) : null;
                ((iu30) obj2).invoke(new kq31(new om21(lValueOf != null ? lValueOf.longValue() : k1z0Var.e, zBooleanValue ? 2 : 3, k1z0Var.a), jB));
                return rih1Var;
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                p5t0 p5t0Var = (p5t0) obj;
                lit litVar = (lit) obj4;
                float f2 = litVar.c * 0.165f;
                flb0 layoutDirection = ((ifh0) obj3).getLayoutDirection();
                float f3 = litVar.a;
                if (layoutDirection == flb0.b) {
                    f3 = ((2.0f * f2) + f3) - litVar.c;
                }
                p5t0Var.k((q5t0) obj2, p5t0Var.i0(f3), p5t0Var.i0(litVar.b), 0.0f);
                return rih1Var;
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                Context context = (Context) obj;
                FrameLayout frameLayout = new FrameLayout(context);
                frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
                xhk1.f(frameLayout, (u601) obj2);
                frameLayout.setTag(2131428154, (iu30) obj4);
                isw iswVarA = ((er60) obj3).d.c().a(context, frameLayout, new lsw(new xcn0()), new hbz0(frameLayout, (byte) 12));
                ViewParent parent = iswVarA.getView().getParent();
                ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                if (viewGroup != null) {
                    viewGroup.removeView(iswVarA.getView());
                }
                frameLayout.addView(iswVarA.getView());
                frameLayout.setTag(2131428153, iswVarA);
                return frameLayout;
            case 20:
                Bundle bundle = (Bundle) obj;
                String str2 = (String) obj3;
                ipb1 ipb1Var = ((le41) obj4).a;
                mc41 mc41Var = (mc41) obj2;
                Bundle bundleG2 = pzm.g("com.spotify.element.state_holder_saved_state", true);
                try {
                    bundleG = mc41Var.d(ipb1Var.getState());
                    break;
                } catch (Exception unused) {
                    bundleG = mno1.g();
                }
                bundleG2.putBundle("element_state", bundleG);
                Bundle bundleC = ipb1Var.c();
                if (bundleC != null) {
                    bundleG2.putBundle("ui_state", bundleC);
                }
                bundle.putBundle(str2, bundleG2);
                return rih1Var;
            case 21:
                String str3 = (String) obj3;
                return new eol0(new qgl0(new qgl0(Integer.valueOf(((vpu0) obj2).a), str3, ((ph41) obj4).b), (short) 0), str3);
            case 22:
                ec5 ec5Var = (ec5) obj;
                u8s0 u8s0Var = (u8s0) ((tob1) obj2).getValue();
                if (u8s0Var != null) {
                    ec5Var.setContourPath(u8s0Var);
                }
                he5 he5Var = (he5) obj4;
                ec5Var.setStrokeWidth(he5Var.a);
                float f4 = he5Var.b;
                float f5 = he5Var.c;
                float f6 = he5Var.d;
                float f7 = he5Var.e;
                Handler handler = ec5Var.f;
                if (handler != null) {
                    handler.post(new bc5(ec5Var, f4, f5, f6, f7, (byte) 1));
                }
                float f8 = he5Var.f;
                float f9 = he5Var.g;
                float f10 = he5Var.h;
                float f11 = he5Var.i;
                Handler handler2 = ec5Var.f;
                if (handler2 != null) {
                    handler2.post(new bc5(ec5Var, f8, f9, f10, f11, (byte) 0));
                }
                ((ven0) obj3).setValue(ec5Var);
                return rih1Var;
            case 23:
                String str4 = (String) obj;
                ven0 ven0Var = (ven0) obj2;
                ((q251) obj4).a = ihc1.y0((String) ven0Var.getValue()) && !ihc1.y0(str4);
                ven0Var.setValue(str4);
                ((iu30) obj3).invoke(new h251(str4));
                return rih1Var;
            case 24:
                int i = ((xb51) obj).a;
                y751 y751Var = (y751) obj3;
                h551 h551Var = (h551) obj4;
                List listC = h551Var.c(h551Var.j);
                ArrayList arrayList = new ArrayList();
                Iterator it = listC.iterator();
                while (it.hasNext()) {
                    Object obj5 = ((h8k1) it.next()).a;
                    pd51 pd51Var = obj5 instanceof pd51 ? (pd51) obj5 : null;
                    if (pd51Var != null) {
                        arrayList.add(pd51Var);
                    }
                }
                boolean z = y751Var.a(i, arrayList) && y751Var.g((hc51) obj2, i);
                Boolean boolValueOf = Boolean.valueOf(z);
                if (z) {
                    h551Var.f = null;
                }
                return boolValueOf;
            case 25:
                a0c a0cVar = new a0c((c751) obj3, (i751) obj2, (byte) 4);
                ((cir0) obj4).j(a0cVar);
                return new xwm0(a0cVar, (byte) 24);
            case 26:
                c380 c380Var = (c380) obj4;
                ((rtb0) obj).e(c380Var.size(), new svb0(new i90((c380) obj3, (byte) 11), c380Var, (byte) 9), new rw11(c380Var, (byte) 5), new j2i(2039820996, new ot(c380Var, (r951) obj2, (byte) 20), true));
                return rih1Var;
            case 27:
                int iIntValue = ((Number) obj).intValue();
                i8h1 i8h1Var = ((db51) obj4).Q0;
                ouk0 ouk0Var = (ouk0) obj3;
                Integer numValueOf = Integer.valueOf(iIntValue);
                apd apdVar = (apd) o7h.t0(iIntValue, ((fpd) obj2).getItems());
                String strL = apdVar != null ? l0p1.l(apdVar) : null;
                x6h1 x6h1VarC = ouk0Var.b.c();
                x6h1VarC.i.add(new a7h1("item", (String) null, numValueOf, strL, (String) null));
                x6h1VarC.j = true;
                y6h1 y6h1VarA = x6h1VarC.a();
                k7h1 k7h1Var = new k7h1();
                ((xjn) k7h1Var).a = y6h1VarA;
                ((xjn) k7h1Var).b = ouk0Var.a;
                ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
                i8h1Var.f(k7h1Var.a(), (Set) null);
                return rih1Var;
            case 28:
                List list = (List) obj4;
                int iP = yoi1.p(jch0.U(((Number) obj).floatValue()), 0, list.size() - 1);
                err0 err0Var = (hdn0) obj2;
                if (iP != err0Var.s()) {
                    err0Var.t(iP);
                    ((iu30) obj3).invoke(((fr51) list.get(iP)).a);
                }
                return rih1Var;
            default:
                fe00 fe00Var = (fe00) obj;
                if (fe00Var instanceof be00) {
                    jmb1 jmb1Var = (unb1) obj4;
                    if (jmb1Var instanceof jmb1) {
                        ((bpb1) ((sv51) obj3).b.b).m((Object) null, jmb1Var.a.a);
                    }
                }
                ((iu30) obj2).invoke(fe00Var);
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v721(String str, Object obj, Object obj2, byte b) {
        super(1);
        this.a = b;
        this.b = str;
        this.d = obj;
        this.c = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v721(ci90 ci90Var, vpu0 vpu0Var, String str, byte b) {
        super(1);
        this.a = b;
        this.d = ci90Var;
        this.c = vpu0Var;
        this.b = str;
    }
}
