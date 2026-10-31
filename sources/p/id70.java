package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class id70 implements j670, Parcelable {
    public final hd70 a;
    public final idd1 b = new idd1(new g050(this, (byte) 29));
    public static final id70 c = new id70(null, null, null, null);
    public static final Parcelable.Creator<id70> CREATOR = new ij60((byte) 21);

    public id70(String str, String str2, String str3, String str4) {
        this.a = new hd70(this, str, str2, str3, str4);
    }

    public final String a() {
        return this.a.a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof id70)) {
            return false;
        }
        return this.a.equals(((id70) obj).a);
    }

    public final int hashCode() {
        return ((Number) this.b.getValue()).intValue();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        hd70 hd70Var = this.a;
        parcel.writeString(hd70Var.a);
        parcel.writeString(hd70Var.b);
        parcel.writeString(hd70Var.c);
        parcel.writeString(hd70Var.d);
    }
}
