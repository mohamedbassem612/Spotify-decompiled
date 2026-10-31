package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class sgc0 implements ugc0 {
    public static final Parcelable.Creator<sgc0> CREATOR = new v5c0((byte) 13);
    public final String a;
    public final Integer b;

    public sgc0(Integer num, String str) {
        this.a = str;
        this.b = num;
        if (str == null && num == null) {
            hhg1.n("An exit message is required");
            throw null;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sgc0)) {
            return false;
        }
        sgc0 sgc0Var = (sgc0) obj;
        return u890.j(this.a, sgc0Var.a) && u890.j(this.b, sgc0Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.b;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        Integer num = this.b;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            hrt.l(parcel, 1, num);
        }
    }

    public /* synthetic */ sgc0(Integer num) {
        this(num, null);
    }
}
