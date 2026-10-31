package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class xx8 implements Parcelable {
    public static final Parcelable.Creator<xx8> CREATOR;
    public static final xx8 a;
    public static final xx8 b;
    public static final /* synthetic */ xx8[] c;

    static {
        xx8 xx8Var = new xx8("CORE", 0);
        a = xx8Var;
        xx8 xx8Var2 = new xx8("BACKEND", 1);
        b = xx8Var2;
        c = new xx8[]{xx8Var, xx8Var2};
        CREATOR = new so8((byte) 1);
    }

    public static xx8 valueOf(String str) {
        return (xx8) Enum.valueOf(xx8.class, str);
    }

    public static xx8[] values() {
        return (xx8[]) c.clone();
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
