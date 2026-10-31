package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class yd20 implements Parcelable {
    public static final Parcelable.Creator<yd20> CREATOR = new u220((byte) 29);
    public final String a;
    public final sg51 b;

    public yd20(String str, sg51 sg51Var) {
        this.a = str;
        this.b = sg51Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yd20)) {
            return false;
        }
        yd20 yd20Var = (yd20) obj;
        return u890.j(this.a, yd20Var.a) && u890.j(this.b, yd20Var.b);
    }

    public final int hashCode() {
        return this.b.a.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        this.b.writeToParcel(parcel, i);
    }
}
