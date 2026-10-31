package p;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.protobuf.Timestamp;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class n2f1 implements p2f1 {
    public static final Parcelable.Creator<n2f1> CREATOR = new lse1((byte) 24);
    public final f371 a;
    public final Timestamp b;
    public final String c;
    public final kn71 d;

    public n2f1(f371 f371Var, Timestamp timestamp, String str, kn71 kn71Var) {
        this.a = f371Var;
        this.b = timestamp;
        this.c = str;
        this.d = kn71Var;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n2f1)) {
            return false;
        }
        n2f1 n2f1Var = (n2f1) obj;
        return u890.j(this.a, n2f1Var.a) && this.b.equals(n2f1Var.b) && u890.j(this.c, n2f1Var.c) && this.d == n2f1Var.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + cy30.d((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        Timestamp timestamp = this.b;
        parcel.writeLong(timestamp.q());
        parcel.writeInt(timestamp.p());
        parcel.writeString(this.c);
        parcel.writeString(this.d.name());
    }
}
