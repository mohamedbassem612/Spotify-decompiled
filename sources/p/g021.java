package p;

import java.util.function.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class g021 implements Consumer {
    public static final g021 b = new g021(0);
    public static final g021 c = new g021(1);
    public final /* synthetic */ byte a;

    public /* synthetic */ g021(byte b2) {
        this.a = b2;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                throw td6.k(obj);
            default:
                throw td6.k(obj);
        }
    }
}
