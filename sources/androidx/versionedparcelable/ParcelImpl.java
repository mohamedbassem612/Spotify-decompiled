package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import p.elr0;
import p.g5j1;
import p.h5j1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new elr0((byte) 11);
    public final h5j1 a;

    public ParcelImpl(Parcel parcel) {
        this.a = new g5j1(parcel).h();
    }

    public final h5j1 a() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        new g5j1(parcel).l(this.a);
    }

    public ParcelImpl(h5j1 h5j1Var) {
        this.a = h5j1Var;
    }
}
