package p;

import com.google.android.recaptcha.internal.zzhm;
import kotlinx.coroutines.TimeoutCancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public interface q7o1 {
    default c6o1 a(Exception exc) {
        int i = 27;
        if (!(exc instanceof TimeoutCancellationException) && (!(exc instanceof zzhm) || !u890.j(((zzhm) exc).b(), ij81.e))) {
            i = 2;
        }
        int iZza = zza();
        pnn1 pnn1VarX = qnn1.x();
        pnn1VarX.h(iZza);
        pnn1VarX.i(13);
        pnn1VarX.j(i);
        return bmq0.m0(this, pnn1VarX.e());
    }

    default qwo1 b(cmn1 cmn1Var) {
        return new qwo1(new ow2(2, null, (byte) 2));
    }

    qwo1 c(sln1 sln1Var);

    int zza();

    boolean zzb();
}
