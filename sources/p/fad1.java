package p;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class fad1 extends View.BaseSavedState {
    public static final Parcelable.Creator<fad1> CREATOR = new pxc1((byte) 27);
    public final boolean a;

    public fad1(Parcel parcel) {
        super(parcel);
        this.a = parcel.readByte() != 0;
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeByte(this.a ? (byte) 1 : (byte) 0);
    }

    public fad1(Parcelable parcelable, boolean z) {
        super(parcelable);
        this.a = z;
    }
}
