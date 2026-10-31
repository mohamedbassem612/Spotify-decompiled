package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ad70 implements w570, Parcelable {
    public final String a;
    public final String b;
    public final idd1 c = new idd1(new g050(this, (byte) 26));
    public static final ad70 d = new ad70("", "");
    public static final Parcelable.Creator<ad70> CREATOR = new ij60((byte) 18);

    public ad70(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ad70)) {
            return false;
        }
        ad70 ad70Var = (ad70) obj;
        return this.a.equals(ad70Var.a) && u890.j(this.b, ad70Var.b);
    }

    public final int hashCode() {
        return ((Number) this.c.getValue()).intValue();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
    }
}
