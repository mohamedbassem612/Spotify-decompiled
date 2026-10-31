package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class fw6 implements Parcelable {
    public static final Parcelable.Creator<fw6> CREATOR = new fp5((byte) 21);
    public final String a;
    public final String b;
    public final jx11 c;

    public fw6(String str, String str2, jx11 jx11Var) {
        this.a = str;
        this.b = str2;
        this.c = jx11Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fw6)) {
            return false;
        }
        fw6 fw6Var = (fw6) obj;
        return u890.j(this.a, fw6Var.a) && u890.j(this.b, fw6Var.b) && this.c == fw6Var.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c.name());
    }
}
