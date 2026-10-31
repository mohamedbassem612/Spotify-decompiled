package p;

import android.net.nsd.NsdServiceInfo;
import android.os.Bundle;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.podcast.endpointsimpl.experimental.show.exceptions.CountryRestrictedException;
import com.spotify.podcast.endpointsimpl.experimental.show.exceptions.RequiredMetadataMissingException;
import com.spotify.podcast.endpointsimpl.experimental.show.exceptions.ShowEsperantoEndpointException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class zy00 extends hab0 implements iu30 {
    public static final zy00 N0;
    public static final zy00 O0;
    public static final zy00 P0;
    public static final zy00 Q0;
    public static final zy00 R0;
    public static final zy00 S0;
    public static final zy00 T0;
    public static final zy00 U0;
    public static final zy00 V0;
    public static final zy00 W0;
    public static final zy00 X;
    public static final zy00 X0;
    public static final zy00 Y;
    public static final zy00 Y0;
    public static final zy00 Z;
    public static final zy00 Z0;
    public static final zy00 a1;
    public static final zy00 b;
    public static final zy00 b1;
    public static final zy00 c;
    public static final zy00 c1;
    public static final zy00 d;
    public static final zy00 d1;
    public static final zy00 e;
    public static final zy00 e1;
    public static final zy00 f;
    public static final zy00 g;
    public static final zy00 h;
    public static final zy00 i;
    public static final zy00 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new zy00(i2, (byte) 0);
        c = new zy00(i2, (byte) 1);
        d = new zy00(i2, (byte) 2);
        e = new zy00(i2, (byte) 3);
        f = new zy00(i2, (byte) 4);
        g = new zy00(i2, (byte) 5);
        h = new zy00(i2, (byte) 6);
        i = new zy00(i2, (byte) 7);
        t = new zy00(i2, (byte) 8);
        X = new zy00(i2, (byte) 9);
        Y = new zy00(i2, (byte) 10);
        Z = new zy00(i2, (byte) 11);
        N0 = new zy00(i2, (byte) 12);
        O0 = new zy00(i2, (byte) 13);
        P0 = new zy00(i2, (byte) 14);
        Q0 = new zy00(i2, (byte) 15);
        R0 = new zy00(i2, (byte) 16);
        S0 = new zy00(i2, (byte) 17);
        T0 = new zy00(i2, (byte) 18);
        U0 = new zy00(i2, (byte) 19);
        V0 = new zy00(i2, (byte) 20);
        W0 = new zy00(i2, (byte) 21);
        X0 = new zy00(i2, (byte) 22);
        Y0 = new zy00(i2, (byte) 23);
        Z0 = new zy00(i2, (byte) 24);
        a1 = new zy00(i2, (byte) 25);
        b1 = new zy00(i2, (byte) 26);
        c1 = new zy00(i2, (byte) 27);
        d1 = new zy00(i2, (byte) 28);
        e1 = new zy00(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zy00(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                dhm0 parcelable = ((Bundle) obj).getParcelable("extender-element");
                return parcelable == null ? new dhm0((String) null, (String) null, false, false, (String) null, false, false, false, (LinkedHashSet) null, (LinkedHashSet) null, false, false, (LinkedHashSet) null, false, (xbe0) null, false, false, (ArrayList) null, (String) null, 0, 2097151) : parcelable;
            case 1:
                return ((ho70) obj).a;
            case 2:
                gxs0 gxs0Var = (jxs0) obj;
                if (gxs0Var instanceof gxs0) {
                    return gxs0Var;
                }
                return null;
            case 3:
                return Boolean.valueOf(((gxs0) obj).d);
            case 4:
                return ((gxs0) obj).c;
            case 5:
                iap0 iap0Var = (iap0) obj;
                List list = r110.a;
                if ((iap0Var instanceof fap0) || (iap0Var instanceof hap0) || (iap0Var instanceof cap0)) {
                    return null;
                }
                if (iap0Var instanceof dap0) {
                    return new seh0(((dap0) iap0Var).a.getServiceName());
                }
                if (iap0Var instanceof eap0) {
                    NsdServiceInfo nsdServiceInfo = ((eap0) iap0Var).a;
                    z7u z7uVarB = r110.b(nsdServiceInfo);
                    return z7uVarB == null ? new reh0(nsdServiceInfo) : new qeh0(nsdServiceInfo.getServiceName(), z7uVarB);
                }
                if (iap0Var.equals(gap0.a)) {
                    return oeh0.a;
                }
                if (iap0Var.equals(gap0.b)) {
                    return peh0.a;
                }
                eg.o();
                return null;
            case 6:
                return new huz(rih1.a, (byte) 10);
            case 7:
                return new cxc0();
            case 8:
                return new RequiredMetadataMissingException(Collections.singletonList(hz00.X2), (String) obj);
            case 9:
                return new CountryRestrictedException();
            case 10:
                return new CountryRestrictedException();
            case 11:
                return (String) obj;
            case 12:
                return (String) obj;
            case 13:
                return (String) obj;
            case 14:
                return (String) obj;
            case 15:
                return (String) obj;
            case 16:
                return (String) obj;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return (String) obj;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return (String) obj;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return (String) obj;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return (String) obj;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return (String) obj;
            case 22:
                return (String) obj;
            case 23:
                return new ShowEsperantoEndpointException("Missing IdentityTrait and ShowV4 for ".concat((String) obj));
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return (String) obj;
            case 25:
                return (String) obj;
            case 26:
                return (String) obj;
            case 27:
                return (String) obj;
            case 28:
                return (String) obj;
            default:
                return (String) obj;
        }
    }
}
