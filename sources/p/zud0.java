package p;

import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.util.Size;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.car.app.navigation.model.Maneuver;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.aiplaylist.promptcreation.presentation.MessageInputView;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import com.spotify.encoremobile.component.textview.EncoreTextView;
import com.spotify.mainlayout.ui.view.MainLayout;
import com.spotify.mobius.functions.Producer;
import com.spotify.mobius.rx3.SchedulerWorkRunner;
import com.spotify.mostplayed.v1.Chart;
import com.spotify.mostplayed.v1.ChartEntry;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableEmitter;
import io.reactivex.rxjava3.core.ObservableOnSubscribe;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.completable.CompletableCreate;
import io.reactivex.rxjava3.internal.operators.completable.CompletableDefer;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromRunnable;
import io.reactivex.rxjava3.observables.GroupedObservable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import spotify.your_library.esperanto.proto.YourLibraryResponse;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class zud0 implements Function, ObservableOnSubscribe, qvq0, BiFunction, qiw, Producer, ry70, jrn0 {
    public final /* synthetic */ byte a;
    public final Object b;

    public zud0(ByteBuffer byteBuffer) {
        this.a = (byte) 14;
        this.b = byteBuffer;
        byteBuffer.order(ByteOrder.BIG_ENDIAN);
    }

    public static fm61 j(zx70 zx70Var) {
        if (zx70Var == null) {
            return null;
        }
        return new fm61(zx70Var, new Size(zx70Var.getWidth(), zx70Var.getHeight()), new k2d(new d18((Object) null, zx70Var.Q0().getTimestamp(), tod1.b)));
    }

    public void a() {
        mwg0 mwg0Var = (mwg0) this.b;
        View view = mwg0Var.N1;
        if (view == null) {
            u890.C("header");
            throw null;
        }
        view.animate().alpha(1.0f).setDuration(100L).start();
        View view2 = mwg0Var.O1;
        if (view2 != null) {
            view2.animate().alpha(1.0f).setDuration(100L).start();
        } else {
            u890.C("footer");
            throw null;
        }
    }

    public Object apply(Object obj) {
        byte b = this.a;
        o6x o6xVar = o6x.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                return new CompletableFromRunnable(new an90((d2d0) obj2, (byte) 7));
            case 1:
                return new w051("", ((hx41) obj2).b, new b951((List) obj, z6x.a));
            case 5:
                jef0 jef0Var = (jef0) obj;
                return ((lnf0) obj2).d(jef0Var.a, jef0Var.b, dhf0.d, jef0Var.c).map(zz10.Z).toObservable().onErrorReturn(a020.Z);
            case 9:
                PlayerState playerState = (PlayerState) obj;
                String strO = o4p1.o(playerState);
                if (strO.length() <= 0 || playerState.contextUri() == null) {
                    return CompletableEmpty.a;
                }
                g610 g610VarA = ((x610) ((s24) obj2).b).a();
                String strContextUri = playerState.contextUri();
                g610VarA.getClass();
                CompletableCreate completableCreateD = (strO.equals(strContextUri) || strContextUri.length() == 0) ? CompletableEmpty.a : j2h1.D(g610VarA.h, new l2w(g610VarA, strO, strContextUri, (lnm) null, (byte) 21));
                completableCreateD.getClass();
                return completableCreateD;
            case 17:
                sjj0 sjj0Var = (sjj0) ((hmm0) obj2).f;
                h290 h290VarN = ((Chart) obj).n();
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : h290VarN) {
                    ChartEntry chartEntry = (ChartEntry) obj3;
                    if (chartEntry.n().p() && chartEntry.n().o().hasAlbum()) {
                        arrayList.add(obj3);
                    }
                }
                ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((ChartEntry) it.next()).getUri());
                }
                return sjj0Var.a(arrayList2);
            case 18:
                Integer num = (Integer) obj;
                boolean zBooleanValue = ((Boolean) ((q2o0) ((p2o0) obj2).b).invoke()).booleanValue();
                if (zBooleanValue || num.intValue() != 0) {
                    return (zBooleanValue && num.intValue() == 1) ? p4o0.b : p4o0.c;
                }
                return p4o0.d;
            case 19:
                k5o0 k5o0Var = (l5o0) obj;
                s880 s880Var = (s880) obj2;
                if (k5o0Var instanceof k5o0) {
                    return new CompletableDefer(new xf0(s880Var, k5o0Var, (byte) 8));
                }
                if (k5o0Var instanceof j5o0) {
                    return j2h1.D(o6xVar, new ian0((j5o0) k5o0Var, s880Var, (lnm) null, (byte) 2));
                }
                eg.o();
                return null;
            case 21:
                return ((auo0) obj2).a;
            case 22:
                kzo0 kzo0Var = (kzo0) obj;
                qzo0 qzo0Var = (qzo0) obj2;
                return yoi1.h(h5p1.r(qzo0Var.f(qzo0Var.N0, kzo0Var.a), qzo0Var.f(qzo0Var.O0, kzo0Var.b), qzo0Var.f(qzo0Var.P0, kzo0Var.c), qzo0Var.f(qzo0Var.Q0, kzo0Var.d), new jaz(5, (lnm) null, (byte) 18)), o6xVar);
            case 25:
                bip0 bip0Var = (bip0) obj2;
                return ((GroupedObservable) obj).takeUntil(dj20.R0).throttleLatest(((jh4) bip0Var.c.get()).g(), TimeUnit.MILLISECONDS, bip0Var.b, true);
            case 26:
                if (((Boolean) obj).booleanValue()) {
                    gjp0 gjp0Var = (gjp0) obj2;
                    return Observable.combineLatest(gjp0Var.e.d(), ((Observable) gjp0Var.b.invoke()).switchMap(new e5l0(gjp0Var, (byte) 13)), gjp0Var.d.a, yb10.T0).doOnError(zzc0.R0);
                }
                Observable observableJust = Observable.just(msy0.a);
                observableJust.getClass();
                return observableJust;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return e821.f(((jtp0) obj2).b, (YourLibraryResponse) obj, true, false, false, false, 160);
            default:
                return new mmr0((nvp0) obj2, Boolean.valueOf(u890.j(((Map) obj).get("type"), "premium")));
        }
    }

    public void b() {
        mwg0 mwg0Var = (mwg0) this.b;
        View view = mwg0Var.N1;
        if (view == null) {
            u890.C("header");
            throw null;
        }
        view.animate().alpha(0.0f).setDuration(100L).start();
        View view2 = mwg0Var.O1;
        if (view2 != null) {
            view2.animate().alpha(0.0f).setDuration(100L).start();
        } else {
            u890.C("footer");
            throw null;
        }
    }

    public zx70 c() {
        return j(((oi) this.b).c());
    }

    public void close() {
        ((oi) this.b).close();
    }

    public int d() {
        return ((oi) this.b).d();
    }

    public void e() {
        ((oi) this.b).e();
    }

    public void f(int[] iArr) {
        int i;
        mwg0 mwg0Var = (mwg0) this.b;
        ImageView imageView = mwg0Var.I1;
        if (imageView == null) {
            u890.C("coverImageView");
            throw null;
        }
        int left = imageView.getLeft();
        ImageView imageView2 = mwg0Var.I1;
        if (imageView2 == null) {
            u890.C("coverImageView");
            throw null;
        }
        int top = imageView2.getTop();
        ImageView imageView3 = mwg0Var.I1;
        if (imageView3 == null) {
            u890.C("coverImageView");
            throw null;
        }
        int width = imageView3.getWidth();
        ImageView imageView4 = mwg0Var.I1;
        if (imageView4 == null) {
            u890.C("coverImageView");
            throw null;
        }
        int height = imageView4.getHeight();
        int i2 = iArr[0];
        if (i2 < left || i2 > left + width || (i = iArr[1]) < top || i > top + height) {
            return;
        }
        ivg0 ivg0VarZ0 = mwg0Var.Z0();
        cyg0 cyg0Var = ivg0VarZ0.g;
        iug0 iug0Var = ivg0VarZ0.a;
        ivg0VarZ0.a(cyg0Var.c(1, iug0Var.X, iug0Var.a));
    }

    public void g(qy70 qy70Var, Executor executor) {
        ((oi) this.b).g(new x8a0((Object) this, (Object) qy70Var, (byte) 24), executor);
    }

    public Object get() {
        return new SchedulerWorkRunner(((n9m0) this.b).b);
    }

    public int getHeight() {
        return ((oi) this.b).getHeight();
    }

    public Surface getSurface() {
        return ((oi) this.b).getSurface();
    }

    public int getWidth() {
        return ((oi) this.b).getWidth();
    }

    public int h() {
        return ((oi) this.b).h();
    }

    public void i() {
        ((mwg0) this.b).Z0().b(true);
    }

    public int k(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        if (r()) {
            int left = view.getLeft();
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            return left - (marginLayoutParams != null ? marginLayoutParams.leftMargin : 0);
        }
        int right = view.getRight();
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        marginLayoutParams = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
        return right + (marginLayoutParams != null ? marginLayoutParams.rightMargin : 0);
    }

    public irn0 l(Intent intent, th61 th61Var) {
        b72 b72Var = (b72) this.b;
        ((e7p0) ((s6z0) b72Var.c).b).c();
        if (((mmo) b72Var.b).c() != null) {
            return crn0.a;
        }
        Uri uri = in60.d;
        return lfb.l(xw30.class, new zw30(th61Var.a, (String) null, (String) null), a6w0.a);
    }

    public zx70 m() {
        return j(((oi) this.b).m());
    }

    public View n(zyf0 zyf0Var) {
        MainLayout mainLayout = (MainLayout) this.b;
        int iOrdinal = zyf0Var.a.ordinal();
        if (iOrdinal == 0) {
            View nowPlayingViewRegionExpanded = mainLayout.getNowPlayingViewRegionExpanded();
            nowPlayingViewRegionExpanded.getClass();
            return nowPlayingViewRegionExpanded;
        }
        if (iOrdinal != 1) {
            eg.o();
            return null;
        }
        View nowPlayingViewRegionCollapsed = mainLayout.getNowPlayingViewRegionCollapsed();
        nowPlayingViewRegionCollapsed.getClass();
        return nowPlayingViewRegionCollapsed;
    }

    public long o() {
        return ((ByteBuffer) this.b).position();
    }

    public int p(View view) {
        return r() ? view.getRight() : view.getLeft();
    }

    public mr20 q(String str) {
        if (str == null || str.length() == 0) {
            return new huz(Boolean.FALSE, (byte) 10);
        }
        drj0 drj0Var = (drj0) this.b;
        return rqt0.u(new sii0(((ov20) drj0Var.b).a, drj0Var, (byte) 27));
    }

    public boolean r() {
        return ((MainLayout) this.b).getLayoutDirection() == 1;
    }

    public q41 s(a11 a11Var) {
        return new q41(new v31((xwe0) this.b, (l3f0) null, (Boolean) null, (w01) null, 30), (s31) null, a11Var);
    }

    public void subscribe(ObservableEmitter observableEmitter) {
        observableEmitter.setCancellable(new ci0((x7e0) this.b, (byte) 4));
        x7e0 x7e0Var = (x7e0) this.b;
        h5z h5zVar = new h5z(observableEmitter, (byte) 1);
        AtomicReference atomicReference = x7e0Var.b;
        w7e0 w7e0Var = w7e0.a;
        w7e0 w7e0Var2 = w7e0.b;
        while (!atomicReference.compareAndSet(w7e0Var, w7e0Var2)) {
            if (atomicReference.get() != w7e0Var) {
                eg.m("already started");
                return;
            }
        }
        x7e0Var.a = h5zVar;
        x7e0Var.e();
    }

    public g5l0 t(String str) {
        return new g5l0(str, (r6h1) this.b, (byte) 6);
    }

    public void u(int i) {
        oqh0 oqh0Var = (oqh0) this.b;
        ark1 ark1Var = oqh0Var.l;
        av7 av7Var = oqh0Var.r;
        if (av7Var != null) {
            av7Var.h(i);
            return;
        }
        int iC = l1d.C(i);
        if (iC == 0) {
            ark1.f(ark1Var, "media_session", (String) null, 6);
        } else if (iC == 1) {
            ark1.d(ark1Var, "media_session", (String) null, 6);
        } else {
            if (iC == 2) {
                return;
            }
            eg.o();
        }
    }

    public void v(Object obj) {
        qfc qfcVar;
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 12:
                ygk1 ygk1Var = (ygk1) obj;
                spk spkVar = (spk) obj2;
                lzn0 lzn0Var = (lzn0) spkVar.e;
                kt91 kt91Var = (kt91) spkVar.f;
                wmy wmyVar = (wmy) spkVar.g;
                if (ygk1Var.equals(gfk1.a)) {
                    ((EncoreButton) wmyVar.f).setEnabled(false);
                    ((ProgressBar) wmyVar.e).setVisibility(8);
                    spkVar.b();
                } else if (ygk1Var.equals(ogk1.a)) {
                    ((EncoreButton) wmyVar.f).setEnabled(true);
                    ((ProgressBar) wmyVar.e).setVisibility(8);
                    spkVar.b();
                } else if (ygk1Var.equals(sfk1.a)) {
                    EncoreButton encoreButton = (EncoreButton) wmyVar.f;
                    EncoreTextView encoreTextView = (EncoreTextView) wmyVar.c;
                    encoreButton.setEnabled(false);
                    ((ProgressBar) wmyVar.e).setVisibility(8);
                    encoreTextView.setVisibility(0);
                    EditText editText = (EditText) wmyVar.b;
                    editText.setTextColor(-65536);
                    Resources resources = ((ConstraintLayout) wmyVar.a).getResources();
                    ThreadLocal threadLocal = qx21.a;
                    editText.setBackground(resources.getDrawable(2131231314, null));
                    encoreTextView.performAccessibilityAction(64, null);
                } else if (ygk1Var.equals(qgk1.a)) {
                    ((EncoreButton) wmyVar.f).setEnabled(true);
                    ((ProgressBar) wmyVar.e).setVisibility(8);
                    spkVar.b();
                    kt91Var.k(new er91((fs91) null, ((ConstraintLayout) wmyVar.a).getResources().getString(2131958473), (Integer) null, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
                } else if (ygk1Var.equals(tgk1.a)) {
                    lzn0Var.e();
                    kt91Var.k(new er91((fs91) null, ((ConstraintLayout) wmyVar.a).getResources().getString(2131959626), (Integer) null, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
                } else if (ygk1Var.equals(ugk1.a)) {
                    spkVar.b();
                    ((EncoreButton) wmyVar.f).setEnabled(false);
                    ((ProgressBar) wmyVar.e).setVisibility(0);
                } else if (!ygk1Var.equals(efk1.a)) {
                    eg.o();
                } else {
                    lzn0Var.e();
                }
                break;
            case 13:
                int i = MessageInputView.X0;
                w6e0 w6e0Var = ((MessageInputView) obj2).T0;
                int iOrdinal = ((uzi0) obj).ordinal();
                if (iOrdinal == 0) {
                    qfcVar = new qfc(false, false, false);
                } else if (iOrdinal == 1) {
                    qfcVar = new qfc(true, false, false);
                } else if (iOrdinal == 2) {
                    qfcVar = new qfc(false, false, true);
                } else if (iOrdinal != 3) {
                    eg.o();
                } else {
                    qfcVar = new qfc(false, true, false);
                }
                ((EncoreButton) w6e0Var.c).setVisibility(qfcVar.a ? 0 : 8);
                ((EncoreButton) w6e0Var.d).setVisibility(qfcVar.b ? 0 : 8);
                ((EncoreButton) w6e0Var.e).setVisibility(qfcVar.c ? 0 : 8);
                break;
            default:
                mmr0 mmr0Var = (mmr0) obj;
                String str = (String) mmr0Var.a;
                String str2 = (String) mmr0Var.b;
                dtw dtwVar = ((j2p0) obj2).R0;
                if (str2 == null) {
                    str2 = "";
                }
                dtwVar.f(new x27(str, str2));
                break;
        }
    }

    public int w() {
        return ((ByteBuffer) this.b).getInt();
    }

    public long x() {
        return ((long) ((ByteBuffer) this.b).getInt()) & 4294967295L;
    }

    public int y() {
        return ((ByteBuffer) this.b).getShort() & 65535;
    }

    public void z(int i) {
        ByteBuffer byteBuffer = (ByteBuffer) this.b;
        byteBuffer.position(byteBuffer.position() + i);
    }

    public zud0(k4e0 k4e0Var, hx41 hx41Var) {
        this.a = (byte) 1;
        this.b = hx41Var;
    }

    public /* synthetic */ zud0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public Object apply(Object obj, Object obj2) {
        kkv kkvVar = (mkv) obj;
        r0i0 r0i0Var = (r0i0) obj2;
        boolean zC = kkvVar.c();
        h1i0 h1i0Var = (h1i0) this.b;
        if (zC) {
            String string = h1i0Var.e.getString(kkvVar.a(), Integer.valueOf(kkvVar.b()));
            if (kkvVar == kkv.i) {
                return r0i0.a(r0i0Var, string, 16335);
            }
            return r0i0.a(r0i0Var, string, 16351);
        }
        Resources resources = h1i0Var.e;
        if (kkvVar != kkv.d && kkvVar != kkv.c) {
            if (kkvVar == kkv.e) {
                return h1i0Var.c.E();
            }
            return new r0i0(5, 0L, 0.0f, (Bundle) null, mgz.a, resources.getString(kkvVar.a(), Integer.valueOf(kkvVar.b())), 0, (y0i0) null, (w0i0) null, 0L, (j2i0) null, (ArrayList) null, (sp91) null, false, 16334);
        }
        return new r0i0(5, 0L, 0.0f, (Bundle) null, mgz.e, resources.getString(kkvVar.a(), Integer.valueOf(kkvVar.b())), 0, (y0i0) null, (w0i0) null, 0L, (j2i0) null, (ArrayList) null, (sp91) null, false, 16334);
    }
}
