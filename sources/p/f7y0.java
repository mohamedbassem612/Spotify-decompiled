package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class f7y0 implements Parcelable {
    public static final Parcelable.Creator<f7y0> CREATOR = new zzx0((byte) 6);
    public final String a;
    public final String b;
    public final String c;
    public final g7y0 d;

    public f7y0(String str, String str2, String str3, g7y0 g7y0Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = g7y0Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f7y0)) {
            return false;
        }
        f7y0 f7y0Var = (f7y0) obj;
        return u890.j(this.a, f7y0Var.a) && u890.j(this.b, f7y0Var.b) && u890.j(this.c, f7y0Var.c) && this.d == f7y0Var.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d.name());
    }
}
