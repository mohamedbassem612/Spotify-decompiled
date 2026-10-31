package p;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.view.KeyEvent;
import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Consumer;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Locale;
import retrofit2.adapter.rxjava3.HttpException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class hyh0 extends xxh0 {
    public final eyh0 f;
    public final nxh0 g;
    public final gtv0 h;
    public final qyh0 i;
    public final yqg j;
    public final vku k = new vku();
    public khs0 l;

    public hyh0(eyh0 eyh0Var, nxh0 nxh0Var, gtv0 gtv0Var, qyh0 qyh0Var, yqg yqgVar) {
        this.f = eyh0Var;
        this.g = nxh0Var;
        this.h = gtv0Var;
        this.i = qyh0Var;
        this.j = yqgVar;
    }

    public static void w(String str, Throwable th) {
        if (th instanceof SocketTimeoutException) {
            Logger.e(th, "Command: %s failed due to socket timeout", new Object[]{str});
            return;
        }
        if (th instanceof UnknownHostException) {
            Logger.b("Command: %s failed due to an UnknownHostException", new Object[]{str});
            return;
        }
        if ((th instanceof HttpException) && ((HttpException) th).a == 503) {
            Logger.b("Command: %s failed due to HTTP 503 (likely offline)", new Object[]{str});
            return;
        }
        n57.t("Command: " + str + " failed", th);
    }

    public final void b(String str, Bundle bundle, ResultReceiver resultReceiver) {
        if (u()) {
            return;
        }
        Maybe maybeB = this.g.b(1, v(null), str);
        Locale locale = Locale.US;
        this.k.a(maybeB.k(Single.error(new UnsupportedOperationException("No sessions found that support command ".concat(str)))).flatMap(new x8a0(str, bundle, (byte) 13)).onErrorComplete(new hfr(str, (byte) 8)).subscribe((Consumer) new fv5(resultReceiver, (byte) 7)));
    }

    public final void c(String str, Bundle bundle) {
        this.f.o();
        String strV = v(null);
        this.k.a(this.g.c(1, strV, str).flatMapCompletable(new fyh0(strV, str, bundle, (byte) 1)).o(new hfr(str, (byte) 11)).subscribe());
    }

    public final boolean d(Intent intent) {
        eyh0 eyh0Var = this.f;
        if (!eyh0Var.o()) {
            return super.d(intent);
        }
        KeyEvent keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT");
        if (keyEvent == null || keyEvent.getAction() != 0) {
            return super.d(intent);
        }
        PlaybackStateCompat playbackStateCompatF = eyh0Var.e().f();
        if (playbackStateCompatF == null) {
            return super.d(intent);
        }
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        for (PlaybackStateCompat.CustomAction customAction : playbackStateCompatF.i) {
            if ("SEEK_15_SECONDS_FORWARD".equals(customAction.a())) {
                z2 = true;
            } else if ("SEEK_15_SECONDS_BACK".equals(customAction.a())) {
                z3 = true;
            } else if ("SKIP_TO_NEXT_CHAPTER".equals(customAction.a())) {
                z = true;
            }
        }
        int keyCode = keyEvent.getKeyCode();
        long j = playbackStateCompatF.e;
        boolean z4 = (j & 32) == 0;
        if (z4 && z && keyCode == 87) {
            c("SKIP_TO_NEXT_CHAPTER", null);
            return true;
        }
        if (z4 && z2 && keyCode == 87) {
            c("SEEK_15_SECONDS_FORWARD", null);
            return true;
        }
        if ((16 & j) != 0 || !z3 || keyCode != 88) {
            return super.d(intent);
        }
        c("SEEK_15_SECONDS_BACK", null);
        return true;
    }

    public final void e() {
        if (u()) {
            return;
        }
        String strV = v(null);
        this.k.a(this.g.a(strV, kxh0.b, 1).flatMapCompletable(new hfr(strV, (byte) 12)).o(new swg0((byte) 22)).subscribe());
    }

    public final void f() {
        khs0 khs0Var = this.l;
        this.l = null;
        if (khs0Var != null && this.j.e() - khs0Var.d() <= 5000 && khs0Var.a().equals(v(null))) {
            g(khs0Var.c(), khs0Var.b());
        } else {
            if (u()) {
                return;
            }
            String strV = v(null);
            this.k.a(this.g.a(strV, kxh0.c, 1).flatMapCompletable(new hfr(strV, (byte) 7)).o(new swg0((byte) 16)).subscribe());
        }
    }

    public final void g(String str, Bundle bundle) {
        if (u()) {
            return;
        }
        int i = bundle != null ? bundle.getInt("android.media.session.extra.LEGACY_STREAM_TYPE", 3) : 3;
        String strV = v(str);
        this.k.a(this.g.a(strV, kxh0.h, 1).flatMapCompletable(new oxh0(i, bundle, strV, str)).o(new swg0((byte) 28)).subscribe());
    }

    public final void h(String str, Bundle bundle) {
        if (u()) {
            return;
        }
        String strV = v(null);
        this.k.a(this.g.a(strV, kxh0.i, 1).flatMapCompletable(new fyh0(strV, str, bundle, (byte) 0)).o(new swg0((byte) 20)).subscribe());
    }

    public final void i(Uri uri, Bundle bundle) {
        if (u()) {
            return;
        }
        if (bundle == null) {
            bundle = new Bundle();
        }
        String strV = v(null);
        this.k.a(this.g.a(strV, kxh0.X, 1).flatMapCompletable(new gyh0(strV, uri, bundle, (byte) 0)).o(new swg0((byte) 26)).subscribe());
    }

    public final void j(String str, Bundle bundle) {
        this.l = new khs0(this.j.e(), str, v(str), bundle);
    }

    public final void k(Uri uri, Bundle bundle) {
        if (u()) {
            return;
        }
        if (bundle == null) {
            bundle = new Bundle();
        }
        String strV = v(null);
        this.k.a(this.g.a(strV, kxh0.Y, 1).flatMapCompletable(new gyh0(strV, uri, bundle, (byte) 1)).o(new swg0((byte) 25)).subscribe());
    }

    public final void l(long j) {
        if (u()) {
            return;
        }
        String strV = v(null);
        this.k.a(this.g.a(strV, kxh0.g, 1).flatMapCompletable(new t7s(strV, j, (byte) 2)).o(new swg0((byte) 19)).subscribe());
    }

    public final void m(RatingCompat ratingCompat) {
        int i;
        if (u()) {
            return;
        }
        String strV = v(null);
        if (ratingCompat.b()) {
            i = ratingCompat.g() ? 1 : 2;
        } else {
            i = 3;
        }
        this.k.a(this.g.a(strV, kxh0.f, 1).flatMapCompletable(new pwr(strV, i, (byte) 4)).o(new swg0((byte) 27)).subscribe());
    }

    public final void n(int i) {
        if (u()) {
            return;
        }
        String strV = v(null);
        this.k.a(this.g.a(strV, kxh0.Z, 1).flatMapCompletable(new pwr(strV, i, (byte) 3)).o(new swg0((byte) 23)).subscribe());
    }

    public final void o(int i) {
        if (u()) {
            return;
        }
        String strV = v(null);
        this.k.a(this.g.a(strV, kxh0.N0, 1).flatMapCompletable(new pwr(strV, i, (byte) 5)).o(new swg0((byte) 29)).subscribe());
    }

    public final void p() {
        if (u()) {
            return;
        }
        String strV = v(null);
        this.k.a(this.g.a(strV, kxh0.e, 1).flatMapCompletable(new hfr(strV, (byte) 10)).o(new swg0((byte) 18)).subscribe());
    }

    public final void q() {
        if (u()) {
            return;
        }
        String strV = v(null);
        this.k.a(this.g.a(strV, kxh0.d, 1).flatMapCompletable(new hfr(strV, (byte) 9)).o(new swg0((byte) 17)).subscribe());
    }

    public final void r(long j) {
        int i;
        if (u()) {
            return;
        }
        ArrayList arrayListG = this.f.e().g();
        if (arrayListG == null) {
            i = -1;
            break;
        }
        i = 0;
        while (true) {
            if (i >= arrayListG.size()) {
                i = -1;
                break;
            } else if (((MediaSessionCompat.QueueItem) arrayListG.get(i)).a() == j) {
                break;
            } else {
                i++;
            }
        }
        int i2 = i != -1 ? i : 0;
        String strV = v(null);
        this.k.a(this.g.a(strV, kxh0.t, 1).flatMapCompletable(new pwr(strV, i2, (byte) 2)).o(new swg0((byte) 21)).subscribe());
    }

    public final void s() {
        if (u()) {
            return;
        }
        String strV = v(null);
        this.k.a(this.g.a(strV, kxh0.a, 1).flatMapCompletable(new hfr(strV, (byte) 13)).o(new swg0((byte) 24)).subscribe());
    }

    public final boolean u() {
        if (this.f.o()) {
            return false;
        }
        n57.e("Trying to invoke a callback on the non-active MediaSession");
        return true;
    }

    public final String v(String str) {
        String strG;
        eyh0 eyh0Var = this.f;
        gtv0 gtv0Var = this.h;
        if (str != null) {
            gtv0Var.getClass();
            String strA = eyh0Var.f().a();
            if ("com.google.android.googlequicksearchbox".equals(strA) || "com.google.android.apps.searchlite".equals(strA)) {
                String[] strArrSplit = str.split("---");
                strG = strArrSplit.length != 2 ? gtv0.g(eyh0Var) : strArrSplit[0];
            } else {
                strG = gtv0.g(eyh0Var);
            }
        } else {
            gtv0Var.getClass();
            strG = gtv0.g(eyh0Var);
        }
        this.i.getClass();
        return strG;
    }
}
