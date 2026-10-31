package p;

import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class wvu extends hab0 implements iu30 {
    public static final wvu N0;
    public static final wvu O0;
    public static final wvu P0;
    public static final wvu Q0;
    public static final wvu R0;
    public static final wvu S0;
    public static final wvu T0;
    public static final wvu U0;
    public static final wvu V0;
    public static final wvu W0;
    public static final wvu X;
    public static final wvu X0;
    public static final wvu Y;
    public static final wvu Y0;
    public static final wvu Z;
    public static final wvu Z0;
    public static final wvu a1;
    public static final wvu b;
    public static final wvu b1;
    public static final wvu c;
    public static final wvu c1;
    public static final wvu d;
    public static final wvu d1;
    public static final wvu e;
    public static final wvu e1;
    public static final wvu f;
    public static final wvu g;
    public static final wvu h;
    public static final wvu i;
    public static final wvu t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new wvu(i2, (byte) 0);
        c = new wvu(i2, (byte) 1);
        d = new wvu(i2, (byte) 2);
        e = new wvu(i2, (byte) 3);
        f = new wvu(i2, (byte) 4);
        g = new wvu(i2, (byte) 5);
        h = new wvu(i2, (byte) 6);
        i = new wvu(i2, (byte) 7);
        t = new wvu(i2, (byte) 8);
        X = new wvu(i2, (byte) 9);
        Y = new wvu(i2, (byte) 10);
        Z = new wvu(i2, (byte) 11);
        N0 = new wvu(i2, (byte) 12);
        O0 = new wvu(i2, (byte) 13);
        P0 = new wvu(i2, (byte) 14);
        Q0 = new wvu(i2, (byte) 15);
        R0 = new wvu(i2, (byte) 16);
        S0 = new wvu(i2, (byte) 17);
        T0 = new wvu(i2, (byte) 18);
        U0 = new wvu(i2, (byte) 19);
        V0 = new wvu(i2, (byte) 20);
        W0 = new wvu(i2, (byte) 21);
        X0 = new wvu(i2, (byte) 22);
        Y0 = new wvu(i2, (byte) 23);
        Z0 = new wvu(i2, (byte) 24);
        a1 = new wvu(i2, (byte) 25);
        b1 = new wvu(i2, (byte) 26);
        c1 = new wvu(i2, (byte) 27);
        d1 = new wvu(i2, (byte) 28);
        e1 = new wvu(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wvu(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        byte b2 = this.a;
        b7x b7xVar = b7x.a;
        boolean z = true;
        switch (b2) {
            case 0:
                if (obj != null) {
                    return (g3d0) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.listplatform.endpoints.ListSortOrder");
                return null;
            case 1:
                return new q2l0((i3l0) obj);
            case 2:
                return "offline";
            case 3:
                kby kbyVar = ((cxc0) obj).f;
                return new evu(kbyVar, (g3d0) null, kbyVar.s);
            case 4:
                if (!(obj instanceof String) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 5:
                if (obj instanceof rih1) {
                    return null;
                }
                return (String) obj;
            case 6:
                return Boolean.valueOf(obj instanceof qxc0);
            case 7:
                if (obj != null) {
                    return (qxc0) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.listplatform.endpoints.kodiak.ListMetadataTable.Entity");
                return null;
            case 8:
                return new q2l0((i3l0) obj);
            case 9:
                return new q2l0((i3l0) obj);
            case 10:
                return new ewu((Set) obj, false);
            case 11:
                return new q2l0((i3l0) obj);
            case 12:
                return ((q2l0) obj).e("");
            case 13:
                return new kae((Set) obj);
            case 14:
                return new g9v0((Set) obj);
            case 15:
                return new z421((Set) obj);
            case 16:
                r6h1 r6h1Var = r6h1.c;
                return new all0(new yok0((byte) 21));
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                x6h1 x6h1VarC = ((all0) obj).a.c();
                x6h1VarC.i.add(new a7h1("change_download_quality_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                y6h1 y6h1VarA = x6h1VarC.a();
                String str = vyu.f;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str != null ? str : "")), y6h1VarA, r6h1.c, System.currentTimeMillis());
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                x6h1 x6h1VarC2 = ((all0) obj).a.c();
                x6h1VarC2.i.add(new a7h1("enable_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis());
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                r6h1 r6h1Var2 = r6h1.c;
                return new all0(new yok0((byte) 21));
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                x6h1 x6h1VarC3 = ((all0) obj).a.c();
                x6h1VarC3.i.add(new a7h1("change_download_quality_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC3.j = false;
                y6h1 y6h1VarA2 = x6h1VarC3.a();
                String str2 = vyu.f;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str2 != null ? str2 : "")), y6h1VarA2, r6h1.c, System.currentTimeMillis());
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                x6h1 x6h1VarC4 = ((all0) obj).a.c();
                x6h1VarC4.i.add(new a7h1("enable_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC4.j = false;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC4.a(), r6h1.c, System.currentTimeMillis());
            case 22:
                return new jzu((Float) null, (Float) null, (hzu) null, false);
            case 23:
                return ((xa5) obj).a(hm5.P(xay.e(3, (ni20) null), xay.f(3, (ni20) null)), (c391) null);
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return Boolean.valueOf(((hzu) obj) == null);
            case 25:
                return Boolean.valueOf(obj instanceof vnb1);
            case 26:
                if (obj != null) {
                    return (vnb1) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.curation.state.State");
                return null;
            case 27:
                return (String) obj;
            case 28:
                return (vnb1) obj;
            default:
                return Boolean.valueOf(obj instanceof h2v);
        }
    }
}
