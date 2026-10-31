package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class k89 implements Parcelable {
    public static final Parcelable.Creator<k89> CREATOR;
    public static final k89 a;
    public static final k89 b;
    public static final k89 c;
    public static final /* synthetic */ k89[] d;

    static {
        k89 k89Var = new k89("DISABLED", 0);
        a = k89Var;
        k89 k89Var2 = new k89("ENABLED", 1);
        b = k89Var2;
        k89 k89Var3 = new k89("ENABLED_EXCLUSIVE", 2);
        c = k89Var3;
        d = new k89[]{k89Var, k89Var2, k89Var3};
        CREATOR = new so8((byte) 24);
    }

    public static k89 valueOf(String str) {
        return (k89) Enum.valueOf(k89.class, str);
    }

    public static k89[] values() {
        return (k89[]) d.clone();
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
