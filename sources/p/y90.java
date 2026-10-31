package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class y90 extends ga0 {
    public final String d;

    public y90(String str) {
        super(2131951800, 1, amx.c);
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y90) && u890.j(this.d, ((y90) obj).d);
    }

    public final int hashCode() {
        return this.d.hashCode();
    }
}
