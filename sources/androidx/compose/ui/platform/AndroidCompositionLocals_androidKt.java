package androidx.compose.ui.platform;

import com.spotify.connect.esperanto.proto.ConnectMessages$StateResponse;
import kotlin.Metadata;
import p.ia4;
import p.k5k;
import p.kiv;
import p.lge0;
import p.mod;
import p.xky0;
import p.ya4;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\" \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Lp/xky0;", "Lp/qe41;", "getLocalSavedStateRegistryOwner", "()Lp/xky0;", "getLocalSavedStateRegistryOwner$annotations", "()V", "LocalSavedStateRegistryOwner", "ui"}, k = 2, mv = {2, 1, 0}, xi = ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER)
public final class AndroidCompositionLocals_androidKt {
    public static final kiv a = mod.h(new ya4((byte) 0));
    public static final kiv b = mod.t(new ya4((byte) 1));
    public static final k5k c = mod.i(new ia4(1));
    public static final kiv d = mod.t(new ya4((byte) 2));
    public static final kiv e = mod.t(new ya4((byte) 3));
    public static final kiv f = mod.t(new ya4((byte) 4));

    public static final void a(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }

    public static final xky0 getLocalSavedStateRegistryOwner() {
        return lge0.a;
    }
}
