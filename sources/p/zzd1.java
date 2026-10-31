package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class zzd1 {
    public final byte a;

    public final boolean equals(Object obj) {
        if (obj instanceof zzd1) {
            return this.a == ((zzd1) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        byte b = this.a;
        if (b == 1) {
            return "Left";
        }
        if (b == 2) {
            return "Right";
        }
        if (b == 3) {
            return "Center";
        }
        if (b == 4) {
            return "Start";
        }
        return b == 5 ? "End" : "Invalid";
    }
}
