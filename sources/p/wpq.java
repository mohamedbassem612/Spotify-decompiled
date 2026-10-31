package p;

import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class wpq {
    public final c42 a;
    public final nxo b = new nxo(this, 0, (byte) 8);
    public final nxo c = new nxo(this, 2, (byte) 8);
    public final nxo d = new nxo(this, 3, (byte) 8);
    public final jly0 e = iy81.a(new nxo(this, 1, (byte) 8));
    public final jly0 f = xqu.b(new nxo(this, 4, (byte) 8));
    public final jly0 g = xqu.b(new nxo(this, 6, (byte) 8));
    public final jly0 h = xqu.b(new nxo(this, 5, (byte) 8));
    public final jly0 i = xqu.b(new nxo(this, 7, (byte) 8));
    public final nxo j = new nxo(this, 9, (byte) 8);
    public final jly0 k = xqu.b(new nxo(this, 8, (byte) 8));

    public wpq(c42 c42Var) {
        this.a = c42Var;
    }

    public final n15 a() {
        return new n15((luk) this.a.o.get());
    }

    public final zxa b() {
        Context context = (Context) this.b.get();
        jly0 jly0Var = this.e;
        return fva.g(new ajq0(context, yx61.g((xpq) jly0Var.get()), yx61.v((xpq) jly0Var.get()), yx61.u((xpq) jly0Var.get()), (iyu) ((kly0) this.a.r).get()));
    }

    public final zwa c() {
        c42 c42Var = this.a;
        return t4c0.i(new wp20((cxc) c42Var.g.get(), uge0.w(d()), (zwz0) c42Var.h.get(), (o3q0) c42Var.i.get(), uge0.u(d())));
    }

    public final n4b d() {
        c42 c42Var = this.a;
        return uge0.m(new yfu((zwz0) c42Var.h.get(), (t2j0) c42Var.j.get(), (byte) 26));
    }
}
