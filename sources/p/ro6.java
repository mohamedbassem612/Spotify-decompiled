package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
@o661
public final class ro6 implements Parcelable {
    public final List a;
    public static final qo6 Companion = new qo6();
    public static final Parcelable.Creator<ro6> CREATOR = new fp5((byte) 14);
    public static final znb0[] b = {dm5.S(2, ng5.W0)};

    public /* synthetic */ ro6(int i, List list) {
        if ((i & 1) == 0) {
            this.a = z6x.a;
        } else {
            this.a = list;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ro6) && u890.j(this.a, ((ro6) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator itM = kk0.m(parcel, this.a);
        while (itM.hasNext()) {
            ((lo6) itM.next()).writeToParcel(parcel, i);
        }
    }

    public ro6(ArrayList arrayList) {
        this.a = arrayList;
    }
}
