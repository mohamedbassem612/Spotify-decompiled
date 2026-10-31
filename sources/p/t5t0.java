package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class t5t0 implements Parcelable {
    public static final Parcelable.Creator<t5t0> CREATOR = new bis0((byte) 28);
    public final int a;
    public final String b;
    public final String c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;

    public t5t0(int i, String str, String str2, float f, float f2, float f3, float f4) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = f;
        this.e = f2;
        this.f = f3;
        this.g = f4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t5t0)) {
            return false;
        }
        t5t0 t5t0Var = (t5t0) obj;
        return this.a == t5t0Var.a && u890.j(this.b, t5t0Var.b) && u890.j(this.c, t5t0Var.c) && Float.compare(this.d, t5t0Var.d) == 0 && Float.compare(this.e, t5t0Var.e) == 0 && Float.compare(this.f, t5t0Var.f) == 0 && Float.compare(this.g, t5t0Var.g) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.g) + x0d.f(x0d.f(x0d.f(cy30.d(cy30.d(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeFloat(this.d);
        parcel.writeFloat(this.e);
        parcel.writeFloat(this.f);
        parcel.writeFloat(this.g);
    }
}
