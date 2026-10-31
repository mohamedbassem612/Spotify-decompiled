package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class yqr0 implements Parcelable {
    public static final xqr0 CREATOR = new xqr0();
    public final lp90 a;

    public yqr0(lp90 lp90Var) {
        this.a = lp90Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        lp90 lp90Var = this.a;
        parcel.writeString(lp90Var.a);
        parcel.writeString(lp90Var.b);
        parcel.writeString(ab80.s(lp90Var.c));
        parcel.writeString(ab80.t(lp90Var.d));
        parcel.writeByte(lp90Var.e ? (byte) 1 : (byte) 0);
        jp90 jp90Var = lp90Var.g;
        parcel.writeByte(jp90Var.a ? (byte) 1 : (byte) 0);
        parcel.writeByte(jp90Var.b ? (byte) 1 : (byte) 0);
        kp90 kp90Var = jp90Var.c;
        parcel.writeString(kp90Var != null ? kp90Var.a : null);
    }
}
