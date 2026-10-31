package p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final /* synthetic */ class z8m0 implements Update {
    public static final z8m0 a = new z8m0();

    public final Next a(Object obj, Object obj2) {
        quf qufVar = (quf) obj;
        puf pufVar = (puf) obj2;
        yuf yufVar = qufVar.c;
        boolean zEquals = pufVar.equals(nuf.a);
        vuf vufVar = vuf.a;
        xuf xufVar = xuf.a;
        if (zEquals) {
            return yufVar.equals(vufVar) ? Next.i(quf.a(qufVar, null, null, xufVar, 3), Collections.singleton(duf.a)) : Next.j();
        }
        if (pufVar.equals(juf.a)) {
            return Next.j();
        }
        boolean zEquals2 = pufVar.equals(iuf.a);
        wuf wufVar = wuf.a;
        if (zEquals2) {
            return Next.h(quf.a(qufVar, null, null, wufVar, 3));
        }
        if (pufVar instanceof guf) {
            return yufVar.equals(xufVar) ? Next.a(Collections.singleton(new cuf(((guf) pufVar).a))) : Next.j();
        }
        boolean zEquals3 = pufVar.equals(ouf.a);
        buf bufVar = buf.a;
        if (zEquals3) {
            if (yufVar.equals(vufVar)) {
                return Next.a(Collections.singleton(bufVar));
            }
            if (yufVar.equals(xufVar)) {
                return Next.h(quf.a(qufVar, null, null, wufVar, 3));
            }
            if (yufVar.equals(wufVar)) {
                return Next.j();
            }
            eg.o();
            return null;
        }
        if (pufVar.equals(huf.a)) {
            return Next.a(Collections.singleton(bufVar));
        }
        if (pufVar instanceof kuf) {
            String str = ((kuf) pufVar).a;
            return Next.i(quf.a(qufVar, null, new t4i1(str), null, 5), Collections.singleton(new euf(str)));
        }
        if (pufVar instanceof muf) {
            return Next.h(quf.a(qufVar, ((muf) pufVar).a, null, null, 6));
        }
        if (pufVar instanceof luf) {
            return Next.h(quf.a(qufVar, null, ((luf) pufVar).a, null, 5));
        }
        eg.o();
        return null;
    }
}
