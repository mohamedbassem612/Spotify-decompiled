package p;

import android.os.Bundle;
import android.widget.TextView;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.nowplaying.uiusecases.seekbar.SuppressLayoutTextView;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class wrs extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wrs(Object obj, Object obj2, byte b) {
        super(1);
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public final Object invoke(Object obj) {
        Object value;
        byte b = this.a;
        byte b2 = 5;
        b7x b7xVar = b7x.a;
        byte b3 = 17;
        byte b4 = 3;
        byte b5 = 2;
        byte b6 = 1;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.b;
        Object obj3 = this.c;
        switch (b) {
            case 0:
                rtb0 rtb0Var = (rtb0) obj;
                rtb0.c(rtb0Var, "header", gkj.a, 2);
                rtb0.c(rtb0Var, "spacer", gkj.b, 2);
                iia1 iia1Var = (iia1) obj2;
                ArrayList arrayList = iia1Var.b;
                rtb0Var.e(arrayList.size(), new ry4(arrayList, (byte) 16), new ry4(arrayList, (byte) 17), new j2i(802480018, new rf1((byte) 10, (vrs) obj3, iia1Var, arrayList), true));
                return rih1Var;
            case 1:
                ((pus) obj2).b(2, (String) obj3);
                return rih1Var;
            case 2:
                zus zusVar = (zus) obj2;
                uus uusVar = (uus) obj3;
                zusVar.d = uusVar;
                bpb1 bpb1Var = zusVar.f;
                do {
                    value = bpb1Var.getValue();
                } while (!bpb1Var.k(value, sqg0.P((Map) value, new mmr0(uusVar.a.a, uusVar))));
                Function0 function0 = uusVar.e;
                if (function0 != null) {
                    function0.invoke();
                }
                return rih1Var;
            case 3:
                xiw0 xiw0Var = (xiw0) obj;
                tzf1 tzf1Var = (tzf1) ((odr) obj3).b;
                if (xiw0Var.equals(wiw0.a) || xiw0Var.equals(wiw0.b)) {
                    ((iu30) obj2).invoke(rwf1.i);
                } else if (xiw0Var.equals(wiw0.d)) {
                    tzf1Var.getArtwork().setVisibility(4);
                } else {
                    if (!xiw0Var.equals(wiw0.c) && !xiw0Var.equals(wiw0.e)) {
                        eg.o();
                        return null;
                    }
                    tzf1Var.getArtwork().setVisibility(0);
                }
                return rih1Var;
            case 4:
                e0g1 e0g1Var = (e0g1) obj;
                qws qwsVar = (qws) obj2;
                g931 g931Var = qwsVar.f;
                boolean z = e0g1Var instanceof c0g1;
                agv agvVar = agv.b;
                if (z) {
                    ((SuppressLayoutTextView) g931Var.b).setTextAdjustingWidth(g931Var.i((int) ((c0g1) e0g1Var).a));
                    if (qwsVar.Y == agvVar) {
                        qwsVar.a();
                    }
                } else if (e0g1Var instanceof a0g1) {
                    ((SuppressLayoutTextView) g931Var.b).setTextAdjustingWidth(g931Var.i(qwsVar.c.getProgress()));
                    if (qwsVar.Y == agvVar) {
                        qwsVar.a();
                    }
                }
                ((iu30) obj3).invoke(e0g1Var);
                return rih1Var;
            case 5:
                int iIntValue = ((Number) obj).intValue();
                wyr wyrVar = (wyr) obj2;
                inl1 inl1Var = (inl1) wyrVar.f;
                int i = (inl1Var.f * iIntValue) + inl1Var.d;
                fnl1 fnl1Var = (fnl1) wyrVar.d;
                bnl1 bnl1Var = (bnl1) wyrVar.b;
                anl1 anl1Var = bnl1Var.b;
                b8k1.t(fnl1Var.a, (String) anl1Var.b.invoke(Integer.valueOf(i)));
                knl1 knl1Var = (knl1) obj3;
                TextView textView = knl1Var.c;
                RecyclerView recyclerView = knl1Var.b;
                textView.setText((CharSequence) anl1Var.a.invoke(Integer.valueOf(i)));
                textView.setTextColor((anl1Var.d || i != bnl1Var.a.d) ? xfo1.r(textView, 2130968788) : xfo1.r(textView, 2130968787));
                if (recyclerView.getScrollState() != 0) {
                    recyclerView.performHapticFeedback(1);
                }
                return rih1Var;
            case 6:
                a2t a2tVar = ((q8t) obj2).a;
                c921.y(cto1.q(a2tVar.a), (o8n) null, 0, new z1t(a2tVar, ((kjo0) obj3).g, (lnm) null, (byte) 0), 3);
                return rih1Var;
            case 7:
                ((bbt) obj2).b.D((y341) obj, (ctc) obj3);
                return rih1Var;
            case 8:
                q9e q9eVar = (q9e) obj;
                String str = q9eVar.a;
                List<p9e> list = q9eVar.b;
                tkt tktVar = (tkt) obj2;
                kkt kktVar = (kkt) obj3;
                ArrayList arrayList2 = new ArrayList(q7h.U(list, 10));
                for (p9e p9eVar : list) {
                    arrayList2.add(new g7e(p9eVar.a, p9eVar.b, tktVar.b > 420 ? 1 : ((mf4) kktVar.c).b() ? 3 : 2, p9eVar.c));
                }
                int i2 = tktVar.a;
                return new k9e(str, arrayList2, i2, o7h.s1(list, i2, i2).size(), 0);
            case 9:
                ArrayList arrayList3 = ((llt) obj2).g;
                ((kex) obj).b(arrayList3.size(), new j2i(-1673449743, new e6j(arrayList3, (hlt) obj3, (byte) 22), true), new ib5(arrayList3, (byte) 12));
                return rih1Var;
            case 10:
                ji50 ji50Var = (ji50) obj;
                tkt tktVar2 = (tkt) obj3;
                Iterator it = ((nnt) obj2).b.iterator();
                while (it.hasNext()) {
                    ((hmt) it.next()).a(tktVar2, ji50Var);
                }
                return rih1Var;
            case 11:
                ((art) obj2).b.D((y341) obj, (zqt) obj3);
                return rih1Var;
            case 12:
                vtt vttVar = (vtt) obj3;
                ek2 ek2Var = new ek2(vttVar, (byte) 7);
                iac0 iac0Var = (iac0) obj2;
                iac0Var.getLifecycle().a(ek2Var);
                return new sg(iac0Var, ek2Var, vttVar, (byte) 7);
            case 13:
                return new qgz((yqg) obj2, new dl3((ynb0) obj3, (byte) 4));
            case 14:
                gmt gmtVar = (gmt) obj2;
                ik21 ik21Var = (ik21) gmtVar.c;
                ik21Var.j = (String) obj3;
                ik21Var.c();
                ca40.d((ca40) gmtVar.b, (String) obj3, (tv80) obj, (u0t0) null, new nit(gmtVar, b2), 12);
                return rih1Var;
            case 15:
                cas casVar = (a7m0) obj;
                casVar.a = new utt((fiu) obj2, b4);
                casVar.h = new oj0((ao0) obj3, b5);
                return rih1Var;
            case 16:
                ((qtr) obj).b(new lcm((br0) obj2, (uw0) obj3, (lnm) null, (byte) 2));
                return rih1Var;
            case 17:
                return hu20.e(((amd) obj2).c(2, (String) obj), new uls((lnm) null, (ov20) obj3, (byte) 5));
            case 18:
                DrawScope drawScope = (DrawScope) obj;
                DrawScope drawScope2 = (DrawScope) obj2;
                wat watVarR = drawScope.a1().r();
                flb0 flb0VarT = drawScope.a1().t();
                fid fidVarP = drawScope.a1().p();
                long jU = drawScope.a1().u();
                be50 be50Var = (be50) drawScope.a1().c;
                iu30 iu30Var = (iu30) obj3;
                wat watVarR2 = drawScope2.a1().r();
                flb0 flb0VarT2 = drawScope2.a1().t();
                fid fidVarP2 = drawScope2.a1().p();
                long jU2 = drawScope2.a1().u();
                be50 be50Var2 = (be50) drawScope2.a1().c;
                cab cabVarA1 = drawScope2.a1();
                cabVarA1.A(watVarR);
                cabVarA1.C(flb0VarT);
                cabVarA1.z(fidVarP);
                cabVarA1.D(jU);
                cabVarA1.c = be50Var;
                fidVarP.q();
                try {
                    iu30Var.invoke(drawScope2);
                    return rih1Var;
                } finally {
                    fidVarP.i();
                    cab cabVarA2 = drawScope2.a1();
                    cabVarA2.A(watVarR2);
                    cabVarA2.C(flb0VarT2);
                    cabVarA2.z(fidVarP2);
                    cabVarA2.D(jU2);
                    cabVarA2.c = be50Var2;
                }
            case 19:
                Scheduler scheduler = (Scheduler) obj2;
                cas casVar2 = (a7m0) obj;
                casVar2.d = new mw1(scheduler, (byte) 2);
                casVar2.e = new mw1(scheduler, (byte) 3);
                casVar2.a = fdv.b;
                casVar2.a(new qrk(1, (byte) 17), new edv((hdv) obj3, b6));
                return rih1Var;
            case 20:
                vcv vcvVar = (vcv) obj;
                if (vcvVar instanceof scv) {
                    cdv cdvVar = ((hdv) obj2).b;
                    adv advVar = cdvVar instanceof adv ? (adv) cdvVar : null;
                    if (advVar != null) {
                        advVar.b.invoke();
                    }
                }
                ((iu30) obj3).invoke(vcvVar);
                return rih1Var;
            case 21:
                ((iu30) obj2).invoke((lia1) obj);
                ((scx) obj3).a();
                return rih1Var;
            case 22:
                return hu20.c((bpb1) obj2, new piu((vfv) obj3, (rfv) obj, (lnm) null, (byte) 2));
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                return hu20.c((zob1) obj2, new piu((u63) obj3, (sfv) obj, (lnm) null, (byte) 3));
            case 24:
                Set set = s4b1.f;
                ((gza) obj3).a.a(f4i1.f("spotify:internal:clip:", uic.x((String) obj2).h(), ":edit"), (tv80) obj, (Bundle) null);
                return rih1Var;
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                ((lzn0) ((utw0) ((ogr) obj2).b).a).g(mno1.h(new mmr0[]{new mmr0("uri", (String) obj3)}), "spotify:internal:sts:edit");
                return rih1Var;
            case 26:
                ((ktv) ((zeu) obj2).c).getClass();
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", ktv.c((String) obj3))), ((g0l0) obj).a, r6h1.c, System.currentTimeMillis());
            case 27:
                return new ht0((vqv) obj2, (zau0) obj3, b3);
            case 28:
                rtb0 rtb0Var2 = (rtb0) obj;
                rtb0.c(rtb0Var2, (Object) null, new j2i(321205586, new oat((qvv) obj3, (byte) 19), true), 3);
                jyo1.m(rtb0Var2, (q1d0) obj2, new d720(rnv.Z0, (byte) 24));
                return rih1Var;
            default:
                otu otuVar = ((bxv) obj2).a;
                i8h1 i8h1Var = (i8h1) otuVar.b;
                x6h1 x6h1VarC = ((txk0) otuVar.c).b.c();
                x6h1VarC.i.add(new a7h1("manage_publish_to_profile_setting_link", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                ((iu30) obj3).invoke(new jxv(i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", pro1.t("publishToProfile"))), x6h1VarC.a(), r6h1.c, System.currentTimeMillis()), (xj61) null)));
                return rih1Var;
        }
    }
}
