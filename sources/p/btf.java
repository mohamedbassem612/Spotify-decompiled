package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class btf implements ctf {
    public static final Parcelable.Creator<btf> CREATOR = new zsf((byte) 1);
    public final String a;
    public final List b;

    public btf(String str, List list) {
        this.a = str;
        this.b = list;
    }

    public final String U() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof btf)) {
            return false;
        }
        btf btfVar = (btf) obj;
        return u890.j(this.a, btfVar.a) && u890.j(this.b, btfVar.b);
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
            ((oe90) itM.next()).writeToParcel(parcel, i);
        }
    }
}
