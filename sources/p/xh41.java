package p;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.scannables.scannables.ScannablesActivity;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.CompositeDisposable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class xh41 implements l5r0 {
    public final Boolean a;
    public final nbq b;
    public final ScannablesActivity c;
    public ei41 d;

    public xh41(boolean z, nbq nbqVar, ScannablesActivity scannablesActivity) {
        this.a = Boolean.valueOf(z);
        this.b = nbqVar;
        this.c = scannablesActivity;
    }

    public final void c(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        boolean zBooleanValue = this.a.booleanValue();
        yxo yxoVar = (yxo) this.b.a.d;
        daq daqVar = (daq) yxoVar.d;
        this.d = new ei41(this.c, viewGroup, layoutInflater, zBooleanValue, new uw0((Scheduler) daqVar.r3.get(), (Scheduler) daqVar.z1.get(), (Flowable) daqVar.z2.get(), (kh41) yxoVar.g.get(), (d241) yxoVar.h.get(), (c241) yxoVar.i.get(), new yh41((ut71) daqVar.g2.get()), (bx4) daqVar.Go.get()));
    }

    public final View getView() {
        ei41 ei41Var = this.d;
        if (ei41Var != null) {
            return ei41Var.b;
        }
        return null;
    }

    public final void start() {
        ei41 ei41Var = this.d;
        if (ei41Var != null) {
            uw0 uw0Var = ei41Var.e;
            ((CompositeDisposable) uw0Var.b).b(((Flowable) uw0Var.g).x(new f341((byte) 14)).z().observeOn((Scheduler) uw0Var.h).subscribe(new bi41(uw0Var, ei41Var.a, (byte) 1)));
        }
    }

    public final void stop() {
        ei41 ei41Var = this.d;
        if (ei41Var != null) {
            ((CompositeDisposable) ei41Var.e.b).g();
        }
    }
}
