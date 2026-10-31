package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class vk00 implements Parcelable {
    public static final Parcelable.Creator<vk00> CREATOR = new hbn1((byte) 20);
    public final String a;
    public final String b;

    public vk00(String str, String str2) {
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
        if (!(obj instanceof vk00)) {
            return false;
        }
        vk00 vk00Var = (vk00) obj;
        return u890.j(this.a, vk00Var.a) && u890.j(this.b, vk00Var.b);
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
