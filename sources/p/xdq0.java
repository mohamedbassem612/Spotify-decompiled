package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class xdq0 implements ceq0 {
    public final String a;

    public xdq0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xdq0) && u890.j(this.a, ((xdq0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
