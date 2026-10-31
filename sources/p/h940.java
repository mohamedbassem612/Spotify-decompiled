package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class h940 implements Parcelable {
    public static final Parcelable.Creator<h940> CREATOR;
    public static final h940 a;
    public static final h940 b;
    public static final /* synthetic */ h940[] c;

    static {
        h940 h940Var = new h940("UNSPECIFIED", 0);
        a = h940Var;
        h940 h940Var2 = new h940("ENTITLEMENT_MISSING", 1);
        b = h940Var2;
        c = new h940[]{h940Var, h940Var2};
        CREATOR = new xt30((byte) 15);
    }

    public static h940 valueOf(String str) {
        return (h940) Enum.valueOf(h940.class, str);
    }

    public static h940[] values() {
        return (h940[]) c.clone();
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
