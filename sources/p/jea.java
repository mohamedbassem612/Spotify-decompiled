package p;

import android.database.SQLException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class jea implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ jea(Object obj, boolean z, byte b) {
        this.a = b;
        this.c = obj;
        this.b = z;
    }

    public final Object invoke() {
        dt71 dt71VarI;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        boolean z = this.b;
        Object obj = this.c;
        switch (b) {
            case 0:
                sen0 sen0Var = (sen0) obj;
                if (z) {
                    sen0Var.a(rih1Var);
                }
                return rih1Var;
            case 1:
                aal aalVar = (aal) obj;
                String str = z ? "reader" : "writer";
                StringBuilder sb = new StringBuilder();
                sb.append("Timed out attempting to acquire a " + str + " connection.");
                sb.append("\n\nWriter pool:\n");
                aalVar.b.d(sb);
                sb.append("Reader pool:");
                sb.append('\n');
                aalVar.a.d(sb);
                try {
                    vby0.y(5, sb.toString());
                    throw null;
                } catch (SQLException e) {
                    e.printStackTrace();
                    return rih1Var;
                }
            case 2:
                Function0 function0 = (Function0) obj;
                if (z) {
                    function0.invoke();
                }
                return rih1Var;
            case 3:
                ml4 ml4Var = (ml4) obj;
                if (z && (dt71VarI = ml4Var.i()) != null) {
                    dt71VarI.a(rih1Var);
                }
                return rih1Var;
            case 4:
                lz20 lz20Var = (lz20) obj;
                if (z) {
                    lz20.b(lz20Var);
                }
                return rih1Var;
            default:
                ((iu30) obj).invoke(Boolean.valueOf(!z));
                return rih1Var;
        }
    }

    public /* synthetic */ jea(boolean z, Object obj, byte b) {
        this.a = b;
        this.b = z;
        this.c = obj;
    }
}
