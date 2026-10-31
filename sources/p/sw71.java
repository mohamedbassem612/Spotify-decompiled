package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class sw71 implements uw71 {
    public final String a;

    public sw71(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sw71) && u890.j(this.a, ((sw71) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
