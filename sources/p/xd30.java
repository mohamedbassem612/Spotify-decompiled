package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class xd30 implements Comparable {
    public final int a;
    public final int b;
    public final String c;
    public final String d;

    public xd30(int i, String str, int i2, String str2) {
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = str2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        xd30 xd30Var = (xd30) obj;
        int i = this.a - xd30Var.a;
        return i == 0 ? this.b - xd30Var.b : i;
    }
}
