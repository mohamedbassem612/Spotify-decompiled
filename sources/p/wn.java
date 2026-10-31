package p;

import com.spotify.mobius.Effects;
import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final /* synthetic */ class wn implements Update {
    public final Next a(Object obj, Object obj2) {
        nn nnVar = (nn) obj2;
        if (nnVar instanceof kn) {
            return Next.a(Effects.a(new fn[]{new fn(((kn) nnVar).a)}));
        }
        if (nnVar instanceof ln) {
            ln lnVar = (ln) nnVar;
            String str = lnVar.a;
            return str != null ? Next.a(Effects.a(new hn[]{new hn(str, lnVar.b, lnVar.c)})) : Next.j();
        }
        if (nnVar instanceof mn) {
            ArrayList arrayList = ((mn) nnVar).a;
            return Next.i(new on(arrayList), arrayList.isEmpty() ? Effects.a(new gn[]{gn.a}) : Effects.a(new gn[0]));
        }
        eg.o();
        return null;
    }
}
