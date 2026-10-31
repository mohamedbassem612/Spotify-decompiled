package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class lr3 {
    public final String a;

    public lr3(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lr3) && u890.j(this.a, ((lr3) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
