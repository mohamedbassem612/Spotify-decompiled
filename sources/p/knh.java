package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class knh implements snh {
    public final String a;
    public final boolean b;

    public knh(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof knh)) {
            return false;
        }
        knh knhVar = (knh) obj;
        return u890.j(this.a, knhVar.a) && this.b == knhVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
