package p;

import com.google.protobuf.Empty;
import io.reactivex.rxjava3.subjects.BehaviorSubject;
import java.util.Optional;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class h2n0 implements f961 {
    public final jlg a;
    public final Optional b;

    public h2n0(jlg jlgVar, Optional optional) {
        this.a = jlgVar;
        this.b = optional;
        if (((BehaviorSubject) optional.orElse(null)) == null) {
            BehaviorSubject.g(Boolean.TRUE);
        }
        jlgVar.c.b(jlgVar.a.a.n(Empty.n()).map(q9w.Q0).subscribe(new mba(jlgVar, (byte) 23)));
        jlgVar.e.set(false);
        BehaviorSubject behaviorSubject = (BehaviorSubject) optional.orElse(null);
        if (behaviorSubject != null) {
            behaviorSubject.onNext(Boolean.TRUE);
        }
    }

    public final void shutdown() {
        BehaviorSubject behaviorSubject = (BehaviorSubject) this.b.orElse(null);
        if (behaviorSubject != null) {
            behaviorSubject.onNext(Boolean.FALSE);
        }
        jlg jlgVar = this.a;
        jlgVar.e.set(true);
        jlgVar.d.onNext(sih1.a);
        jlgVar.c.a();
    }

    public final Object getApi() {
        return this;
    }
}
