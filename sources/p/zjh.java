package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class zjh {
    public final String a;

    public zjh(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zjh) && u890.j(this.a, ((zjh) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
