package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class vdq0 implements ceq0 {
    public final String a;

    public vdq0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vdq0) && u890.j(this.a, ((vdq0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
