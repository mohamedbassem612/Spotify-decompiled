package p;

import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.functions.Consumer;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class uz01 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;

    public uz01(int i, List list) {
        this.a = (byte) 2;
        this.c = i;
        this.b = list;
    }

    public final void accept(Object obj) {
        String str;
        byte b = this.a;
        Object obj2 = this.b;
        int i = this.c;
        switch (b) {
            case 0:
                t45.m((t45) obj2, td6.q(i), 4);
                return;
            case 1:
                ((t45) obj2).g(td6.q(i));
                return;
            default:
                Throwable th = (Throwable) obj;
                if (i == 1) {
                    str = "ADD";
                } else {
                    if (i != 2) {
                        throw null;
                    }
                    str = "REMOVE";
                }
                Logger.e(th, "Failed to " + str.toLowerCase(Locale.ROOT) + " URIs in Collection2: " + ((List) obj2), new Object[0]);
                return;
        }
    }

    public /* synthetic */ uz01(t45 t45Var, int i, byte b) {
        this.a = b;
        this.b = t45Var;
        this.c = i;
    }
}
