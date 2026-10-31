package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class m571 extends o571 {
    public static final m571 d = new m571(3, "whatsapp-status");
    public static final Parcelable.Creator<m571> CREATOR = new o471((byte) 23);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof m571);
    }

    public final int hashCode() {
        return -816244738;
    }

    public final String toString() {
        return "WhatsappStatus";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
