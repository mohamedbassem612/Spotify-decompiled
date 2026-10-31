package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class yrm {
    public final String a;

    public yrm(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yrm) && u890.j(this.a, ((yrm) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
