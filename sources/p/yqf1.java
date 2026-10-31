package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class yqf1 implements brf1 {
    public final int a;
    public final String b;

    public yqf1(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yqf1)) {
            return false;
        }
        yqf1 yqf1Var = (yqf1) obj;
        return this.a == yqf1Var.a && u890.j(this.b, yqf1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }
}
