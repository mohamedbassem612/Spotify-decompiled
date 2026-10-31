package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class yv30 {
    public final kf30 a;
    public final String b;
    public final int c;

    public yv30(kf30 kf30Var, String str, int i) {
        this.a = kf30Var;
        this.b = str;
        this.c = i;
    }

    public final ajn0 a(int i) {
        return ajn0.e(this.b + i);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append('.');
        return gvg.k(sb, this.b, 'N');
    }
}
