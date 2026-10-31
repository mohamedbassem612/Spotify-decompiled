package p;

import com.spotify.player.model.Context;
import com.spotify.player.model.PlayOrigin;
import com.spotify.player.model.command.options.LoggingParams;
import com.spotify.player.model.command.options.PreparePlayOptions;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class z410 {
    public final Observable a;
    public final dxz0 b;
    public final ov20 c;
    public final byp0 d;
    public final t310 e;
    public final q410 f;
    public final h410 g;
    public final t7y h;
    public final ynb0 i;
    public final ynb0 j;
    public final muz k;

    public z410(cyp cypVar, Observable observable, dxz0 dxz0Var, ov20 ov20Var, byp0 byp0Var, t310 t310Var, q410 q410Var, h410 h410Var, t7y t7yVar, ynb0 ynb0Var, ynb0 ynb0Var2, agc0 agc0Var) {
        this.a = observable;
        this.b = dxz0Var;
        this.c = ov20Var;
        this.d = byp0Var;
        this.e = t310Var;
        this.f = q410Var;
        this.g = h410Var;
        this.h = t7yVar;
        this.i = ynb0Var;
        this.j = ynb0Var2;
        this.k = cypVar.d();
    }

    public final Single a(PreparePlayOptions preparePlayOptions, String str) {
        return ((hj91) ((ki91) this.j.get())).d(str).firstOrError().map(vap1.b1).flatMap(new w410(preparePlayOptions, this));
    }

    public final Single b(Context context, PreparePlayOptions preparePlayOptions, PlayOrigin playOrigin, LoggingParams loggingParams) {
        return yoi1.i(w5p1.k(this.c), o6x.a).firstOrError().map(new kp00(this, preparePlayOptions, context, (byte) 4)).flatMap(new w2z(this, context, (byte) 10)).flatMap(new x410(this, context, playOrigin, loggingParams));
    }
}
