package com.spotify.performancesdk.observationplatform.integrations.cpp;

import com.spotify.playlist4.proto.PlaylistSyncReasonProto;
import kotlin.Metadata;
import p.cy30;
import p.gqj0;
import p.hqj0;
import p.iqj0;
import p.jqj0;
import p.kqj0;
import p.nhc1;
import p.opj0;
import p.u890;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"", "unit", "Lp/kqj0;", "parseUnit", "(Ljava/lang/String;)Lp/kqj0;", "instrument", "Lp/opj0;", "parseInstrument", "(Ljava/lang/String;)Lp/opj0;", "src_main_java_com_spotify_performancesdk_observationplatform_integrations_cpp-cpp_oops_forwarder"}, k = 2, mv = {2, 3, 0}, xi = PlaylistSyncReasonProto.PlaylistSyncCaller.MULTIGET_ADDITIONAL_RESPONSE_VALUE)
public final class CppOopsForwarderDaemonKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final opj0 parseInstrument(String str) {
        int iHashCode = str.hashCode();
        opj0 opj0Var = opj0.Gauge;
        if (iHashCode != -22049149) {
            if (iHashCode == 98128121) {
                str.equals("gauge");
            } else if (iHashCode == 957830652 && str.equals("counter")) {
                return opj0.Counter;
            }
        } else if (str.equals("up_down_counter")) {
            return opj0.UpDownCounter;
        }
        return opj0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kqj0 parseUnit(String str) {
        if (u890.j(str, "By")) {
            return gqj0.a;
        }
        if (u890.j(str, "s")) {
            return jqj0.a;
        }
        if (u890.j(str, "1")) {
            return iqj0.a;
        }
        return (nhc1.Y(str, "{", false) && nhc1.R(str, "}", false)) ? new hqj0(cy30.h(1, 1, str)) : new hqj0(str);
    }
}
