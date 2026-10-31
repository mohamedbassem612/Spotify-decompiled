package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class teb0 {
    public final String a;

    public teb0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof teb0) && u890.j(this.a, ((teb0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
