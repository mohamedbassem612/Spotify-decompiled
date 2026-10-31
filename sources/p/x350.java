package p;

import android.content.Context;
import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.functions.Action;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeCreate;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeIgnoreElementCompletable;
import io.reactivex.rxjava3.internal.operators.maybe.MaybePeek;
import io.reactivex.rxjava3.subjects.BehaviorSubject;
import io.reactivex.rxjava3.subjects.PublishSubject;
import java.util.Optional;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class x350 {
    public static final Object i = new Object();
    public final Context a;
    public final ynb0 b;
    public psd0 d;
    public r02 e;
    public boolean h;
    public final PublishSubject c = new PublishSubject();
    public final BehaviorSubject f = BehaviorSubject.f();
    public final BehaviorSubject g = BehaviorSubject.f();

    public x350(Context context, ynb0 ynb0Var) {
        this.a = context;
        this.b = ynb0Var;
    }

    public final MaybeIgnoreElementCompletable a(z1a1 z1a1Var, z2p1 z2p1Var) {
        n8d0 c280Var;
        Logger.b("[LiveSharing] Beginning live-sharing as a " + z1a1Var + ".", new Object[0]);
        try {
            c280Var = ((j02) this.b.get()).newSessionBuilder(new dqu(this, (byte) 24)).withCoDoing(new u350(this), z2p1Var != null ? Optional.of(z2p1Var) : Optional.empty()).verifyRecordingInfo().begin(this.a);
            c280Var.getClass();
        } catch (Exception e) {
            c280Var = new c280(e);
        }
        return new MaybeIgnoreElementCompletable(t0c.g(c280Var).d(new t350(z1a1Var, this)).c(new t350(this, z1a1Var)).h());
    }

    public final Completable b(q02 q02Var) {
        n8d0 n8d0VarEndSession;
        Logger.b("[LiveSharing] Ending live-sharing session with reason: " + q02Var + ".", new Object[0]);
        r02 r02Var = this.e;
        if (r02Var == null || (n8d0VarEndSession = r02Var.endSession(q02Var)) == null) {
            return CompletableEmpty.a;
        }
        MaybeCreate maybeCreateG = t0c.g(n8d0VarEndSession);
        k530 k530Var = k530.t;
        Consumer consumer = Functions.d;
        Action action = Functions.c;
        return new MaybeIgnoreElementCompletable(new MaybePeek(maybeCreateG, k530Var, consumer, consumer, action, action, action).c(new od30(this, (byte) 9)).h()).g(new v350(this, (byte) 0));
    }

    public final void c(String str, IllegalStateException illegalStateException) {
        n57.e("[This only crashes in internal builds] " + str + " a meeting status listener in " + this + " threw unexpectedly. This usually happens when two instances of " + x350.class + " are loaded, sharing the same instance of " + this.b.get().getClass() + ":\n" + illegalStateException.getMessage());
    }

    public final void d(psd0 psd0Var) {
        synchronized (i) {
            this.d = psd0Var;
            this.c.onNext(psd0Var);
        }
    }
}
