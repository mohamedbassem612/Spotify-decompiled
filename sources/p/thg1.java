package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class thg1 implements Parcelable {
    public static final Parcelable.Creator<thg1> CREATOR = new h3g1((byte) 5);
    public final String a;
    public final yig1 b;
    public final yxa0 c;
    public final int d;
    public final int e;
    public final yq00 f;
    public final boolean g;

    public thg1(String str, yig1 yig1Var, yxa0 yxa0Var, int i, int i2, yq00 yq00Var, boolean z) {
        this.a = str;
        this.b = yig1Var;
        this.c = yxa0Var;
        this.d = i;
        this.e = i2;
        this.f = yq00Var;
        this.g = z;
    }

    public final String a() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof thg1)) {
            return false;
        }
        thg1 thg1Var = (thg1) obj;
        return u890.j(this.a, thg1Var.a) && u890.j(this.b, thg1Var.b) && u890.j(this.c, thg1Var.c) && this.d == thg1Var.d && this.e == thg1Var.e && u890.j(this.f, thg1Var.f) && this.g == thg1Var.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + ((this.f.hashCode() + kaa0.f(this.e, kaa0.f(this.d, (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31), 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeParcelable(this.b, i);
        parcel.writeParcelable(this.c, i);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
        parcel.writeParcelable(this.f, i);
        parcel.writeInt(this.g ? 1 : 0);
    }
}
