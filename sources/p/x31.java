package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class x31 implements a41 {
    public static final Parcelable.Creator<x31> CREATOR = new t21((byte) 27);
    public final s21 a;

    public x31(s21 s21Var) {
        this.a = s21Var;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x31) && u890.j(this.a, ((x31) obj).a);
    }

    public final int hashCode() {
        s21 s21Var = this.a;
        if (s21Var == null) {
            return 0;
        }
        return s21Var.hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
    }
}
