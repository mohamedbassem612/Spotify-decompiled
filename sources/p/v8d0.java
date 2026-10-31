package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class v8d0 extends y8d0 {
    public final ewq a;

    public v8d0(ewq ewqVar) {
        this.a = ewqVar;
    }

    public final ewq b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || v8d0.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((v8d0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() + (v8d0.class.getName().hashCode() * 31);
    }

    public final String toString() {
        return "Failure {mOutputData=" + this.a + '}';
    }

    public v8d0() {
        this(ewq.b);
    }
}
