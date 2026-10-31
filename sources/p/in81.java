package p;

import java.util.Locale;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class in81 extends ti {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public in81(String str, byte b) {
        super(jn81.a.g("", str));
        switch (b) {
            case 1:
                super(jn81.b.g("", jn81.a.g("", str)).toLowerCase(Locale.ROOT));
                break;
            default:
                break;
        }
    }
}
