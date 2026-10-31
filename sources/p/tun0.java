package p;

import android.R;
import android.app.Activity;
import android.app.ActivityOptions;
import android.os.Bundle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class tun0 {
    public final lik1 a;
    public final Activity b;
    public final lzn0 c;
    public final s4b1 d;
    public final an3 e;
    public final jpn f;
    public final evm1 g;
    public final zwz0 h;
    public final Bundle i;

    public tun0(lik1 lik1Var, Activity activity, lzn0 lzn0Var, s4b1 s4b1Var, an3 an3Var, jpn jpnVar, evm1 evm1Var, zwz0 zwz0Var) {
        this.a = lik1Var;
        this.b = activity;
        this.c = lzn0Var;
        this.d = s4b1Var;
        this.e = an3Var;
        this.f = jpnVar;
        this.g = evm1Var;
        this.h = zwz0Var;
        this.i = ActivityOptions.makeCustomAnimation(activity, R.anim.fade_in, R.anim.fade_out).toBundle();
    }

    public final boolean a() {
        return !this.b.isDestroyed();
    }
}
