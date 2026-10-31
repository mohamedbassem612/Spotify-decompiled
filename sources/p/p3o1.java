package p;

import android.content.ContentResolver;
import android.os.Build;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class p3o1 implements q7o1 {
    public final ContentResolver a;

    public p3o1(ContentResolver contentResolver) {
        this.a = contentResolver;
    }

    @Override // p.q7o1
    public final c6o1 a(Exception exc) {
        int i = Build.VERSION.SDK_INT;
        pnn1 pnn1VarX = qnn1.x();
        pnn1VarX.i(16);
        pnn1VarX.j(i > 34 ? 59 : 58);
        return bmq0.m0(this, pnn1VarX.e());
    }

    @Override // p.q7o1
    public final qwo1 c(sln1 sln1Var) {
        return new qwo1(new l3o1(this, (lnm) null, (byte) 0));
    }

    @Override // p.q7o1
    public final int zza() {
        return 17;
    }

    @Override // p.q7o1
    public final boolean zzb() {
        return true;
    }
}
