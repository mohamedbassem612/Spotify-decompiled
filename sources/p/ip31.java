package p;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.protobuf.Empty;
import com.spotify.ageverification.dialog.view.AgeVerificationDialogActivity;
import com.spotify.base.java.logging.Logger;
import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import com.spotify.encoreconsumermobile.elements.addtobutton.AddToButtonView;
import com.spotify.encoreconsumermobile.elements.badge.contentrestriction.ContentRestrictionBadgeView;
import com.spotify.encoreconsumermobile.elements.contextmenu.ContextMenuButton;
import com.spotify.encoreconsumermobile.elements.downloadbutton.DownloadButtonView;
import com.spotify.encoreconsumermobile.elements.quickactions.ban.BanButton;
import com.spotify.encoreconsumermobile.elements.shuffle.ShuffleButtonView;
import com.spotify.encoreconsumermobile.elements.smartshufflebutton.SmartShuffleButtonView;
import com.spotify.genalphagraduation.graduationmessagingimpl.ForcedGraduationLockActivity;
import com.spotify.login.adaptiveauthentication.challenge.smscode.OtpInputView;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Format;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.domain.models.MessageParsingException;
import com.spotify.pendragon.v1.proto.FormatMetadata;
import com.spotify.player.esperanto.proto.EsLoggingParams;
import com.spotify.player.esperanto.proto.EsOptional;
import com.spotify.player.model.PlayOrigin;
import com.spotify.player.model.command.options.LoggingParams;
import com.spotify.player.model.command.options.PlayOptions;
import com.spotify.player.model.command.options.PreparePlayOptions;
import com.spotify.watchfeed.uiusecases.element.explorerentrypoint.WatchFeedEntityExplorerEntryPointButtonView;
import com.spotify.xrprojected.ui.XrProjectedActivity;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableMap;
import io.reactivex.rxjava3.subjects.PublishSubject;
import java.util.Collections;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ip31 implements nrm0, BiFunction, dl4, Function {
    public final /* synthetic */ byte a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;

    public ip31(k42 k42Var) {
        this.a = (byte) 13;
        this.b = k42Var;
        this.c = new chp(this, 1, (byte) 23);
        this.d = iy81.a(new chp(this, 0, (byte) 23));
        this.e = new chp(this, 2, (byte) 23);
        this.f = new chp(this, 4, (byte) 23);
        this.g = iy81.a(new chp(this, 3, (byte) 23));
        this.h = iy81.a(new chp(this, 5, (byte) 23));
        this.i = iy81.a(new chp(this, 6, (byte) 23));
    }

    public static /* bridge */ /* synthetic */ k42 a(ip31 ip31Var) {
        return (k42) ip31Var.b;
    }

    public static /* bridge */ /* synthetic */ z0q b(ip31 ip31Var) {
        return (z0q) ip31Var.c;
    }

    public static final Object c(ip31 ip31Var, w6e0 w6e0Var, l53 l53Var) {
        return fn31.Y((q8n) ip31Var.i, new k53(ip31Var, w6e0Var, (lnm) null, (byte) 0), l53Var);
    }

    public static final /* synthetic */ t740 e(ip31 ip31Var) {
        return (t740) ip31Var.e;
    }

    public static final /* synthetic */ q8n f(ip31 ip31Var) {
        return (q8n) ip31Var.i;
    }

    public static final /* synthetic */ w6e0 g(ip31 ip31Var) {
        return (w6e0) ip31Var.g;
    }

    public static final /* synthetic */ lc3 h(ip31 ip31Var) {
        return (lc3) ip31Var.b;
    }

    public static final /* synthetic */ vw0 i(boolean z, boolean z2) {
        return new vw0(z, z2);
    }

    public static final Object j(ip31 ip31Var, String str, String str2, l53 l53Var) {
        y6h1 y6h1Var = y6h1.i;
        x6h1 x6h1VarI = i3o1.i();
        x6h1VarI.h = "music";
        x6h1VarI.a = "mobile-album-page";
        x6h1VarI.f = "23.0.0";
        x6h1VarI.g = "22.0.0";
        x6h1VarI.d = str;
        y6h1 y6h1VarA = x6h1VarI.a();
        p7h.M(new String[]{"free-tier-album", "album"});
        x6h1 x6h1VarC = y6h1VarA.c();
        x6h1VarC.i.add(new a7h1("deeplinking", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        Object objE = ((fd3) ip31Var.c).e(new yc3(str2), ((i8h1) ip31Var.d).m(new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("play", 1, Collections.singletonMap("item_to_be_played", str2 == null ? "" : str2)), x6h1VarC.a(), r6h1.c, System.currentTimeMillis()), (xj61) null), l53Var);
        return objE == d9n.a ? objE : rih1.a;
    }

    public static final void k(ip31 ip31Var, boolean z) {
        ip31Var.r(false, z);
        op71.r(((i42) ip31Var.e).c.a);
        op71.r(((liv0) ip31Var.b).c.a);
    }

    public static final void l(ip31 ip31Var, boolean z) {
        i42 i42Var = (i42) ip31Var.e;
        dh30 dh30Var = i42Var.a;
        l4p1.u(i42Var.c, new lt20(new fu20(hu20.e(o4p1.r(new huz(new ry50(((d780) dh30Var.b).callStream("spotify.ads.esperanto.proto.InStream", "SubBreakChanged", Empty.n()), (byte) 9), (byte) 16), (q8n) dh30Var.c), new h42(i42Var, (lnm) null)), new kk(i42Var, (lnm) null, (byte) 4), (byte) 1), new jk(3, (lnm) null, (byte) 3), (byte) 0));
        ip31Var.r(true, z);
    }

    public static ip31 s(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        CoordinatorLayout coordinatorLayoutInflate = layoutInflater.inflate(2131624695, viewGroup, false);
        CoordinatorLayout coordinatorLayout = coordinatorLayoutInflate;
        int i = 2131428568;
        TextView textView = (TextView) m5n1.t(coordinatorLayoutInflate, 2131428568);
        if (textView != null) {
            i = 2131429077;
            TextView textView2 = (TextView) m5n1.t(coordinatorLayoutInflate, 2131429077);
            if (textView2 != null) {
                i = 2131430245;
                TextView textView3 = (TextView) m5n1.t(coordinatorLayoutInflate, 2131430245);
                if (textView3 != null) {
                    i = 2131430246;
                    OtpInputView otpInputViewT = m5n1.t(coordinatorLayoutInflate, 2131430246);
                    if (otpInputViewT != null) {
                        i = 2131430248;
                        TextView textView4 = (TextView) m5n1.t(coordinatorLayoutInflate, 2131430248);
                        if (textView4 != null) {
                            i = 2131430669;
                            TextView textView5 = (TextView) m5n1.t(coordinatorLayoutInflate, 2131430669);
                            if (textView5 != null) {
                                i = 2131431561;
                                if (((LinearLayout) m5n1.t(coordinatorLayoutInflate, 2131431561)) != null) {
                                    i = 2131431562;
                                    Button button = (Button) m5n1.t(coordinatorLayoutInflate, 2131431562);
                                    if (button != null) {
                                        return new ip31(coordinatorLayout, textView, textView2, textView3, otpInputViewT, textView4, textView5, button, (byte) 26);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        bhn0.i("Missing required view with ID: ".concat(coordinatorLayoutInflate.getResources().getResourceName(i)));
        return null;
    }

    public Object apply(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        vum1 vum1Var = (vum1) obj2;
        String str = (String) this.b;
        String str2 = (String) this.c;
        Uri uri = (str2 == null || str2.length() == 0) ? Uri.EMPTY : Uri.parse(str2);
        uri.getClass();
        igm igmVar = new igm(str, new wfm(uri), (String) this.d);
        ypk ypkVar = (ypk) this.e;
        zpk zpkVar = (zpk) this.f;
        lik1 lik1Var = (lik1) this.g;
        String str3 = (String) this.h;
        String str4 = (String) this.i;
        smc0 smc0VarN = k4p1.n();
        pn1 pn1Var = zpkVar.f;
        smc0VarN.add(new w0d(pn1Var.a, pn1Var.b, lik1Var, str3, str4, bool.booleanValue(), pn1Var.c).c());
        if (ypkVar.a) {
            boolean z = vum1Var instanceof tum1;
            e2t0 e2t0Var = e2t0.g;
            if (z) {
                smc0VarN.add(zpkVar.e.i(str3, e2t0Var));
            } else if (!(vum1Var instanceof uum1)) {
                smc0VarN.add(zpkVar.d.g(str3, e2t0Var, lik1Var));
            }
        }
        smc0VarN.add(f971.b(zpkVar.a, str3, str4));
        smc0VarN.addAll(ypkVar.e);
        String str5 = ypkVar.d;
        if (ypkVar.c && str5 != null && str5.length() != 0) {
            smc0VarN.add(new jhm("go_to_venue", dmx.c, (fhm) null, 2131956260, (String) null, false, (tm81) null, new ihm(ahm.c, new ghm(vc40.Y0, new ry40(str5, (byte) 3)), new fz40(zpkVar.h, str5, (byte) 1)), 244));
        }
        smc0VarN.addAll(ypkVar.f);
        if (ypkVar.b) {
            smc0VarN.add(new jhm("live_events_report_problem", fnx.c, (fhm) null, 2131954429, (String) null, false, (tm81) null, new ihm(new ygm(2), new ghm(ma21.e1, pl21.b), new ql21(zpkVar.g, str3)), 244));
        }
        return new kjm(igmVar, k4p1.k(smc0VarN), 4);
    }

    public void d(Function0 function0, b0k b0kVar, int i) {
        b0k b0kVar2;
        k6a1 k6a1Var = (k6a1) this.e;
        ven0 ven0Var = (ven0) this.c;
        ven0 ven0Var2 = (ven0) this.d;
        m4c m4cVar = fkj0.X;
        ven0 ven0Var3 = (ven0) this.b;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(469975973);
        int i2 = (b0kVar3.i(function0) ? 4 : 2) | i | (b0kVar3.g(this) ? 32 : 16);
        if (b0kVar3.Y(i2 & 1, (i2 & 19) != 18)) {
            String str = (String) ((ven0) this.f).getValue();
            iu30 iu30Var = (iu30) ((ven0) this.g).getValue();
            boolean z = ((Boolean) ((ven0) this.h).getValue()).booleanValue() && !((Boolean) ven0Var2.getValue()).booleanValue();
            boolean zBooleanValue = ((Boolean) ((ven0) this.i).getValue()).booleanValue();
            boolean zI = b0kVar3.i(ven0Var3);
            Object objT = b0kVar3.T();
            if (zI || objT == m4cVar) {
                objT = new cy7(ven0Var3, (byte) 21);
                b0kVar3.s0(objT);
            }
            iu30 iu30Var2 = (iu30) objT;
            boolean zI2 = b0kVar3.i(ven0Var3);
            Object objT2 = b0kVar3.T();
            if (zI2 || objT2 == m4cVar) {
                objT2 = new bp9(ven0Var3, (byte) 17);
                b0kVar3.s0(objT2);
            }
            Function0 function1 = (Function0) objT2;
            boolean zI3 = b0kVar3.i(ven0Var3) | b0kVar3.i(ven0Var);
            Object objT3 = b0kVar3.T();
            if (zI3 || objT3 == m4cVar) {
                objT3 = new zqe(ven0Var3, ven0Var, (byte) 0);
                b0kVar3.s0(objT3);
            }
            Function0 function2 = (Function0) objT3;
            boolean zI4 = b0kVar3.i(ven0Var3);
            Object objT4 = b0kVar3.T();
            if (zI4 || objT4 == m4cVar) {
                objT4 = new bp9(ven0Var3, (byte) 18);
                b0kVar3.s0(objT4);
            }
            Function0 function3 = (Function0) objT4;
            boolean zI5 = b0kVar3.i(ven0Var2) | b0kVar3.i(ven0Var3) | ((i2 & 14) == 4);
            Object objT5 = b0kVar3.T();
            if (zI5 || objT5 == m4cVar) {
                objT5 = new dh6(function0, ven0Var2, ven0Var3, (byte) 1);
                b0kVar3.s0(objT5);
            }
            Function0 function4 = (Function0) objT5;
            boolean zI6 = b0kVar3.i(k6a1Var) | b0kVar3.i(ven0Var3);
            Object objT6 = b0kVar3.T();
            if (zI6 || objT6 == m4cVar) {
                objT6 = new sy5(k6a1Var, ven0Var3, (byte) 1);
                b0kVar3.s0(objT6);
            }
            b0kVar2 = b0kVar3;
            loo1.b(str, iu30Var, iu30Var2, function1, function2, function3, function4, zBooleanValue, (qim0) null, (String) null, z, (Function0) objT6, b0kVar2, 0);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new a7e(this, function0, i, (byte) 5);
        }
    }

    public nv4 m() {
        luk lukVar = (luk) ((e1k1) this.b).f.get();
        c8o.l(lukVar);
        return new nv4(false, false, false, false, false, lukVar);
    }

    public jpu n() {
        t8u0 t8u0Var = (t8u0) ((k42) this.b).i;
        c8o.l(t8u0Var);
        return new jpu(t8u0Var.a(new s98((byte) 2)).a());
    }

    public zeu o() {
        k42 k42Var = (k42) this.b;
        edp edpVar = (edp) k42Var.d;
        c8o.l(edpVar);
        muz muzVar = (muz) k42Var.e;
        c8o.l(muzVar);
        h1y h1yVarA = edpVar.a(muzVar);
        wen0 wen0Var = (wen0) k42Var.c;
        c8o.l(wen0Var);
        return new zeu(h1yVarA, wen0Var, t());
    }

    public p3t p() {
        xm41 xm41Var = (xm41) ((gnu) this.b).j.get();
        c8o.l(xm41Var);
        lnu.a.getClass();
        return new p3t(eth.V(xm41Var), (byte) 8);
    }

    public CoordinatorLayout q() {
        return (CoordinatorLayout) this.b;
    }

    public void r(boolean z, boolean z2) {
        liv0 liv0Var = (liv0) this.b;
        EnumSet enumSet = liv0Var.b;
        lnm lnmVar = null;
        kiv0 kiv0Var = kiv0.a;
        if (z2) {
            enumSet.remove(kiv0Var);
        } else if (!enumSet.contains(kiv0Var)) {
            boolean zIsEmpty = enumSet.isEmpty();
            enumSet.add(kiv0Var);
            if (zIsEmpty) {
                fn31.T(liv0Var.c, (o8n) null, 0, new c3u0(liv0Var, (lnm) null, (byte) 10), 3);
            }
        }
        ((fza1) this.d).c(z);
        dy0 dy0Var = (dy0) this.i;
        if (!z) {
            if (dy0Var != null) {
                op71.q(dy0Var.b.a, (CancellationException) null);
            }
            this.i = null;
        } else {
            if (dy0Var == null) {
                dy0Var = (dy0) ((jwo) this.c).get();
                llm llmVar = dy0Var.b;
                op71.q(llmVar.a, (CancellationException) null);
                fn31.T(llmVar, (o8n) null, 0, new q4(dy0Var, lnmVar, (byte) 16), 3);
            }
            this.i = dy0Var;
        }
    }

    public llm t() {
        q8n q8nVar = (q8n) ((k42) this.b).s;
        c8o.l(q8nVar);
        return smo1.e(flo1.l(q8nVar, guo1.B()));
    }

    public st60 u() {
        k42 k42Var = (k42) this.b;
        Flowable flowable = (Flowable) k42Var.a;
        c8o.l(flowable);
        t8u0 t8u0Var = (t8u0) k42Var.i;
        c8o.l(t8u0Var);
        cyp cypVarA = t8u0Var.a(new s98((byte) 2));
        ar51 ar51Var = (ar51) k42Var.j;
        c8o.l(ar51Var);
        return new st60(flowable, ar51Var.a(cypVarA.a()), n(), (byte) 19);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.domain.models.MessageParsingException */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public Format v(FormatMetadata formatMetadata) throws MessageParsingException {
        String strQ = dv20.q(formatMetadata.w());
        switch (strQ.hashCode()) {
            case -422093853:
                if (strQ.equals("TOOLTIP")) {
                    return (Format) ((q4f1) this.e).invoke(formatMetadata.v());
                }
                break;
            case 73532045:
                if (strQ.equals("MODAL")) {
                    return (Format) ((kem0) this.b).invoke(formatMetadata.t());
                }
                break;
            case 93781200:
                if (strQ.equals("WEB_VIEW")) {
                    return (Format) ((djl1) this.i).invoke(formatMetadata.x());
                }
                break;
            case 542952694:
                if (strQ.equals("INLINE_CARD")) {
                    return (Format) ((vd80) this.h).invoke(formatMetadata.s());
                }
                break;
            case 595158971:
                if (strQ.equals("FULLSCREEN")) {
                    return (Format) ((as30) this.c).invoke(formatMetadata.r());
                }
                break;
            case 1055250693:
                if (strQ.equals("SNACKBAR")) {
                    return (Format) ((wq91) this.f).invoke(formatMetadata.u());
                }
                break;
            case 1534708267:
                if (strQ.equals("BOTTOM_SHEET")) {
                    return (Format) ((qwb) this.g).invoke(formatMetadata.p());
                }
                break;
            case 1951953708:
                if (strQ.equals("BANNER")) {
                    return (Format) ((r6a) this.d).invoke(formatMetadata.o());
                }
                break;
        }
        throw new MessageParsingException(g4j0.UNSUPPORTED_FORMAT);
    }

    public void w(Object obj) {
        switch (this.a) {
            case 15:
                AgeVerificationDialogActivity ageVerificationDialogActivity = (AgeVerificationDialogActivity) obj;
                daq daqVar = (daq) this.c;
                ((t3b1) ageVerificationDialogActivity).b1 = (jgu) daqVar.a.g0.get();
                ((t3b1) ageVerificationDialogActivity).c1 = new tuk(xqu.a((p2p) this.f));
                ageVerificationDialogActivity.f1 = (yl2) ((RetrofitMaker) daqVar.Y3.get()).createWebgateService(yl2.class, "android-age-verification-dialog");
                ageVerificationDialogActivity.h1 = (gw70) daqVar.d8.get();
                ageVerificationDialogActivity.g1 = new gid(daqVar.A5.get(), (Object) new py9((byte) 9), (byte) 22);
                ageVerificationDialogActivity.j1 = (Scheduler) daqVar.z1.get();
                ageVerificationDialogActivity.i1 = (lzn0) ((p2p) this.i).get();
                break;
            case 16:
                ForcedGraduationLockActivity forcedGraduationLockActivity = (ForcedGraduationLockActivity) obj;
                daq daqVar2 = (daq) this.c;
                ((t3b1) forcedGraduationLockActivity).b1 = (jgu) daqVar2.a.g0.get();
                ((t3b1) forcedGraduationLockActivity).c1 = new tuk(xqu.a((s2q) this.f));
                forcedGraduationLockActivity.j1 = (ov20) daqVar2.P5.get();
                forcedGraduationLockActivity.k1 = (gw70) daqVar2.d8.get();
                forcedGraduationLockActivity.l1 = ((Boolean) daqVar2.Qn.get()).booleanValue();
                forcedGraduationLockActivity.i1 = (lzn0) ((s2q) this.i).get();
                forcedGraduationLockActivity.h1 = (zn41) daqVar2.Zl.get();
                forcedGraduationLockActivity.f1 = (l6h1) daqVar2.fg.get();
                forcedGraduationLockActivity.g1 = (i8h1) daqVar2.A5.get();
                break;
            default:
                XrProjectedActivity xrProjectedActivity = (XrProjectedActivity) obj;
                daq daqVar3 = (daq) this.c;
                ((t3b1) xrProjectedActivity).b1 = (jgu) daqVar3.a.g0.get();
                ((t3b1) xrProjectedActivity).c1 = new tuk(xqu.a((obq) this.f));
                xrProjectedActivity.j1 = (yqg) daqVar3.J1.get();
                xrProjectedActivity.i1 = (gw70) daqVar3.d8.get();
                xrProjectedActivity.h1 = new umf0((klm1) ((jly0) this.g).get(), new hql1(new frl1((Flowable) daqVar3.D5.get(), (Context) daqVar3.x1.a, (byte) 5)), (onf0) daqVar3.en.get(), (Flowable) daqVar3.D5.get(), (yqg) daqVar3.J1.get(), (ykf0) daqVar3.jo.get(), (w9u0) ((jly0) this.i).get(), (q8n) daqVar3.r2.get(), (q8n) daqVar3.w1.get());
                xrProjectedActivity.k1 = (klm1) ((jly0) this.g).get();
                xrProjectedActivity.g1 = new u7p0(new dmj1(new frl1((Flowable) daqVar3.D5.get(), (Context) daqVar3.x1.a, (byte) 5), (byte) 9), (w9u0) ((jly0) this.i).get(), (klm1) ((jly0) this.g).get(), (q8n) daqVar3.r2.get(), (q8n) daqVar3.w1.get());
                xrProjectedActivity.l1 = (xm41) daqVar3.l5.get();
                xrProjectedActivity.o1 = (l6h1) daqVar3.fg.get();
                xrProjectedActivity.n1 = (i8h1) daqVar3.A5.get();
                xrProjectedActivity.m1 = (f95) daqVar3.Eb.get();
                xrProjectedActivity.f1 = new imm1(new dmj1(new frl1((Flowable) daqVar3.D5.get(), (Context) daqVar3.x1.a, (byte) 5), (byte) 9), (w9u0) ((jly0) this.i).get(), (klm1) ((jly0) this.g).get(), (q8n) daqVar3.r2.get(), (q8n) daqVar3.w1.get());
                break;
        }
    }

    public phi0 x() {
        k42 k42Var = (k42) this.b;
        RetrofitMaker retrofitMaker = (RetrofitMaker) k42Var.h;
        c8o.l(retrofitMaker);
        au81 au81Var = new au81((rs81) retrofitMaker.createExperimentalWebgateService(rs81.class, "android-endless-sillywalk-network"));
        st60 st60VarU = u();
        wen0 wen0Var = (wen0) k42Var.c;
        c8o.l(wen0Var);
        djh djhVar = (djh) k42Var.t;
        c8o.l(djhVar);
        i5w0 i5w0Var = new i5w0(djhVar.a("interactive-dj"));
        b1y b1yVar = (b1y) k42Var.f;
        c8o.l(b1yVar);
        return new phi0((Object) au81Var, (Object) st60VarU, (Object) wen0Var, (Object) i5w0Var, (Object) b1yVar, (byte) 24);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object y(tv80 tv80Var, onm onmVar) {
        qfd0 qfd0Var;
        if (onmVar instanceof qfd0) {
            qfd0Var = (qfd0) onmVar;
            int i = qfd0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                qfd0Var.d = i - Integer.MIN_VALUE;
            } else {
                qfd0Var = new qfd0(this, onmVar);
            }
        } else {
            qfd0Var = new qfd0(this, onmVar);
        }
        Object obj = qfd0Var.b;
        int i2 = qfd0Var.d;
        int i3 = 0;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        try {
            if (i2 == 0) {
                hm5.M(obj);
                sgd0 sgd0Var = (sgd0) this.i;
                qfd0Var.a = tv80Var;
                qfd0Var.d = 1;
                if (sgd0Var.b(false, false, qfd0Var) != d9nVar) {
                }
            }
            if (i2 != 1) {
                if (i2 == 2) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            tv80Var = qfd0Var.a;
            hm5.M(obj);
            q8n q8nVar = (q8n) this.g;
            i3 = 9;
            e9c0 e9c0Var = new e9c0(this, tv80Var, (lnm) null, (byte) 9);
            qfd0Var.a = null;
            qfd0Var.d = 2;
            return fn31.Y(q8nVar, e9c0Var, qfd0Var) == d9nVar ? d9nVar : rih1Var;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            Logger.e(e2, "Failed to enable listening activity sharing", new Object[i3]);
            return rih1Var;
        }
    }

    public /* synthetic */ ip31(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
        this.g = obj6;
        this.h = obj7;
        this.i = obj8;
    }

    public ip31(String str, x2g1 x2g1Var, ajg ajgVar, DisplayMetrics displayMetrics, jc9 jc9Var, i6b i6bVar, fad0 fad0Var, f1f0 f1f0Var) {
        this.a = (byte) 7;
        this.b = str;
        this.c = ajgVar;
        this.d = displayMetrics;
        this.e = jc9Var;
        this.f = i6bVar;
        this.g = fad0Var;
        this.h = f1f0Var;
        this.i = x2g1Var.a.a();
    }

    public ip31(dg30 dg30Var, oiq oiqVar, t380 t380Var, e4t e4tVar, LinkedHashSet linkedHashSet, lxg lxgVar, dp31 dp31Var, vas vasVar, l1k l1kVar, ap31 ap31Var, vxf0 vxf0Var) {
        this.a = (byte) 0;
        this.b = t380Var;
        this.c = e4tVar;
        this.d = linkedHashSet;
        this.e = lxgVar;
        this.f = vasVar;
        this.g = l1kVar;
        new kdn0(rih1.a);
        this.i = dp31Var != null ? dp31Var.a : null;
    }

    public ip31(liv0 liv0Var, jwo jwoVar, fza1 fza1Var, i42 i42Var, tp7 tp7Var, ov20 ov20Var, q8n q8nVar) {
        this.a = (byte) 2;
        this.b = liv0Var;
        this.c = jwoVar;
        this.d = fza1Var;
        this.e = i42Var;
        this.f = tp7Var;
        this.g = ov20Var;
        this.h = smo1.e(q8nVar);
    }

    public ip31(owh0 owh0Var, g0l g0lVar, zor zorVar, c9c0 c9c0Var, byp bypVar, q8n q8nVar, m0s m0sVar, caq caqVar) {
        this.a = (byte) 21;
        this.b = owh0Var;
        this.c = g0lVar;
        this.d = zorVar;
        this.e = c9c0Var;
        this.f = bypVar;
        this.g = m0sVar;
        this.h = caqVar;
        this.i = i3a.k(q8nVar);
    }

    public ip31(View view, FlowableMap flowableMap, ln91 ln91Var, Scheduler scheduler, Scheduler scheduler2, ynb0 ynb0Var, ynb0 ynb0Var2, ynb0 ynb0Var3) {
        this.a = (byte) 5;
        this.b = view;
        this.c = flowableMap;
        this.d = scheduler;
        this.e = scheduler2;
        this.f = ynb0Var;
        this.g = ynb0Var2;
        this.h = ynb0Var3;
        this.i = new rku();
    }

    public ip31(gg11 gg11Var, th30 th30Var, pta1 pta1Var, Scheduler scheduler, Scheduler scheduler2, Context context, iy4 iy4Var, qta1 qta1Var, rta1 rta1Var, Activity activity) {
        this.a = (byte) 22;
        this.b = gg11Var;
        this.c = th30Var;
        this.d = pta1Var;
        this.e = scheduler;
        this.f = context;
        this.g = iy4Var;
        this.h = rta1Var;
        PublishSubject publishSubject = new PublishSubject();
        this.i = publishSubject;
        publishSubject.flatMapSingle(new xap((Object) this, (byte) 16)).observeOn(scheduler2).subscribe(new cfs(this, (byte) 5), fcc.X0);
    }

    public ip31(z7e z7eVar, y7e y7eVar) {
        this.a = (byte) 9;
        this.b = z7eVar;
        this.c = y7eVar;
        this.d = xqu.b(new b2p(this, 2, (byte) 11));
        this.e = new b2p(this, 3, (byte) 11);
        this.f = iy81.a(new b2p(this, 1, (byte) 11));
        this.g = xqu.b(new b2p(this, 0, (byte) 11));
        this.h = xqu.b(new b2p(this, 5, (byte) 11));
        this.i = xqu.b(new b2p(this, 4, (byte) 11));
    }

    public ip31(z0q z0qVar, il91 il91Var) {
        this.a = (byte) 19;
        this.b = il91Var;
        this.c = z0qVar;
        this.d = iy81.a(new ipq(this, 2, (byte) 16));
        this.e = iy81.a(new ipq(this, 3, (byte) 16));
        this.f = new ipq(this, 1, (byte) 16);
        this.g = iy81.a(new ipq(this, 5, (byte) 16));
        this.h = new ipq(this, 4, (byte) 16);
        this.i = iy81.a(new ipq(this, 0, (byte) 16));
    }

    public ip31(ddn ddnVar, edn ednVar, q7r0 q7r0Var) {
        this.a = (byte) 10;
        this.b = ednVar;
        this.c = ddnVar;
        this.d = q7r0Var;
        byte b = 16;
        this.e = xqu.b(new d7p(this, 0, b));
        this.f = new d7p(this, 1, b);
        this.g = iy81.a(new d7p(this, 2, b));
        this.h = new d7p(this, 4, b);
        this.i = new d7p(this, 3, b);
    }

    public ip31(gl20 gl20Var, il20 il20Var, q7r0 q7r0Var) {
        this.a = (byte) 12;
        this.b = gl20Var;
        this.c = il20Var;
        this.d = q7r0Var;
        this.e = xqu.b(new chp(this, 0, (byte) 5));
        this.f = xqu.b(new chp(this, 1, (byte) 5));
        this.g = xqu.b(new chp(this, 2, (byte) 5));
        this.h = iy81.a(new chp(this, 3, (byte) 5));
        this.i = iy81.a(new chp(this, 4, (byte) 5));
    }

    public ip31(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, AddToButtonView addToButtonView, BanButton banButton, ContextMenuButton contextMenuButton, DownloadButtonView downloadButtonView, WatchFeedEntityExplorerEntryPointButtonView watchFeedEntityExplorerEntryPointButtonView, TextView textView, ContentRestrictionBadgeView contentRestrictionBadgeView, ShuffleButtonView shuffleButtonView, SmartShuffleButtonView smartShuffleButtonView) {
        this.a = (byte) 1;
        this.b = constraintLayout2;
        this.c = addToButtonView;
        this.d = banButton;
        this.e = contextMenuButton;
        this.f = textView;
        this.g = contentRestrictionBadgeView;
        this.h = shuffleButtonView;
        this.i = smartShuffleButtonView;
    }

    public ip31(ein0 ein0Var, zuj zujVar, q7r0 q7r0Var) {
        this.a = (byte) 14;
        this.b = ein0Var;
        this.c = q7r0Var;
        byte b = 18;
        this.d = new bsp(this, 0, b);
        this.e = xqu.b(new bsp(this, 2, b));
        this.f = new bsp(this, 1, b);
        this.g = iy81.a(new bsp(this, 3, b));
        this.h = iy81.a(new bsp(this, 4, b));
        this.i = xqu.b(new bsp(this, 5, b));
    }

    public ip31(e1k1 e1k1Var, ryj ryjVar) {
        this.a = (byte) 20;
        this.b = e1k1Var;
        this.c = xqu.b(new tsq(this, 0, (byte) 20));
        this.d = new tsq(this, 2, (byte) 20);
        this.e = iy81.a(new tsq(this, 1, (byte) 20));
        this.f = new tsq(this, 4, (byte) 20);
        this.g = iy81.a(new tsq(this, 3, (byte) 20));
        this.h = new tsq(this, 5, (byte) 20);
        this.i = new tsq(this, 6, (byte) 20);
    }

    public ip31(lh31 lh31Var, mh31 mh31Var, q7r0 q7r0Var) {
        this.a = (byte) 18;
        this.b = lh31Var;
        this.c = q7r0Var;
        this.d = xqu.b(new ykq(this, 0, (byte) 22));
        this.e = iy81.a(new ykq(this, 1, (byte) 22));
        this.f = iy81.a(new ykq(this, 2, (byte) 22));
        this.g = iy81.a(new ykq(this, 3, (byte) 22));
        this.h = new ykq(this, 5, (byte) 22);
        this.i = iy81.a(new ykq(this, 4, (byte) 22));
    }

    public ip31(zuj zujVar, gnu gnuVar, mnu mnuVar, q7r0 q7r0Var) {
        this.a = (byte) 11;
        this.b = gnuVar;
        this.c = q7r0Var;
        byte b = 29;
        this.d = xqu.b(new d7p(this, 0, b));
        this.e = xqu.b(new d7p(this, 1, b));
        this.f = new d7p(this, 2, b);
        this.g = iy81.a(new d7p(this, 4, b));
        this.h = iy81.a(new d7p(this, 3, b));
        this.i = new d7p(this, 5, b);
    }

    public ip31(daq daqVar, AgeVerificationDialogActivity ageVerificationDialogActivity) {
        this.a = (byte) 15;
        this.c = daqVar;
        this.b = ageVerificationDialogActivity;
        this.d = xqu.b(new p2p(daqVar, this, 2, (byte) 11));
        this.e = xqu.b(new p2p(daqVar, this, 1, (byte) 11));
        this.f = new p2p(daqVar, this, 0, (byte) 11);
        this.g = xqu.b(new p2p(daqVar, this, 5, (byte) 11));
        this.h = xqu.b(new p2p(daqVar, this, 4, (byte) 11));
        this.i = new p2p(daqVar, this, 3, (byte) 11);
    }

    public ip31(daq daqVar, ForcedGraduationLockActivity forcedGraduationLockActivity) {
        this.a = (byte) 16;
        this.c = daqVar;
        this.b = forcedGraduationLockActivity;
        byte b = 3;
        this.d = xqu.b(new s2q(daqVar, this, 2, b));
        this.e = xqu.b(new s2q(daqVar, this, 1, b));
        this.f = new s2q(daqVar, this, 0, b);
        this.g = xqu.b(new s2q(daqVar, this, 5, b));
        this.h = xqu.b(new s2q(daqVar, this, 4, b));
        this.i = new s2q(daqVar, this, b, b);
    }

    public ip31(daq daqVar, XrProjectedActivity xrProjectedActivity) {
        this.a = (byte) 17;
        this.c = daqVar;
        this.b = xrProjectedActivity;
        byte b = 11;
        this.d = xqu.b(new obq(daqVar, this, 2, b));
        this.e = xqu.b(new obq(daqVar, this, 1, b));
        this.f = new obq(daqVar, this, 0, b);
        this.g = xqu.b(new obq(daqVar, this, 3, b));
        this.h = new obq(daqVar, this, 5, b);
        this.i = iy81.a(new obq(daqVar, this, 4, b));
    }

    public Object apply(Object obj) {
        PreparePlayOptions.Builder builder;
        LinkedHashMap linkedHashMap;
        PlayOrigin playOrigin = (PlayOrigin) this.h;
        LoggingParams loggingParams = (LoggingParams) this.f;
        trc0 trc0Var = (trc0) ((mmr0) obj).a;
        boolean zL = y7y0.L((Map) this.b);
        q410 q410Var = (q410) this.c;
        PreparePlayOptions preparePlayOptions = (PreparePlayOptions) this.d;
        Set set = q410.n;
        if (preparePlayOptions == null || (builder = preparePlayOptions.toBuilder()) == null) {
            builder = PreparePlayOptions.builder();
        }
        builder.playerOptionsOverride(q410.e(preparePlayOptions, zL, false));
        PreparePlayOptions preparePlayOptionsBuild = builder.build();
        Map map = (Map) this.e;
        if (map != null) {
            linkedHashMap = new LinkedHashMap(map);
        } else {
            linkedHashMap = new LinkedHashMap();
        }
        LinkedHashMap linkedHashMap2 = linkedHashMap;
        String string = (String) loggingParams.pageInstanceId().h();
        if (string == null) {
            string = UUID.randomUUID().toString();
        }
        coz cozVarR = EsLoggingParams.LoggingParams.r();
        String str = (String) loggingParams.interactionId().h();
        if (str != null) {
            cozVarR.n(str);
        }
        cozVarR.q(string);
        qpz qpzVarP = EsOptional.OptionalInt64.p();
        qpzVarP.n(q410Var.g.b());
        cozVarR.t(qpzVarP);
        return rqt0.F(q410Var.j, new yn0(q410Var, (String) this.g, trc0Var, lyg.A(preparePlayOptionsBuild), playOrigin, (PlayOptions) this.i, linkedHashMap2, cozVarR.build(), (lnm) null, (byte) 5)).map(cxo1.d1).onErrorResumeNext(new m410(q410Var, (String) this.g, (PreparePlayOptions) this.d, playOrigin, loggingParams, (Map) this.e));
    }
}
