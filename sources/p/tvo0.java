package p;

import com.spotify.mobius.Effects;
import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final /* synthetic */ class tvo0 implements Update {
    public static final tvo0 a = new tvo0();

    public final Next a(Object obj, Object obj2) {
        xvo0 xvo0Var = (xvo0) obj;
        ovo0 ovo0Var = (ovo0) obj2;
        if (ovo0Var instanceof omq0) {
            omq0 omq0Var = (omq0) ovo0Var;
            boolean z = omq0Var.b;
            String str = omq0Var.a;
            return Next.a(Effects.a(new zmo1[]{new uth1(str, z), new lse0(z ? new nmq0(str) : new umq0(str))}));
        }
        Object obj3 = null;
        if (!(ovo0Var instanceof pmq0)) {
            if (ovo0Var instanceof qc50) {
                return Next.a(Effects.a(new vrn0[]{vrn0.b}));
            }
            if (ovo0Var instanceof ned1) {
                return Next.j();
            }
            eg.o();
            return null;
        }
        pmq0 pmq0Var = (pmq0) ovo0Var;
        ArrayList arrayList = new ArrayList(xvo0Var.a);
        for (Object obj4 : arrayList) {
            if (u890.j(pmq0Var.a, ((y781) obj4).a)) {
                obj3 = obj4;
                break;
            }
        }
        y781 y781Var = (y781) obj3;
        int iIndexOf = arrayList.indexOf(y781Var);
        if (y781Var != null) {
            arrayList.set(iIndexOf, new y781(y781Var.a, y781Var.b, y781Var.c, y781Var.d, pmq0Var.b));
        }
        return Next.h(new xvo0(arrayList));
    }
}
