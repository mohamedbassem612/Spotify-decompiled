package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class aw7 implements Parcelable {
    public static final Parcelable.Creator<aw7> CREATOR = new bu7((byte) 2);
    public final String a;
    public final String b;

    public aw7(String str, String str2) {
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
        if (!(obj instanceof aw7)) {
            return false;
        }
        aw7 aw7Var = (aw7) obj;
        return u890.j(this.a, aw7Var.a) && u890.j(this.b, aw7Var.b);
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
