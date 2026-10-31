package p;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DismissType;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Button;
import com.spotify.notifications.notifications.workers.NotificationHandlingQuasarWorker;
import j$.time.Clock;
import j$.time.LocalDate;
import j$.time.YearMonth;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ur1 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ur1(fta ftaVar, ou80 ou80Var, String str, String str2, List list, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 8;
        this.b = ftaVar;
        this.d = ou80Var;
        this.c = str;
        this.e = str2;
        this.f = list;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.f;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.c;
        switch (b) {
            case 0:
                ur1 ur1Var = new ur1(obj5, obj4, obj3, obj2, lnmVar, (byte) 0);
                ur1Var.b = obj;
                return ur1Var;
            case 1:
                return new ur1((byte) 1, this.b, obj5, obj4, obj3, obj2, lnmVar);
            case 2:
                return new ur1((ven0) obj4, (y7e1) this.b, (iu30) obj2, (String) obj5, (ven0) obj3, lnmVar);
            case 3:
                return new ur1(this.b, obj5, obj3, obj2, (ven0) obj4, lnmVar, (byte) 3);
            case 4:
                return new ur1((my6) this.b, (jmb1) obj4, (tv80) obj3, (hpe0) obj2, (String) obj5, lnmVar);
            case 5:
                return new ur1((byte) 5, this.b, obj5, obj4, obj3, obj2, lnmVar);
            case 6:
                ur1 ur1Var2 = new ur1(obj5, obj4, obj3, obj2, lnmVar, (byte) 6);
                ur1Var2.b = obj;
                return ur1Var2;
            case 7:
                return new ur1((byte) 7, this.b, obj5, obj4, obj3, obj2, lnmVar);
            case 8:
                return new ur1((fta) this.b, (ou80) obj4, (String) obj5, (String) obj3, (List) obj2, lnmVar);
            case 9:
                return new ur1((byte) 9, this.b, obj5, obj4, obj3, obj2, lnmVar);
            case 10:
                ur1 ur1Var3 = new ur1((j2i) obj5, (ttj) obj3, (d0r) obj2, (ven0) obj4, lnmVar);
                ur1Var3.b = obj;
                return ur1Var3;
            case 11:
                ur1 ur1Var4 = new ur1(obj5, obj4, obj3, obj2, lnmVar, (byte) 11);
                ur1Var4.b = obj;
                return ur1Var4;
            case 12:
                ur1 ur1Var5 = new ur1((d0r) obj4, (o3r) obj3, (String) obj5, (o3r) obj2, lnmVar);
                ur1Var5.b = obj;
                return ur1Var5;
            case 13:
                return new ur1((byte) 13, this.b, obj5, obj4, obj3, obj2, lnmVar);
            case 14:
                ur1 ur1Var6 = new ur1(obj5, obj4, obj3, obj2, lnmVar, (byte) 14);
                ur1Var6.b = obj;
                return ur1Var6;
            case 15:
                return new ur1((byte) 15, this.b, obj5, obj4, obj3, obj2, lnmVar);
            case 16:
                return new ur1((byte) 16, this.b, obj5, obj4, obj3, obj2, lnmVar);
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return new ur1((idh1) this.b, (View) obj3, (String) obj5, (String) obj2, (ven0) obj4, lnmVar);
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                ur1 ur1Var7 = new ur1((jr30) obj4, (String) obj5, (r091) obj3, (c9n) obj2, lnmVar);
                ur1Var7.b = obj;
                return ur1Var7;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return new ur1((byte) 19, this.b, obj5, obj4, obj3, obj2, lnmVar);
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return new ur1((kw60) this.b, (BottomSheetBehavior) obj5, (ven0) obj4, (hdn0) obj2, (ven0) obj3, lnmVar);
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return new ur1((byte) 21, this.b, obj5, obj4, obj3, obj2, lnmVar);
            case 22:
                return new ur1(this.b, obj5, obj3, obj2, (ven0) obj4, lnmVar, (byte) 22);
            case 23:
                return new ur1((byte) 23, this.b, obj5, obj4, obj3, obj2, lnmVar);
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return new ur1((q9l1) this.b, (clj1) obj2, (String) obj5, (ven0) obj4, (ven0) obj3, lnmVar);
            case 25:
                return new ur1((byte) 25, this.b, obj5, obj4, obj3, obj2, lnmVar);
            case 26:
                ur1 ur1Var8 = new ur1(obj5, obj4, obj3, obj2, lnmVar, (byte) 26);
                ur1Var8.b = obj;
                return ur1Var8;
            case 27:
                return new ur1((wp10) this.b, (o0i) obj5, (w3t0) obj2, (ven0) obj4, (ven0) obj3, lnmVar);
            case 28:
                return new ur1((ven0) obj4, (tob1) this.b, (mqt0) obj5, (lqt0) obj3, (c9n) obj2, lnmVar);
            default:
                return new ur1((byte) 29, this.b, obj5, obj4, obj3, obj2, lnmVar);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                create((CharSequence) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 1:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 2:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 3:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 4:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 5:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 6:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 7:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 8:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 9:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 10:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 11:
                create((vwl) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 12:
                return create((k1r) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 13:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 14:
                create((nxb) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 15:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 16:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                create((mmr0) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 22:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 23:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 25:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 26:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 27:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 28:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            default:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
        }
    }

    /* JADX WARN: Code duplicated, block: B:134:0x03ed  */
    /* JADX WARN: Code duplicated, block: B:241:0x068b  */
    /* JADX WARN: Code duplicated, block: B:47:0x022e  */
    public final Object invokeSuspend(Object obj) {
        wvh vvhVar;
        jxh jxhVar;
        swl rwlVar;
        YearMonth yearMonthNow;
        int color;
        Drawable drawable;
        ouu ouuVar;
        fr30 dr30Var;
        xab1 xab1Var;
        xab1 xab1Var2;
        w8w0 w8w0Var;
        duk1 duk1Var;
        w8w0 w8w0Var2;
        duk1 duk1Var2;
        w8w0 w8w0Var3;
        duk1 duk1Var3;
        r091 r091Var;
        String str;
        View.OnClickListener t230Var;
        byte b = this.a;
        byte b2 = 21;
        boolean z = false;
        duk1 duk1Var4 = null;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.f;
        Object obj5 = this.c;
        switch (b) {
            case 0:
                ven0 ven0Var = (ven0) obj3;
                CharSequence charSequence = (CharSequence) this.b;
                hm5.M(obj);
                if (!u890.j(charSequence, (String) obj5) && !((Boolean) ven0Var.getValue()).booleanValue()) {
                    ((Function0) ((ven0) obj2).getValue()).invoke();
                    ven0Var.setValue(Boolean.TRUE);
                }
                ((iu30) ((ven0) obj4).getValue()).invoke(charSequence.toString());
                return rih1Var;
            case 1:
                hm5.M(obj);
                if (((fu1) this.b).f()) {
                    rt1 rt1Var = (rt1) obj5;
                    int i = rt1Var.b + rt1Var.c;
                    int i2 = rt1Var.a;
                    ((dx1) obj3).getClass();
                    ((iu30) obj2).invoke(((ow1) obj4).p.invoke(new Integer(((i2 * 250) / 100) + i), new Integer(i)));
                }
                return rih1Var;
            case 2:
                String str2 = (String) obj5;
                iu30 iu30Var = (iu30) obj4;
                ven0 ven0Var2 = (ven0) obj2;
                hm5.M(obj);
                dzx0 dzx0Var = (dzx0) ((ven0) obj3).getValue();
                if (u890.j(dzx0Var, xyx0.a)) {
                    c4p1.q((y7e1) this.b);
                    ven0Var2.setValue(Boolean.FALSE);
                } else if (u890.j(dzx0Var, azx0.a)) {
                    ven0Var2.setValue(Boolean.TRUE);
                } else if (u890.j(dzx0Var, zyx0.a) || (dzx0Var instanceof yyx0)) {
                    ven0Var2.setValue(Boolean.FALSE);
                    iu30Var.invoke(new a43(str2));
                } else {
                    ven0Var2.setValue(Boolean.FALSE);
                }
                return rih1Var;
            case 3:
                b6t b6tVar = (k6a1) obj2;
                hm5.M(obj);
                ven0 ven0Var3 = (ven0) obj3;
                if (!((Boolean) ven0Var3.getValue()).booleanValue() && ((rz5) this.b).g()) {
                    lz20.b((lz20) obj5);
                    if (b6tVar != null) {
                        b6tVar.b();
                    }
                } else if (!((Boolean) ven0Var3.getValue()).booleanValue()) {
                    if (b6tVar != null) {
                        b6tVar.a();
                    }
                    ((az20) obj4).b(true);
                }
                return rih1Var;
            case 4:
                hm5.M(obj);
                t740 t740Var = ((my6) this.b).k;
                jmb1 jmb1Var = (jmb1) obj3;
                String str3 = jmb1Var.a.b;
                sz6 sz6Var = jmb1Var.b.l;
                sz6 sz6Var2 = sz6Var instanceof sz6 ? sz6Var : null;
                t740Var.a(str3, sz6Var2 != null ? sz6Var2.c : null, zr7.n((hpe0) obj4), (String) obj5, (tv80) obj2);
                return rih1Var;
            case 5:
                hm5.M(obj);
                ozb ozbVar = (ozb) this.b;
                x1q0 x1q0Var = ozbVar.g;
                MessageResponseToken messageResponseToken = (MessageResponseToken) obj5;
                Button button = (Button) obj3;
                Bundle bundle = (Bundle) obj2;
                if (bundle == null) {
                    bundle = new Bundle();
                }
                x1q0Var.a(messageResponseToken, button, bundle, (DismissType) obj4, new ptb(ozbVar, (byte) 1));
                return rih1Var;
            case 6:
                hm5.M(obj);
                c9n c9nVar = (c9n) this.b;
                m5c m5cVar = (m5c) obj5;
                lnm lnmVar = null;
                fn31.T(c9nVar, (o8n) null, 0, new sxa(m5cVar, (ndo0) obj3, (og) obj2, lnmVar, (byte) 7), 3);
                return fn31.T(c9nVar, (o8n) null, 0, new w7a(m5cVar, (uc9) obj4, lnmVar, (byte) 24), 3);
            case 7:
                hm5.M(obj);
                vgm vgmVar = (vgm) this.b;
                uv11 uv11Var = ((unb1) obj5).a;
                String str4 = uv11Var.a;
                String str5 = ((ole) obj3).f;
                tv80 tv80Var = (tv80) obj2;
                vu30 vu30Var = (vu30) obj4;
                String str6 = uv11Var.d;
                if (str6 == null) {
                    str6 = "";
                }
                vgmVar.d(str4, str5, tv80Var, (tgm) vu30Var.invoke(str4, str6));
                return rih1Var;
            case 8:
                hm5.M(obj);
                ou80 ou80Var = (ou80) obj3;
                ((b431) ((fta) this.b).e).a(new jse((String) obj5, (List) obj4, (String) obj2), ou80Var != null ? ou80Var.a : null);
                return rih1Var;
            case 9:
                hm5.M(obj);
                bhk bhkVar = (bhk) this.b;
                zfk zfkVar = (zfk) obj5;
                String str7 = zfkVar.e;
                String str8 = zfkVar.f;
                String str9 = zfkVar.g;
                AtomicReferenceArray atomicReferenceArray = p6r0.e;
                fn31.T(cto1.q(bhkVar.h), (o8n) null, 0, new ahk(zfkVar.l, zfkVar.m, bhkVar, new o0d((dg30) obj3, (Context) obj2, (kt91) obj4, b2), str7, str8, str9, zfkVar.j, zfkVar.i, yon1.R0(), zfkVar.h, zfkVar.k, null), 3);
                return rih1Var;
            case 10:
                c9n c9nVar2 = (c9n) this.b;
                hm5.M(obj);
                ((ven0) obj3).setValue(new pn31(c9nVar2, (j2i) obj5, (ttj) obj2, (d0r) obj4));
                return rih1Var;
            case 11:
                vwl vwlVar = (vwl) this.b;
                hm5.M(obj);
                iu30 iu30Var2 = (iu30) obj5;
                owl owlVar = (owl) obj2;
                String str10 = owlVar.a;
                long j = ((u7h) ((tob1) obj4).getValue()).a;
                boolean z2 = ((uwl) obj3).b;
                boolean z3 = vwlVar.a;
                blb blbVar = vwlVar.c;
                if (z3) {
                    rwlVar = swl.a;
                } else {
                    jxh jxhVar2 = kxh.a;
                    if (blbVar == null) {
                        jxhVar = jxhVar2;
                    } else if (hap1.q(blbVar)) {
                        jxhVar = ixh.a;
                    } else {
                        if (blbVar instanceof blb) {
                            blb blbVar2 = blbVar;
                            vvhVar = new wvh(blbVar2.a, blbVar2.b, z2 ? blbVar2.f : null);
                        } else if (blbVar instanceof clb) {
                            clb clbVar = (clb) blbVar;
                            vvhVar = new xvh(clbVar.a, clbVar.b);
                        } else if (blbVar instanceof zkb) {
                            vvhVar = new uvh(new t9b1(blbVar));
                        } else {
                            if (!(blbVar instanceof alb)) {
                                eg.o();
                                return null;
                            }
                            if (z2) {
                                alb albVar = (alb) blbVar;
                                vvhVar = new vvh(albVar.a, albVar.b);
                            } else {
                                jxhVar = jxhVar2;
                            }
                        }
                        jxhVar = new jxh(vvhVar);
                    }
                    boolean zJ = u890.j(vwlVar.b, hno.a);
                    boolean z4 = blbVar != null && jxhVar.equals(jxhVar2);
                    if (zJ && !(jxhVar instanceof jxh)) {
                        rwlVar = ((jxhVar instanceof ixh) || z4) ? pwl.a : new rwl(owlVar.b);
                    } else {
                        swl qwlVar = new qwl(str10, vwlVar.b, jxhVar, j);
                        rwlVar = qwlVar;
                    }
                }
                iu30Var2.invoke(rwlVar);
                return rih1Var;
            case 12:
                String str11 = (String) obj5;
                d0r d0rVar = (d0r) obj3;
                k1r k1rVar = (k1r) this.b;
                hm5.M(obj);
                return Boolean.valueOf(((k1rVar instanceof j1r) || (x2p1.n(d0rVar, (o3r) obj2, str11) instanceof j1r) || (x2p1.n(d0rVar, (o3r) obj4, str11) instanceof j1r)) ? false : true);
            case 13:
                hm5.M(obj);
                v720 v720Var = (v720) this.b;
                ((ven0) obj3).setValue(v720Var.c);
                ((ven0) obj2).setValue(v720Var.d);
                ven0 ven0Var4 = (ven0) obj4;
                LocalDate localDate = v720Var.c;
                if (localDate == null || (yearMonthNow = YearMonth.from(localDate)) == null) {
                    yearMonthNow = YearMonth.now((Clock) obj5);
                }
                ven0Var4.setValue(yearMonthNow);
                return rih1Var;
            case 14:
                nxb nxbVar = (nxb) this.b;
                hm5.M(obj);
                akr akrVar = (akr) obj5;
                los losVar = nxbVar.f;
                int i3 = nxbVar.d;
                boolean z5 = nxbVar.g;
                if (losVar == null) {
                    losVar = null;
                }
                akrVar.y = losVar;
                zf30 zf30Var = (zf30) obj3;
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) obj2;
                ujr ujrVar = (ujr) obj4;
                Integer num = nxbVar.c;
                int iIntValue = num != null ? num.intValue() : akrVar.g();
                int iG = akrVar.g();
                if (iIntValue > iG) {
                    iIntValue = iG;
                }
                bottomSheetBehavior.j = iIntValue;
                ujrVar.setMaxWidth(iIntValue);
                Integer num2 = nxbVar.a;
                ajq0 ajq0Var = akrVar.m;
                if (ajq0Var != null) {
                    ajq0Var.V();
                }
                akrVar.m = null;
                if (num2 != null) {
                    bottomSheetBehavior.J(num2.intValue());
                } else {
                    ViewGroup bottomSheetContainer = ujrVar.getBottomSheetContainer();
                    ajq0 ajq0Var2 = new ajq0();
                    ajq0Var2.a = bottomSheetBehavior;
                    ajq0Var2.b = bottomSheetContainer;
                    ajq0Var2.c = (ViewGroup) bottomSheetContainer.getParent();
                    ajq0Var2.d = new idd1(new vv8(ajq0Var2, (byte) 1));
                    ajq0Var2.e = new eg7(ajq0Var2, (byte) 2);
                    akrVar.m = ajq0Var2;
                    ViewGroup viewGroup = (ViewGroup) ajq0Var2.c;
                    eg7 eg7Var = (eg7) ajq0Var2.e;
                    viewGroup.addOnLayoutChangeListener(eg7Var);
                    bottomSheetContainer.addOnLayoutChangeListener(eg7Var);
                    ajq0Var2.W();
                }
                bottomSheetBehavior.F = z5;
                bottomSheetBehavior.E = nxbVar.i;
                akr.k(ujrVar, i3);
                ujrVar.setShadowEnabled(i3 == 2);
                ViewGroup bottomSheetContainer2 = ujrVar.getBottomSheetContainer();
                kxb kxbVar = nxbVar.e;
                if (u890.j(kxbVar, lxb.a)) {
                    drawable = bottomSheetContainer2.getContext().getDrawable(2131231259);
                } else {
                    float f = 16.0f * akrVar.a.getResources().getDisplayMetrics().density;
                    ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{f, f, f, f, 0.0f, 0.0f, 0.0f, 0.0f}, null, null));
                    Paint paint = shapeDrawable.getPaint();
                    if (kxbVar instanceof jxb) {
                        color = ((jxb) kxbVar).a;
                    } else {
                        if (!(kxbVar instanceof kxb)) {
                            eg.o();
                            return null;
                        }
                        color = bottomSheetContainer2.getContext().getColor(kxbVar.a);
                    }
                    paint.setColor(color);
                    drawable = shapeDrawable;
                }
                bottomSheetContainer2.setBackground(drawable);
                ujrVar.setDraggable(z5);
                akrVar.k = nxbVar.j;
                los losVar2 = nxbVar.f;
                if (losVar2 != null) {
                    kdn0 kdn0Var = losVar2.a;
                    kdn0Var.l(zf30Var);
                    kdn0Var.f(zf30Var, new z11(akrVar, (byte) 12));
                }
                return rih1Var;
            case 15:
                hm5.M(obj);
                suu suuVar = (suu) ((xvu) this.b).f;
                fbp1 fbp1Var = ((fvu) obj5).e;
                if (fbp1Var instanceof swp0) {
                    ouuVar = ouu.a;
                } else {
                    ouuVar = ((fbp1Var instanceof iwp0) || (fbp1Var instanceof uwp0)) ? ouu.c : ouu.b;
                }
                suuVar.a(ouuVar, (v1v) obj3, (jut) obj2, (gmt) obj4);
                return rih1Var;
            case 16:
                hm5.M(obj);
                nl9 nl9Var = (nl9) this.b;
                spn spnVar = (spn) nl9Var.g;
                String str12 = (String) nl9Var.b;
                spn.b(spnVar, new cqn((String) null, (String) obj5, new zpn(false, (List) null, Collections.singletonList(str12), (List) null, str12, str12, new wpn((Set) obj3, (g3d0) obj2), true, 559), 1), (tv80) obj4);
                return rih1Var;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                View view = (View) obj2;
                idh1 idh1Var = (idh1) this.b;
                hm5.M(obj);
                ven0 ven0Var5 = (ven0) obj3;
                cr31 cr31Var = ey00.a;
                if (((idh1) ven0Var5.getValue()) != null && ((idh1) ven0Var5.getValue()) != idh1Var) {
                    idh1 idh1Var2 = idh1.c;
                    if (idh1Var == idh1Var2) {
                        view.announceForAccessibility((String) obj5);
                    } else if (((idh1) ven0Var5.getValue()) == idh1Var2) {
                        view.announceForAccessibility((String) obj4);
                    }
                }
                ven0Var5.setValue(idh1Var);
                return rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                jr30 jr30Var = (jr30) obj3;
                p731 p731Var = jr30Var.b;
                mmr0 mmr0Var = (mmr0) this.b;
                hm5.M(obj);
                i091 i091Var = (i091) mmr0Var.a;
                boolean zBooleanValue = ((Boolean) mmr0Var.b).booleanValue();
                if (zBooleanValue && (xab1Var = jr30Var.e) != null && xab1Var.isActive() && (xab1Var2 = jr30Var.e) != null) {
                    xab1Var2.d((CancellationException) null);
                }
                String str13 = (String) obj5;
                long j2 = i091Var.d;
                if (j2 >= 0) {
                    long j3 = i091Var.e;
                    if (j3 <= 0) {
                        dr30Var = null;
                    } else {
                        k091 k091Var = i091Var.h;
                        if (k091Var instanceof n091) {
                            dr30Var = j3 - j2 <= 60000 ? new cr30(str13) : new er30(j2, i091Var.c, str13);
                        } else if (k091Var instanceof k091) {
                            dr30Var = k091Var.a instanceof e091 ? new cr30(str13) : new dr30(str13, j2);
                        } else if (k091Var instanceof m091) {
                            dr30Var = new dr30(str13, j2);
                        } else {
                            dr30Var = null;
                        }
                    }
                } else {
                    dr30Var = null;
                }
                jr30Var.d = dr30Var;
                if (p731Var != null) {
                    r091 r091Var2 = (r091) obj2;
                    c9n c9nVar3 = (c9n) obj4;
                    if (ebp1.p(i091Var)) {
                        jr30Var.d();
                        vuh1 vuh1Var = vuh1.e;
                        if (p731Var != null) {
                            p731Var.b(str13, vuh1Var);
                        }
                    } else if (!ebp1.q(i091Var)) {
                        jr30Var.d();
                    } else if (zBooleanValue) {
                        jr30Var.c(str13, r091Var2, c9nVar3);
                    } else if (jr30Var.e == null && ebp1.r(r091Var2) && smo1.u(c9nVar3)) {
                        jr30Var.e = fn31.T(c9nVar3, (o8n) null, 0, new gr30(jr30Var, str13, r091Var2, c9nVar3, (lnm) null), 3);
                    }
                }
                return rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                hm5.M(obj);
                is30 is30Var = (is30) this.b;
                is30Var.g.a((MessageResponseToken) obj5, (Button) obj3, (Bundle) obj2, (DismissType) obj4, new f710(is30Var, (byte) 21));
                return rih1Var;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                hm5.M(obj);
                int iD = ((kw60) this.b).d((Integer) ((ven0) obj2).getValue(), ((hdn0) obj4).s());
                BottomSheetBehavior bottomSheetBehavior2 = (BottomSheetBehavior) obj5;
                if (bottomSheetBehavior2 != null) {
                    bottomSheetBehavior2.J(iD);
                }
                ven0 ven0Var6 = (ven0) obj3;
                rzb1 rzb1Var = (rzb1) ven0Var6.getValue();
                ven0Var6.setValue(new rzb1(rzb1Var.b, iD, rzb1Var.a));
                return rih1Var;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                tqw tqwVar = (tqw) obj2;
                gu70 gu70Var = (iu70) obj5;
                lu70 lu70Var = (lu70) obj3;
                mu70 mu70Var = (mu70) obj4;
                hm5.M(obj);
                fu70 fu70Var = (fu70) this.b;
                if (fu70Var instanceof du70) {
                    String strA = gu70Var.a();
                    if (strA.length() == 0) {
                        strA = mu70Var.a;
                    }
                    lu70Var.d.a(strA, cvl1.d(tqwVar), (Bundle) null);
                } else {
                    if (!(fu70Var instanceof eu70)) {
                        eg.o();
                        return null;
                    }
                    vgm vgmVar2 = lu70Var.e;
                    String str14 = mu70Var.a;
                    tv80 tv80VarD = cvl1.d(tqwVar);
                    boolean z6 = lu70Var.g;
                    boolean z7 = !mu70Var.h;
                    gu70 gu70Var2 = gu70Var instanceof gu70 ? gu70Var : null;
                    vgm.b(vgmVar2, str14, (String) null, tv80VarD, new tgm((String) null, z6, true, false, false, false, false, (yh10) null, false, false, 0, false, false, false, false, false, (iu30) null, false, false, (g371) null, (c821) null, z7, (String) null, (iu30) null, (p860) null, gu70Var2 != null ? gu70Var2.d : null, false, false, -553648135, 1), 2);
                }
                return rih1Var;
            case 22:
                hm5.M(obj);
                azb azbVar = (azb) ((hrr0) obj4).getValue();
                q6w0 q6w0Var = ((kak0) obj5).S0.a;
                Map map = (Map) ((ven0) obj3).getValue();
                b8w0 b8w0Var = q6w0Var.a;
                if (azbVar instanceof zyb) {
                    buk1 buk1Var = q6w0Var.b;
                    if (buk1Var != null && (duk1Var3 = buk1Var.a) != null) {
                        duk1Var4 = duk1Var3;
                    } else if (map != null && (w8w0Var3 = (w8w0) map.get(b8w0Var)) != null) {
                        duk1Var4 = w8w0Var3.a.a;
                    }
                    if (duk1Var4 == duk1.b) {
                        z = true;
                    }
                } else if (azbVar instanceof syb) {
                    hez hezVar = q6w0Var.c;
                    if (hezVar != null && (duk1Var2 = hezVar.a) != null) {
                        duk1Var4 = duk1Var2;
                    } else if (map != null && (w8w0Var2 = (w8w0) map.get(b8w0Var)) != null) {
                        duk1Var4 = w8w0Var2.b.a;
                    }
                    if (duk1Var4 == jez.b) {
                        z = true;
                    }
                } else if (azbVar instanceof tyb) {
                    fa20 fa20Var = q6w0Var.d;
                    if (fa20Var != null && (duk1Var = fa20Var.a) != null) {
                        duk1Var4 = duk1Var;
                    } else if (map != null && (w8w0Var = (w8w0) map.get(b8w0Var)) != null) {
                        duk1Var4 = w8w0Var.c.a;
                    }
                    if (duk1Var4 == ha20.b) {
                        z = true;
                    }
                }
                ((t4h1) obj2).g.setValue(Boolean.valueOf(z));
                return rih1Var;
            case 23:
                hm5.M(obj);
                uem0 uem0Var = (uem0) this.b;
                uem0Var.g.a((MessageResponseToken) obj5, (Button) obj3, (Bundle) obj2, (DismissType) obj4, new z8i0(uem0Var, (byte) 29));
                return rih1Var;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                hm5.M(obj);
                ((ven0) obj3).setValue(new lsm0(n3p1.q((clj1) obj4), new ksm0(fec1.c, (String) null, (String) null, ((q9l1) this.b).p, "", (String) null, 486), true, false, (jsm0) null, dqz0.b.j(3000L), (ism0) null, (String) obj5, false, 0, 1880));
                r091 r091Var3 = (r091) ((ven0) obj2).getValue();
                if (r091Var3 != null) {
                    r091Var3.j();
                }
                return rih1Var;
            case 25:
                Long l = (Long) obj4;
                hm5.M(obj);
                s45 s45Var = ((NotificationHandlingQuasarWorker) this.b).p;
                long jA = s45Var.a.a();
                t45 t45Var = (t45) obj5;
                t45Var.a("outcome", (String) ((p811) obj3).a);
                String str15 = (String) ((p811) obj2).a;
                if (str15 != null) {
                    t45Var.b("error_class", str15);
                }
                t45.c((t45) obj5, "total", l.longValue(), jA - l.longValue(), 8);
                s45Var.b(t45Var.e());
                return rih1Var;
            case 26:
                c9n c9nVar4 = (c9n) this.b;
                hm5.M(obj);
                bbr0 bbr0Var = (bbr0) obj5;
                fn31.T(c9nVar4, (o8n) null, 0, new dvq0(bbr0Var, (ven0) obj3, (ven0) obj2, (lnm) null, (byte) 0), 3);
                fn31.T(c9nVar4, (o8n) null, 0, new cto0(bbr0Var, (ven0) obj4, (lnm) null, (byte) 16), 3);
                return rih1Var;
            case 27:
                hm5.M(obj);
                q9l1 q9l1Var = ((wp10) this.b).c;
                l4p1.u(((o0i) obj5).a, new x010(q9l1Var.o, q9l1Var.h.e, new p4r0((w3t0) obj4, (ven0) obj3, (ven0) obj2, null), (byte) 1));
                return rih1Var;
            case 28:
                hm5.M(obj);
                if (((Boolean) ((ven0) obj3).getValue()).booleanValue() && (r091Var = (r091) ((tob1) this.b).getValue()) != null) {
                    mqt0 mqt0Var = (mqt0) obj5;
                    lqt0 lqt0Var = (lqt0) obj2;
                    c9n c9nVar5 = (c9n) obj4;
                    r091Var.b(new lsm0(lqt0Var.c, new ksm0(new gec1("fd1e7bbc608b4ec1a90eaf23d44e8669"), nzy.k(lqt0Var.b), (String) null, "ShareableCardPreview", (String) null, (String) null, 500), false, false, (jsm0) null, 0L, (ism0) null, (String) null, false, 0, 2044));
                    r091Var.k();
                    r091.f(r091Var, (tv80) null, (Long) null, uky0.a, 7);
                    if (mqt0Var.a.i()) {
                        fn31.T(c9nVar5, (o8n) null, 0, new rwm0(mqt0Var, lqt0Var, r091Var, (lnm) null, (byte) 17), 3);
                    }
                }
                return rih1Var;
            default:
                iu30 iu30Var3 = (iu30) obj4;
                hm5.M(obj);
                aku0 aku0Var = ((vju0) this.b).c;
                String str16 = (String) obj5;
                if (aku0Var != null) {
                    t230Var = new t230(aku0Var, iu30Var3, (byte) 25);
                    str = (String) obj3;
                } else {
                    str = null;
                    t230Var = null;
                }
                ((kt91) obj2).k(new er91((fs91) null, str16, (Integer) null, str, (Integer) null, t230Var, (cvr) null, (xq91) null, false));
                iu30Var3.invoke(mju0.a);
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ur1(Object obj, Object obj2, Object obj3, Object obj4, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ur1(Object obj, Object obj2, Object obj3, Object obj4, ven0 ven0Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.e = obj3;
        this.f = obj4;
        this.d = ven0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ur1(my6 my6Var, jmb1 jmb1Var, tv80 tv80Var, hpe0 hpe0Var, String str, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 4;
        this.b = my6Var;
        this.d = jmb1Var;
        this.e = tv80Var;
        this.f = hpe0Var;
        this.c = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ur1(byte b, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, lnm lnmVar) {
        super(2, lnmVar);
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ur1(j2i j2iVar, ttj ttjVar, d0r d0rVar, ven0 ven0Var, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 10;
        this.c = j2iVar;
        this.e = ttjVar;
        this.f = d0rVar;
        this.d = ven0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ur1(d0r d0rVar, o3r o3rVar, String str, o3r o3rVar2, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 12;
        this.d = d0rVar;
        this.e = o3rVar;
        this.c = str;
        this.f = o3rVar2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ur1(wp10 wp10Var, o0i o0iVar, w3t0 w3t0Var, ven0 ven0Var, ven0 ven0Var2, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 27;
        this.b = wp10Var;
        this.c = o0iVar;
        this.f = w3t0Var;
        this.d = ven0Var;
        this.e = ven0Var2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ur1(jr30 jr30Var, String str, r091 r091Var, c9n c9nVar, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 18;
        this.d = jr30Var;
        this.c = str;
        this.e = r091Var;
        this.f = c9nVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ur1(kw60 kw60Var, BottomSheetBehavior bottomSheetBehavior, ven0 ven0Var, hdn0 hdn0Var, ven0 ven0Var2, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 20;
        this.b = kw60Var;
        this.c = bottomSheetBehavior;
        this.d = ven0Var;
        this.f = hdn0Var;
        this.e = ven0Var2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ur1(ven0 ven0Var, tob1 tob1Var, mqt0 mqt0Var, lqt0 lqt0Var, c9n c9nVar, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 28;
        this.d = ven0Var;
        this.b = tob1Var;
        this.c = mqt0Var;
        this.e = lqt0Var;
        this.f = c9nVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ur1(ven0 ven0Var, y7e1 y7e1Var, iu30 iu30Var, String str, ven0 ven0Var2, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 2;
        this.d = ven0Var;
        this.b = y7e1Var;
        this.f = iu30Var;
        this.c = str;
        this.e = ven0Var2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ur1(idh1 idh1Var, View view, String str, String str2, ven0 ven0Var, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 17;
        this.b = idh1Var;
        this.e = view;
        this.c = str;
        this.f = str2;
        this.d = ven0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ur1(q9l1 q9l1Var, clj1 clj1Var, String str, ven0 ven0Var, ven0 ven0Var2, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 24;
        this.b = q9l1Var;
        this.f = clj1Var;
        this.c = str;
        this.d = ven0Var;
        this.e = ven0Var2;
    }
}
