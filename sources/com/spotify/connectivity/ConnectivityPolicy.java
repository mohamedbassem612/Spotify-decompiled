package com.spotify.connectivity;

import com.spotify.connect.esperanto.proto.ConnectMessages$StateResponse;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import p.icl;
import p.oqn1;
import p.r0z;
import p.sqg0;
import p.t0z;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/spotify/connectivity/ConnectivityPolicy;", "", "", "value", "<init>", "(Ljava/lang/String;II)V", "I", "getValue", "()I", "Companion", "p/icl", "DISALLOW_ALL", "ALLOW_ALL", "ALLOW_NON_PERSISTENT_CONNECTIONS", "src_main_java_com_spotify_connectivity_connectivitysdkproductsimpl-connectivitysdkproductsimpl"}, k = 1, mv = {2, 3, 0}, xi = ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER)
public enum ConnectivityPolicy {
    DISALLOW_ALL(0),
    ALLOW_ALL(1),
    ALLOW_NON_PERSISTENT_CONNECTIONS(2);

    private static final Map<Integer, ConnectivityPolicy> BY_VALUE;
    private final int value;
    private static final /* synthetic */ r0z $ENTRIES = new t0z(values());
    public static final icl Companion = new icl();

    static {
        ConnectivityPolicy[] connectivityPolicyArrValues = values();
        ArrayList arrayList = new ArrayList(connectivityPolicyArrValues.length);
        for (ConnectivityPolicy connectivityPolicy : connectivityPolicyArrValues) {
            arrayList.add(oqn1.n(Integer.valueOf(connectivityPolicy.value), connectivityPolicy));
        }
        BY_VALUE = sqg0.T(arrayList);
    }

    ConnectivityPolicy(int i) {
        this.value = i;
    }

    public static final ConnectivityPolicy connectivityPolicyOfValue(int i) {
        Companion.getClass();
        return (ConnectivityPolicy) BY_VALUE.get(Integer.valueOf(i));
    }

    public static r0z getEntries() {
        return $ENTRIES;
    }

    public final int getValue() {
        return this.value;
    }
}
