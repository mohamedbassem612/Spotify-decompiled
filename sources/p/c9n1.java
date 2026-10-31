package p;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class c9n1 extends u9 implements p331 {
    public static final Parcelable.Creator<c9n1> CREATOR = new e9n1((byte) 1);
    public final List a;
    public final String b;

    public c9n1(ArrayList arrayList, String str) {
        this.a = arrayList;
        this.b = str;
    }

    public final Status getStatus() {
        return this.b != null ? Status.e : Status.i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = j541.L(20293, parcel);
        j541.H(parcel, 1, this.a);
        j541.F(parcel, 2, this.b);
        j541.M(iL, parcel);
    }
}
