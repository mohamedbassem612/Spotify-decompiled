package p;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ij40 implements Parcelable {
    public static final Parcelable.Creator<ij40> CREATOR = new fd40((byte) 7);
    public final String a;
    public final CharSequence b;
    public final String c;
    public final List d;
    public final boolean e;

    public ij40(String str, CharSequence charSequence, String str2, List list, boolean z) {
        this.a = str;
        this.b = charSequence;
        this.c = str2;
        this.d = list;
        this.e = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ij40)) {
            return false;
        }
        ij40 ij40Var = (ij40) obj;
        return u890.j(this.a, ij40Var.a) && u890.j(this.b, ij40Var.b) && u890.j(this.c, ij40Var.c) && u890.j(this.d, ij40Var.d) && this.e == ij40Var.e;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        CharSequence charSequence = this.b;
        int iHashCode2 = (iHashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        String str = this.c;
        return Boolean.hashCode(this.e) + f4i1.b((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31, 31, this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        TextUtils.writeToParcel(this.b, parcel, i);
        parcel.writeString(this.c);
        Iterator itM = kk0.m(parcel, this.d);
        while (itM.hasNext()) {
            ((gp51) itM.next()).writeToParcel(parcel, i);
        }
        parcel.writeInt(this.e ? 1 : 0);
    }
}
