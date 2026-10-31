package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class vvk1 implements yvk1 {
    public final String a;

    public vvk1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vvk1) && u890.j(this.a, ((vvk1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
