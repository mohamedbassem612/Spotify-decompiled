package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class akz0 implements bkz0 {
    public final String a;

    public akz0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof akz0) && u890.j(this.a, ((akz0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
