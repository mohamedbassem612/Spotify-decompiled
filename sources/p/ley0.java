package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ley0 {
    public final String a;

    public ley0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ley0) && u890.j(this.a, ((ley0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
