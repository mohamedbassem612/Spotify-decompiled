package p;

import io.reactivex.rxjava3.core.ObservableEmitter;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class gi30 implements o2q0, li30 {
    public final WeakReference a;
    public final WeakReference b;
    public final WeakReference c;
    public final WeakReference d;
    public WeakReference e = new WeakReference(null);
    public int f;

    public gi30(WeakReference weakReference, WeakReference weakReference2, WeakReference weakReference3, WeakReference weakReference4) {
        this.a = weakReference;
        this.b = weakReference2;
        this.c = weakReference3;
        this.d = weakReference4;
    }

    public final void a(zf30 zf30Var) {
        axn0 axn0Var;
        zf30 zf30Var2 = (zf30) this.a.get();
        if (!(zf30Var instanceof t2u) || zf30Var == zf30Var2) {
            return;
        }
        this.f++;
        WeakReference weakReference = this.d;
        if (weakReference != null && (axn0Var = (axn0) weakReference.get()) != null) {
            axn0Var.c.onNext(Boolean.TRUE);
        }
        c();
        zf30Var.s1.a(new i83(this, (byte) 6));
    }

    @Override // p.o2q0
    public final void b(String str, zf30 zf30Var) {
        this.e = new WeakReference(zf30Var);
        c();
    }

    public final void c() {
        zf30 zf30Var = (zf30) this.a.get();
        if (zf30Var == null) {
            return;
        }
        ei30 ei30VarK = xap1.k(zf30Var, (zf30) this.e.get(), (yun0) this.c.get(), this.f);
        ObservableEmitter observableEmitter = (ObservableEmitter) this.b.get();
        if (observableEmitter != null) {
            observableEmitter.onNext(ei30VarK);
        }
    }
}
