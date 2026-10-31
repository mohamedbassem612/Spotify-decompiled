package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ri8 implements Parcelable {
    public static final Parcelable.Creator<ri8> CREATOR = new bu7((byte) 20);
    public final byte[] a;

    public ri8(byte[] bArr) {
        this.a = bArr;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return ri8.class.equals(obj != null ? obj.getClass() : null) && Arrays.equals(this.a, ((ri8) obj).a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByteArray(this.a);
    }
}
