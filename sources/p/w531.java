package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class w531 implements Parcelable {
    public static final Parcelable.Creator<w531> CREATOR = new s231((byte) 4);
    public final String a;
    public final String b;
    public final String c;
    public final byte[] d;

    public w531(String str, String str2, byte[] bArr, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = bArr;
    }

    public final String a() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String getUri() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeByteArray(this.d);
    }
}
