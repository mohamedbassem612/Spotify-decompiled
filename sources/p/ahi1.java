package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ahi1 implements chi1 {
    public final String a;

    public ahi1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ahi1) && u890.j(this.a, ((ahi1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
