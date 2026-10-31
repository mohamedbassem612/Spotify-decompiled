package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ela1 implements Parcelable {
    public static final Parcelable.Creator<ela1> CREATOR = new nja1(5);
    public final String a;
    public final String b;
    public final String c;

    public ela1(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final String a() {
        return this.c;
    }

    public final String b() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ela1)) {
            return false;
        }
        ela1 ela1Var = (ela1) obj;
        return u890.j(this.a, ela1Var.a) && u890.j(this.b, ela1Var.b) && u890.j(this.c, ela1Var.c);
    }

    public final String g() {
        return this.b;
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
    }
}
