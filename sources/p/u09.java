package p;

import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class u09 extends fr00 {
    public final byte[] a;
    public final byte[] b;

    public u09(byte[] bArr, byte[] bArr2) {
        this.a = bArr;
        this.b = bArr2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof fr00) {
            fr00 fr00Var = (fr00) obj;
            boolean z = fr00Var instanceof u09;
            u09 u09Var = (u09) fr00Var;
            if (Arrays.equals(this.a, z ? u09Var.a : u09Var.a)) {
                u09 u09Var2 = (u09) fr00Var;
                if (Arrays.equals(this.b, z ? u09Var2.b : u09Var2.b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) ^ ((Arrays.hashCode(this.a) ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "ExperimentIds{clearBlob=" + Arrays.toString(this.a) + ", encryptedBlob=" + Arrays.toString(this.b) + "}";
    }
}
