package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class lfn implements ugn {
    public final String a;

    public lfn(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lfn) && u890.j(this.a, ((lfn) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
