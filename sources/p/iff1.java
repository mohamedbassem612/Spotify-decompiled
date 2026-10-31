package p;

import com.spotify.mobius.Connectable;
import com.spotify.mobius.Connection;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class iff1 implements Connectable {
    public final /* synthetic */ byte a;
    public final ytp0 b;
    public final q8n c;

    public /* synthetic */ iff1(ytp0 ytp0Var, q8n q8nVar, byte b) {
        this.a = b;
        this.b = ytp0Var;
        this.c = q8nVar;
    }

    public final Connection L(Consumer consumer) {
        switch (this.a) {
            case 0:
                return new yr00(this, consumer);
            default:
                return new yr00(this, consumer, (byte) 0);
        }
    }
}
