package p;

import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class w3c {
    public final ConcurrentHashMap a = new ConcurrentHashMap();

    static {
        Pattern.compile("\\p{XDigit}+");
    }
}
