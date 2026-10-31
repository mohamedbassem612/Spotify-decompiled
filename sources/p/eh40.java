package p;

import j$.time.Instant;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final /* synthetic */ class eh40 extends tv30 implements Function0 {
    public static final /* synthetic */ int a = 0;

    static {
        new eh40(0, Instant.class, "now", "now()Ljava/time/Instant;", 0);
    }

    public final Object invoke() {
        return Instant.now();
    }
}
