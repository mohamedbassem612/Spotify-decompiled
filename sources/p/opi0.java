package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class opi0 {
    public final String a;

    public opi0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof opi0) && u890.j(this.a, ((opi0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
