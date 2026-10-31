package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class r880 implements Parcelable {
    public static final Parcelable.Creator<r880> CREATOR = new mj70((byte) 19);
    public final String a;
    public final String b;
    public final sg90 c;

    public r880(String str, String str2, sg90 sg90Var) {
        this.a = str;
        this.b = str2;
        this.c = sg90Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r880)) {
            return false;
        }
        r880 r880Var = (r880) obj;
        return u890.j(this.a, r880Var.a) && u890.j(this.b, r880Var.b) && u890.j(this.c, r880Var.c);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        sg90 sg90Var = this.c;
        return iD + (sg90Var == null ? 0 : sg90Var.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeParcelable(this.c, i);
    }
}
