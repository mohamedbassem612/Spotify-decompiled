package p;

import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lp/m6r0;", "Lp/zf30;", "<init>", "()V", "src_main_java_com_spotify_tome_pageapi-pageapi"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
public abstract class m6r0 extends zf30 {
    public p1r0 Y0() {
        return mco0.a;
    }

    public abstract c7r0 Z0(iac0 iac0Var, bbr0 bbr0Var, Function0 function0);

    public abstract ezc a1();

    public mr20 b1() {
        return new php0(a1(), (byte) 12);
    }

    public abstract String c1();

    public abstract in8 d1();
}
