package com.spotify.esperanto.esperanto;

import com.spotify.connect.esperanto.proto.ConnectMessages$StateResponse;
import kotlin.Metadata;
import p.lnm;
import p.mr20;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J-\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\b\u0010\tJ(\u0010\n\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H¦@¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\f\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\f\u0010\rø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, d2 = {"Lcom/spotify/esperanto/esperanto/CoroutineTransport;", "", "", "service", "method", "", "payload", "Lp/mr20;", "callStream", "(Ljava/lang/String;Ljava/lang/String;[B)Lp/mr20;", "callSingle", "(Ljava/lang/String;Ljava/lang/String;[BLp/lnm;)Ljava/lang/Object;", "callSync", "(Ljava/lang/String;Ljava/lang/String;[B)[B", "src_main_java_com_spotify_esperanto_esperanto-esperanto_kt-api"}, k = 1, mv = {2, 3, 0}, xi = ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER)
public interface CoroutineTransport {
    Object callSingle(String str, String str2, byte[] bArr, lnm<? super byte[]> lnmVar);

    mr20 callStream(String service, String method, byte[] payload);

    byte[] callSync(String service, String method, byte[] payload);
}
