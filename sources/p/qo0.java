package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class qo0 implements zo0 {
    public final String a;

    public qo0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qo0) && this.a.equals(((qo0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
