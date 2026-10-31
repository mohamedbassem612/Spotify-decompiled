package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class stu0 extends u9 {
    public static final Parcelable.Creator<stu0> CREATOR = new brt0((byte) 25);
    public final Set a;

    public stu0(Set set) {
        this.a = set;
    }

    @Override // p.u9, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof stu0) && u890.j(this.a, ((stu0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final Set j() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator itH = k4s0.h(this.a, parcel);
        while (itH.hasNext()) {
            parcel.writeString((String) itH.next());
        }
    }
}
