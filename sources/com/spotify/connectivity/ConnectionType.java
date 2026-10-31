package com.spotify.connectivity;

import com.spotify.connect.esperanto.proto.ConnectMessages$StateResponse;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import p.ebl;
import p.oqn1;
import p.r0z;
import p.sqg0;
import p.t0z;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0013\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0015"}, d2 = {"Lcom/spotify/connectivity/ConnectionType;", "", "", "value", "<init>", "(Ljava/lang/String;II)V", "I", "getValue", "()I", "Companion", "p/ebl", "UNKNOWN", "NONE", "MOBILE_GPRS", "MOBILE_EDGE", "MOBILE_3G", "MOBILE_4G", "WLAN", "ETHERNET", "MOBILE_5G", "OTHER", "src_main_java_com_spotify_connectivity_connectivitysdkproducts-connectivitysdkproducts"}, k = 1, mv = {2, 3, 0}, xi = ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER)
public enum ConnectionType {
    UNKNOWN(-1),
    NONE(0),
    MOBILE_GPRS(1),
    MOBILE_EDGE(2),
    MOBILE_3G(3),
    MOBILE_4G(4),
    WLAN(5),
    ETHERNET(6),
    MOBILE_5G(7),
    OTHER(8);

    private static final Map<Integer, ConnectionType> BY_VALUE;
    private final int value;
    private static final /* synthetic */ r0z $ENTRIES = new t0z(values());
    public static final ebl Companion = new ebl();

    static {
        ConnectionType[] connectionTypeArrValues = values();
        ArrayList arrayList = new ArrayList(connectionTypeArrValues.length);
        for (ConnectionType connectionType : connectionTypeArrValues) {
            arrayList.add(oqn1.n(Integer.valueOf(connectionType.value), connectionType));
        }
        BY_VALUE = sqg0.T(arrayList);
    }

    ConnectionType(int i) {
        this.value = i;
    }

    public static final ConnectionType connectionTypeOfValue(int i) {
        Companion.getClass();
        return (ConnectionType) BY_VALUE.get(Integer.valueOf(i));
    }

    public static r0z getEntries() {
        return $ENTRIES;
    }

    public final int getValue() {
        return this.value;
    }
}
