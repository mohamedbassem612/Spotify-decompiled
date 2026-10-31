package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class veh implements afh {
    public final String a;

    public veh(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof veh) && this.a.equals(((veh) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
