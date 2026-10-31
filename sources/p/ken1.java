package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ken1 implements ogn1 {
    public final byte a;

    /* JADX WARN: Multi-variable type inference failed */
    public ken1(int i) {
        this.a = i;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return ogn1.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ogn1)) {
            return false;
        }
        ogn1 ogn1Var = (ogn1) obj;
        return this.a == ogn1Var.zza() && fgn1.a.equals(ogn1Var.zzb());
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.a ^ 14552422) + (fgn1.a.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + ((int) this.a) + "intEncoding=" + fgn1.a + ')';
    }

    @Override // p.ogn1
    public final int zza() {
        return this.a;
    }

    @Override // p.ogn1
    public final fgn1 zzb() {
        return fgn1.a;
    }
}
