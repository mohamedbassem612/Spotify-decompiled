package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class mu91 implements Parcelable {
    public static final Parcelable.Creator<mu91> CREATOR = new yx81((byte) 12);
    public final List a;
    public final t5u b;

    public mu91(List list, t5u t5uVar) {
        this.a = list;
        this.b = t5uVar;
    }

    public final hg50 a() {
        return (hg50) o7h.q0(this.a);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mu91)) {
            return false;
        }
        mu91 mu91Var = (mu91) obj;
        return this.a.equals(mu91Var.a) && this.b == mu91Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator itM = kk0.m(parcel, this.a);
        while (itM.hasNext()) {
            ((hg50) itM.next()).writeToParcel(parcel, i);
        }
        parcel.writeString(this.b.name());
    }
}
