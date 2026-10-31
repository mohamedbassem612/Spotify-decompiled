package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class mlr0 implements Parcelable {
    public static final Parcelable.Creator<mlr0> CREATOR = new elr0((byte) 1);
    public final boolean a;
    public final String b;

    public /* synthetic */ mlr0(int i) {
        this((i & 1) == 0, (i & 2) != 0 ? null : "Failed to load next page");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mlr0)) {
            return false;
        }
        mlr0 mlr0Var = (mlr0) obj;
        return this.a == mlr0Var.a && u890.j(this.b, mlr0Var.b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.a) * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a ? 1 : 0);
        parcel.writeString(this.b);
    }

    public mlr0(boolean z, String str) {
        this.a = z;
        this.b = str;
    }
}
