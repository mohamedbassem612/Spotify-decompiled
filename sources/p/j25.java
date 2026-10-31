package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class j25 implements pdy0 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final boolean e;
    public final luk f;
    public final idd1 g = new idd1(new uz4(this, (byte) 29));

    public j25(int i, int i2, int i3, int i4, boolean z, luk lukVar) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = z;
        this.f = lukVar;
    }

    public final int a() {
        j25 j25Var = (j25) this.g.getValue();
        return j25Var != null ? j25Var.a() : this.a;
    }

    public final int b() {
        j25 j25Var = (j25) this.g.getValue();
        return j25Var != null ? j25Var.b() : this.b;
    }

    public final int c() {
        j25 j25Var = (j25) this.g.getValue();
        return j25Var != null ? j25Var.c() : this.c;
    }

    public final int d() {
        j25 j25Var = (j25) this.g.getValue();
        return j25Var != null ? j25Var.d() : this.d;
    }

    public final boolean e() {
        j25 j25Var = (j25) this.g.getValue();
        return j25Var != null ? j25Var.e() : this.e;
    }

    public final List models() {
        return p7h.M(new fpb[]{new fpb("read_ahead_batch_size_kbytes", "android-system-contentdelivery", a(), 0, 3072), new fpb("read_ahead_initial_kbytes", "android-system-contentdelivery", b(), 0, 3072), new fpb("read_ahead_minimum_capacity_kbytes", "android-system-contentdelivery", c(), 0, 3072), new fpb("segment_cache_max_size_bytes", "android-system-contentdelivery", d(), 0, 104857600), new fpb("use_waiting_transport_proxy", "android-system-contentdelivery", e())});
    }
}
