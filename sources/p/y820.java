package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class y820 {
    public final String a;

    public y820(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y820) && u890.j(this.a, ((y820) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
