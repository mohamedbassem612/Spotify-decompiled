package p;

import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class wu51 extends hab0 implements iu30 {
    public static final wu51 N0;
    public static final wu51 O0;
    public static final wu51 P0;
    public static final wu51 Q0;
    public static final wu51 R0;
    public static final wu51 S0;
    public static final wu51 T0;
    public static final wu51 U0;
    public static final wu51 V0;
    public static final wu51 W0;
    public static final wu51 X;
    public static final wu51 X0;
    public static final wu51 Y;
    public static final wu51 Y0;
    public static final wu51 Z;
    public static final wu51 Z0;
    public static final wu51 a1;
    public static final wu51 b;
    public static final wu51 b1;
    public static final wu51 c;
    public static final wu51 c1;
    public static final wu51 d;
    public static final wu51 d1;
    public static final wu51 e;
    public static final wu51 e1;
    public static final wu51 f;
    public static final wu51 g;
    public static final wu51 h;
    public static final wu51 i;
    public static final wu51 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new wu51(i2, (byte) 0);
        c = new wu51(i2, (byte) 1);
        d = new wu51(i2, (byte) 2);
        e = new wu51(i2, (byte) 3);
        f = new wu51(i2, (byte) 4);
        g = new wu51(i2, (byte) 5);
        h = new wu51(i2, (byte) 6);
        i = new wu51(i2, (byte) 7);
        t = new wu51(i2, (byte) 8);
        X = new wu51(i2, (byte) 9);
        Y = new wu51(i2, (byte) 10);
        Z = new wu51(i2, (byte) 11);
        N0 = new wu51(i2, (byte) 12);
        O0 = new wu51(i2, (byte) 13);
        P0 = new wu51(i2, (byte) 14);
        Q0 = new wu51(i2, (byte) 15);
        R0 = new wu51(i2, (byte) 16);
        S0 = new wu51(i2, (byte) 17);
        T0 = new wu51(i2, (byte) 18);
        U0 = new wu51(i2, (byte) 19);
        V0 = new wu51(i2, (byte) 20);
        W0 = new wu51(i2, (byte) 21);
        X0 = new wu51(i2, (byte) 22);
        Y0 = new wu51(i2, (byte) 23);
        Z0 = new wu51(i2, (byte) 24);
        a1 = new wu51(i2, (byte) 25);
        b1 = new wu51(i2, (byte) 26);
        c1 = new wu51(i2, (byte) 27);
        d1 = new wu51(i2, (byte) 28);
        e1 = new wu51(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wu51(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        byte b2 = this.a;
        boolean z = true;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                return ((l0l) obj).d();
            case 1:
                return rih1Var;
            case 2:
                return rih1Var;
            case 3:
                b261.c((e261) obj);
                return rih1Var;
            case 4:
                return (String) obj;
            case 5:
                u061 u061Var = (u061) obj;
                return Boolean.valueOf(u061Var != null && u061Var.a);
            case 6:
                if (!(obj instanceof u061) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 7:
                if (obj instanceof rih1) {
                    return null;
                }
                return (u061) obj;
            case 8:
                return Boolean.valueOf(obj instanceof k8g1);
            case 9:
                if (obj != null) {
                    return (k8g1) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.transcript.model.Transcript");
                return null;
            case 10:
                return (ga01) obj;
            case 11:
                return (k8g1) obj;
            case 12:
                return Boolean.valueOf(obj instanceof k8g1);
            case 13:
                if (obj != null) {
                    return (k8g1) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.transcript.model.Transcript");
                return null;
            case 14:
                return (ga01) obj;
            case 15:
                return (k8g1) obj;
            case 16:
                DrawScope drawScope = (DrawScope) obj;
                tw4 tw4VarA = ww4.a();
                tw4VarA.k(0.0f, Float.intBitsToFloat((int) (drawScope.j() & 4294967295L)));
                tw4VarA.j(Float.intBitsToFloat((int) (drawScope.j() >> 32)) / 2.0f, 0.0f);
                tw4VarA.j(Float.intBitsToFloat((int) (drawScope.j() >> 32)), Float.intBitsToFloat((int) (drawScope.j() & 4294967295L)));
                tw4VarA.g();
                DrawScope.w0(drawScope, tw4VarA, yy51.a, (DrawStyle) null, 60);
                return rih1Var;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return Integer.valueOf(((Number) obj).intValue());
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return Integer.valueOf(-((Number) obj).intValue());
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return Integer.valueOf(-((Number) obj).intValue());
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return Integer.valueOf(((Number) obj).intValue());
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                DrawScope drawScope2 = (DrawScope) obj;
                tw4 tw4VarA2 = ww4.a();
                tw4VarA2.k(0.0f, 0.0f);
                tw4VarA2.j(Float.intBitsToFloat((int) (drawScope2.j() >> 32)) / 2.0f, Float.intBitsToFloat((int) (drawScope2.j() & 4294967295L)));
                tw4VarA2.j(Float.intBitsToFloat((int) (drawScope2.j() >> 32)), 0.0f);
                tw4VarA2.g();
                DrawScope.w0(drawScope2, tw4VarA2, yy51.a, (DrawStyle) null, 60);
                return rih1Var;
            case 22:
                if (!(obj instanceof gz51) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 23:
                if (obj instanceof rih1) {
                    return null;
                }
                return (gz51) obj;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return rih1Var;
            case 25:
                gz51 gz51Var = (gz51) obj;
                Set set = gz51Var != null ? gz51Var.b : null;
                return set == null ? w7x.a : set;
            case 26:
                if (!(obj instanceof gz51) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 27:
                if (obj instanceof rih1) {
                    return null;
                }
                return (gz51) obj;
            case 28:
                return rih1Var;
            default:
                gz51 gz51Var2 = (gz51) obj;
                return Boolean.valueOf(gz51Var2 != null ? gz51Var2.a : false);
        }
    }
}
