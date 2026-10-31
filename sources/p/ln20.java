package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ln20 {
    public boolean c;
    public int e;
    public long h;
    public final jn20 i;
    public kn20 a = new kn20();
    public kn20 b = new kn20();
    public long d = -9223372036854775807L;
    public float f = -1.0f;
    public float g = -1.0f;

    public ln20(jn20 jn20Var) {
        this.i = jn20Var;
    }

    public final long a() {
        if (!this.a.a()) {
            return -9223372036854775807L;
        }
        kn20 kn20Var = this.a;
        long j = kn20Var.e;
        if (j == 0) {
            return 0L;
        }
        return kn20Var.f / j;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0046  */
    public final void b(long j) {
        if (j == this.d) {
            return;
        }
        this.h++;
        this.a.b(j);
        if (this.a.a()) {
            this.c = false;
        } else if (this.d != -9223372036854775807L) {
            if (this.c) {
                kn20 kn20Var = this.b;
                long j2 = kn20Var.d;
                if (j2 == 0 ? false : kn20Var.g[(int) ((j2 - 1) % 15)]) {
                    this.b.c();
                    this.b.b(this.d);
                }
            } else {
                this.b.c();
                this.b.b(this.d);
            }
            this.c = true;
            this.b.b(j);
        }
        if (this.c && this.b.a()) {
            kn20 kn20Var2 = this.a;
            this.a = this.b;
            this.b = kn20Var2;
            this.c = false;
        }
        this.d = j;
        this.e = this.a.a() ? 0 : this.e + 1;
        c();
    }

    public final void c() {
        float f;
        boolean zA = this.a.a();
        if (zA) {
            kn20 kn20Var = this.a;
            long j = kn20Var.e;
            f = (float) (1.0E9d / (j != 0 ? kn20Var.f / j : 0L));
        } else {
            f = this.f;
        }
        float f2 = this.g;
        if (f == f2) {
            return;
        }
        if (f != -1.0f && f2 != -1.0f) {
            if (Math.abs(f - f2) < ((!zA || this.a.f < 5000000000L) ? 1.0f : 0.1f)) {
                return;
            }
        } else if (f == -1.0f && this.e < 30) {
            return;
        }
        this.g = f;
        this.i.g(f);
    }
}
