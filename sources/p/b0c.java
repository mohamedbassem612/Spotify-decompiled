package p;

import com.spotify.mobius.disposables.CompositeDisposable;
import com.spotify.mobius.disposables.Disposable;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class b0c implements Disposable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public b0c(Disposable disposable, ibn ibnVar) {
        this.a = (byte) 4;
        this.b = disposable;
    }

    public final void dispose() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((CompositeDisposable) obj).dispose();
                break;
            case 1:
                ((Function0) obj).invoke();
                break;
            case 2:
                smo1.p((llm) obj, (CancellationException) null);
                break;
            case 3:
                kun kunVar = (kun) obj;
                ymd0 ymd0Var = kunVar.g;
                iac0 iac0Var = kunVar.e;
                ymd0Var.l(iac0Var);
                kunVar.h.l(iac0Var);
                fai0 fai0Var = kunVar.N0;
                if (fai0Var != null) {
                    fai0Var.l(iac0Var);
                }
                ymd0 ymd0Var2 = kunVar.f;
                if (ymd0Var2 != null) {
                    ymd0Var2.l(iac0Var);
                }
                break;
            case 4:
                ((Disposable) obj).dispose();
                break;
            case 5:
                ((n1b0) obj).dispose();
                break;
            default:
                ((ft0) obj).invoke();
                break;
        }
    }

    public /* synthetic */ b0c(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }
}
