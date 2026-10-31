package p;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class oos {
    public final ynb0 a;
    public final Map b = sqg0.J(new mmr0[]{new mmr0(x081.b, 0), new mmr0(x081.a, 1)});

    public oos(ynb0 ynb0Var) {
        this.a = ynb0Var;
    }

    public final mr20 a(fd0 fd0Var) {
        List<xz71> listA1 = o7h.a1((Iterable) this.a.get(), new xvd(this, (byte) 11));
        ArrayList arrayList = new ArrayList(q7h.U(listA1, 10));
        for (xz71 xz71Var : listA1) {
            arrayList.add(new qer(new ht20(xz71Var.a(fd0Var), new qjr(2, (lnm) null, (byte) 13)), xz71Var, (byte) 28));
        }
        return arrayList.isEmpty() ? new huz(z6x.a, (byte) 10) : new wa3((mr20[]) o7h.l1(arrayList).toArray(new mr20[0]), (byte) 11);
    }
}
