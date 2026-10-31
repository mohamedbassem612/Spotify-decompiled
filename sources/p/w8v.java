package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class w8v implements Parcelable {
    public static final Parcelable.Creator<w8v> CREATOR = new s5v((byte) 2);
    public int a;
    public final UUID b;
    public final String c;
    public final String d;
    public final byte[] e;

    public w8v(Parcel parcel) {
        this.b = new UUID(parcel.readLong(), parcel.readLong());
        this.c = parcel.readString();
        String string = parcel.readString();
        String str = zoi1.a;
        this.d = string;
        this.e = parcel.createByteArray();
    }

    public final boolean a(UUID uuid) {
        UUID uuid2 = whc.b;
        UUID uuid3 = this.b;
        return uuid2.equals(uuid3) || uuid.equals(uuid3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof w8v)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        w8v w8vVar = (w8v) obj;
        return Objects.equals(this.c, w8vVar.c) && Objects.equals(this.d, w8vVar.d) && Objects.equals(this.b, w8vVar.b) && Arrays.equals(this.e, w8vVar.e);
    }

    public final int hashCode() {
        int i = this.a;
        if (i != 0) {
            return i;
        }
        int iHashCode = this.b.hashCode() * 31;
        String str = this.c;
        int iHashCode2 = Arrays.hashCode(this.e) + cy30.d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
        this.a = iHashCode2;
        return iHashCode2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        UUID uuid = this.b;
        parcel.writeLong(uuid.getMostSignificantBits());
        parcel.writeLong(uuid.getLeastSignificantBits());
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeByteArray(this.e);
    }

    public w8v(UUID uuid, String str, String str2, byte[] bArr) {
        uuid.getClass();
        this.b = uuid;
        this.c = str;
        str2.getClass();
        this.d = asj0.p(str2);
        this.e = bArr;
    }
}
