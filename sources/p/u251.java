package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class u251 {
    public final String a;

    public u251(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u251) && u890.j(this.a, ((u251) obj).a);
    }

    public final int hashCode() {
        return Integer.hashCode(2131961504) + (this.a.hashCode() * 31);
    }
}
