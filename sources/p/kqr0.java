package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class kqr0 implements Parcelable {
    public static final jqr0 CREATOR = new jqr0();
    public final po90 a;

    public kqr0(po90 po90Var) {
        this.a = po90Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        po90 po90Var = this.a;
        parcel.writeString(po90Var.a);
        parcel.writeString(po90Var.b);
        parcel.writeString(po90Var.c);
        parcel.writeByte(po90Var.d ? (byte) 1 : (byte) 0);
        parcel.writeByte(po90Var.e ? (byte) 1 : (byte) 0);
    }
}
