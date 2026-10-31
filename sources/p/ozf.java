package p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final /* synthetic */ class ozf implements Update {
    public final Next a(Object obj, Object obj2) {
        mzf mzfVar = (mzf) obj2;
        if (mzfVar.equals(mzf.a)) {
            return Next.h(new qzf(true, false, false));
        }
        if (mzfVar.equals(mzf.e)) {
            return Next.i(new qzf(false, true, false), Collections.singleton(hzf.a));
        }
        if (mzfVar.equals(mzf.f)) {
            return Next.h(new qzf(false, false, false));
        }
        if (mzfVar.equals(mzf.d)) {
            return Next.h(new qzf(false, false, false));
        }
        if (mzfVar.equals(mzf.c)) {
            return Next.h(new qzf(false, false, false));
        }
        if (mzfVar.equals(mzf.b)) {
            return Next.h(new qzf(false, false, true));
        }
        if (mzfVar.equals(mzf.g)) {
            return Next.h(new qzf(false, false, false));
        }
        if (mzfVar.equals(mzf.h)) {
            return Next.h(new qzf(true, false, false));
        }
        eg.o();
        return null;
    }
}
