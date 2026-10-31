package coil3.network;

import kotlin.Metadata;
import p.i8o0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcoil3/network/HttpException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "coil-network-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class HttpException extends RuntimeException {
    public HttpException(i8o0 i8o0Var) {
        super("HTTP " + i8o0Var.a);
    }
}
