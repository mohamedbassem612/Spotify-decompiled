package p;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class x1o1 extends u9 {
    public static final Parcelable.Creator<x1o1> CREATOR = new w2o1(13);
    public final int a;
    public final String b;
    public final String c;
    public final String d;
    public final n6o1 e;
    public final x1o1 f;

    static {
        Process.myUid();
        Process.myPid();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [p.t6o1] */
    /* JADX WARN: Type inference failed for: r7v5 */
    public x1o1(int i, String str, String str2, String str3, ArrayList arrayList, x1o1 x1o1Var) {
        if (x1o1Var != null && x1o1Var.f != null) {
            hhg1.n("Failed requirement.");
            throw null;
        }
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3 == null ? x1o1Var != null ? x1o1Var.d : null : str3;
        if (arrayList == 0) {
            arrayList = x1o1Var != null ? x1o1Var.e : 0;
            if (arrayList == 0) {
                d6o1 d6o1Var = n6o1.b;
                arrayList = t6o1.e;
            }
        }
        d6o1 d6o1Var2 = n6o1.b;
        Object[] array = arrayList.toArray();
        int length = array.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (array[i2] == null) {
                bhn0.i(gvg.l(new StringBuilder(String.valueOf(i2).length() + 9), "at index ", i2));
                throw null;
            }
        }
        this.e = length == 0 ? t6o1.e : new t6o1(length, array);
        this.f = x1o1Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof x1o1)) {
            return false;
        }
        x1o1 x1o1Var = (x1o1) obj;
        return this.a == x1o1Var.a && u890.j(this.b, x1o1Var.b) && u890.j(this.c, x1o1Var.c) && u890.j(this.d, x1o1Var.d) && u890.j(this.f, x1o1Var.f) && this.e.equals(x1o1Var.e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.b, this.c, this.d, this.f});
    }

    public final String toString() {
        String str = this.b;
        int length = str.length() + 18;
        String str2 = this.c;
        StringBuilder sb = new StringBuilder(length + (str2 != null ? str2.length() : 0));
        sb.append(this.a);
        sb.append("/");
        sb.append(str);
        if (str2 != null) {
            sb.append("[");
            if (nhc1.Y(str2, str, false)) {
                sb.append((CharSequence) str2, str.length(), str2.length());
            } else {
                sb.append(str2);
            }
            sb.append("]");
        }
        String str3 = this.d;
        if (str3 != null) {
            sb.append("/");
            sb.append(Integer.toHexString(str3.hashCode()));
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = j541.L(20293, parcel);
        j541.K(parcel, 1, 4);
        parcel.writeInt(this.a);
        j541.F(parcel, 3, this.b);
        j541.F(parcel, 4, this.c);
        j541.F(parcel, 6, this.d);
        j541.E(parcel, 7, this.f, i);
        j541.J(parcel, 8, this.e);
        j541.M(iL, parcel);
    }
}
