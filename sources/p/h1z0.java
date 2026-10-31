package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class h1z0 implements Parcelable {
    public static final Parcelable.Creator<h1z0> CREATOR = new zzx0((byte) 29);
    public final gyh a;

    public h1z0(gyh gyhVar) {
        this.a = gyhVar;
    }

    public final gyh a() {
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
        return (obj instanceof h1z0) && this.a == ((h1z0) obj).a;
    }

    public final int hashCode() {
        gyh gyhVar = this.a;
        if (gyhVar == null) {
            return 0;
        }
        return gyhVar.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        gyh gyhVar = this.a;
        if (gyhVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(gyhVar.name());
        }
    }
}
