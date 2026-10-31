package p;

import android.os.Bundle;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableSingleSingle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class fc0 implements vdh {
    public final zx4 a;
    public final r8l b;
    public final Flowable c;
    public final x610 d;

    public fc0(zx4 zx4Var, r8l r8lVar, Flowable flowable, x610 x610Var) {
        this.a = zx4Var;
        this.b = r8lVar;
        this.c = flowable;
        this.d = x610Var;
    }

    @Override // p.vdh
    public final boolean a(String str) {
        return "active_playback_restricted".equals(str);
    }

    @Override // p.vdh
    public final Single b(Bundle bundle) {
        Single singleJust;
        if (bundle == null) {
            return Single.just(new eeh(2, cy30.g("com.spotify.music.extra.ERROR", "Extras are null")));
        }
        String string = bundle.getString("com.spotify.music.extra.PACKAGE_NAME");
        if (string == null) {
            return Single.just(new eeh(2, cy30.g("com.spotify.music.extra.ERROR", "package name required")));
        }
        if (this.a.d()) {
            Flowable flowable = this.c;
            singleJust = new FlowableSingleSingle(ydh.f(flowable, flowable)).map(new gid(this, string, (byte) 7));
            singleJust.getClass();
        } else {
            singleJust = Single.just(new eeh(1, pzm.g("com.spotify.music.extra.IS_ACTIVE_PLAYBACK_RESTRICTED", false)));
            singleJust.getClass();
        }
        return singleJust.onErrorReturn(drm0.b);
    }

    @Override // p.vdh
    public final String c() {
        return "active_playback_restricted";
    }
}
