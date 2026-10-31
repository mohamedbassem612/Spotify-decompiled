package p;

import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.functions.Consumer;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.subjects.PublishSubject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class j7m0 implements usa {
    public final MobiusLoop.Controller b;
    public final x8c0 c;
    public final s141 d;
    public final z350 e;
    public final vx40 f;
    public Consumer g;
    public final PublishSubject h;
    public final PublishSubject i;
    public final PublishSubject j;
    public final PublishSubject k;
    public final PublishSubject l;
    public final Observable m;

    public j7m0(MobiusLoop.Controller controller, x8c0 x8c0Var, s141 s141Var, z350 z350Var, vx40 vx40Var) {
        this.b = controller;
        this.c = x8c0Var;
        this.d = s141Var;
        this.e = z350Var;
        this.f = vx40Var;
        p811 p811Var = new p811();
        controller.c(new f7m0(this, p811Var));
        g7m0 g7m0Var = new g7m0(this);
        p811Var.a = g7m0Var;
        x8c0Var.a(g7m0Var);
        this.h = new PublishSubject();
        this.i = new PublishSubject();
        this.j = new PublishSubject();
        this.k = new PublishSubject();
        PublishSubject publishSubject = new PublishSubject();
        this.l = publishSubject;
        this.m = publishSubject.doOnSubscribe(new i7m0(this)).share();
    }
}
