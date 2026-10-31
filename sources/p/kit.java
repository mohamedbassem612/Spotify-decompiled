package p;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class kit extends c7 {
    public final nht N0;
    public final byp Y;
    public final wgy0 Z;

    /* JADX WARN: Illegal instructions before constructor call */
    public kit(byp bypVar, wgy0 wgy0Var, int i) {
        int i2;
        ks6 ks6Var = (ks6) bypVar.b;
        s1c1 s1c1Var = (s1c1) ks6Var.a;
        n9r n9rVar = (n9r) bypVar.a;
        eg5 eg5Var = rzs0.g;
        ajn0 ajn0VarY = dem1.y((zjn0) bypVar.c, wgy0Var.e);
        int iOrdinal = wgy0Var.g.ordinal();
        int i3 = 2;
        if (iOrdinal != 0) {
            i2 = 1;
            if (iOrdinal == 1) {
                i3 = 3;
                i2 = i3;
            } else if (iOrdinal != 2) {
                eg.o();
                throw null;
            }
        } else {
            i2 = i3;
        }
        super(i2, i, eg5Var, n9rVar, ajn0VarY, s1c1Var, wgy0Var.f);
        this.Y = bypVar;
        this.Z = wgy0Var;
        this.N0 = new nht((s1c1) ks6Var.a, new ka(this, (byte) 29));
    }

    public final fg5 getAnnotations() {
        return this.N0;
    }

    @Override // p.pa
    public final List y1() {
        byp bypVar = this.Y;
        List listK = p2o1.K(this.Z, (l141) bypVar.d);
        if (listK.isEmpty()) {
            return Collections.singletonList(kht.e(this).p());
        }
        List list = listK;
        mxa1 mxa1Var = (mxa1) bypVar.h;
        ArrayList arrayList = new ArrayList(q7h.U(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(mxa1Var.m((rgy0) it.next()));
        }
        return arrayList;
    }
}
