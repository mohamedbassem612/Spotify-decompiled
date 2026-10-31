package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class sx10 implements xx10 {
    public final String a;

    public sx10(String str) {
        this.a = str;
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sx10) && u890.j(this.a, ((sx10) obj).a);
    }

    public final String getEventId() {
        return "neutral_close_ad";
    }

    public final int hashCode() {
        return this.a.hashCode() - 1929865986;
    }
}
