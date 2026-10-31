package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class qkm0 implements Parcelable {
    public static final Parcelable.Creator<qkm0> CREATOR = new fgm0((byte) 19);
    public final srt0 a;
    public final pkm0 b;

    public qkm0(srt0 srt0Var, pkm0 pkm0Var) {
        this.a = srt0Var;
        this.b = pkm0Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qkm0)) {
            return false;
        }
        qkm0 qkm0Var = (qkm0) obj;
        return u890.j(this.a, qkm0Var.a) && u890.j(this.b, qkm0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        this.b.writeToParcel(parcel, i);
    }
}
