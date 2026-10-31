package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class gvk {
    public final String a;

    public gvk(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gvk) && u890.j(this.a, ((gvk) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
