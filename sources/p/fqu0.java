package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class fqu0 implements Parcelable, jik1 {
    public static final Parcelable.Creator<fqu0> CREATOR = new brt0((byte) 23);
    public final String a;
    public final lik1 b;

    public fqu0(String str) {
        this.a = str;
        kik1 kik1Var = nik1.I1;
        Set set = s4b1.f;
        String strZ = uic.x("spotify:playlist-participants:".concat(uic.x(str).h())).z();
        strZ.getClass();
        this.b = kik1Var.b(strZ);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fqu0) && u890.j(this.a, ((fqu0) obj).a);
    }

    public final lik1 getViewUri() {
        return this.b;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
    }
}
