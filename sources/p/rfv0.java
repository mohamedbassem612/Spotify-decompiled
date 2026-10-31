package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class rfv0 {
    public final int a;
    public int b;

    public rfv0(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public static rfv0 a(rfv0 rfv0Var, int i) {
        int i2 = rfv0Var.b;
        rfv0Var.getClass();
        return new rfv0(i, i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rfv0)) {
            return false;
        }
        rfv0 rfv0Var = (rfv0) obj;
        return this.a == rfv0Var.a && this.b == rfv0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }
}
