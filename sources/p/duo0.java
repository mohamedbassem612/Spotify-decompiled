package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class duo0 extends puo0 {
    public final String a;

    public duo0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof duo0) && u890.j(this.a, ((duo0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
