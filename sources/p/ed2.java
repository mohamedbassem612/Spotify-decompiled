package p;

import com.spotify.mobius.Connectable;
import com.spotify.mobius.Connection;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ed2 implements Connectable {
    public static final ed2 b = new ed2(0);
    public static final ed2 c = new ed2(1);
    public static final ed2 d = new ed2(2);
    public static final ed2 e = new ed2(3);
    public static final ed2 f = new ed2(4);
    public static final ed2 g = new ed2(5);
    public static final ed2 h = new ed2(6);
    public static final ed2 i = new ed2(7);
    public final /* synthetic */ byte a;

    public /* synthetic */ ed2(byte b2) {
        this.a = b2;
    }

    public final Connection L(Consumer consumer) {
        switch (this.a) {
            case 0:
                return new dd2(consumer, (byte) 0);
            case 1:
                return new jn8((byte) 0);
            case 2:
                return new dd2(consumer, (byte) 3);
            case 3:
                return new jn8((byte) 3);
            case 4:
                return new jn8((byte) 4);
            case 5:
                return new dd2(consumer, (byte) 6);
            case 6:
                return new jn8((byte) 6);
            case 7:
                return new jn8((byte) 7);
            case 8:
                return new jn8((byte) 1);
            case 9:
                return new dd2(consumer, (byte) 1);
            case 10:
                return new dd2(consumer, (byte) 2);
            case 11:
                return new dd2(this, consumer);
            case 12:
                return new dd2(consumer, (byte) 5);
            default:
                int i2 = th10.a;
                return new jn8((byte) 5);
        }
    }
}
