package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class xxx0 implements yxx0 {
    public final String a;

    public xxx0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xxx0) && this.a.equals(((xxx0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
