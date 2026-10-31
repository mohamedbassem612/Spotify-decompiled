package p;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class zcs0 implements Parcelable {
    public static final Parcelable.Creator<zcs0> CREATOR = new ybs0((byte) 9);
    public final String[] a;

    public zcs0(String str) {
        int i = 0;
        if (str == null || str.isEmpty()) {
            this.a = new String[0];
            return;
        }
        this.a = str.split(";");
        while (true) {
            String[] strArr = this.a;
            if (i >= strArr.length) {
                return;
            }
            strArr[i] = strArr[i].trim();
            i++;
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
        if (obj instanceof zcs0) {
            return Arrays.equals(this.a, ((zcs0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final String toString() {
        return TextUtils.join(";", this.a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringArray(this.a);
    }

    public zcs0(Parcel parcel) {
        this.a = parcel.createStringArray();
    }
}
