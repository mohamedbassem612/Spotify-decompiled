package p;

import com.spotify.mobius.Connectable;
import com.spotify.mobius.Connection;
import com.spotify.mobius.coroutines.b;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class eaz0 implements Connectable {
    public final /* synthetic */ byte a;
    public final Object b;

    public /* synthetic */ eaz0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final Connection L(Consumer consumer) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return new ibn(this, consumer, j8y0.S0, (byte) 8);
            case 1:
                return ((Connectable) ((et90) obj).d).L(consumer);
            case 2:
                return new bd2(((rq11) obj).a(consumer), (byte) 14);
            case 3:
                return new bd2(((b) obj).a(consumer), (byte) 15);
            case 4:
                return new bd2(((acl) obj).b.a(consumer), (byte) 16);
            case 5:
                return new bd2(((n591) obj).a(consumer), (byte) 17);
            case 6:
                return new xj81((ug3) obj, (byte) 1);
            case 7:
                return new bd2(((acl) obj).b.a(consumer), (byte) 18);
            default:
                return new bd2(((acl) obj).b.a(consumer), (byte) 19);
        }
    }
}
