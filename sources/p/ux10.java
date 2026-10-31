package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ux10 implements xx10 {
    public final String a;

    public ux10(String str) {
        this.a = str;
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ux10) && u890.j(this.a, ((ux10) obj).a);
    }

    public final String getEventId() {
        return "dsa_tapped";
    }

    public final int hashCode() {
        return this.a.hashCode() + 1158218087;
    }
}
