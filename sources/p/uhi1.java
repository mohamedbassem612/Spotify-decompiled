package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class uhi1 extends whi1 {
    public static final Parcelable.Creator<uhi1> CREATOR = new xbi1((byte) 7);
    public final p2f1 a;

    public uhi1(p2f1 p2f1Var) {
        this.a = p2f1Var;
    }

    public final p2f1 a() {
        return this.a;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uhi1) && u890.j(this.a, ((uhi1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
    }
}
