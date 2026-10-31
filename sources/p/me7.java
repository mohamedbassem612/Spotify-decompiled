package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class me7 implements Parcelable {
    public static final Parcelable.Creator<me7> CREATOR;
    public static final me7 a;
    public static final me7 b;
    public static final me7 c;
    public static final /* synthetic */ me7[] d;

    static {
        me7 me7Var = new me7("SINGLE_ADD", 0);
        a = me7Var;
        me7 me7Var2 = new me7("SINGLE_SELECT", 1);
        b = me7Var2;
        me7 me7Var3 = new me7("MULTI_ADD", 2);
        c = me7Var3;
        d = new me7[]{me7Var, me7Var2, me7Var3};
        CREATOR = new f67((byte) 15);
    }

    public static me7 valueOf(String str) {
        return (me7) Enum.valueOf(me7.class, str);
    }

    public static me7[] values() {
        return (me7[]) d.clone();
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
