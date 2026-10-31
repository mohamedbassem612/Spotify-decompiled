package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class y9b1 implements mma1, Parcelable {
    public static final Parcelable.Creator<y9b1> CREATOR = new nja1((byte) 16);
    public final String a;
    public final String b;
    public final ArrayList c;

    public y9b1(String str, String str2, ArrayList arrayList) {
        this.a = str;
        this.b = str2;
        this.c = arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String getKey() {
        return this.a;
    }

    public final String toString() {
        String str = this.b;
        return str != null ? str : "";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeTypedList(this.c);
    }
}
