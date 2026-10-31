package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class kr50 implements Parcelable {
    public static final Parcelable.Creator<kr50> CREATOR;
    public static final kr50 a;
    public static final kr50 b;
    public static final kr50 c;
    public static final /* synthetic */ kr50[] d;

    static {
        kr50 kr50Var = new kr50("DISABLED", 0);
        a = kr50Var;
        kr50 kr50Var2 = new kr50("ENABLED", 1);
        b = kr50Var2;
        kr50 kr50Var3 = new kr50("ENABLED_EXCLUSIVE", 2);
        c = kr50Var3;
        d = new kr50[]{kr50Var, kr50Var2, kr50Var3};
        CREATOR = new xk50((byte) 7);
    }

    public static kr50 valueOf(String str) {
        return (kr50) Enum.valueOf(kr50.class, str);
    }

    public static kr50[] values() {
        return (kr50[]) d.clone();
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
