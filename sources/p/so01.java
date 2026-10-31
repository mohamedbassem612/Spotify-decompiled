package p;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.recentlyplayed.recentlyplayed.RecentlyPlayedEntity;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
@lkn0
public final class so01 implements Parcelable.Creator<RecentlyPlayedEntity> {
    @Override // android.os.Parcelable.Creator
    public final RecentlyPlayedEntity createFromParcel(Parcel parcel) {
        Boolean boolValueOf;
        String string = parcel.readString();
        if (string == null) {
            hhg1.n("Required value was null.");
            return null;
        }
        String string2 = parcel.readString();
        if (string2 == null) {
            hhg1.n("Required value was null.");
            return null;
        }
        String string3 = parcel.readString();
        if (string3 == null) {
            hhg1.n("Required value was null.");
            return null;
        }
        String string4 = parcel.readString();
        if (string4 == null) {
            hhg1.n("Required value was null.");
            return null;
        }
        String string5 = parcel.readString();
        if (string5 == null) {
            hhg1.n("Required value was null.");
            return null;
        }
        String string6 = parcel.readString();
        if (string6 == null) {
            hhg1.n("Required value was null.");
            return null;
        }
        String string7 = parcel.readString();
        if (string7 == null) {
            hhg1.n("Required value was null.");
            return null;
        }
        String string8 = parcel.readString();
        if (string8 == null) {
            hhg1.n("Required value was null.");
            return null;
        }
        String string9 = parcel.readString();
        if (string9 == null) {
            hhg1.n("Required value was null.");
            return null;
        }
        String string10 = parcel.readString();
        if (string10 == null) {
            hhg1.n("Required value was null.");
            return null;
        }
        String string11 = parcel.readString();
        if (string11 == null) {
            hhg1.n("Required value was null.");
            return null;
        }
        String string12 = parcel.readString();
        if (string12 == null) {
            hhg1.n("Required value was null.");
            return null;
        }
        boolean z = false;
        boolean z2 = true;
        boolean z3 = parcel.readInt() != 0;
        if (parcel.readInt() != 0) {
            z = true;
        }
        if (parcel.readInt() == 0) {
            z2 = z;
        }
        if (parcel.readInt() != 0) {
            z = z2;
        }
        if (parcel.readInt() == 0) {
            z2 = z;
        }
        if (parcel.readInt() != 0) {
            z = z2;
        }
        int i = parcel.readInt();
        if (i != -1) {
            boolValueOf = Boolean.valueOf(i != 0 ? z2 : z);
        } else {
            boolValueOf = null;
        }
        return new RecentlyPlayedEntity(string, string2, string3, string4, string5, string6, string7, string8, string9, string10, string11, z3, z, z2, z, z2, z, parcel.readInt(), parcel.readInt(), parcel.readInt(), string12, gho1.o(parcel, bzn1.a), parcel.readString(), parcel.readString(), boolValueOf, parcel.readInt() != 0);
    }

    @Override // android.os.Parcelable.Creator
    public final RecentlyPlayedEntity[] newArray(int i) {
        return new RecentlyPlayedEntity[i];
    }

    public final nma0 serializer() {
        return ro01.a;
    }
}
