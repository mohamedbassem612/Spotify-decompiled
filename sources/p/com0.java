package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class com0 implements dom0 {
    public final String a;
    public final String b;
    public final int c;

    public com0(int i, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com0)) {
            return false;
        }
        com0 com0Var = (com0) obj;
        return this.a.equals(com0Var.a) && this.b.equals(com0Var.b) && this.c == com0Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
