package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class yu10 implements rv10 {
    public final String a;

    public yu10(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yu10) && u890.j(this.a, ((yu10) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
