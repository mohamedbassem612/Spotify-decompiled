package p;

import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.ExoTimeoutException;
import com.comscore.streaming.ContentMediaFormat;
import com.comscore.streaming.WindowState;
import com.google.android.gms.tasks.Task;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.ErrorType;
import com.spotify.player.model.PlayerError;
import com.spotify.player.model.PlayerQueue;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import java.io.IOException;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class n9v implements Function, jgg1, f9d0, e9d0, Predicate, mnm, d5q0, ka00, hc10 {
    public final /* synthetic */ byte a;

    public /* synthetic */ n9v(byte b) {
        this.a = b;
    }

    public static void a(int i) {
        throw new UnknownFieldException(f4i1.c(i, "An unknown field for index "));
    }

    public static /* synthetic */ void b(int i, String str) {
        throw new IllegalArgumentException((str + i + '.').toString());
    }

    public static /* synthetic */ void f(Object obj, Object obj2) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append(obj2);
        throw new IllegalStateException(sb.toString().toString());
    }

    public static /* synthetic */ void h(String str, Object obj, Object obj2) {
        throw new IllegalStateException((str + obj + obj2).toString());
    }

    public static /* synthetic */ void j(Object obj, Object obj2) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append(obj2);
        throw new IllegalArgumentException(sb.toString());
    }

    public static /* synthetic */ void k(String str, Object obj, Object obj2) {
        throw new IllegalStateException((str + obj + obj2).toString());
    }

    public static /* synthetic */ void l(Object obj, Object obj2) throws IOException {
        throw new IOException("Source '" + obj + ((Object) "' and destination '") + obj2 + ((Object) "' are the same"));
    }

    public static /* synthetic */ void m(String str, Object obj, Object obj2) throws IOException {
        throw new IOException(str + obj + obj2);
    }

    public static /* synthetic */ void n(String str, Object obj, Object obj2) throws IOException {
        throw new IOException(str + obj + obj2);
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 6:
                return new qnw(((mnw) obj).a);
            case 7:
                String message = ((Throwable) obj).getMessage();
                if (message != null && message.contains("The disclaimer agreement must be completed to use Samsung account")) {
                    return Observable.just(rnw.a);
                }
                if (message == null) {
                    message = "";
                }
                return Observable.just(new snw(message));
            case 10:
                return df61.b.e((le61) obj).getBytes(nne.a);
            case 15:
                spq0 spq0Var = (spq0) obj;
                return spq0Var.c() ? Boolean.valueOf(((l0l) spq0Var.b()).l()) : Boolean.TRUE;
            case 16:
                PlayerError playerError = (PlayerError) obj;
                kkv kkvVar = kkv.j;
                int i = r610.a[playerError.error().ordinal()];
                if (i == 1) {
                    return kkvVar;
                }
                if (i == 2) {
                    return kkv.i;
                }
                if (i == 3) {
                    return kkv.b;
                }
                String strReasons = playerError.reasons();
                if (strReasons != null) {
                    if (strReasons.contains("not_available_offline")) {
                        return kkvVar;
                    }
                    if (strReasons.contains("licensor_restricted/track")) {
                        return kkv.h;
                    }
                    if (strReasons.contains("explicit_content_filtered")) {
                        return kkv.d;
                    }
                    if (strReasons.contains("banned_by_user") || playerError.error().equals(ErrorType.ONE_TRACK_UNPLAYABLE_AUTO_STOPPED) || playerError.error().equals(ErrorType.ALL_TRACKS_UNPLAYABLE_AUTO_STOPPED)) {
                        return kkv.c;
                    }
                }
                return kkv.k;
            default:
                PlayerQueue playerQueue = (PlayerQueue) obj;
                b380<ContextTrack> b380VarNextTracks = playerQueue.nextTracks();
                v280 v280VarM = b380.m();
                for (ContextTrack contextTrack : b380VarNextTracks) {
                    if (j710.a(contextTrack)) {
                        v280VarM.c(contextTrack);
                    }
                }
                b380<ContextTrack> b380VarPrevTracks = playerQueue.prevTracks();
                v280 v280VarM2 = b380.m();
                for (ContextTrack contextTrack2 : b380VarPrevTracks) {
                    if (j710.a(contextTrack2)) {
                        v280VarM2.c(contextTrack2);
                    }
                }
                return playerQueue.toBuilder().nextTracks(v280VarM.g()).prevTracks(v280VarM2.g()).build();
        }
    }

    public Object d(Task task) {
        return Integer.valueOf(WindowState.MAXIMIZED);
    }

    public void e(Object obj, ko20 ko20Var) {
        ((o8u0) obj).w0(new n8u0(ko20Var));
    }

    @Override // p.hc10
    public ec10[] g() {
        return new ec10[]{new vn20()};
    }

    public void i(Exception exc) {
    }

    public void invoke(Object obj) {
        o8u0 o8u0Var = (o8u0) obj;
        switch (this.a) {
            case 13:
                o8u0Var.n(new ExoPlaybackException(2, new ExoTimeoutException(1), ContentMediaFormat.FULL_CONTENT_MOVIE));
                break;
            default:
                o8u0Var.R();
                break;
        }
    }

    public boolean test(Object obj) {
        switch (this.a) {
            case 17:
                return ((mkv) obj) != kkv.k;
            default:
                return ((ln41) obj) instanceof jn41;
        }
    }
}
