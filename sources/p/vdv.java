package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class vdv implements Parcelable {
    public static final Parcelable.Creator<vdv> CREATOR = new s5v((byte) 6);
    public final ak3 a;
    public final String b;
    public final String c;
    public final String d;

    public vdv(ak3 ak3Var, String str, String str2, String str3) {
        this.a = ak3Var;
        this.b = str;
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
        if (!(obj instanceof vdv)) {
            return false;
        }
        vdv vdvVar = (vdv) obj;
        return this.a == vdvVar.a && u890.j(this.b, vdvVar.b) && u890.j(this.c, vdvVar.c) && u890.j(this.d, vdvVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a.name());
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
    }
}
