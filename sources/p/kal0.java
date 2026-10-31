package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class kal0 implements t9h1 {
    public final y6h1 a;
    public final List b;

    public kal0(String str) {
        y6h1 y6h1Var = y6h1.i;
        x6h1 x6h1VarI = i3o1.i();
        x6h1VarI.h = "music";
        x6h1VarI.a = "mobile-in-app-message-native-fullscreen-page";
        x6h1VarI.f = "2.0.0";
        x6h1VarI.g = "22.0.0";
        x6h1VarI.e = str;
        this.a = x6h1VarI.a();
        this.b = Collections.singletonList("inappmessage/fullscreen");
    }

    public final r6h1 b() {
        r6h1 r6h1Var = r6h1.c;
        return new r6h1(kk0.l(this.a), (u8h1) null);
    }
}
