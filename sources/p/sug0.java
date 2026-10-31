package p;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import io.reactivex.rxjava3.subjects.PublishSubject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class sug0 implements f080 {
    public final gw70 a;
    public final PublishSubject b = new PublishSubject();
    public boolean c;
    public ji0 d;
    public az70 e;

    public sug0(gw70 gw70Var, hcx0 hcx0Var) {
        this.a = gw70Var;
    }

    @Override // p.f080
    public final void e(int i, Bitmap bitmap) {
        ji0 ji0Var;
        if (bitmap.isRecycled()) {
            hhg1.n("Failed requirement.");
            return;
        }
        if (!this.c && (ji0Var = this.d) != null) {
            this.b.onNext(new oxg0(hcx0.d(ji0Var)));
        }
        if (bitmap.isRecycled()) {
            hhg1.n("Failed requirement.");
        }
    }

    @Override // p.f080
    public final void m(Drawable drawable) {
        ji0 ji0Var = this.d;
        this.b.onNext(new nxg0(ji0Var != null ? hcx0.d(ji0Var).a() : null));
    }

    @Override // p.f080
    public final void g(Drawable drawable) {
    }
}
