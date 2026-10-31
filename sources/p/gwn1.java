package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class gwn1 implements bxn1 {
    public final short a;

    /* JADX WARN: Multi-variable type inference failed */
    public gwn1(int i) {
        this.a = i;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return bxn1.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bxn1)) {
            return false;
        }
        bxn1 bxn1Var = (bxn1) obj;
        return this.a == bxn1Var.zza() && wwn1.a.equals(bxn1Var.zzb());
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.a ^ 14552422) + (wwn1.a.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + ((int) this.a) + "intEncoding=" + wwn1.a + ')';
    }

    @Override // p.bxn1
    public final int zza() {
        return this.a;
    }

    @Override // p.bxn1
    public final wwn1 zzb() {
        return wwn1.a;
    }
}
