package p;

import com.google.protobuf.Timestamp;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public abstract class bjp0 {
    public static final long a(Timestamp timestamp) {
        long jQ = timestamp.q();
        int iP = timestamp.p();
        return (((long) iP) / 1000000) + TimeUnit.SECONDS.toMillis(jQ);
    }
}
