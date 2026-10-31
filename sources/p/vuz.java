package p;

import com.spotify.player.esperanto.proto.EsGetErrorRequest$GetErrorRequest;
import com.spotify.player.esperanto.proto.EsGetStateRequest$GetStateRequest;
import com.spotify.player.esperanto.proto.EsOptional$OptionalInt64;
import io.reactivex.rxjava3.core.BackpressureStrategy;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class vuz implements zeu0 {
    public final ujm a;
    public final Scheduler b;
    public final boolean c;

    public vuz(ujm ujmVar, Scheduler scheduler, boolean z) {
        this.a = ujmVar;
        this.b = scheduler;
        this.c = z;
    }

    @Override // p.zeu0
    public final Observable a() {
        return this.a.callStream("spotify.player.esperanto.proto.ContextPlayer", "GetError", EsGetErrorRequest$GetErrorRequest.o()).map(fmv.T0).onErrorResumeNext(y580.b1).map(cxo1.c1);
    }

    @Override // p.zeu0
    public final Flowable b(int i, int i2) {
        if (i < 0) {
            hhg1.n("Cap under zero");
            return null;
        }
        if (i2 < 0) {
            hhg1.n("Cap under zero");
            return null;
        }
        pnz pnzVarO = EsGetStateRequest$GetStateRequest.o();
        qpz qpzVarP = EsOptional$OptionalInt64.p();
        qpzVarP.n(i);
        pnzVarO.s(qpzVarP);
        qpz qpzVarP2 = EsOptional$OptionalInt64.p();
        qpzVarP2.n(i2);
        pnzVarO.q(qpzVarP2);
        EsGetStateRequest$GetStateRequest esGetStateRequest$GetStateRequest = (EsGetStateRequest$GetStateRequest) pnzVarO.build();
        esGetStateRequest$GetStateRequest.getClass();
        return k4p1.z(this.a.callStream("spotify.player.esperanto.proto.ContextPlayer", "GetState", esGetStateRequest$GetStateRequest).map(qz70.S0), this.b, this.c).onErrorResumeNext(o9p1.d1).map(vap1.a1).toFlowable(BackpressureStrategy.d);
    }

    @Override // p.zeu0
    public final Flowable c() {
        return b(2, 2);
    }
}
