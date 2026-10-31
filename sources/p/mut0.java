package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class mut0 {
    public final String a;
    public final String b;

    public mut0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mut0)) {
            return false;
        }
        mut0 mut0Var = (mut0) obj;
        return this.a.equals(mut0Var.a) && this.b.equals(mut0Var.b);
    }

    public final int hashCode() {
        return ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31) - 14090548;
    }
}
