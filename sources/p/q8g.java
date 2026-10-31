package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class q8g implements r8g {
    public static final Parcelable.Creator<q8g> CREATOR = new i8g((byte) 6);
    public final boolean a;
    public final i050 b;

    public q8g(boolean z, i050 i050Var) {
        this.a = z;
        this.b = i050Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q8g)) {
            return false;
        }
        q8g q8gVar = (q8g) obj;
        return this.a == q8gVar.a && u890.j(this.b, q8gVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a ? 1 : 0);
        parcel.writeParcelable(this.b, i);
    }
}
