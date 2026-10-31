package p;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.protobuf.Any;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class wfk1 implements Parcelable {
    public static final Parcelable.Creator<wfk1> CREATOR = new tfk1((byte) 2);
    public final String a;
    public final String b;
    public final Any c;

    public wfk1(String str, String str2, Any any) {
        this.a = str;
        this.b = str2;
        this.c = any;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wfk1)) {
            return false;
        }
        wfk1 wfk1Var = (wfk1) obj;
        return u890.j(this.a, wfk1Var.a) && u890.j(this.b, wfk1Var.b) && u890.j(this.c, wfk1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        Any any = this.c;
        if (any == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeByteArray(any.toByteArray());
        }
    }
}
