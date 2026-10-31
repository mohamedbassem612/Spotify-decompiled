package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class bsc1 implements Parcelable {
    public static final Parcelable.Creator<bsc1> CREATOR = new y7c1(26);
    public final String a;
    public final List b;

    public bsc1(String str, List list) {
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
        if (!(obj instanceof bsc1)) {
            return false;
        }
        bsc1 bsc1Var = (bsc1) obj;
        return u890.j(this.a, bsc1Var.a) && u890.j(this.b, bsc1Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        Iterator itM = kk0.m(parcel, this.b);
        while (itM.hasNext()) {
            ((asc1) itM.next()).writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ bsc1() {
        this(null, z6x.a);
    }
}
