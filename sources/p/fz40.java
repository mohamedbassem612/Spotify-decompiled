package p;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.compose.ui.geometry.Offset;
import com.spotify.gpb.googlecheckout.GoogleCheckoutActivity;
import com.spotify.radio.radio.formatlist.RadioFormatListService;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import io.reactivex.rxjava3.core.Flowable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class fz40 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fz40(Object obj, Object obj2, byte b) {
        super(1);
        this.a = b;
        this.c = obj;
        this.b = obj2;
    }

    public final Object invoke(Object obj) {
        String string;
        View.OnClickListener t230Var;
        byte b = this.a;
        b7x b7xVar = b7x.a;
        byte b2 = 1;
        byte b3 = 0;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.b;
        Object obj3 = this.c;
        switch (b) {
            case 0:
                Context context = ((uf0) obj3).a;
                int i = RadioFormatListService.e;
                Intent intent = new Intent(context, (Class<?>) RadioFormatListService.class);
                intent.putExtra(".seed_uri", (String) obj2);
                context.startService(intent);
                return rih1Var;
            case 1:
                ((t2) obj3).a.a((String) obj2, (tv80) obj, (Bundle) null);
                return rih1Var;
            case 2:
                String str = (String) obj;
                GoogleCheckoutActivity googleCheckoutActivity = (GoogleCheckoutActivity) obj3;
                uba ubaVarM0 = googleCheckoutActivity.m0();
                x6h1 x6h1VarC = ((ttk0) obj2).b.c();
                x6h1VarC.i.add(new a7h1("change_country_link", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                ubaVarM0.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str)), x6h1VarC.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                googleCheckoutActivity.n0().U(new v050(str));
                return rih1Var;
            case 3:
                mmr0 mmr0Var = new mmr0("PLAY_STORE_COUNTRY", ((zsa) ((v231) ((j331) obj3)).a).a);
                t2d1 t2d1Var = (t2d1) ((v231) ((j331) obj2)).a;
                return sqg0.J(new mmr0[]{mmr0Var, new mmr0("IS_SUPPORTED", t2d1Var.a ? "1" : "0"), new mmr0("REASON", h4b1.l(t2d1Var.b))});
            case 4:
                sp00 sp00Var = (sp00) obj3;
                i8h1 i8h1VarN = sp00Var.n();
                x6h1 x6h1VarC2 = ((txk0) sp00Var.c).b.c();
                x6h1VarC2.i.add(new a7h1("support_site_link", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                i8h1VarN.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("navigate_to_external_uri", 1, Collections.singletonMap("destination", (String) obj)), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                ((Function0) obj2).invoke();
                return rih1Var;
            case 5:
                lsl lslVar = (lsl) obj;
                lslVar.s1();
                jmr0 jmr0Var = (jmr0) obj3;
                lw4 lw4Var = (lw4) obj2;
                fid fidVarP = lslVar.a1().p();
                lw4Var.b(6);
                try {
                    fidVarP.j(anm1.g(0L, lslVar.j()), lw4Var);
                    jmr0.g(jmr0Var, lslVar, lslVar.j(), 0.0f, (f2b) null, 6);
                    return rih1Var;
                } finally {
                    fidVarP.i();
                }
            case 6:
                c380 c380Var = (c380) obj3;
                wg50 wg50Var = wg50.b;
                ((rtb0) obj).e(c380Var.size(), new f1m(c380Var), new xg50(c380Var, (byte) 0), new j2i(802480018, new ot(c380Var, (yg50) obj2, (byte) 10), true));
                return rih1Var;
            case 7:
                Set set = s4b1.f;
                String strZ = uic.C((String) obj, null).z();
                strZ.getClass();
                lc20 lc20Var = (lc20) obj3;
                i8h1 i8h1Var = (i8h1) lc20Var.b;
                wqk0 wqk0Var = (wqk0) lc20Var.d;
                x6h1 x6h1VarC3 = wqk0Var.c.c();
                x6h1VarC3.i.add(new a7h1("member", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC3.j = false;
                ((lh50) obj2).e.a(strZ, i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", strZ)), x6h1VarC3.a(), wqk0Var.b, System.currentTimeMillis()), (xj61) null), (Bundle) null);
                return rih1Var;
            case 8:
                xj50 xj50Var = (xj50) obj2;
                ((iu30) obj3).invoke(new uj50(new vj50(xj50Var.e, xj50Var.a, xj50Var.b, xj50Var.c, xj50Var.d), (tqw) obj));
                return rih1Var;
            case 9:
                nq50 nq50Var = (nq50) obj3;
                List list = nq50Var.a;
                ((rtb0) obj).e(list.size(), new xg50(list, (byte) 1), new xg50(list, (byte) 2), new j2i(2039820996, new rf1((byte) 13, (jd6) obj2, nq50Var, list), true));
                return rih1Var;
            case 10:
                svh0 svh0Var = (svh0) obj3;
                return new hp0(((los) svh0Var.c).c(new c861(svh0Var, new i030((ven0) obj2, (byte) 11), (byte) 19)), (byte) 8);
            case 11:
                ku50 ku50Var = (ku50) obj;
                mjh mjhVar = (mjh) obj3;
                bcl1 bcl1Var = mjhVar.b;
                hp80 hp80Var = ((o0i) obj2).e;
                String strH = cbp1.h("hashtag_cloud", ku50Var.a);
                String str2 = ku50Var.d;
                ((lzn0) mjhVar.c).a(str2, bcl1Var.d(hp80Var, strH, (String) o7h.q0(ihc1.Q0(str2, new String[]{"?"}, 0, 6)), ku50Var.e, new mu50(ku50Var, (byte) 0)), (Bundle) null);
                return rih1Var;
            case 12:
                ku50 ku50Var2 = (ku50) obj;
                qu50 qu50Var = (qu50) obj3;
                bcl1 bcl1Var2 = qu50Var.c;
                hp80 hp80Var2 = ((o0i) obj2).e;
                String strH2 = cbp1.h("hashtag_row", ku50Var2.a);
                String str3 = ku50Var2.d;
                qu50Var.b.a(str3, bcl1Var2.d(hp80Var2, strH2, (String) o7h.q0(ihc1.Q0(str3, new String[]{"?"}, 0, 6)), ku50Var2.e, new mu50(ku50Var2, (byte) 1)), (Bundle) null);
                return rih1Var;
            case 13:
                c380 c380Var2 = ((pu50) obj3).a;
                ((rtb0) obj).e(c380Var2.size(), (iu30) null, new xg50(c380Var2, (byte) 3), new j2i(802480018, new ki1(c380Var2, (iu30) obj2, (byte) 5), true));
                return rih1Var;
            case 14:
                int iOrdinal = ((mt70) obj).ordinal();
                if (iOrdinal == 0) {
                    ((lzn0) obj3).e();
                    return null;
                }
                if (iOrdinal == 1) {
                    ((g050) ((s060) obj2).Y).invoke();
                    return zz50.a;
                }
                eg.o();
                return null;
            case 15:
                ((p5t0) obj).f((q5t0) obj3, 0, (-((Number) ((ven0) obj2).getValue()).intValue()) / 2, 0.0f);
                return rih1Var;
            case 16:
                p5t0 p5t0Var = (p5t0) obj;
                if (((Number) ((v260) obj3).a.getValue()).floatValue() > 0.0f) {
                    p5t0Var.f((q5t0) obj2, 0, 0, 0.0f);
                }
                return rih1Var;
            case 17:
                lc20 lc20Var2 = (lc20) obj3;
                fn31.T(cto1.q((dg30) lc20Var2.c), (q8n) lc20Var2.d, 0, new x060(lc20Var2, (String) obj2, (lnm) null, (byte) 5), 2);
                return rih1Var;
            case 18:
                o860 o860Var = (o860) obj3;
                r860 r860Var = (r860) o860Var.c;
                p860 p860Var = (p860) obj2;
                fn31.T(r860Var.b, (o8n) null, 0, new q860(r860Var, p860Var.b, p860Var.a, (lnm) null, (byte) 0), 3);
                kt91 kt91Var = (kt91) o860Var.d;
                Context context2 = (Context) o860Var.b;
                String string2 = context2.getString(2131956589);
                if (p860Var.b != 1) {
                    string = context2.getString(2131956590);
                    t230Var = new t230(o860Var, p860Var, (byte) 7);
                } else {
                    string = null;
                    t230Var = null;
                }
                kt91Var.k(new er91((fs91) null, string2, (Integer) null, string, (Integer) null, t230Var, (cvr) null, (xq91) null, false));
                return rih1Var;
            case 19:
                ((z6c) obj3).a.a("spotify:internal:your-library:messaging", (tv80) obj, mno1.h(new mmr0[]{new mmr0("extra_bottom_sheet_message", new asm1((String) obj2))}));
                return rih1Var;
            case 20:
                jc60 jc60Var = new jc60((ven0) obj2);
                ipb1 ipb1Var = (ipb1) obj3;
                ipb1Var.a(jc60Var);
                return new ht0((Object) ipb1Var, (Object) jc60Var, (byte) 24);
            case 21:
                rtb0 rtb0Var = (rtb0) obj;
                df60 df60Var = (df60) obj2;
                ye60 ye60Var = (ye60) obj3;
                if (ye60Var instanceof we60) {
                    rtb0.b(rtb0Var, ((we60) ye60Var).c, new cf60(ye60Var, b3), new j2i(-349051237, new wx00(df60Var, (byte) 23), true), 4);
                } else if (ye60Var instanceof ve60) {
                    rtb0.b(rtb0Var, ((ve60) ye60Var).c.size(), new cf60(ye60Var, b2), new j2i(-538707708, new wh(df60Var, ye60Var, (byte) 13), true), 4);
                } else if (!(ye60Var instanceof xe60)) {
                    eg.o();
                    return null;
                }
                return rih1Var;
            case 22:
                fn31.T((c9n) obj3, (o8n) null, 0, new kv2((sfx0) obj2, ((Offset) obj).a, (lnm) null, (byte) 8), 3);
                return rih1Var;
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                return new ia2(((Flowable) ((o860) obj3).c).subscribe(new ha2((ven0) obj2, (byte) 2)), (byte) 2);
            case 24:
                ((bi0) ((h0y) obj3).b).a((Intent) obj2);
                return rih1Var;
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                int iIntValue = ((Number) obj).intValue();
                ((i01) ((res) obj3).e).b(iIntValue);
                ((iu30) obj2).invoke(new o070(iIntValue));
                return rih1Var;
            case 26:
                Boolean bool = (Boolean) obj;
                if (bool.booleanValue()) {
                    gt70 gt70Var = (gt70) obj3;
                    x6h1 x6h1VarC4 = gt70Var.b.b.c();
                    x6h1VarC4.i.add(new a7h1("thumbnail_row", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC4.j = false;
                    gt70Var.a.m(new w7h1("", "", new z7h1("scroll", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC4.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                }
                ((ven0) obj2).setValue(bool);
                return rih1Var;
            case 27:
                o4o1.o((y2s) obj, ((dv70) obj3).c, new bv70((iu30) obj2, (byte) 0));
                return rih1Var;
            case 28:
                int iIntValue2 = ((Number) obj).intValue();
                Object obj4 = ((p811) obj3).a;
                if (obj4 == null) {
                    u890.C("boundRequest");
                    throw null;
                }
                if (((h7k1) obj4).b()) {
                    ((bx40) ((nay) obj2).b).setColor(iIntValue2);
                }
                return rih1Var;
            default:
                q8a q8aVar = new q8a((Context) obj);
                ul80 ul80Var = (ul80) obj3;
                String str4 = (String) obj2;
                no80.N(q8aVar);
                q8aVar.setDrawGridBackground(false);
                q8aVar.setDrawValueAboveBar(false);
                ((wc9) q8aVar.getXAxis()).m = false;
                ((wc9) q8aVar.getXAxis()).n = true;
                q8aVar.getXAxis().y = 2;
                ((wc9) q8aVar.getXAxis()).o = false;
                q8aVar.setXAxisRenderer(new hk9(q8aVar.getViewPortHandler(), q8aVar.getXAxis(), ((x8a) q8aVar).y1));
                q8aVar.setDrawBorders(false);
                ((wc9) q8aVar.getAxisLeft()).m = false;
                ((wc9) q8aVar.getAxisLeft()).n = false;
                ((wc9) q8aVar.getAxisLeft()).o = false;
                ((wc9) q8aVar.getAxisRight()).m = false;
                ((wc9) q8aVar.getAxisRight()).n = false;
                ((wc9) q8aVar.getAxisRight()).o = false;
                q8aVar.setPinchZoom(false);
                q8aVar.setScaleEnabled(false);
                ArrayList<rzy> arrayList = ul80Var.g;
                ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
                for (rzy rzyVar : arrayList) {
                    arrayList2.add(new v8a(rzyVar.c, rzyVar.a()));
                }
                u8a u8aVar = new u8a(arrayList2);
                int i2 = ul80Var.f;
                ArrayList arrayList3 = u8aVar.a;
                if (arrayList3 == null) {
                    arrayList3 = new ArrayList();
                    u8aVar.a = arrayList3;
                }
                arrayList3.clear();
                u8aVar.a.add(Integer.valueOf(i2));
                u8aVar.e = false;
                u8aVar.j = false;
                u8aVar.k = false;
                u8aVar.g = 1;
                u8aVar.c = null;
                t8a t8aVar = new t8a(new u8a[]{u8aVar});
                t8aVar.j = 0.2f;
                q8aVar.setData(t8aVar);
                q8aVar.getData().a();
                q8aVar.d();
                q8aVar.setRenderer(new ar31(q8aVar, q8aVar.getAnimator(), q8aVar.getViewPortHandler(), 1));
                q8aVar.getRenderer().w1();
                q8aVar.setDescription((aet) null);
                q8aVar.setContentDescription(str4);
                return q8aVar;
        }
    }
}
