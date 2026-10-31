package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class jpb implements Parcelable {
    public static final Parcelable.Creator<jpb> CREATOR;
    public static final jpb a;
    public static final jpb b;
    public static final jpb c;
    public static final /* synthetic */ jpb[] d;

    static {
        jpb jpbVar = new jpb("DISABLED", 0);
        a = jpbVar;
        jpb jpbVar2 = new jpb("ENABLED_NO_NORMALIZATION", 1);
        b = jpbVar2;
        jpb jpbVar3 = new jpb("ENABLED_WITH_NORMALIZATION", 2);
        c = jpbVar3;
        d = new jpb[]{jpbVar, jpbVar2, jpbVar3};
        CREATOR = new mra((byte) 15);
    }

    public static jpb valueOf(String str) {
        return (jpb) Enum.valueOf(jpb.class, str);
    }

    public static jpb[] values() {
        return (jpb[]) d.clone();
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
