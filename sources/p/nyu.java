package p;

import com.spotify.mobius.MobiusLoop;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class nyu extends n8m0 implements p421 {
    public final void b(String str) {
        ((MobiusLoop) ((m8m0) this).c.a.getValue()).a(new y421(str));
    }

    public final Object c(String str, lnm lnmVar) {
        ((MobiusLoop) ((m8m0) this).c.a.getValue()).a(new w421(str));
        Object obj = ((b521) ((m8m0) this).d.a.getValue()).a.get(str);
        return obj == null ? ynl.a : obj;
    }
}
