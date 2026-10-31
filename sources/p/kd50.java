package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class kd50 implements Parcelable {
    public static final Parcelable.Creator<kd50> CREATOR = new n750((byte) 20);
    public final String a;
    public final Parcelable b;

    public kd50(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readParcelable(wf10.a().getClassLoader());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 1;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeParcelable(this.b, i);
    }

    public kd50(Parcelable parcelable) {
        this.a = "image/png";
        this.b = parcelable;
    }
}
