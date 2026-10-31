package p;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.icu.text.CompactDecimalFormat;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;
import androidx.compose.ui.graphics.ColorFilter;
import com.spotify.encoremobile.component.textview.EncoreTextView;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import io.reactivex.rxjava3.internal.functions.Functions;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class oat extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oat(Object obj, byte b) {
        super(3);
        this.a = b;
        this.b = obj;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) throws Throwable {
        ou80 ou80Var;
        nsl1 lsl1Var;
        w7h1 w7h1Var;
        String quantityString;
        mq70 mq70Var;
        up70 up70VarA;
        String str;
        qj0 qj0Var;
        byte b = this.a;
        nim0 nim0Var = nim0.a;
        byte b2 = 3;
        byte b3 = 2;
        boolean z = true;
        rih1 rih1Var = rih1.a;
        fv0 fv0Var = null;
        Object obj4 = this.b;
        switch (b) {
            case 0:
                iat iatVar = (iat) obj2;
                if (iatVar instanceof hat) {
                    ((pat) obj4).a.invoke(Integer.valueOf(((hat) iatVar).a));
                }
                return rih1Var;
            case 1:
                ret retVar = (ret) obj;
                if (uet.a[((pet) obj2).ordinal()] == 1) {
                    z710.d((z710) ((qj0) obj4).d, retVar.c, false, 4);
                    return rih1Var;
                }
                eg.o();
                return null;
            case 2:
                Boolean bool = (Boolean) obj2;
                boolean zBooleanValue = bool.booleanValue();
                hma1 hma1VarEdit = ((ima1) obj4).edit();
                hma1VarEdit.a(vpt.d, zBooleanValue);
                hma1VarEdit.g();
                return new it61(bool);
            case 3:
                tv80 tv80Var = (tv80) obj3;
                mxr mxrVar = (mxr) obj4;
                if (((Boolean) obj2).booleanValue()) {
                    ((kst) mxrVar.d).a.d();
                    a1r0.j((a1r0) mxrVar.b, "spotify:internal:permissions-location-request", (tv80Var == null || (ou80Var = tv80Var.a) == null) ? null : ou80Var.a, mno1.h(new mmr0[]{new mmr0("device_location_permission_page_input", new ast(bst.b, null, 14))}), false, 8);
                    z = false;
                }
                return Boolean.valueOf(z);
            case 4:
                Boolean bool2 = (Boolean) obj2;
                if (!bool2.booleanValue()) {
                    fdc fdcVar = (fdc) obj4;
                    o0g1 o0g1Var = (o0g1) fdcVar.f;
                    wcr wcrVar = new wcr(fdcVar, (byte) 18);
                    cwb cwbVar = new cwb((Activity) o0g1Var.c, 2132017517);
                    Window window = cwbVar.getWindow();
                    if (window != null) {
                        d55.b(window);
                        up41 up41Var = new up41(window.getDecorView());
                        int i = Build.VERSION.SDK_INT;
                        if (i >= 35) {
                            lsl1Var = new nsl1(window, up41Var);
                        } else if (i >= 30) {
                            lsl1Var = new msl1(window, up41Var);
                        } else {
                            lsl1Var = i >= 26 ? new lsl1(window, up41Var) : new ksl1(window, up41Var);
                        }
                        lsl1Var.I(false);
                    }
                    cwbVar.setContentView(2131624548);
                    View viewFindViewById = cwbVar.findViewById(2131427752);
                    if (viewFindViewById != null) {
                        rwq0.s(viewFindViewById, gft.d);
                    }
                    cwbVar.g().J(cwbVar.getContext().getResources().getDisplayMetrics().heightPixels);
                    cwbVar.g().L(3);
                    LinearLayout linearLayout = (LinearLayout) cwbVar.findViewById(2131427592);
                    View viewFindViewById2 = cwbVar.findViewById(2131431115);
                    EncoreTextView encoreTextViewFindViewById = cwbVar.findViewById(2131428431);
                    View viewFindViewById3 = cwbVar.findViewById(((Number) ((idd1) o0g1Var.f).getValue()).intValue());
                    if (viewFindViewById3 != null) {
                        viewFindViewById3.setOnClickListener(new kw6(o0g1Var, wcrVar, cwbVar, (byte) 6));
                        viewFindViewById3.setVisibility(0);
                    }
                    cwbVar.setOnCancelListener(new vae(o0g1Var, wcrVar));
                    View viewFindViewById4 = cwbVar.findViewById(2131427887);
                    if (viewFindViewById4 != null) {
                        viewFindViewById4.setOnClickListener(new cvr(o0g1Var, wcrVar, cwbVar));
                    }
                    if (o0g1Var.b == 2) {
                        if (viewFindViewById2 != null) {
                            viewFindViewById2.setVisibility(0);
                        }
                        if (linearLayout != null) {
                            linearLayout.addView(o0g1Var.m(2131954980));
                            linearLayout.addView(o0g1Var.i(2131954977));
                            linearLayout.addView(o0g1Var.i(2131954978));
                            linearLayout.addView(o0g1Var.i(2131954979));
                            linearLayout.addView(o0g1Var.m(2131954982));
                            linearLayout.addView(o0g1Var.i(2131954981));
                        }
                        if (encoreTextViewFindViewById != null) {
                            encoreTextViewFindViewById.setText(2131954970);
                        }
                    } else {
                        if (viewFindViewById2 != null) {
                            viewFindViewById2.setVisibility(8);
                        }
                        if (linearLayout != null) {
                            linearLayout.addView(o0g1Var.m(2131954983));
                            linearLayout.addView(o0g1Var.i(2131960969));
                            linearLayout.addView(o0g1Var.i(2131960970));
                            linearLayout.addView(o0g1Var.i(2131960971));
                            linearLayout.addView(o0g1Var.m(2131954976));
                            linearLayout.addView(o0g1Var.i(2131960973));
                        }
                        if (encoreTextViewFindViewById != null) {
                            encoreTextViewFindViewById.setText(2131954969);
                        }
                    }
                    cwbVar.show();
                }
                return bool2;
            case 5:
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(((z6u) obj2).a));
                intent.addFlags(268435456);
                ((b7u) obj4).b.startActivity(intent);
                return rih1Var;
            case 6:
                if (((neu) obj2).equals(neu.a)) {
                    ((peu) obj4).a.invoke();
                    return rih1Var;
                }
                eg.o();
                return null;
            case 7:
                zgu zguVar = (zgu) obj;
                tgu tguVar = (tgu) obj2;
                ygu yguVar = (ygu) obj4;
                pxc pxcVar = yguVar.c;
                ji0 ji0Var = zguVar.c;
                if (tguVar.equals(ogu.a)) {
                    pxc.a(pxcVar, ji0Var, 0L, "cta_button", "mhpto", 16);
                } else if (tguVar.equals(pgu.a)) {
                    pxc.a(pxcVar, ji0Var, 0L, "container", "mhpto", 16);
                } else if (tguVar.equals(qgu.a)) {
                    yguVar.e.a(zguVar.b.a).o(Functions.h).subscribe();
                }
                return rih1Var;
            case 8:
                vju vjuVar = (vju) obj2;
                bs0 bs0Var = (bs0) obj4;
                if (vjuVar instanceof tju) {
                    ((vas) bs0Var.b).invoke(((tju) vjuVar).a);
                    return rih1Var;
                }
                if (vjuVar instanceof uju) {
                    ((gis) bs0Var.e).invoke();
                    return rih1Var;
                }
                eg.o();
                return null;
            case 9:
                x340 x340Var = (b0k) obj2;
                int iIntValue = ((Number) obj3).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 17) != 16)) {
                    sbl.u((cs91) obj4, (qim0) null, vji.b, x340Var2, 390, 2);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 10:
                xru xruVar = (xru) obj;
                vru vruVar = (vru) obj2;
                ArrayList arrayList = xruVar.a;
                if (!vruVar.equals(uru.a) && !vruVar.equals(tru.a)) {
                    eg.o();
                    return null;
                }
                zru zruVar = (zru) obj4;
                ArrayList arrayList2 = xruVar.b;
                if (!arrayList.isEmpty()) {
                    twu twuVar = zruVar.a;
                    ArrayList arrayList3 = new ArrayList(q7h.U(arrayList, 10));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        arrayList3.add(new cxu(((wru) it.next()).a, 0, 0));
                    }
                    twuVar.b(arrayList3);
                }
                if (!arrayList2.isEmpty()) {
                    r2v r2vVar = zruVar.b;
                    ArrayList arrayList4 = new ArrayList(q7h.U(arrayList2, 10));
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        arrayList4.add(new a3v(((yru) it2.next()).a));
                    }
                    r2vVar.b(arrayList4);
                }
                xruVar.c.invoke();
                return rih1Var;
            case 11:
                km61 km61Var = (km61) obj;
                boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                vyu vyuVar = (vyu) obj4;
                if (zBooleanValue2) {
                    fn31.T(smo1.e(flo1.l(op71.f(), vyuVar.d)), (o8n) null, 0, new hl1(vyuVar, km61Var, zBooleanValue2, (lnm) null, (byte) 4), 3);
                    z = false;
                }
                return Boolean.valueOf(z);
            case 12:
                ((Number) obj3).intValue();
                hdv hdvVar = ((xdv) obj4).c;
                qim0 qim0VarW = uyn1.w(nim0Var, (vzq0) obj);
                joa0 joa0Var = new joa0("dsl-selection-list");
                rih1 rih1Var2 = rih1.a;
                otw.b(hdvVar, rih1Var2, joa0Var, qim0VarW, (b0k) obj2, 48, 0);
                return rih1Var2;
            case 13:
                ((nit) ((umf0) obj4).d).invoke((vcv) obj2);
                return rih1Var;
            case 14:
                t671 t671Var = (t671) obj;
                tqw tqwVar = (tqw) obj3;
                if (t671Var.e) {
                    xh71.b((xh71) obj4, new wa71(t671Var.a, t671Var.c, (cqs0) null, (dqi1) null, (String) null, (String) null, (Bundle) null, 124), (Bundle) null, new vm71(t671Var.d), tqwVar != null ? n3o1.y(tqwVar) : null, t671Var.f, 2);
                }
                return rih1Var;
            case 15:
                gva gvaVar = (gva) obj;
                ((Number) obj3).intValue();
                tnv tnvVar = (tnv) obj4;
                x340 x340Var3 = (b0k) obj2;
                Object objT = x340Var3.T();
                if (objT == fkj0.X) {
                    f1n0 f1n0Var = tnvVar.c;
                    ps7 ps7Var = tnvVar.d;
                    CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
                    CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
                    jmv jmvVar = new jmv(ps7Var);
                    jd11 jd11Var = rc11.a;
                    coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(omv.class), runSequentially.a(jmvVar));
                    coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(mmv.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new gmv(f1n0Var)));
                    coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(nmv.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new hmv(f1n0Var)));
                    objT = new mnv(new a(o6x.a, coroutinesSubtypeEffectHandlerBuilderI));
                    x340Var3.s0(objT);
                }
                otw.c((mnv) objT, new zmv(tnvVar.b.a, gvaVar.a, mqo1.A(gvaVar.b)), (qim0) null, (ipb1) null, x340Var3, 0, 12);
                return rih1Var;
            case 16:
                yov yovVar = (yov) obj3;
                txk0 txk0Var = (txk0) ((res) obj4).b;
                boolean z2 = yovVar instanceof xov;
                b7x b7xVar = b7x.a;
                if (z2) {
                    txk0Var.getClass();
                    x6h1 x6h1VarC = txk0Var.b.c();
                    x6h1VarC.i.add(new a7h1("group_name_input_field", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC.j = false;
                    return new w7h1("", "", new z7h1("key_stroke", 1, b7xVar), new x7h1("text_edit", 1, Collections.singletonMap("field_to_be_changed", "group_name")), x6h1VarC.a(), r6h1.c, System.currentTimeMillis());
                }
                if (yovVar instanceof vov) {
                    txk0Var.getClass();
                    x6h1 x6h1VarC2 = txk0Var.b.c();
                    x6h1VarC2.i.add(new a7h1("cancel_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC2.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis());
                } else {
                    if (!(yovVar instanceof wov)) {
                        eg.o();
                        return null;
                    }
                    txk0Var.getClass();
                    x6h1 x6h1VarC3 = txk0Var.b.c();
                    x6h1VarC3.i.add(new a7h1("done_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC3.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("submit", 1, b7xVar), x6h1VarC3.a(), r6h1.c, System.currentTimeMillis());
                }
                return w7h1Var;
            case 17:
                tqw tqwVar2 = (tqw) obj3;
                if (((qpv) obj2).equals(qpv.a)) {
                    ((spv) obj4).a.a(nik1.W1.a, cvl1.d(tqwVar2), (Bundle) null);
                    return rih1Var;
                }
                eg.o();
                return null;
            case 18:
                jwq jwqVar = (jwq) obj;
                x340 x340Var4 = (b0k) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                xpv xpvVar = (xpv) obj4;
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= x340Var4.g(jwqVar) ? 4 : 2;
                }
                x340 x340Var5 = x340Var4;
                if (x340Var5.Y(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    if (!jwqVar.d) {
                        xpvVar.a.e();
                    }
                    ((vpv) xpvVar.d.get()).a(jwqVar, x340Var5, iIntValue2 & 14);
                } else {
                    x340Var5.b0();
                }
                return rih1Var;
            case 19:
                ((Number) obj3).intValue();
                ((qvv) obj4).e((b0k) obj2, 0);
                return rih1Var;
            case 20:
                p3w p3wVar = (p3w) obj;
                ((Number) obj3).intValue();
                m4c m4cVar = fkj0.X;
                String str2 = p3wVar.a;
                String str3 = p3wVar.b;
                zah1 zah1Var = p3wVar.c;
                boolean z3 = p3wVar.e;
                boolean z4 = p3wVar.f;
                t3w t3wVar = (t3w) obj4;
                los losVar = t3wVar.h;
                nu nuVar = t3wVar.g;
                x340 x340Var6 = (b0k) obj2;
                boolean zI = x340Var6.i(t3wVar);
                Object objT2 = x340Var6.T();
                if (zI || objT2 == m4cVar) {
                    objT2 = new ymu(t3wVar, fv0Var, (byte) 15);
                    x340Var6.s0(objT2);
                }
                vu30 vu30Var = (vu30) objT2;
                boolean zI2 = x340Var6.i(t3wVar) | x340Var6.i(p3wVar);
                Object objT3 = x340Var6.T();
                if (zI2 || objT3 == m4cVar) {
                    objT3 = new q3w(t3wVar, p3wVar);
                    x340Var6.s0(objT3);
                }
                irn1.i(str2, str3, zah1Var, z3, z4, losVar, nuVar, vu30Var, (q3w) objT3, x340Var6, 0);
                return rih1Var;
            case 21:
                jo70 jo70Var = (jo70) obj;
                xkk1 xkk1Var = (xkk1) obj2;
                a7q0 a7q0Var = (a7q0) obj3;
                if (jo70Var == null) {
                    return r6g1.a;
                }
                Long l = a7q0Var != null ? a7q0Var.e : null;
                if (l == null || l.longValue() <= 0) {
                    quantityString = "";
                } else {
                    Resources resources = (Resources) ((hw2) obj4).g;
                    long jLongValue = l.longValue();
                    Locale locale = resources.getConfiguration().getLocales().get(0);
                    if (jLongValue < 10000) {
                        str = NumberFormat.getInstance(locale).format(jLongValue);
                    } else {
                        CompactDecimalFormat compactDecimalFormat = CompactDecimalFormat.getInstance(locale, CompactDecimalFormat.CompactStyle.SHORT);
                        compactDecimalFormat.setMaximumFractionDigits(1);
                        str = compactDecimalFormat.format(jLongValue);
                    }
                    if (jLongValue > 2147483647L) {
                        jLongValue = 2147483647L;
                    }
                    quantityString = resources.getQuantityString(2131820676, (int) jLongValue, str);
                }
                xn70 xn70Var = new xn70(quantityString, (String) null, 6, (String) null);
                String str4 = jo70Var.a;
                if (xkk1Var != null && (mq70Var = xkk1Var.a) != null && (up70VarA = mq70Var.a(vp70.c)) != null) {
                    fv0Var = up70VarA.a.a;
                }
                return new q6g1(xn70Var, new bv11(str4, (String) null, (Long) null, (Long) null, (u380) null, 0, false, (c380) null, (h540) null, (vno1) null, (c380) null, new sz6(fv0Var), false, (String) null, (Long) null, 0L, (o5a1) null, (wqo) null, (bul) null, (po11) null, (msv0) null, (ati1) null, (c380) null, (String) null, (ktl) null, 67106814));
            case 22:
                ((Number) obj3).intValue();
                rrn1.f(((d6w) obj4).f, (b0k) obj2, 0);
                return rih1Var;
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                g2c g2cVar = (g2c) obj;
                x340 x340Var7 = (b0k) obj2;
                ((Number) obj3).intValue();
                d7w d7wVar = (d7w) obj4;
                String str5 = d7wVar.f;
                u5j1 u5j1Var = d4o1.a;
                if (str5 != null) {
                    x340 x340Var8 = x340Var7;
                    x340Var8.i0(-358237178);
                    boolean zG = x340Var8.g(str5);
                    Object objT4 = x340Var8.T();
                    if (zG || objT4 == fkj0.X) {
                        objT4 = Uri.parse(str5);
                        x340Var8.s0(objT4);
                    }
                    Uri uri = (Uri) objT4;
                    uri.getClass();
                    eso1.e(uri, isl.a, g2cVar.b(nim0Var), (p3v) null, (zvx) null, (ecx) null, mif1.P0, (tl3) null, (ColorFilter) null, (qux) null, false, false, x340Var8, 48, 0, 4024);
                    x340Var8.r(false);
                } else {
                    x340 x340Var9 = x340Var7;
                    x340Var9.i0(-357940973);
                    qim0 qim0VarB = g2cVar.b(nim0Var);
                    uwr uwrVar = cbx.a;
                    t1c.a(dug.f(qim0VarB, cbx.a(x340Var9).a.a.a(), u5j1Var), x340Var9, 0);
                    x340Var9.r(false);
                }
                qim0 qim0VarB2 = g2cVar.b(nim0Var);
                uwr uwrVar2 = cbx.a;
                t1c.a(dug.f(qim0VarB2, u7h.b(cbx.a(x340Var7).a.c, 0.5f, 0.0f, 0.0f, 0.0f, 14), u5j1Var), x340Var7, 0);
                t1c.a(dug.e(g2cVar.a(u291.h(u291.f(nim0Var, 1.0f), 92.0f), een.X), v9c.s(p7h.M(new u7h[]{new u7h(u7h.b(cbx.a(x340Var7).a.c, 0.0f, 0.0f, 0.0f, 0.0f, 14)), new u7h(u7h.b(cbx.a(x340Var7).a.c, 0.73f, 0.0f, 0.0f, 0.0f, 14))}), 0.0f, 0.0f, 14), (hw61) null, 0.0f, 6), x340Var7, 0);
                qim0 qim0VarJ = u291.j(250.0f, 0.0f, 2, u291.f(nim0Var, 1.0f));
                mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var7, 0);
                x340 x340Var10 = x340Var7;
                int iHashCode = Long.hashCode(x340Var10.T);
                xos0 xos0VarM = x340Var10.m();
                qim0 qim0VarE = zr7.E(x340Var7, qim0VarJ);
                hzj.A.getClass();
                x340 x340Var11 = x340Var7;
                if (x340Var11.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var11.m0();
                if (x340Var11.S) {
                    x340Var11.l(hmb0.t1);
                } else {
                    x340Var11.v0();
                }
                nko1.H(mbhVarA, x340Var7, y580.O0);
                nko1.H(xos0VarM, x340Var7, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var7, y580.R0);
                nko1.F(x340Var7);
                nko1.H(qim0VarE, x340Var7, y580.Y);
                String str6 = d7wVar.g;
                String str7 = d7wVar.d;
                cvx cvxVar = cbx.b(x340Var7).b;
                nyn1.b(0, str6, str7, x340Var7, uyn1.x(nim0Var, 16.0f));
                op71.g(x340Var7, new wnb0(1.0f, true));
                nyn1.x(d7wVar, x340Var7, 0);
                x340Var11.r(true);
                return rih1Var;
            case 24:
                o860 o860Var = (o860) ((ezw) obj4).d;
                fj0 fj0Var = new fj0(new ej0(new r1t(1, (Function0) obj3, t890.class, "suspendConversion0", "invoke$suspendConversion0(Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, (byte) 25)));
                i01 i01Var = ((i44) o860Var.b).h() ? (i01) o860Var.c : (i01) o860Var.d;
                w3q w3qVar = (w3q) o860Var.e;
                switch (w3qVar.a) {
                    case 0:
                        thq thqVar = w3qVar.b;
                        daq daqVar = thqVar.b;
                        gw70 gw70Var = (gw70) daqVar.d8.get();
                        v5q v5qVar = thqVar.c;
                        qj0Var = new qj0(gw70Var, (x3q) v5qVar.Aa.get(), new wj0((gw70) v5qVar.b.d8.get()), fj0Var, i01Var, (ao0) daqVar.Hk.get(), (op0) v5qVar.s7.get());
                        break;
                    default:
                        thq thqVar2 = w3qVar.b;
                        daq daqVar2 = thqVar2.b;
                        gw70 gw70Var2 = (gw70) daqVar2.d8.get();
                        teq teqVar = thqVar2.c;
                        qj0Var = new qj0(gw70Var2, (x3q) teqVar.b.zb.get(), new wj0((gw70) teqVar.b.a.d8.get()), fj0Var, i01Var, (ao0) daqVar2.Hk.get(), (op0) teqVar.C7.get());
                        break;
                }
                return new kpg0(qj0Var, vrw.P0);
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                return new kpg0(((z0x) obj4).b.a(new aiu(new zhu(1, new to1((Function0) obj3, (lnm) null, (byte) 7)), (iac0) obj, 2, false)), vrw.S0);
            case 26:
                e070 e070Var = new e070(new d070((Function0) obj3));
                ip31 ip31Var = (ip31) ((ezw) obj4).c;
                return new kpg0(new res(e070Var, (c070) ip31Var.b, (ao0) ip31Var.c, ((i44) ip31Var.f).h() ? (i01) ip31Var.d : (i01) ip31Var.e, (yqg) ip31Var.g, (op0) ip31Var.h, new bju((zle1) ip31Var.i, false)), vrw.U0);
            case 27:
                Function0 function0 = (Function0) obj3;
                x6d1 x6d1Var = obj2 instanceof x6d1 ? (x6d1) obj2 : null;
                if (x6d1Var == null) {
                    hhg1.n("Required value was null.");
                    return null;
                }
                vhc vhcVar = e6d1.P0;
                ji0 ji0Var2 = x6d1Var.a;
                String str8 = ji0Var2 != null ? ji0Var2.W0 : null;
                vhcVar.getClass();
                return new kpg0(((f2x) obj4).b.a(new c6d1(str8 == null ? false : str8.equals("topic_survey") ? e6d1.R0 : e6d1.Q0, f6d1.EMBEDDED_NPV, new b6d1(new e2x(function0, (lnm) null, (byte) 0)))), new i5w(x6d1Var, (byte) 8));
            case 28:
                iac0 iac0Var = (iac0) obj;
                Function0 function1 = (Function0) obj3;
                l2x l2xVar = (l2x) obj4;
                ylv0 ylv0Var = obj2 instanceof ylv0 ? (ylv0) obj2 : null;
                byp bypVar = l2xVar.e;
                waj1 waj1Var = new waj1(new vaj1(new to1(function1, (lnm) null, (byte) 8), new ozw(function1, l2xVar, b3), new i5w(l2xVar, (byte) 9)), iac0Var, ylv0Var != null ? ylv0Var.a : null, ylv0Var != null ? ylv0Var.b : null);
                Set set = un0.a;
                paj1 paj1Var = paj1.a;
                return new kpg0(new e701(new gcj1(set.contains(paj1Var), un0.b.contains(paj1Var)), (c4q) bypVar.b, (z3q) bypVar.c, (op0) bypVar.a, (a4q) bypVar.d, (av0) bypVar.e, (i44) bypVar.f, waj1Var, (fv0) bypVar.g, (gw70) bypVar.h, (woa) bypVar.i), vrw.V0);
            default:
                iac0 iac0Var2 = (iac0) obj;
                Function0 function2 = (Function0) obj3;
                n2x n2xVar = (n2x) obj4;
                ylv0 ylv0Var2 = obj2 instanceof ylv0 ? (ylv0) obj2 : null;
                return new kpg0(n2xVar.d.a(new qaj1("embedded-npv-video", true, paj1.a, new oaj1(new to1(function2, (lnm) null, (byte) 9), new ozw(function2, n2xVar, b2), 1), iac0Var2, ylv0Var2 != null ? ylv0Var2.a : null, ylv0Var2 != null ? ylv0Var2.b : null)), vrw.W0);
        }
    }
}
