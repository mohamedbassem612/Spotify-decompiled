package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ksh1 {
    public final String a;

    public ksh1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ksh1) && u890.j(this.a, ((ksh1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
