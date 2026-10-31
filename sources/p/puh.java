package p;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Bundle;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import com.spotify.concertcampaignview.v1.CampaignRoutingWithStatus;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class puh extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public puh(ven0 ven0Var, ajq0 ajq0Var) {
        super(1);
        this.a = (byte) 2;
        this.c = ven0Var;
        this.b = ajq0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        byte b2 = 1;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                elb0 elb0Var = (elb0) obj;
                ((ajq0) obj3).e = elb0Var;
                ((drr0) obj2).t((int) (elb0Var.b() & 4294967295L));
                return rih1Var;
            case 1:
                ajq0 ajq0Var = (ajq0) obj3;
                ((err0) ajq0Var.c).t((int) (((elb0) obj).b() & 4294967295L));
                ((iu30) obj2).invoke(new l160(0, ((err0) ajq0Var.c).s(), 1));
                return rih1Var;
            case 2:
                kd31 kd31Var = (kd31) obj;
                int iIntValue = ((Number) ((tob1) obj2).getValue()).intValue();
                ajq0 ajq0Var2 = (ajq0) obj3;
                boolean zBooleanValue = ((Boolean) ((hrr0) ajq0Var2.b).getValue()).booleanValue();
                int iS = ((err0) ajq0Var2.c).s();
                float fMax = 0.0f;
                if (zBooleanValue) {
                    float f = iS;
                    fMax = Math.max(0.0f, (iIntValue + f) / f);
                }
                kd31Var.b(fMax);
                return rih1Var;
            case 3:
                z1i z1iVar = (z1i) obj3;
                Object obj4 = z1iVar.b;
                if (obj4 != null) {
                    iu30 iu30Var = (iu30) obj2;
                    Object objInvoke = z1iVar.a().invoke(obj4, obj);
                    if (objInvoke != null) {
                        iu30Var.invoke(objInvoke);
                    }
                }
                return rih1Var;
            case 4:
                rtb0 rtb0Var = (rtb0) obj;
                iu30 iu30Var2 = (iu30) obj2;
                rtb0.f(rtb0Var, "header", new j2i(-748724330, new t7i(iu30Var2, (byte) 0), true), 2);
                bw7 bw7Var = (bw7) obj3;
                List list = bw7Var.b;
                rtb0Var.e(list.size(), new kwd(list, (byte) 16), new kwd(list, (byte) 17), new j2i(802480018, new rf1(list, (Object) bw7Var, iu30Var2, (byte) 4), true));
                return rih1Var;
            case 5:
                ((iu30) obj3).invoke(new a5a(((d5a) obj2).g.concat(":hyperlink"), (String) obj));
                return rih1Var;
            case 6:
                xse xseVar = (xse) obj;
                ((iu30) obj3).invoke(new yse(xseVar, ((zse) obj2).a.indexOf(xseVar)));
                return rih1Var;
            case 7:
                e261 e261Var = (e261) obj;
                f9m f9mVar = (f9m) obj3;
                b261.n(e261Var, Pattern.compile("\\[([^]]+)]\\(([^)]+)\\)").matcher(nhc1.W(f9mVar.a, "*", "")).replaceAll("$1"));
                if (f9mVar.j != null) {
                    b261.g(e261Var, (String) null, new xei((iu30) obj2, (byte) 5));
                }
                return rih1Var;
            case 8:
                ((iu30) obj3).invoke(new z6u(((a7u) obj2).a));
                return rih1Var;
            case 9:
                ArrayList arrayList = ((ypy) obj3).b;
                ((rtb0) obj).e(arrayList.size(), new ry4(arrayList, (byte) 6), new ry4(arrayList, (byte) 7), new j2i(802480018, new lmi(arrayList, (iu30) obj2, (byte) 0), true));
                return rih1Var;
            case 10:
                mix mixVar = (mix) obj;
                c9 c9Var = (c9) obj2;
                iu30 iu30Var3 = (iu30) obj3;
                if (mixVar.equals(gix.a)) {
                    iu30Var3.invoke(be20.a);
                } else if (!mixVar.equals(hix.a)) {
                    if (mixVar instanceof iix) {
                        nix nixVar = ((iix) mixVar).a;
                        iu30Var3.invoke(new zd20(new de20(c9Var.indexOf(nixVar), nixVar.a, nixVar.b)));
                    } else if (mixVar instanceof jix) {
                        nix nixVar2 = ((jix) mixVar).a;
                        iu30Var3.invoke(new ae20(new de20(c9Var.indexOf(nixVar2), nixVar2.a, nixVar2.b)));
                    } else if (!(mixVar instanceof kix) && !(mixVar instanceof lix)) {
                        eg.o();
                        return null;
                    }
                }
                return rih1Var;
            case 11:
                ((iu30) obj3).invoke(new ib80(((mb80) obj2).g.concat(":disclaimerLink"), (String) obj));
                return rih1Var;
            case 12:
                e261 e261Var2 = (e261) obj;
                b261.x(e261Var2, 2);
                b261.E(e261Var2, kbb.n(((a0g) obj3).c));
                String str = (String) obj2;
                if (str != null) {
                    b261.A(e261Var2, str);
                    b261.a(e261Var2);
                }
                return rih1Var;
            case 13:
                kct0 kct0Var = (kct0) obj2;
                ((iu30) obj3).invoke(new xym1(kct0Var.g, kct0Var.f));
                return rih1Var;
            case 14:
                ((iu30) obj3).invoke(new wdv0(((xdv0) obj).a, ((ydv0) obj2).a));
                return rih1Var;
            case 15:
                vx21 vx21Var = (vx21) obj;
                if (((wx21) obj3).b == ox3.a) {
                    ((iu30) obj2).invoke(vx21Var);
                }
                return rih1Var;
            case 16:
                ((iu30) obj3).invoke(new ltc1(((mtc1) obj2).a));
                return rih1Var;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                iu30 iu30Var4 = (iu30) obj3;
                int iOrdinal = ((cyi1) obj).ordinal();
                if (iOrdinal == 0) {
                    iu30Var4.invoke(fyi1.a);
                } else {
                    if (iOrdinal != 1) {
                        eg.o();
                        return null;
                    }
                    byi1 byi1Var = ((hyi1) obj2).e;
                    if (byi1Var != null) {
                        iu30Var4.invoke(new eyi1(byi1Var.b));
                    }
                }
                return rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                ((iu30) obj3).invoke(((wim) obj2).a);
                return rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return new xuj((cir0) obj, (yuj) obj3, (j2i) obj2, (byte) 0);
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return new gvj((cir0) obj, (hvj) obj3, (j2i) obj2, (byte) 0);
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                nme0 nme0Var = (nme0) obj;
                iu30 iu30Var5 = (iu30) obj2;
                fad0 fad0Var = (fad0) obj3;
                if (nme0Var instanceof jme0) {
                    fad0Var.j(st80.d);
                    iu30Var5.invoke(ile0.a);
                } else if (nme0Var instanceof kme0) {
                    fad0Var.j(st80.k);
                    iu30Var5.invoke(jle0.a);
                } else if (nme0Var instanceof lme0) {
                    String str2 = ((lme0) nme0Var).a;
                    fad0Var.j(new du80(str2));
                    iu30Var5.invoke(new sle0(str2));
                } else {
                    if (!(nme0Var instanceof mme0)) {
                        eg.o();
                        return null;
                    }
                    fad0Var.j(st80.e);
                    iu30Var5.invoke(new sle0(""));
                }
                return rih1Var;
            case 22:
                h3h1 h3h1Var = new h3h1(new cb1((r6h1) obj2, (byte) 13));
                k3h1 k3h1Var = new k3h1(((hwq) obj3).a);
                wch wchVar = q6x.b;
                if (!h3h1Var.equals(wchVar) || !k3h1Var.equals(wchVar)) {
                    if (h3h1Var.equals(wchVar)) {
                        return k3h1Var;
                    }
                    if (k3h1Var.equals(wchVar)) {
                        return h3h1Var;
                    }
                    wchVar = new wch(h3h1Var, k3h1Var);
                }
                return wchVar;
            case 23:
                return new ht0((dw91) obj3, (String) obj2, (byte) 15);
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return new xuj((cir0) obj, (kyj) obj3, (j2i) obj2, (byte) 1);
            case 25:
                return new n59((cir0) obj, (qyj) obj3, (j2i) obj2, (byte) 1);
            case 26:
                List list2 = (List) obj2;
                d520 d520Var = (d520) obj3;
                xab1 xab1Var = (xab1) d520Var.h;
                if (xab1Var != null) {
                    xab1Var.d((CancellationException) null);
                }
                d520Var.h = fn31.T(cto1.q((iac0) d520Var.g), (o8n) null, 0, new eak(d520Var, list2, null, (byte) 0), 3);
                d520Var.e0(2131956597, list2);
                return rih1Var;
            case 27:
                tv80 tv80Var = (tv80) obj;
                rak rakVar = (rak) obj3;
                if (((Boolean) rakVar.i.getValue()).booleanValue()) {
                    q7r0 q7r0Var = rakVar.b;
                    Bundle bundle = new Bundle();
                    xbk xbkVar = (xbk) ((tob1) obj2).getValue();
                    long jB = rakVar.d.b() + 86400000;
                    String str3 = xbkVar.a;
                    nbk nbkVar = xbkVar.b;
                    String str4 = nbkVar.d;
                    String str5 = nbkVar.b;
                    u7h u7hVar = xbkVar.f51p;
                    Integer numValueOf = u7hVar != null ? Integer.valueOf(z4p1.G(u7hVar.a)) : null;
                    List list3 = xbkVar.d;
                    ArrayList arrayList2 = new ArrayList(q7h.U(list3, 10));
                    Iterator it = list3.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(((CampaignRoutingWithStatus) it.next()).n().n());
                    }
                    List list4 = xbkVar.e;
                    ArrayList arrayList3 = new ArrayList(q7h.U(list4, 10));
                    Iterator it2 = list4.iterator();
                    while (it2.hasNext()) {
                        arrayList3.add(((CampaignRoutingWithStatus) it2.next()).n().n());
                    }
                    bundle.putParcelable("reserved_onboarding", new rr21(str3, str4, str5, numValueOf, arrayList2, arrayList3, xbkVar.h, xbkVar.j, jB));
                    q7r0Var.d("spotify:internal:reserved-onboarding", tv80Var, bundle);
                }
                return rih1Var;
            case 28:
                lsl lslVar = (lsl) obj;
                lslVar.s1();
                float fS = ((drr0) obj2).s() * Float.intBitsToFloat((int) (lslVar.j() & 4294967295L));
                float f2 = rck.b;
                float fX0 = lslVar.X0(1.0f) + lslVar.X0(16.0f);
                long j = ((hdk) obj3).l;
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fX0)) << 32) | (((long) Float.floatToRawIntBits(fS)) & 4294967295L);
                long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fS)) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (lslVar.j() >> 32)) - fX0)) << 32);
                float fX1 = lslVar.X0(1.0f);
                njs0 njs0Var = z4p1.B(j) < 0.5f ? new njs0(1.0f, j, u7h.b(u7h.f, 0.25f, 0.0f, 0.0f, 0.0f, 14)) : new njs0(-1.0f, j, u7h.b(u7h.b, 0.15f, 0.0f, 0.0f, 0.0f, 14));
                u84 u84VarP = lslVar.a1().p();
                Paint paint = new Paint(1);
                paint.setColor(z4p1.G(njs0Var.b));
                paint.setStrokeWidth(fX1);
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeCap(Paint.Cap.BUTT);
                paint.setMaskFilter(new BlurMaskFilter(1.0f, BlurMaskFilter.Blur.NORMAL));
                Canvas canvas = v84.a;
                Canvas canvas2 = u84VarP.a;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L));
                float f3 = njs0Var.c;
                canvas2.drawLine(fIntBitsToFloat, fIntBitsToFloat2 + f3, Float.intBitsToFloat((int) (jFloatToRawIntBits2 >> 32)), Float.intBitsToFloat((int) (jFloatToRawIntBits2 & 4294967295L)) + f3, paint);
                DrawScope.p0(lslVar, njs0Var.a, jFloatToRawIntBits, jFloatToRawIntBits2, fX1, 0, (uw4) null, 496);
                return rih1Var;
            default:
                o4o1.o((y2s) obj, (kdn0) obj3, new cfk((jb3) obj2, b2));
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ puh(Object obj, Object obj2, byte b) {
        super(1);
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }
}
