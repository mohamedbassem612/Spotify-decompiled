package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class qm40 extends rm40 {
    public final String a;

    public qm40(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qm40) && this.a.equals(((qm40) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
