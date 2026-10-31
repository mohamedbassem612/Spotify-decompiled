package p;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.subjects.BehaviorSubject;
import io.reactivex.rxjava3.subjects.CompletableSubject;
import io.reactivex.rxjava3.subjects.SingleSubject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class y4f1 implements hzi0 {
    public final qus a;
    public final kcs b;

    public y4f1(qus qusVar, kcs kcsVar) {
        this.a = qusVar;
        this.b = kcsVar;
    }

    @Override // p.hzi0
    public final Completable a(String str) {
        CompletableSubject completableSubjectZ = CompletableSubject.z();
        this.b.b.put(str, completableSubjectZ);
        this.a.a.onNext(new o5f1(str));
        return completableSubjectZ;
    }

    @Override // p.hzi0
    public final SingleSubject b(Object obj, String str) {
        SingleSubject singleSubject = new SingleSubject();
        this.b.a.put(str, singleSubject);
        this.a.a.onNext(new p5f1(str, loo1.C((jjo0) obj)));
        return singleSubject;
    }

    @Override // p.hzi0
    public final String getId() {
        return "TOOLTIP_HANDLER_ID";
    }

    @Override // p.hzi0
    public final BehaviorSubject getState() {
        return this.a.b;
    }
}
