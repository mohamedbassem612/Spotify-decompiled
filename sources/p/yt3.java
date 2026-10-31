package p;

import android.net.Uri;
import android.os.Trace;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class yt3 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yt3(String str, rm9 rm9Var) {
        super(0);
        this.a = (byte) 1;
        this.b = str;
    }

    public final Object invoke() {
        byte b = this.a;
        String str = this.b;
        switch (b) {
            case 0:
                int length = str.length();
                return v8r.q(new c8e1(e6p1.e(length, length), 4, str));
            case 1:
                if (str == null) {
                    return null;
                }
                r6h1 r6h1VarG = rm9.g(str);
                y6h1 y6h1Var = y6h1.i;
                x6h1 x6h1VarI = i3o1.i();
                x6h1VarI.h = "music";
                x6h1VarI.a = "mobile-byom-track-unavailable-snackbar";
                x6h1VarI.f = "1.0.0";
                x6h1VarI.g = "22.0.0";
                x6h1VarI.d = str;
                y6h1 y6h1VarA = x6h1VarI.a();
                k7h1 k7h1Var = new k7h1();
                ((xjn) k7h1Var).a = y6h1VarA;
                ((xjn) k7h1Var).b = r6h1VarG;
                ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
                return k7h1Var.a();
            case 2:
                return v8r.q(str);
            case 3:
                return Uri.parse(str);
            case 4:
                return str;
            case 5:
                Trace.beginSection(mif1.j(str));
                return rih1.a;
            case 6:
                return new snn0(str, (String) null, (String) null);
            default:
                return new uvk0(str);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yt3(String str, byte b) {
        super(0);
        this.a = b;
        this.b = str;
    }
}
