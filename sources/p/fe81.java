package p;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Bundle;
import com.spotify.encoreconsumermobile.elements.smartshufflebutton.SmartShuffleButtonView;
import com.spotify.messaging.messagingplatformimpl.slate.SlateMessageHostActivity;
import com.spotify.scrollsita.v1.Section;
import com.spotify.signup.signup.v2.proto.ClientInfo;
import io.reactivex.rxjava3.core.Observable;
import java.io.File;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class fe81 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fe81(c2r0 c2r0Var, ph81 ph81Var) {
        super(0);
        this.a = (byte) 2;
        this.b = c2r0Var;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                r961 r961Var = (r961) ((zhc0) this.b).b;
                return new zd81(new sfx(((xfx) r961Var.b).e, (byte) 2), (qr20) r961Var.c, (Context) r961Var.d);
            case 1:
                return hap1.w((lg81) this.b);
            case 2:
                c2r0 c2r0Var = (c2r0) this.b;
                AtomicReferenceArray atomicReferenceArray = p6r0.e;
                return c2r0Var.d(yon1.G1("SIDEDRAWER", "sidedrawer", 1881, "sidedrawer"), new lik1("spotify:activitycenter").a());
            case 3:
                ((kg0) this.b).a(true);
                return rih1.a;
            case 4:
                return ((br81) this.b).c(kn81.a);
            case 5:
                ((fq81) this.b).Y0().F();
                return rih1.a;
            case 6:
                yig yigVarO = ClientInfo.o();
                yigVarO.q(kn81.a);
                hr81 hr81Var = (hr81) this.b;
                yigVarO.t(hr81Var.d.a.a());
                yigVarO.s(hr81Var.b);
                yigVarO.u();
                yigVarO.r(hr81Var.c);
                yigVarO.n(Collections.singletonList(wld.CAPABILITY_WEB_INTERACTION_V1));
                return (ClientInfo) yigVarO.build();
            case 7:
                k241 k241Var = ((jw81) this.b).g;
                if (k241Var.c != null) {
                    k241Var.c();
                    if (k241Var.c != null) {
                        eg.m("Loader is already running.");
                        return null;
                    }
                    k241Var.c = k241Var.a.subscribe(new fv5(k241Var, (byte) 17));
                }
                return rih1.a;
            case 8:
                return (k241) ((r961) this.b).b;
            case 9:
                return (Bundle) this.b;
            case 10:
                File file = (File) ((h191) this.b).a.invoke();
                String absolutePath = file.getAbsolutePath();
                synchronized (h191.k) {
                    LinkedHashSet linkedHashSet = h191.j;
                    if (linkedHashSet.contains(absolutePath)) {
                        throw new IllegalStateException(("There are multiple DataStores active for the same file: " + file + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                    }
                    linkedHashSet.add(absolutePath);
                }
                return file;
            case 11:
                c591 c591Var = (c591) this.b;
                return c591Var.a.a(c591Var.e, false, false, c591Var.c);
            case 12:
                return Boolean.valueOf(((u791) this.b).f);
            case 13:
                ynb0 ynb0Var = ((SlateMessageHostActivity) this.b).b1;
                if (ynb0Var != null) {
                    return (u891) ynb0Var.get();
                }
                u890.C("daggerDependencies");
                throw null;
            case 14:
                ((ze21) this.b).d.invoke(o991.a);
                return rih1.a;
            case 15:
                xa91 xa91Var = (xa91) this.b;
                luk lukVar = xa91Var.b;
                if (lukVar != null) {
                    return lukVar.e(new e4n0(xa91Var, (byte) 17));
                }
                return null;
            case 16:
                ya91 ya91Var = (ya91) this.b;
                luk lukVar2 = ya91Var.c;
                if (lukVar2 != null) {
                    return lukVar2.e(new e4n0(ya91Var, (byte) 18));
                }
                return null;
            case 17:
                SmartShuffleButtonView smartShuffleButtonView = (SmartShuffleButtonView) this.b;
                ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(SmartShuffleButtonView.a(smartShuffleButtonView), "level", 0, 10000);
                objectAnimatorOfInt.setDuration(3500L);
                objectAnimatorOfInt.setRepeatCount(-1);
                objectAnimatorOfInt.addUpdateListener(new kb5(smartShuffleButtonView, (byte) 17));
                return objectAnimatorOfInt;
            case 18:
                il91 il91Var = (il91) this.b;
                jo91 jo91Var = il91Var.a;
                kly0 kly0Var = jo91Var.a;
                ndy0 ndy0Var = new ndy0(((t35) kly0Var.get()).z(), 3, ((t35) kly0Var.get()).x(), ((t35) kly0Var.get()).y(), ((t35) kly0Var.get()).j(), ((t35) kly0Var.get()).q(), jo91Var.b(), ((t35) kly0Var.get()).D(), ((t35) kly0Var.get()).b(), ((t35) kly0Var.get()).e(), ((t35) kly0Var.get()).d(), ((t35) kly0Var.get()).f(), ((t35) kly0Var.get()).a(), ((t35) kly0Var.get()).l(), ((t35) kly0Var.get()).k());
                b7x b7xVar = b7x.a;
                return Observable.defer(new gl91(il91Var, new AtomicReference(new kl91(ndy0Var, new jdu0(), b7xVar, b7xVar, b7xVar, new y0a1((Boolean) null, (Boolean) null), (Boolean) null, (Boolean) null, true, false, 0, z6x.a, b7xVar, b7xVar, w7x.a, 0, 0, b7xVar, false)))).serialize().replay(1).f();
            case 19:
                return new kpg0(((ym91) this.b).b, fe91.X);
            case 20:
                vqq vqqVar = ((un91) this.b).e2;
                if (vqqVar == null) {
                    u890.C("smartShufflePlayModePickerLoggerFactory");
                    throw null;
                }
                i8h1 i8h1Var = (i8h1) ((sn91) ((k2q) vqqVar.a.b).b).c.get();
                c8o.l(i8h1Var);
                return new vn91(i8h1Var);
            case 21:
                ip91 ip91Var = (ip91) this.b;
                p811 p811Var = new p811();
                p811Var.a = z6x.a;
                return Observable.defer(new xf0(p811Var, ip91Var, (byte) 14)).doOnNext(new wrk(p811Var, (byte) 8)).replay(1).f();
            case 22:
                hus0 hus0Var = ((qq91) this.b).J1;
                if (hus0Var != null) {
                    return hus0Var;
                }
                u890.C("viewModelFactory");
                throw null;
            case 23:
                ((kt91) this.b).h.l((Object) null);
                return rih1.a;
            case 24:
                ((ev91) this.b).K1(true);
                return rih1.a;
            case 25:
                yt91 yt91Var = (yt91) this.b;
                pw40 pw40Var = (pw40) yt91Var.d;
                if (pw40Var != null) {
                    pw40Var.a();
                }
                yt91Var.d = null;
                return rih1.a;
            case 26:
                ka3 ka3Var = (ka3) this.b;
                drq drqVar = (drq) ka3Var.d;
                drqVar.getClass();
                Context context = (Context) ((izp) ((a1q) drqVar.a.b).b).b.x1.a;
                c8o.l(context);
                return new kpg0(new iaa1(context), new qd81((Object) ka3Var, (byte) 6));
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                return new xv81((boe) this.b);
            case 28:
                return new xzq(new jd6(((gl90) ((k2q) ((erq) this.b).a.b).b).b, (byte) 19), p9a1.b1);
            default:
                ((vba1) this.b).a.invoke(null);
                return rih1.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fe81(Object obj, byte b) {
        super(0);
        this.a = b;
        this.b = obj;
    }
}
