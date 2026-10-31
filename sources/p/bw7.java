package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class bw7 implements Parcelable {
    public static final Parcelable.Creator<bw7> CREATOR = new bu7((byte) 3);
    public final String a;
    public final List b;

    public bw7(String str, List list) {
        this.a = str;
        this.b = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bw7)) {
            return false;
        }
        bw7 bw7Var = (bw7) obj;
        return u890.j(this.a, bw7Var.a) && u890.j(this.b, bw7Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        Iterator itM = kk0.m(parcel, this.b);
        while (itM.hasNext()) {
            ((aw7) itM.next()).writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ bw7() {
        this("", z6x.a);
    }
}
