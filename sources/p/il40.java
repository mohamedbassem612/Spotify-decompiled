package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class il40 {
    public final String a;

    public il40(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof il40) && u890.j(this.a, ((il40) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
