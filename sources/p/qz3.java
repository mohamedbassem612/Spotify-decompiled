package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class qz3 {
    public volatile rz3 a;
    public volatile n4c b;
    public final ArrayList c;

    public qz3(aqq0 aqq0Var) {
        h6u h6uVar = new h6u();
        c9c c9cVar = new c9c((byte) 28);
        this.b = h6uVar;
        this.c = new ArrayList();
        this.a = c9cVar;
        aqq0Var.a(new pz3(this));
    }

    public final pz3 a() {
        return new pz3(this);
    }

    public final pz3 b() {
        return new pz3(this);
    }
}
