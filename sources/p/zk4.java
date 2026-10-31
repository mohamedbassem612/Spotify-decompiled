package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class zk4 implements pdy0 {
    public final boolean a;
    public final int b;
    public final int c;
    public final luk d;
    public final idd1 e = new idd1(new gk4(this, (byte) 5));

    public zk4(boolean z, int i, int i2, luk lukVar) {
        this.a = z;
        this.b = i;
        this.c = i2;
        this.d = lukVar;
    }

    public final boolean a() {
        zk4 zk4Var = (zk4) this.e.getValue();
        return zk4Var != null ? zk4Var.a() : this.a;
    }

    public final int b() {
        zk4 zk4Var = (zk4) this.e.getValue();
        return zk4Var != null ? zk4Var.b() : this.b;
    }

    public final int c() {
        zk4 zk4Var = (zk4) this.e.getValue();
        return zk4Var != null ? zk4Var.c() : this.c;
    }

    @Override // p.pdy0
    public final List models() {
        return p7h.M(new fpb("clear_memory_cache_on_trim_enabled", "android-image-loader", a()), new fpb("image_load_instrumentation_sampling_percentage", "android-image-loader", b(), 0, 100), new fpb("memory_cache_percent_while_in_background", "android-image-loader", c(), 0, 100));
    }
}
