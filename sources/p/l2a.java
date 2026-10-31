package p;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Parcelable;
import android.util.TypedValue;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.car.app.k;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.spotify.base.java.logging.Logger;
import com.spotify.campfire.datasource.impl.proto.HierarchyMessageChangedNotification;
import com.spotify.checkout.proto.model.v1.proto.SubmitCheckoutRequest;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import com.spotify.profile.editprofile.imageutils.CroppingImageView;
import com.spotify.profile.editprofile.pictureselection.PictureSelectionActivity;
import com.spotify.smartshuffle.signals.SendSignalFailedException;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import io.reactivex.rxjava3.subjects.PublishSubject;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class l2a implements Function, ya, hu00, k2i1, qiw, ird1, q06 {
    public final /* synthetic */ byte a;
    public final Object b;

    public l2a(byte b) {
        this.a = b;
        switch (b) {
            case 20:
                this.b = new txk0((byte) 2);
                break;
            default:
                this.b = xdn0.d();
                break;
        }
    }

    public static l2a l(qsk qskVar) {
        l2a l2aVar = new l2a((byte) 10);
        qskVar.f(new uk4(l2aVar, qskVar, (byte) 5));
        return l2aVar;
    }

    public void a(String str, w4i1 w4i1Var, c380 c380Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(454150137);
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.g(w4i1Var) ? 32 : 16) | (x340Var.g(c380Var) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            qim0 qim0VarF = u291.f(nim0.a, 1.0f);
            kiv kivVar = xce0.a;
            qim0 qim0VarI = zr7.i(qim0VarF, gce0.c);
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = rmf.P0;
                x340Var.s0(objT);
            }
            qim0 qim0VarA = ws41.a(qim0VarI, grn1.x((iu30) objT, x340Var, 6), qqq0.a, (n201) null, true, false, (idn0) null, 128);
            uwr uwrVar = cbx.a;
            qim0 qim0VarF2 = dug.f(qim0VarA, ((yex) zex.a.d).c, d4o1.a);
            mta mtaVar = cbx.b(x340Var).d;
            qim0 qim0VarZ = uyn1.z(56.0f, 0.0f, 2, qim0VarF2);
            mta mtaVar2 = cbx.b(x340Var).d;
            qim0 qim0VarJ = u291.j(56.0f, 0.0f, 2, qim0VarZ);
            gfh0 gfh0VarC = t1c.c(een.h, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarJ);
            hzj.A.getClass();
            if (x340Var.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(hmb0.t1);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            Parcelable.Creator creator = w4i1.CREATOR;
            wwo1.b(str, w4i1Var, c380Var, false, false, (vu30) null, (Function0) null, (Function0) null, (qim0) null, x340Var, (i2 & 14) | 14380032 | (i2 & 112) | (i2 & 896), 256);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new hwd(i, this, str, w4i1Var, c380Var, (byte) 12);
        }
    }

    public boolean accept(Object obj) {
        return ((ksk) obj).c == le30.g && ((bo4) this.b).b();
    }

    public Object apply(Object obj) {
        ContextTrack contextTrack;
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                spq0 spq0Var = (spq0) obj;
                return spq0Var.c() ? spq0.a((l1a) ((m2a) obj2).b.a((String) spq0Var.b(), l1a.Companion.serializer())) : j5.a;
            case 2:
                return new zu20(((vjb0) obj2).c, (j331) obj);
            case 6:
                PlayerState playerState = (PlayerState) obj;
                dmc dmcVar = (dmc) obj2;
                String str = playerState.playbackId().c() ? (String) playerState.playbackId().b() : null;
                ContextTrack contextTrack2 = playerState.playbackId().c() ? (ContextTrack) playerState.track().b() : null;
                String strContextUri = playerState.contextUri();
                String strDeviceIdentifier = playerState.playOrigin().deviceIdentifier();
                boolean zIsPaused = playerState.isPaused();
                udu0 udu0Var = new udu0(str, contextTrack2, strContextUri, strDeviceIdentifier, zIsPaused);
                udu0 udu0Var2 = dmcVar.e;
                if (udu0Var2 == null || (((contextTrack = udu0Var2.b) != null || contextTrack2 != null) && (contextTrack == null || contextTrack2 == null || !contextTrack.uri().equals(contextTrack2.uri())))) {
                    if (!dmcVar.b.a() || str == null || contextTrack2 == null || l4o1.E(contextTrack2) || zIsPaused) {
                        return ylc.a;
                    }
                    dmcVar.e = udu0Var;
                    String strUri = contextTrack2.uri();
                    if (strUri != null) {
                        return new zlc(strUri);
                    }
                }
                return amc.a;
            case 8:
                l5d l5dVar = ((h5d) obj2).f;
                return l5dVar.b.flatMapCompletable(new lo9(l5dVar, (byte) 10)).d(Observable.just(rih1.a));
            case 9:
                Object obj3 = ((cab) obj2).d;
                return new rvm(((HierarchyMessageChangedNotification) obj).getHierarchyId());
            case 11:
                return ((yvd) obj2).d.c((hi90) obj);
            case 13:
                s6g s6gVar = (s6g) obj2;
                t6g t6gVar = s6gVar.b;
                amc1 amc1VarN = SubmitCheckoutRequest.n();
                amc1VarN.n(s6gVar.c.b);
                amc1VarN.r(bmc1.b);
                return t6gVar.a(amc1VarN.build()).compose(new dn81((byte) 2)).map(rbc.Q0).onErrorReturn(uwg.S0);
            case 15:
                t8r0 t8r0Var = ((z0h) obj2).c;
                return j2h1.D((q8n) t8r0Var.b, new xht0(t8r0Var, ((t0h) obj).a.a, (lnm) null, (byte) 2));
            case 17:
                tjh tjhVar = ((hfh) obj2).a;
                return tjhVar.h.flatMap(new cfd(tjhVar, ((lfh) obj).a, (byte) 22)).subscribeOn(tjhVar.a).map(bya0.Q0).onErrorReturn(stf0.U0);
            case 22:
                Throwable th = (Throwable) obj;
                yon yonVar = (yon) obj2;
                PublishSubject publishSubject = (PublishSubject) yonVar.e;
                String message = th.getMessage();
                if (message == null) {
                    message = "Error creating playlist";
                }
                publishSubject.onNext(message);
                return ((km3) yonVar.c).z(jvx0.a).e(Single.error(th));
            default:
                return ((Throwable) obj) instanceof SendSignalFailedException ? kp5.A(((cfr) ((wj3) obj2).t).b, ms91.a) : CompletableEmpty.a;
        }
    }

    public void b(Uri uri) {
        ((fyf) this.b).g();
    }

    public kl1 c() {
        qwc0 qwc0Var = (qwc0) this.b;
        dg30 dg30Var = qwc0Var.s;
        c8o.l(dg30Var);
        oj3 oj3Var = qwc0Var.N;
        c8o.l(oj3Var);
        me30 me30Var = qwc0Var.W;
        c8o.l(me30Var);
        drp0 drp0Var = qwc0Var.K0;
        c8o.l(drp0Var);
        return new kl1(dg30Var, oj3Var, me30Var, drp0Var, qwc0Var.c, qwc0Var.m1);
    }

    public uq8 d() {
        return new uq8(eqq0.b((xdn0) this.b), (byte) 9);
    }

    public xdn0 e() {
        throw null;
    }

    public Uri f(hvc hvcVar) {
        if (hvcVar instanceof bvc) {
            return new Uri.Builder().scheme("content").authority(m()).appendPath("avatar").appendQueryParameter("name", ((bvc) hvcVar).a).build();
        }
        if (hvcVar instanceof dvc) {
            Uri.Builder builderAppendPath = new Uri.Builder().scheme("content").authority(m()).appendPath("placeholder");
            String str = ((dvc) hvcVar).a;
            if (str != null) {
                builderAppendPath.appendQueryParameter("uri", str);
            }
            return builderAppendPath.appendQueryParameter("darkMode", String.valueOf((((k) ((ynb0) this.b).get()).getResources().getConfiguration().uiMode & 48) == 32)).build();
        }
        if (hvcVar instanceof evc) {
            evc evcVar = (evc) hvcVar;
            return new Uri.Builder().scheme("content").authority(m()).appendPath("qrcode").appendQueryParameter("content", evcVar.a).appendQueryParameter("size", String.valueOf(evcVar.b)).build();
        }
        if (hvcVar instanceof avc) {
            avc avcVar = (avc) hvcVar;
            Uri.Builder builderAppendQueryParameter = new Uri.Builder().scheme("content").authority(m()).appendPath("encircled").appendQueryParameter("iconRes", String.valueOf(avcVar.a));
            Integer num = avcVar.b;
            if (num != null) {
                builderAppendQueryParameter.appendQueryParameter("iconColor", String.format("%08X", Arrays.copyOf(new Object[]{Integer.valueOf(num.intValue())}, 1)));
            }
            return builderAppendQueryParameter.appendQueryParameter("iconSize", String.valueOf(avcVar.c)).appendQueryParameter("circleSize", String.valueOf(avcVar.d)).appendQueryParameter("circleColor", String.format("%08X", Arrays.copyOf(new Object[]{Integer.valueOf(avcVar.e)}, 1))).build();
        }
        if (hvcVar instanceof cvc) {
            cvc cvcVar = (cvc) hvcVar;
            Uri.Builder builderAppendQueryParameter2 = new Uri.Builder().scheme("content").authority(m()).appendPath("gradient_v3").appendQueryParameter("imageLink", cvcVar.a).appendQueryParameter("backgroundHexColor", cvcVar.b);
            String str2 = cvcVar.c;
            if (str2 != null) {
                builderAppendQueryParameter2.appendQueryParameter("entityUri", str2);
            }
            return builderAppendQueryParameter2.build();
        }
        if (hvcVar instanceof fvc) {
            hhg1.n("ResourceImage uses direct resource icons, not content URIs");
            return null;
        }
        if (hvcVar instanceof gvc) {
            hhg1.n("UriImage should use MediaUriUtil.toLocalContentUri() instead");
            return null;
        }
        eg.o();
        return null;
    }

    public jhm g(String str) {
        return new jhm("bluejay_edit_prompt", ulx.c, (fhm) null, 2131952840, (String) null, false, (tm81) null, new ihm(new ygm(1), new ghm(c7b.d, c7b.e), new kd8(this, str, (byte) 23)), 244);
    }

    public sun i() {
        qwc0 qwc0Var = (qwc0) this.b;
        ov20 ov20Var = qwc0Var.n;
        c8o.l(ov20Var);
        npm1 npm1Var = qwc0Var.r;
        c8o.l(npm1Var);
        b1y b1yVar = qwc0Var.C;
        c8o.l(b1yVar);
        return new sun(new ip31(ov20Var, npm1Var, b1yVar, qwc0Var.N0, qwc0Var.O0, qwc0Var.P0, qwc0Var.e1, qwc0Var.Q0, (byte) 23), (byte) 2);
    }

    public rjn j() {
        qwc0 qwc0Var = (qwc0) this.b;
        f3b f3bVar = qwc0Var.Y;
        kl1 kl1Var = qwc0Var.b0;
        agc0 agc0Var = qwc0Var.S;
        c8o.l(agc0Var);
        uu00 uu00Var = qwc0Var.H;
        c8o.l(uu00Var);
        xrm1 xrm1Var = qwc0Var.a0;
        c8o.l(xrm1Var);
        upp0 upp0Var = qwc0Var.e0;
        c8o.l(upp0Var);
        tzr0 tzr0Var = new tzr0(agc0Var, uu00Var, xrm1Var, upp0Var, (byte) 12);
        vwm1 vwm1Var = qwc0Var.X0;
        c8o.l(vwm1Var);
        return new rjn((Object) new sp00(f3bVar, kl1Var, tzr0Var, vwm1Var, (byte) 11), (byte) 4);
    }

    public Object k(bs41 bs41Var, Float f, Float f2, iu30 iu30Var, qu91 qu91Var) {
        Object objK = jch0.k(bs41Var, f.floatValue(), prn1.a(28, 0.0f, f2.floatValue()), (e9r) this.b, iu30Var, qu91Var);
        return objK == d9n.a ? objK : (be5) objK;
    }

    public String m() {
        return f4i1.e(((k) ((ynb0) this.b).get()).getPackageName(), ".calimage");
    }

    public void o(Exception exc) {
        if (exc instanceof CancellationException) {
            return;
        }
        Logger.d("Edit profile preview image failed to load", new Object[0]);
    }

    public void onSuccess() {
        CroppingImageView croppingImageView = (CroppingImageView) this.b;
        int i = CroppingImageView.d1;
        croppingImageView.c();
        ewn0 ewn0Var = croppingImageView.c1;
        if (ewn0Var != null) {
            PictureSelectionActivity pictureSelectionActivity = (PictureSelectionActivity) ewn0Var.b;
            int i2 = PictureSelectionActivity.y1;
            pictureSelectionActivity.s0(true);
        }
    }

    public void v(Object obj) {
        int iIntValue;
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 23:
                Integer num = (Integer) obj;
                avn avnVar = (avn) obj2;
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    TypedValue typedValue = new TypedValue();
                    avnVar.a1.getContext().getTheme().resolveAttribute(2130968768, typedValue, true);
                    iIntValue = typedValue.data;
                }
                PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(iIntValue, PorterDuff.Mode.DST_OVER);
                Drawable background = avnVar.V0.findViewById(2131428365).getBackground();
                if (background != null) {
                    background.setColorFilter(porterDuffColorFilter);
                }
                Drawable background2 = ((Toolbar) avnVar.U0.X).getBackground();
                if (background2 != null) {
                    background2.setColorFilter(porterDuffColorFilter);
                }
                break;
            default:
                Set set = (Set) obj;
                set.getClass();
                ((nlo) obj2).a(set);
                break;
        }
    }

    public l2a(RelativeLayout relativeLayout, TextView textView) {
        this.a = (byte) 21;
        this.b = textView;
    }

    public l2a(h47 h47Var) {
        this.a = (byte) 16;
        this.b = h47Var;
        ((f8h) h47Var).a = this;
    }

    public l2a(ComposeView composeView, ConstraintLayout constraintLayout, CoordinatorLayout coordinatorLayout) {
        this.a = (byte) 19;
        this.b = constraintLayout;
    }

    public /* synthetic */ l2a(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }
}
