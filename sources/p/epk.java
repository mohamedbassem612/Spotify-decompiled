package p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final /* synthetic */ class epk implements Update {
    public static final epk a = new epk();

    public final Next a(Object obj, Object obj2) {
        gpk gpkVar = (gpk) obj;
        apk apkVar = (apk) obj2;
        if (apkVar instanceof xok) {
            return Next.a(Collections.singleton(qok.a));
        }
        if (apkVar instanceof yok) {
            String str = gpkVar.d;
            return (str == null || str.length() == 0) ? Next.j() : Next.a(Collections.singleton(new rok(gpkVar)));
        }
        if (apkVar instanceof zok) {
            gpk gpkVar2 = ((zok) apkVar).a;
            return Next.h(new gpk(gpkVar.a, gpkVar2.b, gpkVar.c, gpkVar2.d));
        }
        eg.o();
        return null;
    }
}
