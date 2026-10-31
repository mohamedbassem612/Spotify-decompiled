package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class aq61 implements bq61 {
    public final String a;

    public aq61(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aq61) && this.a.equals(((aq61) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
