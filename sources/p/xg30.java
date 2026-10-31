package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class xg30 implements Parcelable {
    public static final Parcelable.Creator<xg30> CREATOR = new hbn1((byte) 21);
    public String a;
    public final String b;
    public final String c;
    public final e6w0 d;
    public final ee5 e;

    public xg30(String str, String str2, String str3, e6w0 e6w0Var, ee5 ee5Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = e6w0Var;
        this.e = ee5Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeParcelable(this.d, i);
        parcel.writeParcelable(this.e, i);
    }
}
