package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class zy61 extends ez61 {
    public static final Parcelable.Creator<zy61> CREATOR = new hs61(12);
    public final float d;
    public final float e;

    public zy61(float f, float f2) {
        super(f, f2);
        this.d = f;
        this.e = f2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zy61)) {
            return false;
        }
        zy61 zy61Var = (zy61) obj;
        return Float.compare(this.d, zy61Var.d) == 0 && Float.compare(this.e, zy61Var.e) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.e) + (Float.hashCode(this.d) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.d);
        parcel.writeFloat(this.e);
    }
}
