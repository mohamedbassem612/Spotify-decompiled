package p;

import io.reactivex.rxjava3.subjects.ReplaySubject;
import io.reactivex.rxjava3.subjects.Subject;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class vz21 {
    public final WeakReference a;
    public final ReplaySubject b;

    public vz21(WeakReference weakReference, ReplaySubject replaySubject) {
        this.a = weakReference;
        this.b = replaySubject;
    }

    public final Subject a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof vz21) {
            vz21 vz21Var = (vz21) obj;
            return this.a.equals(vz21Var.a) && this.b == vz21Var.b;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
