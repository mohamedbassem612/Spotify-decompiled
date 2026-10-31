package p;

import android.content.Intent;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import java.util.Arrays;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class m830 extends hab0 implements iu30 {
    public static final m830 N0;
    public static final m830 O0;
    public static final m830 P0;
    public static final m830 Q0;
    public static final m830 R0;
    public static final m830 S0;
    public static final m830 T0;
    public static final m830 U0;
    public static final m830 V0;
    public static final m830 W0;
    public static final m830 X;
    public static final m830 X0;
    public static final m830 Y;
    public static final m830 Y0;
    public static final m830 Z;
    public static final m830 Z0;
    public static final m830 a1;
    public static final m830 b;
    public static final m830 b1;
    public static final m830 c;
    public static final m830 c1;
    public static final m830 d;
    public static final m830 d1;
    public static final m830 e;
    public static final m830 e1;
    public static final m830 f;
    public static final m830 g;
    public static final m830 h;
    public static final m830 i;
    public static final m830 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new m830(i2, (byte) 0);
        c = new m830(i2, (byte) 1);
        d = new m830(i2, (byte) 2);
        e = new m830(i2, (byte) 3);
        f = new m830(i2, (byte) 4);
        g = new m830(i2, (byte) 5);
        h = new m830(i2, (byte) 6);
        i = new m830(i2, (byte) 7);
        t = new m830(i2, (byte) 8);
        X = new m830(i2, (byte) 9);
        Y = new m830(i2, (byte) 10);
        Z = new m830(i2, (byte) 11);
        N0 = new m830(i2, (byte) 12);
        O0 = new m830(i2, (byte) 13);
        P0 = new m830(i2, (byte) 14);
        Q0 = new m830(i2, (byte) 15);
        R0 = new m830(i2, (byte) 16);
        S0 = new m830(i2, (byte) 17);
        T0 = new m830(i2, (byte) 18);
        U0 = new m830(i2, (byte) 19);
        V0 = new m830(i2, (byte) 20);
        W0 = new m830(i2, (byte) 21);
        X0 = new m830(i2, (byte) 22);
        Y0 = new m830(i2, (byte) 23);
        Z0 = new m830(i2, (byte) 24);
        a1 = new m830(i2, (byte) 25);
        b1 = new m830(i2, (byte) 26);
        c1 = new m830(i2, (byte) 27);
        d1 = new m830(i2, (byte) 28);
        e1 = new m830(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m830(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        byte b2 = this.a;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                ((Number) obj).intValue();
                AtomicReferenceArray atomicReferenceArray = p6r0.e;
                String str = yon1.U1().c;
                y6h1 y6h1Var = y6h1.i;
                x6h1 x6h1VarI = i3o1.i();
                x6h1VarI.h = "music";
                x6h1VarI.a = "mobile-home-evo";
                x6h1VarI.f = "3.0.0";
                x6h1VarI.g = "22.0.0";
                x6h1VarI.b = str;
                x6h1VarI.e = null;
                x6h1VarI.d = "spotify:internal:podcast-follow";
                y6h1 y6h1VarA = x6h1VarI.a();
                Collections.singletonList("home-funkis");
                r6h1 r6h1Var = r6h1.c;
                return new r6h1(kk0.l(y6h1VarA), (u8h1) null);
            case 1:
                p830 p830Var = (p830) obj;
                return new ajs0(p830Var.b, p830Var.c, p830Var.d, p830Var.e, p830Var.f, true);
            case 2:
                return new o830((zis0) obj);
            case 3:
                t830 t830Var = (t830) obj;
                return new bjs0(t830Var.b, t830Var.c, t830Var.d, t830Var.g, false, new tis0(t830Var.e, t830Var.f), 64);
            case 4:
                return new s830((zis0) obj);
            case 5:
                b261.d((e261) obj);
                return rih1Var;
            case 6:
                b261.d((e261) obj);
                return rih1Var;
            case 7:
                return rih1Var;
            case 8:
                return rih1Var;
            case 9:
                return new fc30((o231) obj, false);
            case 10:
                ((r2t) obj).a().b();
                return rih1Var;
            case 11:
                b261.c((e261) obj);
                return rih1Var;
            case 12:
                oc30 oc30Var = (oc30) obj;
                return new pc30(true, oc30Var.a, oc30Var.b);
            case 13:
                return Long.valueOf(((Integer) obj) == null ? 200L : 0L);
            case 14:
                if (obj != null) {
                    return (xkk1) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.visualidentitytrait.VisualIdentityTrait");
                return null;
            case 15:
                return Boolean.valueOf(obj instanceof jo70);
            case 16:
                if (obj != null) {
                    return (jo70) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.identitytrait.IdentityTrait");
                return null;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return Boolean.valueOf(obj instanceof xkk1);
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                if (obj != null) {
                    return (xkk1) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.visualidentitytrait.VisualIdentityTrait");
                return null;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return Boolean.valueOf(obj instanceof jo70);
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                if (obj != null) {
                    return (jo70) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.identitytrait.IdentityTrait");
                return null;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return Boolean.valueOf(obj instanceof xkk1);
            case 22:
                return ((zul1) obj).getEntityUri();
            case 23:
                return ((zul1) obj).getEntityUri();
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return ((zul1) obj).getEntityUri();
            case 25:
                return ((zul1) obj).getEntityUri();
            case 26:
                return deh.a;
            case 27:
                Set set = s4b1.f;
                return f4i1.f("Triggered by a ", zjy.k((Intent) obj), " intent");
            case 28:
                ak30 ak30Var = (ak30) obj;
                String str2 = ak30Var.c;
                return String.format("%d→%.0f%s", Arrays.copyOf(new Object[]{Long.valueOf(ak30Var.a), Float.valueOf(ak30Var.b), str2 != null ? f4i1.f("(", str2, ")") : ""}, 3));
            default:
                return ((nl81) obj).b();
        }
    }
}
