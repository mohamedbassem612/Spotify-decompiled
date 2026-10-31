package p;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class nvq0 extends View.BaseSavedState {
    public static final Parcelable.Creator<nvq0> CREATOR = new p7q0((byte) 18);
    public ivq0 a;
    public boolean b;

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        ivq0 ivq0Var = this.a;
        parcel.writeInt(ivq0Var == null ? -1 : ivq0Var.ordinal());
        parcel.writeInt(this.b ? 1 : 0);
    }
}
