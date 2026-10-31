package p;

import android.os.Parcel;
import android.os.Parcelable;
import j$.time.LocalDate;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class i5r implements Parcelable {
    public static final Parcelable.Creator<i5r> CREATOR = new rco((byte) 21);
    public final LocalDate a;
    public final LocalDate b;

    public i5r(LocalDate localDate, LocalDate localDate2) {
        this.a = localDate;
        this.b = localDate2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i5r)) {
            return false;
        }
        i5r i5rVar = (i5r) obj;
        return u890.j(this.a, i5rVar.a) && u890.j(this.b, i5rVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeSerializable(this.a);
        parcel.writeSerializable(this.b);
    }
}
