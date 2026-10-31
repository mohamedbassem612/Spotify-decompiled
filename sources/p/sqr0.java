package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class sqr0 implements Parcelable {
    public static final rqr0 CREATOR = new rqr0();
    public final no90 a;

    public sqr0(no90 no90Var) {
        this.a = no90Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        no90 no90Var = this.a;
        int i2 = no90Var.a;
        if (i2 == 1) {
            str = "UNKNOWN";
        } else if (i2 == 2) {
            str = "CONTROL";
        } else {
            if (i2 != 3) {
                throw null;
            }
            str = "LISTEN_AND_CONTROL";
        }
        parcel.writeString(str);
        parcel.writeByte(no90Var.b.a ? (byte) 1 : (byte) 0);
        parcel.writeByte(no90Var.c.a ? (byte) 1 : (byte) 0);
    }
}
