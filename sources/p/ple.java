package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ple {
    public final String a;
    public final String b;
    public final int c;

    public ple(int i, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ple)) {
            return false;
        }
        ple pleVar = (ple) obj;
        return u890.j(this.a, pleVar.a) && u890.j(this.b, pleVar.b) && this.c == pleVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
