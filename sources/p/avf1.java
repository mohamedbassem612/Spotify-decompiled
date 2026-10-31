package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class avf1 implements Parcelable {
    public static final Parcelable.Creator<avf1> CREATOR = new r8f1((byte) 19);
    public final String a;
    public final String b;
    public final cvf1 c;

    public avf1(String str, String str2, cvf1 cvf1Var) {
        this.a = str;
        this.b = str2;
        this.c = cvf1Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof avf1)) {
            return false;
        }
        avf1 avf1Var = (avf1) obj;
        return u890.j(this.a, avf1Var.a) && u890.j(this.b, avf1Var.b) && u890.j(this.c, avf1Var.c);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        this.c.getClass();
        return iD + 1396393329;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeParcelable(this.c, i);
    }
}
