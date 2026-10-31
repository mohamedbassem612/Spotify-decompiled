package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class orb {
    public static final orb c = new orb(false, false);
    public final boolean a;
    public final boolean b;

    public orb(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof orb)) {
            return false;
        }
        orb orbVar = (orb) obj;
        return this.a == orbVar.a && this.b == orbVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }
}
