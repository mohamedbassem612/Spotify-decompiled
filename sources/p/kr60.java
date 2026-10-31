package p;

import android.net.Uri;
import android.view.textclassifier.TextClassifier;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.Toolbar;
import com.comscore.streaming.WindowState;
import com.spotify.authentication.login5esperanto.EsCodeRequired;
import com.spotify.base.java.logging.Logger;
import com.spotify.player.model.ContextTrack;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleEmitter;
import io.reactivex.rxjava3.core.SingleOnSubscribe;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.functions.Functions;
import java.nio.ByteBuffer;
import java.nio.ShortBuffer;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public class kr60 implements Function, ksi0, BiFunction, SingleOnSubscribe, cl5, o59, ya {
    public final /* synthetic */ byte a;
    public final Object b;

    public kr60(dma1 dma1Var) {
        this.a = (byte) 20;
        this.b = d5p1.h(gio1.b(Boolean.valueOf(dma1Var.h(bma1.b.n("debug_test_apple_tv_enabled"), false))));
    }

    public boolean accept(Object obj) {
        return ((ksk) obj).c == le30.g && ((e3b) this.b).a.a();
    }

    /* JADX WARN: Code duplicated, block: B:103:0x00b2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:36:0x00be  */
    public Object apply(Object obj) {
        int iIntValue;
        v231 v231Var;
        Iterator it;
        byte b = this.a;
        boolean z = false;
        Object obj2 = this.b;
        switch (b) {
            case 1:
                cma1 cma1Var = (cma1) obj;
                eyh0 eyh0Var = (eyh0) obj2;
                List list = (List) eyh0Var.d;
                int iC = l1d.C(cma1Var.b);
                if (iC == 0) {
                    Object obj3 = cma1Var.a;
                    if (obj3 == null) {
                        eg.m("Required value was null.");
                        return null;
                    }
                    iIntValue = ((Number) obj3).intValue();
                } else {
                    if (iC != 1 && iC != 2) {
                        eg.o();
                        return null;
                    }
                    iIntValue = 0;
                }
                if (iIntValue < list.size()) {
                    return Boolean.valueOf(((Number) list.get(iIntValue)).longValue() + ((dma1) eyh0Var.b).g(pm.a, 0L) < ((yqg) eyh0Var.c).b());
                }
                return Boolean.FALSE;
            case 5:
                return new d1f0(((u11) obj2).j.n, new m231((Throwable) obj));
            case 7:
                dqx0 dqx0Var = (dqx0) obj;
                tj1 tj1Var = (tj1) obj2;
                mzr0 mzr0Var = tj1Var.b;
                String str = dqx0Var.a;
                Completable completableFlatMapCompletable = rqt0.F(o6x.a, new pew0(mzr0Var, str, false, (lnm) null, (byte) 18)).doOnError(xfs0.d1).map(new xrh(str, (byte) 4)).onErrorResumeNext(new bv40(tj1Var, (byte) 6)).flatMapCompletable(new gid(tj1Var, dqx0Var, (byte) 16));
                completableFlatMapCompletable.getClass();
                return completableFlatMapCompletable.o(Functions.h).w();
            case 9:
                Uri uri = Uri.parse(((s42) obj).a);
                g341 g341Var = (g341) ((u961) obj2).b;
                uri.getClass();
                return g341Var.b(uri).onErrorReturnItem(uri).map(stf0.h);
            case 14:
                return Single.create(new x6o0(obj2, (byte) 17));
            case 16:
                spq0 spq0Var = (spq0) obj;
                String str2 = (String) ((ContextTrack) spq0Var.b()).metadata().get("save_track.uri");
                if (str2 != null) {
                    eu4 eu4Var = ((ys4) obj2).m;
                    if (eu4Var.m() || eu4Var.a()) {
                        return str2;
                    }
                }
                return ((ContextTrack) spq0Var.b()).uri();
            case 18:
                return Single.create(new x6o0(obj2, (byte) 21));
            case 22:
                ByteBuffer byteBuffer = (ByteBuffer) obj;
                ShortBuffer shortBufferAsShortBuffer = byteBuffer.slice().order(byteBuffer.order()).asShortBuffer();
                int iRemaining = shortBufferAsShortBuffer.remaining();
                if (iRemaining == 0) {
                    return Float.valueOf(0.0f);
                }
                float f = 0.0f;
                while (shortBufferAsShortBuffer.hasRemaining()) {
                    short s = shortBufferAsShortBuffer.get();
                    f += s * s;
                }
                float fSqrt = ((float) Math.sqrt(f / iRemaining)) / 32767.0f;
                return Float.valueOf(((g38) obj2).f.get() != null ? yoi1.o(1.0f - ((float) Math.exp((fSqrt / 0.02f) * (-4.0f))), 0.0f, 1.0f) : Math.min(1.0f, fSqrt * 16.0f));
            case 23:
                f7h f7hVar = (f7h) ((Map) obj).get(((vb8) obj2).a);
                return new y810(f7hVar != null ? f7hVar.c : false);
            case 24:
                ((Function0) obj2).invoke();
                EsCodeRequired.CodeRequiredResendError codeRequiredResendErrorN = ((EsCodeRequired.CodeRequiredResendResult) obj).n();
                Integer numValueOf = Integer.valueOf(WindowState.NORMAL);
                return xf8.b[codeRequiredResendErrorN.o().ordinal()] == 1 ? new iww(new ug8(numValueOf, "Esperanto failure: unknown context")) : new iww(new ug8(numValueOf, "Esperanto failure: incomplete response"));
            case 25:
                Logger.d("Error when authorizing client %s %s", new Object[]{((wq8) obj2).a, (Throwable) obj});
                return new dr8(nhz.Y, "Error when authorizing", (String) null);
            default:
                esa esaVar = (esa) obj2;
                dma1 dma1Var = esaVar.h;
                s141 s141Var = esaVar.a;
                usa.a.getClass();
                if (dma1Var.h(tsa.b, false)) {
                    return new u2d1(new v231(new t2d1(2, false)));
                }
                if (esaVar.j.a.e() && esaVar.i) {
                    return new u2d1(new v231(new t2d1(3, false)));
                }
                List listM = p7h.M(new j331[]{s141Var.b(1), s141Var.b(2), s141Var.b(3)});
                boolean z2 = listM instanceof Collection;
                if (z2 && listM.isEmpty()) {
                    if (z2) {
                        it = listM.iterator();
                        do {
                            if (!it.hasNext()) {
                                z = true;
                            }
                        } while (((Boolean) ((j331) it.next()).a).booleanValue());
                    } else {
                        it = listM.iterator();
                        do {
                            if (!it.hasNext()) {
                                z = true;
                            }
                        } while (((Boolean) ((j331) it.next()).a).booleanValue());
                    }
                    v231Var = new v231(new t2d1(1, z));
                } else {
                    Iterator it2 = listM.iterator();
                    while (it2.hasNext()) {
                        if (!(((j331) it2.next()) instanceof v231)) {
                            for (Object obj4 : listM) {
                                if (!(((j331) obj4) instanceof v231)) {
                                    v231Var = (i231) obj4;
                                }
                            }
                            bhn0.t("Collection contains no element matching the predicate.");
                            return null;
                        }
                    }
                    if (z2 || !listM.isEmpty()) {
                        it = listM.iterator();
                        do {
                            if (!it.hasNext()) {
                                z = true;
                            }
                        } while (((Boolean) ((j331) it.next()).a).booleanValue());
                    } else {
                        z = true;
                    }
                    v231Var = new v231(new t2d1(1, z));
                }
                return new u2d1(v231Var);
        }
    }

    public boolean d(msi0 msi0Var, ysi0 ysi0Var) {
        boolean zOnMenuItemSelected;
        zb91 zb91Var = ((ActionMenuView) this.b).d1;
        if (zb91Var != null) {
            Toolbar toolbar = (Toolbar) zb91Var.b;
            if (toolbar.j1.A(ysi0Var)) {
                zOnMenuItemSelected = true;
            } else {
                ezb1 ezb1Var = toolbar.l1;
                zOnMenuItemSelected = ezb1Var != null ? ((a2f1) ezb1Var.b).d.onMenuItemSelected(0, ysi0Var) : false;
            }
            if (zOnMenuItemSelected) {
                return true;
            }
        }
        return false;
    }

    public jhm e(lik1 lik1Var, String str, String str2, boolean z) {
        return new jhm("add_to_playlist", irx.c, (fhm) null, 2131954319, (String) null, z, (tm81) null, new ihm(new ygm(1), new ghm(im1.W0, im1.X0), new db(this, str, lik1Var, str2, (byte) 6)), 180);
    }

    public int f() {
        return AppCompatTextView.g((AppCompatTextView) this.b);
    }

    public int g() {
        return AppCompatTextView.i((AppCompatTextView) this.b);
    }

    public void h(msi0 msi0Var) {
        ksi0 ksi0Var = ((ActionMenuView) this.b).Y0;
        if (ksi0Var != null) {
            ksi0Var.h(msi0Var);
        }
    }

    public int i() {
        return AppCompatTextView.m((AppCompatTextView) this.b);
    }

    public int[] j() {
        return AppCompatTextView.o((AppCompatTextView) this.b);
    }

    public int k() {
        return AppCompatTextView.p((AppCompatTextView) this.b);
    }

    public TextClassifier l() {
        return AppCompatTextView.r((AppCompatTextView) this.b);
    }

    public void m(int i, int i2, int i3, int i4) {
        AppCompatTextView.s((AppCompatTextView) this.b, i, i2, i3, i4);
    }

    public void n(int[] iArr, int i) {
        AppCompatTextView.t((AppCompatTextView) this.b, iArr, i);
    }

    public void o(int i) {
        AppCompatTextView.u((AppCompatTextView) this.b, i);
    }

    public void p(TextClassifier textClassifier) {
        AppCompatTextView.v((AppCompatTextView) this.b, textClassifier);
    }

    public void subscribe(SingleEmitter singleEmitter) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 15:
                ek4 ek4Var = (ek4) obj;
                luk lukVar = ek4Var.i;
                if (lukVar == null || !lukVar.i("android-gen-alpha-blocking.is_audiobook_allowlisting_management_enabled")) {
                    lukVar = ek4Var.j;
                }
                if (lukVar != null) {
                    lukVar.e(new dk4(singleEmitter, ek4Var, (byte) 1));
                }
                break;
            case 16:
            default:
                m26 m26Var = (m26) obj;
                luk lukVar2 = m26Var.r;
                if (lukVar2 == null || !lukVar2.i("apps-music-libs-eventsender.rate_limiting_rule_1_time_unit_seconds")) {
                    lukVar2 = m26Var.s;
                }
                if (lukVar2 != null) {
                    lukVar2.e(new k26(singleEmitter, m26Var, (byte) 8));
                }
                break;
            case 17:
                at4 at4Var = (at4) obj;
                luk lukVar3 = at4Var.k;
                if (lukVar3 == null || !lukVar3.i("android-media-session.restrict_playing_state_when_connect_car_is_active")) {
                    lukVar3 = at4Var.l;
                }
                if (lukVar3 != null) {
                    lukVar3.e(new p54(singleEmitter, at4Var, (byte) 7));
                }
                break;
        }
    }

    public void a(int i) {
    }

    public void c(int i) {
    }

    public kr60(Function0 function0, fg8 fg8Var) {
        this.a = (byte) 24;
        this.b = function0;
    }

    public /* synthetic */ kr60(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public kr60() {
        this.a = (byte) 27;
        this.b = new CopyOnWriteArrayList();
    }

    public void b(int i, float f) {
    }

    public /* synthetic */ Object apply(Object obj, Object obj2) {
        return ((vx1) this.b).invoke(obj, obj2);
    }
}
