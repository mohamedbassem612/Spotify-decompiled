package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class jl50 implements Parcelable {
    public static final Parcelable.Creator<jl50> CREATOR = new xk50((byte) 3);
    public final String a;
    public final String b;
    public final String c;
    public final Integer d;
    public final yk50 e;

    public jl50(String str, String str2, String str3, Integer num, yk50 yk50Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = num;
        this.e = yk50Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jl50)) {
            return false;
        }
        jl50 jl50Var = (jl50) obj;
        return u890.j(this.a, jl50Var.a) && u890.j(this.b, jl50Var.b) && u890.j(this.c, jl50Var.c) && u890.j(this.d, jl50Var.d) && u890.j(this.e, jl50Var.e);
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        Integer num = this.d;
        int iHashCode = (iD + (num == null ? 0 : num.hashCode())) * 31;
        yk50 yk50Var = this.e;
        return iHashCode + (yk50Var != null ? yk50Var.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        Integer num = this.d;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            hrt.l(parcel, 1, num);
        }
        yk50 yk50Var = this.e;
        if (yk50Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            yk50Var.writeToParcel(parcel, i);
        }
    }
}
