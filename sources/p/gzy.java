package p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class gzy implements Parcelable {
    public static final Parcelable.Creator<gzy> CREATOR;
    public static final gzy a;
    public static final gzy b;
    public static final gzy c;
    public static final gzy d;
    public static final gzy e;
    public static final gzy f;
    public static final gzy g;
    public static final /* synthetic */ gzy[] h;
    public static final /* synthetic */ t0z i;

    static {
        gzy gzyVar = new gzy("SHOW", 0);
        a = gzyVar;
        gzy gzyVar2 = new gzy("TRACK", 1);
        b = gzyVar2;
        gzy gzyVar3 = new gzy("ALBUM", 2);
        c = gzyVar3;
        gzy gzyVar4 = new gzy("ARTIST", 3);
        d = gzyVar4;
        gzy gzyVar5 = new gzy("EPISODE", 4);
        e = gzyVar5;
        gzy gzyVar6 = new gzy("AUDIOBOOK", 5);
        f = gzyVar6;
        gzy gzyVar7 = new gzy("PLAYLIST", 6);
        g = gzyVar7;
        gzy[] gzyVarArr = {gzyVar, gzyVar2, gzyVar3, gzyVar4, gzyVar5, gzyVar6, gzyVar7};
        h = gzyVarArr;
        i = new t0z(gzyVarArr);
        CREATOR = new jhy((byte) 17);
    }

    public static gzy valueOf(String str) {
        return (gzy) Enum.valueOf(gzy.class, str);
    }

    public static gzy[] values() {
        return (gzy[]) h.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(name());
    }
}
