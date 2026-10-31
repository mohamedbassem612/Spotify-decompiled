package p;

import com.spotify.base.java.logging.Logger;
import com.spotify.pses.v1.proto.ConfigurationResponse;
import io.reactivex.rxjava3.functions.Consumer;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class emy0 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ fmy0 b;

    public /* synthetic */ emy0(fmy0 fmy0Var, byte b) {
        this.a = b;
        this.b = fmy0Var;
    }

    public final void accept(Object obj) {
        r420 r420VarL;
        byte b = this.a;
        fmy0 fmy0Var = this.b;
        switch (b) {
            case 0:
                kqc kqcVar = fmy0Var.h;
                dma1 dma1Var = kqcVar.b;
                bma1 bma1Var = kqc.c;
                if (dma1Var.h(bma1Var, false)) {
                    r320 r320Var = kqcVar.a;
                    ((mqc) r320Var.a.get()).b.delete();
                    r320Var.b = null;
                    hma1 hma1VarEdit = dma1Var.edit();
                    hma1VarEdit.f(bma1Var);
                    hma1VarEdit.h();
                    return;
                }
                return;
            default:
                ConfigurationResponse configurationResponse = (ConfigurationResponse) obj;
                r320 r320Var2 = fmy0Var.c;
                r320Var2.b = configurationResponse;
                try {
                    mqc mqcVar = (mqc) r320Var2.a.get();
                    l420 l420Var = mqcVar.b;
                    try {
                        l420Var.createNewFile();
                    } catch (IOException e) {
                        n57.g("Unable to create PSES cache file", e);
                    }
                    try {
                        r420VarL = mqcVar.a.l(l420Var);
                    } catch (FileNotFoundException e2) {
                        n57.g("Unable to find PSES cache file", e2);
                        r420VarL = null;
                    }
                    try {
                        configurationResponse.writeTo(r420VarL);
                        u890.p(r420VarL, (Throwable) null);
                        return;
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            u890.p(r420VarL, th);
                            throw th2;
                        }
                    }
                } catch (IOException e3) {
                    Logger.e(e3, e3.getMessage(), new Object[0]);
                    return;
                }
                break;
        }
    }
}
