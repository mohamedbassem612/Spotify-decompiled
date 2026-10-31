package p;

import com.spotify.betamax.player.VideoSurfaceView;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.subjects.BehaviorSubject;
import java.util.Locale;
import java.util.Optional;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class dw7 implements c0u0, d0u0 {
    public final BehaviorSubject a;
    public final BehaviorSubject b;
    public final BehaviorSubject c;
    public final Observable d;
    public final BehaviorSubject e;
    public final Observable f;

    public dw7() {
        BehaviorSubject behaviorSubjectG = BehaviorSubject.g(Optional.empty());
        this.a = behaviorSubjectG;
        this.b = behaviorSubjectG;
        BehaviorSubject behaviorSubjectG2 = BehaviorSubject.g(Optional.empty());
        this.c = behaviorSubjectG2;
        this.d = behaviorSubjectG2.distinctUntilChanged();
        BehaviorSubject behaviorSubjectG3 = BehaviorSubject.g(z6x.a);
        this.e = behaviorSubjectG3;
        this.f = behaviorSubjectG3.distinctUntilChanged();
    }

    @Override // p.c0u0
    public final void B(boolean z, boolean z2, float f, VideoSurfaceView videoSurfaceView, long j) {
        this.c.onNext(Optional.empty());
        this.e.onNext(z6x.a);
    }

    @Override // p.c0u0
    public final void N(ev7 ev7Var, long j, long j2) {
        Locale m231Var;
        String strA = ev7Var.a();
        Locale locale = null;
        if (strA != null) {
            try {
                m231Var = Locale.forLanguageTag(strA);
            } catch (Throwable th) {
                m231Var = new m231(th);
            }
            locale = m231Var instanceof m231 ? null : m231Var;
        }
        BehaviorSubject behaviorSubject = this.c;
        if (locale == null) {
            behaviorSubject.onNext(Optional.empty());
        } else {
            behaviorSubject.onNext(Optional.of(locale));
        }
    }

    @Override // p.d0u0
    public final c0u0 a(m0u0 m0u0Var, oot0 oot0Var, np00 np00Var, String str) {
        if (c2p1.t(m0u0Var)) {
            return null;
        }
        return this;
    }

    @Override // p.c0u0
    public final void v(yhg0 yhg0Var, long j) {
        this.e.onNext(yhg0Var.a());
        this.a.onNext(Optional.empty());
    }
}
