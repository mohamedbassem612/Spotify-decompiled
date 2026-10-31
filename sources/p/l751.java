package p;

import com.spotify.player.model.Context;
import com.spotify.player.model.command.options.PreparePlayOptions;
import io.reactivex.rxjava3.functions.Function;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class l751 implements Function {
    public final /* synthetic */ String a;
    public final /* synthetic */ o751 b;
    public final /* synthetic */ tv80 c;
    public final /* synthetic */ long d;

    public l751(String str, o751 o751Var, tv80 tv80Var, long j) {
        this.a = str;
        this.b = o751Var;
        this.c = tv80Var;
        this.d = j;
    }

    public final Object apply(Object obj) {
        Map map = (Map) obj;
        boolean zIsEmpty = map.isEmpty();
        String str = this.a;
        Context contextFromUri = zIsEmpty ? Context.fromUri(str) : Context.fromUri(str).toBuilder().metadata(map).build();
        o751 o751Var = this.b;
        muz muzVar = o751Var.a;
        contextFromUri.getClass();
        return muzVar.a(o751Var.b(contextFromUri, this.c, this.d, PreparePlayOptions.EMPTY));
    }
}
