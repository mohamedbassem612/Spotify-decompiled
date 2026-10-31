package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class qvo1 {
    public final String a;
    public final long b;
    public final int c;

    public qvo1(long j, int i, String str) {
        this.a = str;
        this.b = j;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof qvo1)) {
            return false;
        }
        qvo1 qvo1Var = (qvo1) obj;
        return qvo1Var.a.equals(this.a) && qvo1Var.b == this.b && qvo1Var.c == this.c;
    }
}
