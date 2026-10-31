package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class qnn implements snn {
    public final boolean a;
    public final imn b;
    public final boolean c;

    public qnn(boolean z, imn imnVar, boolean z2) {
        this.a = z;
        this.b = imnVar;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qnn)) {
            return false;
        }
        qnn qnnVar = (qnn) obj;
        return this.a == qnnVar.a && this.b == qnnVar.b && this.c == qnnVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31);
    }
}
