package p;

import com.spotify.genalphagraduation.graduationapi.KidsGraduationException;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class tza0 implements Function {
    public final /* synthetic */ wza0 a;
    public final /* synthetic */ String b;

    public tza0(wza0 wza0Var, String str) {
        this.a = wza0Var;
        this.b = str;
    }

    public final Object apply(Object obj) {
        zza0 zza0Var = (zza0) obj;
        if (zza0Var instanceof xza0) {
            wza0 wza0Var = this.a;
            return wza0Var.f.z().flatMap(new upa0(wza0Var, (byte) 1)).onErrorReturn(o810.i).flatMap(new sza0(wza0Var, this.b));
        }
        if (zza0Var instanceof yza0) {
            return Single.error(new KidsGraduationException.RuntimeDependenciesFetchException("Runtime dependencies unavailable", null));
        }
        eg.o();
        return null;
    }
}
