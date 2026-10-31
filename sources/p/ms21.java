package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ms21 {
    public final String a;

    public ms21(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ms21) && u890.j(this.a, ((ms21) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
