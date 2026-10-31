package p;

import android.os.Build;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class z201 {
    public static final c9 b;
    public final cm01 a;

    static {
        b = mqo1.s(new s201[]{new s201("❤️"), new s201("👍"), new s201("😂"), new s201("🔥"), Build.VERSION.SDK_INT < 28 ? new s201("😢") : new s201("🥺"), new s201("👎"), new s201("🎧")});
    }

    public z201(cm01 cm01Var) {
        this.a = cm01Var;
    }

    public final f5y0 a(String str) {
        z6x z6xVarSingletonList = str == null ? z6x.a : Collections.singletonList(new s201(str));
        cm01 cm01Var = this.a;
        return new f5y0(new ek(new lt20(o4p1.r(new ht20(new f5y0(((dma1) cm01Var.a.get()).r(cm01.c), cm01Var, (byte) 13), new b201(cm01Var, (lnm) null, (byte) 11)), cm01Var.b), new w1e0(3, (lnm) null, (byte) 22), (byte) 0), (byte) 5), z6xVarSingletonList, (byte) 10);
    }
}
