package p;

import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import com.spotify.player.model.command.SignalCommand;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import io.reactivex.rxjava3.internal.operators.completable.CompletableError;
import io.reactivex.rxjava3.internal.operators.completable.CompletableOnErrorComplete;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableDistinctUntilChanged;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableIgnoreElementsCompletable;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableTakeUntilPredicate;
import io.reactivex.rxjava3.schedulers.Schedulers;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class cr51 implements zq51 {
    public final yqg a;
    public final mm4 b;
    public final w9u0 c;
    public final zeu0 d;
    public final xrc0 e;

    public cr51(yqg yqgVar, mm4 mm4Var, w9u0 w9u0Var, zeu0 zeu0Var, xrc0 xrc0Var) {
        this.a = yqgVar;
        this.b = mm4Var;
        this.c = w9u0Var;
        this.d = zeu0Var;
        this.e = xrc0Var;
    }

    public static ContextTrack c(PlayerState playerState) {
        Object next;
        ContextTrack contextTrack;
        Object obj = null;
        if (o4p1.C(playerState)) {
            return null;
        }
        b380 b380VarNextTracks = playerState.nextTracks();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : b380VarNextTracks) {
            if (((ContextTrack) obj2).isDelimiter()) {
                break;
            }
            arrayList.add(obj2);
        }
        Iterator it = arrayList.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            contextTrack = (ContextTrack) next;
            contextTrack.getClass();
        } while (!dr51.b(contextTrack));
        ContextTrack contextTrack2 = (ContextTrack) next;
        if (contextTrack2 != null) {
            return contextTrack2;
        }
        for (Object obj3 : arrayList) {
            ContextTrack contextTrack3 = (ContextTrack) obj3;
            contextTrack3.getClass();
            if (dr51.a(contextTrack3)) {
                obj = obj3;
                break;
            }
        }
        return (ContextTrack) obj;
    }

    public static Completable d(feh fehVar) {
        return fehVar.c() ? Completable.j(new Throwable(l1d.m("PlayerControlCommand failed: ", fehVar.a().g()))) : CompletableEmpty.a;
    }

    public final CompletableOnErrorComplete b(int i, iu30 iu30Var) {
        Flowable flowableC = this.d.c();
        bvn bvnVar = new bvn(iu30Var, (byte) 5);
        flowableC.getClass();
        return new FlowableIgnoreElementsCompletable(new FlowableTakeUntilPredicate(flowableC, bvnVar)).t(i, TimeUnit.MILLISECONDS, Schedulers.b, (CompletableError) null).o(Functions.h);
    }

    public final FlowableDistinctUntilChanged e(kl81... kl81VarArr) {
        return this.d.b(0, 80).J(new n801(kl81VarArr, this, (byte) 15)).t(Functions.a);
    }

    public final Completable f(String str, String str2) {
        SignalCommand.Builder builderSignalId = SignalCommand.builder().signalId(str);
        if (str2 != null) {
            builderSignalId.parameters(str2);
        }
        return this.c.a(q9u0.i(builderSignalId.build())).flatMapCompletable(new fza(this, (byte) 24));
    }
}
