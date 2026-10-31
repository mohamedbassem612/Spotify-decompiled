package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class pia1 implements Parcelable {
    public static final Parcelable.Creator<pia1> CREATOR;
    public static final pia1 a;
    public static final List b;
    public static final pia1 c;
    public static final pia1 d;
    public static final pia1 e;
    public static final pia1 f;
    public static final /* synthetic */ pia1[] g;

    static {
        pia1 pia1Var = new pia1("NAME", 0);
        c = pia1Var;
        pia1 pia1Var2 = new pia1("ADD_TIME", 1);
        d = pia1Var2;
        pia1 pia1Var3 = new pia1("RECENTLY_UPDATED", 2);
        e = pia1Var3;
        pia1 pia1Var4 = new pia1("RECENTLY_PLAYED_RANK", 3);
        f = pia1Var4;
        g = new pia1[]{pia1Var, pia1Var2, pia1Var3, pia1Var4};
        CREATOR = new yx81((byte) 29);
        a = pia1Var3;
        b = p7h.M(new pia1[]{pia1Var3, pia1Var2, pia1Var, pia1Var4});
    }

    public static pia1 valueOf(String str) {
        return (pia1) Enum.valueOf(pia1.class, str);
    }

    public static pia1[] values() {
        return (pia1[]) g.clone();
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
