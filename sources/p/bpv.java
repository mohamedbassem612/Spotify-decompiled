package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class bpv implements Parcelable {
    public static final Parcelable.Creator<bpv> CREATOR = new s5v((byte) 11);
    public final String a;
    public final String b;
    public final String c;

    public bpv(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bpv)) {
            return false;
        }
        bpv bpvVar = (bpv) obj;
        return u890.j(this.a, bpvVar.a) && u890.j(this.b, bpvVar.b) && u890.j(this.c, bpvVar.c);
    }

    public final String getPageUri() {
        return this.b;
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return iD + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
    }
}
