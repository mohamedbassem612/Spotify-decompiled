package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class re51 extends te51 {
    public final String a;

    public re51(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof re51) && u890.j(this.a, ((re51) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
