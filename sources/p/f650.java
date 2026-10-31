package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class f650 implements h650 {
    public final String a;

    public f650(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f650) && this.a.equals(((f650) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
