package p;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class m470 implements Parcelable {
    public static final Parcelable.Creator<m470> CREATOR = new ij60((byte) 13);
    public final Parcelable a;
    public final Parcelable b;

    public m470(Parcel parcel) {
        this.a = parcel.readParcelable(s470.class.getClassLoader());
        this.b = parcel.readParcelable(k470.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeParcelable(this.b, i);
    }

    public m470(Bundle bundle, tic0 tic0Var) {
        this.a = bundle;
        this.b = tic0Var;
    }
}
