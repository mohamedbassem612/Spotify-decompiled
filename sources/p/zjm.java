package p;

import io.reactivex.rxjava3.functions.Consumer;
import java.util.Locale;
import java.util.Optional;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class zjm implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ akm b;

    public /* synthetic */ zjm(akm akmVar, byte b) {
        this.a = b;
        this.b = akmVar;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        akm akmVar = this.b;
        switch (b) {
            case 0:
                Boolean bool = (Boolean) obj;
                apa apaVar = akmVar.b;
                if (apaVar != null) {
                    boolean zBooleanValue = bool.booleanValue();
                    apaVar.R0 = zBooleanValue;
                    uoa uoaVar = (uoa) apaVar.b.b;
                    if (uoaVar != null) {
                        uoaVar.r(zBooleanValue);
                    }
                }
                break;
            case 1:
                tvj1 tvj1Var = (tvj1) obj;
                apa apaVar2 = akmVar.b;
                if (apaVar2 != null) {
                    apaVar2.P0 = tvj1Var;
                    apaVar2.a.w(tvj1Var);
                    apaVar2.b.w(tvj1Var);
                }
                break;
            default:
                Optional optional = (Optional) obj;
                apa apaVar3 = akmVar.b;
                if (apaVar3 != null) {
                    Locale locale = (Locale) optional.orElse(null);
                    uoa uoaVar2 = (uoa) apaVar3.b.b;
                    if (uoaVar2 != null) {
                        uoaVar2.o = locale;
                        p3u0 p3u0Var = uoaVar2.f;
                        if (p3u0Var != null) {
                            p3u0Var.Q0(locale);
                        }
                    }
                }
                break;
        }
    }
}
