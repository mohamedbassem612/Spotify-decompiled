package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class tx10 implements xx10 {
    public final String a;

    public tx10(String str) {
        this.a = str;
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tx10) && u890.j(this.a, ((tx10) obj).a);
    }

    public final String getEventId() {
        return "positive_interested";
    }

    public final int hashCode() {
        return this.a.hashCode() + 2121425553;
    }
}
