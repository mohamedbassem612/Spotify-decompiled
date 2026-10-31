package p;

import android.app.ProgressDialog;
import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Bundle;
import android.view.View;
import androidx.media3.common.util.GlUtil;
import com.spotify.appauthorization.sso.AuthorizationActivity;
import com.spotify.cosmos.cosmos.Response;
import com.spotify.cosmos.util.proto.Extension;
import com.spotify.cosmos.util.proto.ShowMetadata;
import com.spotify.cosmos.util.proto.ShowPlayState;
import com.spotify.outcome.outcomeapi.exceptions.UnableToParseMessageException;
import com.spotify.show_esperanto.proto.GetShowResponse;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromRunnable;
import io.reactivex.rxjava3.subjects.PublishSubject;
import java.io.File;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function0;
import spotify.show_cosmos.proto.ShowOfflineStateOuterClass$ShowOfflineState;
import spotify.show_cosmos.proto.ShowRequest;
import spotify.show_cosmos.proto.ShowRequest$NextBestEpisodeSection;
import spotify.show_cosmos.proto.ShowRequest$Response;
import spotify.show_cosmos.proto.ShowShowState$ShowCollectionState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class hur implements ird1, ks40, Function, jfc1, pqw, qiw {
    public final /* synthetic */ byte a;
    public Object b;
    public Object c;

    public hur(byte b) {
        this.a = b;
        switch (b) {
            case 22:
                break;
            default:
                this.b = EGL14.EGL_NO_CONTEXT;
                this.c = new ArrayList();
                break;
        }
    }

    public static Completable c(List list, iu30 iu30Var) {
        List<String> list2 = list;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            for (String str : list2) {
                Set set = s4b1.f;
                if (!uic.k(str, new b3i1[]{nyu0.e, wyu0.f})) {
                    hhg1.n("Failed requirement.");
                    return null;
                }
            }
        }
        return Observable.fromIterable(list2).flatMapSingle(new nwj(iu30Var, (byte) 3)).toList().flatMapCompletable(stf0.b1);
    }

    public void a(Function0 function0, iu30 iu30Var) {
        xab1 xab1Var = (xab1) this.c;
        if (xab1Var != null) {
            xab1Var.d((CancellationException) null);
        }
        this.c = fn31.T((llm) this.b, (o8n) null, 0, new p1r(function0, iu30Var, (lnm) null, (byte) 10), 3);
    }

    public Object apply(Object obj) throws UnableToParseMessageException {
        switch (this.a) {
            case 13:
                dgs dgsVar = (dgs) this.b;
                return anm1.L(dgsVar.o, new n5s(dgsVar, (lnm) null, (byte) 6)).concatMapSingle(new l6s(dgsVar, (String) this.c, (cn40) obj));
            case 14:
                iu30 iu30Var = (iu30) this.b;
                obj.getClass();
                Object objInvoke = iu30Var.invoke(obj);
                if (objInvoke != null) {
                    return objInvoke;
                }
                throw new UnableToParseMessageException(l1d.m("Unable to parse message returned from uri: ", ((Response) this.c).getUri()));
            case 18:
                blt bltVar = (blt) obj;
                String str = bltVar.a;
                alt altVar = bltVar.b;
                is91 is91Var = (is91) ((qs91) this.b);
                String str2 = is91Var.a;
                gs91 gs91Var = is91Var.b;
                kp5 kp5Var = (kp5) this.c;
                kp5Var.getClass();
                return new CompletableFromRunnable(new n9m(kp5Var, str, str2, altVar, gs91Var, (byte) 2));
            default:
                return ((Boolean) obj).booleanValue() ? ((Flowable) this.b).L((Scheduler) ((mxr) this.c).c).J(cq41.X0) : Flowable.I(j5.a);
        }
    }

    public void b(uf20 uf20Var, iu30 iu30Var, b0k b0kVar, int i) {
        y0t y0tVar;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1522531999);
        int i2 = (x340Var.i(uf20Var) ? 4 : 2) | i | (x340Var.i(iu30Var) ? 32 : 16) | (x340Var.g(this) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                rhp rhpVar = (rhp) this.c;
                switch (rhpVar.a) {
                    case 0:
                        fip fipVar = (fip) rhpVar.b.c;
                        y0tVar = new y0t((we20) fipVar.c0.get(), (shp) fipVar.d0.get(), iu30Var);
                        break;
                    default:
                        lvq lvqVar = (lvq) rhpVar.b.c;
                        y0tVar = new y0t((we20) lvqVar.C0.get(), (shp) lvqVar.D0.get(), iu30Var);
                        break;
                }
                objT = y0tVar;
                x340Var.s0(objT);
            }
            y0t y0tVar2 = (y0t) objT;
            boolean zI = x340Var.i(uf20Var) | ((i2 & 896) == 256);
            Object objT2 = x340Var.T();
            if (zI || objT2 == m4cVar) {
                objT2 = new swn(this, uf20Var, (lnm) null, (byte) 19);
                x340Var.s0(objT2);
            }
            ztm1 ztm1Var = (ztm1) yto.p((Object) null, uf20Var, (vu30) objT2, x340Var, ((i2 << 3) & 112) | 6).getValue();
            if (ztm1Var == null) {
                x340Var.i0(-1397595279);
            } else {
                x340Var.i0(-1397595278);
                otw.c(y0tVar2, ztm1Var, (qim0) null, (ipb1) null, x340Var, 0, 12);
            }
            x340Var.r(false);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new won((byte) 15, i, this, uf20Var, iu30Var);
        }
    }

    public void cancel() {
        xab1 xab1Var = (xab1) this.c;
        if (xab1Var != null) {
            xab1Var.d((CancellationException) null);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.util.GlUtil$GlException */
    public EGLSurface d(EGLDisplay eGLDisplay, Object obj, int i, boolean z) throws GlUtil.GlException {
        int[] iArr;
        int[] iArr2 = fn31.e;
        if (i == 3 || i == 10) {
            iArr = fn31.a;
        } else {
            if (i != 7 && i != 6) {
                hhg1.n(f4i1.c(i, "Unsupported color transfer: "));
                return null;
            }
            iArr = fn31.b;
            if (!z) {
                if (i == 6) {
                    if (!fn31.Q()) {
                        throw new GlUtil.GlException("BT.2020 PQ OpenGL output isn't supported.");
                    }
                    iArr2 = fn31.c;
                } else {
                    if (!fn31.R("EGL_EXT_gl_colorspace_bt2020_hlg")) {
                        throw new GlUtil.GlException("BT.2020 HLG OpenGL output isn't supported.");
                    }
                    iArr2 = fn31.d;
                }
            }
        }
        EGLSurface eGLSurfaceEglCreateWindowSurface = EGL14.eglCreateWindowSurface(eGLDisplay, fn31.O(eGLDisplay, iArr), obj, iArr2, 0);
        fn31.s("Error creating a new EGL surface");
        return eGLSurfaceEglCreateWindowSurface;
    }

    public ss40 e(int i, int i2, int i3) {
        int[] iArr = new int[1];
        GLES20.glGenFramebuffers(1, iArr, 0);
        fn31.t();
        GLES20.glBindFramebuffer(36160, iArr[0]);
        fn31.t();
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, i, 0);
        fn31.t();
        return new ss40(i, iArr[0], i2, i3);
    }

    public EGLSurface f(EGLContext eGLContext, EGLDisplay eGLDisplay) {
        return fn31.E(eGLContext, eGLDisplay);
    }

    public EGLContext g(EGLDisplay eGLDisplay, int i, int[] iArr) {
        EGLContext eGLContextD = fn31.D((EGLContext) this.b, eGLDisplay, i, iArr);
        ((ArrayList) this.c).add(eGLContextD);
        return eGLContextD;
    }

    public mpj0 h() {
        Double d = (Double) this.b;
        if (d != null) {
            double dDoubleValue = d.doubleValue();
            Double d2 = (Double) this.c;
            if (d2 != null) {
                double dDoubleValue2 = d2.doubleValue() - dDoubleValue;
                this.b = d2;
                this.c = null;
                if (dDoubleValue2 >= 0.0d) {
                    return new lpj0(dDoubleValue2);
                }
            }
        }
        return null;
    }

    public void i(EGLDisplay eGLDisplay) {
        ArrayList arrayList = (ArrayList) this.c;
        for (int i = 0; i < arrayList.size(); i++) {
            fn31.G((EGLContext) arrayList.get(i), eGLDisplay);
        }
        EGL14.eglReleaseThread();
        fn31.s("Error releasing thread");
        EGL14.eglTerminate(eGLDisplay);
        fn31.s("Error terminating display");
    }

    public File j(seo seoVar) {
        String strP = cy30.p(seoVar.c, "/", seoVar.b, "/", seoVar.a);
        int i = hu50.a;
        cyi0 cyi0Var = gu50.a;
        Charset charset = nne.a;
        String string = cyi0Var.F(strP, charset).toString();
        return new File((File) this.c, gvg.h(cyi0Var.F(seoVar.d, charset).toString().substring(0, 16), "/", string, ".mp3"));
    }

    public boolean k() {
        dma1 dma1Var = (dma1) this.b;
        int iL = dma1Var.l(a5s.a, 0);
        long jG = dma1Var.g(a5s.b, 0L);
        long jB = ((yqg) this.c).b();
        List list = q110.a;
        return iL < 3 && (((int) ((jB - jG) / 86400000)) >= 2);
    }

    public mr20 l(Set set) {
        return rqt0.u(hu20.e(new ry50(((c9c0) this.b).e.a(), (byte) 18), new y3s((lnm) null, new xx3(set, this, (lnm) null, (byte) 3), (byte) 0)));
    }

    public PublishSubject m() {
        return (PublishSubject) this.b;
    }

    public List n(gd61 gd61Var) {
        boolean z = gd61Var.e;
        boolean z2 = gd61Var.d;
        boolean z3 = gd61Var.b;
        int iC = l1d.C(gd61Var.a);
        if (iC != 0) {
            if (iC != 1) {
                if (iC == 2) {
                    return z6x.a;
                }
                eg.o();
                return null;
            }
            lvc1 lvc1Var = (lvc1) ((tzo) this.c).b;
            smc0 smc0VarN = k4p1.n();
            wpw wpwVar = (wpw) lvc1Var.d;
            if (wpwVar != null && z2 && z) {
                smc0VarN.add(wpwVar);
            } else {
                smc0VarN.add((dx0) lvc1Var.b);
            }
            smc0VarN.add((dx0) lvc1Var.c);
            return k4p1.k(smc0VarN);
        }
        sun sunVar = (sun) this.b;
        boolean z4 = gd61Var.c;
        bjx bjxVar = (bjx) sunVar.b;
        dx0 dx0Var = (dx0) bjxVar.d;
        wpw wpwVar2 = (wpw) bjxVar.g;
        if (!z3) {
            smc0 smc0VarN2 = k4p1.n();
            smc0VarN2.add((qtw) bjxVar.e);
            if (wpwVar2 != null && z2 && z) {
                smc0VarN2.add(wpwVar2);
            } else {
                smc0VarN2.add(dx0Var);
            }
            return k4p1.k(smc0VarN2);
        }
        smc0 smc0VarN3 = k4p1.n();
        if (z4) {
            smc0VarN3.add((qtw) bjxVar.f);
        }
        smc0VarN3.add((qm91) bjxVar.b);
        smc0VarN3.add((dx0) bjxVar.c);
        if (wpwVar2 != null && z2 && z) {
            smc0VarN3.add(wpwVar2);
        } else {
            smc0VarN3.add(dx0Var);
        }
        return k4p1.k(smc0VarN3);
    }

    public void o(Exception exc) {
        ((nwr) this.b).b.invoke(exc);
    }

    public void onSuccess() {
        vu30 vu30Var = (vu30) ((nwr) this.b).g;
        View view = (View) this.c;
        vu30Var.invoke(Integer.valueOf(view.getWidth()), Integer.valueOf(view.getHeight()));
    }

    public void p() {
        i8h1 i8h1Var = (i8h1) this.b;
        x6h1 x6h1VarC = ((tdl0) this.c).b.c();
        x6h1VarC.i.add(new a7h1("continue_button", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("request_os_permission", 1, Collections.singletonMap("permission_to_be_requested", "location")), x6h1VarC.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
    }

    public mpj0 peek() {
        Double d = (Double) this.b;
        if (d != null) {
            double dDoubleValue = d.doubleValue();
            Double d2 = (Double) this.c;
            if (d2 != null) {
                double dDoubleValue2 = d2.doubleValue() - dDoubleValue;
                if (dDoubleValue2 >= 0.0d) {
                    return new lpj0(dDoubleValue2);
                }
            }
        }
        return null;
    }

    public void q() {
        i8h1 i8h1Var = (i8h1) this.b;
        x6h1 x6h1VarC = ((tdl0) this.c).b.c();
        x6h1VarC.i.add(new a7h1("dismiss_button", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        y6h1 y6h1VarA = x6h1VarC.a();
        b7x b7xVar = b7x.a;
        i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), y6h1VarA, r6h1.c, System.currentTimeMillis()), (xj61) null);
    }

    public void r() {
        i8h1 i8h1Var = (i8h1) this.b;
        x6h1 x6h1VarC = ((tdl0) this.c).b.c();
        x6h1VarC.i.add(new a7h1("privacy_link", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("navigate_to_external_uri", 1, Collections.singletonMap("destination", "https://www.spotify.com/legal/privacy-policy/")), x6h1VarC.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
    }

    public void record(double d) {
        if (((Double) this.b) == null) {
            this.b = Double.valueOf(d);
        }
        this.c = Double.valueOf(d);
    }

    public void s() {
        i8h1 i8h1Var = (i8h1) this.b;
        x6h1 x6h1VarC = ((tdl0) this.c).b.c();
        x6h1VarC.i.add(new a7h1("settings_button", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        y6h1 y6h1VarA = x6h1VarC.a();
        b7x b7xVar = b7x.a;
        i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("open_os_settings", 1, b7xVar), y6h1VarA, r6h1.c, System.currentTimeMillis()), (xj61) null);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:64:0x0216  */
    public c481 t(GetShowResponse getShowResponse) {
        f281 f281Var;
        d281 d281Var;
        e281 e281Var;
        int i;
        yao0 yao0Var;
        byr byrVar = (byr) this.c;
        eyr eyrVar = (eyr) this.b;
        ShowRequest$Response showRequest$ResponseN = getShowResponse.n();
        ShowMetadata showMetadataP = showRequest$ResponseN.p().p();
        ShowShowState$ShowCollectionState showShowState$ShowCollectionStateO = showRequest$ResponseN.p().o();
        ShowOfflineStateOuterClass$ShowOfflineState showOfflineStateOuterClass$ShowOfflineStateQ = showRequest$ResponseN.p().q();
        ShowPlayState showPlayStateR = showRequest$ResponseN.p().r();
        String link = showMetadataP.getLink();
        String name = showMetadataP.getName();
        String publisher = showMetadataP.getPublisher();
        String language = showMetadataP.getLanguage();
        long playedTime = showPlayStateR.getPlayedTime();
        String description = showMetadataP.getDescription();
        String str = (String) o7h.t0(0, showMetadataP.getCopyrightList());
        cen cenVarT = yla.t(showMetadataP.getCovers());
        boolean isPlayable = showPlayStateR.getIsPlayable();
        boolean isExplicit = showMetadataP.getIsExplicit();
        boolean isInCollection = showShowState$ShowCollectionStateO.getIsInCollection();
        String trailerUri = showMetadataP.getTrailerUri();
        String latestPlayedEpisodeLink = showPlayStateR.getLatestPlayedEpisodeLink();
        String resumeEpisodeLink = showPlayStateR.getResumeEpisodeLink();
        int playedPercentage = showPlayStateR.getPlayedPercentage();
        int mediaTypeEnum = showMetadataP.getMediaTypeEnum();
        if (mediaTypeEnum == 0) {
            f281Var = f281.a;
        } else if (mediaTypeEnum != 1) {
            f281Var = mediaTypeEnum != 2 ? f281.d : f281.c;
        } else {
            f281Var = f281.b;
        }
        f281 f281Var2 = f281Var;
        String consumptionOrder = showMetadataP.getConsumptionOrder();
        int iHashCode = consumptionOrder.hashCode();
        if (iHashCode != -934918565) {
            if (iHashCode != -632946108) {
                if (iHashCode == -164011777 && consumptionOrder.equals("sequential")) {
                    d281Var = d281.c;
                } else {
                    d281Var = d281.a;
                }
            } else if (consumptionOrder.equals("episodic")) {
                d281Var = d281.b;
            } else {
                d281Var = d281.a;
            }
        } else if (consumptionOrder.equals("recent")) {
            d281Var = d281.d;
        } else {
            d281Var = d281.a;
        }
        d281 d281Var2 = d281Var;
        int i2 = dyr.a[showPlayStateR.getLabel().ordinal()];
        if (i2 == 1) {
            e281Var = e281.a;
        } else if (i2 == 2) {
            e281Var = e281.b;
        } else if (i2 == 3) {
            e281Var = e281.c;
        } else {
            if (i2 != 4) {
                eg.o();
                return null;
            }
            e281Var = e281.d;
        }
        e281 e281Var2 = e281Var;
        boolean isMusicAndTalk = showMetadataP.getIsMusicAndTalk();
        boolean isBook = showMetadataP.getIsBook();
        List<Extension> extensionList = showMetadataP.getExtensionList();
        ArrayList arrayList = new ArrayList(q7h.U(extensionList, 10));
        for (Iterator it = extensionList.iterator(); it.hasNext(); it = it) {
            Extension extension = (Extension) it.next();
            arrayList.add(new jz00(extension.getData().t(), extension.getExtensionKind().getNumber()));
        }
        jv00 jv00VarA = eyrVar.a.a(arrayList);
        showOfflineStateOuterClass$ShowOfflineStateQ.getClass();
        g281 g281Var = new g281(link, name, publisher, language, playedTime, description, str, cenVarT, isPlayable, isExplicit, isInCollection, trailerUri, -1L, latestPlayedEpisodeLink, resumeEpisodeLink, playedPercentage, f281Var2, d281Var2, e281Var2, isMusicAndTalk, isBook, jv00VarA, dm5.O(showOfflineStateOuterClass$ShowOfflineStateQ.getSyncProgress(), showOfflineStateOuterClass$ShowOfflineStateQ.getOfflineState()), jma.j(showPlayStateR.getPlayabilityRestriction()), (Map) null, 402653184);
        h290<ShowRequest.Item> h290VarR = getShowResponse.n().r();
        ArrayList arrayList2 = new ArrayList(q7h.U(h290VarR, 10));
        for (ShowRequest.Item item : h290VarR) {
            item.getClass();
            arrayList2.add(byrVar.a(item));
        }
        boolean zS = getShowResponse.n().s();
        int iU = getShowResponse.n().u();
        int iV = getShowResponse.n().v();
        ShowRequest$Response showRequest$ResponseN2 = getShowResponse.n();
        vnm vnmVar = !showRequest$ResponseN2.n().r() ? null : new vnm(byrVar.a(showRequest$ResponseN2.n().n().o()));
        ShowRequest$Response showRequest$ResponseN3 = getShowResponse.n();
        t5g1 t5g1Var = !showRequest$ResponseN3.n().t() ? null : new t5g1(byrVar.a(showRequest$ResponseN3.n().q().o()));
        ShowRequest$Response showRequest$ResponseN4 = getShowResponse.n();
        if (showRequest$ResponseN4.n().s()) {
            ShowRequest$NextBestEpisodeSection showRequest$NextBestEpisodeSectionP = showRequest$ResponseN4.n().p();
            switch (cyr.a[showRequest$NextBestEpisodeSectionP.p().ordinal()]) {
                case -1:
                case 6:
                    yao0Var = null;
                    break;
                case 0:
                default:
                    eg.o();
                    return null;
                case 1:
                    i = 1;
                    yao0Var = new yao0(i, byrVar.a(showRequest$NextBestEpisodeSectionP.o()));
                    break;
                case 2:
                    i = 2;
                    yao0Var = new yao0(i, byrVar.a(showRequest$NextBestEpisodeSectionP.o()));
                    break;
                case 3:
                    i = 3;
                    yao0Var = new yao0(i, byrVar.a(showRequest$NextBestEpisodeSectionP.o()));
                    break;
                case 4:
                    i = 4;
                    yao0Var = new yao0(i, byrVar.a(showRequest$NextBestEpisodeSectionP.o()));
                    break;
                case 5:
                    i = 5;
                    yao0Var = new yao0(i, byrVar.a(showRequest$NextBestEpisodeSectionP.o()));
                    break;
            }
        } else {
            yao0Var = null;
        }
        ShowRequest$Response showRequest$ResponseN5 = getShowResponse.n();
        int iT = showRequest$ResponseN5.t();
        return new c481(g281Var, arrayList2, zS, iU, iV, new t4z(iT, showRequest$ResponseN5.q() + iT), vnmVar, (liq0) null, t5g1Var, yao0Var);
    }

    public void u() {
        dma1 dma1Var = (dma1) this.b;
        bma1 bma1Var = a5s.a;
        int iL = dma1Var.l(bma1Var, 0);
        hma1 hma1VarEdit = dma1Var.edit();
        hma1VarEdit.b(bma1Var, iL + 1);
        l1d.B((yqg) this.c, hma1VarEdit, a5s.b);
    }

    public void v(Object obj) {
        ji0 ji0Var = (ji0) obj;
        ((xgu) this.b).a = ji0Var;
        fta ftaVar = ((ygu) this.c).d;
        qm60 qm60Var = qm60.d;
        ji0Var.getClass();
        ftaVar.v(qm60Var, ji0Var);
    }

    public void w() {
        ProgressDialog progressDialog = (ProgressDialog) this.c;
        if (progressDialog == null) {
            progressDialog = new ProgressDialog((AuthorizationActivity) this.b, 2132018151);
            progressDialog.setMessage(progressDialog.getContext().getString(2131959761));
            progressDialog.setOnCancelListener(new vae(this, (byte) 2));
            this.c = progressDialog;
        }
        progressDialog.show();
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00af  */
    public void x(int i, String str, String str2) {
        Object next;
        boolean z;
        kx7 kx7Var;
        inr inrVar = (g0l) this.c;
        nnr nnrVarK = inrVar.k();
        Bundle bundle = null;
        if (((nnrVarK == null || (kx7Var = nnrVarK.B.a) == null) ? null : kx7Var.d) != luq0.e) {
            nnrVarK = null;
        }
        Iterator it = o7h.N0(p7h.N(nnrVarK), inrVar.i()).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!u890.j(((l0l) next).j(), str));
        l0l l0lVar = (l0l) next;
        if (l0lVar != null) {
            String strJ = l0lVar.j();
            String str3 = l0lVar.G().a;
            String strV = hqq0.V(l0lVar);
            List listH = l0lVar.h();
            List capabilities = l0lVar.getCapabilities();
            boolean z2 = l0lVar.k() && !l0lVar.l();
            if (l0lVar.isActive()) {
                z = true;
            } else {
                List listI = inrVar.i();
                if (!(listI instanceof Collection) || !listI.isEmpty()) {
                    Iterator it2 = listI.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (((l0l) it2.next()).isActive()) {
                            }
                        } else if (l0lVar.l()) {
                            z = true;
                        }
                    }
                } else if (l0lVar.l()) {
                    z = true;
                }
                z = false;
            }
            nim nimVar = new nim(i, strJ, str3, strV, listH, capabilities, z2, z);
            bundle = new Bundle();
            bundle.putParcelable("device.picker.context.menu.args", nimVar);
        }
        if (bundle != null) {
            ((a1r0) this.b).a("spotify:internal:gaia-picker-device-menu", str2, bundle);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object y(String str, onm onmVar) {
        z3s z3sVar;
        if (onmVar instanceof z3s) {
            z3sVar = (z3s) onmVar;
            int i = z3sVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                z3sVar.c = i - Integer.MIN_VALUE;
            } else {
                z3sVar = new z3s(this, onmVar);
            }
        } else {
            z3sVar = new z3s(this, onmVar);
        }
        Object objZ = z3sVar.a;
        int i2 = z3sVar.c;
        if (i2 == 0) {
            hm5.M(objZ);
            u6f0 u6f0Var = (u6f0) this.c;
            z3sVar.c = 1;
            objZ = sjo0.z(u6f0Var, str, z3sVar);
            d9n d9nVar = d9n.a;
            if (objZ == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objZ);
        }
        q6f0 q6f0Var = (q6f0) objZ;
        return q6f0Var == null ? su90.a : new ou90(q6f0Var.a);
    }

    public /* synthetic */ hur(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public hur(i8h1 i8h1Var) {
        this.a = (byte) 24;
        this.b = i8h1Var;
        this.c = new tdl0((byte) 0);
    }

    public hur(File file, yqg yqgVar) {
        this.a = (byte) 28;
        this.b = yqgVar;
        this.c = new File(file, "fitness-tts-cue-store");
    }

    public hur(mvr mvrVar) {
        this.a = (byte) 1;
        this.c = mvrVar;
        this.b = mvrVar.b;
    }

    public /* synthetic */ hur(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }
}
