package p;

import com.spotify.player.model.Context$Metadata;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ayj1 extends hab0 implements iu30 {
    public static final ayj1 N0;
    public static final ayj1 O0;
    public static final ayj1 P0;
    public static final ayj1 Q0;
    public static final ayj1 R0;
    public static final ayj1 S0;
    public static final ayj1 T0;
    public static final ayj1 U0;
    public static final ayj1 V0;
    public static final ayj1 W0;
    public static final ayj1 X;
    public static final ayj1 X0;
    public static final ayj1 Y;
    public static final ayj1 Y0;
    public static final ayj1 Z;
    public static final ayj1 Z0;
    public static final ayj1 a1;
    public static final ayj1 b;
    public static final ayj1 b1;
    public static final ayj1 c;
    public static final ayj1 c1;
    public static final ayj1 d;
    public static final ayj1 d1;
    public static final ayj1 e;
    public static final ayj1 e1;
    public static final ayj1 f;
    public static final ayj1 g;
    public static final ayj1 h;
    public static final ayj1 i;
    public static final ayj1 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new ayj1(i2, (byte) 0);
        c = new ayj1(i2, (byte) 1);
        d = new ayj1(i2, (byte) 2);
        e = new ayj1(i2, (byte) 3);
        f = new ayj1(i2, (byte) 4);
        g = new ayj1(i2, (byte) 5);
        h = new ayj1(i2, (byte) 6);
        i = new ayj1(i2, (byte) 7);
        t = new ayj1(i2, (byte) 8);
        X = new ayj1(i2, (byte) 9);
        Y = new ayj1(i2, (byte) 10);
        Z = new ayj1(i2, (byte) 11);
        N0 = new ayj1(i2, (byte) 12);
        O0 = new ayj1(i2, (byte) 13);
        P0 = new ayj1(i2, (byte) 14);
        Q0 = new ayj1(i2, (byte) 15);
        R0 = new ayj1(i2, (byte) 16);
        S0 = new ayj1(i2, (byte) 17);
        T0 = new ayj1(i2, (byte) 18);
        U0 = new ayj1(i2, (byte) 19);
        V0 = new ayj1(i2, (byte) 20);
        W0 = new ayj1(i2, (byte) 21);
        X0 = new ayj1(i2, (byte) 22);
        Y0 = new ayj1(i2, (byte) 23);
        Z0 = new ayj1(i2, (byte) 24);
        a1 = new ayj1(i2, (byte) 25);
        b1 = new ayj1(i2, (byte) 26);
        c1 = new ayj1(i2, (byte) 27);
        d1 = new ayj1(i2, (byte) 28);
        e1 = new ayj1(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ayj1(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        String str;
        boolean z = true;
        switch (this.a) {
            case 0:
                return new yxj1(null);
            case 1:
                return ((xxj1) obj).a;
            case 2:
                return new zxj1((fvz) obj);
            case 3:
                if (!(obj instanceof fvz) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 4:
                if (obj instanceof rih1) {
                    return null;
                }
                return (fvz) obj;
            case 5:
                return Boolean.valueOf(obj instanceof h2v);
            case 6:
                return (k1r) obj;
            case 7:
                return Boolean.valueOf(obj instanceof List);
            case 8:
                if (obj != null) {
                    return (List) obj;
                }
                bhn0.i("null cannot be cast to non-null type kotlin.collections.List<com.spotify.listplatform.endpoints.kodiak.ListItemsTable.Item>");
                return null;
            case 9:
                return Boolean.valueOf(obj instanceof qxc0);
            case 10:
                if (obj != null) {
                    return (qxc0) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.listplatform.endpoints.kodiak.ListMetadataTable.Entity");
                return null;
            case 11:
                return Boolean.valueOf(obj instanceof Boolean);
            case 12:
                if (obj != null) {
                    return (Boolean) obj;
                }
                bhn0.i("null cannot be cast to non-null type kotlin.Boolean");
                return null;
            case 13:
                return new qvc0((String) obj, (c3d0) null, Collections.singleton(nrc0.a), (mqz0) null, 10);
            case 14:
                return new rxc0((String) obj);
            case 15:
                return new hnj1((String) obj);
            case 16:
                return new a2v((String) obj, 2);
            case 17:
                return (k1r) obj;
            case 18:
                czj1 czj1Var = (czj1) obj;
                bzj1 bzj1Var = czj1Var.c;
                if (bzj1Var instanceof zyj1) {
                    str = Context$Metadata.SHUFFLE_ALGORITHM_NONE;
                } else if (bzj1Var instanceof yyj1) {
                    str = "all";
                } else {
                    if (!(bzj1Var instanceof azj1)) {
                        eg.o();
                        return null;
                    }
                    str = "selected";
                }
                mmr0 mmr0Var = new mmr0("selection_type", str);
                mmr0 mmr0Var2 = new mmr0("selected_ids", bzj1Var instanceof azj1 ? new ArrayList((Collection) ((azj1) bzj1Var).a) : null);
                mmr0 mmr0Var3 = new mmr0("sheet_displayed", Boolean.valueOf(l1d.c(czj1Var.d, 2) >= 0));
                int size = czj1Var.b.size();
                Integer numValueOf = size > 0 ? Integer.valueOf(size) : null;
                return mno1.h(new mmr0[]{mmr0Var, mmr0Var2, mmr0Var3, new mmr0("row_count", Integer.valueOf(numValueOf != null ? numValueOf.intValue() : czj1Var.e))});
            case 19:
                return Integer.valueOf(((Number) obj).intValue());
            case 20:
                return Integer.valueOf(((Number) obj).intValue());
            case 21:
                return Boolean.valueOf(((Number) obj).intValue() > 0);
            case 22:
                return new mzj1("", "", "", false);
            case 23:
                return ((lzj1) obj).a;
            case 24:
                return ((lzj1) obj).a;
            case 25:
                if (!(obj instanceof xkk1) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 26:
                if (obj instanceof rih1) {
                    return null;
                }
                return (xkk1) obj;
            case 27:
                return Boolean.valueOf(obj instanceof jo70);
            case 28:
                if (obj != null) {
                    return (jo70) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.identitytrait.IdentityTrait");
                return null;
            default:
                if (!(obj instanceof h2v) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
        }
    }
}
