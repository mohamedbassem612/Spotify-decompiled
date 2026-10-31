package p;

import com.spotify.mobius.functions.Producer;
import com.spotify.mobius.runners.ImmediateWorkRunner;
import com.spotify.mobius.runners.WorkRunners;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final /* synthetic */ class zw8 implements Producer {
    public static final zw8 a = new zw8();

    @Override // com.spotify.mobius.functions.Producer
    public final Object get() {
        WorkRunners.MyThreadFactory myThreadFactory = WorkRunners.a;
        return new ImmediateWorkRunner();
    }
}
