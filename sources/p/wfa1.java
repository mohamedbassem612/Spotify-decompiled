package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class wfa1 extends rcr {
    public static final ArrayList i;
    public static final ArrayList j;
    public static final ArrayList k;
    public static final ArrayList l;
    public final v35 g;
    public final dw81 h;

    static {
        new l7c((byte) 25);
        t0z t0zVar = tfa1.c;
        ArrayList arrayList = new ArrayList(q7h.U(t0zVar, 10));
        d7 d7Var = new d7(t0zVar, (byte) 0);
        while (d7Var.hasNext()) {
            arrayList.add(((tfa1) d7Var.next()).a);
        }
        i = arrayList;
        t0z t0zVar2 = ufa1.c;
        ArrayList arrayList2 = new ArrayList(q7h.U(t0zVar2, 10));
        d7 d7Var2 = new d7(t0zVar2, (byte) 0);
        while (d7Var2.hasNext()) {
            arrayList2.add(((ufa1) d7Var2.next()).a);
        }
        j = arrayList2;
        t0z t0zVar3 = vfa1.c;
        ArrayList arrayList3 = new ArrayList(q7h.U(t0zVar3, 10));
        d7 d7Var3 = new d7(t0zVar3, (byte) 0);
        while (d7Var3.hasNext()) {
            arrayList3.add(((vfa1) d7Var3.next()).a);
        }
        k = arrayList3;
        l = o7h.N0(arrayList3, o7h.N0(j, i));
    }

    public wfa1(k9r k9rVar, xfb0 xfb0Var, t8r0 t8r0Var, gw70 gw70Var, pcr pcrVar, v35 v35Var) {
        super(k9rVar, xfb0Var, t8r0Var, gw70Var, pcrVar);
        this.g = v35Var;
        this.h = dw81.h;
    }

    @Override // p.rcr
    public final boolean a(hi hiVar) {
        if (!this.g.d()) {
            return false;
        }
        ArrayList<String> arrayList = l;
        if (arrayList != null && arrayList.isEmpty()) {
            return false;
        }
        for (String str : arrayList) {
            if (rcr.c(hiVar, str, "Sony", str)) {
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
