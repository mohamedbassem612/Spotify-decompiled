package p;

import com.spotify.base.java.logging.Logger;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ou11 extends hab0 implements iu30 {
    public static final ou11 N0;
    public static final ou11 O0;
    public static final ou11 P0;
    public static final ou11 Q0;
    public static final ou11 R0;
    public static final ou11 S0;
    public static final ou11 T0;
    public static final ou11 U0;
    public static final ou11 V0;
    public static final ou11 W0;
    public static final ou11 X;
    public static final ou11 X0;
    public static final ou11 Y;
    public static final ou11 Y0;
    public static final ou11 Z;
    public static final ou11 Z0;
    public static final ou11 a1;
    public static final ou11 b;
    public static final ou11 b1;
    public static final ou11 c;
    public static final ou11 c1;
    public static final ou11 d;
    public static final ou11 d1;
    public static final ou11 e;
    public static final ou11 e1;
    public static final ou11 f;
    public static final ou11 g;
    public static final ou11 h;
    public static final ou11 i;
    public static final ou11 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new ou11(i2, (byte) 0);
        c = new ou11(i2, (byte) 1);
        d = new ou11(i2, (byte) 2);
        e = new ou11(i2, (byte) 3);
        f = new ou11(i2, (byte) 4);
        g = new ou11(i2, (byte) 5);
        h = new ou11(i2, (byte) 6);
        i = new ou11(i2, (byte) 7);
        t = new ou11(i2, (byte) 8);
        X = new ou11(i2, (byte) 9);
        Y = new ou11(i2, (byte) 10);
        Z = new ou11(i2, (byte) 11);
        N0 = new ou11(i2, (byte) 12);
        O0 = new ou11(i2, (byte) 13);
        P0 = new ou11(i2, (byte) 14);
        Q0 = new ou11(i2, (byte) 15);
        R0 = new ou11(i2, (byte) 16);
        S0 = new ou11(i2, (byte) 17);
        T0 = new ou11(i2, (byte) 18);
        U0 = new ou11(i2, (byte) 19);
        V0 = new ou11(i2, (byte) 20);
        W0 = new ou11(i2, (byte) 21);
        X0 = new ou11(i2, (byte) 22);
        Y0 = new ou11(i2, (byte) 23);
        Z0 = new ou11(i2, (byte) 24);
        a1 = new ou11(i2, (byte) 25);
        b1 = new ou11(i2, (byte) 26);
        c1 = new ou11(i2, (byte) 27);
        d1 = new ou11(i2, (byte) 28);
        e1 = new ou11(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ou11(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        String str;
        String str2;
        byte b2 = this.a;
        b7x b7xVar = b7x.a;
        Set setSingleton = w7x.a;
        rih1 rih1Var = rih1.a;
        boolean z = true;
        switch (b2) {
            case 0:
                uv11 uv11Var = ((vo11) obj).b.b;
                return sqg0.J(new mmr0[]{new mmr0(0, Collections.singleton(uv11Var.b)), new mmr0(1, Collections.singleton(uv11Var.a))});
            case 1:
                Map map = ((ad2) obj).a;
                LinkedHashMap linkedHashMap = new LinkedHashMap(zno1.s(map.size()));
                for (Map.Entry entry : map.entrySet()) {
                    linkedHashMap.put(entry.getKey(), (id2) entry.getValue());
                }
                return linkedHashMap;
            case 2:
                return Boolean.FALSE;
            case 3:
                return new uv11(((tx11) obj).b, "", (Integer) null, (String) null, (cqs0) null, (tv11) null, 0, 252);
            case 4:
                return new gt11(((tx11) obj).b);
            case 5:
                return ((vo11) obj).b.b;
            case 6:
                return (String) obj;
            case 7:
                u061 u061Var = (u061) obj;
                return Boolean.valueOf(u061Var != null && u061Var.a);
            case 8:
                return (qxc0) obj;
            case 9:
                if (!(obj instanceof u061) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 10:
                if (obj instanceof rih1) {
                    return null;
                }
                return (u061) obj;
            case 11:
                return Boolean.valueOf(obj instanceof qxc0);
            case 12:
                if (obj != null) {
                    return (qxc0) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.listplatform.endpoints.kodiak.ListMetadataTable.Entity");
                return null;
            case 13:
                return rih1Var;
            case 14:
                return rih1Var;
            case 15:
                return Boolean.valueOf(((rrt0) obj) != rrt0.b);
            case 16:
                b261.F((e261) obj, true);
                return rih1Var;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                b261.c((e261) obj);
                return rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                String str3 = ((tx11) obj).b;
                boolean zY = nhc1.Y(str3, "spotify:album:", false);
                mmr0 mmr0Var = new mmr0(bx11.a, zY ? Collections.singleton(str3) : setSingleton);
                if (!zY) {
                    setSingleton = Collections.singleton(str3);
                }
                return sqg0.J(new mmr0[]{mmr0Var, new mmr0(bx11.b, setSingleton)});
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return Collections.singleton(((tx11) obj).b);
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return Collections.singleton(((tx11) obj).b);
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return setSingleton;
            case 22:
                return Collections.singleton(((ux11) obj).b);
            case 23:
                return setSingleton;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                Logger.l((Throwable) obj, "No credits from createGeneration endpoint", new Object[0]);
                return rwk.a;
            case 25:
                r6h1 r6h1Var = r6h1.c;
                return new bll0(new yok0((byte) 21));
            case 26:
                x6h1 x6h1VarC = ((bll0) obj).a.c();
                x6h1VarC.i.add(new a7h1("keep_previous_quality_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC.a(), r6h1.c, System.currentTimeMillis());
            case 27:
                x6h1 x6h1VarC2 = ((bll0) obj).a.c();
                x6h1VarC2.i.add(new a7h1("enable_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis());
            case 28:
                fpb fpbVar = (fpb) obj;
                switch (fpbVar.a) {
                    case 0:
                        str = fpbVar.c;
                        break;
                    case 1:
                        str = fpbVar.c;
                        break;
                    default:
                        str = fpbVar.c;
                        break;
                }
                switch (fpbVar.a) {
                    case 0:
                        str2 = fpbVar.b;
                        break;
                    case 1:
                        str2 = fpbVar.b;
                        break;
                    default:
                        str2 = fpbVar.b;
                        break;
                }
                return xcg1.i(str, ".", str2);
            default:
                return new huz(((vuk) obj).k(), (byte) 10);
        }
    }
}
