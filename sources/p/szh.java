package p;

import android.os.Parcelable;
import com.spotify.hubs.model.immutable.HubsImmutableComponentBundle;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
@o661
public final class szh {
    public static final izh Companion = new izh();
    public static final znb0[] l = {null, null, null, null, null, null, null, null, null, dm5.S(2, nyf.X0), dm5.S(2, nyf.Y0)};
    public final an70 a;
    public final vzd1 b;
    public final k180 c;
    public final uga0 d;
    public final uga0 e;
    public final uga0 f;
    public final erd1 g;
    public final String h;
    public final String i;
    public final Map j;
    public final List k;

    public /* synthetic */ szh(int i, an70 an70Var, vzd1 vzd1Var, k180 k180Var, uga0 uga0Var, uga0 uga0Var2, uga0 uga0Var3, erd1 erd1Var, String str, String str2, Map map, List list) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = an70Var;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = vzd1Var;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = k180Var;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = uga0Var;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = uga0Var2;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = uga0Var3;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = erd1Var;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = str;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = str2;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = map;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = list;
        }
    }

    public final gd70 a() {
        w570 ad70Var;
        id70 id70Var;
        dd70 dd70VarM;
        od70 od70VarK;
        Map mapT;
        ArrayList arrayList;
        Map mapT2;
        gd70 gd70Var = gd70.c;
        an70 an70Var = this.a;
        if (an70Var != null) {
            ad70 ad70Var2 = ad70.d;
            String str = an70Var.a;
            if (str == null) {
                str = "";
            }
            String str2 = an70Var.b;
            ad70Var = new ad70(str, str2 != null ? str2 : "");
        } else {
            ad70Var = null;
        }
        vzd1 vzd1Var = this.b;
        if (vzd1Var != null) {
            id70 id70Var2 = id70.c;
            id70Var = new id70(vzd1Var.a, vzd1Var.b, vzd1Var.c, vzd1Var.d);
        } else {
            id70Var = null;
        }
        k180 k180Var = this.c;
        if (k180Var != null) {
            dd70 dd70Var = dd70.c;
            bq70 bq70Var = k180Var.a;
            ld70 ld70VarA = bq70Var != null ? bq70Var.a() : null;
            bq70 bq70Var2 = k180Var.b;
            ld70 ld70VarA2 = bq70Var2 != null ? bq70Var2.a() : null;
            Map map = k180Var.c;
            if (map != null) {
                ArrayList arrayList2 = new ArrayList();
                for (Map.Entry entry : map.entrySet()) {
                    Object key = entry.getKey();
                    Object value = entry.getValue();
                    mmr0 mmr0Var = value != null ? new mmr0(key, ((bq70) value).a()) : null;
                    if (mmr0Var != null) {
                        arrayList2.add(mmr0Var);
                    }
                }
                mapT2 = sqg0.T(arrayList2);
            } else {
                mapT2 = null;
            }
            dd70VarM = byo1.m(ld70VarA, ld70VarA2, mapT2, k180Var.d);
        } else {
            dd70VarM = null;
        }
        HubsImmutableComponentBundle hubsImmutableComponentBundleV = kyo1.v(this.d, true);
        HubsImmutableComponentBundle hubsImmutableComponentBundleV2 = kyo1.v(this.e, true);
        HubsImmutableComponentBundle hubsImmutableComponentBundleV3 = kyo1.v(this.f, true);
        erd1 erd1Var = this.g;
        if (erd1Var != null) {
            Parcelable.Creator<od70> creator = od70.CREATOR;
            String str3 = erd1Var.a;
            List list = erd1Var.b;
            od70VarK = fyo1.k(str3, list != null ? o7h.o0(list) : null);
        } else {
            od70VarK = null;
        }
        Map map2 = this.j;
        if (map2 != null) {
            ovh ovhVar = ovh.N0;
            ArrayList arrayList3 = new ArrayList();
            for (Map.Entry entry2 : map2.entrySet()) {
                Object key2 = entry2.getKey();
                Object value2 = entry2.getValue();
                mmr0 mmr0Var2 = value2 != null ? new mmr0(key2, ovhVar.invoke(value2)) : null;
                if (mmr0Var2 != null) {
                    arrayList3.add(mmr0Var2);
                }
            }
            mapT = sqg0.T(arrayList3);
        } else {
            mapT = null;
        }
        List<szh> list2 = this.k;
        if (list2 != null) {
            ArrayList arrayList4 = new ArrayList();
            for (szh szhVar : list2) {
                gd70 gd70VarA = szhVar != null ? szhVar.a() : null;
                if (gd70VarA != null) {
                    arrayList4.add(gd70VarA);
                }
            }
            arrayList = arrayList4;
        } else {
            arrayList = null;
        }
        return cyo1.m(ad70Var, id70Var, dd70VarM, hubsImmutableComponentBundleV, hubsImmutableComponentBundleV2, hubsImmutableComponentBundleV3, od70VarK, this.h, this.i, mapT, arrayList);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof szh)) {
            return false;
        }
        szh szhVar = (szh) obj;
        return u890.j(this.a, szhVar.a) && u890.j(this.b, szhVar.b) && u890.j(this.c, szhVar.c) && u890.j(this.d, szhVar.d) && u890.j(this.e, szhVar.e) && u890.j(this.f, szhVar.f) && u890.j(this.g, szhVar.g) && u890.j(this.h, szhVar.h) && u890.j(this.i, szhVar.i) && u890.j(this.j, szhVar.j) && u890.j(this.k, szhVar.k);
    }

    public final int hashCode() {
        an70 an70Var = this.a;
        int iHashCode = (an70Var == null ? 0 : an70Var.hashCode()) * 31;
        vzd1 vzd1Var = this.b;
        int iHashCode2 = (iHashCode + (vzd1Var == null ? 0 : vzd1Var.hashCode())) * 31;
        k180 k180Var = this.c;
        int iHashCode3 = (iHashCode2 + (k180Var == null ? 0 : k180Var.hashCode())) * 31;
        uga0 uga0Var = this.d;
        int iHashCode4 = (iHashCode3 + (uga0Var == null ? 0 : uga0Var.a.hashCode())) * 31;
        uga0 uga0Var2 = this.e;
        int iHashCode5 = (iHashCode4 + (uga0Var2 == null ? 0 : uga0Var2.a.hashCode())) * 31;
        uga0 uga0Var3 = this.f;
        int iHashCode6 = (iHashCode5 + (uga0Var3 == null ? 0 : uga0Var3.a.hashCode())) * 31;
        erd1 erd1Var = this.g;
        int iHashCode7 = (iHashCode6 + (erd1Var == null ? 0 : erd1Var.hashCode())) * 31;
        String str = this.h;
        int iHashCode8 = (iHashCode7 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.i;
        int iHashCode9 = (iHashCode8 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Map map = this.j;
        int iHashCode10 = (iHashCode9 + (map == null ? 0 : map.hashCode())) * 31;
        List list = this.k;
        return iHashCode10 + (list != null ? list.hashCode() : 0);
    }
}
