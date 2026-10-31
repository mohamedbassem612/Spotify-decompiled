package p;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.text.format.DateFormat;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.gms.maps.model.LatLng;
import com.spotify.betamax.player.VideoSurfaceView;
import com.spotify.encoreconsumermobile.elements.playbutton.PlayButtonView;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.command.SkipToNextTrackCommand;
import com.spotify.venueview.v1.Attribution;
import com.spotify.venueview.v1.Badge;
import com.spotify.venueview.v1.BadgeDetails;
import com.spotify.venueview.v1.ContentRow;
import com.spotify.venueview.v1.GetVenuePageResponse;
import com.spotify.venueview.v1.HeaderConcept;
import com.spotify.venueview.v1.MapLink;
import com.spotify.venueview.v1.PageHeader;
import com.spotify.venueview.v1.Section;
import com.spotify.venueview.v1.Tab;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import j$.time.OffsetDateTime;
import j$.time.format.DateTimeFormatter;
import j$.time.format.FormatStyle;
import java.net.URI;
import java.net.URISyntaxException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import spotify.your_library.esperanto.proto.YourLibraryResponse;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class f2g1 implements Function, xi7, com.spotify.mobius.functions.Function, qiw, c0g, sh, d9d0 {
    public final /* synthetic */ byte a;
    public final Object b;

    public /* synthetic */ f2g1(Application application) {
        this.a = (byte) 21;
        mvo1 mvo1Var = null;
        try {
            mvo1 mvo1Var2 = mvo1.c;
            mvo1Var2 = mvo1Var2 == null ? new mvo1(application, mvo1.b, null, mvo1.a) : mvo1Var2;
            mvo1.c = mvo1Var2;
            mvo1Var = mvo1Var2;
        } catch (Exception unused) {
        }
        this.b = mvo1Var;
    }

    public Object a(Uri uri, onm onmVar) {
        s0o1 s0o1Var = (s0o1) this.b;
        adm1 adm1Var = s0o1Var.l;
        j8n1 j8n1Var = ((kz40) s0o1Var).i;
        adm1Var.getClass();
        cxn1 cxn1Var = new cxn1(adm1Var, j8n1Var, uri, 0, (byte) 1);
        j8n1Var.a.d(0, cxn1Var);
        Object objL = u890.l(ezn1.u(cxn1Var, jim1.c), onmVar);
        return objL == d9n.a ? objL : rih1.a;
    }

    public Object apply(Object obj) {
        h1a h1aVar;
        Object objInvoke;
        byte b = this.a;
        byte b2 = 10;
        Object obj2 = this.b;
        switch (b) {
            case 3:
                w9u0 w9u0Var = ((nmh1) obj2).b;
                ContextTrack contextTrack = ((j5z0) obj).d;
                SkipToNextTrackCommand.Builder builder = SkipToNextTrackCommand.builder();
                if (contextTrack != null) {
                    builder.track(contextTrack);
                }
                return w9u0Var.a(new m9u0(builder.build())).map(b4x0.U0).onErrorReturn(c4x0.V0).toObservable();
            case 5:
                List list = (List) obj;
                hce1 hce1Var = (hce1) obj2;
                ArrayList arrayList = new ArrayList(q7h.U(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(zgo1.w((tul1) it.next(), ((Boolean) ((x5u) hce1Var.d).invoke()).booleanValue()));
                }
                return arrayList;
            case 7:
                GetVenuePageResponse getVenuePageResponse = (GetVenuePageResponse) obj;
                PageHeader pageHeaderN = getVenuePageResponse.n();
                String strV = pageHeaderN.v();
                String strN = pageHeaderN.n();
                String strU = pageHeaderN.u();
                String strT = pageHeaderN.t();
                String subtitle = pageHeaderN.getSubtitle();
                String strS = pageHeaderN.s();
                Long lValueOf = pageHeaderN.x() ? Long.valueOf(pageHeaderN.r()) : null;
                h290<HeaderConcept> h290VarP = pageHeaderN.p();
                ArrayList arrayList2 = new ArrayList(q7h.U(h290VarP, 10));
                for (HeaderConcept headerConcept : h290VarP) {
                    arrayList2.add(new p5k(headerConcept.n(), headerConcept.getName(), headerConcept.o()));
                }
                if (pageHeaderN.w()) {
                    Badge badgeO = pageHeaderN.o();
                    String strP = badgeO.p();
                    String strR = badgeO.r();
                    String strQ = badgeO.q();
                    BadgeDetails badgeDetailsO = badgeO.o();
                    h1aVar = new h1a(strP, strR, strQ, new n1a(badgeDetailsO.p(), badgeDetailsO.getTitle(), badgeDetailsO.o()));
                } else {
                    h1aVar = null;
                }
                av50 av50Var = new av50(strV, strN, strU, strT, subtitle, lValueOf, strS, arrayList2, h1aVar);
                h290 h290VarO = getVenuePageResponse.o();
                ArrayList arrayList3 = new ArrayList(q7h.U(h290VarO, 10));
                Iterator it2 = h290VarO.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(new ted1(((Tab) it2.next()).getTitle()));
                }
                h290<Tab> h290VarO2 = getVenuePageResponse.o();
                ArrayList arrayList4 = new ArrayList(q7h.U(h290VarO2, 10));
                for (Tab tab : h290VarO2) {
                    tab.getClass();
                    String strP2 = tab.p();
                    h290<Section> h290VarO3 = tab.o().o();
                    int i = 10;
                    ArrayList arrayList5 = new ArrayList(q7h.U(h290VarO3, 10));
                    for (Section section : h290VarO3) {
                        h290<ContentRow> h290VarO4 = section.o();
                        ArrayList arrayList6 = new ArrayList(q7h.U(h290VarO4, i));
                        for (ContentRow contentRow : h290VarO4) {
                            contentRow.getClass();
                            arrayList6.add(f(contentRow));
                        }
                        arrayList5.add(new vf51(arrayList6, section.p() ? section.n() : null));
                        i = 10;
                    }
                    arrayList4.add(new kfd1(strP2, arrayList5));
                }
                Iterator it3 = getVenuePageResponse.o().iterator();
                int i2 = 0;
                while (it3.hasNext()) {
                    if (((Tab) it3.next()).n()) {
                        return new ywi1(av50Var, arrayList3, new kyi1(arrayList4, i2), o1a.a);
                    }
                    i2++;
                }
                i2 = -1;
                return new ywi1(av50Var, arrayList3, new kyi1(arrayList4, i2), o1a.a);
            case 12:
                mrk1 mrk1Var = (mrk1) obj;
                xl61 xl61Var = mrk1Var.b;
                double d = xl61Var.a;
                int iS = jch0.S(65535.0d * d);
                String str = xl61Var.c;
                String str2 = mrk1Var.a;
                return ((bih1) obj2).l(iS, str, str2).x(new fsk1(d, str2, true)).onErrorReturnItem(new fsk1(d, str2, false)).toObservable();
            case 13:
                icg1 icg1Var = (icg1) obj;
                zn90 zn90Var = ((obl1) obj2).d;
                byte b3 = zn90Var.a;
                z6x z6xVar = z6x.a;
                switch (b3) {
                    case 0:
                        return icg1Var.c.a.isEmpty() ? Single.just(new kcg1(z6xVar)) : Single.fromCallable(new e71(zn90Var, icg1Var, b2)).onErrorResumeNext(va20.f).doOnError(k530.P0);
                    default:
                        return icg1Var.c.a.isEmpty() ? Single.just(new kcg1(z6xVar)) : Single.fromCallable(new e71((Object) zn90Var, (Object) icg1Var, (byte) 17)).onErrorResumeNext(y1x0.e).doOnError(mux0.N0);
                }
            case 16:
                ly21 ly21Var = (py21) obj;
                yvf1 yvf1Var = new yvf1(obj2, (byte) 23);
                if (ly21Var instanceof ly21) {
                    objInvoke = yvf1Var.invoke(ly21Var.a);
                } else {
                    if (!(ly21Var instanceof oy21)) {
                        eg.o();
                        return null;
                    }
                    objInvoke = bjo.a;
                }
                return (cjo) objInvoke;
            default:
                return new mmr0((YourLibraryResponse) obj, (ywm1) obj2);
        }
    }

    public void b(String str, ResultReceiver resultReceiver) {
        Set set = s4b1.f;
        a1r0.j((a1r0) this.b, "spotify:internal:magpie:ucp-actions:".concat(uic.x(str).h()), (String) null, mno1.h(new mmr0[]{new mmr0("ucp_actions_result_receiver", resultReceiver)}), resultReceiver != null, 2);
    }

    public void c(Object obj) {
        b0u b0uVar = (b0u) this.b;
        dt71 dt71Var = ((ay40) obj).e;
        String str = b0uVar.a;
        String str2 = b0uVar.b;
        int i = b0uVar.c;
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    i2 = 4;
                }
            }
        }
        dt71Var.a(new qx40(i2, str, str2));
    }

    public Object d(String str, String str2, Set set, onm onmVar) {
        hyy0 hyy0VarI = hyy0.i(str);
        ((vzq) hyy0VarI.c).a.put(str2, (String[]) set.toArray(new String[0]));
        ((iyy0) hyy0VarI.b).d = 0L;
        iyy0 iyy0VarH = hyy0VarI.h();
        s0o1 s0o1Var = (s0o1) this.b;
        j8n1 j8n1Var = ((kz40) s0o1Var).i;
        pwn1 pwn1Var = new pwn1(s0o1Var.l, j8n1Var, iyy0VarH);
        j8n1Var.a.d(0, pwn1Var);
        Object objL = u890.l(ezn1.u(pwn1Var, vem1.c), onmVar);
        return objL == d9n.a ? objL : rih1.a;
    }

    public mr20 e(boolean z) {
        return !z ? new huz(Boolean.TRUE, (byte) 10) : ((ov20) ((qpj1) this.b).b).a("allow-child-video", false);
    }

    public f6m f(ContentRow contentRow) {
        yoi1 lyi1Var;
        String host;
        fod0 fod0Var = (fod0) this.b;
        String strT = contentRow.t();
        int iO = contentRow.o();
        String myi1Var = null;
        switch (iO == 0 ? -1 : bxi1.a[l1d.C(iO)]) {
            case -1:
            case 6:
                lyi1Var = nyi1.h;
                break;
            case 0:
            default:
                eg.o();
                return null;
            case 1:
                for (MapLink mapLink : contentRow.n().p()) {
                    if (mapLink.n() == fog0.c) {
                        lyi1Var = new lyi1(mapLink.getUrl(), contentRow.n().getName(), contentRow.n().n());
                        break;
                    }
                }
                bhn0.t("Collection contains no element matching the predicate.");
                return null;
            case 2:
                String name = contentRow.q().getName();
                String strN = contentRow.q().n();
                LatLng latLng = new LatLng(contentRow.q().p().o(), contentRow.q().p().p());
                if (contentRow.q().r()) {
                    Attribution attributionO = contentRow.q().o();
                    if (!ihc1.y0(attributionO.getTitle())) {
                        try {
                            URI uri = new URI(attributionO.o());
                            Set setS0 = f46.S0(new String[]{"http", "https"});
                            String scheme = uri.getScheme();
                            if (o7h.i0(setS0, scheme != null ? scheme.toLowerCase(Locale.ROOT) : null) && (host = uri.getHost()) != null && !ihc1.y0(host)) {
                                myi1Var = new myi1(attributionO.getTitle(), attributionO.o());
                            }
                        } catch (URISyntaxException unused) {
                        }
                    }
                }
                lyi1Var = new pyi1(name, strN, latLng, myi1Var);
                break;
            case 3:
                String strP = contentRow.p().p();
                String title = contentRow.p().getTitle();
                String imageUrl = contentRow.p().getImageUrl();
                String strN2 = contentRow.p().o().n();
                Locale locale = fod0Var.b;
                String string = DateFormat.format("MMM", fod0Var.a(strN2)).toString();
                String string2 = DateFormat.format("d", fod0Var.a(contentRow.p().o().n())).toString();
                String str = new SimpleDateFormat("EEE", locale).format(fod0Var.a(contentRow.p().o().n()));
                Date dateA = fod0Var.a(contentRow.p().o().n());
                String str2 = java.text.DateFormat.getDateTimeInstance(0, 3, locale).format(fod0Var.a(contentRow.p().o().n()));
                OffsetDateTime offsetDateTimeE = fod0.e(fod0Var, contentRow.p().o().n());
                myi1Var = offsetDateTimeE != null ? offsetDateTimeE.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT).withLocale(locale)) : null;
                if (myi1Var == null) {
                    myi1Var = "";
                }
                lyi1Var = new oyi1(strP, title, imageUrl, string, string2, str, dateA, str2, myi1Var);
                break;
            case 4:
                lyi1Var = new ryi1(contentRow.s().getValue());
                break;
            case 5:
                lyi1Var = new qyi1(contentRow.r().getTitle(), contentRow.r().getSubtitle(), contentRow.r().getImageUrl(), contentRow.r().getEntityUri());
                break;
        }
        return new f6m(strT, lyi1Var);
    }

    public void g(IBinder iBinder) {
        y9n1 xdo1Var;
        HashMap map = (HashMap) this.b;
        synchronized (map) {
            if (iBinder == null) {
                xdo1Var = null;
            } else {
                try {
                    y9n1 y9n1VarQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableService");
                    xdo1Var = y9n1VarQueryLocalInterface instanceof xdo1 ? (xdo1) y9n1VarQueryLocalInterface : new xdo1(iBinder);
                } catch (Throwable th) {
                    throw th;
                }
            }
            wan1 koo1Var = new koo1();
            for (Map.Entry entry : map.entrySet()) {
                gro1 gro1Var = (gro1) entry.getValue();
                try {
                    c7o1 c7o1Var = new c7o1(gro1Var);
                    Parcel parcelA1 = xdo1Var.a1();
                    zsn1.c(parcelA1, koo1Var);
                    zsn1.b(parcelA1, c7o1Var);
                    xdo1Var.Z0(16, parcelA1);
                    if (Log.isLoggable("WearableClient", 3)) {
                        new StringBuilder(String.valueOf(entry.getKey()).length() + 27 + String.valueOf(gro1Var).length());
                    }
                } catch (RemoteException unused) {
                    new StringBuilder(String.valueOf(entry.getKey()).length() + 32 + String.valueOf(gro1Var).length());
                }
            }
        }
    }

    public void h(List list) {
        synchronized (mvo1.class) {
            try {
                mvo1 mvo1Var = (mvo1) this.b;
                if (mvo1Var != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        mvo1Var.a((qvo1) it.next());
                    }
                    int iC = mvo1Var.c() - 500;
                    if (iC > 0) {
                        mvo1Var.e(o7h.d1(mvo1Var.d(), iC));
                    }
                }
            } catch (Exception unused) {
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public List i() {
        List listD;
        synchronized (mvo1.class) {
            try {
                try {
                    mvo1 mvo1Var = (mvo1) this.b;
                    listD = mvo1Var != null ? mvo1Var.d() : z6x.a;
                } catch (Exception unused) {
                    listD = z6x.a;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return listD;
    }

    public void j(List list) {
        synchronized (mvo1.class) {
            try {
                mvo1 mvo1Var = (mvo1) this.b;
                if (mvo1Var != null) {
                    mvo1Var.e(list);
                }
            } catch (Exception unused) {
            }
        }
    }

    public void k() {
        non1.m.c("Failed to notify listener for onDeviceSuggestionExpired", new Object[0]);
    }

    public Single l(Intent intent, th61 th61Var) {
        return ((uii1) this.b).b(intent);
    }

    public boolean r(View view) {
        vdk1 vdk1Var = (vdk1) this.b;
        int currentItem = ((ViewPager2) view).getCurrentItem() - 1;
        ViewPager2 viewPager2 = vdk1Var.d;
        if (viewPager2.U0) {
            viewPager2.e(currentItem, true);
        }
        return true;
    }

    public void v(Object obj) {
        dtw dtwVar;
        zej1 zej1Var = (zej1) obj;
        mfj1 mfj1Var = (mfj1) this.b;
        idd1 idd1Var = mfj1Var.X;
        int iC = l1d.C(zej1Var.l);
        if (iC != 0) {
            if (iC != 1 && iC != 2) {
                eg.o();
                return;
            }
            zej1 zej1Var2 = mfj1Var.O0;
            if (zej1Var2 != null) {
                mfj1Var.e(mfj1Var.a, zej1Var2);
                return;
            }
            return;
        }
        Context context = mfj1Var.c;
        f0a f0aVar = mfj1Var.h;
        if (zej1Var.n) {
            mfj1Var.f(zej1Var);
            ((AppCompatImageView) f0aVar.c).setImageDrawable(r2p1.j(context));
            ((PlayButtonView) f0aVar.X).setVisibility(8);
            ((VideoSurfaceView) f0aVar.Q0).setVisibility(4);
            mfj1Var.g(0L);
            return;
        }
        mfj1Var.f(zej1Var);
        PlayButtonView playButtonView = (PlayButtonView) f0aVar.X;
        TextView textView = (TextView) f0aVar.g;
        playButtonView.setVisibility(zej1Var.f57p == null ? 0 : 8);
        ixg ixgVarF = mfj1Var.b.f(zej1Var.g);
        ixgVarF.f(r2p1.j(context));
        ixgVarF.k((AppCompatImageView) f0aVar.c, (ird1) null);
        ((VideoSurfaceView) f0aVar.Q0).setVisibility(0);
        FrameLayout frameLayout = (FrameLayout) f0aVar.d;
        frameLayout.removeAllViews();
        int iC2 = l1d.C(zej1Var.r);
        if (iC2 == 1) {
            ((dtw) idd1Var.getValue()).f(new qy1(zej1Var.e, 6));
            frameLayout.addView(((dtw) idd1Var.getValue()).w);
        } else if (iC2 == 2 && (dtwVar = (dtw) mfj1Var.Y.getValue()) != null) {
            dtwVar.f(new uho(zej1Var.e, (String) null, mfj1Var.t, (nho) null, (String) null, (Function0) null, 250));
            frameLayout.addView(dtwVar.w);
        }
        mfj1Var.g(0L);
        String str = zej1Var.o;
        if (str != null) {
            textView.setVisibility(0);
            textView.setText(str);
        }
    }

    public /* synthetic */ f2g1(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public f2g1() {
        this.a = (byte) 20;
        this.b = new HashMap();
    }

    public f2g1(cjn1 cjn1Var, b0u b0uVar) {
        this.a = (byte) 19;
        this.b = b0uVar;
    }
}
