package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class fa8 implements ga8 {
    public final String a;

    public fa8(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fa8) && u890.j(this.a, ((fa8) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
