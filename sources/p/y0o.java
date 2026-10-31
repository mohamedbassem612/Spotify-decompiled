package p;

import android.content.Context;
import android.graphics.RectF;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.constraintlayout.motion.widget.MotionLayout;
import com.spotify.encoreconsumermobile.elements.artwork.ArtworkView;
import com.spotify.encoreconsumermobile.layout.headers.BehaviorRetainingAppBarLayout;
import com.spotify.encoremobile.component.icons.IconVideo;
import com.spotify.legacyglue.widgetstate.StateListAnimatorImageButton;
import com.spotify.libs.sociallistening.events.proto.SocialConnectSessionAskToJoinResult;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import io.reactivex.rxjava3.subjects.BehaviorSubject;
import j$.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class y0o extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y0o(Object obj, Object obj2, byte b) {
        super(1);
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public final Object invoke(Object obj) {
        String quantityString;
        String str;
        String str2;
        k8v0 k8v0Var;
        er91 er91Var;
        byte b = this.a;
        e07 e07Var = e07.a;
        c07 c07Var = c07.a;
        Map mapSingletonMap = b7x.a;
        byte b2 = 5;
        int i = 4;
        boolean zBooleanValue = true;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                a3o a3oVar = (a3o) obj3;
                b261.n((e261) obj, ((Boolean) ((ven0) obj2).getValue()).booleanValue() ? a3oVar.e : a3oVar.d);
                return rih1Var;
            case 1:
                e261 e261Var = (e261) obj;
                Context context = (Context) obj2;
                h5o h5oVar = (j5o) obj3;
                if (h5oVar instanceof h5o) {
                    h5o h5oVar2 = h5oVar;
                    ArrayList arrayList = h5oVar2.b;
                    if (!arrayList.isEmpty()) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            if (((g5o) it.next()).a.b != null) {
                                int size = arrayList.size();
                                Integer numL = cto1.l(h5oVar2.a, size);
                                if (numL == null) {
                                    quantityString = context.getString(size == 1 ? 2131954721 : 2131954720);
                                    quantityString.getClass();
                                } else {
                                    quantityString = context.getResources().getQuantityString(2131820648, size, context.getString(numL.intValue()));
                                    quantityString.getClass();
                                }
                                b261.n(e261Var, quantityString);
                            }
                        }
                    }
                }
                return rih1Var;
            case 2:
                ((y2s) obj).b(q601.b((bpb1) obj3), new fnn((bs0) obj2, (byte) 16));
                return rih1Var;
            case 3:
                ((y2s) obj).b(q601.b((bpb1) obj3), new fnn((ug3) obj2, (byte) 17));
                return rih1Var;
            case 4:
                ((qtr) obj).b(new lcm((mr20) obj3, (pxc) obj2, (lnm) null));
                return rih1Var;
            case 5:
                elb0 elb0Var = (elb0) obj;
                int[] iArr = new int[2];
                View view = (View) obj2;
                view.getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                view.getLocationInWindow(iArr2);
                float f = iArr[0] - iArr2[0];
                float f2 = iArr[1] - iArr2[1];
                long jP = elb0Var.p(0L);
                long jB = elb0Var.b();
                int i2 = (int) (jP >> 32);
                int i3 = (int) (jP & 4294967295L);
                ((upo) obj3).h.setValue(new RectF(Float.intBitsToFloat(i2) + f, Float.intBitsToFloat(i3) + f2, Float.intBitsToFloat(i2) + f + ((int) (jB >> 32)), Float.intBitsToFloat(i3) + f2 + ((int) (jB & 4294967295L))));
                return rih1Var;
            case 6:
                String str3 = (String) obj;
                lqo lqoVar = (lqo) obj3;
                ham hamVar = lqoVar.d;
                i8h1 i8h1Var = (i8h1) hamVar.b;
                x6h1 x6h1VarC = ((zok0) hamVar.c).b.c();
                x6h1VarC.i.add(new a7h1("custom_reaction", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                lnm lnmVar = null;
                i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, mapSingletonMap), new x7h1("add_reaction", 1, Collections.singletonMap("reaction_to_be_added", str3)), x6h1VarC.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                ((cm01) lqoVar.f.get()).a(str3);
                hfm0 hfm0Var = lqoVar.c.b;
                if (hfm0Var instanceof hfm0) {
                    ((tbr0) obj2).a(new y231(new oqo(hfm0Var.a, str3)));
                } else {
                    if (!(hfm0Var instanceof gfm0)) {
                        eg.o();
                        return null;
                    }
                    fn31.T(lqoVar.a, lqoVar.e, 0, new zlo((Object) lqoVar, str3, hfm0Var, lnmVar, (byte) 1), 2);
                }
                return rih1Var;
            case 7:
                mvb1 mvb1Var = (mvb1) obj;
                es20 es20Var = (es20) ((wzn) obj3).a;
                String str4 = ((evb1) obj2).a;
                bpb1 bpb1Var = es20Var.e;
                gw20 gw20Var = (gw20) bpb1Var.getValue();
                boolean z = gw20Var.c;
                List list = gw20Var.b;
                if (!z) {
                    evb1 evb1Var = (evb1) o7h.C0(list);
                    String str5 = evb1Var != null ? evb1Var.a : null;
                    if (str5 == null ? false : str5.equals(str4)) {
                        if (!((evb1) o7h.A0(list)).b.K0(mvb1Var)) {
                            bhn0.f(gvg.h("Unexpected result ", mvb1Var.getClass().getName(), " for step ", str4));
                            return null;
                        }
                        List listL0 = o7h.l0(1, list);
                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                        Iterator it2 = listL0.iterator();
                        while (it2.hasNext()) {
                            linkedHashSet.add(new jvb1(((evb1) it2.next()).a));
                        }
                        Map map = gw20Var.a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Map.Entry entry : map.entrySet()) {
                            jvb1 jvb1Var = (jvb1) entry.getKey();
                            String str6 = jvb1Var.a;
                            if (linkedHashSet.contains(jvb1Var)) {
                                linkedHashMap.put(entry.getKey(), entry.getValue());
                            }
                        }
                        bpb1Var.m((Object) null, gw20.a(gw20Var, sqg0.P(linkedHashMap, new mmr0(new jvb1(str4), mvb1Var)), (List) null, false, 6));
                        es20Var.d();
                    }
                }
                return rih1Var;
            case 8:
                return (laa) ((vu30) ((Map.Entry) obj3).getValue()).invoke(((snc0) obj2).getMetadata(), (iac0) obj);
            case 9:
                DrawScope drawScope = (DrawScope) obj;
                l9a0 l9a0Var = (l9a0) obj3;
                x9a0 x9a0Var = (x9a0) obj2;
                vyo1.v(drawScope, l9a0Var.c.a, x9a0Var.c);
                vyo1.v(drawScope, l9a0Var.b.a, x9a0Var.b);
                vyo1.v(drawScope, l9a0Var.a.a, x9a0Var.a);
                return rih1Var;
            case 10:
                return new ia2(((evo) obj3).d.subscribe(new ha2((ven0) obj2, (byte) 1)), (byte) 1);
            case 11:
                View view2 = (View) obj;
                String str7 = ((x5r) obj3).f;
                if (str7 != null) {
                    ((iu30) obj2).invoke(new u5r(view2, str7));
                } else {
                    n57.e("DateHeaderElement - lastUpdatedMessage was null");
                }
                return rih1Var;
            case 12:
                LocalDate localDate = (LocalDate) obj;
                iu30 iu30Var = (iu30) obj2;
                s6r s6rVar = ((x6r) obj3).a;
                LocalDate localDate2 = s6rVar.a;
                LocalDate localDate3 = s6rVar.b;
                if (localDate2 == null) {
                    if (localDate3 == null) {
                        iu30Var.invoke(new t6r(localDate));
                        iu30Var.invoke(new v6r(localDate));
                    } else {
                        iu30Var.invoke(new v6r(localDate));
                    }
                } else if (localDate2.equals(localDate) && u890.j(localDate3, localDate)) {
                    iu30Var.invoke(new v6r((LocalDate) null));
                    iu30Var.invoke(new t6r((LocalDate) null));
                } else if (localDate2.equals(localDate)) {
                    iu30Var.invoke(new v6r(localDate3));
                } else if (u890.j(localDate3, localDate)) {
                    iu30Var.invoke(new t6r(localDate2));
                } else if (localDate.compareTo(localDate2) < 0) {
                    iu30Var.invoke(new v6r(localDate));
                } else {
                    iu30Var.invoke(new t6r(localDate));
                }
                return rih1Var;
            case 13:
                ((cfr) obj3).c.i((c78) obj2);
                return rih1Var;
            case 14:
                m5j0 m5j0Var = (m5j0) obj;
                k9r k9rVar = (k9r) obj3;
                if (((fwi0) k9rVar.d) == ((fwi0) obj2) && !(m5j0Var instanceof l5j0)) {
                    k9rVar.n();
                }
                return rih1Var;
            case 15:
                f07 f07Var = (f07) obj;
                c21 c21Var = (c21) obj3;
                ImageView imageView = (ImageView) c21Var.h;
                if (!(f07Var instanceof b07)) {
                    if (f07Var.equals(c07Var)) {
                        imageView.setVisibility(((plg) obj2).d == olg.b ? 0 : 8);
                        ((ArtworkView) c21Var.d).setVisibility(0);
                        ((IconVideo) c21Var.t).setVisibility(8);
                    } else {
                        if (!f07Var.equals(e07Var)) {
                            eg.o();
                            return null;
                        }
                        imageView.setVisibility(8);
                    }
                }
                return rih1Var;
            case 16:
                e261 e261Var2 = (e261) obj;
                Context context2 = ((err) obj2).a;
                oyn oynVar = (oyn) obj3;
                int i4 = oynVar.f;
                String string = oynVar.c;
                int i5 = i4 == 0 ? -1 : brr.a[l1d.C(i4)];
                if (i5 != -1) {
                    if (i5 == 1) {
                        string = context2.getString(2131954285, string);
                    } else {
                        if (i5 != 2 && i5 != 3) {
                            eg.o();
                            return null;
                        }
                        string = context2.getString(2131954284, string);
                    }
                }
                b261.n(e261Var2, string);
                return rih1Var;
            case 17:
                b07 b07Var = (f07) obj;
                wdm wdmVar = (wdm) obj2;
                srr srrVar = (srr) obj3;
                if (b07Var instanceof b07) {
                    Integer num = b07Var.a;
                    int iIntValue = num != null ? num.intValue() : srrVar.c;
                    srrVar.d = Integer.valueOf(iIntValue);
                    h72 h72Var = srrVar.a;
                    wdm wdmVar2 = srrVar.b;
                    h360.a(h72Var, (MotionLayout) wdmVar2.b, (TextView) wdmVar2.Z);
                    View view3 = (View) wdmVar.e;
                    View view4 = (View) wdmVar.d;
                    view3.setBackgroundColor(iIntValue);
                    ((BehaviorRetainingAppBarLayout) h72Var.b).setBackgroundColor(iIntValue);
                    view4.setBackgroundColor(iIntValue);
                    view4.getBackground().setAlpha(0);
                } else if (!b07Var.equals(c07Var) && !b07Var.equals(e07Var)) {
                    eg.o();
                    return null;
                }
                return rih1Var;
            case 18:
                String str8 = (String) obj;
                rhr rhrVar = (rhr) obj3;
                iu30 iu30Var2 = (iu30) rhrVar.e;
                if (iu30Var2 != null) {
                    iu30Var2.invoke(new c1w(str8));
                }
                if (rhrVar.b) {
                    yzu yzuVar = (yzu) obj2;
                    AppCompatImageButton appCompatImageButton = (StateListAnimatorImageButton) yzuVar.b;
                    EditText editText = (EditText) yzuVar.c;
                    if (editText.isFocused() && editText.getText().length() > 0) {
                        i = 0;
                    }
                    appCompatImageButton.setVisibility(i);
                }
                return rih1Var;
            case 19:
                Class cls = (Class) obj3;
                obj.getClass();
                if (cls.isAssignableFrom(obj.getClass())) {
                    return ((iu30) obj2).invoke(obj);
                }
                ClassCastException classCastException = new ClassCastException(gvg.g(obj, "Props of the wrong type passed in: "));
                StackTraceElement[] stackTrace = classCastException.getStackTrace();
                StackTraceElement[] stackTraceElementArr = new StackTraceElement[stackTrace.length + 5];
                System.arraycopy(stackTrace, 0, stackTraceElementArr, 5, stackTrace.length);
                stackTraceElementArr[0] = new StackTraceElement("[[ Received Props of this type ↓↓ ]]", "", "", 0);
                stackTraceElementArr[1] = new StackTraceElement(obj.getClass().getName(), "", "", 0);
                stackTraceElementArr[2] = new StackTraceElement("[[ But expected Props of this type ↓↓ ]]", "", "", 0);
                stackTraceElementArr[3] = new StackTraceElement(cls.getName(), "", "", 0);
                stackTraceElementArr[4] = new StackTraceElement("[[ Stacktrace ↓↓ ]]", "", "", 0);
                classCastException.setStackTrace(stackTraceElementArr);
                throw classCastException;
            case 20:
                brg0 brg0Var = (brg0) obj;
                ffe1 ffe1Var = (ffe1) obj3;
                if (brg0Var.equals(brg0.b)) {
                    ffe1Var.j(osg0.c);
                    ((hzr) obj2).a.e();
                } else if (brg0Var.equals(brg0.a)) {
                    ffe1Var.j(osg0.e);
                } else {
                    if (!brg0Var.equals(brg0.c)) {
                        eg.o();
                        return null;
                    }
                    ffe1Var.j(osg0.d);
                }
                return rih1Var;
            case 21:
                xu60 xu60Var = (zu60) obj;
                k9r k9rVar2 = (k9r) obj3;
                av60 av60Var = (av60) k9rVar2.d;
                String strP = k9rVar2.p();
                wu60 wu60Var = (wu60) obj2;
                String str9 = wu60Var.a;
                wea0 wea0Var = wu60Var.b;
                String str10 = wu60Var.e;
                Set set = wu60Var.c;
                int i6 = wu60Var.d;
                hy91 hy91VarO = SocialConnectSessionAskToJoinResult.o();
                hy91VarO.w(strP);
                hy91VarO.u(str9);
                hy91VarO.t(wea0Var.a);
                hy91VarO.s(str10);
                int iC = l1d.C(i6);
                if (iC == 0) {
                    str = "in-person";
                } else {
                    if (iC != 1) {
                        eg.o();
                        return null;
                    }
                    str = "remote";
                }
                hy91VarO.v(str);
                Set set2 = set;
                ArrayList arrayList2 = new ArrayList(q7h.U(set2, 10));
                Iterator it3 = set2.iterator();
                while (it3.hasNext()) {
                    int iOrdinal = ((ko90) it3.next()).ordinal();
                    if (iOrdinal == 0) {
                        str2 = "broadcast";
                    } else if (iOrdinal == 1) {
                        str2 = "frictionless";
                    } else if (iOrdinal == 2) {
                        str2 = "bluetooth";
                    } else if (iOrdinal == 3) {
                        str2 = "user";
                    } else {
                        if (iOrdinal != 4) {
                            eg.o();
                            return null;
                        }
                        str2 = "listening_activity";
                    }
                    arrayList2.add(str2);
                }
                hy91VarO.n(arrayList2);
                if (xu60Var != null) {
                    if (xu60Var instanceof xu60) {
                        hy91VarO.q("client");
                        String str11 = xu60Var.a;
                        if (str11 == null) {
                            str11 = "Unknown";
                        }
                        hy91VarO.r(str11);
                    } else {
                        if (!(xu60Var instanceof yu60)) {
                            eg.o();
                            return null;
                        }
                        hy91VarO.q("server");
                        hy91VarO.r(kto1.D((yu60) xu60Var));
                    }
                }
                av60Var.a.a(hy91VarO.build());
                return rih1Var;
            case 22:
                qc40 qc40Var = (qc40) obj;
                if (qc40Var.equals(pc40.a)) {
                    o3s o3sVar = (o3s) obj3;
                    fn31.T(o3sVar.g, (o8n) null, 0, new clo(o3sVar, (String) obj2, (lnm) null, (byte) 27), 3);
                } else if (!qc40Var.equals(oc40.a)) {
                    eg.o();
                    return null;
                }
                return rih1Var;
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                if (b7s.a[((qaz) obj).ordinal()] != 1) {
                    eg.o();
                    return null;
                }
                irg0 irg0Var = (irg0) obj3;
                String str12 = irg0Var.a;
                boolean z2 = irg0Var.d;
                iu30 iu30Var3 = (iu30) ((l6s) obj2).a;
                if (z2) {
                    iu30Var3.invoke(new jsg0(str12));
                } else {
                    iu30Var3.invoke(new isg0(str12));
                }
                return rih1Var;
            case 24:
                rtb0 rtb0Var = (rtb0) obj;
                rtb0.c(rtb0Var, "header", o2j.a, 2);
                rtb0.c(rtb0Var, "spacer", o2j.b, 2);
                iu30 iu30Var4 = (iu30) obj2;
                rtb0.c(rtb0Var, "create_new_folder", new j2i(676260743, new ip0(iu30Var4, (byte) 25), true), 2);
                List list2 = ((gom0) obj3).a;
                rtb0Var.e(list2.size(), new f1m(list2, (byte) 20), new f1m(list2, (byte) 21), new j2i(2039820996, new ki1(list2, iu30Var4, (byte) 4), true));
                return rih1Var;
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                List list3 = (List) obj;
                String str13 = (String) obj3;
                List listSingletonList = Collections.singletonList(str13);
                List list4 = ((urc0) obj2).b;
                if (!list3.isEmpty()) {
                    mapSingletonMap = Collections.singletonMap(str13, list3);
                }
                return new aum0(listSingletonList, (List) null, list4, mapSingletonMap, 2);
            case 26:
                t7v0 t7v0Var = (b8v0) obj;
                dgs dgsVar = (dgs) obj3;
                lzn0 lzn0Var = dgsVar.a;
                zfr zfrVar = dgsVar.d;
                if (t7v0Var instanceof y7v0) {
                    y7v0 y7v0Var = (y7v0) t7v0Var;
                    String str14 = y7v0Var.a;
                    tv80 tv80VarO = zfrVar.o(new m7v0(str14, y7v0Var.b));
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("fromPodcastSettingsPage", true);
                    lzn0Var.a(str14, tv80VarO, bundle);
                } else if (t7v0Var.equals(x7v0.b)) {
                    zfrVar.o(l7v0.e);
                    lzn0Var.e();
                } else if (t7v0Var instanceof t7v0) {
                    t7v0 t7v0Var2 = t7v0Var;
                    xhr xhrVar = dgsVar.f;
                    String str15 = t7v0Var2.a;
                    boolean z3 = t7v0Var2.b;
                    zfrVar.o(new j7v0(str15, z3));
                    if (t7v0Var2.c) {
                        xhrVar.b.b(new ln5(new i4o((Object) dgsVar, (byte) 22), xhrVar, (byte) 3), new ln5(new dor(dgsVar, (byte) 20), xhrVar, (byte) 4), new whr(xhrVar, (byte) 0)).b();
                        xhrVar.c.a(ft8.c);
                    } else if (z3) {
                        xhrVar.a.k(xhr.d);
                    } else {
                        xhrVar.a.k(xhr.e);
                    }
                    dgsVar.q.onNext(t7v0Var2);
                } else {
                    hvh1 kvh1Var = null;
                    if (t7v0Var instanceof u7v0) {
                        u7v0 u7v0Var = (u7v0) t7v0Var;
                        String str16 = u7v0Var.a;
                        lzn0Var.a(str16, zfrVar.o(new k7v0(str16, u7v0Var.b)), (Bundle) null);
                    } else if (t7v0Var instanceof a8v0) {
                        String str17 = (String) obj2;
                        a8v0 a8v0Var = (a8v0) t7v0Var;
                        boolean z4 = a8v0Var.b;
                        BehaviorSubject behaviorSubject = dgsVar.r;
                        Boolean bool = (Boolean) behaviorSubject.h();
                        if (bool != null) {
                            zBooleanValue = bool.booleanValue();
                        } else if (z4) {
                            zBooleanValue = false;
                        }
                        zfrVar.o(new n7v0(zBooleanValue));
                        behaviorSubject.onNext(Boolean.valueOf(z4));
                        dgsVar.u.b(j2h1.D(dgsVar.o, new zlo((Object) dgsVar, str17, (Object) a8v0Var, (lnm) kvh1Var, (byte) 15)).subscribe(ps4.t, new ags(dgsVar, zBooleanValue, (byte) 0)));
                    } else if (t7v0Var.equals(x7v0.a)) {
                        zfrVar.o(l7v0.c);
                    } else if (t7v0Var instanceof w7v0) {
                        otr otrVar = dgsVar.j;
                        String str18 = ((w7v0) t7v0Var).a;
                        xab1 xab1Var = otrVar.e;
                        if (xab1Var != null) {
                            xab1Var.d((CancellationException) null);
                        }
                        otrVar.e = fn31.T(smo1.e(otrVar.c), (o8n) null, 0, new p1r(otrVar, str18, kvh1Var, b2), 3);
                    } else if ((t7v0Var instanceof z7v0) && (k8v0Var = (m8v0) dgsVar.t.h()) != null) {
                        if (k8v0Var instanceof i8v0) {
                            kvh1Var = hvh1.a;
                        } else if (k8v0Var instanceof k8v0) {
                            kvh1Var = new kvh1(k8v0Var.a);
                        } else if (k8v0Var instanceof j8v0) {
                            kvh1Var = jvh1.a;
                        } else if (!(k8v0Var instanceof h8v0)) {
                            eg.o();
                            return null;
                        }
                        if (kvh1Var != null) {
                            lzn0Var.a("spotify:internal:magpie:update-cadence", zfrVar.o(l7v0.d), i7w0.e(iko1.y(kvh1Var, bm41.b)));
                        }
                    }
                }
                return rih1Var;
            case 27:
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                tjq tjqVar = (tjq) obj3;
                tjqVar.getClass();
                if (zBooleanValue2) {
                    n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131960239});
                    n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
                    er91Var = new er91((fs91) null, "", 2131960239, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false);
                } else {
                    n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131960238});
                    n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
                    er91Var = new er91((fs91) null, "", 2131960238, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false);
                }
                ((kt91) tjqVar.b).k(er91Var);
                y0o y0oVar = (y0o) tjqVar.e;
                if (y0oVar != null) {
                    y0oVar.invoke(new a8v0((String) obj2, zBooleanValue2));
                    return rih1Var;
                }
                u890.C("eventHandler");
                throw null;
            case 28:
                chs chsVar = (chs) obj3;
                return (uov0) chs.e(chsVar, chs.c(chsVar).a((String) obj2), new i3o((String) obj, (byte) 13));
            default:
                r7l1 r7l1Var = (r7l1) obj;
                iu30 iu30Var5 = (iu30) obj3;
                r3w0 r3w0Var = (r3w0) ((toj0) obj2).f;
                if (r3w0Var != null) {
                    iu30Var5.invoke(new q3w0((s3w0) r3w0Var.a.get(r7l1Var.a)));
                    return rih1Var;
                }
                u890.C("model");
                throw null;
        }
    }
}
