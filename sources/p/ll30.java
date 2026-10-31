package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ll30 {
    public final bpb1 a;
    public final xe01 b;
    public final bpb1 c;
    public final xe01 d;

    public ll30() {
        w7x w7xVar = w7x.a;
        bpb1 bpb1VarB = gio1.b(w7xVar);
        this.a = bpb1VarB;
        this.b = d5p1.h(bpb1VarB);
        bpb1 bpb1VarB2 = gio1.b(w7xVar);
        this.c = bpb1VarB2;
        this.d = d5p1.h(bpb1VarB2);
    }

    public final void a(String str) {
        bpb1 bpb1Var;
        Object value;
        do {
            bpb1Var = this.a;
            value = bpb1Var.getValue();
        } while (!bpb1Var.k(value, dm61.u0(str, (Set) value)));
    }

    public final void b(String str) {
        bpb1 bpb1Var;
        Object value;
        do {
            bpb1Var = this.a;
            value = bpb1Var.getValue();
        } while (!bpb1Var.k(value, dm61.x0(str, (Set) value)));
    }

    public final void c(String str) {
        bpb1 bpb1Var;
        Object value;
        do {
            bpb1Var = this.c;
            value = bpb1Var.getValue();
        } while (!bpb1Var.k(value, dm61.x0(str, (Set) value)));
    }
}
