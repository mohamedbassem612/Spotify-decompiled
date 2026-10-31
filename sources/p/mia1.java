package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class mia1 implements Parcelable {
    public static final Parcelable.Creator<mia1> CREATOR = new yx81((byte) 27);
    public final String a;
    public final boolean b;
    public final mia1 c;

    public /* synthetic */ mia1(String str, boolean z, mia1 mia1Var, int i) {
        this(str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : mia1Var);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mia1)) {
            return false;
        }
        mia1 mia1Var = (mia1) obj;
        return u890.j(this.a, mia1Var.a) && this.b == mia1Var.b && u890.j(this.c, mia1Var.c);
    }

    public final int hashCode() {
        int iG = xcg1.g(this.a.hashCode() * 31, 31, this.b);
        mia1 mia1Var = this.c;
        return iG + (mia1Var == null ? 0 : mia1Var.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeInt(this.b ? 1 : 0);
        mia1 mia1Var = this.c;
        if (mia1Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            mia1Var.writeToParcel(parcel, i);
        }
    }

    public mia1(String str, boolean z, mia1 mia1Var) {
        this.a = str;
        this.b = z;
        this.c = mia1Var;
    }
}
