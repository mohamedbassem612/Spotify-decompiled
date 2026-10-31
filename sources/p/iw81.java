package p;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class iw81 implements Parcelable {
    public static final Parcelable.Creator<iw81> CREATOR = new ro71((byte) 27);
    public final Intent a;
    public final String b;

    public iw81(String str, Intent intent) {
        this.a = intent;
        this.b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iw81)) {
            return false;
        }
        iw81 iw81Var = (iw81) obj;
        return u890.j(this.a, iw81Var.a) && u890.j(this.b, iw81Var.b);
    }

    public final int hashCode() {
        Intent intent = this.a;
        return this.b.hashCode() + ((intent == null ? 0 : intent.hashCode()) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeString(this.b);
    }
}
