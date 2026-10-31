package p;

import io.reactivex.rxjava3.subjects.PublishSubject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class q7m0 {
    public final String a;
    public final j1l1 b;
    public final PublishSubject c;
    public final PublishSubject d;
    public final p7b1 e;
    public final ndu0 f;
    public final yp41 g;
    public final gn5 h;
    public final pe i;
    public final w2l1 j;

    public q7m0(String str, j1l1 j1l1Var, PublishSubject publishSubject, PublishSubject publishSubject2, p7b1 p7b1Var, ndu0 ndu0Var, yp41 yp41Var, gn5 gn5Var, pe peVar, w2l1 w2l1Var) {
        this.a = str;
        this.b = j1l1Var;
        this.c = publishSubject;
        this.d = publishSubject2;
        this.e = p7b1Var;
        this.f = ndu0Var;
        this.g = yp41Var;
        this.h = gn5Var;
        this.i = peVar;
        this.j = w2l1Var;
        w2l1Var.a.add(str);
    }
}
