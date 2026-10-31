package p;

import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.subjects.BehaviorSubject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class wd8 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ kp5 b;

    public /* synthetic */ wd8(kp5 kp5Var, byte b) {
        this.a = b;
        this.b = kp5Var;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        kp5 kp5Var = this.b;
        switch (b) {
            case 0:
                vd8 vd8Var = (vd8) obj;
                BehaviorSubject behaviorSubject = (BehaviorSubject) kp5Var.g;
                od8 od8Var = (od8) kp5Var.a;
                if (!(behaviorSubject.h() instanceof xd8)) {
                    if (vd8Var instanceof sd8) {
                        behaviorSubject.onNext(new xd8(od8Var.e));
                    } else if (vd8Var instanceof ud8) {
                        behaviorSubject.onNext(new xd8(od8Var.d));
                    }
                }
                break;
            case 1:
                ((BehaviorSubject) kp5Var.g).onNext((ae8) obj);
                break;
            default:
                ((BehaviorSubject) kp5Var.g).onNext(new xd8(((od8) kp5Var.a).f));
                break;
        }
    }
}
