package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final /* synthetic */ class jwu0 extends tv30 implements iu30 {
    public static final jwu0 a = new jwu0(1, kwu0.class, "secondsToHours", "secondsToHours(J)J", 1);

    public final Object invoke(Object obj) {
        long jLongValue = ((Number) obj).longValue();
        List list = kwu0.a;
        return Long.valueOf(jch0.a0(jLongValue / 3600.0d));
    }
}
