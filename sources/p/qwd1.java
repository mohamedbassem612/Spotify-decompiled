package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class qwd1 implements Parcelable {
    public static final Parcelable.Creator<qwd1> CREATOR = new pwd1((byte) 0);
    public final int a;
    public final hct0 b;

    public qwd1(int i, hct0 hct0Var) {
        this.a = i;
        this.b = hct0Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qwd1)) {
            return false;
        }
        qwd1 qwd1Var = (qwd1) obj;
        return this.a == qwd1Var.a && u890.j(this.b, qwd1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeParcelable(this.b, i);
    }
}
