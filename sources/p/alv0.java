package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class alv0 implements clv0 {
    public final String a;

    public alv0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof alv0) && u890.j(this.a, ((alv0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
