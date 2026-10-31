package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class tar0 {
    public final bjr0 a;
    public final yqg b;
    public final boolean c;
    public final boolean d;
    public int e;
    public nar0 f;
    public y6r0 g;
    public n6r0 h;
    public u8h1 i;
    public boolean j;
    public y6r0 k;
    public uhs0 m;
    public ps7 n;
    public nsn0 o;
    public llm q;
    public faa0 r;
    public sar0 l = fkj0.d1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ArrayList f84p = new ArrayList();
    public final bpb1 s = gio1.b((Object) null);

    public tar0(vgq0 vgq0Var, bjr0 bjr0Var, yqg yqgVar, boolean z) {
        this.a = bjr0Var;
        this.b = yqgVar;
        this.c = z;
        this.d = vgq0Var.b();
    }

    public final var0 a() {
        nar0 nar0Var;
        if (this.d && this.c && (nar0Var = this.f) != null) {
            return new var0(new oar0(this.e), nar0Var.a, nar0Var.b);
        }
        return null;
    }
}
