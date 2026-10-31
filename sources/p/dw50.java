package p;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class dw50 extends View.BaseSavedState {
    public static final Parcelable.Creator<dw50> CREATOR = new lqr0(new l7c(12));
    public float a;
    public boolean b;

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeFloat(this.a);
        parcel.writeInt(this.b ? 1 : 0);
    }
}
