package p;

import com.spotify.mobius.functions.Producer;
import com.spotify.mobius.runners.ImmediateWorkRunner;
import com.spotify.mobius.runners.WorkRunners;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final /* synthetic */ class yw8 implements Producer {
    public static final yw8 a = new yw8();

    @Override // com.spotify.mobius.functions.Producer
    public final Object get() {
        WorkRunners.MyThreadFactory myThreadFactory = WorkRunners.a;
        return new ImmediateWorkRunner();
    }
}
