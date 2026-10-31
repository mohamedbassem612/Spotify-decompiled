package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ric1 implements sic1 {
    public static final Parcelable.Creator<ric1> CREATOR = new y7c1((byte) 19);
    public final int a;
    public final List b;
    public final String c;
    public final boolean d;
    public final String e;
    public final boolean f;
    public final jic1 g;

    public /* synthetic */ ric1(int i, List list, String str, String str2, boolean z, jic1 jic1Var, int i2) {
        this(i, list, (i2 & 4) != 0 ? "" : str, false, (i2 & 16) != 0 ? null : str2, (i2 & 32) != 0 ? false : z, jic1Var);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ric1)) {
            return false;
        }
        ric1 ric1Var = (ric1) obj;
        return this.a == ric1Var.a && u890.j(this.b, ric1Var.b) && u890.j(this.c, ric1Var.c) && this.d == ric1Var.d && u890.j(this.e, ric1Var.e) && this.f == ric1Var.f && u890.j(this.g, ric1Var.g);
    }

    public final int hashCode() {
        int iG = xcg1.g(cy30.d(f4i1.b(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
        String str = this.e;
        return this.g.hashCode() + xcg1.g((iG + (str == null ? 0 : str.hashCode())) * 31, 31, this.f);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeStringList(this.b);
        parcel.writeString(this.c);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeString(this.e);
        parcel.writeInt(this.f ? 1 : 0);
        this.g.writeToParcel(parcel, i);
    }

    public ric1(int i, List list, String str, boolean z, String str2, boolean z2, jic1 jic1Var) {
        this.a = i;
        this.b = list;
        this.c = str;
        this.d = z;
        this.e = str2;
        this.f = z2;
        this.g = jic1Var;
    }
}
