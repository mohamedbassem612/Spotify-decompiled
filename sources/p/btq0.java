package p;

import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.subjects.BehaviorSubject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class btq0 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ dtq0 b;

    public /* synthetic */ btq0(dtq0 dtq0Var, byte b) {
        this.a = b;
        this.b = dtq0Var;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        dtq0 dtq0Var = this.b;
        switch (b) {
            case 0:
                BehaviorSubject behaviorSubject = dtq0Var.Y;
                if (behaviorSubject != null) {
                    behaviorSubject.onNext(obj);
                    return;
                } else {
                    u890.C("modelSubject");
                    throw null;
                }
            default:
                atq0 atq0Var = (atq0) obj;
                dtq0Var.t = atq0Var;
                atq0Var.a(new ctq0(dtq0Var, (byte) 0), new ctq0(dtq0Var, (byte) 1));
                return;
        }
    }
}
