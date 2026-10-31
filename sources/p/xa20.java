package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class xa20 {
    public final nfa0 a;
    public final nma0 b = m5n1.z(new r36(r8s0.Companion.serializer(), (byte) 0));

    public xa20(nfa0 nfa0Var) {
        this.a = nfa0Var;
    }

    public final List a(String str) {
        List list = (List) this.a.a(str, this.b);
        return list == null ? z6x.a : list;
    }
}
