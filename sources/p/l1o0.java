package p;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.messages.BetamaxPlaybackSession;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import java.io.Serializable;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lp/l1o0;", "Lp/hip;", "<init>", "()V", "p/kuw0", "src_main_java_com_spotify_nearbydevicespermissions_requestflowimpl-requestflowimpl"}, k = 1, mv = {2, 3, 0}, xi = BetamaxPlaybackSession.CLIENT_METADATA_FIELD_NUMBER)
public abstract class l1o0 extends hip {
    public final CompositeDisposable G1 = new CompositeDisposable();
    public pf30 H1;

    public final void G0() {
        ((zf30) this).h1 = true;
        t1o0 t1o0VarZ0 = Z0();
        t1o0VarZ0.f = this;
        int iOrdinal = t1o0VarZ0.h.ordinal();
        if (iOrdinal == 0) {
            l1o0 l1o0Var = t1o0VarZ0.f;
            if (l1o0Var == null) {
                u890.C("view");
                throw null;
            }
            l1o0Var.G1.b(l1o0Var.Y0().D().subscribe(new k1o0(l1o0Var.Z0(), (byte) 0)));
            return;
        }
        if (iOrdinal == 1) {
            t1o0VarZ0.a(true);
            return;
        }
        if (iOrdinal != 2) {
            eg.o();
            return;
        }
        t1o0VarZ0.h = w1o0.c;
        l1o0 l1o0Var2 = t1o0VarZ0.f;
        if (l1o0Var2 != null) {
            l1o0Var2.c1();
        } else {
            u890.C("view");
            throw null;
        }
    }

    public final void H0() {
        ((zf30) this).h1 = true;
        Z0().g.g();
        this.G1.g();
    }

    public abstract p2o0 Y0();

    public abstract t1o0 Z0();

    public abstract th30 a1();

    public final void b1(g4o0 g4o0Var) {
        th30 th30Var = ((zf30) this).U0;
        if (th30Var == null ? false : th30Var.U()) {
            return;
        }
        th30 th30VarA1 = a1();
        Bundle bundle = new Bundle();
        bundle.putSerializable("bluetooth-permission-flow-fragment-result", g4o0Var);
        th30VarA1.i0(bundle, "bluetooth-permission-flow-fragment-request");
        nu9 nu9Var = new nu9(th30VarA1);
        nu9Var.m(this);
        nu9Var.f();
    }

    public abstract void c1();

    public final View x0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        byte b = 1;
        ((zf30) this).h1 = true;
        t1o0 t1o0VarZ0 = Z0();
        Serializable serializable = bundle != null ? bundle.getSerializable("state-view") : null;
        w1o0 w1o0Var = serializable instanceof w1o0 ? (w1o0) serializable : null;
        if (w1o0Var == null) {
            w1o0Var = w1o0.a;
        }
        t1o0VarZ0.h = w1o0Var;
        this.H1 = a0(new pig0(Y0(), b), new e1r0((byte) 3, false));
        return null;
    }

    public final void z0() {
        ((zf30) this).h1 = true;
        pf30 pf30Var = this.H1;
        if (pf30Var != null) {
            pf30Var.b();
        } else {
            u890.C("launcher");
            throw null;
        }
    }
}
