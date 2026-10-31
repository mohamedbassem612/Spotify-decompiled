package p;

import android.os.Bundle;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.base.java.logging.Logger;
import com.spotify.betamax.player.VideoSurfaceView;
import com.spotify.cosmos.servicebasedrouter.RemoteNativeRxRouter;
import com.spotify.mobius.EventSource;
import com.spotify.mobius.MergedEventSource;
import com.spotify.mobius.coroutines.FlowEventSources;
import com.spotify.mobius.coroutines.b;
import io.reactivex.rxjava3.core.ObservableEmitter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class c861 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c861(cw71 cw71Var, gw71 gw71Var, res resVar) {
        super(1);
        this.a = (byte) 16;
        this.b = gw71Var;
        this.c = resVar;
    }

    public final Object invoke(Object obj) {
        b3k1 b3k1Var;
        vgh ughVar;
        mmr0[] mmr0VarArr;
        byte b = this.a;
        b7x b7xVar = b7x.a;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                ji50 ji50Var = (ji50) obj;
                d861 d861Var = (d861) obj3;
                ji50Var.b.put(m761.class, new r3r(new xzq(ajq0.q(d861Var.b, d861Var.c, ji50Var.a, w661.c, new f4x0((byte) 29), (yzc0) null, (kpg0) null, (qlb) null, (n5) null, false, 7056), new b861((f861) obj2, (byte) 1)), qr51.Z, 4));
                return rih1Var;
            case 1:
                kb61 kb61Var = (kb61) obj;
                return dm61.y0(dm61.B0(new Object[]{kb61Var.s(), ((jo20) obj3).isEnabled() ? null : kb61Var.f0(), kb61Var.M(), kb61Var.k0(), kb61Var.m(), kb61Var.e0(), kb61Var.S(), kb61Var.H(), kb61Var.h(), kb61Var.V(), kb61Var.k()}), ((nx9) obj2).j().a.b().a(w8c0.d) ? Collections.singleton(kb61Var.e()) : w7x.a);
            case 2:
                ((iu30) obj3).invoke(new RemoteNativeRxRouter(((mlv0) obj).a().u().getRemoteNativeRouter(), ((ih61) obj2).b.getUseComputationScheduler()));
                return rih1Var;
            case 3:
                ((yx6) obj3).a.a((String) obj2, (tv80) obj, (Bundle) null);
                return rih1Var;
            case 4:
                cas casVar = (a7m0) obj;
                casVar.a = qr51.X0;
                q8n q8nVar = (q8n) obj2;
                FlowEventSources.Companion companion = FlowEventSources.a;
                w2c1 w2c1Var = (y1c1) obj3;
                mr20[] mr20VarArr = {new p90(w2c1Var.U(bu8.class), (byte) 12)};
                companion.getClass();
                casVar.b = MergedEventSource.b(new b(q8nVar, mr20VarArr), new EventSource[]{new b(q8nVar, new mr20[]{new p90(w2c1Var.U(fcl.class), (byte) 13)})});
                casVar.d = w661.T0;
                casVar.e = w661.U0;
                return rih1Var;
            case 5:
                ((lzn0) ((nt21) obj3).b).a((String) obj2, (tv80) obj, (Bundle) null);
                return rih1Var;
            case 6:
                c8e1 c8e1Var = (c8e1) obj;
                vt61 vt61Var = (vt61) obj3;
                i8h1 i8h1Var = vt61Var.b;
                oxl0 oxl0Var = vt61Var.i;
                x6h1 x6h1VarC = oxl0Var.b.c();
                x6h1VarC.i.add(new a7h1("input_field", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                y6h1 y6h1VarA = x6h1VarC.a();
                String str = c8e1Var.a.b;
                i8h1Var.m(new w7h1("", "", new z7h1("key_stroke", 1, b7xVar), new x7h1("change_search_query", 1, Collections.singletonMap("search_query_string", str != null ? str : "")), y6h1VarA, oxl0Var.c.b, System.currentTimeMillis()), (xj61) null);
                ((iu30) obj2).invoke(c8e1Var);
                return rih1Var;
            case 7:
                u501 u501Var = (u501) obj;
                if (!(u501Var instanceof u501)) {
                    eg.o();
                    return null;
                }
                if (u501Var.c) {
                    ((q961) obj3).invoke(u501Var.b);
                } else {
                    ((r171) obj2).b.f(new dwn0(pcf.j(u501Var.a), "", false, false, 0, 0, false, (a690) null, (Bundle) null, (cwn0) null));
                }
                return rih1Var;
            case 8:
                return new t171((String) obj3, (oz61) obj2, ((p271) obj).b);
            case 9:
                z001 z001Var = (z001) obj;
                iu30 iu30Var = (iu30) obj3;
                if (z001Var.equals(x001.a)) {
                    iu30Var.invoke(new n071(((tom) obj2).h));
                } else {
                    if (!(z001Var instanceof y001)) {
                        eg.o();
                        return null;
                    }
                    iu30Var.invoke(new v071(((y001) z001Var).a));
                }
                return rih1Var;
            case 10:
                xh71.b(((ae71) obj3).a, new wa71((String) obj2, (String) null, (cqs0) null, (dqi1) null, (String) null, (String) null, (Bundle) null, 126), (Bundle) null, tm71.b, (tv80) obj, (List) null, 18);
                return rih1Var;
            case 11:
                int iIntValue = ((Number) obj).intValue();
                if (!((Boolean) ((ven0) obj2).getValue()).booleanValue()) {
                    ((dl71) obj3).a.t(iIntValue);
                }
                return rih1Var;
            case 12:
                jyo1.m((rtb0) obj, (q1d0) obj3, new xd2((ven0) obj2, (byte) 19));
                return rih1Var;
            case 13:
                ajk1 ajk1Var = (ajk1) obj2;
                Logger.d("Failed to set %s on %s for %s: %s", new Object[]{(wls0) obj3, ajk1Var.a, ajk1Var.b, (jy21) obj});
                return Boolean.FALSE;
            case 14:
                VideoSurfaceView videoSurfaceView = (VideoSurfaceView) obj3;
                jdj1 jdj1Var = ((ta71) obj2).g;
                if (jdj1Var.equals(idj1.a)) {
                    b3k1Var = b3k1.b;
                } else {
                    if (!jdj1Var.equals(hdj1.a)) {
                        eg.o();
                        return null;
                    }
                    b3k1Var = b3k1.c;
                }
                videoSurfaceView.setScaleType(b3k1Var);
                return videoSurfaceView;
            case 15:
                cas casVar2 = (a7m0) obj;
                casVar2.a = ea71.S0;
                fs71 fs71Var = (fs71) obj3;
                FlowEventSources.Companion companion2 = FlowEventSources.a;
                q8n q8nVar2 = fs71Var.c;
                mr20[] mr20VarArr2 = {hu20.e(eth.t(fs71Var.b, r6x.a, qi71.W0), new c6e0((lnm) null, (lzy) obj2, fs71Var, (byte) 22))};
                companion2.getClass();
                casVar2.b = new b(q8nVar2, mr20VarArr2);
                casVar2.d = da71.S0;
                casVar2.e = da71.T0;
                return rih1Var;
            case 16:
                res resVar = (res) obj2;
                cas casVar3 = (a7m0) obj;
                casVar3.a = new hx71(resVar, (byte) 1);
                casVar3.b = (gw71) obj3;
                casVar3.d = new ix71(resVar, (byte) 0);
                casVar3.e = new ix71(resVar, (byte) 1);
                return rih1Var;
            case 17:
                ((iu30) obj3).invoke(new mx71(((Boolean) obj).booleanValue() ? (ew71) obj2 : null));
                return rih1Var;
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                e261 e261Var = (e261) obj;
                b261.x(e261Var, 3);
                b261.y(e261Var, ((mw71) obj3) == ((mw71) obj2));
                return rih1Var;
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                hxb hxbVar = (hxb) obj;
                if (!((svh0) obj3).b && !(hxbVar instanceof exb)) {
                    ((i030) obj2).invoke(hxbVar);
                }
                return rih1Var;
            case 20:
                lsl lslVar = (lsl) obj;
                lslVar.s1();
                float fIntBitsToFloat = Float.intBitsToFloat((int) (lslVar.j() >> 32));
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (lslVar.j() & 4294967295L));
                iz71 iz71Var = (iz71) obj3;
                float fFloatValue = ((Number) iz71Var.U0.e()).floatValue() * fIntBitsToFloat;
                long j = iz71Var.Q0;
                vpb1.u(lslVar, (z1a1) obj2, new mic0(0, (((long) Float.floatToRawIntBits(fFloatValue)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(fFloatValue + fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L), p7h.M(new u7h[]{new u7h(u7h.b(j, 0.1f, 0.0f, 0.0f, 0.0f, 14)), new u7h(u7h.b(j, 0.05f, 0.0f, 0.0f, 0.0f, 14)), new u7h(u7h.b(j, 0.1f, 0.0f, 0.0f, 0.0f, 14))}), (List) null), 0.0f, iz71Var.T0, 28);
                return rih1Var;
            case 21:
                mnh mnhVar = (mnh) obj3;
                String str2 = mnhVar.b;
                int iOrdinal = ((zgh) obj).ordinal();
                if (iOrdinal == 0) {
                    ughVar = rgh.a;
                } else if (iOrdinal == 1) {
                    ughVar = new ugh(str2);
                } else {
                    if (iOrdinal != 2) {
                        eg.o();
                        return null;
                    }
                    ughVar = mnhVar.e ? new tgh(str2) : sgh.a;
                }
                ((ObservableEmitter) obj2).onNext(new goh(ughVar));
                return rih1Var;
            case 22:
                boolean zO0 = ((zb8) obj2).b.o0();
                wfx wfxVar = ((zfx) obj3).b;
                return new zgr(wfxVar.b, wfxVar.a, zO0, (byte) 1);
            case 23:
                ArrayList arrayList = (ArrayList) obj3;
                ((rtb0) obj).e(arrayList.size(), new qbb0(arrayList, (byte) 25), new qbb0(arrayList, (byte) 26), new j2i(802480018, new ot(arrayList, (xpw) obj2, (byte) 21), true));
                return rih1Var;
            case 24:
                iu30 iu30Var2 = ((ggc0) obj3).c;
                i281 i281Var = ((a781) obj2).a;
                iu30Var2.invoke(new pp61(i281Var.a, i281Var.f));
                return rih1Var;
            case 25:
                di4 di4Var = ((a49) obj2).b;
                ai4 ai4VarG0 = di4Var.g0();
                boolean zO1 = di4Var.o0();
                wfx wfxVar2 = ((zfx) obj3).b;
                return new rhr(wfxVar2.b, wfxVar2.a, ai4VarG0, zO1);
            case 26:
                a1r0.e(((yje) obj3).a, new dwn0(f4i1.e((String) obj2, ":credits"), "", false, false, 0, 0, false, (a690) null, (Bundle) null, new bwn0((tv80) obj)), (Bundle) null, 6);
                return rih1Var;
            case 27:
                lsl lslVar2 = (lsl) obj;
                lslVar2.s1();
                int iOrdinal2 = lslVar2.getLayoutDirection().ordinal();
                if (iOrdinal2 == 0) {
                    mmr0VarArr = (mmr0[]) obj3;
                } else {
                    if (iOrdinal2 != 1) {
                        eg.o();
                        return null;
                    }
                    mmr0VarArr = (mmr0[]) obj2;
                }
                DrawScope.S0(lslVar2, v9c.k((mmr0[]) Arrays.copyOf(mmr0VarArr, mmr0VarArr.length), 0.0f, 0.0f, 14), 0L, 0L, 0.0f, (DrawStyle) null, (ColorFilter) null, 0, 126);
                return rih1Var;
            case 28:
                VideoSurfaceView videoSurfaceView2 = (VideoSurfaceView) obj;
                ubw0 ubw0Var = (ubw0) obj3;
                String str3 = ((he81) obj2).A;
                String str4 = str3 != null ? str3 : "";
                if (ubw0Var != null) {
                    ubw0Var.b(str4, videoSurfaceView2);
                }
                return rih1Var;
            default:
                String str5 = (String) obj;
                wj81 wj81Var = (wj81) obj3;
                if (str5.equals("https://support.spotify.com/article/explicit-content/plain/")) {
                    uba ubaVar = wj81Var.a;
                    x6h1 x6h1VarC2 = wj81Var.b.a.c();
                    x6h1VarC2.i.add(new a7h1("explicit_content_support_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC2.j = false;
                    ubaVar.j(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("navigate_to_webview_uri", 1, Collections.singletonMap("destination", str5)), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis()));
                } else if (str5.equals("https://support.spotify.com/article/managed-accounts/plain/")) {
                    uba ubaVar2 = wj81Var.a;
                    x6h1 x6h1VarC3 = wj81Var.b.a.c();
                    x6h1VarC3.i.add(new a7h1("managed_accounts_support_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC3.j = false;
                    ubaVar2.j(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("navigate_to_webview_uri", 1, Collections.singletonMap("destination", str5)), x6h1VarC3.a(), r6h1.c, System.currentTimeMillis()));
                }
                z710.d((z710) obj2, str5, false, 6);
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c861(Object obj, Object obj2, byte b) {
        super(1);
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }
}
