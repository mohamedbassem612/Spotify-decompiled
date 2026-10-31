package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ekc1 implements Parcelable {
    public static final Parcelable.Creator<ekc1> CREATOR = new y7c1((byte) 20);
    public final int a;
    public final float b;
    public final float c;
    public final float d;

    public ekc1(float f, float f2, float f3, int i) {
        this.a = i;
        this.b = f;
        this.c = f2;
        this.d = f3;
    }

    public static ekc1 a(ekc1 ekc1Var, float f, float f2, float f3, int i) {
        int i2 = ekc1Var.a;
        if ((i & 2) != 0) {
            f = ekc1Var.b;
        }
        if ((i & 4) != 0) {
            f2 = ekc1Var.c;
        }
        ekc1Var.getClass();
        return new ekc1(f, f2, f3, i2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ekc1)) {
            return false;
        }
        ekc1 ekc1Var = (ekc1) obj;
        return this.a == ekc1Var.a && Float.compare(this.b, ekc1Var.b) == 0 && Float.compare(this.c, ekc1Var.c) == 0 && Float.compare(this.d, ekc1Var.d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + x0d.f(x0d.f(l1d.C(this.a) * 31, 31, this.b), 31, this.c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        int i2 = this.a;
        if (i2 == 1) {
            str = "Loop";
        } else if (i2 == 2) {
            str = "Spinback";
        } else {
            if (i2 != 3) {
                throw null;
            }
            str = "VinylStop";
        }
        parcel.writeString(str);
        parcel.writeFloat(this.b);
        parcel.writeFloat(this.c);
        parcel.writeFloat(this.d);
    }
}
