package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class qhf0 implements yhf0 {
    public final String a;

    public qhf0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qhf0) && this.a.equals(((qhf0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
