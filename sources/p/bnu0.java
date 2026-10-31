package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class bnu0 extends cnu0 {
    public final String a;

    public bnu0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bnu0) && u890.j(this.a, ((bnu0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
