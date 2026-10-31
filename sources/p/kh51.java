package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class kh51 {
    public final String a;

    public kh51(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kh51) && u890.j(this.a, ((kh51) obj).a);
    }

    public final int hashCode() {
        String str = this.a;
        return (str == null ? 0 : str.hashCode()) * 31;
    }

    public /* synthetic */ kh51(String str, int i) {
        this(str);
    }
}
