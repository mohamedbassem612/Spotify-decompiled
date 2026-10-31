package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class oen implements ugn {
    public final String a;

    public oen(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oen) && this.a.equals(((oen) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
