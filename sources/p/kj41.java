package p;

import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public interface kj41 {
    void a(long j);

    long b();

    kj41 c(Map map);

    void cancel();

    kj41 d(long j);

    Map getAttributes();

    UUID getId();

    String getKey();

    kj41 setAttribute(String str, String str2);

    void stop();
}
