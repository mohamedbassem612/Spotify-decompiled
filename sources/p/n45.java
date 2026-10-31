package p;

import androidx.compose.ui.graphics.Brush;
import java.io.IOException;
import java.net.SocketTimeoutException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class n45 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ n45(Object obj, long j, byte b) {
        this.a = b;
        this.c = obj;
        this.b = j;
    }

    public final Object invoke() {
        pil1 pil1Var;
        switch (this.a) {
            case 0:
                return ((Brush) this.c).c(this.b);
            case 1:
                ig01 ig01Var = (ig01) this.c;
                long j = this.b;
                synchronized (ig01Var) {
                    try {
                        if (!ig01Var.u && (pil1Var = ig01Var.k) != null) {
                            int i = ig01Var.w ? ig01Var.v : -1;
                            ig01Var.v++;
                            ig01Var.w = true;
                            if (i != -1) {
                                StringBuilder sb = new StringBuilder("sent ping but didn't receive pong within ");
                                sb.append(ig01Var.c);
                                sb.append("ms (after ");
                                ig01.c(ig01Var, new SocketTimeoutException(gvg.j(sb, i - 1, " successful ping/pongs)")), (ry21) null, 2);
                            } else {
                                try {
                                    pil1Var.a(9, rhc.d);
                                } catch (IOException e) {
                                    ig01.c(ig01Var, e, (ry21) null, 2);
                                }
                            }
                            break;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return Long.valueOf(j);
            default:
                return new y7e1((String) this.c, this.b);
        }
    }
}
