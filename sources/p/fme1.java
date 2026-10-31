package p;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class fme1 implements oi31 {
    public final LinkedHashMap a;
    public final byte[] b;
    public final Map c;

    public fme1(oi31 oi31Var, LinkedHashMap linkedHashMap) {
        this.a = linkedHashMap;
        this.b = oi31Var.b();
        this.c = oi31Var.a();
    }

    @Override // p.oi31
    public final Map a() {
        return this.c;
    }

    @Override // p.oi31
    public final byte[] b() {
        return this.b;
    }

    @Override // p.oi31
    public final Map c() {
        return this.a;
    }
}
