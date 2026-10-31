package p;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class sep1 {
    public static final mhn1 a = mhn1.a(new byte[0]);

    public static final mhn1 a(int i) {
        return mhn1.a(ByteBuffer.allocate(5).put((byte) 0).putInt(i).array());
    }

    public static final mhn1 b(int i) {
        return mhn1.a(ByteBuffer.allocate(5).put((byte) 1).putInt(i).array());
    }
}
