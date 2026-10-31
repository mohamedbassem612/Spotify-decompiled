package p;

import android.net.Uri;
import com.spotify.player.model.PauseResumeOrigin;
import com.spotify.player.model.command.ResumeCommand;
import com.spotify.player.model.command.SkipToNextTrackCommand;
import com.spotify.player.model.command.SkipToPrevTrackCommand;
import com.spotify.player.model.command.options.CommandOptions;
import com.spotify.player.model.command.options.SkipToPrevTrackOptions;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class j1l1 {
    public static final o9u0 A;
    public static final m9u0 B;
    public static final CommandOptions x;
    public static final PauseResumeOrigin y;
    public static final h9u0 z;
    public final Scheduler a;
    public final lzn0 b;
    public final x45 c;
    public final ruz d;
    public final my30 e;
    public final Observable f;
    public final muz g;
    public final ilh1 h;
    public final g0l1 i;
    public final ajg j;
    public final String k;
    public final String l;
    public final iov0 m;
    public final Locale n;
    public final zsc o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final z710 f12p;
    public final y221 q;
    public final www0 r;
    public final i8h1 s;
    public final dsk0 t;
    public final xh71 u;
    public final n2l1 v;
    public List w = z6x.a;

    static {
        CommandOptions commandOptionsBuild = CommandOptions.builder().systemInitiated(false).build();
        x = commandOptionsBuild;
        PauseResumeOrigin pauseResumeOriginCreate = PauseResumeOrigin.create("vteceffecthandlerfactory");
        y = pauseResumeOriginCreate;
        z = new h9u0(ResumeCommand.builder().options(commandOptionsBuild).resumeOrigin(pauseResumeOriginCreate).build());
        A = new o9u0(SkipToPrevTrackCommand.builder().options(SkipToPrevTrackOptions.builder().commandOptions(commandOptionsBuild).allowSeeking(Boolean.TRUE).build()).build());
        B = new m9u0(SkipToNextTrackCommand.builder().options(commandOptionsBuild).build());
    }

    public j1l1(Scheduler scheduler, lzn0 lzn0Var, x45 x45Var, ruz ruzVar, my30 my30Var, Observable observable, muz muzVar, ilh1 ilh1Var, g0l1 g0l1Var, ajg ajgVar, String str, String str2, iov0 iov0Var, Locale locale, zsc zscVar, z710 z710Var, y221 y221Var, www0 www0Var, i8h1 i8h1Var, dsk0 dsk0Var, xh71 xh71Var, n2l1 n2l1Var) {
        this.a = scheduler;
        this.b = lzn0Var;
        this.c = x45Var;
        this.d = ruzVar;
        this.e = my30Var;
        this.f = observable;
        this.g = muzVar;
        this.h = ilh1Var;
        this.i = g0l1Var;
        this.j = ajgVar;
        this.k = str;
        this.l = str2;
        this.m = iov0Var;
        this.n = locale;
        this.o = zscVar;
        this.f12p = z710Var;
        this.q = y221Var;
        this.r = www0Var;
        this.s = i8h1Var;
        this.t = dsk0Var;
        this.u = xh71Var;
        this.v = n2l1Var;
    }

    public final Single a(String str) {
        if (str != null) {
            Uri uri = Uri.parse(str);
            if (!u890.j(uri.getScheme(), "data")) {
                uri = null;
            }
            if (uri != null) {
                return Single.defer(new xf0(this, uri, (byte) 17)).map(y1x0.X0).onErrorReturn(a2x0.Y0);
            }
        }
        return Single.just(j5.a);
    }
}
