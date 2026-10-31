package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class jo90 extends rcr {
    public static final ArrayList i;
    public final v35 g;
    public final a9o h;

    static {
        t0z t0zVar = io90.c;
        ArrayList arrayList = new ArrayList(q7h.U(t0zVar, 10));
        d7 d7Var = new d7(t0zVar, (byte) 0);
        while (d7Var.hasNext()) {
            arrayList.add(((io90) d7Var.next()).a);
        }
        i = arrayList;
    }

    public jo90(k9r k9rVar, xfb0 xfb0Var, t8r0 t8r0Var, gw70 gw70Var, pcr pcrVar, v35 v35Var) {
        super(k9rVar, xfb0Var, t8r0Var, gw70Var, pcrVar);
        this.g = v35Var;
        this.h = a9o.e1;
    }

    @Override // p.rcr
    public final boolean a(hi hiVar) {
        if (!this.g.b()) {
            return false;
        }
        ArrayList<String> arrayList = i;
        if (arrayList != null && arrayList.isEmpty()) {
            return false;
        }
        for (String str : arrayList) {
            if (rcr.c(hiVar, "Jabra " + str, "Jabra", str)) {
                return super.a(hiVar);
            }
        }
        return false;
    }

    @Override // p.rcr
    public final iu30 b() {
        return this.h;
    }
}
