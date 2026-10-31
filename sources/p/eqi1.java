package p;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class eqi1 implements Comparable, Serializable {
    public static final eqi1 c = new eqi1(0, 0);
    public final long a;
    public final long b;

    public eqi1(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        fqi1 fqi1Var = new fqi1();
        fqi1Var.a = this.a;
        fqi1Var.b = this.b;
        return fqi1Var;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        eqi1 eqi1Var = (eqi1) obj;
        long j = eqi1Var.a;
        long j2 = this.a;
        if (j2 != j) {
            return Long.compare(j2 ^ Long.MIN_VALUE, j ^ Long.MIN_VALUE);
        }
        return Long.compare(this.b ^ Long.MIN_VALUE, eqi1Var.b ^ Long.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eqi1)) {
            return false;
        }
        eqi1 eqi1Var = (eqi1) obj;
        return this.a == eqi1Var.a && this.b == eqi1Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.a ^ this.b);
    }

    public final String toString() {
        byte[] bArr = new byte[36];
        fc11.y(this.a, bArr, 0, 0, 4);
        bArr[8] = 45;
        fc11.y(this.a, bArr, 9, 4, 6);
        bArr[13] = 45;
        fc11.y(this.a, bArr, 14, 6, 8);
        bArr[18] = 45;
        fc11.y(this.b, bArr, 19, 0, 2);
        bArr[23] = 45;
        fc11.y(this.b, bArr, 24, 2, 8);
        return nhc1.P(bArr);
    }
}
