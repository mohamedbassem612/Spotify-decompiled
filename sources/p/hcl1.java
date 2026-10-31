package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.subjects.BehaviorSubject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class hcl1 {
    public final BehaviorSubject a;
    public final dt71 b;
    public final bpb1 c;
    public final dt71 d;
    public final Observable e;
    public final ve01 f;
    public final xe01 g;
    public final ve01 h;
    public final Observable i;

    public hcl1() {
        BehaviorSubject behaviorSubjectG = BehaviorSubject.g(Boolean.TRUE);
        this.a = behaviorSubjectG;
        dt71 dt71VarE = mgo1.e(0, 1, 2, 1);
        this.b = dt71VarE;
        bpb1 bpb1VarB = gio1.b((Object) null);
        this.c = bpb1VarB;
        dt71 dt71VarE2 = mgo1.e(0, 1, 2, 1);
        this.d = dt71VarE2;
        this.e = behaviorSubjectG.distinctUntilChanged();
        this.f = d5p1.g(dt71VarE);
        this.g = d5p1.h(bpb1VarB);
        this.h = d5p1.g(dt71VarE2);
        this.i = yoi1.i(dt71VarE2, o6x.a);
    }

    public final void a(gcl1 gcl1Var) {
        this.d.a(gcl1Var);
    }
}
