package p;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Action;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.completable.CompletablePeek;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableDoFinally;
import io.reactivex.rxjava3.subjects.CompletableSubject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class vqd1 {
    public final y610 a;
    public final String b;
    public final gn10 c;
    public final zle1 d;
    public final g510 e;
    public final jgz0 f;
    public CompletableSubject g;
    public rl1 h;
    public t45 i;
    public t45 j;
    public Flowable k;
    public m210 l;
    public final rku m = new rku();

    public vqd1(y610 y610Var, String str, gn10 gn10Var, zle1 zle1Var, g510 g510Var, jgz0 jgz0Var) {
        this.a = y610Var;
        this.b = str;
        this.c = gn10Var;
        this.d = zle1Var;
        this.e = g510Var;
        this.f = jgz0Var;
    }

    public final void a() {
        this.m.a();
        rl1 rl1Var = this.h;
        if (rl1Var != null) {
            rl1Var.t();
        }
        this.h = null;
    }

    public final Single b(Boolean bool) {
        t45 t45VarA = this.d.a("spotify-tap");
        t45VarA.h = "android-system-tap";
        this.i = t45VarA;
        t45.m(t45VarA, "handle_tap_action", 4);
        Flowable flowable = this.k;
        if (flowable == null) {
            u890.C("sessionState");
            throw null;
        }
        Completable completableFlatMapCompletable = flowable.z().map(h2x0.R0).flatMapCompletable(i2x0.P0);
        sqd1 sqd1Var = new sqd1(this, (byte) 0);
        Consumer consumer = Functions.d;
        Action action = Functions.c;
        CompletablePeek completablePeekG = completableFlatMapCompletable.i(sqd1Var, consumer, action, action, action, action).g(new tqd1(this, (byte) 0));
        g510 g510Var = this.e;
        m210 m210Var = this.l;
        if (m210Var != null) {
            return completablePeekG.e(g510.q(g510Var, m210Var, g510Var.h.n()).flatMap(new uqd1(this, bool)).doOnSubscribe(new sqd1(this, (byte) 2)).doOnSuccess(new sqd1(this, (byte) 3))).doOnSuccess(new sqd1(this, (byte) 1));
        }
        u890.C("description");
        throw null;
    }

    public final CompletableSubject d(m210 m210Var) {
        this.l = m210Var;
        CompletableSubject completableSubject = this.g;
        if (completableSubject != null) {
            return completableSubject;
        }
        t45 t45VarA = this.d.a("spotify-tap");
        t45VarA.h = "android-system-tap";
        this.j = t45VarA;
        t45.m(t45VarA, "start_playback_session", 4);
        CompletableSubject completableSubject2 = new CompletableSubject();
        this.g = completableSubject2;
        this.m.b(new FlowableDoFinally(this.a.a(this.b).w(new sqd1(this, (byte) 4)).v(new z0u0(this, m210Var, (byte) 23)), new tqd1(this, (byte) 1)).subscribe());
        return completableSubject2;
    }
}
