package p;

import com.comscore.streaming.ContentType;
import com.spotify.mobius.Effects;
import com.spotify.mobius.Next;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class tiu {
    public final int a;
    public final boolean b;
    public final i44 c;

    public tiu(int i, boolean z, i44 i44Var) {
        this.a = i;
        this.b = z;
        this.c = i44Var;
    }

    public static Next b(ziu ziuVar, String str) {
        return Next.a(Effects.a(new ijb0[]{new ijb0(str, ziuVar.f.d)}));
    }

    public final Next a(ziu ziuVar, Set set) {
        ziu ziuVar2;
        boolean z = ziuVar.d;
        int i = ziuVar.g;
        boolean z2 = false;
        boolean z3 = z && !ziuVar.e;
        if (z3 && i > 0) {
            z2 = true;
        }
        boolean z4 = this.b;
        if (!(z4 && z2) && (z4 || !z3)) {
            ziuVar2 = ziuVar;
        } else {
            ziu ziuVarA = ziu.a(ziuVar, false, false, false, true, null, 0, ContentType.SHORT_FORM_ON_DEMAND);
            set.add(new dl21(ziuVar.f.a.a(), i < 50 ? co0.k1 : co0.j1));
            ziuVar2 = ziuVarA;
        }
        return Next.i(ziuVar2, set);
    }
}
