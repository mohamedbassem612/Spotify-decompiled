package p;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class u011 implements Parcelable {
    public static final Parcelable.Creator<u011> CREATOR = new sj01((byte) 27);
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final Uri e;

    public u011(String str, String str2, String str3, String str4, Uri uri) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = uri;
    }

    public static u011 a(u011 u011Var, String str, String str2, int i) {
        String str3 = u011Var.a;
        String str4 = u011Var.b;
        if ((i & 4) != 0) {
            str = u011Var.c;
        }
        String str5 = str;
        if ((i & 8) != 0) {
            str2 = u011Var.d;
        }
        return new u011(str3, str4, str5, str2, u011Var.e);
    }

    public final String b() {
        return this.c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u011)) {
            return false;
        }
        u011 u011Var = (u011) obj;
        return u890.j(this.a, u011Var.a) && u890.j(this.b, u011Var.b) && u890.j(this.c, u011Var.c) && u890.j(this.d, u011Var.d) && u890.j(this.e, u011Var.e);
    }

    public final String g() {
        return this.d;
    }

    public final String getTitle() {
        return this.a;
    }

    public final String h() {
        return this.b;
    }

    public final int hashCode() {
        return this.e.hashCode() + cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final Uri j() {
        return this.e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeParcelable(this.e, i);
    }

    public /* synthetic */ u011(Uri uri, String str, String str2, String str3) {
        this(str, str2, str3, "", uri);
    }
}
