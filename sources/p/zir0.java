package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class zir0 {
    public final bpb1 a = gio1.b(w7x.a);

    public final void a(n6r0 n6r0Var, boolean z) {
        bpb1 bpb1Var;
        Object value;
        Set setO1;
        do {
            bpb1Var = this.a;
            value = bpb1Var.getValue();
            setO1 = o7h.o1((Set) value);
            if (z) {
                setO1.add(n6r0Var);
            } else {
                if (z) {
                    eg.o();
                    return;
                }
                setO1.remove(n6r0Var);
            }
        } while (!bpb1Var.k(value, setO1));
    }
}
