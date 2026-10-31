package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class k6s0 extends u6s0 {
    public static final Parcelable.Creator<k6s0> CREATOR = new zsr0((byte) 18);
    public final String b;

    public k6s0(String str) {
        super(str);
        this.b = str;
    }

    @Override // p.u6s0
    public final String a() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k6s0) && u890.j(this.b, ((k6s0) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
    }
}
