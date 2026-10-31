package p;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ac2 implements Parcelable {
    public static final Parcelable.Creator<ac2> CREATOR = new ev1((byte) 23);
    public final we2 a;
    public final Intent b;

    public ac2(we2 we2Var, Intent intent) {
        this.a = we2Var;
        this.b = intent;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ac2)) {
            return false;
        }
        ac2 ac2Var = (ac2) obj;
        return u890.j(this.a, ac2Var.a) && u890.j(this.b, ac2Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Intent intent = this.b;
        return iHashCode + (intent == null ? 0 : intent.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeParcelable(this.b, i);
    }
}
