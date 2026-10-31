package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class fmi1 implements xmi1 {
    public final String a;

    public fmi1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fmi1) && u890.j(this.a, ((fmi1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
