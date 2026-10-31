package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class so41 implements zo41 {
    public static final Parcelable.Creator<so41> CREATOR = new xw31((byte) 28);
    public final String a;
    public final List b;

    public so41(String str, List list) {
        this.a = str;
        this.b = list;
    }

    @Override // p.zo41
    public final String S() {
        return "ContextualAudio";
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof so41)) {
            return false;
        }
        so41 so41Var = (so41) obj;
        return u890.j(this.a, so41Var.a) && this.b.equals(so41Var.b);
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
            ((qpl) itM.next()).writeToParcel(parcel, i);
        }
    }
}
