package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class q2c0 implements Parcelable {
    public static final Parcelable.Creator<q2c0> CREATOR;
    public static final q2c0 a;
    public static final q2c0 b;
    public static final q2c0 c;
    public static final q2c0 d;
    public static final /* synthetic */ q2c0[] e;

    static {
        q2c0 q2c0Var = new q2c0("CHECKBOX", 0);
        a = q2c0Var;
        q2c0 q2c0Var2 = new q2c0("TEXT", 1);
        b = q2c0Var2;
        q2c0 q2c0Var3 = new q2c0("CONSPICUOUS_TEXT", 2);
        c = q2c0Var3;
        q2c0 q2c0Var4 = new q2c0("CONSPICUOUS_CHECKBOX", 3);
        d = q2c0Var4;
        e = new q2c0[]{q2c0Var, q2c0Var2, q2c0Var3, q2c0Var4};
        CREATOR = new cwb0((byte) 5);
    }

    public static q2c0 valueOf(String str) {
        return (q2c0) Enum.valueOf(q2c0.class, str);
    }

    public static q2c0[] values() {
        return (q2c0[]) e.clone();
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
