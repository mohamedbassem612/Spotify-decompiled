package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class c960 {
    public final String a;

    public c960(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c960) && u890.j(this.a, ((c960) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
