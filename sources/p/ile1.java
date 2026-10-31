package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ile1 implements Parcelable {
    public static final Parcelable.Creator<ile1> CREATOR = new pwd1((byte) 15);
    public final String a;
    public final String b;

    public ile1(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final String a() {
        Set set = s4b1.f;
        String strZ = uic.B(this.b).z();
        return strZ == null ? "" : strZ;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ile1)) {
            return false;
        }
        ile1 ile1Var = (ile1) obj;
        return u890.j(this.a, ile1Var.a) && u890.j(this.b, ile1Var.b);
    }

    public final String getViewUri() {
        return this.a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
    }
}
