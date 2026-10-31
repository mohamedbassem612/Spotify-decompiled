package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public class gn10 implements Parcelable {
    public static final Parcelable.Creator<gn10> CREATOR = new qn00((byte) 24);
    public final String a;

    public gn10(String str) {
        this.a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        gn10 gn10Var = obj instanceof gn10 ? (gn10) obj : null;
        return u890.j(gn10Var != null ? gn10Var.getName() : null, getName());
    }

    public String getName() {
        return this.a;
    }

    public final int hashCode() {
        return getName().hashCode();
    }

    public final String toString() {
        return getName();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
    }
}
