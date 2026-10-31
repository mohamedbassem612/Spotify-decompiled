package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class xm21 implements Parcelable {
    public static final Parcelable.Creator<xm21> CREATOR;
    public static final xm21 a;
    public static final xm21 b;
    public static final /* synthetic */ xm21[] c;

    static {
        xm21 xm21Var = new xm21("LYRICS", 0);
        a = xm21Var;
        xm21 xm21Var2 = new xm21("TRANSLATION", 1);
        b = xm21Var2;
        c = new xm21[]{xm21Var, xm21Var2};
        CREATOR = new g321((byte) 11);
    }

    public static xm21 valueOf(String str) {
        return (xm21) Enum.valueOf(xm21.class, str);
    }

    public static xm21[] values() {
        return (xm21[]) c.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
