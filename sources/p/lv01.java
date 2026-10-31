package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class lv01 implements Parcelable {
    public static final Parcelable.Creator<lv01> CREATOR = new sj01((byte) 24);
    public final int a;
    public final List b;
    public final m9m c;
    public final br01 d;
    public final boolean e;
    public final boolean f;
    public final boolean g;

    public /* synthetic */ lv01(int i, List list, m9m m9mVar, br01 br01Var, boolean z, boolean z2, int i2) {
        this(i, (i2 & 2) != 0 ? z6x.a : list, (i2 & 4) != 0 ? null : m9mVar, (i2 & 8) != 0 ? null : br01Var, (i2 & 16) != 0 ? false : z, true, z2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lv01)) {
            return false;
        }
        lv01 lv01Var = (lv01) obj;
        return this.a == lv01Var.a && u890.j(this.b, lv01Var.b) && this.c == lv01Var.c && this.d == lv01Var.d && this.e == lv01Var.e && this.f == lv01Var.f && this.g == lv01Var.g;
    }

    public final int hashCode() {
        int iB = f4i1.b(Integer.hashCode(this.a) * 31, 31, this.b);
        m9m m9mVar = this.c;
        int iHashCode = (iB + (m9mVar == null ? 0 : m9mVar.hashCode())) * 31;
        br01 br01Var = this.d;
        return Boolean.hashCode(this.g) + xcg1.g(xcg1.g((iHashCode + (br01Var != null ? br01Var.hashCode() : 0)) * 31, 31, this.e), 31, this.f);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeStringList(this.b);
        parcel.writeParcelable(this.c, i);
        br01 br01Var = this.d;
        if (br01Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            br01Var.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeInt(this.f ? 1 : 0);
        parcel.writeInt(this.g ? 1 : 0);
    }

    public lv01(int i, List list, m9m m9mVar, br01 br01Var, boolean z, boolean z2, boolean z3) {
        this.a = i;
        this.b = list;
        this.c = m9mVar;
        this.d = br01Var;
        this.e = z;
        this.f = z2;
        this.g = z3;
    }
}
