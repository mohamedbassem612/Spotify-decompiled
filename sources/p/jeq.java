package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class jeq {
    public final /* synthetic */ r7q a;

    public jeq(r7q r7qVar) {
        this.a = r7qVar;
    }

    public static wz50 a(jeq jeqVar, d0r d0rVar, xzq xzqVar, List list, xzq xzqVar2, int i) {
        xzq xzqVar3 = (i & 64) != 0 ? null : xzqVar2;
        boolean z = (i & 128) == 0;
        r7q r7qVar = jeqVar.a;
        teq teqVar = r7qVar.d;
        return new wz50((lzn0) teqVar.i.get(), (xfx) teqVar.q1.get(), (jus) r7qVar.b.a.b3.get(), d0rVar, xzqVar, (maa) null, list, xzqVar3, z, ((Boolean) teqVar.Za.get()).booleanValue());
    }
}
