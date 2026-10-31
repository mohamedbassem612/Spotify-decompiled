package p;

import com.spotify.mobius.Effects;
import com.spotify.mobius.Next;
import com.spotify.mobius.Update;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final /* synthetic */ class xw8 implements Update {
    @Override // com.spotify.mobius.Update
    public final Next a(Object obj, Object obj2) {
        spq0 spq0Var = (spq0) obj;
        vw8 vw8Var = (vw8) obj2;
        boolean z = vw8Var instanceof tw8;
        rw8 rw8Var = rw8.a;
        if (z) {
            return Next.a(Effects.a(rw8Var));
        }
        if (vw8Var instanceof uw8) {
            return Next.h(new i5w0(((uw8) vw8Var).a));
        }
        if (vw8Var instanceof sw8) {
            return ((Boolean) spq0Var.i(bx8.b).e(Boolean.FALSE)).booleanValue() ? Next.a(Effects.a(rw8Var)) : Next.j();
        }
        eg.o();
        return null;
    }
}
