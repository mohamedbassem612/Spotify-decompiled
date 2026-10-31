package p;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class mfe extends age {
    public static final /* synthetic */ AtomicIntegerFieldUpdater f = AtomicIntegerFieldUpdater.newUpdater(mfe.class, "consumed$volatile");
    private volatile /* synthetic */ int consumed$volatile;
    public final jfe d;
    public final boolean e;

    public /* synthetic */ mfe(jfe jfeVar, boolean z) {
        this(jfeVar, z, o6x.a, -3, 1);
    }

    @Override // p.age, p.mr20
    public final Object collect(vr20 vr20Var, lnm lnmVar) {
        int i = this.b;
        d9n d9nVar = d9n.a;
        if (i == -3) {
            boolean z = this.e;
            if (z && f.getAndSet(this, 1) == 1) {
                eg.m("ReceiveChannel.consumeAsFlow can be collected just once");
                return null;
            }
            Object objH = k4p1.h(vr20Var, this.d, z, lnmVar);
            if (objH == d9nVar) {
                return objH;
            }
        } else {
            Object objCollect = super.collect(vr20Var, lnmVar);
            if (objCollect == d9nVar) {
                return objCollect;
            }
        }
        return rih1.a;
    }

    @Override // p.age
    public final String f() {
        return "channel=" + this.d;
    }

    @Override // p.age
    public final Object g(ssw0 ssw0Var, lnm lnmVar) {
        Object objH = k4p1.h(new d561(ssw0Var), this.d, this.e, lnmVar);
        return objH == d9n.a ? objH : rih1.a;
    }

    @Override // p.age
    public final age h(o8n o8nVar, int i, int i2) {
        return new mfe(this.d, this.e, o8nVar, i, i2);
    }

    @Override // p.age
    public final mr20 i() {
        return new mfe(this.d, this.e);
    }

    @Override // p.age
    public final jfe j(c9n c9nVar) {
        if (!this.e || f.getAndSet(this, 1) != 1) {
            return this.b == -3 ? this.d : super.j(c9nVar);
        }
        eg.m("ReceiveChannel.consumeAsFlow can be collected just once");
        return null;
    }

    public mfe(jfe jfeVar, boolean z, o8n o8nVar, int i, int i2) {
        super(o8nVar, i, i2);
        this.d = jfeVar;
        this.e = z;
    }
}
