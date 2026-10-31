package p;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.scrollsita.v1.Section;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class nhj1 implements Parcelable.Creator {
    public final /* synthetic */ byte a;

    public /* synthetic */ nhj1(byte b) {
        this.a = b;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iH = 0;
        switch (this.a) {
            case 0:
                parcel.readInt();
                return ohj1.a;
            case 1:
                return new rhj1(parcel.readString(), parcel.readString(), (jlw0) parcel.readParcelable(rhj1.class.getClassLoader()), (jlw0) parcel.readParcelable(rhj1.class.getClassLoader()), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readParcelable(rhj1.class.getClassLoader()), ((vve1) parcel.readParcelable(rhj1.class.getClassLoader())).a, parcel.readInt() != 0, (phj1) parcel.readParcelable(rhj1.class.getClassLoader()), 2048);
            case 2:
                return new shj1((jlw0) parcel.readParcelable(shj1.class.getClassLoader()), (jlw0) parcel.readParcelable(shj1.class.getClassLoader()), parcel.readInt(), parcel.readInt(), parcel.readString(), ((vve1) parcel.readParcelable(shj1.class.getClassLoader())).a, parcel.readInt() != 0, parcel.readString(), parcel.readString());
            case 3:
                return new xjj1(xcg1.r(parcel.readString()));
            case 4:
                return new b0k1(parcel.readString());
            case 5:
                return new f1k1(parcel.readString());
            case 6:
                return new g2k1(parcel.readString());
            case 7:
                return new h2k1(parcel.readString());
            case 8:
                return new i2k1(parcel.readString());
            case 9:
                parcel.readInt();
                return n5k1.a;
            case 10:
                return new o5k1((Uri) parcel.readParcelable(o5k1.class.getClassLoader()), parcel.readString(), (wkt) parcel.readParcelable(o5k1.class.getClassLoader()));
            case 11:
                parcel.readInt();
                return p5k1.a;
            case 12:
                return new s5k1(parcel.readString(), (jlw0) parcel.readParcelable(s5k1.class.getClassLoader()), (jlw0) parcel.readParcelable(s5k1.class.getClassLoader()), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), (s171) parcel.readParcelable(s5k1.class.getClassLoader()), parcel.readParcelable(s5k1.class.getClassLoader()), ((vve1) parcel.readParcelable(s5k1.class.getClassLoader())).a, (Uri) parcel.readParcelable(s5k1.class.getClassLoader()), parcel.readInt() != 0, (vve1) parcel.readParcelable(s5k1.class.getClassLoader()), (q5k1) parcel.readParcelable(s5k1.class.getClassLoader()), parcel.readString(), parcel.readString(), 16384);
            case 13:
                return new u5k1((jlw0) parcel.readParcelable(u5k1.class.getClassLoader()), (jlw0) parcel.readParcelable(u5k1.class.getClassLoader()), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), (s171) parcel.readParcelable(u5k1.class.getClassLoader()), ((vve1) parcel.readParcelable(u5k1.class.getClassLoader())).a, (vve1) parcel.readParcelable(u5k1.class.getClassLoader()), (Uri) parcel.readParcelable(u5k1.class.getClassLoader()), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString());
            case 14:
                return new b7k1(parcel.readString());
            case 15:
                parcel.readInt();
                return dfk1.a;
            case 16:
                parcel.readInt();
                return efk1.a;
            case 17:
                parcel.readInt();
                return ffk1.a;
            case 18:
                parcel.readInt();
                return gfk1.a;
            case 19:
                String string = parcel.readString();
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                while (iH != i) {
                    iH = x0d.h(hfk1.class, parcel, arrayList, iH, 1);
                }
                return new hfk1(string, arrayList, parcel.readString(), parcel.readString(), parcel.readString(), (rfk1) (parcel.readInt() == 0 ? null : rfk1.CREATOR.createFromParcel(parcel)));
            case 20:
                parcel.readInt();
                return ifk1.a;
            case 21:
                parcel.readInt();
                return jfk1.a;
            case 22:
                return new kfk1(parcel.readString());
            case 23:
                parcel.readInt();
                return lfk1.a;
            case 24:
                return new nfk1(parcel.readString(), parcel.readParcelable(nfk1.class.getClassLoader()));
            case 25:
                return new ofk1(parcel.readString(), parcel.readString(), (nfk1) (parcel.readInt() == 0 ? null : nfk1.CREATOR.createFromParcel(parcel)), (nfk1) (parcel.readInt() != 0 ? nfk1.CREATOR.createFromParcel(parcel) : null));
            case 26:
                return new pfk1(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                return new rfk1(parcel.readString(), parcel.readString(), (qfk1) (parcel.readInt() != 0 ? qfk1.CREATOR.createFromParcel(parcel) : null), parcel.readString());
            case 28:
                return new qfk1(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            default:
                parcel.readInt();
                return sfk1.a;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new ohj1[i];
            case 1:
                return new rhj1[i];
            case 2:
                return new shj1[i];
            case 3:
                return new xjj1[i];
            case 4:
                return new b0k1[i];
            case 5:
                return new f1k1[i];
            case 6:
                return new g2k1[i];
            case 7:
                return new h2k1[i];
            case 8:
                return new i2k1[i];
            case 9:
                return new n5k1[i];
            case 10:
                return new o5k1[i];
            case 11:
                return new p5k1[i];
            case 12:
                return new s5k1[i];
            case 13:
                return new u5k1[i];
            case 14:
                return new b7k1[i];
            case 15:
                return new dfk1[i];
            case 16:
                return new efk1[i];
            case 17:
                return new ffk1[i];
            case 18:
                return new gfk1[i];
            case 19:
                return new hfk1[i];
            case 20:
                return new ifk1[i];
            case 21:
                return new jfk1[i];
            case 22:
                return new kfk1[i];
            case 23:
                return new lfk1[i];
            case 24:
                return new nfk1[i];
            case 25:
                return new ofk1[i];
            case 26:
                return new pfk1[i];
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                return new rfk1[i];
            case 28:
                return new qfk1[i];
            default:
                return new sfk1[i];
        }
    }
}
