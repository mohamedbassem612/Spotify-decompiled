package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class h3i0 implements Parcelable {
    public static final Parcelable.Creator<h3i0> CREATOR;
    public static final h3i0 a;
    public static final h3i0 b;
    public static final h3i0 c;
    public static final /* synthetic */ h3i0[] d;

    static {
        h3i0 h3i0Var = new h3i0("PLAYING", 0);
        a = h3i0Var;
        h3i0 h3i0Var2 = new h3i0("PAUSED", 1);
        b = h3i0Var2;
        h3i0 h3i0Var3 = new h3i0("STOPPED", 2);
        c = h3i0Var3;
        d = new h3i0[]{h3i0Var, h3i0Var2, h3i0Var3};
        CREATOR = new cyh0((byte) 2);
    }

    public static h3i0 valueOf(String str) {
        return (h3i0) Enum.valueOf(h3i0.class, str);
    }

    public static h3i0[] values() {
        return (h3i0[]) d.clone();
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
