package p;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.player.model.ContextTrack;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class qrk extends hab0 implements iu30 {
    public final /* synthetic */ byte a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qrk(byte b) {
        super(1);
        this.a = b;
    }

    public final Object invoke(Object obj) throws Exception {
        b960 b960Var;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                l7e0 l7e0Var = ((hwq) obj).g;
                if (!(l7e0Var instanceof j7e0)) {
                    return new vrk("", new vqk("", null, null, false, 0, 0, false, false, null, null, null, null, 32766));
                }
                j7e0 j7e0Var = (j7e0) l7e0Var;
                String str = (String) j7e0Var.a.g.get("concert_uri");
                return new vrk(j7e0Var.c, new vqk(str == null ? "" : str, null, null, false, 1, 1, true, false, null, null, null, null, 32542));
            case 1:
                return vll.R0.invoke((prl) obj);
            case 2:
                ((View) obj).setTag(2131427536, Boolean.TRUE);
                return rih1Var;
            case 3:
                nhm nhmVar = (nhm) obj;
                return new ohm(nhmVar.a, nhmVar.b, nhmVar.c);
            case 4:
                hwq hwqVar = (hwq) obj;
                l7e0 l7e0Var2 = hwqVar.g;
                if (!(l7e0Var2 instanceof j7e0)) {
                    return new tmm();
                }
                j7e0 j7e0Var2 = (j7e0) l7e0Var2;
                String strE = wmm.e(hwqVar.f.d.a(xmm.class), j7e0Var2.a.q.a(zmm.class));
                return (strE == null || strE.length() == 0) ? new tmm() : new tmm(strE, j7e0Var2.b);
            case 5:
                return new h0o("", (String) null, 1, new e0o(Collections.singletonList(new bxn((String) null, "", 11, (String) null))), false, false);
            case 6:
                g9o g9oVar = (g9o) obj;
                return mno1.h(new mmr0[]{new mmr0("externalState", new f9o(g9oVar.b, g9oVar.c))});
            case 7:
                g9o g9oVar2 = (g9o) obj;
                return mno1.h(new mmr0[]{new mmr0("externalState", new f9o(g9oVar2.b, g9oVar2.c))});
            case 8:
                return efm.f((cno) obj, (kcz0) null);
            case 9:
                List list = (List) obj;
                return pci0.d.l(list.get(0), list.get(1), list.get(2), list.get(3), list.get(4), list.get(5), list.get(6), list.get(7), list.get(8), list.get(9), list.get(10));
            case 10:
                List list2 = (List) obj;
                return new e5g1((ast0) list2.get(0), (y4m) list2.get(1), (r840) list2.get(2), (iix0) list2.get(3));
            case 11:
                f7l1 f7l1VarA = ((cxc0) obj).f.x.a(f7l1.class);
                sqe sqeVar = f7l1VarA != null ? f7l1VarA.a : null;
                y6l1 y6l1Var = sqeVar instanceof y6l1 ? (y6l1) sqeVar : null;
                if (y6l1Var == null) {
                    y6l1Var = new y6l1(new e7l1("", 1), new x6l1("", ""));
                }
                return new cgy("playlist_page:entity_explorer", y6l1Var);
            case 12:
                String str2 = ((c960) obj).a;
                if (str2.equals("spotify:playlist:37i9dQZF1F5p3rmiWPIYgZ") || str2.equals("spotify:collection:tracks") || str2.equals("spotify:internal:collection:tracks") || (nhc1.Y(str2, "spotify:user:", false) && nhc1.R(str2, ":collection", false))) {
                    b960Var = b960.a;
                } else {
                    if (!xrm1.a(str2)) {
                        k220.f("Items must be either Liked Songs or Your Episodes, but got: ".concat(str2));
                        return null;
                    }
                    b960Var = b960.b;
                }
                return new huz(b960Var, (byte) 10);
            case 13:
                d441 d441VarG1 = ((y341) obj).g1("DELETE FROM cachedDenylist");
                try {
                    d441VarG1.f1();
                    return rih1Var;
                } finally {
                    d441VarG1.close();
                }
            case 14:
                d441 d441VarG2 = ((y341) obj).g1("SELECT * FROM DeviceLastConnection ORDER BY timestamp DESC");
                try {
                    int iW = y7y0.w(d441VarG2, "deviceIdentifier");
                    int iW2 = y7y0.w(d441VarG2, "timestamp");
                    ArrayList arrayList = new ArrayList();
                    while (d441VarG2.f1()) {
                        arrayList.add(new zqt(d441VarG2.P0(iW), d441VarG2.getLong(iW2)));
                    }
                    d441VarG2.close();
                    return arrayList;
                } catch (Throwable th) {
                    d441VarG2.close();
                    throw th;
                }
            case 15:
                d441 d441VarG3 = ((y341) obj).g1("SELECT * FROM DeviceLastConnection ORDER BY timestamp DESC");
                try {
                    int iW3 = y7y0.w(d441VarG3, "deviceIdentifier");
                    int iW4 = y7y0.w(d441VarG3, "timestamp");
                    ArrayList arrayList2 = new ArrayList();
                    while (d441VarG3.f1()) {
                        arrayList2.add(new zqt(d441VarG3.P0(iW3), d441VarG3.getLong(iW4)));
                    }
                    d441VarG3.close();
                    return arrayList2;
                } catch (Throwable th2) {
                    d441VarG3.close();
                    throw th2;
                }
            case 16:
                return false;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                rdv rdvVar = (rdv) obj;
                return mno1.h(new mmr0[]{new mmr0("externalState", new ddv(rdvVar.f.a, rdvVar.b))});
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return mno1.h(new mmr0[]{new mmr0("model_state", (kvv) obj)});
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                ContextTrack contextTrack = (ContextTrack) obj;
                return contextTrack.isDelimiter() ? a7z0.a : new b7z0(goq.q(contextTrack));
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return new pow();
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                b261.n((e261) obj, isl.a.a);
                return rih1Var;
            case 22:
                return rih1Var;
            case 23:
                return new yr80((((long) ((int) (((yr80) obj).a >> 32))) << 32) | (((long) 0) & 4294967295L));
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return new yr80((((long) ((int) (((yr80) obj).a >> 32))) << 32) | (((long) 0) & 4294967295L));
            case 25:
                String str3 = (String) obj;
                Set set = s4b1.f;
                if (uic.g(str3, blc0.M3)) {
                    return str3;
                }
                return null;
            case 26:
                String str4 = (String) obj;
                Set set2 = s4b1.f;
                if (uic.g(str4, blc0.M3)) {
                    return str4;
                }
                return null;
            case 27:
                return null;
            case 28:
                return mno1.h(new mmr0[]{new mmr0("entity.share.card", (Parcelable) obj)});
            default:
                return (Parcelable) jhc1.t((Bundle) obj, "entity.share.card", ywy.class);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qrk(int i, byte b) {
        super(i);
        this.a = b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qrk(Object obj, byte b) {
        super(1);
        this.a = b;
    }
}
