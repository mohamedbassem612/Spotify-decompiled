package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class l560 extends m560 {
    public final String a;

    public l560(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l560) && u890.j(this.a, ((l560) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
