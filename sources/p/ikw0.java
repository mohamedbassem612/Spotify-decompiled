package p;

import android.media.AudioManager;
import io.reactivex.rxjava3.functions.Action;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final /* synthetic */ class ikw0 implements Action {
    public final /* synthetic */ egh0 a;
    public final /* synthetic */ u19 b;
    public final /* synthetic */ long c;

    public /* synthetic */ ikw0(egh0 egh0Var, u19 u19Var, long j) {
        this.a = egh0Var;
        this.b = u19Var;
        this.c = j;
    }

    public final void run() {
        lkw0 lkw0Var = (lkw0) this.a.b;
        if (!lkw0Var.n) {
            lkw0Var.n = true;
            lkw0Var.g.e((AudioManager.OnAudioFocusChangeListener) null, 3, 2, 9);
        }
        u19 u19Var = this.b;
        if (u19Var.d.c() && lkw0Var.f48p.isDisposed()) {
            lkw0Var.f48p = lkw0Var.f.b().b(new xdh(lkw0Var, u19Var, this.c, (byte) 3), ((Long) u19Var.d.b()).longValue(), TimeUnit.MILLISECONDS);
        }
    }
}
