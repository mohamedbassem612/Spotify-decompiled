package p;

import android.animation.AnimatorSet;
import android.content.Context;
import android.text.style.URLSpan;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import com.spotify.betamax.player.VideoSurfaceView;
import com.spotify.checkout.proto.model.v1.proto.GetCheckoutPageResponse;
import com.spotify.checkout.proto.model.v1.proto.GetSpotifyCheckoutPageRequest;
import com.spotify.checkout.proto.model.v1.proto.GetSpotifyCheckoutPageResponse;
import com.spotify.checkout.proto.model.v1.proto.SpotifyCheckoutNative;
import com.spotify.checkout.proto.model.v1.proto.n;
import com.spotify.checkout.proto.model.v1.proto.v0;
import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import com.spotify.libraryimportservice.tmm.ItemAlternative;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.mobius.Connection;
import com.spotify.mobius.Next;
import com.spotify.player.model.PlayerState;
import com.spotify.player.model.command.options.LoggingParams;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class uah0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uah0(Object obj, Object obj2, byte b) {
        super(1);
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public final Object invoke(Object obj) {
        mmr0 mmr0VarM;
        mmr0 mmr0VarM2;
        byte b = this.a;
        byte b2 = 4;
        boolean z = true;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                return new w9d0((p410) obj3, (String) obj2, (byte) 3);
            case 1:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                ((vu30) obj3).invoke(((ItemAlternative) obj2).getId(), bool);
                return rih1Var;
            case 2:
                hjh0 hjh0Var = (hjh0) obj3;
                PlayerState playerState = (PlayerState) ((spq0) obj).h();
                if (playerState != null && !playerState.isPaused()) {
                    z = false;
                }
                LoggingParams loggingParamsC = hjh0Var.c((m210) obj2, z, playerState);
                uwt0 uwt0Var = hjh0Var.f;
                return z ? uwt0Var.c(loggingParamsC) : uwt0Var.b(loggingParamsC);
            case 3:
                pt ptVar = (pt) obj3;
                ((ysh0) ptVar.g).c = new msh0((iu30) obj2, (byte) 2);
                return new k6r(ptVar, (byte) 25);
            case 4:
                ArrayList<View> arrayListD = ((cxh0) obj3).d((ViewGroup) obj);
                bxh0 bxh0Var = (bxh0) obj2;
                AnimatorSet animatorSet = bxh0Var.c;
                if (animatorSet != null) {
                    animatorSet.end();
                }
                bxh0Var.c = null;
                bxh0Var.d = false;
                for (View view : arrayListD) {
                    view.setAlpha(0.0f);
                    view.setTranslationY(bxh0Var.a);
                }
                return rih1Var;
            case 5:
                w6e0 w6e0Var = ((x7i0) obj3).a;
                oud oudVar = (oud) obj2;
                oudVar.getClass();
                r6i0 r6i0Var = (r6i0) w6e0Var.d;
                f7i0 f7i0Var = (f7i0) w6e0Var.b;
                q8n q8nVar = (q8n) w6e0Var.e;
                hyl0 hyl0Var = (hyl0) w6e0Var.c;
                c8o.l(hyl0Var);
                return new kpg0(new f8i0(r6i0Var, f7i0Var, q8nVar, hyl0Var, oudVar), i6i0.e1);
            case 6:
                twm0 twm0Var = new twm0((Context) obj, ((k8i0) obj3).f.a.j);
                twm0Var.setIdentifier("mediatrimmer-preview");
                twm0Var.setScaleType(b3k1.b);
                twm0Var.setBufferingThrobberEnabled(false);
                twm0Var.setBackgroundColor(-16777216);
                ((ven0) obj2).setValue(twm0Var);
                return twm0Var;
            case 7:
                cbi0 cbi0Var = (cbi0) obj;
                jbi0 jbi0Var = (jbi0) obj3;
                k47 k47Var = new k47((tyq) obj2);
                mey0 mey0Var = cbi0Var.c;
                String str = mey0Var.b;
                smc0 smc0VarN = k4p1.n();
                x360 x360Var = mey0Var.e;
                if (x360Var != null && (mmr0VarM = ((uu0) jbi0Var.e).m(x360Var)) != null) {
                    smc0VarN.add(new hg51((xpw) mmr0VarM.a, mmr0VarM.b, ((uk00) jbi0Var.f).b));
                }
                smc0VarN.add(new hg51(k47Var, mey0.a(mey0Var), 0));
                return new ig51(str, k4p1.k(smc0VarN), new yih0(cbi0Var, b2));
            case 8:
                dbi0 dbi0Var = (dbi0) obj;
                mey0 mey0Var2 = dbi0Var.c;
                String str2 = mey0Var2.b;
                pzw pzwVar = (pzw) obj3;
                rbi0 rbi0Var = (rbi0) obj2;
                smc0 smc0VarN2 = k4p1.n();
                x360 x360Var2 = mey0Var2.e;
                if (x360Var2 != null && (mmr0VarM2 = rbi0Var.e.m(x360Var2)) != null) {
                    smc0VarN2.add(new hg51((xpw) mmr0VarM2.a, mmr0VarM2.b, rbi0Var.f.b));
                }
                smc0VarN2.add(new hg51(pzwVar, mey0.a(mey0Var2), 0));
                return new ig51(str2, k4p1.k(smc0VarN2), new yih0(dbi0Var, (byte) 6));
            case 9:
                e261 e261Var = (e261) obj;
                rdi0 rdi0Var = ((odi0) obj3).f;
                String strY0 = o7h.y0(f46.i0(new String[]{rdi0Var != null ? rdi0Var.getText() : null, (String) obj2}), ", ", (String) null, (String) null, (iu30) null, 62);
                if (!ihc1.y0(strY0)) {
                    b261.n(e261Var, strY0);
                }
                return rih1Var;
            case 10:
                return ((zhi0) obj3).b((mhi0) obj, (thi0) obj2);
            case 11:
                return ((zhi0) obj3).b((mhi0) obj, new aii0((gii0) obj2, (byte) 0));
            case 12:
                VideoSurfaceView videoSurfaceView = new VideoSurfaceView((Context) obj);
                videoSurfaceView.setBufferingThrobberEnabled(false);
                videoSurfaceView.setScaleType(b3k1.c);
                videoSurfaceView.setVideoSurfaceCallback((yrg0) obj3);
                ((iu30) obj2).invoke(videoSurfaceView);
                return videoSurfaceView;
            case 13:
                qri0 qri0Var = (qri0) obj3;
                kqi0 kqi0Var = qri0Var.g;
                yri0 yri0Var = ((zri0) obj2).i;
                i8h1 i8h1Var = (i8h1) kqi0Var.b;
                n1m0 n1m0Var = (n1m0) ((idd1) kqi0Var.c).getValue();
                if (!(yri0Var instanceof xri0)) {
                    if (yri0Var instanceof wri0) {
                        b2 = 2;
                    } else {
                        if (!(yri0Var instanceof vri0)) {
                            eg.o();
                            return null;
                        }
                        b2 = 1;
                    }
                }
                n1m0Var.getClass();
                x6h1 x6h1VarC = n1m0Var.a.c();
                x6h1VarC.i.add(new a7h1("memberships_upsell_bottomsheet_container", wzl0.a(b2), (Integer) null, (String) null, (String) null));
                x6h1VarC.j = true;
                y6h1 y6h1VarA = x6h1VarC.a();
                k7h1 k7h1Var = new k7h1();
                ((xjn) k7h1Var).a = y6h1VarA;
                ((xjn) k7h1Var).b = r6h1.c;
                ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
                i8h1Var.f(k7h1Var.a(), (Set) null);
                return new hp0(qri0Var.f.c(new pri0(qri0Var, (byte) 0)), (byte) 10);
            case 14:
                ((mhg0) obj3).invoke(((URLSpan) obj2).getURL());
                return rih1Var;
            case 15:
                ((t6j0) obj3).b((smc0) obj2);
                return rih1Var;
            case 16:
                DrawScope drawScope = (DrawScope) obj;
                float fX0 = drawScope.X0(3.7f);
                float fX1 = drawScope.X0(3.3f);
                float fE = ((Size.e(drawScope.j()) / 2.0f) - fX1) - fX0;
                DrawScope.o(drawScope, v9c.s((List) obj3, Float.intBitsToFloat((int) (drawScope.g1() & 4294967295L)) - fE, Float.intBitsToFloat((int) (drawScope.g1() & 4294967295L)) + fE, 8), fE, 0L, 0.0f, (phc1) null, 124);
                DrawScope.o(drawScope, v9c.m((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.j() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.j() & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(0.0f)) << 32), (List) obj2), hrt.f(drawScope, 2.0f) - (fX1 / 2.0f), 0L, 0.0f, new phc1(fX1, 0.0f, 0, 0, (uw4) null, 30), 108);
                return rih1Var;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                ((qtr) obj).b(new a4a((f1n0) obj3, (hj91) obj2, (lnm) null, (byte) 1));
                return rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                p410 p410Var = (p410) obj3;
                fn31.T(cto1.q((dg30) p410Var.b), (q8n) p410Var.f, 0, new v4e0(p410Var, (String) obj2, (tv80) obj, (lnm) null, (byte) 28), 2);
                return rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                pzx pzxVar = (pzx) obj3;
                fn31.T(smo1.e((q8n) pzxVar.c), (o8n) null, 0, new v4e0(pzxVar, (String) obj2, (tv80) obj, (lnm) null, (byte) 29), 3);
                return rih1Var;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                p9n0 p9n0Var = (p9n0) obj3;
                return new lt20(h5p1.r(p9n0Var.d, p9n0Var.e, p9n0Var.b, ((mnk0) ((umf0) obj2).e).a, new rbk0((nbk0) obj, (lnm) null)), new ob00(3, (lnm) null, (byte) 11), (byte) 0);
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                ((qtr) obj).b(new sbk0((p9n0) obj3, (u9a1) obj2, (lnm) null));
                return rih1Var;
            case 22:
                rtb0 rtb0Var = (rtb0) obj;
                hkc1 hkc1Var = (hkc1) obj3;
                if (hkc1Var.a) {
                    rtb0.c(rtb0Var, "custom", new j2i(1398107899, new mbj0(hkc1Var, (byte) 18), true), 2);
                }
                List list = (List) obj2;
                rtb0Var.e(list.size(), new ehf0(list, (byte) 22), new ehf0(list, (byte) 23), new j2i(802480018, new rf1((byte) 20, (Object) hkc1Var, (Object) list, list), true));
                return rih1Var;
            case 23:
                return (Next) ((e7m0) obj3).d.invoke(obj2, obj);
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                ubm0 ubm0Var = ubm0.a;
                v0 v0VarF = SpotifyCheckoutNative.F(((GetSpotifyCheckoutPageResponse) ubm0.a((RetrofitMaker) obj3, (dma1) obj2).c(GetSpotifyCheckoutPageRequest.n()).blockingGet()).s());
                v0VarF.s(ecm0.d(0, 10, false));
                SpotifyCheckoutNative spotifyCheckoutNativeBuild = v0VarF.build();
                n nVarW = GetCheckoutPageResponse.w();
                nVarW.v(spotifyCheckoutNativeBuild);
                return nVarW.build();
            case 25:
                fjm0 fjm0Var = (fjm0) obj3;
                Object objL = dug.l(fjm0Var.a, (Map) obj);
                if (!objL.equals(fjm0Var.c)) {
                    fjm0Var.c = objL;
                    ((Connection) obj2).accept(objL);
                }
                return rih1Var;
            case 26:
                if (((Class) obj3).isAssignableFrom(obj.getClass())) {
                    ((Connection) obj2).accept(obj);
                }
                return rih1Var;
            case 27:
                ArrayList arrayList = ((pkm0) obj3).b;
                ((rtb0) obj).e(arrayList.size(), (iu30) null, new qbb0(arrayList, (byte) 12), new j2i(2039820996, new rbb0(arrayList, (vu30) obj2, (byte) 1), true));
                return rih1Var;
            case 28:
                tm51 tm51Var = (tm51) obj3;
                if (tm51Var != null) {
                    r091 r091Var = (r091) ((ven0) obj2).getValue();
                    tm51Var.a.setValue(r091Var != null ? new wwm0(r091Var) : null);
                }
                return new xwm0(tm51Var, (byte) 0);
            default:
                ((Boolean) obj).getClass();
                ((iu30) obj3).invoke(new f3n0(((xi40) obj2).a));
                return rih1Var;
        }
    }
}
