package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class so20 {
    public final String a;

    public so20(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof so20) && u890.j(this.a, ((so20) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
