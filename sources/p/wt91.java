package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class wt91 implements z0i, Parcelable {
    public static final Parcelable.Creator<wt91> CREATOR = new yx81((byte) 10);
    public final String a;
    public final long b;
    public final vt91 c;

    public wt91(String str, long j, vt91 vt91Var) {
        this.a = str;
        this.b = j;
        this.c = vt91Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wt91)) {
            return false;
        }
        wt91 wt91Var = (wt91) obj;
        return u890.j(this.a, wt91Var.a) && this.b == wt91Var.b && u890.j(this.c, wt91Var.c);
    }

    public final int hashCode() {
        int iF = cy30.f(this.a.hashCode() * 31, this.b, 31);
        vt91 vt91Var = this.c;
        return iF + (vt91Var == null ? 0 : vt91Var.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeLong(this.b);
        vt91 vt91Var = this.c;
        if (vt91Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            vt91Var.writeToParcel(parcel, i);
        }
    }
}
