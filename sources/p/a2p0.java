package p;

import io.reactivex.rxjava3.internal.operators.observable.ObservableFromPublisher;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class a2p0 implements xpw {
    public static final int h;
    public final vu60 a;
    public final ObservableFromPublisher b;
    public final j2i c;
    public final i3b d;
    public final js20 e = x3p1.n(new z1p0(this, 0), pzo0.e, ofo0.O0, (o8n) null, new z1p0(this, 1), 8);
    public final eih1 f = new eih1();
    public final psw g;

    static {
        uwr uwrVar = cbx.a;
        h = z4p1.G(((yex) zex.a.d).d);
    }

    public a2p0(vu60 vu60Var, ObservableFromPublisher observableFromPublisher, j2i j2iVar, i3b i3bVar) {
        this.a = vu60Var;
        this.b = observableFromPublisher;
        this.c = j2iVar;
        this.d = i3bVar;
        j2i j2iVar2 = new j2i(-273120473, new aso0(this, (byte) 2), true);
        ien0 ien0Var = qsw.a;
        this.g = new psw(j2iVar2, (byte) 0);
    }

    public final rqw a() {
        return this.f;
    }

    public final jsw c() {
        return this.g;
    }

    public final mqw getBehavior() {
        return this.e;
    }
}
