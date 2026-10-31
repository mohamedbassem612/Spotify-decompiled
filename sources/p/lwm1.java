package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class lwm1 implements Parcelable {
    public static final Parcelable.Creator<lwm1> CREATOR = new ynm1((byte) 9);
    public final String a;
    public final String b;

    public lwm1(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lwm1)) {
            return false;
        }
        lwm1 lwm1Var = (lwm1) obj;
        return u890.j(this.a, lwm1Var.a) && u890.j(this.b, lwm1Var.b);
    }

    public final String getUri() {
        return this.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
    }
}
