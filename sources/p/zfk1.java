package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class zfk1 implements fgk1 {
    public static final Parcelable.Creator<zfk1> CREATOR = new tfk1((byte) 6);
    public final String a;
    public final uas0 b;

    public zfk1(String str, uas0 uas0Var) {
        this.a = str;
        this.b = uas0Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zfk1)) {
            return false;
        }
        zfk1 zfk1Var = (zfk1) obj;
        return u890.j(this.a, zfk1Var.a) && u890.j(this.b, zfk1Var.b);
    }

    @Override // p.fgk1
    public final String getTitle() {
        return this.a;
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
