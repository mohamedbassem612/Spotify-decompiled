package p;

import android.os.BadParcelableException;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class kqt implements Parcelable {
    public static final Parcelable.Creator<kqt> CREATOR = new qms((byte) 28);
    public String a;
    public String b;
    public long c = 0;

    public final void a(Parcel parcel) {
        int iDataPosition = parcel.dataPosition();
        int i = parcel.readInt();
        try {
            if (i < 4) {
                throw new BadParcelableException("Parcelable too small");
            }
            if (parcel.dataPosition() - iDataPosition >= i) {
                if (iDataPosition > Integer.MAX_VALUE - i) {
                    throw new BadParcelableException("Overflow in the size of parcelable");
                }
                parcel.setDataPosition(iDataPosition + i);
                return;
            }
            this.a = parcel.readString();
            if (parcel.dataPosition() - iDataPosition >= i) {
                if (iDataPosition > Integer.MAX_VALUE - i) {
                    throw new BadParcelableException("Overflow in the size of parcelable");
                }
                parcel.setDataPosition(iDataPosition + i);
                return;
            }
            this.b = parcel.readString();
            if (parcel.dataPosition() - iDataPosition >= i) {
                if (iDataPosition > Integer.MAX_VALUE - i) {
                    throw new BadParcelableException("Overflow in the size of parcelable");
                }
                parcel.setDataPosition(iDataPosition + i);
            } else {
                this.c = parcel.readLong();
                if (iDataPosition > Integer.MAX_VALUE - i) {
                    throw new BadParcelableException("Overflow in the size of parcelable");
                }
                parcel.setDataPosition(iDataPosition + i);
            }
        } catch (Throwable th) {
            if (iDataPosition > Integer.MAX_VALUE - i) {
                throw new BadParcelableException("Overflow in the size of parcelable");
            }
            parcel.setDataPosition(iDataPosition + i);
            throw th;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iDataPosition = parcel.dataPosition();
        parcel.writeInt(0);
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeLong(this.c);
        int iDataPosition2 = parcel.dataPosition();
        parcel.setDataPosition(iDataPosition);
        parcel.writeInt(iDataPosition2 - iDataPosition);
        parcel.setDataPosition(iDataPosition2);
    }
}
