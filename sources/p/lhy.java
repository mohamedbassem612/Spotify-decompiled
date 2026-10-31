package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class lhy extends mhy {
    public static final Parcelable.Creator<lhy> CREATOR = new jhy((byte) 1);
    public final dia1 a;
    public final as3 b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public lhy(dia1 dia1Var, as3 as3Var, boolean z, boolean z2, boolean z3) {
        this.a = dia1Var;
        this.b = as3Var;
        this.c = z;
        this.d = z2;
        this.e = z3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lhy)) {
            return false;
        }
        lhy lhyVar = (lhy) obj;
        return this.a == lhyVar.a && this.b == lhyVar.b && this.c == lhyVar.c && this.d == lhyVar.d && this.e == lhyVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + xcg1.g(xcg1.g((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a.name());
        parcel.writeString(this.b.name());
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeInt(this.e ? 1 : 0);
    }
}
