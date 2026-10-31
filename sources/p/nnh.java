package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class nnh implements snh {
    public final String a;

    public nnh(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nnh) && u890.j(this.a, ((nnh) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
