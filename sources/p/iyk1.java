package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class iyk1 implements Parcelable {
    public static final Parcelable.Creator<iyk1> CREATOR = new ylk1((byte) 9);
    public final String a;
    public final String b;
    public final String c;
    public final byte[] d;

    public iyk1(String str, String str2, byte[] bArr, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = bArr;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iyk1)) {
            return false;
        }
        iyk1 iyk1Var = (iyk1) obj;
        return u890.j(this.a, iyk1Var.a) && u890.j(this.b, iyk1Var.b) && u890.j(this.c, iyk1Var.c) && u890.j(this.d, iyk1Var.d);
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        byte[] bArr = this.d;
        return iD + (bArr == null ? 0 : Arrays.hashCode(bArr));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeByteArray(this.d);
    }
}
