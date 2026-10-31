package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ljh0 implements njh0 {
    public final String a;

    public ljh0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ljh0) && u890.j(this.a, ((ljh0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
