package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class of8 implements Parcelable {
    public static final Parcelable.Creator<of8> CREATOR = new bu7((byte) 18);
    public final String a;
    public final byte[] b;

    public of8(String str, byte[] bArr) {
        this.a = str;
        this.b = bArr;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof of8)) {
            return false;
        }
        of8 of8Var = (of8) obj;
        return u890.j(this.a, of8Var.a) && u890.j(this.b, of8Var.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeByteArray(this.b);
    }
}
