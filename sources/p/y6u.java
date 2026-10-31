package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class y6u {
    public final String a;
    public final String b;

    public y6u(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y6u)) {
            return false;
        }
        y6u y6uVar = (y6u) obj;
        return this.a.equals(y6uVar.a) && this.b.equals(y6uVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
