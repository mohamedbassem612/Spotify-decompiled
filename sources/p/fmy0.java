package p;

import com.spotify.pses.v1.proto.ConfigurationResponse;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class fmy0 {
    public final wlv0 a;
    public final dzp0 b;
    public final r320 c;
    public final Scheduler d;
    public final gks0 e;
    public final dp21 f;
    public final gfo0 g;
    public final kqc h;

    public fmy0(wlv0 wlv0Var, dzp0 dzp0Var, r320 r320Var, Scheduler scheduler, gks0 gks0Var, dp21 dp21Var, gfo0 gfo0Var, kqc kqcVar) {
        this.a = wlv0Var;
        this.b = dzp0Var;
        this.c = r320Var;
        this.d = scheduler;
        this.e = gks0Var;
        this.f = dp21Var;
        this.g = gfo0Var;
        this.h = kqcVar;
    }

    public static Single a(fmy0 fmy0Var) {
        boolean z = hzd1.a;
        Scheduler scheduler = fmy0Var.d;
        wlv0 wlv0Var = fmy0Var.a;
        uic uicVar = wlv0Var.a;
        Single singleDoOnSubscribe = Single.defer(new yj1(wlv0Var, (byte) 21)).doOnSubscribe(new emy0(fmy0Var, (byte) 0));
        gks0 gks0Var = fmy0Var.e;
        gks0Var.getClass();
        return singleDoOnSubscribe.compose(new vgq0(gks0Var, (byte) 5)).subscribeOn(scheduler).timeout(10000L, TimeUnit.MILLISECONDS, scheduler).doOnSuccess(new emy0(fmy0Var, (byte) 1)).map(gtv0.c).onErrorReturn(new svh0(z, fmy0Var, (byte) 11)).doOnSuccess(new dy40(fmy0Var, (byte) 18)).map(new uip0(fmy0Var, (byte) 26));
    }

    public final gmy0 b() {
        ConfigurationResponse configurationResponseA = this.c.a();
        if (configurationResponseA == null) {
            configurationResponseA = hr80.p();
        }
        this.g.a(configurationResponseA);
        return new yrg0(configurationResponseA, (byte) 9).l();
    }
}
