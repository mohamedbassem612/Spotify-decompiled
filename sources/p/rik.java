package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class rik extends vik {
    public final String a;
    public final boolean b;

    public rik(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rik)) {
            return false;
        }
        rik rikVar = (rik) obj;
        return u890.j(this.a, rikVar.a) && this.b == rikVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
