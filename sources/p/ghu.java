package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ghu implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ bju a;

    public ghu(bju bjuVar) {
        this.a = bjuVar;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        String str;
        hib1 hib1Var = (hib1) obj;
        bju bjuVar = this.a;
        fq0 fq0Var = hib1Var.a;
        int i = hib1Var.b;
        if (bjuVar.b == null) {
            t45 t45VarA = bjuVar.a.a("display-ad-image-load");
            t45VarA.h = "android-display-ad-image-load";
            t45VarA.f.put("ad_id", fq0Var.a());
            t45VarA.f.put("request_identifier", fq0Var.h());
            if (i == 1) {
                str = "Horizontal";
            } else if (i == 2) {
                str = "ENPV";
            } else {
                if (i != 3) {
                    throw null;
                }
                str = "NPVS";
            }
            t45VarA.g.put("design", str);
            bjuVar.b = t45VarA;
            t45.m(t45VarA, "image_load", 4);
        }
        return rih1.a;
    }
}
