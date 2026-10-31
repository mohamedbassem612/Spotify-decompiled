package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class hw90 {
    public final String a;

    public hw90(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hw90) && u890.j(this.a, ((hw90) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
