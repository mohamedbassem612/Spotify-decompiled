package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class jfm0 implements ffm0 {
    public static final Parcelable.Creator<jfm0> CREATOR = new w9k0((byte) 17);
    public final p061 a;
    public final xm21 b;

    public jfm0(p061 p061Var, xm21 xm21Var) {
        this.a = p061Var;
        this.b = xm21Var;
    }

    public final int describeContents() {
        return 0;
    }

    public final p061 e1() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jfm0)) {
            return false;
        }
        jfm0 jfm0Var = (jfm0) obj;
        return u890.j(this.a, jfm0Var.a) && this.b == jfm0Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        this.a.writeToParcel(parcel, i);
        this.b.writeToParcel(parcel, i);
    }
}
