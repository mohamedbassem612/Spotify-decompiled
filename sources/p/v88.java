package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class v88 implements Parcelable {
    public static final Parcelable.Creator<v88> CREATOR = new bu7((byte) 13);
    public final ph1 a;
    public final boolean b;

    public v88(ph1 ph1Var, boolean z) {
        this.a = ph1Var;
        this.b = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v88)) {
            return false;
        }
        v88 v88Var = (v88) obj;
        return this.a == v88Var.a && this.b == v88Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a.name());
        parcel.writeInt(this.b ? 1 : 0);
    }
}
