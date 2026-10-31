package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class di90 implements Parcelable {
    public static final Parcelable.Creator<di90> CREATOR = new qg90((byte) 5);
    public final String a;
    public final String b;
    public final int c;
    public final boolean d;

    public di90(int i, String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof di90)) {
            return false;
        }
        di90 di90Var = (di90) obj;
        return u890.j(this.a, di90Var.a) && u890.j(this.b, di90Var.b) && this.c == di90Var.c && this.d == di90Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + kaa0.f(this.c, cy30.d(this.a.hashCode() * 31, 31, this.b), 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d ? 1 : 0);
    }
}
