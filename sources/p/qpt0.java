package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class qpt0 implements Parcelable {
    public static final Parcelable.Creator<qpt0> CREATOR;
    public static final qpt0 a;
    public static final qpt0 b;
    public static final qpt0 c;
    public static final qpt0 d;
    public static final /* synthetic */ qpt0[] e;

    static {
        qpt0 qpt0Var = new qpt0("OFF", 0);
        a = qpt0Var;
        qpt0 qpt0Var2 = new qpt0("AUDIO", 1);
        b = qpt0Var2;
        qpt0 qpt0Var3 = new qpt0("VIDEO", 2);
        c = qpt0Var3;
        qpt0 qpt0Var4 = new qpt0("ALL", 3);
        d = qpt0Var4;
        e = new qpt0[]{qpt0Var, qpt0Var2, qpt0Var3, qpt0Var4};
        CREATOR = new r7t0((byte) 28);
    }

    public static qpt0 valueOf(String str) {
        return (qpt0) Enum.valueOf(qpt0.class, str);
    }

    public static qpt0[] values() {
        return (qpt0[]) e.clone();
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
