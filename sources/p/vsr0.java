package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class vsr0 {
    public final String a;

    public vsr0(String str) {
        this.a = str;
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vsr0) && u890.j(this.a, ((vsr0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
