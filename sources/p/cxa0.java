package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class cxa0 implements exa0 {
    public final String a;

    public cxa0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cxa0) && this.a.equals(((cxa0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
