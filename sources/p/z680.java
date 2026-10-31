package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class z680 {
    public final bpb1 a;
    public final xe01 b;

    public z680() {
        bpb1 bpb1VarB = gio1.b(z6x.a);
        this.a = bpb1VarB;
        this.b = d5p1.h(bpb1VarB);
    }

    public final void a(r8e1 r8e1Var) {
        bpb1 bpb1Var;
        Object value;
        ArrayList arrayList;
        do {
            bpb1Var = this.a;
            value = bpb1Var.getValue();
            arrayList = new ArrayList();
            for (Object obj : (List) value) {
                r8e1 r8e1Var2 = (r8e1) obj;
                if (r8e1Var2.a >= r8e1Var.b || r8e1Var2.b <= r8e1Var.a) {
                    arrayList.add(obj);
                }
            }
        } while (!bpb1Var.k(value, o7h.O0(r8e1Var, arrayList)));
    }

    public final void b(r8e1 r8e1Var) {
        bpb1 bpb1Var;
        Object value;
        do {
            bpb1Var = this.a;
            value = bpb1Var.getValue();
        } while (!bpb1Var.k(value, o7h.J0((List) value, r8e1Var)));
    }
}
