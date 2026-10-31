package p;

import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.subjects.CompletableSubject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ddx0 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ edx0 b;
    public final /* synthetic */ CompletableSubject c;

    public /* synthetic */ ddx0(edx0 edx0Var, CompletableSubject completableSubject, byte b) {
        this.a = b;
        this.b = edx0Var;
        this.c = completableSubject;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        CompletableSubject completableSubject = this.c;
        edx0 edx0Var = this.b;
        switch (b) {
            case 0:
                edx0Var.i.onNext(new bdx0(obj));
                completableSubject.onComplete();
                break;
            default:
                Throwable th = (Throwable) obj;
                edx0Var.i.onNext(new adx0(th));
                completableSubject.onError(th);
                break;
        }
    }
}
