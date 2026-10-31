package p;

import io.reactivex.rxjava3.core.Observable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class far0 implements dar0 {
    public final bpb1 a;
    public final Observable b;

    public far0() {
        bpb1 bpb1VarB = gio1.b(0);
        this.a = bpb1VarB;
        this.b = yoi1.i(rqt0.u(new mt(bpb1VarB, (byte) 21)), o6x.a);
    }

    @Override // p.dar0
    public final Observable a() {
        return this.b;
    }

    public final void b(int i) {
        bpb1 bpb1Var;
        Object value;
        do {
            bpb1Var = this.a;
            value = bpb1Var.getValue();
        } while (!bpb1Var.k(value, Integer.valueOf(((Number) value).intValue() + i)));
    }
}
