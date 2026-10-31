package p;

import com.spotify.mobius.Connectable;
import com.spotify.mobius.Connection;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class d1v implements Connectable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pae b;

    public /* synthetic */ d1v(pae paeVar, byte b) {
        this.a = b;
        this.b = paeVar;
    }

    public final Connection L(Consumer consumer) {
        byte b = this.a;
        pae paeVar = this.b;
        switch (b) {
            case 0:
                return new bd2(paeVar.a(consumer), (byte) 7);
            default:
                return new bd2(paeVar.a(consumer), (byte) 8);
        }
    }
}
