package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class th71 implements Parcelable {
    public static final Parcelable.Creator<th71> CREATOR = new ff71((byte) 6);
    public final String a;
    public final String b;
    public final String c;
    public final dz d;
    public final dz e;

    public th71(String str, String str2, String str3, dz dzVar, dz dzVar2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = dzVar;
        this.e = dzVar2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof th71)) {
            return false;
        }
        th71 th71Var = (th71) obj;
        return u890.j(this.a, th71Var.a) && u890.j(this.b, th71Var.b) && u890.j(this.c, th71Var.c) && u890.j(this.d, th71Var.d) && u890.j(this.e, th71Var.e);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        int i = 0;
        String str = this.c;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        this.d.getClass();
        int i2 = (iHashCode - 371711337) * 31;
        dz dzVar = this.e;
        if (dzVar != null) {
            dzVar.getClass();
            i = -371711337;
        }
        return i2 + i;
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
