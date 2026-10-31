package p;

import com.spotify.eventsender.corebridge.EventSenderCoreBridgeImpl;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class vob0 implements nb00 {
    public final idd1 a;

    public vob0(idd1 idd1Var) {
        this.a = idd1Var;
    }

    public final int a(String str, byte[] bArr, String str2, EventSenderCoreBridgeImpl.send.result.1 r4) {
        return ((nb00) this.a.getValue()).a(str, bArr, str2, r4);
    }

    public final int b(byte[] bArr, String str) {
        return ((nb00) this.a.getValue()).b(bArr, str);
    }

    public final int c(String str, byte[] bArr) {
        return ((nb00) this.a.getValue()).c(str, bArr);
    }
}
