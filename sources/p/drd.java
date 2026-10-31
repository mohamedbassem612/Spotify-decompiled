package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.subjects.BehaviorSubject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class drd implements crd {
    public final BehaviorSubject a;
    public final Observable b;
    public final Observable c;

    public drd() {
        BehaviorSubject behaviorSubjectG = BehaviorSubject.g(oqn1.n(Boolean.FALSE, "default"));
        this.a = behaviorSubjectG;
        Observable observableDistinctUntilChanged = behaviorSubjectG.distinctUntilChanged();
        this.b = observableDistinctUntilChanged;
        this.c = observableDistinctUntilChanged.map(wdu0.h).distinctUntilChanged();
    }

    public final boolean a() {
        mmr0 mmr0Var = (mmr0) this.a.h();
        if (mmr0Var != null) {
            return ((Boolean) mmr0Var.a).booleanValue();
        }
        return false;
    }
}
