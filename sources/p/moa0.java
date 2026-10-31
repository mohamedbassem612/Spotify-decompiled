package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class moa0 implements qoa0 {
    public final String a;

    public moa0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof moa0) && u890.j(this.a, ((moa0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
