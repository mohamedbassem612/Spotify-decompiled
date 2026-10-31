package p;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class wvf implements Parcelable {
    public static final Parcelable.Creator<wvf> CREATOR = new zsf((byte) 3);
    public final String a;
    public final CharSequence b;
    public final String c;
    public final String d;

    public wvf(String str, CharSequence charSequence, String str2, String str3) {
        this.a = str;
        this.b = charSequence;
        this.c = str2;
        this.d = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wvf)) {
            return false;
        }
        wvf wvfVar = (wvf) obj;
        return u890.j(this.a, wvfVar.a) && u890.j(this.b, wvfVar.b) && u890.j(this.c, wvfVar.c) && u890.j(this.d, wvfVar.d);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        String str = this.c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        TextUtils.writeToParcel(this.b, parcel, i);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
    }
}
