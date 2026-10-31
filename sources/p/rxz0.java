package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class rxz0 implements Parcelable {
    public static final Parcelable.Creator<rxz0> CREATOR = new erz0((byte) 12);
    public final c380 a;

    public rxz0(c380 c380Var) {
        this.a = c380Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rxz0) && u890.j(this.a, ((rxz0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        c380<pxz0> c380Var = this.a;
        if (c380Var == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(c380Var.size());
        for (pxz0 pxz0Var : c380Var) {
            if (pxz0Var != null) {
                parcel.writeString(pxz0Var.a);
                parcel.writeInt(pxz0Var.b);
            }
        }
    }
}
