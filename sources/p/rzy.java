package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public class rzy implements Parcelable {
    public static final Parcelable.Creator<rzy> CREATOR = new jhy((byte) 18);
    public float a;
    public Parcelable b = null;
    public float c;

    public rzy(float f, float f2) {
        this.a = f2;
        this.c = f;
    }

    public float a() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "Entry, x: " + this.c + " y: " + a();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.c);
        parcel.writeFloat(a());
        if (this.b == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeParcelable(this.b, i);
        }
    }
}
