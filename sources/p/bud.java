package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class bud implements iud {
    public final String a;

    public bud(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bud) && this.a.equals(((bud) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
