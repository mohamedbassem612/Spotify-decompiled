package p;

import com.spotify.base.java.logging.Logger;
import com.spotify.pses.v1.proto.ConfigurationResponse;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class r320 {
    public final ynb0 a;
    public ConfigurationResponse b;

    public r320(ynb0 ynb0Var) {
        this.a = ynb0Var;
    }

    public final ConfigurationResponse a() {
        m420 m420VarJ;
        ConfigurationResponse configurationResponse = this.b;
        if (configurationResponse != null) {
            return configurationResponse;
        }
        ynb0 ynb0Var = this.a;
        ConfigurationResponse configurationResponseT = null;
        if (((mqc) ynb0Var.get()).b.b.exists()) {
            try {
                mqc mqcVar = (mqc) ynb0Var.get();
                mqcVar.getClass();
                try {
                    m420VarJ = ((oi) mqcVar.a.a).j(mqcVar.b);
                } catch (FileNotFoundException e) {
                    n57.g("Unable to find PSES cache file", e);
                    m420VarJ = null;
                }
                try {
                    m420VarJ.getClass();
                    if (m420VarJ.a.available() > 0) {
                        configurationResponseT = ConfigurationResponse.t(m420VarJ);
                    }
                    m420VarJ.close();
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        u890.p(m420VarJ, th);
                        throw th2;
                    }
                }
            } catch (IOException e2) {
                Logger.e(e2, e2.getMessage(), new Object[0]);
            }
        }
        this.b = configurationResponseT;
        return configurationResponseT;
    }
}
