package p;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class tx90 implements Parcelable {
    public static final Parcelable.Creator<tx90> CREATOR = new qg90((byte) 26);
    public final String a;

    public tx90(String str) {
        this.a = str;
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putString("jam_manage_participants_sheet_session_id_key", this.a);
        return bundle;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tx90) && u890.j(this.a, ((tx90) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
    }
}
