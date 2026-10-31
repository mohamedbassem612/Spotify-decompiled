package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class pcy0 extends tcy0 {
    public static final Parcelable.Creator<pcy0> CREATOR = new zzx0((byte) 17);
    public final String a;
    public final String b;
    public final String c;

    public pcy0(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    @Override // p.tcy0
    public final String a() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pcy0)) {
            return false;
        }
        pcy0 pcy0Var = (pcy0) obj;
        return u890.j(this.a, pcy0Var.a) && u890.j(this.b, pcy0Var.b) && u890.j(this.c, pcy0Var.c);
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
