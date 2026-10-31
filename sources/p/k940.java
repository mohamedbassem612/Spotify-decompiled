package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class k940 implements Parcelable {
    public static final Parcelable.Creator<k940> CREATOR;
    public static final k940 a;
    public static final k940 b;
    public static final /* synthetic */ k940[] c;

    static {
        k940 k940Var = new k940("UNSPECIFIED", 0);
        a = k940Var;
        k940 k940Var2 = new k940("PREMIUM", 1);
        b = k940Var2;
        c = new k940[]{k940Var, k940Var2};
        CREATOR = new xt30((byte) 16);
    }

    public static k940 valueOf(String str) {
        return (k940) Enum.valueOf(k940.class, str);
    }

    public static k940[] values() {
        return (k940[]) c.clone();
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
