package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class lac1 extends sio1 {
    public final int c;
    public final String d;

    public lac1(int i, String str) {
        this.c = i;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lac1)) {
            return false;
        }
        lac1 lac1Var = (lac1) obj;
        return this.c == lac1Var.c && this.d.equals(lac1Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + (Integer.hashCode(this.c) * 31);
    }
}
