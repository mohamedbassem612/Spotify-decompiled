package p;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.scrollsita.v1.Section;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class o471 implements Parcelable.Creator {
    public final /* synthetic */ byte a;

    public /* synthetic */ o471(byte b) {
        this.a = b;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        s4b1 s4b1VarX;
        switch (this.a) {
            case 0:
                parcel.readInt();
                return p471.d;
            case 1:
                parcel.readInt();
                return q471.d;
            case 2:
                parcel.readInt();
                return r471.d;
            case 3:
                parcel.readInt();
                return s471.d;
            case 4:
                parcel.readInt();
                return t471.d;
            case 5:
                parcel.readInt();
                return u471.d;
            case 6:
                parcel.readInt();
                return v471.d;
            case 7:
                parcel.readInt();
                return w471.d;
            case 8:
                parcel.readInt();
                return x471.d;
            case 9:
                parcel.readInt();
                return y471.d;
            case 10:
                parcel.readInt();
                return z471.d;
            case 11:
                parcel.readInt();
                return a571.d;
            case 12:
                parcel.readInt();
                return b571.d;
            case 13:
                parcel.readInt();
                return c571.d;
            case 14:
                parcel.readInt();
                return d571.d;
            case 15:
                parcel.readInt();
                return e571.d;
            case 16:
                parcel.readInt();
                return f571.d;
            case 17:
                parcel.readInt();
                return g571.d;
            case 18:
                parcel.readInt();
                return h571.d;
            case 19:
                parcel.readInt();
                return i571.d;
            case 20:
                parcel.readInt();
                return j571.d;
            case 21:
                parcel.readInt();
                return k571.d;
            case 22:
                parcel.readInt();
                return l571.d;
            case 23:
                parcel.readInt();
                return m571.d;
            case 24:
                parcel.readInt();
                return n571.d;
            case 25:
                return new p571((o571) parcel.readParcelable(p571.class.getClassLoader()), parcel.readInt() != 0);
            case 26:
                return k771.valueOf(parcel.readString());
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                return new t771((wa71) parcel.readParcelable(t771.class.getClassLoader()), parcel.readParcelable(t771.class.getClassLoader()));
            case 28:
                return new u771((t771) t771.CREATOR.createFromParcel(parcel), pz61.CREATOR.createFromParcel(parcel), bj71.CREATOR.createFromParcel(parcel));
            default:
                String string = parcel.readString();
                if (string != null) {
                    Set set = s4b1.f;
                    s4b1VarX = uic.x(string);
                } else {
                    s4b1VarX = null;
                }
                return new z771(s4b1VarX);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new p471[i];
            case 1:
                return new q471[i];
            case 2:
                return new r471[i];
            case 3:
                return new s471[i];
            case 4:
                return new t471[i];
            case 5:
                return new u471[i];
            case 6:
                return new v471[i];
            case 7:
                return new w471[i];
            case 8:
                return new x471[i];
            case 9:
                return new y471[i];
            case 10:
                return new z471[i];
            case 11:
                return new a571[i];
            case 12:
                return new b571[i];
            case 13:
                return new c571[i];
            case 14:
                return new d571[i];
            case 15:
                return new e571[i];
            case 16:
                return new f571[i];
            case 17:
                return new g571[i];
            case 18:
                return new h571[i];
            case 19:
                return new i571[i];
            case 20:
                return new j571[i];
            case 21:
                return new k571[i];
            case 22:
                return new l571[i];
            case 23:
                return new m571[i];
            case 24:
                return new n571[i];
            case 25:
                return new p571[i];
            case 26:
                return new k771[i];
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                return new t771[i];
            case 28:
                return new u771[i];
            default:
                return new z771[i];
        }
    }
}
