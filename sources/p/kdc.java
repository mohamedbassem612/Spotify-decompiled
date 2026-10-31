package p;

import androidx.car.app.serialization.BundlerException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public class kdc extends BundlerException {
    /* JADX WARN: Illegal instructions before constructor call */
    public kdc(String str, jdc jdcVar) {
        StringBuilder sbG = dv20.g(str, ", frames: ");
        sbG.append(jdcVar.a());
        super(sbG.toString());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public kdc(String str, jdc jdcVar, Exception exc) {
        StringBuilder sbG = dv20.g(str, ", frames: ");
        sbG.append(jdcVar.a());
        super(sbG.toString(), exc);
    }
}
