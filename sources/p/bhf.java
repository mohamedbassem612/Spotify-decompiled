package p;

import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class bhf {
    public static xgf a(t0c t0cVar, ez61 ez61Var) {
        y47 y47VarJ = cuo1.J(ez61Var);
        if (t0cVar instanceof ant) {
            ant antVar = (ant) t0cVar;
            return new xgf(new ehf(new Integer(antVar.f), antVar.e), y47VarJ);
        }
        if (t0cVar instanceof bnt) {
            return new xgf(new fhf(Uri.parse(((bnt) t0cVar).e)), y47VarJ);
        }
        if (t0cVar instanceof cnt) {
            return new xgf(new ghf(Uri.parse(((cnt) t0cVar).e)), y47VarJ);
        }
        eg.o();
        return null;
    }
}
