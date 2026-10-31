package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class jb6 extends ei90 {
    public static final Parcelable.Creator<jb6> CREATOR = new fp5((byte) 4);
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final i6k d;
    public final l6k e;

    public jb6(boolean z, boolean z2, boolean z3, i6k i6kVar, l6k l6kVar) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = i6kVar;
        this.e = l6kVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jb6)) {
            return false;
        }
        jb6 jb6Var = (jb6) obj;
        return this.a == jb6Var.a && this.b == jb6Var.b && this.c == jb6Var.c && u890.j(this.d, jb6Var.d) && u890.j(this.e, jb6Var.e);
    }

    public final int hashCode() {
        int iG = xcg1.g(xcg1.g(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        i6k i6kVar = this.d;
        int iHashCode = (iG + (i6kVar == null ? 0 : i6kVar.hashCode())) * 31;
        l6k l6kVar = this.e;
        return iHashCode + (l6kVar != null ? l6kVar.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a ? 1 : 0);
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeInt(this.c ? 1 : 0);
        i6k i6kVar = this.d;
        if (i6kVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            i6kVar.writeToParcel(parcel, i);
        }
        l6k l6kVar = this.e;
        if (l6kVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            l6kVar.writeToParcel(parcel, i);
        }
    }
}
