package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class k68 {
    public final String a;

    public k68(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k68) && u890.j(this.a, ((k68) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
