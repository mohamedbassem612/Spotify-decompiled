package p;

import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.functions.Function;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class xsc1 implements Function {
    public final /* synthetic */ byte a;
    public final /* synthetic */ v491 b;
    public final /* synthetic */ i c;

    public /* synthetic */ xsc1(v491 v491Var, i iVar, byte b) {
        this.a = b;
        this.b = v491Var;
        this.c = iVar;
    }

    public final Object apply(Object obj) {
        byte b = this.a;
        i iVar = this.c;
        v491 v491Var = this.b;
        switch (b) {
            case 0:
                Logger.e((Throwable) obj, "Assisted Curation: Failed to expand audiobook recommendations", new Object[0]);
                return v491Var.j(iVar, z6x.a, false);
            default:
                return v491Var.j(iVar, (List) obj, false);
        }
    }
}
