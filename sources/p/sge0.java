package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class sge0 implements Parcelable {
    public static final Parcelable.Creator<sge0> CREATOR = new lbe0((byte) 7);
    public final rge0 a;
    public final float b;
    public final String c;
    public final String d;

    public sge0(rge0 rge0Var, float f, String str, String str2) {
        this.a = rge0Var;
        this.b = f;
        this.c = str;
        this.d = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sge0)) {
            return false;
        }
        sge0 sge0Var = (sge0) obj;
        return u890.j(this.a, sge0Var.a) && Float.compare(this.b, sge0Var.b) == 0 && u890.j(this.c, sge0Var.c) && u890.j(this.d, sge0Var.d);
    }

    public final int hashCode() {
        int iF = x0d.f(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return this.d.hashCode() + ((iF + (str == null ? 0 : str.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeFloat(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
    }
}
