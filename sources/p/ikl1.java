package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.subjects.BehaviorSubject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ikl1 extends gn21 {
    public final String a;
    public final z8o0 b;
    public final dxz0 c;
    public final vku d = new vku();
    public final BehaviorSubject e;
    public final m5n f;
    public final Observable g;

    public ikl1(String str, z8o0 z8o0Var, dxz0 dxz0Var, b370 b370Var) {
        this.a = str;
        this.b = z8o0Var;
        this.c = dxz0Var;
        BehaviorSubject behaviorSubjectG = BehaviorSubject.g(new zsq0(Boolean.FALSE));
        this.e = behaviorSubjectG;
        this.f = new m5n(new zi50(new ry40("Notification state for ".concat(str), (byte) 12), (byte) 21), new wck0(hh60.U0, (byte) 22));
        this.g = behaviorSubjectG.doOnSubscribe(new hkl1(this, (byte) 0)).doOnDispose(new ruz0(this, (byte) 25));
    }

    public final Observable a() {
        return this.g;
    }

    public final void accept(Object obj) {
        throw td6.k(obj);
    }
}
