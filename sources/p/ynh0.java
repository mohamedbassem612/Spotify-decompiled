package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ynh0 implements aoh0 {
    public static final Parcelable.Creator<ynh0> CREATOR = new hug0((byte) 22);
    public final vy30 a;

    public ynh0(vy30 vy30Var) {
        this.a = vy30Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ynh0) && u890.j(this.a, ((ynh0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.a.writeToParcel(parcel, i);
    }
}
