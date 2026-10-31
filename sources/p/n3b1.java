package p;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class n3b1 extends pba {
    public final zvw0 e;
    public final ua91 f;
    public final long g;
    public final boolean h;
    public final boolean i;

    public n3b1(zvw0 zvw0Var, ua91 ua91Var, int i, int i2, long j, boolean z, boolean z2) {
        super(i, i2);
        this.e = zvw0Var;
        this.f = ua91Var;
        this.g = j;
        this.h = z;
        this.i = z2;
    }

    @Override // p.vjh0
    public final long a() {
        return this.d * this.e.g;
    }

    @Override // p.vjh0
    public final long b() {
        long j = this.d;
        zvw0 zvw0Var = this.e;
        return zvw0Var.c(j) + (zvw0Var.g * j);
    }

    @Override // p.vjh0
    public final n3r c() {
        mmr0 mmr0Var;
        long j = this.d;
        zvw0 zvw0Var = this.e;
        vqz0 vqz0VarE = zvw0Var.e(j);
        List list = zvw0Var.c;
        ua91 ua91Var = this.f;
        ua91Var.e = list;
        String str = (String) ua91Var.C(list).a;
        Uri uriQ = pno1.q(str, vqz0VarE.b);
        boolean z = this.h;
        boolean z2 = this.i;
        if (z) {
            uriQ.getClass();
            mmr0Var = new mmr0(list, g9p1.r(uriQ, str, z2));
        } else {
            List list2 = (List) zvw0Var.j.getValue();
            uriQ.getClass();
            mmr0Var = new mmr0(list2, g9p1.s(uriQ, z2));
        }
        List list3 = (List) mmr0Var.a;
        String str2 = (String) mmr0Var.b;
        Map map = Collections.EMPTY_MAP;
        np51 np51Var = new np51(list3, str2, this.g, -1, (String) null, false, -9223372036854775807L, -9223372036854775807L);
        dm5.s(uriQ, "The uri must be set.");
        return new n3r(uriQ, 0L, 1, null, map, 0L, -1L, null, 0, np51Var);
    }
}
