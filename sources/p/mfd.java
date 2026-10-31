package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class mfd implements Parcelable {
    public static final Parcelable.Creator<mfd> CREATOR = new yyb((byte) 17);
    public final String a;
    public final boolean b;
    public final String c;

    public mfd(String str, String str2, boolean z) {
        this.a = str;
        this.b = z;
        this.c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mfd)) {
            return false;
        }
        mfd mfdVar = (mfd) obj;
        return u890.j(this.a, mfdVar.a) && this.b == mfdVar.b && u890.j(this.c, mfdVar.c);
    }

    public final int hashCode() {
        int iG = xcg1.g(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return iG + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeString(this.c);
    }
}
