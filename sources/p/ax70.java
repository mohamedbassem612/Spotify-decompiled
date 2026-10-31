package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ax70 implements Parcelable {
    public static final Parcelable.Creator<ax70> CREATOR = new mj70((byte) 12);
    public final String a;
    public final String b;
    public final int c;

    public ax70(int i, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ax70)) {
            return false;
        }
        ax70 ax70Var = (ax70) obj;
        return u890.j(this.a, ax70Var.a) && u890.j(this.b, ax70Var.b) && this.c == ax70Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeInt(this.c);
    }
}
