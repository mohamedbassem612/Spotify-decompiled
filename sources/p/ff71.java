package p;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.scrollsita.v1.Section;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ff71 implements Parcelable.Creator {
    public final /* synthetic */ byte a;

    public /* synthetic */ ff71(byte b) {
        this.a = b;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iH = 0;
        switch (this.a) {
            case 0:
                return new gf71(parcel.readString(), parcel.readString(), ((w871) parcel.readParcelable(gf71.class.getClassLoader())).a, (te71) parcel.readParcelable(gf71.class.getClassLoader()), (hl71) parcel.readParcelable(gf71.class.getClassLoader()));
            case 1:
                return new hf71(parcel.readString(), parcel.readParcelable(hf71.class.getClassLoader()));
            case 2:
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                while (iH != i) {
                    iH = x0d.h(vg71.class, parcel, arrayList, iH, 1);
                }
                return new vg71(arrayList);
            case 3:
                parcel.readInt();
                return wg71.a;
            case 4:
                return new zg71((hl71) parcel.readParcelable(zg71.class.getClassLoader()), (k371) parcel.readParcelable(zg71.class.getClassLoader()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), (te71) parcel.readParcelable(zg71.class.getClassLoader()), (xg71) parcel.readParcelable(zg71.class.getClassLoader()), (yg71) (parcel.readInt() != 0 ? yg71.CREATOR.createFromParcel(parcel) : null), (va71) parcel.readParcelable(zg71.class.getClassLoader()), parcel.readParcelable(zg71.class.getClassLoader()));
            case 5:
                return new yg71((o571) parcel.readParcelable(yg71.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0);
            case 6:
                return new th71(parcel.readString(), parcel.readString(), parcel.readString(), (dz) parcel.readParcelable(th71.class.getClassLoader()), (dz) parcel.readParcelable(th71.class.getClassLoader()));
            case 7:
                parcel.readInt();
                return fi71.a;
            case 8:
                hl71 hl71Var = (hl71) parcel.readParcelable(gi71.class.getClassLoader());
                int i2 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i2);
                while (iH != i2) {
                    iH = x0d.h(gi71.class, parcel, arrayList2, iH, 1);
                }
                return new gi71(hl71Var, arrayList2, (cmt) parcel.readParcelable(gi71.class.getClassLoader()), parcel.readString(), parcel.readString(), ((w871) parcel.readParcelable(gi71.class.getClassLoader())).a, (va71) parcel.readParcelable(gi71.class.getClassLoader()), (te71) parcel.readParcelable(gi71.class.getClassLoader()));
            case 9:
                parcel.readInt();
                return hi71.a;
            case 10:
                parcel.readInt();
                return si71.a;
            case 11:
                int i3 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i3);
                int iH2 = 0;
                while (iH2 != i3) {
                    iH2 = x0d.h(ui71.class, parcel, arrayList3, iH2, 1);
                }
                return new ui71(arrayList3, (hl71) parcel.readParcelable(ui71.class.getClassLoader()), parcel.readString(), parcel.readString(), ((w871) parcel.readParcelable(ui71.class.getClassLoader())).a, parcel.readInt() != 0, ti71.valueOf(parcel.readString()), (te71) parcel.readParcelable(ui71.class.getClassLoader()));
            case 12:
                parcel.readInt();
                return vi71.a;
            case 13:
                int i4 = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i4);
                for (int i5 = 0; i5 != i4; i5++) {
                    linkedHashSet.add(parcel.readParcelable(bj71.class.getClassLoader()));
                }
                return new bj71(linkedHashSet, parcel.readInt() != 0, parcel.readString());
            case 14:
                return new gj71(parcel.readParcelable(gj71.class.getClassLoader()));
            case 15:
                int i6 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i6);
                int iH3 = 0;
                while (iH3 != i6) {
                    iH3 = x0d.h(ok71.class, parcel, arrayList4, iH3, 1);
                }
                return new ok71(mqo1.F(arrayList4), (ela1) parcel.readParcelable(ok71.class.getClassLoader()), (hl71) parcel.readParcelable(ok71.class.getClassLoader()), (te71) parcel.readParcelable(ok71.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0 ? Boolean.valueOf(parcel.readInt() != 0) : null);
            case 16:
                return new lk71(parcel.readString(), (rn71) parcel.readParcelable(lk71.class.getClassLoader()), (s1f1) parcel.readParcelable(lk71.class.getClassLoader()));
            case 17:
                return new mk71(parcel.readString());
            case 18:
                parcel.readInt();
                return pk71.a;
            case 19:
                return new el71(parcel.readString());
            case 20:
                int i7 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(i7);
                while (iH != i7) {
                    iH = x0d.h(fl71.class, parcel, arrayList5, iH, 1);
                }
                return new fl71(mqo1.F(arrayList5));
            case 21:
                parcel.readInt();
                return gl71.a;
            case 22:
                return new wl71(parcel.readString(), parcel.readString(), ((w871) parcel.readParcelable(wl71.class.getClassLoader())).a, parcel.readString(), (cmt) parcel.readParcelable(wl71.class.getClassLoader()), (va71) parcel.readParcelable(wl71.class.getClassLoader()), (te71) parcel.readParcelable(wl71.class.getClassLoader()), (hl71) parcel.readParcelable(wl71.class.getClassLoader()));
            case 23:
                return new km71(parcel.createStringArrayList(), parcel.readInt());
            case 24:
                parcel.readInt();
                return tm71.b;
            case 25:
                parcel.readInt();
                return um71.b;
            case 26:
                return new vm71(parcel.readString());
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                parcel.readInt();
                return wm71.b;
            case 28:
                return new on71((pn71) parcel.readParcelable(on71.class.getClassLoader()), (rn71) parcel.readParcelable(on71.class.getClassLoader()));
            default:
                String string = parcel.readString();
                return new rn71(string != null ? rc11.a.b(Class.forName(string)) : null);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new gf71[i];
            case 1:
                return new hf71[i];
            case 2:
                return new vg71[i];
            case 3:
                return new wg71[i];
            case 4:
                return new zg71[i];
            case 5:
                return new yg71[i];
            case 6:
                return new th71[i];
            case 7:
                return new fi71[i];
            case 8:
                return new gi71[i];
            case 9:
                return new hi71[i];
            case 10:
                return new si71[i];
            case 11:
                return new ui71[i];
            case 12:
                return new vi71[i];
            case 13:
                return new bj71[i];
            case 14:
                return new gj71[i];
            case 15:
                return new ok71[i];
            case 16:
                return new lk71[i];
            case 17:
                return new mk71[i];
            case 18:
                return new pk71[i];
            case 19:
                return new el71[i];
            case 20:
                return new fl71[i];
            case 21:
                return new gl71[i];
            case 22:
                return new wl71[i];
            case 23:
                return new km71[i];
            case 24:
                return new tm71[i];
            case 25:
                return new um71[i];
            case 26:
                return new vm71[i];
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                return new wm71[i];
            case 28:
                return new on71[i];
            default:
                return new rn71[i];
        }
    }
}
