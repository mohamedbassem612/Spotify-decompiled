package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class sd81 {
    public final String a;
    public final String b;

    public sd81(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sd81)) {
            return false;
        }
        sd81 sd81Var = (sd81) obj;
        return this.a.equals(sd81Var.a) && this.b.equals(sd81Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
