package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ym51 implements Parcelable {
    public static final Parcelable.Creator<ym51> CREATOR;
    public static final ym51 a;
    public static final ym51 b;
    public static final ym51 c;
    public static final /* synthetic */ ym51[] d;

    static {
        ym51 ym51Var = new ym51("NO_PREFETCH", 0);
        a = ym51Var;
        ym51 ym51Var2 = new ym51("CONCURRENT_MAX_5", 1);
        b = ym51Var2;
        ym51 ym51Var3 = new ym51("BATCH_5", 2);
        c = ym51Var3;
        d = new ym51[]{ym51Var, ym51Var2, ym51Var3};
        CREATOR = new ge51((byte) 9);
    }

    public static ym51 valueOf(String str) {
        return (ym51) Enum.valueOf(ym51.class, str);
    }

    public static ym51[] values() {
        return (ym51[]) d.clone();
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
