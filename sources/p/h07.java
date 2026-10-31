package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class h07 {
    public final String a;

    public h07(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h07) && u890.j(this.a, ((h07) obj).a);
    }

    public final int hashCode() {
        return Integer.hashCode(2131428270) + (this.a.hashCode() * 31);
    }
}
