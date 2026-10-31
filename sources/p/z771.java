package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class z771 implements Parcelable {
    public static final Parcelable.Creator<z771> CREATOR = new o471((byte) 29);
    public final s4b1 a;

    public z771(s4b1 s4b1Var) {
        this.a = s4b1Var;
        a871.a(s4b1Var);
    }

    public final String a() {
        return String.valueOf(this.a.a);
    }

    public final String b() {
        String strZ = this.a.z();
        strZ.getClass();
        return strZ;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z771) && u890.j(this.a, ((z771) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        qpn1.x(this.a, parcel);
    }
}
