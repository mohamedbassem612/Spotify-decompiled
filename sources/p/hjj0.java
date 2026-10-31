package p;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class hjj0 {
    public final rij0[] a;
    public final long b;

    public hjj0(List list) {
        this((rij0[]) list.toArray(new rij0[0]));
    }

    public final hjj0 a(rij0... rij0VarArr) {
        if (rij0VarArr.length == 0) {
            return this;
        }
        String str = zoi1.a;
        rij0[] rij0VarArr2 = this.a;
        Object[] objArrCopyOf = Arrays.copyOf(rij0VarArr2, rij0VarArr2.length + rij0VarArr.length);
        System.arraycopy(rij0VarArr, 0, objArrCopyOf, rij0VarArr2.length, rij0VarArr.length);
        return new hjj0(this.b, (rij0[]) objArrCopyOf);
    }

    public final hjj0 b(hjj0 hjj0Var) {
        return hjj0Var == null ? this : a(hjj0Var.a);
    }

    public final bg11 c(Class cls) {
        v280 v280VarM = b380.m();
        for (rij0 rij0Var : this.a) {
            if (cls.isAssignableFrom(rij0Var.getClass())) {
                v280VarM.c((rij0) cls.cast(rij0Var));
            }
        }
        return v280VarM.g();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && hjj0.class == obj.getClass()) {
            hjj0 hjj0Var = (hjj0) obj;
            if (Arrays.equals(this.a, hjj0Var.a) && this.b == hjj0Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return anm1.z(this.b) + (Arrays.hashCode(this.a) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("entries=");
        sb.append(Arrays.toString(this.a));
        long j = this.b;
        if (j == -9223372036854775807L) {
            str = "";
        } else {
            str = ", presentationTimeUs=" + j;
        }
        sb.append(str);
        return sb.toString();
    }

    public hjj0(long j, rij0... rij0VarArr) {
        this.b = j;
        this.a = rij0VarArr;
    }

    public hjj0(rij0... rij0VarArr) {
        this(-9223372036854775807L, rij0VarArr);
    }
}
