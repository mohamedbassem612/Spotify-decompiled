package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class pi01 implements qi01 {
    public final String a;

    public pi01(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pi01) && u890.j(this.a, ((pi01) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
