package p;

import android.app.DatePickerDialog;
import android.content.Context;
import android.text.Html;
import android.view.View;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.betamax.player.VideoSurfaceView;
import com.spotify.encoremobile.component.listrow.EncoreListRow;
import j$.time.ZonedDateTime;
import j$.time.format.DateTimeFormatter;
import j$.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class cb8 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cb8(Object obj, boolean z, byte b) {
        super(1);
        this.a = b;
        this.c = obj;
        this.b = z;
    }

    /* JADX WARN: Code duplicated, block: B:266:0x05d2  */
    public final Object invoke(Object obj) {
        zc8 zc8Var;
        ArrayList arrayList;
        xn70 xn70Var;
        String strW;
        c380 c380VarA;
        asz0 asz0Var;
        ati1 ati1Var;
        bul bulVar;
        mq70 mq70Var;
        up70 up70VarA;
        String str;
        xr3 mcyVar;
        byte b = this.a;
        fcy fcyVar = null;
        rih1 rih1Var = rih1.a;
        boolean z = this.b;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                List list = (List) obj;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : list) {
                    if (obj3 instanceof jo70) {
                        arrayList2.add(obj3);
                    }
                }
                jo70 jo70Var = (jo70) o7h.s0(arrayList2);
                ArrayList arrayList3 = new ArrayList();
                for (Object obj4 : list) {
                    if (obj4 instanceof xkk1) {
                        arrayList3.add(obj4);
                    }
                }
                xkk1 xkk1Var = (xkk1) o7h.s0(arrayList3);
                ArrayList arrayList4 = new ArrayList();
                for (Object obj5 : list) {
                    if (obj5 instanceof hll) {
                        arrayList4.add(obj5);
                    }
                }
                hll hllVar = (hll) o7h.s0(arrayList4);
                ArrayList arrayList5 = new ArrayList();
                for (Object obj6 : list) {
                    if (obj6 instanceof pnt) {
                        arrayList5.add(obj6);
                    }
                }
                pnt pntVar = (pnt) o7h.s0(arrayList5);
                ArrayList arrayList6 = new ArrayList();
                for (Object obj7 : list) {
                    if (obj7 instanceof a7q0) {
                        arrayList6.add(obj7);
                    }
                }
                a7q0 a7q0Var = (a7q0) o7h.s0(arrayList6);
                ArrayList arrayList7 = new ArrayList();
                for (Object obj8 : list) {
                    if (obj8 instanceof w281) {
                        arrayList7.add(obj8);
                    }
                }
                w281 w281Var = (w281) o7h.s0(arrayList7);
                ArrayList arrayList8 = new ArrayList();
                for (Object obj9 : list) {
                    if (obj9 instanceof l98) {
                        arrayList8.add(obj9);
                    }
                }
                l98 l98Var = (l98) o7h.s0(arrayList8);
                if (z) {
                    ArrayList arrayList9 = new ArrayList();
                    for (Object obj10 : list) {
                        if (obj10 instanceof zc8) {
                            arrayList9.add(obj10);
                        }
                    }
                    zc8Var = (zc8) o7h.s0(arrayList9);
                } else {
                    zc8Var = null;
                }
                if (jo70Var == null) {
                    return r6g1.a;
                }
                List list2 = jo70Var.d;
                if (list2.isEmpty()) {
                    list2 = null;
                }
                if (list2 != null) {
                    List list3 = list2;
                    arrayList = new ArrayList(q7h.U(list3, 10));
                    Iterator it = list3.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((ho70) it.next()).a);
                    }
                } else {
                    arrayList = null;
                }
                if (arrayList != null) {
                    fb8 fb8Var = (fb8) ((bv40) obj2).b;
                    xn70Var = new xn70(fb8Var.a.getString(2131952636, fb8Var.b.a(arrayList)), (String) null, 6, (String) null);
                } else {
                    xn70Var = null;
                }
                String str2 = jo70Var.a;
                if (pntVar != null) {
                    String str3 = pntVar.a;
                    if (ihc1.y0(str3)) {
                        str3 = null;
                    }
                    strW = str3 != null ? nhc1.W(Html.fromHtml(str3, 0).toString(), "\n", " ") : null;
                } else {
                    strW = null;
                }
                if (l98Var != null) {
                    ArrayList arrayList10 = l98Var.a;
                    ArrayList arrayList11 = new ArrayList(q7h.U(arrayList10, 10));
                    Iterator it2 = arrayList10.iterator();
                    while (it2.hasNext()) {
                        arrayList11.add(((k98) it2.next()).a);
                    }
                    c380VarA = mqo1.A(arrayList11);
                } else {
                    c380VarA = null;
                }
                if (a7q0Var != null) {
                    y6q0 y6q0Var = a7q0Var.d;
                    asz0Var = y6q0Var != null ? new asz0(y6q0Var.a) : csz0.c;
                } else {
                    asz0Var = null;
                }
                if (w281Var != null) {
                    job jobVarK = pqo.k(w281Var);
                    job jobVar = jobVarK instanceof job ? jobVarK : null;
                    ati1Var = jobVar != null ? new ati1(jobVar.a) : null;
                } else {
                    ati1Var = null;
                }
                if (zc8Var != null) {
                    String str4 = zc8Var.i;
                    if (ihc1.y0(str4)) {
                        str4 = null;
                    }
                    if (str4 != null) {
                        bulVar = new bul(str4);
                    } else {
                        bulVar = null;
                    }
                } else {
                    bulVar = null;
                }
                List list4 = hllVar != null ? hllVar.b : null;
                if (list4 == null) {
                    list4 = z6x.a;
                }
                c380 c380VarA2 = mqo1.A(list4);
                if (xkk1Var != null && (mq70Var = xkk1Var.a) != null && (up70VarA = mq70Var.a(vp70.c)) != null) {
                    fcyVar = up70VarA.a.a;
                }
                return new q6g1(xn70Var, new bv11(str2, strW, (Long) null, (Long) null, (u380) null, 0, false, c380VarA2, (h540) null, asz0Var, c380VarA, new sz6(fcyVar != null ? fcyVar : ""), false, (String) null, (Long) null, 0L, (o5a1) null, (wqo) null, bulVar, (po11) null, (msv0) null, ati1Var, (c380) null, (String) null, (ktl) null, 64745852));
            case 1:
                vhd0 vhd0Var = (vhd0) obj2;
                uba ubaVar = vhd0Var.b;
                c4m0 c4m0VarA = vhd0Var.a((xhm1) obj);
                char c = z ? (char) 1 : (char) 2;
                x6h1 x6h1VarC = c4m0VarA.c.c();
                if (c == 1) {
                    str = "correct";
                } else {
                    if (c != 2) {
                        throw null;
                    }
                    str = "incorrect";
                }
                x6h1VarC.i.add(new a7h1("quiz_feedback", "listening_age", (Integer) null, (String) null, str));
                x6h1VarC.j = true;
                y6h1 y6h1VarA = x6h1VarC.a();
                k7h1 k7h1Var = new k7h1();
                ((xjn) k7h1Var).a = y6h1VarA;
                ((xjn) k7h1Var).b = c4m0VarA.b;
                ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
                return ubaVar.p(k7h1Var.a(), vhd0.d);
            case 2:
                e261 e261Var = (e261) obj;
                b261.x(e261Var, 2);
                b261.E(e261Var, kbb.n(((enf) obj2).c));
                if (z) {
                    b261.a(e261Var);
                }
                return rih1Var;
            case 3:
                ((kd31) obj).b(z ? ((Number) ((o95) obj2).e()).floatValue() : 0.0f);
                return rih1Var;
            case 4:
                ZonedDateTime zonedDateTime = (ZonedDateTime) obj;
                s7r s7rVar = (s7r) obj2;
                Context context = s7rVar.a;
                Locale locale = s7rVar.c;
                if (z) {
                    String string = context.getResources().getString(2131954676, DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG).withLocale(locale).format(zonedDateTime));
                    string.getClass();
                    return string;
                }
                String string2 = context.getResources().getString(2131959126, DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT).withLocale(locale).format(zonedDateTime));
                string2.getClass();
                return string2;
            case 5:
                View view = (View) obj2;
                if (z) {
                    view.setKeepScreenOn(true);
                }
                return new eou(view, (byte) 0);
            case 6:
                ArrayList arrayList12 = ((kex) obj2).a;
                ((rtb0) obj).e(arrayList12.size(), new tjk(arrayList12, (byte) 1), new ry4(arrayList12, (byte) 18), new j2i(2039820996, new jex(arrayList12, z), true));
                return rih1Var;
            case 7:
                ecy ecyVar = (ecy) obj;
                lly llyVar = (lly) obj2;
                EncoreListRow encoreListRow = llyVar.c;
                Context context2 = llyVar.a;
                iu30 iu30Var = llyVar.d;
                yky ykyVar = new yky(llyVar, (byte) 1);
                fcy fcyVarFindViewById = encoreListRow.getBinding().a.findViewById(2131428936);
                if (ecyVar != null) {
                    fcyVarFindViewById.setVisibility(0);
                    fcy fcyVar2 = fcyVarFindViewById instanceof fcy ? fcyVarFindViewById : null;
                    if (fcyVar2 != null) {
                        fcyVar2.f(ecyVar);
                    } else {
                        if (ecyVar.c) {
                            mcyVar = new xr3(context2);
                            if (z) {
                                mcyVar.setPadding(mcyVar.getResources().getDimensionPixelSize(2131166800), 0, mcyVar.getResources().getDimensionPixelSize(2131166799), 0);
                            }
                            mcyVar.e.a(ecyVar);
                            if (iu30Var != null) {
                                lvx.v(mcyVar, iu30Var, ykyVar);
                            }
                        } else {
                            mcyVar = new mcy(context2);
                            if (z) {
                                mcyVar.getRootView().setPadding(mcyVar.getRootView().getContext().getResources().getDimensionPixelSize(2131166800), 0, mcyVar.getRootView().getContext().getResources().getDimensionPixelSize(2131166799), 0);
                            }
                            ((mcy) mcyVar).b.a(ecyVar);
                            if (iu30Var != null) {
                                lvx.v(mcyVar, iu30Var, ykyVar);
                            }
                        }
                        k8p1.o(fcyVarFindViewById, mcyVar);
                    }
                } else {
                    fcyVarFindViewById.setVisibility(8);
                }
                return rih1Var;
            case 8:
                rtb0 rtb0Var = (rtb0) obj;
                if (z) {
                    rtb0.c(rtb0Var, (Object) null, new j2i(144570060, new luy((ouy) obj2, (byte) 0), true), 3);
                }
                return rih1Var;
            case 9:
                String str5 = (String) obj;
                if (z) {
                    return new huz(or11.a, (byte) 10);
                }
                if (!z) {
                    return ((tzo) obj2).c(str5);
                }
                eg.o();
                return null;
            case 10:
                String str6 = ((uv11) obj).a;
                return new wcm(str6, (String) null, (String) null, (ucm) null, (Function0) null, new sg6((byte) 3, z), false, xpn1.r(str6, (ymd0) obj2), (String) null, 862);
            case 11:
                return new ly40(((j7s) obj2).b ? 3 : z ? 2 : 1);
            case 12:
                kd31 kd31Var = (kd31) obj;
                float f = ((zqz0) obj2).b;
                if (z) {
                    f = -f;
                }
                kd31Var.p(f);
                return rih1Var;
            case 13:
                return new ca90(z ? System.nanoTime() : 0L, (da90) obj2);
            case 14:
                y6h1 y6h1Var = ((j2l0) obj).a;
                List list5 = (List) obj2;
                b7x b7xVar = b7x.a;
                if (list5 != null) {
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", "")), y6h1Var, r6h1.c, System.currentTimeMillis());
                }
                return z ? new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_deselect", 1, b7xVar), y6h1Var, r6h1.c, System.currentTimeMillis()) : new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_select", 1, b7xVar), y6h1Var, r6h1.c, System.currentTimeMillis());
            case 15:
                e261 e261Var2 = (e261) obj;
                e261Var2.b(wlf0.a, Integer.valueOf(((bmf0) obj2).a));
                e261Var2.b(wlf0.b, Boolean.valueOf(z));
                return rih1Var;
            case 16:
                ((thu0) obj2).getClass();
                return Boolean.valueOf(thu0.b((wsc0) obj, z));
            case 17:
                e261 e261Var3 = (e261) obj;
                b261.x(e261Var3, 1);
                h4z0 h4z0Var = (h4z0) obj2;
                b261.E(e261Var3, h4z0Var.f() ? rze1.a : rze1.b);
                if (!z) {
                    b261.a(e261Var3);
                }
                if (h4z0Var instanceof g4z0) {
                    b261.t(e261Var3, 0);
                }
                return rih1Var;
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                e261 e261Var4 = (e261) obj;
                jmb1 jmb1Var = (unb1) obj2;
                if (jmb1Var instanceof jmb1) {
                    b261.n(e261Var4, jmb1Var.b.a);
                }
                b261.x(e261Var4, 3);
                b261.y(e261Var4, z);
                return rih1Var;
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                rtb0 rtb0Var2 = (rtb0) obj;
                if (z) {
                    u7n0.D(rtb0Var2, (zba1) obj2, "song_dna_search_result_item");
                } else {
                    rtb0.c(rtb0Var2, "song_dna_search_go_deeper", ujj.b, 2);
                }
                return rih1Var;
            case 20:
                e261 e261Var5 = (e261) obj;
                b261.n(e261Var5, ((zsb1) obj2).f);
                if (z) {
                    b261.x(e261Var5, 0);
                }
                return rih1Var;
            case 21:
                if (!z) {
                    ((DatePickerDialog) obj2).show();
                }
                return Boolean.TRUE;
            case 22:
                lsl lslVar = (lsl) obj;
                lslVar.s1();
                if (z) {
                    DrawScope.S0(lslVar, (mic0) obj2, 0L, 0L, 0.0f, (DrawStyle) null, (ColorFilter) null, 6, 62);
                }
                return rih1Var;
            case 23:
                VideoSurfaceView videoSurfaceView = (VideoSurfaceView) obj;
                if (!z) {
                    ((uoa) obj2).d(videoSurfaceView);
                }
                return rih1Var;
            default:
                atj1 atj1Var = (atj1) obj;
                ywv0 ywv0Var = (ywv0) obj2;
                return new btj1(2, (z || ((Boolean) ((kly0) ywv0Var.b).get()).booleanValue() || !((pe) ywv0Var.d).b(4)) ? false : true, atj1Var.b, atj1Var.a, new y2u0(0, false, false, false));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cb8(boolean z, Object obj, byte b) {
        super(1);
        this.a = b;
        this.b = z;
        this.c = obj;
    }
}
