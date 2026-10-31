package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class kcj0 implements qcj0 {
    public final String a;

    public kcj0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kcj0) && u890.j(this.a, ((kcj0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
