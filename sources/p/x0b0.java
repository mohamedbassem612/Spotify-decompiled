package p;

import io.reactivex.rxjava3.internal.operators.observable.ObservableFromPublisher;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class x0b0 implements xpw {
    public static final int d;
    public static final int e;
    public final js20 a;
    public final eih1 b = new eih1();
    public final psw c;

    static {
        uwr uwrVar = cbx.a;
        int iG = z4p1.G(((yex) zex.a.d).c);
        d = iG;
        e = q0o1.h(0.3f, q0o1.h(0.5f, iG));
    }

    public x0b0(ObservableFromPublisher observableFromPublisher, lfb lfbVar) {
        this.a = x3p1.m(rqt0.u(new zx60(yoi1.g(observableFromPublisher), (byte) 8)), jqa0.O0, ul90.T0, (o8n) null, new hu90(this, (byte) 21), 8);
        j2i j2iVar = qui.c;
        ien0 ien0Var = qsw.a;
        this.c = new psw(j2iVar, (byte) 0);
    }

    public final rqw a() {
        return this.b;
    }

    public final jsw c() {
        return this.c;
    }

    public final mqw getBehavior() {
        return this.a;
    }
}
