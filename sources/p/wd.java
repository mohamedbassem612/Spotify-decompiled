package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Date;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class wd implements Parcelable {
    public static final Parcelable.Creator<wd> CREATOR = new ad((byte) 4);
    public final String a;
    public final String b;
    public final Date c;

    public wd(String str, String str2, Date date) {
        this.a = str;
        this.b = str2;
        this.c = date;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wd)) {
            return false;
        }
        wd wdVar = (wd) obj;
        return u890.j(this.a, wdVar.a) && u890.j(this.b, wdVar.b) && u890.j(this.c, wdVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeSerializable(this.c);
    }
}
