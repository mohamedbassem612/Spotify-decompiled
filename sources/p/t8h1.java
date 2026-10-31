package p;

import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lp/t8h1;", "", "src_main_java_com_spotify_ubi_pageboundubilogger-pageboundubilogger"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
public interface t8h1 {
    static void l(t8h1 t8h1Var, n6r0 n6r0Var, qir0 qir0Var) {
        qhe0 qhe0Var = (qhe0) t8h1Var;
        u8h1 u8h1VarI = e8h1.b().i();
        if (u890.j(n6r0Var.path(), qhe0Var.Y.a.path()) && qir0Var.equals(qhe0Var.Y.b)) {
            return;
        }
        int iC = l1d.C(qhe0Var.t);
        if (iC == 0 || iC == 1) {
            qhe0Var.C(n6r0Var, qir0Var, u8h1VarI);
        } else {
            if (iC != 2) {
                return;
            }
            qhe0Var.C(n6r0Var, qir0Var, u8h1VarI);
            qhe0Var.t();
        }
    }

    static void n(t8h1 t8h1Var, n6r0 n6r0Var) {
        ltf1 ltf1VarB = e8h1.b();
        qhe0 qhe0Var = (qhe0) t8h1Var;
        qhe0Var.getClass();
        u8h1 u8h1VarI = ltf1VarB.i();
        if (u890.j(n6r0Var.path(), qhe0Var.Y.a.path())) {
            return;
        }
        int iC = l1d.C(qhe0Var.t);
        if (iC == 0 || iC == 1) {
            qhe0Var.C(n6r0Var, qhe0Var.Y.b, u8h1VarI);
        } else {
            if (iC != 2) {
                return;
            }
            qhe0Var.C(n6r0Var, qhe0Var.Y.b, u8h1VarI);
            qhe0Var.t();
        }
    }
}
