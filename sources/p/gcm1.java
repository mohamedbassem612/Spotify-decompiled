package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class gcm1 extends hon1 {
    public final String e;

    public gcm1(String str) {
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gcm1) && u890.j(this.e, ((gcm1) obj).e);
    }

    public final int hashCode() {
        String str = this.e;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
