package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class e3f1 extends upf {
    public final String d;

    public e3f1(String str) {
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e3f1) && u890.j(this.d, ((e3f1) obj).d);
    }

    public final int hashCode() {
        return this.d.hashCode();
    }
}
