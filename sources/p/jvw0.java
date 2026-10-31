package p;

import java.io.File;
import java.util.function.Function;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class jvw0 implements Function {
    public static final jvw0 b = new jvw0(0);
    public static final jvw0 c = new jvw0(1);
    public final /* synthetic */ byte a;

    public /* synthetic */ jvw0(byte b2) {
        this.a = b2;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                return new kvw0((File) obj);
            default:
                y1k1 y1k1Var = (y1k1) obj;
                y1k1Var.getClass();
                return new rvj1(y1k1Var);
        }
    }
}
