package p;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class xdc0 extends hab0 implements iu30 {
    public static final xdc0 N0;
    public static final xdc0 O0;
    public static final xdc0 P0;
    public static final xdc0 Q0;
    public static final xdc0 R0;
    public static final xdc0 S0;
    public static final xdc0 T0;
    public static final xdc0 U0;
    public static final xdc0 V0;
    public static final xdc0 W0;
    public static final xdc0 X;
    public static final xdc0 X0;
    public static final xdc0 Y;
    public static final xdc0 Y0;
    public static final xdc0 Z;
    public static final xdc0 Z0;
    public static final xdc0 a1;
    public static final xdc0 b;
    public static final xdc0 b1;
    public static final xdc0 c;
    public static final xdc0 c1;
    public static final xdc0 d;
    public static final xdc0 d1;
    public static final xdc0 e;
    public static final xdc0 e1;
    public static final xdc0 f;
    public static final xdc0 g;
    public static final xdc0 h;
    public static final xdc0 i;
    public static final xdc0 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new xdc0(i2, (byte) 0);
        c = new xdc0(i2, (byte) 1);
        d = new xdc0(i2, (byte) 2);
        e = new xdc0(i2, (byte) 3);
        f = new xdc0(i2, (byte) 4);
        g = new xdc0(i2, (byte) 5);
        h = new xdc0(i2, (byte) 6);
        i = new xdc0(i2, (byte) 7);
        t = new xdc0(i2, (byte) 8);
        X = new xdc0(i2, (byte) 9);
        Y = new xdc0(i2, (byte) 10);
        Z = new xdc0(i2, (byte) 11);
        N0 = new xdc0(i2, (byte) 12);
        O0 = new xdc0(i2, (byte) 13);
        P0 = new xdc0(i2, (byte) 14);
        Q0 = new xdc0(i2, (byte) 15);
        R0 = new xdc0(i2, (byte) 16);
        S0 = new xdc0(i2, (byte) 17);
        T0 = new xdc0(i2, (byte) 18);
        U0 = new xdc0(i2, (byte) 19);
        V0 = new xdc0(i2, (byte) 20);
        W0 = new xdc0(i2, (byte) 21);
        X0 = new xdc0(i2, (byte) 22);
        Y0 = new xdc0(i2, (byte) 23);
        Z0 = new xdc0(i2, (byte) 24);
        a1 = new xdc0(i2, (byte) 25);
        b1 = new xdc0(i2, (byte) 26);
        c1 = new xdc0(i2, (byte) 27);
        d1 = new xdc0(i2, (byte) 28);
        e1 = new xdc0(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xdc0(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        byte b2 = this.a;
        w7x w7xVar = w7x.a;
        nsn nsnVar = null;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                return new g4d0((String) obj);
            case 1:
                return (g3d0) obj;
            case 2:
                return Boolean.valueOf(obj instanceof g3d0);
            case 3:
                if (obj != null) {
                    return (g3d0) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.listplatform.endpoints.ListSortOrder");
                return null;
            case 4:
                return hm5.P(oec0.a, ln00.b);
            case 5:
                return new bfc0(null, false);
            case 6:
                return afc0.a;
            case 7:
                return new huz(rih1Var, (byte) 10);
            case 8:
                return new cxc0();
            case 9:
                return (cxc0) obj;
            case 10:
                return w7xVar;
            case 11:
                DrawScope drawScope = (DrawScope) obj;
                uwr uwrVar = cbx.a;
                DrawScope.b0(drawScope, ((vex) zex.a.b).a, drawScope.X0(12.0f), 0L, 0.0f, (DrawStyle) null, 124);
                return rih1Var;
            case 12:
                return rih1Var;
            case 13:
                return new hgc0((hqm1) obj);
            case 14:
                return rih1Var;
            case 15:
                return rih1Var;
            case 16:
                return mno1.h(new mmr0[]{new mmr0("parcelable", (Parcelable) obj)});
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                ((qtr) obj).d(R0, f7c0.O0);
                return rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return Double.valueOf(((Number) obj).doubleValue());
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                fic1 fic1Var = (fic1) obj;
                return new im6(fic1Var.a, fic1Var.b, (u7h) null);
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                gic1 gic1Var = (gic1) obj;
                return new hyf1(gic1Var.a, gic1Var.b, gic1Var.c, (qyf1) null, gic1Var.d, 8);
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                qic1 qic1Var = (qic1) obj;
                return new asf1(qic1Var.a, qic1Var.b);
            case 22:
                return w7xVar;
            case 23:
                return Boolean.TRUE;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                wpc0 wpc0Var = (gqc0) obj;
                Bundle bundle = new Bundle();
                if (wpc0Var instanceof wpc0) {
                    xpc0 xpc0Var = wpc0Var.a;
                    if (xpc0Var instanceof xpc0) {
                        nsnVar = xpc0Var.a;
                    } else if (!u890.j(xpc0Var, ypc0.a)) {
                        if (!(xpc0Var instanceof zpc0)) {
                            eg.o();
                            return null;
                        }
                        nsnVar = ((zpc0) xpc0Var).a;
                    }
                    if (nsnVar != null) {
                        bundle.putParcelable("scrollIndex", nsnVar);
                    }
                } else if (wpc0Var instanceof eqc0) {
                    eqc0 eqc0Var = (eqc0) wpc0Var;
                    Object obj2 = ((h8k1) eqc0Var.a.b.get(eqc0Var.b)).b;
                    if (obj2 instanceof vr41) {
                        bundle.putParcelable("scrollIndex", (Parcelable) obj2);
                    }
                }
                return bundle;
            case 25:
                Bundle bundle2 = (Bundle) obj;
                if (!bundle2.containsKey("scrollIndex")) {
                    return fqc0.a;
                }
                vr41 parcelable = bundle2.getParcelable("scrollIndex");
                parcelable.getClass();
                return new bqc0(new zpc0(parcelable));
            case 26:
                Boolean bool = (Boolean) o7h.s0((List) obj);
                return Boolean.valueOf(bool != null ? bool.booleanValue() : false);
            case 27:
                return kuc0.b;
            case 28:
                return w7xVar;
            default:
                return Boolean.valueOf(obj instanceof Set);
        }
    }
}
