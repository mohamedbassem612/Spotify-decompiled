package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class yek {
    public final String a;

    public yek(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yek) && u890.j(this.a, ((yek) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
