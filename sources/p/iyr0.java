package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class iyr0 implements Parcelable {
    public static final Parcelable.Creator<iyr0> CREATOR;
    public static final iyr0 a;
    public static final iyr0 b;
    public static final /* synthetic */ iyr0[] c;

    static {
        iyr0 iyr0Var = new iyr0("ALLOWLIST", 0);
        a = iyr0Var;
        iyr0 iyr0Var2 = new iyr0("BLOCKLIST", 1);
        b = iyr0Var2;
        c = new iyr0[]{iyr0Var, iyr0Var2};
        CREATOR = new zsr0((byte) 10);
    }

    public static iyr0 valueOf(String str) {
        return (iyr0) Enum.valueOf(iyr0.class, str);
    }

    public static iyr0[] values() {
        return (iyr0[]) c.clone();
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
