package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class h5p {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jly0 b;

    public /* synthetic */ h5p(jly0 jly0Var, byte b) {
        this.a = b;
        this.b = jly0Var;
    }

    public final inf a(String str, String str2, elf elfVar, vmf vmfVar, yjq yjqVar) {
        byte b = this.a;
        b2p b2pVar = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                zwz0 zwz0Var = (zwz0) ((zhf) ((tnm) b2pVar.c).b).f.get();
                c8o.l(zwz0Var);
                return new inf(zwz0Var, str, str2, elfVar, vmfVar, yjqVar);
            default:
                zwz0 zwz0Var2 = (zwz0) ((tmf) ((em0) b2pVar.c).b).f.get();
                c8o.l(zwz0Var2);
                return new inf(zwz0Var2, str, str2, elfVar, vmfVar, yjqVar);
        }
    }
}
