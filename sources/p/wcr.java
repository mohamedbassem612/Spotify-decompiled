package p;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.spotify.base.java.logging.Logger;
import com.spotify.checkout.proto.model.v1.proto.GetSpotifyCheckoutPageRequest;
import com.spotify.checkout.proto.model.v1.proto.TrackingData;
import com.spotify.deeplinkimpl.events.proto.DeeplinkOpenError;
import com.spotify.liveevents.uiusecases.concertentityheader.elements.CalendarIconView;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import com.spotify.prerelease.uiusecases.mutebutton.MuteButtonView;
import com.spotify.wrapped.v1.proto.StoryCard;
import io.reactivex.rxjava3.core.BackpressureStrategy;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromAction;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import spotify.autodownload.esperanto.proto.SetShowStateRequest;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class wcr implements Function, qiw, ya, fq50 {
    public final /* synthetic */ byte a;
    public final Object b;

    public wcr(jca[] jcaVarArr) {
        this.a = (byte) 12;
        this.b = (jca[]) Arrays.copyOf(jcaVarArr, jcaVarArr.length);
        for (int i = 0; i < jcaVarArr.length; i++) {
            ((jca[]) this.b)[i].r(i, dbu0.c, rdd1.a);
        }
    }

    public Object a(Object obj) {
        return (k2a) obj;
    }

    public boolean accept(Object obj) {
        return ((jq4) this.b).e();
    }

    public Object apply(Object obj) {
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 1:
                ghr ghrVar = (ghr) obj2;
                bma1 bma1Var = ghr.k;
                return ghrVar.f.map(o9p1.V0).map(new lbq(ghrVar, (PlayerState) obj, (byte) 24));
            case 3:
                List list = (List) obj;
                List<String> list2 = list;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    for (String str : list2) {
                        Set set = s4b1.f;
                        if (!uic.g(str, blc0.fh)) {
                            return Observable.just(kkn.b);
                        }
                    }
                }
                rl1 rl1Var = (rl1) obj2;
                return ((g7h) rl1Var.d).c(((av1) rl1Var.c).e, list, false).map(s9w.V0).map(t9w.U0);
            case 8:
                return (ObservableSource) ((izr) obj2).a.invoke(((eh20) obj).c);
            case 10:
                b8v0 b8v0Var = (b8v0) obj;
                dgs dgsVar = (dgs) obj2;
                if (!(b8v0Var instanceof t7v0)) {
                    return b8v0Var instanceof v7v0 ? ((Single) dgsVar.g.c.getValue()).map(u321.X).flatMapCompletable(uh21.X) : CompletableEmpty.a;
                }
                dir dirVar = dgsVar.e;
                t7v0 t7v0Var = (t7v0) b8v0Var;
                String str2 = t7v0Var.a;
                boolean z = t7v0Var.b;
                mt8 mt8Var = dirVar.a;
                ul61 ul61VarN = SetShowStateRequest.n();
                ul61VarN.q(str2);
                ul61VarN.n(z);
                return mt8Var.callSingle("spotify.autodownload_esperanto.proto.AutoDownloadService", "SetShowState", ul61VarN.build()).map(bbn.t).ignoreElement();
            case 13:
                hur hurVar = (hur) ((h9n) obj2).b;
                int iOrdinal = ((u991) obj).ordinal();
                if (iOrdinal == 0) {
                    return Single.create(new l6s(new jqs(hurVar, (byte) 1), hurVar, x891.a));
                }
                if (iOrdinal == 1) {
                    return Single.create(new l6s(new jqs(hurVar, (byte) 0), hurVar, new w891((String) null)));
                }
                if (iOrdinal == 2) {
                    return Single.create(new l6s(new jqs(hurVar, (byte) 2), hurVar, new w891((String) null)));
                }
                eg.o();
                return null;
            case 14:
                return new mmr0((mss) obj2, (Integer) obj);
            case 17:
                boolean zL = ((l0l) obj).l();
                kzs kzsVar = (kzs) obj2;
                BackpressureStrategy backpressureStrategy = BackpressureStrategy.d;
                if (!zL) {
                    return kzsVar.b.a().filter(t9w.X0).toFlowable(backpressureStrategy);
                }
                ark1 ark1Var = kzsVar.c;
                return ark1Var.a().startWithItem(Double.valueOf(ark1Var.c())).distinctUntilChanged().toFlowable(backpressureStrategy);
            case 20:
                return rno1.m(new d1p0((Integer) null, ((dbv) obj2).b.getString(2131955130)), (CompletableFromAction) null, 12);
            case 21:
                z310 z310Var = (z310) obj2;
                return z310.a(z310Var, z310Var.a, (f410) null, 14);
            case 23:
                kmw kmwVar = (kmw) obj2;
                g3b1 g3b1Var = kmwVar.b;
                gq40 gq40VarO = GetSpotifyCheckoutPageRequest.o();
                f3b1 f3b1Var = kmwVar.a;
                gq40VarO.n(f3b1Var.Z());
                c3g1 c3g1VarN = TrackingData.n();
                c3g1VarN.r(f3b1Var.getSource().a);
                c3g1VarN.n(kmwVar.c);
                gq40VarO.q(c3g1VarN);
                return g3b1Var.c(gq40VarO.build()).compose(new dn81((byte) 2)).map(rzs0.b1).onErrorReturn(s321.a1);
            case 24:
                f320 f320Var = (f320) obj;
                uww uwwVar = (uww) obj2;
                d320 d320Var = f320Var instanceof d320 ? (d320) f320Var : null;
                if (d320Var == null) {
                    Logger.d(f4i1.f("Unexpected FieldValidationResponse type: ", f320Var.getClass().getSimpleName(), ". Expected FieldValidationResponse.Email for email validation."), new Object[0]);
                    d320Var = new d320(new ryw(uwwVar.a, (String) null));
                }
                return new dxw(d320Var.a, uwwVar.b);
            case 25:
                return yoi1.h(((lkd) obj2).c((ContextTrack) ((PlayerState) obj).track().b()), o6x.a);
            case 27:
                kby kbyVar = ((wsc0) obj).f;
                ((zeu) obj2).getClass();
                if (kbyVar.d.a(3).length() <= 0) {
                    return "";
                }
                String string = p370.a(kbyVar.d.a(3)).toString();
                string.getClass();
                return string;
            default:
                bet betVar = (bet) ((Map) obj).get(new edz(((o2z) obj2).a));
                return new bet(betVar != null ? betVar.a : false);
        }
    }

    public jca[] b() {
        jca[] jcaVarArr = (jca[]) this.b;
        jca[] jcaVarArr2 = new jca[jcaVarArr.length];
        for (int i = 0; i < jcaVarArr.length; i++) {
            jca jcaVar = jcaVarArr[i];
            jcaVar.getClass();
            jcaVarArr2[i] = jcaVar;
        }
        return jcaVarArr2;
    }

    public void c(int i, Intent intent, String str) {
        String strValueOf;
        int i2;
        if ((intent != null ? intent.getExtras() : null) != null) {
            strValueOf = intent + " Extras: " + intent.getExtras();
        } else {
            strValueOf = String.valueOf(intent);
        }
        k2q k2qVar = (k2q) this.b;
        String dataString = intent != null ? intent.getDataString() : null;
        if (i == 1) {
            i2 = StoryCard.CLASSIC_CONTENT_FIELD_NUMBER;
        } else if (i == 2) {
            i2 = 2000;
        } else if (i == 3) {
            i2 = 2001;
        } else if (i == 4) {
            i2 = 2003;
        } else {
            if (i != 5) {
                throw null;
            }
            i2 = 2004;
        }
        vcr vcrVarN = DeeplinkOpenError.n();
        if (dataString != null) {
            vcrVarN.s(((y1k) k2qVar.b).a(dataString));
        }
        vcrVarN.t(strValueOf);
        vcrVarN.r(str);
        vcrVarN.n(i2);
        vcrVarN.q();
        DeeplinkOpenError deeplinkOpenErrorBuild = vcrVarN.build();
        t2j0 t2j0Var = (t2j0) k2qVar.c;
        deeplinkOpenErrorBuild.getClass();
        t2j0Var.a(deeplinkOpenErrorBuild);
        deeplinkOpenErrorBuild.toString();
    }

    public void d(j4e j4eVar, int i) {
        glr glrVar = (glr) this.b;
        if (glrVar.c.isEnabled() && glrVar.d(j4eVar, j4eVar.c())) {
            glrVar.g = j4e.c;
        }
        dt71 dt71Var = glrVar.d;
        glrVar.a.getClass();
        dt71Var.a(new re61(j4eVar, i, elr.a(i)));
    }

    public void e(j4e j4eVar) {
        ((glr) this.b).d.a(new se61(j4eVar));
    }

    public Iterator f() {
        return ((ArrayList) this.b).iterator();
    }

    public void g(j4e j4eVar, int i) {
        Logger.d("CastBasic->%s", new Object[]{"Session resume failed: " + j4eVar + ", error: " + i});
        glr glrVar = (glr) this.b;
        dt71 dt71Var = glrVar.d;
        glrVar.a.getClass();
        dt71Var.a(new te61(j4eVar, i, elr.a(i)));
    }

    public void h(j4e j4eVar, boolean z) {
        ((glr) this.b).d.a(new ue61(j4eVar, z));
    }

    public void i(j4e j4eVar, String str) {
        ((glr) this.b).d.a(new ve61(j4eVar, str));
    }

    public void j(j4e j4eVar, int i) {
        Logger.d("CastBasic->%s", new Object[]{"Session start failed: " + j4eVar + ", error: " + i});
        glr glrVar = (glr) this.b;
        if (glrVar.c.isEnabled() && glrVar.d(j4eVar, j4eVar.c())) {
            glrVar.g = j4e.c;
        }
        dt71 dt71Var = glrVar.d;
        glrVar.a.getClass();
        dt71Var.a(new we61(j4eVar, i, elr.a(i)));
    }

    public void k(j4e j4eVar, String str) {
        glr glrVar = (glr) this.b;
        if (glrVar.c.isEnabled()) {
            glrVar.c(j4eVar, str);
        } else {
            glrVar.d.a(new xe61(j4eVar, str));
        }
    }

    public void l(j4e j4eVar) {
        glr glrVar = (glr) this.b;
        if (glrVar.c.isEnabled() && glrVar.d(j4eVar, j4eVar.c())) {
            glrVar.g = j4e.c;
        }
        glrVar.d.a(new ye61(j4eVar));
    }

    public void m(j4e j4eVar, int i) {
        Logger.d("CastBasic->%s", new Object[]{"Session suspended: " + j4eVar + ", error: " + i});
        ((glr) this.b).d.a(new ze61(j4eVar, i));
    }

    public Object n(onm onmVar) {
        hfp1 hfp1VarE;
        l441 l441Var = new l441(aym.t(onmVar));
        ndn1 ndn1Var = (ndn1) ((km3) this.b).b;
        boolean z = ndn1Var.a;
        l5u l5uVar = l5u.a;
        if (z) {
            Bundle bundle = new Bundle();
            bundle.putString("engage_sdk_version", ndn1Var.d);
            bundle.putString("calling_package_name", ndn1Var.c);
            hfp1VarE = ndn1Var.b(new sso1(ndn1Var, bundle, (byte) 1)).e(l5uVar, new pen1());
        } else {
            hfp1VarE = o0c.z(Boolean.FALSE);
        }
        hfp1VarE.k(l5uVar, new p4n1()).b(new jut(l441Var, this, (byte) 27));
        return l441Var.a();
    }

    public void v(Object obj) {
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 4:
                xik xikVar = (xik) obj;
                ((CalendarIconView) ((zmr) obj2).e.g).c(new xwc(252, (Integer) null, (Integer) null, xikVar.l, xikVar.m, false));
                break;
            case 5:
                err errVar = (err) obj2;
                errVar.h.setContent(new j2i(-144433785, new crr(errVar, (oyn) obj, (byte) 3), true));
                break;
            case 6:
                Long l = (Long) obj;
                jnq jnqVar = (jnq) obj2;
                TextView textView = (TextView) ((g1i) jnqVar.c).e;
                l.getClass();
                textView.setText(jnqVar.b(2131820757, l.longValue()));
                break;
            case 7:
                dxr dxrVar = (dxr) obj;
                String str = dxrVar.a;
                odr odrVar = (odr) obj2;
                u961 u961Var = (u961) odrVar.d;
                TextView textView2 = (TextView) u961Var.d;
                TextView textView3 = (TextView) u961Var.a;
                TextView textView4 = (TextView) u961Var.c;
                TextView textView5 = (TextView) u961Var.b;
                Iterator it = p7h.M(new TextView[]{textView2, textView4, textView5}).iterator();
                while (it.hasNext()) {
                    ((TextView) it.next()).setMaxLines(Integer.MAX_VALUE);
                }
                String str2 = dxrVar.d;
                String str3 = dxrVar.c;
                String str4 = dxrVar.b;
                textView3.setVisibility(str.length() > 0 ? 0 : 8);
                textView3.setText(str);
                textView2.setVisibility(str4.length() == 0 ? 8 : 0);
                textView2.setText(str4);
                textView4.setVisibility(str3.length() == 0 ? 8 : 0);
                textView4.setText(str3);
                textView5.setVisibility(str2.length() != 0 ? 0 : 8);
                textView5.setText(str2);
                FrameLayout frameLayout = (FrameLayout) ((d520) odrVar.b).h;
                aiq0.a(frameLayout, new nx30(frameLayout, u961Var, (byte) 16));
                break;
            case 8:
            case 10:
            case 12:
            case 13:
            case 14:
            default:
                qws qwsVar = (qws) obj2;
                qwsVar.Y = (agv) obj;
                qwsVar.a();
                break;
            case 9:
                List list = (List) obj;
                kbs kbsVar = (kbs) obj2;
                list.getClass();
                String strY0 = o7h.y0(list, " • ", (String) null, (String) null, (iu30) null, 54);
                kqm0 kqm0Var = kbsVar.e;
                kqm0Var.c.setText(strY0);
                TextView textView6 = kqm0Var.b;
                Resources resources = kbsVar.a.getResources();
                int size = list.size();
                textView6.setText(size > 3 ? String.format(resources.getString(2131958897), Arrays.copyOf(new Object[]{Integer.valueOf(size - 3)}, 1)) : "");
                break;
            case 11:
                tfn0 tfn0Var = (tfn0) obj;
                uhs uhsVar = (uhs) obj2;
                tfn0Var.getClass();
                MuteButtonView muteButtonView = uhsVar.g;
                muteButtonView.a(tfn0Var);
                boolean z = tfn0Var.a;
                Context context = uhsVar.a;
                muteButtonView.setContentDescription(z ? context.getString(2131963757) : context.getString(2131963756));
                ivj1 ivj1Var = uhsVar.b;
                ivj1Var.h = Boolean.valueOf(z);
                uoa uoaVar = ivj1Var.d;
                if (uoaVar != null) {
                    uoaVar.o(z);
                }
                break;
            case 15:
                ((pkf1) obj2).setAllowChildVideoPlayback$src_main_java_com_spotify_nowplaying_uiusecases_uiusecases(((Boolean) obj).booleanValue());
                break;
        }
    }

    public wcr(Context context) {
        this.a = (byte) 26;
        this.b = new km3(context, (byte) 9);
    }

    public /* synthetic */ wcr(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }
}
