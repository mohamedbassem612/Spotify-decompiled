package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class qbc implements pf5 {
    public final g6b0 a;
    public final kf30 b;
    public final Map c;
    public final znb0 d = dm5.S(2, new ka(this, (byte) 6));

    public qbc(g6b0 g6b0Var, kf30 kf30Var, Map map) {
        this.a = g6b0Var;
        this.b = kf30Var;
        this.c = map;
    }

    @Override // p.pf5
    public final Map a() {
        return this.c;
    }

    @Override // p.pf5
    public final kf30 b() {
        return this.b;
    }

    @Override // p.pf5
    public final mka1 getSource() {
        return mka1.m0;
    }

    @Override // p.pf5
    public final a8b0 getType() {
        return (a8b0) this.d.getValue();
    }
}
