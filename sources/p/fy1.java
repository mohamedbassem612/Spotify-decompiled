package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class fy1 implements gy1 {
    public static final Parcelable.Creator<fy1> CREATOR = new ev1((byte) 7);
    public final ajg1 a;

    public fy1(ajg1 ajg1Var) {
        this.a = ajg1Var;
    }

    public final ajg1 a() {
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
        return (obj instanceof fy1) && u890.j(this.a, ((fy1) obj).a);
    }

    public final int hashCode() {
        ajg1 ajg1Var = this.a;
        if (ajg1Var == null) {
            return 0;
        }
        return ajg1Var.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ajg1 ajg1Var = this.a;
        if (ajg1Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            ajg1Var.writeToParcel(parcel, i);
        }
    }
}
