package p;

import android.os.Build;
import io.reactivex.rxjava3.subjects.BehaviorSubject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class u38 implements w38 {
    public final x38 a;
    public final mw7 b;
    public final BehaviorSubject c = BehaviorSubject.f();

    public u38(x38 x38Var, mw7 mw7Var) {
        this.a = x38Var;
        this.b = mw7Var;
    }

    @Override // p.w38
    public final void a(int i, String str, Integer num, String str2) {
        BehaviorSubject behaviorSubject = this.c;
        if (str != null || num != null || str2 != null) {
            behaviorSubject.onNext(new a48(str, str2, num));
            return;
        }
        for (qt7 qt7Var : this.b.c()) {
            if (qt7Var.getId() == i) {
                behaviorSubject.onNext(new a48(qt7Var.b().toString(), Build.VERSION.SDK_INT >= 28 ? qt7Var.a() : null, Integer.valueOf(qt7Var.getType())));
                return;
            }
        }
    }
}
