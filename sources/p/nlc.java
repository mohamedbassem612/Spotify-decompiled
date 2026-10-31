package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class nlc extends plc {
    public final String a;

    public nlc(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nlc) && u890.j(this.a, ((nlc) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
