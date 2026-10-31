package p;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class puh0 extends u9 {
    public static final Parcelable.Creator<puh0> CREATOR = new jrn1((byte) 6);
    public String a;
    public String b;
    public int c;
    public String d;
    public ouh0 e;
    public int f;
    public List g;
    public int h;
    public long i;
    public boolean t;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof puh0)) {
            return false;
        }
        puh0 puh0Var = (puh0) obj;
        return TextUtils.equals(this.a, puh0Var.a) && TextUtils.equals(this.b, puh0Var.b) && this.c == puh0Var.c && TextUtils.equals(this.d, puh0Var.d) && k8p1.h(this.e, puh0Var.e) && this.f == puh0Var.f && k8p1.h(this.g, puh0Var.g) && this.h == puh0Var.h && this.i == puh0Var.i && this.t == puh0Var.t;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Integer.valueOf(this.c), this.d, this.e, Integer.valueOf(this.f), this.g, Integer.valueOf(this.h), Long.valueOf(this.i), Boolean.valueOf(this.t)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = j541.L(20293, parcel);
        j541.F(parcel, 2, this.a);
        j541.F(parcel, 3, this.b);
        int i2 = this.c;
        j541.K(parcel, 4, 4);
        parcel.writeInt(i2);
        j541.F(parcel, 5, this.d);
        j541.E(parcel, 6, this.e, i);
        int i3 = this.f;
        j541.K(parcel, 7, 4);
        parcel.writeInt(i3);
        List list = this.g;
        j541.J(parcel, 8, list == null ? null : Collections.unmodifiableList(list));
        int i4 = this.h;
        j541.K(parcel, 9, 4);
        parcel.writeInt(i4);
        long j = this.i;
        j541.K(parcel, 10, 8);
        parcel.writeLong(j);
        boolean z = this.t;
        j541.K(parcel, 11, 4);
        parcel.writeInt(z ? 1 : 0);
        j541.M(iL, parcel);
    }
}
