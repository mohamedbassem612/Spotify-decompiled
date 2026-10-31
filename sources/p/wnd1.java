package p;

import android.os.Parcelable;
import io.reactivex.rxjava3.subjects.BehaviorSubject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class wnd1 {
    public final BehaviorSubject a = BehaviorSubject.f();
    public Parcelable b;
    public m551 c;

    public final Parcelable a() {
        return this.b;
    }

    public final BehaviorSubject b() {
        return this.a;
    }

    public final void c(m551 m551Var) {
        this.c = m551Var;
    }

    public final void d(Parcelable parcelable) {
        this.b = parcelable;
    }
}
