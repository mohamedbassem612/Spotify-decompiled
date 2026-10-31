package p;

import android.os.Bundle;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class lvk1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ pvk1 a;

    public lvk1(pvk1 pvk1Var) {
        this.a = pvk1Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        ivk1 ivk1Var = (ivk1) obj;
        mmr0 mmr0Var = new mmr0("voting-share-page-v2-response", ivk1Var.a);
        String str = ivk1Var.b;
        mmr0 mmr0Var2 = new mmr0("voting-share-page-v2-contest-id", str);
        String str2 = ivk1Var.c;
        Bundle bundleH = mno1.h(new mmr0[]{mmr0Var, mmr0Var2, new mmr0("voting-share-page-v2-award-id", str2), new mmr0("voting-share-page-v2-playlist-uri", ivk1Var.e)});
        String strH = gvg.h("spotify:voting:share:", str, ":", str2);
        pvk1 pvk1Var = this.a;
        lzn0 lzn0Var = pvk1Var.a;
        dzp0 dzp0Var = pvk1Var.b;
        i8h1 i8h1Var = (i8h1) ((jly0) dzp0Var.b).get();
        x6h1 x6h1VarC = ((brl0) dzp0Var.c).b.c();
        x6h1VarC.i.add(new a7h1("confirm_vote_button", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        lzn0Var.a(strH, i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", strH)), x6h1VarC.a(), r6h1.c, System.currentTimeMillis()), (xj61) null), bundleH);
        return rih1.a;
    }
}
