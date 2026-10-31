package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class av80 extends lm5 {
    public final String d;
    public final int e;

    public av80(String str, int i) {
        this.d = str;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof av80)) {
            return false;
        }
        av80 av80Var = (av80) obj;
        return this.d.equals(av80Var.d) && this.e == av80Var.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + (this.d.hashCode() * 31);
    }
}
