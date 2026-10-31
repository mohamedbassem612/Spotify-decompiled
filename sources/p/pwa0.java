package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class pwa0 implements Parcelable {
    public static final Parcelable.Creator<pwa0> CREATOR = new jca0((byte) 4);
    public final yxa0 a;

    public pwa0(yxa0 yxa0Var) {
        this.a = yxa0Var;
    }

    public final yxa0 a() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pwa0) && u890.j(this.a, ((pwa0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
    }
}
