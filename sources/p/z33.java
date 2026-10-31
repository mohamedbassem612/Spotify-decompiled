package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class z33 implements b43 {
    public final String a;

    public z33(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z33) && u890.j(this.a, ((z33) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
