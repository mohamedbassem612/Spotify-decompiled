package p;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class r8o implements Parcelable {
    public static final Parcelable.Creator<r8o> CREATOR = new sao1(14);

    public abstract PendingIntent a();

    public abstract boolean b();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        yan1 yan1Var = (yan1) this;
        parcel.writeParcelable(yan1Var.a, 0);
        parcel.writeInt(yan1Var.b ? 1 : 0);
    }
}
