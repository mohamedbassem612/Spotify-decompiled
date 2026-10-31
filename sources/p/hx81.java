package p;

import com.spotify.messages.BetamaxPlaybackSession;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromAction;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lp/hx81;", "Lp/l1o0;", "<init>", "()V", "p/kuw0", "src_main_java_com_spotify_nearbydevicespermissions_requestflowimpl-requestflowimpl"}, k = 1, mv = {2, 3, 0}, xi = BetamaxPlaybackSession.CLIENT_METADATA_FIELD_NUMBER)
public final class hx81 extends l1o0 {
    public p2o0 I1;
    public th30 J1;
    public t1o0 K1;

    @Override // p.l1o0
    public final p2o0 Y0() {
        p2o0 p2o0Var = this.I1;
        if (p2o0Var != null) {
            return p2o0Var;
        }
        u890.C("permissions");
        throw null;
    }

    @Override // p.l1o0
    public final t1o0 Z0() {
        t1o0 t1o0Var = this.K1;
        if (t1o0Var != null) {
            return t1o0Var;
        }
        u890.C("presenter");
        throw null;
    }

    @Override // p.l1o0
    public final th30 a1() {
        th30 th30Var = this.J1;
        if (th30Var != null) {
            return th30Var;
        }
        u890.C("supportFragmentManager");
        throw null;
    }

    @Override // p.l1o0
    public final void c1() {
        t1o0 t1o0VarZ0 = Z0();
        q1o0 q1o0Var = t1o0VarZ0.c;
        t1o0VarZ0.g.b(q1o0Var.b().flatMapCompletable(new swm0(q1o0Var, (byte) 4)).c(new CompletableFromAction(new s1o0(t1o0VarZ0, (byte) 3))).subscribe());
    }
}
