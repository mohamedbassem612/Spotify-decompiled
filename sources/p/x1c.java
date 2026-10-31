package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class x1c {
    public long a;
    public long b;

    public x1c(byte b) {
        switch (b) {
            case 4:
                this.a = -9223372036854775807L;
                this.b = -9223372036854775807L;
                break;
            default:
                this.a = zoi1.W(20L);
                this.b = zoi1.W(500L);
                break;
        }
    }

    public a6s a() {
        return new a6s(this.a, this.b);
    }

    public long b(yqg yqgVar) {
        return this.a - (yqgVar.b() - this.b);
    }

    public /* synthetic */ x1c(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public x1c(int i, long j, long j2) {
        this.a = j;
        this.b = j2;
    }
}
