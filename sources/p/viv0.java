package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class viv0 {
    public final String a;

    public viv0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof viv0) && u890.j(this.a, ((viv0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
