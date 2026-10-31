package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class a43 implements b43 {
    public final String a;

    public a43(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a43) && u890.j(this.a, ((a43) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
