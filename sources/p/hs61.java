package p;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.scrollsita.v1.Section;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class hs61 implements Parcelable.Creator {
    public final /* synthetic */ byte a;

    public /* synthetic */ hs61(byte b) {
        this.a = b;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i;
        s4b1 s4b1VarX;
        int iF = 0;
        switch (this.a) {
            case 0:
                return new is61(parcel.readInt(), parcel.readInt());
            case 1:
                p6r0 serializable = parcel.readSerializable();
                gu61 parcelable = parcel.readParcelable(os61.class.getClassLoader());
                String string = parcel.readString();
                if (parcel.readInt() == 0) {
                    i = 0;
                } else {
                    String string2 = parcel.readString();
                    if (string2 == null) {
                        bhn0.i("Name is null");
                    } else if (!string2.equals("SEARCH")) {
                        hhg1.n("No enum constant com.spotify.settings.platform.page.main.SettingsPageParameters.Source.".concat(string2));
                    }
                    i = 1;
                }
                return new os61(serializable, parcelable, string, i, null);
            case 2:
                return new ps61(parcel.readString(), parcel.readString());
            case 3:
                return new mt61(parcel.readParcelable(mt61.class.getClassLoader()), parcel.readInt() != 0);
            case 4:
                return new nt61(parcel.readString());
            case 5:
                return new wt61(parcel.readSerializable(), parcel.readString());
            case 6:
                return new gu61(parcel.readString());
            case 7:
                return new lu61(parcel.readSerializable(), parcel.readParcelable(lu61.class.getClassLoader()), parcel.readInt() != 0);
            case 8:
                return yv61.valueOf(parcel.readString());
            case 9:
                return new vx61(parcel.readParcelable(vx61.class.getClassLoader()), parcel.readLong(), wls0.valueOf(parcel.readString()));
            case 10:
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                int i2 = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i2);
                while (iF != i2) {
                    iF = cfm0.f(parcel, linkedHashMap, parcel.readString(), iF, 1);
                }
                return new zx61(string3, string4, string5, string6, linkedHashMap, j9h.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, ((vve1) parcel.readParcelable(zx61.class.getClassLoader())).a);
            case 11:
                int iD = 0;
                String string7 = parcel.readString();
                String string8 = parcel.readString();
                String string9 = parcel.readString();
                String string10 = parcel.readString();
                int i3 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(i3);
                int iF2 = 0;
                while (iF2 != i3) {
                    iF2 = cfm0.f(parcel, linkedHashMap2, parcel.readString(), iF2, 1);
                }
                cqs0 cqs0VarG = mqo1.G(linkedHashMap2);
                int i4 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i4);
                int iD2 = 0;
                while (iD2 != i4) {
                    iD2 = dsl0.d(k9h.CREATOR, parcel, arrayList, iD2, 1);
                }
                c9 c9VarF = mqo1.F(arrayList);
                int i5 = parcel.readInt();
                bef0 parcelable2 = parcel.readParcelable(ay61.class.getClassLoader());
                boolean z = parcel.readInt() != 0;
                int iT = pze0.t(parcel.readString());
                int i6 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i6);
                while (iD != i6) {
                    iD = dsl0.d(opf0.CREATOR, parcel, arrayList2, iD, 1);
                }
                return new ay61(string7, string8, string9, string10, cqs0VarG, c9VarF, i5, parcelable2, z, iT, mqo1.F(arrayList2), (gy71) (parcel.readInt() == 0 ? null : gy71.CREATOR.createFromParcel(parcel)), parcel.readString());
            case 12:
                return new zy61(parcel.readFloat(), parcel.readFloat());
            case 13:
                parcel.readInt();
                return az61.d;
            case 14:
                parcel.readInt();
                return bz61.d;
            case 15:
                parcel.readInt();
                return cz61.d;
            case 16:
                parcel.readInt();
                return dz61.d;
            case 17:
                z771 parcelable3 = parcel.readParcelable(qz61.class.getClassLoader());
                String string11 = parcel.readString();
                if (string11 != null) {
                    Set set = s4b1.f;
                    s4b1VarX = uic.x(string11);
                } else {
                    s4b1VarX = null;
                }
                return new qz61(parcelable3, s4b1VarX, (zsd) parcel.readParcelable(qz61.class.getClassLoader()));
            case 18:
                return new pz61(y171.CREATOR.createFromParcel(parcel), (c871) parcel.readParcelable(pz61.class.getClassLoader()), (ez61) parcel.readParcelable(pz61.class.getClassLoader()), parcel.readInt() != 0);
            case 19:
                return new s171(parcel.readString(), parcel.readParcelable(s171.class.getClassLoader()));
            case 20:
                String string12 = parcel.readString();
                return new y171(string12 == null ? null : rc11.a.b(Class.forName(string12)));
            case 21:
                int i7 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i7);
                while (iF != i7) {
                    iF = dsl0.d(r271.CREATOR, parcel, arrayList3, iF, 1);
                }
                return new s271(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), arrayList3);
            case 22:
                return new r271(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 23:
                int i8 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i8);
                while (iF != i8) {
                    iF = x0d.h(g371.class, parcel, arrayList4, iF, 1);
                }
                return new g371(arrayList4);
            case 24:
                parcel.readInt();
                return d371.a;
            case 25:
                return new e371((cmt) parcel.readParcelable(e371.class.getClassLoader()), ((w871) parcel.readParcelable(e371.class.getClassLoader())).a);
            case 26:
                wa71 wa71VarCreateFromParcel = parcel.readInt() == 0 ? null : wa71.CREATOR.createFromParcel(parcel);
                Bundle bundle = parcel.readBundle(k371.class.getClassLoader());
                xm71 xm71Var = (xm71) parcel.readParcelable(k371.class.getClassLoader());
                int i9 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(i9);
                while (iF != i9) {
                    iF = x0d.h(k371.class, parcel, arrayList5, iF, 1);
                }
                return new k371(wa71VarCreateFromParcel, bundle, xm71Var, arrayList5);
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                return new w371(parcel.readString(), parcel.readString());
            case 28:
                parcel.readInt();
                return m471.d;
            default:
                parcel.readInt();
                return n471.d;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new is61[i];
            case 1:
                return new os61[i];
            case 2:
                return new ps61[i];
            case 3:
                return new mt61[i];
            case 4:
                return new nt61[i];
            case 5:
                return new wt61[i];
            case 6:
                return new gu61[i];
            case 7:
                return new lu61[i];
            case 8:
                return new yv61[i];
            case 9:
                return new vx61[i];
            case 10:
                return new zx61[i];
            case 11:
                return new ay61[i];
            case 12:
                return new zy61[i];
            case 13:
                return new az61[i];
            case 14:
                return new bz61[i];
            case 15:
                return new cz61[i];
            case 16:
                return new dz61[i];
            case 17:
                return new qz61[i];
            case 18:
                return new pz61[i];
            case 19:
                return new s171[i];
            case 20:
                return new y171[i];
            case 21:
                return new s271[i];
            case 22:
                return new r271[i];
            case 23:
                return new g371[i];
            case 24:
                return new d371[i];
            case 25:
                return new e371[i];
            case 26:
                return new k371[i];
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                return new w371[i];
            case 28:
                return new m471[i];
            default:
                return new n471[i];
        }
    }
}
