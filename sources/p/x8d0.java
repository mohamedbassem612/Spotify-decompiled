package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class x8d0 extends y8d0 {
    public final ewq a;

    public x8d0(ewq ewqVar) {
        this.a = ewqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || x8d0.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((x8d0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() + (x8d0.class.getName().hashCode() * 31);
    }

    public final String toString() {
        return "Success {mOutputData=" + this.a + '}';
    }
}
