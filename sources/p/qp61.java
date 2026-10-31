package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class qp61 implements bq61 {
    public final String a;

    public qp61(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qp61) && this.a.equals(((qp61) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
