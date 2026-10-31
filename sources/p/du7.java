package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class du7 implements Parcelable {
    public static final Parcelable.Creator<du7> CREATOR;
    public static final du7 a;
    public static final du7 b;
    public static final du7 c;
    public static final /* synthetic */ du7[] d;

    static {
        du7 du7Var = new du7("UNSPECIFIED", 0);
        a = du7Var;
        du7 du7Var2 = new du7("TALK", 1);
        b = du7Var2;
        du7 du7Var3 = new du7("MUSIC", 2);
        c = du7Var3;
        d = new du7[]{du7Var, du7Var2, du7Var3};
        CREATOR = new bu7((byte) 1);
    }

    public static du7 valueOf(String str) {
        return (du7) Enum.valueOf(du7.class, str);
    }

    public static du7[] values() {
        return (du7[]) d.clone();
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
