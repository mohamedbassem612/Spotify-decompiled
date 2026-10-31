package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class to41 implements zo41 {
    public static final Parcelable.Creator<to41> CREATOR = new xw31((byte) 29);
    public final String a;

    public to41(String str) {
        this.a = str;
    }

    @Override // p.zo41
    public final String S() {
        return "Error";
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof to41) && u890.j(this.a, ((to41) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
    }
}
