package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class gga0 {
    public final xrw a;
    public boolean b;

    public gga0(h661 h661Var) {
        this.a = new xrw(h661Var, new t590(2, this, gga0.class, "readIfAbsent", "readIfAbsent(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z", 0, (byte) 1));
    }

    public static final boolean a(gga0 gga0Var, h661 h661Var, int i) {
        gga0Var.getClass();
        boolean z = !h661Var.i(i) && h661Var.g(i).b();
        gga0Var.b = z;
        return z;
    }

    public final boolean b() {
        return this.b;
    }

    public final void c(int i) {
        this.a.a(i);
    }

    public final int d() {
        return this.a.b();
    }
}
