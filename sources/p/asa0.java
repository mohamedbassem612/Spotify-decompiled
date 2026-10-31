package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class asa0 implements lsa0 {
    public final String a;

    public asa0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof asa0) && this.a.equals(((asa0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
