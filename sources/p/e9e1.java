package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class e9e1 {
    public final String a;

    public e9e1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e9e1) && u890.j(this.a, ((e9e1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
