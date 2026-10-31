package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class o190 implements Parcelable {
    public static final Parcelable.Creator<o190> CREATOR = new xl80((byte) 5);
    public final String a;
    public final boolean b;

    public o190(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o190)) {
            return false;
        }
        o190 o190Var = (o190) obj;
        return u890.j(this.a, o190Var.a) && this.b == o190Var.b;
    }

    public final String getUri() {
        return this.a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeInt(this.b ? 1 : 0);
    }
}
