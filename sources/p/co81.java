package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class co81 implements do81 {
    public static final Parcelable.Creator<co81> CREATOR = new ro71((byte) 17);
    public final String a;
    public final bo81 b;

    public co81(String str, bo81 bo81Var) {
        this.a = str;
        this.b = bo81Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof co81)) {
            return false;
        }
        co81 co81Var = (co81) obj;
        return u890.j(this.a, co81Var.a) && u890.j(this.b, co81Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeParcelable(this.b, i);
    }
}
