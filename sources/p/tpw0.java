package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class tpw0 implements Parcelable {
    public static final Parcelable.Creator<tpw0> CREATOR;
    public static final tpw0 a;
    public static final tpw0 b;
    public static final tpw0 c;
    public static final tpw0 d;
    public static final tpw0 e;
    public static final /* synthetic */ tpw0[] f;

    static {
        tpw0 tpw0Var = new tpw0("Unknown", 0);
        a = tpw0Var;
        tpw0 tpw0Var2 = new tpw0("Coppa", 1);
        b = tpw0Var2;
        tpw0 tpw0Var3 = new tpw0("Non", 2);
        c = tpw0Var3;
        tpw0 tpw0Var4 = new tpw0("Implicit", 3);
        d = tpw0Var4;
        tpw0 tpw0Var5 = new tpw0("Explicit", 4);
        e = tpw0Var5;
        f = new tpw0[]{tpw0Var, tpw0Var2, tpw0Var3, tpw0Var4, tpw0Var5};
        CREATOR = new w7w0((byte) 20);
    }

    public static tpw0 valueOf(String str) {
        return (tpw0) Enum.valueOf(tpw0.class, str);
    }

    public static tpw0[] values() {
        return (tpw0[]) f.clone();
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
