package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class tdr0 implements cer0 {
    public final Exception a;

    public tdr0(Exception exc) {
        this.a = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tdr0) && this.a.equals(((tdr0) obj).a);
    }

    public final String getId() {
        return "FindInShowFailed";
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
