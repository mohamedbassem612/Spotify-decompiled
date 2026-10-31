package p;

import io.reactivex.rxjava3.disposables.CompositeDisposable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class xz11 implements f961, feh1 {
    public final lw21 a;
    public final yqg b;
    public final vz11 c;
    public final CompositeDisposable d;

    public xz11(lw21 lw21Var, yqg yqgVar, vz11 vz11Var) {
        this.a = lw21Var;
        this.b = yqgVar;
        this.c = vz11Var;
        CompositeDisposable compositeDisposable = new CompositeDisposable();
        this.d = compositeDisposable;
        lw21Var.d();
        compositeDisposable.b(lw21Var.a().onErrorResumeWith(new wz11(this)).flatMapCompletable(new s6z0(this, (byte) 10)).subscribe(zm5.c, p.e1));
    }

    @Override // p.luk
    public final pdy0 e(ydy0 ydy0Var) {
        return this.a.e(ydy0Var);
    }

    @Override // p.dwo
    public final void shutdown() {
        this.d.dispose();
    }

    @Override // p.f961
    public final Object getApi() {
        return this;
    }
}
