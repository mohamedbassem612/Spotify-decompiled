package p;

import android.media.MediaFormat;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class iwg {
    public static final iwg b = new iwg(new HashMap());
    public final Map a;

    public iwg(HashMap map) {
        this.a = Collections.unmodifiableMap(map);
    }

    public static ps7 a(MediaFormat mediaFormat, Set set) {
        ps7 ps7Var = new ps7((byte) 22);
        HashMap map = (HashMap) ps7Var.b;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (mediaFormat.containsKey(str)) {
                int valueTypeForKey = mediaFormat.getValueTypeForKey(str);
                if (valueTypeForKey == 1) {
                    map.put(str, Integer.valueOf(mediaFormat.getInteger(str)));
                } else if (valueTypeForKey == 2) {
                    map.put(str, Long.valueOf(mediaFormat.getLong(str)));
                } else if (valueTypeForKey == 3) {
                    map.put(str, Float.valueOf(mediaFormat.getFloat(str)));
                } else if (valueTypeForKey == 4) {
                    map.put(str, mediaFormat.getString(str));
                } else if (valueTypeForKey == 5) {
                    ByteBuffer byteBuffer = mediaFormat.getByteBuffer(str);
                    if (byteBuffer == null) {
                        map.put(str, null);
                    } else {
                        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBuffer.remaining());
                        byteBufferAllocate.put(byteBuffer.duplicate());
                        byteBufferAllocate.flip();
                        map.put(str, byteBufferAllocate);
                    }
                }
            }
        }
        return ps7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof iwg) {
            return this.a.equals(((iwg) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
