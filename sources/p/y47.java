package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class y47 {
    public final String a;

    public y47(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y47) && this.a.equals(((y47) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
