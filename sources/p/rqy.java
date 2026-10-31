package p;

import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class rqy extends hab0 implements iu30 {
    public static final rqy N0;
    public static final rqy O0;
    public static final rqy P0;
    public static final rqy Q0;
    public static final rqy R0;
    public static final rqy S0;
    public static final rqy T0;
    public static final rqy U0;
    public static final rqy V0;
    public static final rqy W0;
    public static final rqy X;
    public static final rqy X0;
    public static final rqy Y;
    public static final rqy Y0;
    public static final rqy Z;
    public static final rqy Z0;
    public static final rqy a1;
    public static final rqy b;
    public static final rqy b1;
    public static final rqy c;
    public static final rqy c1;
    public static final rqy d;
    public static final rqy d1;
    public static final rqy e;
    public static final rqy e1;
    public static final rqy f;
    public static final rqy g;
    public static final rqy h;
    public static final rqy i;
    public static final rqy t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new rqy(i2, (byte) 0);
        c = new rqy(i2, (byte) 1);
        d = new rqy(i2, (byte) 2);
        e = new rqy(i2, (byte) 3);
        f = new rqy(i2, (byte) 4);
        g = new rqy(i2, (byte) 5);
        h = new rqy(i2, (byte) 6);
        i = new rqy(i2, (byte) 7);
        t = new rqy(i2, (byte) 8);
        X = new rqy(i2, (byte) 9);
        Y = new rqy(i2, (byte) 10);
        Z = new rqy(i2, (byte) 11);
        N0 = new rqy(i2, (byte) 12);
        O0 = new rqy(i2, (byte) 13);
        P0 = new rqy(i2, (byte) 14);
        Q0 = new rqy(i2, (byte) 15);
        R0 = new rqy(i2, (byte) 16);
        S0 = new rqy(i2, (byte) 17);
        T0 = new rqy(i2, (byte) 18);
        U0 = new rqy(i2, (byte) 19);
        V0 = new rqy(i2, (byte) 20);
        W0 = new rqy(i2, (byte) 21);
        X0 = new rqy(i2, (byte) 22);
        Y0 = new rqy(i2, (byte) 23);
        Z0 = new rqy(i2, (byte) 24);
        a1 = new rqy(i2, (byte) 25);
        b1 = new rqy(i2, (byte) 26);
        c1 = new rqy(i2, (byte) 27);
        d1 = new rqy(i2, (byte) 28);
        e1 = new rqy(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rqy(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        byte b2 = this.a;
        rih1 rih1Var = rih1.a;
        boolean z = true;
        Boolean boolValueOf = null;
        switch (b2) {
            case 0:
                if (!(obj instanceof hzy) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 1:
                if (obj instanceof rih1) {
                    return null;
                }
                return (hzy) obj;
            case 2:
                if (!(obj instanceof w281) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 3:
                if (obj instanceof rih1) {
                    return null;
                }
                return (w281) obj;
            case 4:
                if (!(obj instanceof jo70) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 5:
                if (obj instanceof rih1) {
                    return null;
                }
                return (jo70) obj;
            case 6:
                return rih1Var;
            case 7:
                return ((cry) obj).b;
            case 8:
                return new rxc0((String) obj);
            case 9:
                return (qxc0) obj;
            case 10:
                return Boolean.valueOf(obj instanceof qxc0);
            case 11:
                if (obj != null) {
                    return (qxc0) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.listplatform.endpoints.kodiak.ListMetadataTable.Entity");
                return null;
            case 12:
                vvy vvyVar = ((osy) obj).a;
                ArrayList arrayList = vvyVar.b;
                ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new uv11(((eqy) it.next()).a, vvyVar.a, (Integer) null, (String) null, (cqs0) null, (tv11) null, 0, 252));
                }
                return arrayList2;
            case 13:
                return ((xsy) obj).a;
            case 14:
                Set set = s4b1.f;
                String strZ = uic.v("entity-segment-context", ((xsy) obj).a).z();
                if (strZ != null) {
                    return new rxc0(strZ);
                }
                return null;
            case 15:
                PlayerState playerState = (PlayerState) obj;
                ContextTrack contextTrack = (ContextTrack) playerState.track().h();
                Boolean boolValueOf2 = Boolean.valueOf(playerState.signals().contains("switch-to-full-episode"));
                if (contextTrack != null) {
                    boolValueOf = Boolean.valueOf(l4o1.v(contextTrack) && l4o1.x(contextTrack) != null);
                }
                return new mmr0(boolValueOf2, boolValueOf);
            case 16:
                if (!(obj instanceof mtl) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 17:
                if (obj instanceof rih1) {
                    return null;
                }
                return (mtl) obj;
            case 18:
                if (!(obj instanceof qxc0) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 19:
                if (obj instanceof rih1) {
                    return null;
                }
                return (qxc0) obj;
            case 20:
                return new mty(((lty) obj).a, null, z6x.a, false);
            case 21:
                String str = (String) obj;
                Set set2 = s4b1.f;
                String strZ2 = uic.v("podcast-chapters", str).z();
                return new qvc0(strZ2 == null ? str : strZ2, (c3d0) null, (Set) null, (mqz0) null, 14);
            case 22:
                String str2 = (String) obj;
                Set set3 = s4b1.f;
                String strZ3 = uic.v("podcast-chapters", str2).z();
                if (strZ3 != null) {
                    str2 = strZ3;
                }
                return new rxc0(str2);
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                return Boolean.valueOf(obj instanceof List);
            case 24:
                if (obj != null) {
                    return (List) obj;
                }
                bhn0.i("null cannot be cast to non-null type kotlin.collections.List<com.spotify.listplatform.endpoints.kodiak.ListItemsTable.Item>");
                return null;
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                return Boolean.valueOf(obj instanceof qxc0);
            case 26:
                if (obj != null) {
                    return (qxc0) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.listplatform.endpoints.kodiak.ListMetadataTable.Entity");
                return null;
            case 27:
                return rih1Var;
            case 28:
                String str3 = (String) obj;
                Set set4 = s4b1.f;
                String strZ4 = uic.v("podcast-chapters", str3).z();
                return new qvc0(strZ4 == null ? str3 : strZ4, (c3d0) null, (Set) null, (mqz0) null, 14);
            default:
                String str4 = (String) obj;
                Set set5 = s4b1.f;
                String strZ5 = uic.v("podcast-chapters", str4).z();
                if (strZ5 != null) {
                    str4 = strZ5;
                }
                return new rxc0(str4);
        }
    }
}
