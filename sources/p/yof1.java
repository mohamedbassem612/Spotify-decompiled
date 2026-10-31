package p;

import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.ContextTrack$Metadata;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class yof1 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ cpf1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yof1(cpf1 cpf1Var, byte b) {
        super(2);
        this.a = b;
        this.b = cpf1Var;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x008f  */
    /* JADX WARN: Code duplicated, block: B:34:0x0095  */
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        cpf1 cpf1Var = this.b;
        switch (b) {
            case 0:
                oof1 oof1Var = (oof1) obj;
                iof1 iof1Var = (iof1) obj2;
                ContextTrack contextTrack = iof1Var.a;
                String str = oof1Var.b;
                if (str == null) {
                    str = oof1Var.a;
                }
                String str2 = str;
                boolean zEquals = l4o1.b0(contextTrack).equals(str2);
                jo70 jo70Var = iof1Var.b.a;
                if (jo70Var == null) {
                    jo70Var = new jo70((String) null, (String) null, (String) null, (List) null, (io70) null, 31);
                }
                boolean z = l4o1.U(contextTrack) && iof1Var.a().a == ktl.b && !cpf1.f(iof1Var);
                String strF0 = jo70Var.a;
                if (z) {
                    io70 io70Var = jo70Var.e;
                    strF0 = cpf1Var.g(2131959233, strF0, io70Var != null ? io70Var.a : null);
                    if (strF0.length() <= 0) {
                        strF0 = l4o1.f0(contextTrack);
                        if (strF0 == null) {
                            strF0 = "";
                        }
                    }
                } else if (strF0.length() <= 0) {
                    strF0 = l4o1.f0(contextTrack);
                    if (strF0 == null) {
                        strF0 = "";
                    }
                }
                String str3 = strF0;
                cmd1 cmd1Var = new cmd1(cpf1Var, iof1Var, (byte) 27);
                boolean z2 = true;
                boolean z3 = iof1Var.c;
                if (!l4o1.S(contextTrack) || !cpf1Var.f) {
                    z2 = false;
                }
                String strA0 = null;
                boolean zL = l4o1.L(contextTrack);
                if (!l4o1.U(contextTrack) || zEquals) {
                    if (cpf1.f(iof1Var)) {
                        ho70 ho70Var = (ho70) o7h.s0(iof1Var.b().d);
                        if (ho70Var != null) {
                            strA0 = ho70Var.b;
                        }
                    } else if (l4o1.U(contextTrack) && iof1Var.a().a == ktl.c) {
                        io70 io70Var2 = iof1Var.b().e;
                        if (io70Var2 != null) {
                            strA0 = io70Var2.b;
                        }
                    } else {
                        strA0 = l4o1.P(contextTrack) ? l4o1.a0(contextTrack, ContextTrack$Metadata.KEY_ALBUM_URI) : (String) o7h.s0(l4o1.n(contextTrack));
                    }
                }
                return new lof1(str3, cmd1Var, z3, z2, zL, strA0, str2);
            default:
                return cpf1Var.e.getString(2131959236, (String) obj, (String) obj2);
        }
    }
}
