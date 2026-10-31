package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class gw9 {
    public final bpb1 a = gio1.b(Boolean.FALSE);
    public int b;

    public final rih1 a(boolean z, a8d1 a8d1Var) {
        int i;
        int i2 = this.b;
        if (z) {
            i = i2 + 1;
            this.b = i;
        } else {
            i = i2 - 1;
            this.b = i;
        }
        if (i < 0) {
            this.b = 0;
            i = 0;
        }
        this.a.emit(yah0.m(i > 0), a8d1Var);
        return rih1.a;
    }
}
