package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ip51 {
    public final byte[] a;
    public int b;
    public int c;
    public boolean d;
    public final boolean e;
    public ip51 f;
    public ip51 g;

    public ip51() {
        this.a = new byte[8192];
        this.e = true;
        this.d = false;
    }

    public final ip51 a() {
        ip51 ip51Var = this.f;
        if (ip51Var == this) {
            ip51Var = null;
        }
        ip51 ip51Var2 = this.g;
        ip51Var2.getClass();
        ip51Var2.f = this.f;
        ip51 ip51Var3 = this.f;
        ip51Var3.getClass();
        ip51Var3.g = this.g;
        this.f = null;
        this.g = null;
        return ip51Var;
    }

    public final void b(ip51 ip51Var) {
        ip51Var.g = this;
        ip51Var.f = this.f;
        ip51 ip51Var2 = this.f;
        ip51Var2.getClass();
        ip51Var2.g = ip51Var;
        this.f = ip51Var;
    }

    public final ip51 c() {
        this.d = true;
        return new ip51(this.a, this.b, this.c, true, false);
    }

    public final void d(ip51 ip51Var, int i) {
        byte[] bArr = ip51Var.a;
        if (!ip51Var.e) {
            eg.m("only owner can write");
            return;
        }
        int i2 = ip51Var.c;
        int i3 = i2 + i;
        if (i3 > 8192) {
            if (ip51Var.d) {
                bhn0.q();
                return;
            }
            int i4 = ip51Var.b;
            if (i3 - i4 > 8192) {
                bhn0.q();
                return;
            }
            f46.U(i4, i2, 2, bArr, bArr);
            i2 = ip51Var.c - ip51Var.b;
            ip51Var.c = i2;
            ip51Var.b = 0;
        }
        int i5 = this.b;
        f46.O(i2, i5, i5 + i, this.a, bArr);
        ip51Var.c += i;
        this.b += i;
    }

    public ip51(byte[] bArr, int i, int i2, boolean z, boolean z2) {
        this.a = bArr;
        this.b = i;
        this.c = i2;
        this.d = z;
        this.e = z2;
    }
}
