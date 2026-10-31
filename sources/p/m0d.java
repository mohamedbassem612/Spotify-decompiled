package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
@o661
public final class m0d implements Parcelable {
    public final String a;
    public final String b;
    public final String c;
    public static final l0d Companion = new l0d();
    public static final Parcelable.Creator<m0d> CREATOR = new yyb((byte) 16);

    public m0d(String str, String str2, int i, String str3) {
        if (3 != (i & 3)) {
            o6p1.t(i, 3, j0d.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        if ((i & 4) != 0) {
            this.c = str3;
        } else {
            Companion.getClass();
            this.c = new Locale("", str).getDisplayCountry();
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0d)) {
            return false;
        }
        m0d m0dVar = (m0d) obj;
        return u890.j(this.a, m0dVar.a) && u890.j(this.b, m0dVar.b) && u890.j(this.c, m0dVar.c);
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

    public m0d(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }
}
