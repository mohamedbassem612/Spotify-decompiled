package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class yg71 implements Parcelable {
    public static final Parcelable.Creator<yg71> CREATOR = new ff71(5);
    public final o571 a;
    public final String b;
    public final boolean c;

    public yg71(o571 o571Var, String str, boolean z) {
        this.a = o571Var;
        this.b = str;
        this.c = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yg71)) {
            return false;
        }
        yg71 yg71Var = (yg71) obj;
        return u890.j(this.a, yg71Var.a) && u890.j(this.b, yg71Var.b) && this.c == yg71Var.c;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return Boolean.hashCode(this.c) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeString(this.b);
        parcel.writeInt(this.c ? 1 : 0);
    }
}
