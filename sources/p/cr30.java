package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class cr30 implements fr30 {
    public final String a;

    public cr30(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cr30) && this.a.equals(((cr30) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
