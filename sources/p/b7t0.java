package p;

import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class b7t0 implements wrw {
    public final vu30 a;
    public final t1t0 b;
    public final f4r c;

    public b7t0(cdk1 cdk1Var, vu30 vu30Var) {
        this.a = vu30Var;
        this.b = new t1t0(cdk1Var, (byte) 2);
        ArrayList arrayList = new ArrayList();
        this.c = arrayList.isEmpty() ? i13.j : arrayList.size() == 1 ? (f4r) o7h.q0(arrayList) : new mch(arrayList);
    }

    public final f4r b() {
        return this.c;
    }

    public final vu30 c() {
        return this.b;
    }

    public final vu30 d() {
        return this.a;
    }

    public final iu30 e() {
        return egs0.Z0;
    }

    public final s3r f() {
        return null;
    }

    public final ruh0 g() {
        return null;
    }

    public final Map getMetadata() {
        return b7x.a;
    }

    public final vu30 h() {
        return null;
    }
}
