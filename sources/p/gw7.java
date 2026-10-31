package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class gw7 {
    public final String a;

    public gw7(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gw7) && this.a.equals(((gw7) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
