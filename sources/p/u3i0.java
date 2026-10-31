package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class u3i0 implements Parcelable {
    public static final Parcelable.Creator<u3i0> CREATOR = new cyh0((byte) 4);
    public final String a;
    public final q3i0 b;
    public final String c;
    public final o6i0 d;
    public final String e;

    public /* synthetic */ u3i0(String str, q3i0 q3i0Var, String str2, o6i0 o6i0Var, String str3, int i) {
        this(str, q3i0Var, str2, (i & 8) != 0 ? null : o6i0Var, (i & 16) != 0 ? null : str3);
    }

    public static u3i0 a(u3i0 u3i0Var, String str, String str2, int i) {
        if ((i & 1) != 0) {
            str = u3i0Var.a;
        }
        String str3 = str;
        q3i0 q3i0Var = u3i0Var.b;
        if ((i & 4) != 0) {
            str2 = u3i0Var.c;
        }
        String str4 = str2;
        o6i0 o6i0Var = u3i0Var.d;
        String str5 = (i & 16) != 0 ? u3i0Var.e : "media_trimmer_button_result";
        u3i0Var.getClass();
        return new u3i0(str3, q3i0Var, str4, o6i0Var, str5);
    }

    public final q3i0 b() {
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
        if (!(obj instanceof u3i0)) {
            return false;
        }
        u3i0 u3i0Var = (u3i0) obj;
        return u890.j(this.a, u3i0Var.a) && u890.j(this.b, u3i0Var.b) && u890.j(this.c, u3i0Var.c) && this.d == u3i0Var.d && u890.j(this.e, u3i0Var.e);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        String str = this.c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        o6i0 o6i0Var = this.d;
        int iHashCode3 = (iHashCode2 + (o6i0Var == null ? 0 : o6i0Var.hashCode())) * 31;
        String str2 = this.e;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeParcelable(this.b, i);
        parcel.writeString(this.c);
        o6i0 o6i0Var = this.d;
        if (o6i0Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(o6i0Var.name());
        }
        parcel.writeString(this.e);
    }

    public u3i0(String str, q3i0 q3i0Var, String str2, o6i0 o6i0Var, String str3) {
        this.a = str;
        this.b = q3i0Var;
        this.c = str2;
        this.d = o6i0Var;
        this.e = str3;
    }
}
