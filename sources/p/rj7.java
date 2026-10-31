package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class rj7 implements niy0 {
    public final byte a;

    /* JADX WARN: Multi-variable type inference failed */
    public rj7(int i) {
        this.a = i;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return niy0.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof niy0)) {
            return false;
        }
        niy0 niy0Var = (niy0) obj;
        return this.a == niy0Var.tag() && kiy0.a.equals(niy0Var.intEncoding());
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.a ^ 14552422) + (kiy0.a.hashCode() ^ 2041407134);
    }

    @Override // p.niy0
    public final kiy0 intEncoding() {
        return kiy0.a;
    }

    @Override // p.niy0
    public final int tag() {
        return this.a;
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + ((int) this.a) + "intEncoding=" + kiy0.a + ')';
    }
}
