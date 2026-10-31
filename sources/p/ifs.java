package p;

import com.google.protobuf.Empty;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.subjects.BehaviorSubject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ifs implements a4l {
    public final be a;
    public final wqk1 b;
    public final BehaviorSubject c = BehaviorSubject.f();
    public final BehaviorSubject d = BehaviorSubject.f();
    public final vku e = new vku();

    public ifs(be beVar, wqk1 wqk1Var) {
        this.a = beVar;
        this.b = wqk1Var;
    }

    @Override // p.a4l
    public final void a() {
        this.e.c();
        this.c.onNext(new l0u(null, null));
        this.d.onNext(new l0u(null, null));
    }

    @Override // p.a4l
    public final void b() {
        Disposable disposableSubscribe = this.a.l(Empty.n()).filter(zp8.X0).map(rbc.Y0).distinctUntilChanged().subscribe(new cfs(this, (byte) 1));
        vku vkuVar = this.e;
        vkuVar.a(disposableSubscribe);
        vkuVar.a(this.d.filter(new efr(this, (byte) 9)).distinctUntilChanged().doOnNext(p.N0).subscribe(new xu(this.c, (byte) 22)));
    }
}
