package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class t74 implements pdy0 {
    public final boolean a;
    public final int b;
    public final int c;
    public final int d;
    public final luk e;
    public final idd1 f = new idd1(new m44(this, (byte) 29));

    public t74(boolean z, int i, int i2, int i3, luk lukVar) {
        this.a = z;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = lukVar;
    }

    public final boolean a() {
        t74 t74Var = (t74) this.f.getValue();
        return t74Var != null ? t74Var.a() : this.a;
    }

    public final int b() {
        t74 t74Var = (t74) this.f.getValue();
        return t74Var != null ? t74Var.b() : this.b;
    }

    public final int c() {
        t74 t74Var = (t74) this.f.getValue();
        return t74Var != null ? t74Var.c() : this.c;
    }

    public final int d() {
        t74 t74Var = (t74) this.f.getValue();
        return t74Var != null ? t74Var.d() : this.d;
    }

    @Override // p.pdy0
    public final List models() {
        return p7h.M(new fpb("ble_connect_device_reader_enabled", "android-ble-connect-device-reader", a()), new fpb("ble_connect_device_reader_eviction_interval_millis", "android-ble-connect-device-reader", b(), 0, 600000), new fpb("ble_connect_device_reader_inactivity_timeout_millis", "android-ble-connect-device-reader", c(), 0, 600000), new fpb("ble_connect_device_reader_max_attempts", "android-ble-connect-device-reader", d(), 0, 100000));
    }
}
