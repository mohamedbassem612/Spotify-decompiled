package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class s6q0 extends u6q0 {
    public static final Parcelable.Creator<s6q0> CREATOR = new qxp0((byte) 18);
    public final List a;

    public s6q0(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s6q0) && this.a.equals(((s6q0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.a);
    }
}
