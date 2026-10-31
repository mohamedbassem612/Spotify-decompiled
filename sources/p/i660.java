package p;

import android.os.Bundle;
import android.view.View;
import com.spotify.messages.BetamaxPlaybackSession;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lp/i660;", "Lp/ijl1;", "Lp/o6r0;", "Lp/lir0;", "<init>", "()V", "src_main_java_com_spotify_nativeadshomeformats_nativeadshomeformats-nativeadshomeformats"}, k = 1, mv = {2, 3, 0}, xi = BetamaxPlaybackSession.CLIENT_METADATA_FIELD_NUMBER)
public final class i660 extends ijl1 implements o6r0, lir0 {
    public static final /* synthetic */ int V1 = 0;

    public final void I0(View view, Bundle bundle) {
        b8k1.n(view, 2131429108).setOnClickListener(new zfs(this, (byte) 18));
    }

    public final int Z0() {
        return 2131624666;
    }

    public final mir0 c() {
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        return new mir0(kx40.g(yon1.G1("SPONSORED_RECOMMENDATION", "sponsored-recommendation", 1930, "sponsored-recommendation"), (qir0) null, 4));
    }

    public final void c1() {
        if (((ijl1) this).H1 != null) {
            l1("https://sponsored-recommendations.spotify.com/");
        }
    }

    public final n6r0 e() {
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        return yon1.G1("SPONSORED_RECOMMENDATION", "sponsored-recommendation", 1930, "sponsored-recommendation");
    }

    public final void w0(Bundle bundle) {
        super/*p.zf30*/.w0(bundle);
        W0();
        N0().J().a(this, new ydb(this, (byte) 10));
    }
}
